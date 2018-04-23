package com.xingyun.policy.api.client;

import com.google.protobuf.Any;
import com.xingyun.policy.api.dto.request.CheckRequest;
import com.xingyun.policy.api.dto.response.PolicyResponse;
import com.xingyun.policy.api.enums.BusiType;
import com.xingyun.policy.api.model.BusTicketCheckItem;
import com.xingyun.policy.api.service.PolicyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class PolicyClient {
    private final ManagedChannel channel;
    private final PolicyServiceGrpc.PolicyServiceBlockingStub blockingStub;

    public PolicyClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext(true)
                .build());
    }

    PolicyClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = PolicyServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void checkBusTicket() {
        CheckRequest request =
                CheckRequest.newBuilder()
                        .setBusiType(BusiType.BUSI_TYPE_BUSTICKET)
                        .addItems(Any.pack(BusTicketCheckItem.newBuilder()
                                .setEid(1452L)
                                .setCuid(123L)
                                .build()))
                        .addItems(Any.pack(BusTicketCheckItem.newBuilder()
                                .setEid(1452L)
                                .setCuid(123L)
                                .build()))
                        .addItems(Any.pack(BusTicketCheckItem.newBuilder()
                                .setEid(1452L)
                                .setCuid(123L)
                                .build()))
                        .addItems(Any.pack(BusTicketCheckItem.newBuilder()
                                .setEid(1452L)
                                .setCuid(123L)
                                .build()))
                        .build();
        PolicyResponse response;
        try {
            long b = System.currentTimeMillis();
            for(int i=0;i<10000;i++ ) {
                response = blockingStub
//                        .withCompression("gzip") // 客户端设定压缩请求。服务端自行选择是否压缩响应
                        .check(request);
//                System.err.println("response: " + response.toString());
            }
            System.err.println("total time:" + (System.currentTimeMillis() - b));
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) throws Exception {
        PolicyClient client = new PolicyClient("localhost", 8980);
        try {
            client.checkBusTicket();
        } finally {
            client.shutdown();
        }
    }
}
