package com.xingyun.policy.api.server;

import com.xingyun.policy.api.dto.response.PolicyResponse;
import com.xingyun.policy.api.dto.response.ResponseHeader;
import com.xingyun.policy.api.enums.Status;
import com.xingyun.policy.api.service.PolicyServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


public class PolicyServer {
    private Server server;

    private void start() throws IOException {
        int port = 8980;
        server = ServerBuilder.forPort(port)
                .addService(new PolicServiceImpl())
                .addService(new PolicServiceImpl())
                .addService(new PolicServiceImpl())
                .addService(new PolicServiceImpl())
                .build()
                .start();
        System.err.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PolicyServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    static class PolicServiceImpl extends PolicyServiceGrpc.PolicyServiceImplBase {
        @Override
        public void check(com.xingyun.policy.api.dto.request.CheckRequest request,
                          io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {

//            System.err.println("receive request from client:"+request.toString());

            PolicyResponse reply = PolicyResponse.newBuilder()
                    .setHeader(ResponseHeader.newBuilder()
                            .setStatus(Status.STATUS_SUCCESS)
                            .setMsg("OK")
                            .build())
                    .build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final PolicyServer server = new PolicyServer();
        server.start();
        server.blockUntilShutdown();
    }

}
