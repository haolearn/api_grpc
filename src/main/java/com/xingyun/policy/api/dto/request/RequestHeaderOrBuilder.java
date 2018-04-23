// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.xingyun.policy.api.dto.request;

public interface RequestHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.RequestHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <pre>
   * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * 向服务者标明自己的身份.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  java.lang.String getSource();
  /**
   * <pre>
   * 向服务者标明自己的身份.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  boolean hasExt();
  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  com.google.protobuf.Any getExt();
  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtOrBuilder();
}