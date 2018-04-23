// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.xingyun.policy.api.model;

public interface RoleItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.RoleItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 企业编号.
   * </pre>
   *
   * <code>int64 eid = 1;</code>
   */
  long getEid();

  /**
   * <pre>
   * 部门编号.
   * </pre>
   *
   * <code>int64 department_id = 2;</code>
   */
  long getDepartmentId();

  /**
   * <pre>
   * 角色编号.
   * </pre>
   *
   * <code>int64 role_id = 3;</code>
   */
  long getRoleId();

  /**
   * <pre>
   * 角色名称.
   * </pre>
   *
   * <code>string role_name = 4;</code>
   */
  java.lang.String getRoleName();
  /**
   * <pre>
   * 角色名称.
   * </pre>
   *
   * <code>string role_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getRoleNameBytes();

  /**
   * <pre>
   * 规则uuid
   * </pre>
   *
   * <code>string uuid = 5;</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * 规则uuid
   * </pre>
   *
   * <code>string uuid = 5;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}
