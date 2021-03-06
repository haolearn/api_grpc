// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

public interface TrainRuleDetailItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.TrainRuleDetailItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 火车票规则基本信息.
   * </pre>
   *
   * <code>.api.TrainRuleItem.SettingItem settings = 1;</code>
   */
  boolean hasSettings();
  /**
   * <pre>
   * 火车票规则基本信息.
   * </pre>
   *
   * <code>.api.TrainRuleItem.SettingItem settings = 1;</code>
   */
  com.xingyun.policy.api.model.TrainRuleItem.SettingItem getSettings();
  /**
   * <pre>
   * 火车票规则基本信息.
   * </pre>
   *
   * <code>.api.TrainRuleItem.SettingItem settings = 1;</code>
   */
  com.xingyun.policy.api.model.TrainRuleItem.SettingItemOrBuilder getSettingsOrBuilder();

  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 2;</code>
   */
  java.util.List<com.xingyun.policy.api.model.TimeItem> 
      getTimesList();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 2;</code>
   */
  com.xingyun.policy.api.model.TimeItem getTimes(int index);
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 2;</code>
   */
  int getTimesCount();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 2;</code>
   */
  java.util.List<? extends com.xingyun.policy.api.model.TimeItemOrBuilder> 
      getTimesOrBuilderList();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 2;</code>
   */
  com.xingyun.policy.api.model.TimeItemOrBuilder getTimesOrBuilder(
      int index);

  /**
   * <pre>
   * 是否可用 (0:不可用 1:可用有政策 2:可用无政策).
   * </pre>
   *
   * <code>int32 can_use = 10;</code>
   */
  int getCanUse();
}
