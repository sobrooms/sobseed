// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtEntityType.proto

package emu.grasscutter.net.proto;

public final class ProtEntityTypeOuterClass {
  private ProtEntityTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: APHMIMMPMDI
   * </pre>
   *
   * Protobuf enum {@code ProtEntityType}
   */
  public enum ProtEntityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROT_ENTITY_NONE = 0;</code>
     */
    PROT_ENTITY_NONE(0),
    /**
     * <code>PROT_ENTITY_AVATAR = 1;</code>
     */
    PROT_ENTITY_AVATAR(1),
    /**
     * <code>PROT_ENTITY_MONSTER = 2;</code>
     */
    PROT_ENTITY_MONSTER(2),
    /**
     * <code>PROT_ENTITY_NPC = 3;</code>
     */
    PROT_ENTITY_NPC(3),
    /**
     * <code>PROT_ENTITY_GADGET = 4;</code>
     */
    PROT_ENTITY_GADGET(4),
    /**
     * <code>PROT_ENTITY_REGION = 5;</code>
     */
    PROT_ENTITY_REGION(5),
    /**
     * <code>PROT_ENTITY_WEAPON = 6;</code>
     */
    PROT_ENTITY_WEAPON(6),
    /**
     * <code>PROT_ENTITY_WEATHER = 7;</code>
     */
    PROT_ENTITY_WEATHER(7),
    /**
     * <code>PROT_ENTITY_SCENE = 8;</code>
     */
    PROT_ENTITY_SCENE(8),
    /**
     * <code>PROT_ENTITY_TEAM = 9;</code>
     */
    PROT_ENTITY_TEAM(9),
    /**
     * <code>PROT_ENTITY_MASSIVE_ENTITY = 10;</code>
     */
    PROT_ENTITY_MASSIVE_ENTITY(10),
    /**
     * <code>PROT_ENTITY_MP_LEVEL = 11;</code>
     */
    PROT_ENTITY_MP_LEVEL(11),
    /**
     * <code>PROT_ENTITY_PLAY_TEAM_ENTITY = 12;</code>
     */
    PROT_ENTITY_PLAY_TEAM_ENTITY(12),
    /**
     * <code>PROT_ENTITY_EYE_POINT = 13;</code>
     */
    PROT_ENTITY_EYE_POINT(13),
    /**
     * <code>PROT_ENTITY_MAX = 14;</code>
     */
    PROT_ENTITY_MAX(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PROT_ENTITY_NONE = 0;</code>
     */
    public static final int PROT_ENTITY_NONE_VALUE = 0;
    /**
     * <code>PROT_ENTITY_AVATAR = 1;</code>
     */
    public static final int PROT_ENTITY_AVATAR_VALUE = 1;
    /**
     * <code>PROT_ENTITY_MONSTER = 2;</code>
     */
    public static final int PROT_ENTITY_MONSTER_VALUE = 2;
    /**
     * <code>PROT_ENTITY_NPC = 3;</code>
     */
    public static final int PROT_ENTITY_NPC_VALUE = 3;
    /**
     * <code>PROT_ENTITY_GADGET = 4;</code>
     */
    public static final int PROT_ENTITY_GADGET_VALUE = 4;
    /**
     * <code>PROT_ENTITY_REGION = 5;</code>
     */
    public static final int PROT_ENTITY_REGION_VALUE = 5;
    /**
     * <code>PROT_ENTITY_WEAPON = 6;</code>
     */
    public static final int PROT_ENTITY_WEAPON_VALUE = 6;
    /**
     * <code>PROT_ENTITY_WEATHER = 7;</code>
     */
    public static final int PROT_ENTITY_WEATHER_VALUE = 7;
    /**
     * <code>PROT_ENTITY_SCENE = 8;</code>
     */
    public static final int PROT_ENTITY_SCENE_VALUE = 8;
    /**
     * <code>PROT_ENTITY_TEAM = 9;</code>
     */
    public static final int PROT_ENTITY_TEAM_VALUE = 9;
    /**
     * <code>PROT_ENTITY_MASSIVE_ENTITY = 10;</code>
     */
    public static final int PROT_ENTITY_MASSIVE_ENTITY_VALUE = 10;
    /**
     * <code>PROT_ENTITY_MP_LEVEL = 11;</code>
     */
    public static final int PROT_ENTITY_MP_LEVEL_VALUE = 11;
    /**
     * <code>PROT_ENTITY_PLAY_TEAM_ENTITY = 12;</code>
     */
    public static final int PROT_ENTITY_PLAY_TEAM_ENTITY_VALUE = 12;
    /**
     * <code>PROT_ENTITY_EYE_POINT = 13;</code>
     */
    public static final int PROT_ENTITY_EYE_POINT_VALUE = 13;
    /**
     * <code>PROT_ENTITY_MAX = 14;</code>
     */
    public static final int PROT_ENTITY_MAX_VALUE = 14;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProtEntityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtEntityType forNumber(int value) {
      switch (value) {
        case 0: return PROT_ENTITY_NONE;
        case 1: return PROT_ENTITY_AVATAR;
        case 2: return PROT_ENTITY_MONSTER;
        case 3: return PROT_ENTITY_NPC;
        case 4: return PROT_ENTITY_GADGET;
        case 5: return PROT_ENTITY_REGION;
        case 6: return PROT_ENTITY_WEAPON;
        case 7: return PROT_ENTITY_WEATHER;
        case 8: return PROT_ENTITY_SCENE;
        case 9: return PROT_ENTITY_TEAM;
        case 10: return PROT_ENTITY_MASSIVE_ENTITY;
        case 11: return PROT_ENTITY_MP_LEVEL;
        case 12: return PROT_ENTITY_PLAY_TEAM_ENTITY;
        case 13: return PROT_ENTITY_EYE_POINT;
        case 14: return PROT_ENTITY_MAX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtEntityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>() {
            public ProtEntityType findValueByNumber(int number) {
              return ProtEntityType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ProtEntityTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProtEntityType[] VALUES = values();

    public static ProtEntityType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProtEntityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ProtEntityType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ProtEntityType.proto*\206\003\n\016ProtEntityTyp" +
      "e\022\024\n\020PROT_ENTITY_NONE\020\000\022\026\n\022PROT_ENTITY_A" +
      "VATAR\020\001\022\027\n\023PROT_ENTITY_MONSTER\020\002\022\023\n\017PROT" +
      "_ENTITY_NPC\020\003\022\026\n\022PROT_ENTITY_GADGET\020\004\022\026\n" +
      "\022PROT_ENTITY_REGION\020\005\022\026\n\022PROT_ENTITY_WEA" +
      "PON\020\006\022\027\n\023PROT_ENTITY_WEATHER\020\007\022\025\n\021PROT_E" +
      "NTITY_SCENE\020\010\022\024\n\020PROT_ENTITY_TEAM\020\t\022\036\n\032P" +
      "ROT_ENTITY_MASSIVE_ENTITY\020\n\022\030\n\024PROT_ENTI" +
      "TY_MP_LEVEL\020\013\022 \n\034PROT_ENTITY_PLAY_TEAM_E" +
      "NTITY\020\014\022\031\n\025PROT_ENTITY_EYE_POINT\020\r\022\023\n\017PR" +
      "OT_ENTITY_MAX\020\016B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
