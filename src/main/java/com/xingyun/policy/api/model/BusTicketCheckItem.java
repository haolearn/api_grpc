// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

/**
 * <pre>
 * 汽车票政策规则检查项数据封装.
 * </pre>
 *
 * Protobuf type {@code api.BusTicketCheckItem}
 */
public  final class BusTicketCheckItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.BusTicketCheckItem)
    BusTicketCheckItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusTicketCheckItem.newBuilder() to construct.
  private BusTicketCheckItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusTicketCheckItem() {
    cuid_ = 0L;
    eid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BusTicketCheckItem(
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
          case 8: {

            cuid_ = input.readInt64();
            break;
          }
          case 16: {

            eid_ = input.readInt64();
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
    return com.xingyun.policy.api.model.Model.internal_static_api_BusTicketCheckItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xingyun.policy.api.model.Model.internal_static_api_BusTicketCheckItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xingyun.policy.api.model.BusTicketCheckItem.class, com.xingyun.policy.api.model.BusTicketCheckItem.Builder.class);
  }

  public static final int CUID_FIELD_NUMBER = 1;
  private long cuid_;
  /**
   * <pre>
   * 用户ID.
   * </pre>
   *
   * <code>int64 cuid = 1;</code>
   */
  public long getCuid() {
    return cuid_;
  }

  public static final int EID_FIELD_NUMBER = 2;
  private long eid_;
  /**
   * <pre>
   * 企业ID.
   * </pre>
   *
   * <code>int64 eid = 2;</code>
   */
  public long getEid() {
    return eid_;
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
    if (cuid_ != 0L) {
      output.writeInt64(1, cuid_);
    }
    if (eid_ != 0L) {
      output.writeInt64(2, eid_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, cuid_);
    }
    if (eid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eid_);
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
    if (!(obj instanceof com.xingyun.policy.api.model.BusTicketCheckItem)) {
      return super.equals(obj);
    }
    com.xingyun.policy.api.model.BusTicketCheckItem other = (com.xingyun.policy.api.model.BusTicketCheckItem) obj;

    boolean result = true;
    result = result && (getCuid()
        == other.getCuid());
    result = result && (getEid()
        == other.getEid());
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
    hash = (37 * hash) + CUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCuid());
    hash = (37 * hash) + EID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.BusTicketCheckItem parseFrom(
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
  public static Builder newBuilder(com.xingyun.policy.api.model.BusTicketCheckItem prototype) {
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
   * 汽车票政策规则检查项数据封装.
   * </pre>
   *
   * Protobuf type {@code api.BusTicketCheckItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.BusTicketCheckItem)
      com.xingyun.policy.api.model.BusTicketCheckItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xingyun.policy.api.model.Model.internal_static_api_BusTicketCheckItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xingyun.policy.api.model.Model.internal_static_api_BusTicketCheckItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xingyun.policy.api.model.BusTicketCheckItem.class, com.xingyun.policy.api.model.BusTicketCheckItem.Builder.class);
    }

    // Construct using com.xingyun.policy.api.model.BusTicketCheckItem.newBuilder()
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
      cuid_ = 0L;

      eid_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xingyun.policy.api.model.Model.internal_static_api_BusTicketCheckItem_descriptor;
    }

    public com.xingyun.policy.api.model.BusTicketCheckItem getDefaultInstanceForType() {
      return com.xingyun.policy.api.model.BusTicketCheckItem.getDefaultInstance();
    }

    public com.xingyun.policy.api.model.BusTicketCheckItem build() {
      com.xingyun.policy.api.model.BusTicketCheckItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xingyun.policy.api.model.BusTicketCheckItem buildPartial() {
      com.xingyun.policy.api.model.BusTicketCheckItem result = new com.xingyun.policy.api.model.BusTicketCheckItem(this);
      result.cuid_ = cuid_;
      result.eid_ = eid_;
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
      if (other instanceof com.xingyun.policy.api.model.BusTicketCheckItem) {
        return mergeFrom((com.xingyun.policy.api.model.BusTicketCheckItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xingyun.policy.api.model.BusTicketCheckItem other) {
      if (other == com.xingyun.policy.api.model.BusTicketCheckItem.getDefaultInstance()) return this;
      if (other.getCuid() != 0L) {
        setCuid(other.getCuid());
      }
      if (other.getEid() != 0L) {
        setEid(other.getEid());
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
      com.xingyun.policy.api.model.BusTicketCheckItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xingyun.policy.api.model.BusTicketCheckItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long cuid_ ;
    /**
     * <pre>
     * 用户ID.
     * </pre>
     *
     * <code>int64 cuid = 1;</code>
     */
    public long getCuid() {
      return cuid_;
    }
    /**
     * <pre>
     * 用户ID.
     * </pre>
     *
     * <code>int64 cuid = 1;</code>
     */
    public Builder setCuid(long value) {
      
      cuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户ID.
     * </pre>
     *
     * <code>int64 cuid = 1;</code>
     */
    public Builder clearCuid() {
      
      cuid_ = 0L;
      onChanged();
      return this;
    }

    private long eid_ ;
    /**
     * <pre>
     * 企业ID.
     * </pre>
     *
     * <code>int64 eid = 2;</code>
     */
    public long getEid() {
      return eid_;
    }
    /**
     * <pre>
     * 企业ID.
     * </pre>
     *
     * <code>int64 eid = 2;</code>
     */
    public Builder setEid(long value) {
      
      eid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 企业ID.
     * </pre>
     *
     * <code>int64 eid = 2;</code>
     */
    public Builder clearEid() {
      
      eid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.BusTicketCheckItem)
  }

  // @@protoc_insertion_point(class_scope:api.BusTicketCheckItem)
  private static final com.xingyun.policy.api.model.BusTicketCheckItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xingyun.policy.api.model.BusTicketCheckItem();
  }

  public static com.xingyun.policy.api.model.BusTicketCheckItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusTicketCheckItem>
      PARSER = new com.google.protobuf.AbstractParser<BusTicketCheckItem>() {
    public BusTicketCheckItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BusTicketCheckItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BusTicketCheckItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusTicketCheckItem> getParserForType() {
    return PARSER;
  }

  public com.xingyun.policy.api.model.BusTicketCheckItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

