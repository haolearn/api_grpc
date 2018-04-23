// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.xingyun.policy.api.dto.request;

/**
 * <pre>
 * 可扩充请求消息头，封装通用的请求消息头.
 * </pre>
 *
 * Protobuf type {@code api.RequestHeader}
 */
public  final class RequestHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.RequestHeader)
    RequestHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestHeader.newBuilder() to construct.
  private RequestHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestHeader() {
    traceId_ = "";
    key_ = "";
    source_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestHeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            traceId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            source_ = s;
            break;
          }
          case 802: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (ext_ != null) {
              subBuilder = ext_.toBuilder();
            }
            ext_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ext_);
              ext_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xingyun.policy.api.dto.request.Request.internal_static_api_RequestHeader_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xingyun.policy.api.dto.request.Request.internal_static_api_RequestHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xingyun.policy.api.dto.request.RequestHeader.class, com.xingyun.policy.api.dto.request.RequestHeader.Builder.class);
  }

  public static final int TRACE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object traceId_;
  /**
   * <pre>
   * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   */
  public java.lang.String getTraceId() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
   * </pre>
   *
   * <code>string trace_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTraceIdBytes() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      traceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object source_;
  /**
   * <pre>
   * 向服务者标明自己的身份.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 向服务者标明自己的身份.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXT_FIELD_NUMBER = 100;
  private com.google.protobuf.Any ext_;
  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  public boolean hasExt() {
    return ext_ != null;
  }
  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  public com.google.protobuf.Any getExt() {
    return ext_ == null ? com.google.protobuf.Any.getDefaultInstance() : ext_;
  }
  /**
   * <pre>
   * 可选扩展信息,任何类型.
   * </pre>
   *
   * <code>.google.protobuf.Any ext = 100;</code>
   */
  public com.google.protobuf.AnyOrBuilder getExtOrBuilder() {
    return getExt();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, traceId_);
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    if (!getSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, source_);
    }
    if (ext_ != null) {
      output.writeMessage(100, getExt());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, traceId_);
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
    }
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, source_);
    }
    if (ext_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, getExt());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xingyun.policy.api.dto.request.RequestHeader)) {
      return super.equals(obj);
    }
    com.xingyun.policy.api.dto.request.RequestHeader other = (com.xingyun.policy.api.dto.request.RequestHeader) obj;

    boolean result = true;
    result = result && getTraceId()
        .equals(other.getTraceId());
    result = result && getKey()
        .equals(other.getKey());
    result = result && getSource()
        .equals(other.getSource());
    result = result && (hasExt() == other.hasExt());
    if (hasExt()) {
      result = result && getExt()
          .equals(other.getExt());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    if (hasExt()) {
      hash = (37 * hash) + EXT_FIELD_NUMBER;
      hash = (53 * hash) + getExt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.RequestHeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xingyun.policy.api.dto.request.RequestHeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 可扩充请求消息头，封装通用的请求消息头.
   * </pre>
   *
   * Protobuf type {@code api.RequestHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.RequestHeader)
      com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_RequestHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_RequestHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xingyun.policy.api.dto.request.RequestHeader.class, com.xingyun.policy.api.dto.request.RequestHeader.Builder.class);
    }

    // Construct using com.xingyun.policy.api.dto.request.RequestHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      traceId_ = "";

      key_ = "";

      source_ = "";

      if (extBuilder_ == null) {
        ext_ = null;
      } else {
        ext_ = null;
        extBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_RequestHeader_descriptor;
    }

    public com.xingyun.policy.api.dto.request.RequestHeader getDefaultInstanceForType() {
      return com.xingyun.policy.api.dto.request.RequestHeader.getDefaultInstance();
    }

    public com.xingyun.policy.api.dto.request.RequestHeader build() {
      com.xingyun.policy.api.dto.request.RequestHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xingyun.policy.api.dto.request.RequestHeader buildPartial() {
      com.xingyun.policy.api.dto.request.RequestHeader result = new com.xingyun.policy.api.dto.request.RequestHeader(this);
      result.traceId_ = traceId_;
      result.key_ = key_;
      result.source_ = source_;
      if (extBuilder_ == null) {
        result.ext_ = ext_;
      } else {
        result.ext_ = extBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xingyun.policy.api.dto.request.RequestHeader) {
        return mergeFrom((com.xingyun.policy.api.dto.request.RequestHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xingyun.policy.api.dto.request.RequestHeader other) {
      if (other == com.xingyun.policy.api.dto.request.RequestHeader.getDefaultInstance()) return this;
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        onChanged();
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (other.hasExt()) {
        mergeExt(other.getExt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xingyun.policy.api.dto.request.RequestHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xingyun.policy.api.dto.request.RequestHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object traceId_ = "";
    /**
     * <pre>
     * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     */
    public java.lang.String getTraceId() {
      java.lang.Object ref = traceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTraceIdBytes() {
      java.lang.Object ref = traceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        traceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     */
    public Builder setTraceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     */
    public Builder clearTraceId() {
      
      traceId_ = getDefaultInstance().getTraceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求唯一的trace_id，全局唯一，响应头中带回，用于跟踪服务.
     * </pre>
     *
     * <code>string trace_id = 1;</code>
     */
    public Builder setTraceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      traceId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求方幂等key,不传接口不提供幂等支持，请求唯一键=key+source.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <pre>
     * 向服务者标明自己的身份.
     * </pre>
     *
     * <code>string source = 3;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 向服务者标明自己的身份.
     * </pre>
     *
     * <code>string source = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 向服务者标明自己的身份.
     * </pre>
     *
     * <code>string source = 3;</code>
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 向服务者标明自己的身份.
     * </pre>
     *
     * <code>string source = 3;</code>
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 向服务者标明自己的身份.
     * </pre>
     *
     * <code>string source = 3;</code>
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any ext_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> extBuilder_;
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public boolean hasExt() {
      return extBuilder_ != null || ext_ != null;
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public com.google.protobuf.Any getExt() {
      if (extBuilder_ == null) {
        return ext_ == null ? com.google.protobuf.Any.getDefaultInstance() : ext_;
      } else {
        return extBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public Builder setExt(com.google.protobuf.Any value) {
      if (extBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ext_ = value;
        onChanged();
      } else {
        extBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public Builder setExt(
        com.google.protobuf.Any.Builder builderForValue) {
      if (extBuilder_ == null) {
        ext_ = builderForValue.build();
        onChanged();
      } else {
        extBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public Builder mergeExt(com.google.protobuf.Any value) {
      if (extBuilder_ == null) {
        if (ext_ != null) {
          ext_ =
            com.google.protobuf.Any.newBuilder(ext_).mergeFrom(value).buildPartial();
        } else {
          ext_ = value;
        }
        onChanged();
      } else {
        extBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public Builder clearExt() {
      if (extBuilder_ == null) {
        ext_ = null;
        onChanged();
      } else {
        ext_ = null;
        extBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public com.google.protobuf.Any.Builder getExtBuilder() {
      
      onChanged();
      return getExtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    public com.google.protobuf.AnyOrBuilder getExtOrBuilder() {
      if (extBuilder_ != null) {
        return extBuilder_.getMessageOrBuilder();
      } else {
        return ext_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : ext_;
      }
    }
    /**
     * <pre>
     * 可选扩展信息,任何类型.
     * </pre>
     *
     * <code>.google.protobuf.Any ext = 100;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getExtFieldBuilder() {
      if (extBuilder_ == null) {
        extBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getExt(),
                getParentForChildren(),
                isClean());
        ext_ = null;
      }
      return extBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.RequestHeader)
  }

  // @@protoc_insertion_point(class_scope:api.RequestHeader)
  private static final com.xingyun.policy.api.dto.request.RequestHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xingyun.policy.api.dto.request.RequestHeader();
  }

  public static com.xingyun.policy.api.dto.request.RequestHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestHeader>
      PARSER = new com.google.protobuf.AbstractParser<RequestHeader>() {
    public RequestHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestHeader> getParserForType() {
    return PARSER;
  }

  public com.xingyun.policy.api.dto.request.RequestHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
