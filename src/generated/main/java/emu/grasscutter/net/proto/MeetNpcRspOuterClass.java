// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MeetNpcRsp.proto

package emu.grasscutter.net.proto;

public final class MeetNpcRspOuterClass {
  private MeetNpcRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MeetNpcRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MeetNpcRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_first_met_id = 15;</code>
     * @return The npcFirstMetId.
     */
    int getNpcFirstMetId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: BHKAGDGJMGD
   * CmdId: 582
   * </pre>
   *
   * Protobuf type {@code MeetNpcRsp}
   */
  public static final class MeetNpcRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MeetNpcRsp)
      MeetNpcRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MeetNpcRsp.newBuilder() to construct.
    private MeetNpcRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MeetNpcRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MeetNpcRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MeetNpcRsp(
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
            case 120: {

              npcFirstMetId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MeetNpcRspOuterClass.internal_static_MeetNpcRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MeetNpcRspOuterClass.internal_static_MeetNpcRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.class, emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.Builder.class);
    }

    public static final int NPC_FIRST_MET_ID_FIELD_NUMBER = 15;
    private int npcFirstMetId_;
    /**
     * <code>uint32 npc_first_met_id = 15;</code>
     * @return The npcFirstMetId.
     */
    @java.lang.Override
    public int getNpcFirstMetId() {
      return npcFirstMetId_;
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
      if (npcFirstMetId_ != 0) {
        output.writeUInt32(15, npcFirstMetId_);
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
      if (npcFirstMetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, npcFirstMetId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp other = (emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp) obj;

      if (getNpcFirstMetId()
          != other.getNpcFirstMetId()) return false;
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
      hash = (37 * hash) + NPC_FIRST_MET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcFirstMetId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp prototype) {
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
     * Name: BHKAGDGJMGD
     * CmdId: 582
     * </pre>
     *
     * Protobuf type {@code MeetNpcRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MeetNpcRsp)
        emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MeetNpcRspOuterClass.internal_static_MeetNpcRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MeetNpcRspOuterClass.internal_static_MeetNpcRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.class, emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.newBuilder()
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
        npcFirstMetId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MeetNpcRspOuterClass.internal_static_MeetNpcRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp build() {
        emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp buildPartial() {
        emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp result = new emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp(this);
        result.npcFirstMetId_ = npcFirstMetId_;
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
        if (other instanceof emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp) {
          return mergeFrom((emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp other) {
        if (other == emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp.getDefaultInstance()) return this;
        if (other.getNpcFirstMetId() != 0) {
          setNpcFirstMetId(other.getNpcFirstMetId());
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
        emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int npcFirstMetId_ ;
      /**
       * <code>uint32 npc_first_met_id = 15;</code>
       * @return The npcFirstMetId.
       */
      @java.lang.Override
      public int getNpcFirstMetId() {
        return npcFirstMetId_;
      }
      /**
       * <code>uint32 npc_first_met_id = 15;</code>
       * @param value The npcFirstMetId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcFirstMetId(int value) {
        
        npcFirstMetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_first_met_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcFirstMetId() {
        
        npcFirstMetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MeetNpcRsp)
    }

    // @@protoc_insertion_point(class_scope:MeetNpcRsp)
    private static final emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp();
    }

    public static emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MeetNpcRsp>
        PARSER = new com.google.protobuf.AbstractParser<MeetNpcRsp>() {
      @java.lang.Override
      public MeetNpcRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MeetNpcRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MeetNpcRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MeetNpcRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MeetNpcRspOuterClass.MeetNpcRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MeetNpcRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MeetNpcRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MeetNpcRsp.proto\"7\n\nMeetNpcRsp\022\030\n\020npc_" +
      "first_met_id\030\017 \001(\r\022\017\n\007retcode\030\001 \001(\005B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MeetNpcRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MeetNpcRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MeetNpcRsp_descriptor,
        new java.lang.String[] { "NpcFirstMetId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
