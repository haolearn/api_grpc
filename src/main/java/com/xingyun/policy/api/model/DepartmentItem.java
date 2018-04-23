// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

/**
 * <pre>
 * 部门信息封装.
 * </pre>
 *
 * Protobuf type {@code api.DepartmentItem}
 */
public  final class DepartmentItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.DepartmentItem)
    DepartmentItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DepartmentItem.newBuilder() to construct.
  private DepartmentItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DepartmentItem() {
    eid_ = 0L;
    departmentId_ = 0L;
    departmentName_ = "";
    totalNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DepartmentItem(
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

            eid_ = input.readInt64();
            break;
          }
          case 16: {

            departmentId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            departmentName_ = s;
            break;
          }
          case 32: {

            totalNumber_ = input.readInt32();
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
    return com.xingyun.policy.api.model.Model.internal_static_api_DepartmentItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xingyun.policy.api.model.Model.internal_static_api_DepartmentItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xingyun.policy.api.model.DepartmentItem.class, com.xingyun.policy.api.model.DepartmentItem.Builder.class);
  }

  public static final int EID_FIELD_NUMBER = 1;
  private long eid_;
  /**
   * <pre>
   * 企业编号.
   * </pre>
   *
   * <code>int64 eid = 1;</code>
   */
  public long getEid() {
    return eid_;
  }

  public static final int DEPARTMENT_ID_FIELD_NUMBER = 2;
  private long departmentId_;
  /**
   * <pre>
   * 部门编号.
   * </pre>
   *
   * <code>int64 department_id = 2;</code>
   */
  public long getDepartmentId() {
    return departmentId_;
  }

  public static final int DEPARTMENT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object departmentName_;
  /**
   * <pre>
   * 部门名称.
   * </pre>
   *
   * <code>string department_name = 3;</code>
   */
  public java.lang.String getDepartmentName() {
    java.lang.Object ref = departmentName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      departmentName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 部门名称.
   * </pre>
   *
   * <code>string department_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDepartmentNameBytes() {
    java.lang.Object ref = departmentName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      departmentName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_NUMBER_FIELD_NUMBER = 4;
  private int totalNumber_;
  /**
   * <pre>
   *总员工数.
   * </pre>
   *
   * <code>int32 total_number = 4;</code>
   */
  public int getTotalNumber() {
    return totalNumber_;
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
    if (eid_ != 0L) {
      output.writeInt64(1, eid_);
    }
    if (departmentId_ != 0L) {
      output.writeInt64(2, departmentId_);
    }
    if (!getDepartmentNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, departmentName_);
    }
    if (totalNumber_ != 0) {
      output.writeInt32(4, totalNumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, eid_);
    }
    if (departmentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, departmentId_);
    }
    if (!getDepartmentNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, departmentName_);
    }
    if (totalNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalNumber_);
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
    if (!(obj instanceof com.xingyun.policy.api.model.DepartmentItem)) {
      return super.equals(obj);
    }
    com.xingyun.policy.api.model.DepartmentItem other = (com.xingyun.policy.api.model.DepartmentItem) obj;

    boolean result = true;
    result = result && (getEid()
        == other.getEid());
    result = result && (getDepartmentId()
        == other.getDepartmentId());
    result = result && getDepartmentName()
        .equals(other.getDepartmentName());
    result = result && (getTotalNumber()
        == other.getTotalNumber());
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
    hash = (37 * hash) + EID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEid());
    hash = (37 * hash) + DEPARTMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDepartmentId());
    hash = (37 * hash) + DEPARTMENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDepartmentName().hashCode();
    hash = (37 * hash) + TOTAL_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getTotalNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.DepartmentItem parseFrom(
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
  public static Builder newBuilder(com.xingyun.policy.api.model.DepartmentItem prototype) {
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
   * 部门信息封装.
   * </pre>
   *
   * Protobuf type {@code api.DepartmentItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.DepartmentItem)
      com.xingyun.policy.api.model.DepartmentItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xingyun.policy.api.model.Model.internal_static_api_DepartmentItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xingyun.policy.api.model.Model.internal_static_api_DepartmentItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xingyun.policy.api.model.DepartmentItem.class, com.xingyun.policy.api.model.DepartmentItem.Builder.class);
    }

    // Construct using com.xingyun.policy.api.model.DepartmentItem.newBuilder()
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
      eid_ = 0L;

      departmentId_ = 0L;

      departmentName_ = "";

      totalNumber_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xingyun.policy.api.model.Model.internal_static_api_DepartmentItem_descriptor;
    }

    public com.xingyun.policy.api.model.DepartmentItem getDefaultInstanceForType() {
      return com.xingyun.policy.api.model.DepartmentItem.getDefaultInstance();
    }

    public com.xingyun.policy.api.model.DepartmentItem build() {
      com.xingyun.policy.api.model.DepartmentItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xingyun.policy.api.model.DepartmentItem buildPartial() {
      com.xingyun.policy.api.model.DepartmentItem result = new com.xingyun.policy.api.model.DepartmentItem(this);
      result.eid_ = eid_;
      result.departmentId_ = departmentId_;
      result.departmentName_ = departmentName_;
      result.totalNumber_ = totalNumber_;
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
      if (other instanceof com.xingyun.policy.api.model.DepartmentItem) {
        return mergeFrom((com.xingyun.policy.api.model.DepartmentItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xingyun.policy.api.model.DepartmentItem other) {
      if (other == com.xingyun.policy.api.model.DepartmentItem.getDefaultInstance()) return this;
      if (other.getEid() != 0L) {
        setEid(other.getEid());
      }
      if (other.getDepartmentId() != 0L) {
        setDepartmentId(other.getDepartmentId());
      }
      if (!other.getDepartmentName().isEmpty()) {
        departmentName_ = other.departmentName_;
        onChanged();
      }
      if (other.getTotalNumber() != 0) {
        setTotalNumber(other.getTotalNumber());
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
      com.xingyun.policy.api.model.DepartmentItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xingyun.policy.api.model.DepartmentItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long eid_ ;
    /**
     * <pre>
     * 企业编号.
     * </pre>
     *
     * <code>int64 eid = 1;</code>
     */
    public long getEid() {
      return eid_;
    }
    /**
     * <pre>
     * 企业编号.
     * </pre>
     *
     * <code>int64 eid = 1;</code>
     */
    public Builder setEid(long value) {
      
      eid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 企业编号.
     * </pre>
     *
     * <code>int64 eid = 1;</code>
     */
    public Builder clearEid() {
      
      eid_ = 0L;
      onChanged();
      return this;
    }

    private long departmentId_ ;
    /**
     * <pre>
     * 部门编号.
     * </pre>
     *
     * <code>int64 department_id = 2;</code>
     */
    public long getDepartmentId() {
      return departmentId_;
    }
    /**
     * <pre>
     * 部门编号.
     * </pre>
     *
     * <code>int64 department_id = 2;</code>
     */
    public Builder setDepartmentId(long value) {
      
      departmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 部门编号.
     * </pre>
     *
     * <code>int64 department_id = 2;</code>
     */
    public Builder clearDepartmentId() {
      
      departmentId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object departmentName_ = "";
    /**
     * <pre>
     * 部门名称.
     * </pre>
     *
     * <code>string department_name = 3;</code>
     */
    public java.lang.String getDepartmentName() {
      java.lang.Object ref = departmentName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        departmentName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 部门名称.
     * </pre>
     *
     * <code>string department_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDepartmentNameBytes() {
      java.lang.Object ref = departmentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departmentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 部门名称.
     * </pre>
     *
     * <code>string department_name = 3;</code>
     */
    public Builder setDepartmentName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      departmentName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 部门名称.
     * </pre>
     *
     * <code>string department_name = 3;</code>
     */
    public Builder clearDepartmentName() {
      
      departmentName_ = getDefaultInstance().getDepartmentName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 部门名称.
     * </pre>
     *
     * <code>string department_name = 3;</code>
     */
    public Builder setDepartmentNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      departmentName_ = value;
      onChanged();
      return this;
    }

    private int totalNumber_ ;
    /**
     * <pre>
     *总员工数.
     * </pre>
     *
     * <code>int32 total_number = 4;</code>
     */
    public int getTotalNumber() {
      return totalNumber_;
    }
    /**
     * <pre>
     *总员工数.
     * </pre>
     *
     * <code>int32 total_number = 4;</code>
     */
    public Builder setTotalNumber(int value) {
      
      totalNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *总员工数.
     * </pre>
     *
     * <code>int32 total_number = 4;</code>
     */
    public Builder clearTotalNumber() {
      
      totalNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.DepartmentItem)
  }

  // @@protoc_insertion_point(class_scope:api.DepartmentItem)
  private static final com.xingyun.policy.api.model.DepartmentItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xingyun.policy.api.model.DepartmentItem();
  }

  public static com.xingyun.policy.api.model.DepartmentItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DepartmentItem>
      PARSER = new com.google.protobuf.AbstractParser<DepartmentItem>() {
    public DepartmentItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DepartmentItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DepartmentItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DepartmentItem> getParserForType() {
    return PARSER;
  }

  public com.xingyun.policy.api.model.DepartmentItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

