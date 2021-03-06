// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

/**
 * <pre>
 * 用车政策规则检查项数据封装.
 * </pre>
 *
 * Protobuf type {@code api.CarCheckItem}
 */
public  final class CarCheckItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CarCheckItem)
    CarCheckItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CarCheckItem.newBuilder() to construct.
  private CarCheckItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CarCheckItem() {
    cuid_ = 0L;
    eid_ = 0L;
    orderFee_ = 0L;
    carType_ = 0;
    departTime_ = 0;
    longitude_ = 0D;
    latitude_ = 0D;
    busiType_ = 0;
    transferTime_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CarCheckItem(
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
          case 24: {

            orderFee_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            carType_ = rawValue;
            break;
          }
          case 40: {

            departTime_ = input.readInt32();
            break;
          }
          case 49: {

            longitude_ = input.readDouble();
            break;
          }
          case 57: {

            latitude_ = input.readDouble();
            break;
          }
          case 64: {
            int rawValue = input.readEnum();

            busiType_ = rawValue;
            break;
          }
          case 72: {

            transferTime_ = input.readInt32();
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
    return com.xingyun.policy.api.model.Model.internal_static_api_CarCheckItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xingyun.policy.api.model.Model.internal_static_api_CarCheckItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xingyun.policy.api.model.CarCheckItem.class, com.xingyun.policy.api.model.CarCheckItem.Builder.class);
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

  public static final int ORDER_FEE_FIELD_NUMBER = 3;
  private long orderFee_;
  /**
   * <pre>
   * 订单金额：分.
   * </pre>
   *
   * <code>int64 order_fee = 3;</code>
   */
  public long getOrderFee() {
    return orderFee_;
  }

  public static final int CAR_TYPE_FIELD_NUMBER = 4;
  private int carType_;
  /**
   * <pre>
   * 车型.
   * </pre>
   *
   * <code>.api.CarType car_type = 4;</code>
   */
  public int getCarTypeValue() {
    return carType_;
  }
  /**
   * <pre>
   * 车型.
   * </pre>
   *
   * <code>.api.CarType car_type = 4;</code>
   */
  public com.xingyun.policy.api.enums.CarType getCarType() {
    com.xingyun.policy.api.enums.CarType result = com.xingyun.policy.api.enums.CarType.valueOf(carType_);
    return result == null ? com.xingyun.policy.api.enums.CarType.UNRECOGNIZED : result;
  }

  public static final int DEPART_TIME_FIELD_NUMBER = 5;
  private int departTime_;
  /**
   * <pre>
   * 出发时间unix秒（含日期）
   * </pre>
   *
   * <code>int32 depart_time = 5;</code>
   */
  public int getDepartTime() {
    return departTime_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 6;
  private double longitude_;
  /**
   * <pre>
   * (出发)经度.
   * </pre>
   *
   * <code>double longitude = 6;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 7;
  private double latitude_;
  /**
   * <pre>
   * (出发)纬度.
   * </pre>
   *
   * <code>double latitude = 7;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int BUSI_TYPE_FIELD_NUMBER = 8;
  private int busiType_;
  /**
   * <pre>
   * 业务类型.
   * </pre>
   *
   * <code>.api.CarBusiType busi_type = 8;</code>
   */
  public int getBusiTypeValue() {
    return busiType_;
  }
  /**
   * <pre>
   * 业务类型.
   * </pre>
   *
   * <code>.api.CarBusiType busi_type = 8;</code>
   */
  public com.xingyun.policy.api.enums.CarBusiType getBusiType() {
    com.xingyun.policy.api.enums.CarBusiType result = com.xingyun.policy.api.enums.CarBusiType.valueOf(busiType_);
    return result == null ? com.xingyun.policy.api.enums.CarBusiType.UNRECOGNIZED : result;
  }

  public static final int TRANSFER_TIME_FIELD_NUMBER = 9;
  private int transferTime_;
  /**
   * <pre>
   * 接送机接送站unix秒时间(含日期).
   * </pre>
   *
   * <code>int32 transfer_time = 9;</code>
   */
  public int getTransferTime() {
    return transferTime_;
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
    if (orderFee_ != 0L) {
      output.writeInt64(3, orderFee_);
    }
    if (carType_ != com.xingyun.policy.api.enums.CarType.CAR_TYPE_EMPTY.getNumber()) {
      output.writeEnum(4, carType_);
    }
    if (departTime_ != 0) {
      output.writeInt32(5, departTime_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(6, longitude_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(7, latitude_);
    }
    if (busiType_ != com.xingyun.policy.api.enums.CarBusiType.CAR_BUSI_TYPE_EMPTY.getNumber()) {
      output.writeEnum(8, busiType_);
    }
    if (transferTime_ != 0) {
      output.writeInt32(9, transferTime_);
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
    if (orderFee_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, orderFee_);
    }
    if (carType_ != com.xingyun.policy.api.enums.CarType.CAR_TYPE_EMPTY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, carType_);
    }
    if (departTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, departTime_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, longitude_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, latitude_);
    }
    if (busiType_ != com.xingyun.policy.api.enums.CarBusiType.CAR_BUSI_TYPE_EMPTY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(8, busiType_);
    }
    if (transferTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, transferTime_);
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
    if (!(obj instanceof com.xingyun.policy.api.model.CarCheckItem)) {
      return super.equals(obj);
    }
    com.xingyun.policy.api.model.CarCheckItem other = (com.xingyun.policy.api.model.CarCheckItem) obj;

    boolean result = true;
    result = result && (getCuid()
        == other.getCuid());
    result = result && (getEid()
        == other.getEid());
    result = result && (getOrderFee()
        == other.getOrderFee());
    result = result && carType_ == other.carType_;
    result = result && (getDepartTime()
        == other.getDepartTime());
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && busiType_ == other.busiType_;
    result = result && (getTransferTime()
        == other.getTransferTime());
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
    hash = (37 * hash) + ORDER_FEE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderFee());
    hash = (37 * hash) + CAR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + carType_;
    hash = (37 * hash) + DEPART_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getDepartTime();
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + BUSI_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + busiType_;
    hash = (37 * hash) + TRANSFER_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTransferTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xingyun.policy.api.model.CarCheckItem parseFrom(
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
  public static Builder newBuilder(com.xingyun.policy.api.model.CarCheckItem prototype) {
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
   * 用车政策规则检查项数据封装.
   * </pre>
   *
   * Protobuf type {@code api.CarCheckItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CarCheckItem)
      com.xingyun.policy.api.model.CarCheckItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xingyun.policy.api.model.Model.internal_static_api_CarCheckItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xingyun.policy.api.model.Model.internal_static_api_CarCheckItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xingyun.policy.api.model.CarCheckItem.class, com.xingyun.policy.api.model.CarCheckItem.Builder.class);
    }

    // Construct using com.xingyun.policy.api.model.CarCheckItem.newBuilder()
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

      orderFee_ = 0L;

      carType_ = 0;

      departTime_ = 0;

      longitude_ = 0D;

      latitude_ = 0D;

      busiType_ = 0;

      transferTime_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xingyun.policy.api.model.Model.internal_static_api_CarCheckItem_descriptor;
    }

    public com.xingyun.policy.api.model.CarCheckItem getDefaultInstanceForType() {
      return com.xingyun.policy.api.model.CarCheckItem.getDefaultInstance();
    }

    public com.xingyun.policy.api.model.CarCheckItem build() {
      com.xingyun.policy.api.model.CarCheckItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xingyun.policy.api.model.CarCheckItem buildPartial() {
      com.xingyun.policy.api.model.CarCheckItem result = new com.xingyun.policy.api.model.CarCheckItem(this);
      result.cuid_ = cuid_;
      result.eid_ = eid_;
      result.orderFee_ = orderFee_;
      result.carType_ = carType_;
      result.departTime_ = departTime_;
      result.longitude_ = longitude_;
      result.latitude_ = latitude_;
      result.busiType_ = busiType_;
      result.transferTime_ = transferTime_;
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
      if (other instanceof com.xingyun.policy.api.model.CarCheckItem) {
        return mergeFrom((com.xingyun.policy.api.model.CarCheckItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xingyun.policy.api.model.CarCheckItem other) {
      if (other == com.xingyun.policy.api.model.CarCheckItem.getDefaultInstance()) return this;
      if (other.getCuid() != 0L) {
        setCuid(other.getCuid());
      }
      if (other.getEid() != 0L) {
        setEid(other.getEid());
      }
      if (other.getOrderFee() != 0L) {
        setOrderFee(other.getOrderFee());
      }
      if (other.carType_ != 0) {
        setCarTypeValue(other.getCarTypeValue());
      }
      if (other.getDepartTime() != 0) {
        setDepartTime(other.getDepartTime());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.busiType_ != 0) {
        setBusiTypeValue(other.getBusiTypeValue());
      }
      if (other.getTransferTime() != 0) {
        setTransferTime(other.getTransferTime());
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
      com.xingyun.policy.api.model.CarCheckItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xingyun.policy.api.model.CarCheckItem) e.getUnfinishedMessage();
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

    private long orderFee_ ;
    /**
     * <pre>
     * 订单金额：分.
     * </pre>
     *
     * <code>int64 order_fee = 3;</code>
     */
    public long getOrderFee() {
      return orderFee_;
    }
    /**
     * <pre>
     * 订单金额：分.
     * </pre>
     *
     * <code>int64 order_fee = 3;</code>
     */
    public Builder setOrderFee(long value) {
      
      orderFee_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 订单金额：分.
     * </pre>
     *
     * <code>int64 order_fee = 3;</code>
     */
    public Builder clearOrderFee() {
      
      orderFee_ = 0L;
      onChanged();
      return this;
    }

    private int carType_ = 0;
    /**
     * <pre>
     * 车型.
     * </pre>
     *
     * <code>.api.CarType car_type = 4;</code>
     */
    public int getCarTypeValue() {
      return carType_;
    }
    /**
     * <pre>
     * 车型.
     * </pre>
     *
     * <code>.api.CarType car_type = 4;</code>
     */
    public Builder setCarTypeValue(int value) {
      carType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 车型.
     * </pre>
     *
     * <code>.api.CarType car_type = 4;</code>
     */
    public com.xingyun.policy.api.enums.CarType getCarType() {
      com.xingyun.policy.api.enums.CarType result = com.xingyun.policy.api.enums.CarType.valueOf(carType_);
      return result == null ? com.xingyun.policy.api.enums.CarType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 车型.
     * </pre>
     *
     * <code>.api.CarType car_type = 4;</code>
     */
    public Builder setCarType(com.xingyun.policy.api.enums.CarType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      carType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 车型.
     * </pre>
     *
     * <code>.api.CarType car_type = 4;</code>
     */
    public Builder clearCarType() {
      
      carType_ = 0;
      onChanged();
      return this;
    }

    private int departTime_ ;
    /**
     * <pre>
     * 出发时间unix秒（含日期）
     * </pre>
     *
     * <code>int32 depart_time = 5;</code>
     */
    public int getDepartTime() {
      return departTime_;
    }
    /**
     * <pre>
     * 出发时间unix秒（含日期）
     * </pre>
     *
     * <code>int32 depart_time = 5;</code>
     */
    public Builder setDepartTime(int value) {
      
      departTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 出发时间unix秒（含日期）
     * </pre>
     *
     * <code>int32 depart_time = 5;</code>
     */
    public Builder clearDepartTime() {
      
      departTime_ = 0;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <pre>
     * (出发)经度.
     * </pre>
     *
     * <code>double longitude = 6;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <pre>
     * (出发)经度.
     * </pre>
     *
     * <code>double longitude = 6;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (出发)经度.
     * </pre>
     *
     * <code>double longitude = 6;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <pre>
     * (出发)纬度.
     * </pre>
     *
     * <code>double latitude = 7;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     * (出发)纬度.
     * </pre>
     *
     * <code>double latitude = 7;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (出发)纬度.
     * </pre>
     *
     * <code>double latitude = 7;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private int busiType_ = 0;
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.CarBusiType busi_type = 8;</code>
     */
    public int getBusiTypeValue() {
      return busiType_;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.CarBusiType busi_type = 8;</code>
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
     * <code>.api.CarBusiType busi_type = 8;</code>
     */
    public com.xingyun.policy.api.enums.CarBusiType getBusiType() {
      com.xingyun.policy.api.enums.CarBusiType result = com.xingyun.policy.api.enums.CarBusiType.valueOf(busiType_);
      return result == null ? com.xingyun.policy.api.enums.CarBusiType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 业务类型.
     * </pre>
     *
     * <code>.api.CarBusiType busi_type = 8;</code>
     */
    public Builder setBusiType(com.xingyun.policy.api.enums.CarBusiType value) {
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
     * <code>.api.CarBusiType busi_type = 8;</code>
     */
    public Builder clearBusiType() {
      
      busiType_ = 0;
      onChanged();
      return this;
    }

    private int transferTime_ ;
    /**
     * <pre>
     * 接送机接送站unix秒时间(含日期).
     * </pre>
     *
     * <code>int32 transfer_time = 9;</code>
     */
    public int getTransferTime() {
      return transferTime_;
    }
    /**
     * <pre>
     * 接送机接送站unix秒时间(含日期).
     * </pre>
     *
     * <code>int32 transfer_time = 9;</code>
     */
    public Builder setTransferTime(int value) {
      
      transferTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 接送机接送站unix秒时间(含日期).
     * </pre>
     *
     * <code>int32 transfer_time = 9;</code>
     */
    public Builder clearTransferTime() {
      
      transferTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.CarCheckItem)
  }

  // @@protoc_insertion_point(class_scope:api.CarCheckItem)
  private static final com.xingyun.policy.api.model.CarCheckItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xingyun.policy.api.model.CarCheckItem();
  }

  public static com.xingyun.policy.api.model.CarCheckItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CarCheckItem>
      PARSER = new com.google.protobuf.AbstractParser<CarCheckItem>() {
    public CarCheckItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CarCheckItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CarCheckItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CarCheckItem> getParserForType() {
    return PARSER;
  }

  public com.xingyun.policy.api.model.CarCheckItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

