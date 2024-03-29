// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGPhaseType.proto

package emu.grasscutter.net.proto;

public final class GCGPhaseTypeOuterClass {
  private GCGPhaseTypeOuterClass() {}
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
   * Name: DOINBFHLBHP
   * </pre>
   *
   * Protobuf enum {@code GCGPhaseType}
   */
  public enum GCGPhaseType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_PHASE_INVALID = 0;</code>
     */
    GCG_PHASE_INVALID(0),
    /**
     * <code>GCG_PHASE_START = 1;</code>
     */
    GCG_PHASE_START(1),
    /**
     * <code>GCG_PHASE_DRAW = 2;</code>
     */
    GCG_PHASE_DRAW(2),
    /**
     * <code>GCG_PHASE_ON_STAGE = 3;</code>
     */
    GCG_PHASE_ON_STAGE(3),
    /**
     * <code>GCG_PHASE_DICE = 4;</code>
     */
    GCG_PHASE_DICE(4),
    /**
     * <code>GCG_PHASE_MAIN = 5;</code>
     */
    GCG_PHASE_MAIN(5),
    /**
     * <code>GCG_PHASE_END = 6;</code>
     */
    GCG_PHASE_END(6),
    /**
     * <code>GCG_PHASE_DIE = 7;</code>
     */
    GCG_PHASE_DIE(7),
    /**
     * <code>GCG_PHASE_FIN = 8;</code>
     */
    GCG_PHASE_FIN(8),
    /**
     * <code>GCG_PHASE_PRE_MAIN = 9;</code>
     */
    GCG_PHASE_PRE_MAIN(9),
    /**
     * <code>GCG_PHASE_REROLL = 10;</code>
     */
    GCG_PHASE_REROLL(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_PHASE_INVALID = 0;</code>
     */
    public static final int GCG_PHASE_INVALID_VALUE = 0;
    /**
     * <code>GCG_PHASE_START = 1;</code>
     */
    public static final int GCG_PHASE_START_VALUE = 1;
    /**
     * <code>GCG_PHASE_DRAW = 2;</code>
     */
    public static final int GCG_PHASE_DRAW_VALUE = 2;
    /**
     * <code>GCG_PHASE_ON_STAGE = 3;</code>
     */
    public static final int GCG_PHASE_ON_STAGE_VALUE = 3;
    /**
     * <code>GCG_PHASE_DICE = 4;</code>
     */
    public static final int GCG_PHASE_DICE_VALUE = 4;
    /**
     * <code>GCG_PHASE_MAIN = 5;</code>
     */
    public static final int GCG_PHASE_MAIN_VALUE = 5;
    /**
     * <code>GCG_PHASE_END = 6;</code>
     */
    public static final int GCG_PHASE_END_VALUE = 6;
    /**
     * <code>GCG_PHASE_DIE = 7;</code>
     */
    public static final int GCG_PHASE_DIE_VALUE = 7;
    /**
     * <code>GCG_PHASE_FIN = 8;</code>
     */
    public static final int GCG_PHASE_FIN_VALUE = 8;
    /**
     * <code>GCG_PHASE_PRE_MAIN = 9;</code>
     */
    public static final int GCG_PHASE_PRE_MAIN_VALUE = 9;
    /**
     * <code>GCG_PHASE_REROLL = 10;</code>
     */
    public static final int GCG_PHASE_REROLL_VALUE = 10;


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
    public static GCGPhaseType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGPhaseType forNumber(int value) {
      switch (value) {
        case 0: return GCG_PHASE_INVALID;
        case 1: return GCG_PHASE_START;
        case 2: return GCG_PHASE_DRAW;
        case 3: return GCG_PHASE_ON_STAGE;
        case 4: return GCG_PHASE_DICE;
        case 5: return GCG_PHASE_MAIN;
        case 6: return GCG_PHASE_END;
        case 7: return GCG_PHASE_DIE;
        case 8: return GCG_PHASE_FIN;
        case 9: return GCG_PHASE_PRE_MAIN;
        case 10: return GCG_PHASE_REROLL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGPhaseType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGPhaseType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGPhaseType>() {
            public GCGPhaseType findValueByNumber(int number) {
              return GCGPhaseType.forNumber(number);
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
      return emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGPhaseType[] VALUES = values();

    public static GCGPhaseType valueOf(
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

    private GCGPhaseType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGPhaseType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GCGPhaseType.proto*\365\001\n\014GCGPhaseType\022\025\n" +
      "\021GCG_PHASE_INVALID\020\000\022\023\n\017GCG_PHASE_START\020" +
      "\001\022\022\n\016GCG_PHASE_DRAW\020\002\022\026\n\022GCG_PHASE_ON_ST" +
      "AGE\020\003\022\022\n\016GCG_PHASE_DICE\020\004\022\022\n\016GCG_PHASE_M" +
      "AIN\020\005\022\021\n\rGCG_PHASE_END\020\006\022\021\n\rGCG_PHASE_DI" +
      "E\020\007\022\021\n\rGCG_PHASE_FIN\020\010\022\026\n\022GCG_PHASE_PRE_" +
      "MAIN\020\t\022\024\n\020GCG_PHASE_REROLL\020\nB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
