// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.xingyun.policy.api.dto.request;

/**
 * <pre>
 * 规则明细请求.
 * </pre>
 *
 * Protobuf type {@code api.ListDetailRequest}
 */
public  final class ListDetailRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListDetailRequest)
    ListDetailRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDetailRequest.newBuilder() to construct.
  private ListDetailRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDetailRequest() {
    cuids_ = java.util.Collections.emptyList();
    busiType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDetailRequest(
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
            com.xingyun.policy.api.dto.request.RequestHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.xingyun.policy.api.dto.request.RequestHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              cuids_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            cuids_.add(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              cuids_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              cuids_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            busiType_ = rawValue;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        cuids_ = java.util.Collections.unmodifiableList(cuids_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xingyun.policy.api.dto.request.Request.internal_static_api_ListDetailRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xingyun.policy.api.dto.request.Request.internal_static_api_ListDetailRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xingyun.policy.api.dto.request.ListDetailRequest.class, com.xingyun.policy.api.dto.request.ListDetailRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.xingyun.policy.api.dto.request.RequestHeader header_;
  /**
   * <pre>
   * 请求头.
   * </pre>
   *
   * <code>.api.RequestHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * 请求头.
   * </pre>
   *
   * <code>.api.RequestHeader header = 1;</code>
   */
  public com.xingyun.policy.api.dto.request.RequestHeader getHeader() {
    return header_ == null ? com.xingyun.policy.api.dto.request.RequestHeader.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * 请求头.
   * </pre>
   *
   * <code>.api.RequestHeader header = 1;</code>
   */
  public com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int CUIDS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Long> cuids_;
  /**
   * <pre>
   * 用户id列表.
   * </pre>
   *
   * <code>repeated int64 cuids = 2;</code>
   */
  public java.util.List<java.lang.Long>
      getCuidsList() {
    return cuids_;
  }
  /**
   * <pre>
   * 用户id列表.
   * </pre>
   *
   * <code>repeated int64 cuids = 2;</code>
   */
  public int getCuidsCount() {
    return cuids_.size();
  }
  /**
   * <pre>
   * 用户id列表.
   * </pre>
   *
   * <code>repeated int64 cuids = 2;</code>
   */
  public long getCuids(int index) {
    return cuids_.get(index);
  }
  private int cuidsMemoizedSerializedSize = -1;

  public static final int BUSI_TYPE_FIELD_NUMBER = 3;
  private int busiType_;
  /**
   * <pre>
   * 业务类型.
   * </pre>
   *
   * <code>.api.BusiType busi_type = 3;</code>
   */
  public int getBusiTypeValue() {
    return busiType_;
  }
  /**
   * <pre>
   * 业务类型.
   * </pre>
   *
   * <code>.api.BusiType busi_type = 3;</code>
   */
  public com.xingyun.policy.api.enums.BusiType getBusiType() {
    com.xingyun.policy.api.enums.BusiType result = com.xingyun.policy.api.enums.BusiType.valueOf(busiType_);
    return result == null ? com.xingyun.policy.api.enums.BusiType.UNRECOGNIZED : result;
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
    getSerializedSize();
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (getCuidsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(cuidsMemoizedSerializedSize);
    }
    for (int i = 0; i < cuids_.size(); i++) {
      output.writeInt64NoTag(cuids_.get(i));
    }
    if (busiType_ != com.xingyun.policy.api.enums.BusiType.BUSI_TYPE_EMPTY.getNumber()) {
      output.writeEnum(3, busiType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cuids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(cuids_.get(i));
      }
      size += dataSize;
      if (!getCuidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      cuidsMemoizedSerializedSize = dataSize;
    }
    if (busiType_ != com.xingyun.policy.api.enums.BusiType.BUSI_TYPE_EMPTY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, busiType_);
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
    if (!(obj instanceof com.xingyun.policy.api.dto.request.ListDetailRequest)) {
      return super.equals(obj);
    }
    com.xingyun.policy.api.dto.request.ListDetailRequest other = (com.xingyun.policy.api.dto.request.ListDetailRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getCuidsList()
        .equals(other.getCuidsList());
    result = result && busiType_ == other.busiType_;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getCuidsCount() > 0) {
      hash = (37 * hash) + CUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getCuidsList().hashCode();
    }
    hash = (37 * hash) + BUSI_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + busiType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.dto.request.ListDetailRequest parseFrom(
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
  public static Builder newBuilder(com.xingyun.policy.api.dto.request.ListDetailRequest prototype) {
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
   * 规则明细请求.
   * </pre>
   *
   * Protobuf type {@code api.ListDetailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListDetailRequest)
      com.xingyun.policy.api.dto.request.ListDetailRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_ListDetailRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_ListDetailRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xingyun.policy.api.dto.request.ListDetailRequest.class, com.xingyun.policy.api.dto.request.ListDetailRequest.Builder.class);
    }

    // Construct using com.xingyun.policy.api.dto.request.ListDetailRequest.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      cuids_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      busiType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xingyun.policy.api.dto.request.Request.internal_static_api_ListDetailRequest_descriptor;
    }

    public com.xingyun.policy.api.dto.request.ListDetailRequest getDefaultInstanceForType() {
      return com.xingyun.policy.api.dto.request.ListDetailRequest.getDefaultInstance();
    }

    public com.xingyun.policy.api.dto.request.ListDetailRequest build() {
      com.xingyun.policy.api.dto.request.ListDetailRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xingyun.policy.api.dto.request.ListDetailRequest buildPartial() {
      com.xingyun.policy.api.dto.request.ListDetailRequest result = new com.xingyun.policy.api.dto.request.ListDetailRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        cuids_ = java.util.Collections.unmodifiableList(cuids_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.cuids_ = cuids_;
      result.busiType_ = busiType_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.xingyun.policy.api.dto.request.ListDetailRequest) {
        return mergeFrom((com.xingyun.policy.api.dto.request.ListDetailRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xingyun.policy.api.dto.request.ListDetailRequest other) {
      if (other == com.xingyun.policy.api.dto.request.ListDetailRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.cuids_.isEmpty()) {
        if (cuids_.isEmpty()) {
          cuids_ = other.cuids_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCuidsIsMutable();
          cuids_.addAll(other.cuids_);
        }
        onChanged();
      }
      if (other.busiType_ != 0) {
        setBusiTypeValue(other.getBusiTypeValue());
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
      com.xingyun.policy.api.dto.request.ListDetailRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xingyun.policy.api.dto.request.ListDetailRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.xingyun.policy.api.dto.request.RequestHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xingyun.policy.api.dto.request.RequestHeader, com.xingyun.policy.api.dto.request.RequestHeader.Builder, com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public com.xingyun.policy.api.dto.request.RequestHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.xingyun.policy.api.dto.request.RequestHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public Builder setHeader(com.xingyun.policy.api.dto.request.RequestHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public Builder setHeader(
        com.xingyun.policy.api.dto.request.RequestHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public Builder mergeHeader(com.xingyun.policy.api.dto.request.RequestHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.xingyun.policy.api.dto.request.RequestHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public com.xingyun.policy.api.dto.request.RequestHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    public com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.xingyun.policy.api.dto.request.RequestHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * 请求头.
     * </pre>
     *
     * <code>.api.RequestHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xingyun.policy.api.dto.request.RequestHeader, com.xingyun.policy.api.dto.request.RequestHeader.Builder, com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xingyun.policy.api.dto.request.RequestHeader, com.xingyun.policy.api.dto.request.RequestHeader.Builder, com.xingyun.policy.api.dto.request.RequestHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<java.lang.Long> cuids_ = java.util.Collections.emptyList();
    private void ensureCuidsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        cuids_ = new java.util.ArrayList<java.lang.Long>(cuids_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getCuidsList() {
      return java.util.Collections.unmodifiableList(cuids_);
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public int getCuidsCount() {
      return cuids_.size();
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public long getCuids(int index) {
      return cuids_.get(index);
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public Builder setCuids(
        int index, long value) {
      ensureCuidsIsMutable();
      cuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public Builder addCuids(long value) {
      ensureCuidsIsMutable();
      cuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public Builder addAllCuids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureCuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cuids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户id列表.
     * </pre>
     *
     * <code>repeated int64 cuids = 2;</code>
     */
    public Builder clearCuids() {
      cuids_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int busiType_ = 0;
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.BusiType busi_type = 3;</code>
     */
    public int getBusiTypeValue() {
      return busiType_;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.BusiType busi_type = 3;</code>
     */
    public Builder setBusiTypeValue(int value) {
      busiType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.BusiType busi_type = 3;</code>
     */
    public com.xingyun.policy.api.enums.BusiType getBusiType() {
      com.xingyun.policy.api.enums.BusiType result = com.xingyun.policy.api.enums.BusiType.valueOf(busiType_);
      return result == null ? com.xingyun.policy.api.enums.BusiType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.BusiType busi_type = 3;</code>
     */
    public Builder setBusiType(com.xingyun.policy.api.enums.BusiType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      busiType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.BusiType busi_type = 3;</code>
     */
    public Builder clearBusiType() {
      
      busiType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.ListDetailRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListDetailRequest)
  private static final com.xingyun.policy.api.dto.request.ListDetailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xingyun.policy.api.dto.request.ListDetailRequest();
  }

  public static com.xingyun.policy.api.dto.request.ListDetailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDetailRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListDetailRequest>() {
    public ListDetailRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDetailRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDetailRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDetailRequest> getParserForType() {
    return PARSER;
  }

  public com.xingyun.policy.api.dto.request.ListDetailRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
