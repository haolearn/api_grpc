// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

public interface TrainCheckItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.TrainCheckItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户ID.
   * </pre>
   *
   * <code>int64 cuid = 1;</code>
   */
  long getCuid();

  /**
   * <pre>
   * 企业ID.
   * </pre>
   *
   * <code>int64 eid = 2;</code>
   */
  long getEid();

  /**
   * <pre>
   * 座位类型:（1:硬座 2：软座 3：硬卧 4：软卧 6：高级软卧  9：商务座 O：二等座 M：一等座）
   * </pre>
   *
   * <code>string seat_type = 3;</code>
   */
  java.lang.String getSeatType();
  /**
   * <pre>
   * 座位类型:（1:硬座 2：软座 3：硬卧 4：软卧 6：高级软卧  9：商务座 O：二等座 M：一等座）
   * </pre>
   *
   * <code>string seat_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getSeatTypeBytes();

  /**
   * <pre>
   * 出发时间unix秒.
   * </pre>
   *
   * <code>int32 depart_time = 4;</code>
   */
  int getDepartTime();

  /**
   * <pre>
   * 保险:分.
   * </pre>
   *
   * <code>int64 insurance = 5;</code>
   */
  long getInsurance();
}