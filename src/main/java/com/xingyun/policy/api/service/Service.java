// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.xingyun.policy.api.service;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\003api\032\rrequest.proto\032\016res" +
      "ponse.proto2\364\002\n\rPolicyService\022/\n\005check\022\021" +
      ".api.CheckRequest\032\023.api.PolicyResponse\0223" +
      "\n\nlistPolicy\022\020.api.ListRequest\032\023.api.Pol" +
      "icyResponse\0229\n\nlistDetail\022\026.api.ListDeta" +
      "ilRequest\032\023.api.PolicyResponse\022:\n\016checkS" +
      "treaming\022\021.api.CheckRequest\032\023.api.Policy" +
      "Response(\001\022>\n\023listPolicyStreaming\022\020.api." +
      "ListRequest\032\023.api.PolicyResponse0\001\022F\n\023li" +
      "stDetailStreaming\022\026.api.ListDetailReques" +
      "t\032\023.api.PolicyResponse(\0010\001B\"\n\036com.xingyu" +
      "n.policy.api.serviceP\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xingyun.policy.api.dto.request.Request.getDescriptor(),
          com.xingyun.policy.api.dto.response.Response.getDescriptor(),
        }, assigner);
    com.xingyun.policy.api.dto.request.Request.getDescriptor();
    com.xingyun.policy.api.dto.response.Response.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}