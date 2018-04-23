package com.xingyun.policy.api.client;

import com.xingyun.policy.api.dto.request.CheckRequest;
import com.xingyun.policy.api.dto.request.ListDetailRequest;
import com.xingyun.policy.api.dto.request.ListRequest;
import com.xingyun.policy.api.dto.request.RequestHeader;
import com.xingyun.policy.api.dto.response.PolicyResponse;
import com.xingyun.policy.api.service.PolicyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PolicyStreamingClient {
    private static final Logger logger = Logger.getLogger(PolicyStreamingClient.class.getName());
    private Random random = new Random();
    private final ManagedChannel channel;
    /**
     * 阻塞一元unary请求模式
     */
    private final PolicyServiceGrpc.PolicyServiceBlockingStub blockingStub;
    /**
     * 非阻塞异步模式：如流请求、响应
     */
    private final PolicyServiceGrpc.PolicyServiceStub asyncStub;

    public PolicyStreamingClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext(true)
                .build());
    }

    PolicyStreamingClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = PolicyServiceGrpc.newBlockingStub(channel);
        asyncStub = PolicyServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * 阻塞请求，流响应
     */
    public void listPolicyStreaming() {
        Iterator<PolicyResponse> responses = blockingStub.listPolicyStreaming(ListRequest.newBuilder()
                .setHeader(RequestHeader.newBuilder().setSource("listPolicyStreaming").build())
                .build());
        for (int i = 1; responses.hasNext(); i++) {
            PolicyResponse resp = responses.next();
            logger.log(Level.INFO, i + " " + resp.toString());
        }
    }

    /**
     * 流请求，单响应
     */
    public void checkStreaming() throws InterruptedException {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<PolicyResponse> responseObserver = new StreamObserver<PolicyResponse>() {
            int count;

            @Override
            public void onNext(PolicyResponse policyResponse) {
                count++;
                logger.log(Level.INFO, "response:" + count);
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.WARNING, "Exception",t);
                logger.log(Level.WARNING,Status.fromThrowable(t).getDescription());
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.log(Level.INFO, "complete:");
                finishLatch.countDown();
            }
        };
        StreamObserver<CheckRequest> requestObserver = asyncStub.checkStreaming(responseObserver);
        try {
            // 发送任意个请求
            for (int i = 0; i < 1100; i++) {
                requestObserver.onNext(CheckRequest.newBuilder()
                        .setHeader(RequestHeader.newBuilder().setSource("checkStreaming").build())
                        .build());
                // 模拟请求间隔.
//                Thread.sleep(random.nextInt(1000) + 500);
                if (finishLatch.getCount() == 0) {
                    // 发送中如果请求中，RPC关闭或出错，中断发送.
                    return;
                }
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        // 结束请求
        requestObserver.onCompleted();
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            logger.warning("checkStreaming can not finish within 1 minutes");
        }
    }

    /**
     * 流请求、流响应
     */
    public void listDetailStreaming() {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<ListDetailRequest> requestObserver = asyncStub.listDetailStreaming(new StreamObserver<PolicyResponse>() {
            @Override
            public void onNext(PolicyResponse policyResponse) {
                logger.info("response:" + policyResponse.toString());
            }

            @Override
            public void onError(Throwable t) {
                logger.warning("listDetailStreaming Failed: " + Status.fromThrowable(t).getDescription());
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("end listDetailStreaming");
                finishLatch.countDown();
            }
        });
        // 流发送请求.
        try {
            for (int i = 0; i < 10; i++) {
                requestObserver.onNext(ListDetailRequest.newBuilder()
                        .setHeader(RequestHeader.newBuilder().setTraceId("request:" + i).build())
                        .build());
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }

        requestObserver.onCompleted();
        try {
            if (!finishLatch.await(1, TimeUnit.MINUTES)) {
                logger.warning("listDetailStreaming can not finish within 1 minutes");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        PolicyStreamingClient client = new PolicyStreamingClient("localhost", 8980);
        try {
            client.checkStreaming();
//            client.listPolicyStreaming();
//            client.listDetailStreaming();
        } finally {
            client.shutdown();
        }
    }
}
