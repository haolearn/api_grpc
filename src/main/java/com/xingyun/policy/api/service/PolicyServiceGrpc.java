package com.xingyun.policy.api.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 政策（规则）服务.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0-SNAPSHOT)",
    comments = "Source: service.proto")
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "api.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCheckMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_CHECK = getCheckMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getCheckMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getCheckMethod;
    if ((getCheckMethod = PolicyServiceGrpc.getCheckMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getCheckMethod = PolicyServiceGrpc.getCheckMethod) == null) {
          PolicyServiceGrpc.getCheckMethod = getCheckMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.CheckRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("check"))
                  .build();
          }
        }
     }
     return getCheckMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPolicyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_LIST_POLICY = getListPolicyMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyMethod;
    if ((getListPolicyMethod = PolicyServiceGrpc.getListPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListPolicyMethod = PolicyServiceGrpc.getListPolicyMethod) == null) {
          PolicyServiceGrpc.getListPolicyMethod = getListPolicyMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.ListRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "listPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("listPolicy"))
                  .build();
          }
        }
     }
     return getListPolicyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDetailMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_LIST_DETAIL = getListDetailMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailMethod;
    if ((getListDetailMethod = PolicyServiceGrpc.getListDetailMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListDetailMethod = PolicyServiceGrpc.getListDetailMethod) == null) {
          PolicyServiceGrpc.getListDetailMethod = getListDetailMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.ListDetailRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "listDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.ListDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("listDetail"))
                  .build();
          }
        }
     }
     return getListDetailMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCheckStreamingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_CHECK_STREAMING = getCheckStreamingMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getCheckStreamingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getCheckStreamingMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.CheckRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getCheckStreamingMethod;
    if ((getCheckStreamingMethod = PolicyServiceGrpc.getCheckStreamingMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getCheckStreamingMethod = PolicyServiceGrpc.getCheckStreamingMethod) == null) {
          PolicyServiceGrpc.getCheckStreamingMethod = getCheckStreamingMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.CheckRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "checkStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("checkStreaming"))
                  .build();
          }
        }
     }
     return getCheckStreamingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPolicyStreamingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_LIST_POLICY_STREAMING = getListPolicyStreamingMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyStreamingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyStreamingMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getListPolicyStreamingMethod;
    if ((getListPolicyStreamingMethod = PolicyServiceGrpc.getListPolicyStreamingMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListPolicyStreamingMethod = PolicyServiceGrpc.getListPolicyStreamingMethod) == null) {
          PolicyServiceGrpc.getListPolicyStreamingMethod = getListPolicyStreamingMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.ListRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "listPolicyStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("listPolicyStreaming"))
                  .build();
          }
        }
     }
     return getListPolicyStreamingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDetailStreamingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> METHOD_LIST_DETAIL_STREAMING = getListDetailStreamingMethod();

  private static volatile io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailStreamingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest,
      com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailStreamingMethod() {
    io.grpc.MethodDescriptor<com.xingyun.policy.api.dto.request.ListDetailRequest, com.xingyun.policy.api.dto.response.PolicyResponse> getListDetailStreamingMethod;
    if ((getListDetailStreamingMethod = PolicyServiceGrpc.getListDetailStreamingMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getListDetailStreamingMethod = PolicyServiceGrpc.getListDetailStreamingMethod) == null) {
          PolicyServiceGrpc.getListDetailStreamingMethod = getListDetailStreamingMethod = 
              io.grpc.MethodDescriptor.<com.xingyun.policy.api.dto.request.ListDetailRequest, com.xingyun.policy.api.dto.response.PolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.PolicyService", "listDetailStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.request.ListDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xingyun.policy.api.dto.response.PolicyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("listDetailStreaming"))
                  .build();
          }
        }
     }
     return getListDetailStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    return new PolicyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PolicyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PolicyServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 政策（规则）服务.
   * </pre>
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 政策规则检查.
     * </pre>
     */
    public void check(com.xingyun.policy.api.dto.request.CheckRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查规则列表.
     * </pre>
     */
    public void listPolicy(com.xingyun.policy.api.dto.request.ListRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查规则明细.
     * </pre>
     */
    public void listDetail(com.xingyun.policy.api.dto.request.ListDetailRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 流方式发送多个请求.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.CheckRequest> checkStreaming(
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查规则列表,流方式响应.
     * </pre>
     */
    public void listPolicyStreaming(com.xingyun.policy.api.dto.request.ListRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPolicyStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * 流方式发送请求、流方式接收多个响应.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.ListDetailRequest> listDetailStreaming(
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getListDetailStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.CheckRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getListPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.ListRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_LIST_POLICY)))
          .addMethod(
            getListDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.ListDetailRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_LIST_DETAIL)))
          .addMethod(
            getCheckStreamingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.CheckRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_CHECK_STREAMING)))
          .addMethod(
            getListPolicyStreamingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.ListRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_LIST_POLICY_STREAMING)))
          .addMethod(
            getListDetailStreamingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.xingyun.policy.api.dto.request.ListDetailRequest,
                com.xingyun.policy.api.dto.response.PolicyResponse>(
                  this, METHODID_LIST_DETAIL_STREAMING)))
          .build();
    }
  }

  /**
   * <pre>
   * 政策（规则）服务.
   * </pre>
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractStub<PolicyServiceStub> {
    private PolicyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 政策规则检查.
     * </pre>
     */
    public void check(com.xingyun.policy.api.dto.request.CheckRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查规则列表.
     * </pre>
     */
    public void listPolicy(com.xingyun.policy.api.dto.request.ListRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查规则明细.
     * </pre>
     */
    public void listDetail(com.xingyun.policy.api.dto.request.ListDetailRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 流方式发送多个请求.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.CheckRequest> checkStreaming(
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCheckStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 查规则列表,流方式响应.
     * </pre>
     */
    public void listPolicyStreaming(com.xingyun.policy.api.dto.request.ListRequest request,
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListPolicyStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 流方式发送请求、流方式接收多个响应.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.request.ListDetailRequest> listDetailStreaming(
        io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getListDetailStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 政策（规则）服务.
   * </pre>
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 政策规则检查.
     * </pre>
     */
    public com.xingyun.policy.api.dto.response.PolicyResponse check(com.xingyun.policy.api.dto.request.CheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查规则列表.
     * </pre>
     */
    public com.xingyun.policy.api.dto.response.PolicyResponse listPolicy(com.xingyun.policy.api.dto.request.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查规则明细.
     * </pre>
     */
    public com.xingyun.policy.api.dto.response.PolicyResponse listDetail(com.xingyun.policy.api.dto.request.ListDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查规则列表,流方式响应.
     * </pre>
     */
    public java.util.Iterator<com.xingyun.policy.api.dto.response.PolicyResponse> listPolicyStreaming(
        com.xingyun.policy.api.dto.request.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListPolicyStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 政策（规则）服务.
   * </pre>
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 政策规则检查.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xingyun.policy.api.dto.response.PolicyResponse> check(
        com.xingyun.policy.api.dto.request.CheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查规则列表.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xingyun.policy.api.dto.response.PolicyResponse> listPolicy(
        com.xingyun.policy.api.dto.request.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查规则明细.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xingyun.policy.api.dto.response.PolicyResponse> listDetail(
        com.xingyun.policy.api.dto.request.ListDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_LIST_POLICY = 1;
  private static final int METHODID_LIST_DETAIL = 2;
  private static final int METHODID_LIST_POLICY_STREAMING = 3;
  private static final int METHODID_CHECK_STREAMING = 4;
  private static final int METHODID_LIST_DETAIL_STREAMING = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((com.xingyun.policy.api.dto.request.CheckRequest) request,
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
          break;
        case METHODID_LIST_POLICY:
          serviceImpl.listPolicy((com.xingyun.policy.api.dto.request.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
          break;
        case METHODID_LIST_DETAIL:
          serviceImpl.listDetail((com.xingyun.policy.api.dto.request.ListDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
          break;
        case METHODID_LIST_POLICY_STREAMING:
          serviceImpl.listPolicyStreaming((com.xingyun.policy.api.dto.request.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkStreaming(
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
        case METHODID_LIST_DETAIL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.listDetailStreaming(
              (io.grpc.stub.StreamObserver<com.xingyun.policy.api.dto.response.PolicyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xingyun.policy.api.service.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getListPolicyMethod())
              .addMethod(getListDetailMethod())
              .addMethod(getCheckStreamingMethod())
              .addMethod(getListPolicyStreamingMethod())
              .addMethod(getListDetailStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
