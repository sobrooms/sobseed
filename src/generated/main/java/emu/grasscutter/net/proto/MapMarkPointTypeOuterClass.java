// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapMarkPointType.proto

package emu.grasscutter.net.proto;

public final class MapMarkPointTypeOuterClass {
  private MapMarkPointTypeOuterClass() {}
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
   * Name: KCEHIDGIEEF
   * </pre>
   *
   * Protobuf enum {@code MapMarkPointType}
   */
  public enum MapMarkPointType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NPC = 0;</code>
     */
    NPC(0),
    /**
     * <code>QUEST = 1;</code>
     */
    QUEST(1),
    /**
     * <code>SPECIAL = 2;</code>
     */
    SPECIAL(2),
    /**
     * <code>MINE = 3;</code>
     */
    MINE(3),
    /**
     * <code>COLLECTION = 4;</code>
     */
    COLLECTION(4),
    /**
     * <code>MONSTER = 5;</code>
     */
    MONSTER(5),
    /**
     * <code>FISH_POOL = 6;</code>
     */
    FISH_POOL(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NPC = 0;</code>
     */
    public static final int NPC_VALUE = 0;
    /**
     * <code>QUEST = 1;</code>
     */
    public static final int QUEST_VALUE = 1;
    /**
     * <code>SPECIAL = 2;</code>
     */
    public static final int SPECIAL_VALUE = 2;
    /**
     * <code>MINE = 3;</code>
     */
    public static final int MINE_VALUE = 3;
    /**
     * <code>COLLECTION = 4;</code>
     */
    public static final int COLLECTION_VALUE = 4;
    /**
     * <code>MONSTER = 5;</code>
     */
    public static final int MONSTER_VALUE = 5;
    /**
     * <code>FISH_POOL = 6;</code>
     */
    public static final int FISH_POOL_VALUE = 6;


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
    public static MapMarkPointType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MapMarkPointType forNumber(int value) {
      switch (value) {
        case 0: return NPC;
        case 1: return QUEST;
        case 2: return SPECIAL;
        case 3: return MINE;
        case 4: return COLLECTION;
        case 5: return MONSTER;
        case 6: return FISH_POOL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MapMarkPointType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MapMarkPointType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MapMarkPointType>() {
            public MapMarkPointType findValueByNumber(int number) {
              return MapMarkPointType.forNumber(number);
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
      return emu.grasscutter.net.proto.MapMarkPointTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MapMarkPointType[] VALUES = values();

    public static MapMarkPointType valueOf(
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

    private MapMarkPointType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MapMarkPointType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MapMarkPointType.proto*i\n\020MapMarkPoint" +
      "Type\022\007\n\003NPC\020\000\022\t\n\005QUEST\020\001\022\013\n\007SPECIAL\020\002\022\010\n" +
      "\004MINE\020\003\022\016\n\nCOLLECTION\020\004\022\013\n\007MONSTER\020\005\022\r\n\t" +
      "FISH_POOL\020\006B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
