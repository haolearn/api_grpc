// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.xingyun.policy.api.enums;

public final class Enums {
  private Enums() {}
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
      "\n\013enums.proto\022\003api*Q\n\006Status\022\020\n\014STATUS_E" +
      "MPTY\020\000\022\022\n\016STATUS_SUCCESS\020\001\022\017\n\013STATUS_FAI" +
      "L\020\002\022\020\n\014STATUS_ERROR\020\003*\236\001\n\010BusiType\022\023\n\017BU" +
      "SI_TYPE_EMPTY\020\000\022\021\n\rBUSI_TYPE_CAR\020\001\022\024\n\020BU" +
      "SI_TYPE_FLIGHT\020\002\022\023\n\017BUSI_TYPE_TRAIN\020\003\022\023\n" +
      "\017BUSI_TYPE_HOTEL\020\004\022\027\n\023BUSI_TYPE_BUSTICKE" +
      "T\020\007\022\021\n\rBUSI_TYPE_PAY\020\010*v\n\007CarType\022\022\n\016CAR" +
      "_TYPE_EMPTY\020\000\022\025\n\021CAR_TYPE_ECONOMIC\020\001\022\024\n\020" +
      "CAR_TYPE_COMFORT\020\002\022\025\n\021CAR_TYPE_BUSINESS\020" +
      "\003\022\023\n\017CAR_TYPE_LUXURY\020\004*\350\001\n\013CarBusiType\022\027" +
      "\n\023CAR_BUSI_TYPE_EMPTY\020\000\022\035\n\031CAR_BUSI_TYPE" +
      "_IMMEDIATELY\020\001\022\036\n\032CAR_BUSI_TYPE_AIRPORT_" +
      "SEND\020\002\022!\n\035CAR_BUSI_TYPE_AIRPORT_RECEIVE\020" +
      "\005\022\031\n\025CAR_BUSI_TYPE_RESERVE\020\004\022\037\n\033CAR_BUSI" +
      "_TYPE_STATIION_SEND\020\010\022\"\n\036CAR_BUSI_TYPE_S" +
      "TATIION_RECEIVE\020\013*h\n\017LocationSrcType\022\033\n\027" +
      "LOCATION_SRC_TYPE_EMPTY\020\000\022\034\n\030LOCATION_SR" +
      "C_TYPE_DEPART\020\001\022\032\n\026LOCATION_SRC_TYPE_DES" +
      "T\020\002*r\n\010CityType\022\031\n\025CITY_TYPE_LEVEL_EMPTY" +
      "\020\000\022\027\n\023CITY_TYPE_LEVEL_ONE\020\001\022\027\n\023CITY_TYPE" +
      "_LEVEL_TWO\020\002\022\031\n\025CITY_TYPE_LEVEL_THREE\020\003B" +
      " \n\034com.xingyun.policy.api.enumsP\001b\006proto" +
      "3"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
