package com.xingyun.policy.api.server;

import com.xingyun.policy.api.dto.request.CheckRequest;
import com.xingyun.policy.api.dto.request.ListDetailRequest;
import com.xingyun.policy.api.dto.response.PolicyResponse;
import com.xingyun.policy.api.dto.response.ResponseHeader;
import com.xingyun.policy.api.enums.Status;
import com.xingyun.policy.api.service.PolicyServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PolicyStreamingServer {
    private static final Logger logger = Logger.getLogger(PolicyStreamingServer.class.getName());

    private final int port;
    private final Server server;

    public PolicyStreamingServer(int port) throws IOException {
        this(ServerBuilder.forPort(port), port);
    }

    public PolicyStreamingServer(ServerBuilder<?> serverBuilder, int port) {
        this.port = port;
        server = serverBuilder.addService(new PolicyStreamingService())
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may has been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PolicyStreamingServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        PolicyStreamingServer server = new PolicyStreamingServer(8980);
        server.start();
        server.blockUntilShutdown();
    }

    private static class PolicyStreamingService extends PolicyServiceGrpc.PolicyServiceImplBase {
        PolicyStreamingService() {
        }

        /**
         * 阻塞请求unary，流响应
         *
         * @param request
         * @param responseObserver
         */
        @Override
        public void listPolicyStreaming(com.xingyun.policy.api.dto.request.ListRequest request,
                                        final io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
            logger.log(Level.INFO, "listPolicyStreaming request:" + request.toString());
            // stream响应多个
            for (int i = 0; i < 10; i++) {
                responseObserver.onNext(PolicyResponse.newBuilder()
                        .setHeader(ResponseHeader.newBuilder()
                                .setStatus(Status.STATUS_SUCCESS)
                                .setMsg("Stream reply ok " + i)
                                .build()).build());
            }
            // 响应结束.
            responseObserver.onCompleted();
        }

        /**
         * 流请求，单响应
         * @param responseObserver
         * @return
         */
        @Override
        public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.CheckRequest> checkStreaming(
                final io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
            return new StreamObserver<CheckRequest>() {
                int count = 0;

                @Override
                public void onNext(CheckRequest checkRequest) {
                    count++;
                    logger.log(Level.INFO, "checkStreaming request:" + count);
                }

                @Override
                public void onError(Throwable throwable) {
                    logger.log(Level.WARNING, "checkStreaming cancelled");
                }

                @Override
                public void onCompleted() {
                    responseObserver.onNext(PolicyResponse.newBuilder()
                            .setHeader(ResponseHeader.newBuilder()
                                    .setStatus(Status.STATUS_SUCCESS)
                                    .setMsg("Stream reply ok")
                                    .build())
                            .build());
                    responseObserver.onCompleted();
                }
            };
        }

        /**
         * 流请求流响应
         * @param responseObserver
         * @return
         */
        @Override
        public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.ListDetailRequest> listDetailStreaming(
                final io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
            return new StreamObserver<ListDetailRequest>() {
                int count = 0;

                @Override
                public void onNext(ListDetailRequest listDetailRequest) {
                    count++;
                    logger.log(Level.INFO, "listDetailStreaming response:" + count+"\t   "+listDetailRequest.toString());
                    // 一次请求，任意个响应
                    for (int i = 1; i <= 3; i++) {
                        responseObserver.onNext(PolicyResponse.newBuilder()
                                .setHeader(ResponseHeader.newBuilder()
                                        .setStatus(Status.STATUS_SUCCESS)
                                        .setMsg("Stream reply ok " + (count +"/"+ i))
                                        .build()).build());
                    }
                }

                @Override
                public void onError(Throwable throwable) {
                    logger.log(Level.WARNING, "listDetailStreaming cancelled");
                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
