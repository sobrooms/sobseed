// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSetBlueprintSlotOptionRsp.proto

package emu.grasscutter.net.proto;

public final class HomeSetBlueprintSlotOptionRspOuterClass {
  private HomeSetBlueprintSlotOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSetBlueprintSlotOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSetBlueprintSlotOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_allow_copy = 4;</code>
     * @return The isAllowCopy.
     */
    boolean getIsAllowCopy();

    /**
     * <code>uint32 slot_id = 12;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: KDGBNKKPMGJ
   * CmdId: 4855
   * </pre>
   *
   * Protobuf type {@code HomeSetBlueprintSlotOptionRsp}
   */
  public static final class HomeSetBlueprintSlotOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSetBlueprintSlotOptionRsp)
      HomeSetBlueprintSlotOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSetBlueprintSlotOptionRsp.newBuilder() to construct.
    private HomeSetBlueprintSlotOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSetBlueprintSlotOptionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSetBlueprintSlotOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSetBlueprintSlotOptionRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              isAllowCopy_ = input.readBool();
              break;
            }
            case 96: {

              slotId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.class, emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.Builder.class);
    }

    public static final int IS_ALLOW_COPY_FIELD_NUMBER = 4;
    private boolean isAllowCopy_;
    /**
     * <code>bool is_allow_copy = 4;</code>
     * @return The isAllowCopy.
     */
    @java.lang.Override
    public boolean getIsAllowCopy() {
      return isAllowCopy_;
    }

    public static final int SLOT_ID_FIELD_NUMBER = 12;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 12;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (isAllowCopy_ != false) {
        output.writeBool(4, isAllowCopy_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(12, slotId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (isAllowCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAllowCopy_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, slotId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp other = (emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp) obj;

      if (getIsAllowCopy()
          != other.getIsAllowCopy()) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_ALLOW_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowCopy());
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Name: KDGBNKKPMGJ
     * CmdId: 4855
     * </pre>
     *
     * Protobuf type {@code HomeSetBlueprintSlotOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSetBlueprintSlotOptionRsp)
        emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.class, emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAllowCopy_ = false;

        slotId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp build() {
        emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp buildPartial() {
        emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp result = new emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp(this);
        result.isAllowCopy_ = isAllowCopy_;
        result.slotId_ = slotId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp other) {
        if (other == emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.getDefaultInstance()) return this;
        if (other.getIsAllowCopy() != false) {
          setIsAllowCopy(other.getIsAllowCopy());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAllowCopy_ ;
      /**
       * <code>bool is_allow_copy = 4;</code>
       * @return The isAllowCopy.
       */
      @java.lang.Override
      public boolean getIsAllowCopy() {
        return isAllowCopy_;
      }
      /**
       * <code>bool is_allow_copy = 4;</code>
       * @param value The isAllowCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowCopy(boolean value) {
        
        isAllowCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_copy = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowCopy() {
        
        isAllowCopy_ = false;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 12;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 12;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeSetBlueprintSlotOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSetBlueprintSlotOptionRsp)
    private static final emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp();
    }

    public static emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSetBlueprintSlotOptionRsp>() {
      @java.lang.Override
      public HomeSetBlueprintSlotOptionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSetBlueprintSlotOptionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeSetBlueprintSlotOptionRsp.proto\"X\n" +
      "\035HomeSetBlueprintSlotOptionRsp\022\025\n\ris_all" +
      "ow_copy\030\004 \001(\010\022\017\n\007slot_id\030\014 \001(\r\022\017\n\007retcod" +
      "e\030\001 \001(\005B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSetBlueprintSlotOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSetBlueprintSlotOptionRsp_descriptor,
        new java.lang.String[] { "IsAllowCopy", "SlotId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
