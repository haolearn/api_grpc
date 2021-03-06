// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

public interface CarRuleDetailItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.CarRuleDetailItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用车规则基本信息.
   * </pre>
   *
   * <code>.api.CarRuleItem.SettingItem settings = 1;</code>
   */
  boolean hasSettings();
  /**
   * <pre>
   * 用车规则基本信息.
   * </pre>
   *
   * <code>.api.CarRuleItem.SettingItem settings = 1;</code>
   */
  com.xingyun.policy.api.model.CarRuleItem.SettingItem getSettings();
  /**
   * <pre>
   * 用车规则基本信息.
   * </pre>
   *
   * <code>.api.CarRuleItem.SettingItem settings = 1;</code>
   */
  com.xingyun.policy.api.model.CarRuleItem.SettingItemOrBuilder getSettingsOrBuilder();

  /**
   * <pre>
   * 是否可用 (0:不可用 1:可用有政策 2:可用无政策).
   * </pre>
   *
   * <code>int32 can_use = 10;</code>
   */
  int getCanUse();

  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 11;</code>
   */
  java.util.List<com.xingyun.policy.api.model.TimeItem> 
      getTimesList();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 11;</code>
   */
  com.xingyun.policy.api.model.TimeItem getTimes(int index);
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 11;</code>
   */
  int getTimesCount();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 11;</code>
   */
  java.util.List<? extends com.xingyun.policy.api.model.TimeItemOrBuilder> 
      getTimesOrBuilderList();
  /**
   * <pre>
   * 时间限制信息.
   * </pre>
   *
   * <code>repeated .api.TimeItem times = 11;</code>
   */
  com.xingyun.policy.api.model.TimeItemOrBuilder getTimesOrBuilder(
      int index);

  /**
   * <code>repeated .api.LocationItem locations = 13;</code>
   */
  java.util.List<com.xingyun.policy.api.model.LocationItem> 
      getLocationsList();
  /**
   * <code>repeated .api.LocationItem locations = 13;</code>
   */
  com.xingyun.policy.api.model.LocationItem getLocations(int index);
  /**
   * <code>repeated .api.LocationItem locations = 13;</code>
   */
  int getLocationsCount();
  /**
   * <code>repeated .api.LocationItem locations = 13;</code>
   */
  java.util.List<? extends com.xingyun.policy.api.model.LocationItemOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <code>repeated .api.LocationItem locations = 13;</code>
   */
  com.xingyun.policy.api.model.LocationItemOrBuilder getLocationsOrBuilder(
      int index);
}
