// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonDieOptionRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonDieOptionRspOuterClass {
  private DungeonDieOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonDieOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonDieOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerDieOption die_option = 6;</code>
     * @return The enum numeric value on the wire for dieOption.
     */
    int getDieOptionValue();
    /**
     * <code>.PlayerDieOption die_option = 6;</code>
     * @return The dieOption.
     */
    emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 revive_count = 1;</code>
     * @return The reviveCount.
     */
    int getReviveCount();
  }
  /**
   * <pre>
   * Name: CPEFIENCDPH
   * CmdId: 991
   * </pre>
   *
   * Protobuf type {@code DungeonDieOptionRsp}
   */
  public static final class DungeonDieOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonDieOptionRsp)
      DungeonDieOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonDieOptionRsp.newBuilder() to construct.
    private DungeonDieOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonDieOptionRsp() {
      dieOption_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonDieOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonDieOptionRsp(
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

              reviveCount_ = input.readUInt32();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              dieOption_ = rawValue;
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.internal_static_DungeonDieOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.internal_static_DungeonDieOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.class, emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.Builder.class);
    }

    public static final int DIE_OPTION_FIELD_NUMBER = 6;
    private int dieOption_;
    /**
     * <code>.PlayerDieOption die_option = 6;</code>
     * @return The enum numeric value on the wire for dieOption.
     */
    @java.lang.Override public int getDieOptionValue() {
      return dieOption_;
    }
    /**
     * <code>.PlayerDieOption die_option = 6;</code>
     * @return The dieOption.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption result = emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.valueOf(dieOption_);
      return result == null ? emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int REVIVE_COUNT_FIELD_NUMBER = 1;
    private int reviveCount_;
    /**
     * <code>uint32 revive_count = 1;</code>
     * @return The reviveCount.
     */
    @java.lang.Override
    public int getReviveCount() {
      return reviveCount_;
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
      if (reviveCount_ != 0) {
        output.writeUInt32(1, reviveCount_);
      }
      if (dieOption_ != emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.DIE_OPT_NONE.getNumber()) {
        output.writeEnum(6, dieOption_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reviveCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, reviveCount_);
      }
      if (dieOption_ != emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.DIE_OPT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, dieOption_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp other = (emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp) obj;

      if (dieOption_ != other.dieOption_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getReviveCount()
          != other.getReviveCount()) return false;
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
      hash = (37 * hash) + DIE_OPTION_FIELD_NUMBER;
      hash = (53 * hash) + dieOption_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + REVIVE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getReviveCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp prototype) {
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
     * Name: CPEFIENCDPH
     * CmdId: 991
     * </pre>
     *
     * Protobuf type {@code DungeonDieOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonDieOptionRsp)
        emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.internal_static_DungeonDieOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.internal_static_DungeonDieOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.class, emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.newBuilder()
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
        dieOption_ = 0;

        retcode_ = 0;

        reviveCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.internal_static_DungeonDieOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp build() {
        emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp buildPartial() {
        emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp result = new emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp(this);
        result.dieOption_ = dieOption_;
        result.retcode_ = retcode_;
        result.reviveCount_ = reviveCount_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp other) {
        if (other == emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp.getDefaultInstance()) return this;
        if (other.dieOption_ != 0) {
          setDieOptionValue(other.getDieOptionValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getReviveCount() != 0) {
          setReviveCount(other.getReviveCount());
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
        emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dieOption_ = 0;
      /**
       * <code>.PlayerDieOption die_option = 6;</code>
       * @return The enum numeric value on the wire for dieOption.
       */
      @java.lang.Override public int getDieOptionValue() {
        return dieOption_;
      }
      /**
       * <code>.PlayerDieOption die_option = 6;</code>
       * @param value The enum numeric value on the wire for dieOption to set.
       * @return This builder for chaining.
       */
      public Builder setDieOptionValue(int value) {
        
        dieOption_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieOption die_option = 6;</code>
       * @return The dieOption.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption getDieOption() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption result = emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.valueOf(dieOption_);
        return result == null ? emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerDieOption die_option = 6;</code>
       * @param value The dieOption to set.
       * @return This builder for chaining.
       */
      public Builder setDieOption(emu.grasscutter.net.proto.PlayerDieOptionOuterClass.PlayerDieOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dieOption_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerDieOption die_option = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieOption() {
        
        dieOption_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int reviveCount_ ;
      /**
       * <code>uint32 revive_count = 1;</code>
       * @return The reviveCount.
       */
      @java.lang.Override
      public int getReviveCount() {
        return reviveCount_;
      }
      /**
       * <code>uint32 revive_count = 1;</code>
       * @param value The reviveCount to set.
       * @return This builder for chaining.
       */
      public Builder setReviveCount(int value) {
        
        reviveCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 revive_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReviveCount() {
        
        reviveCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonDieOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonDieOptionRsp)
    private static final emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp();
    }

    public static emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonDieOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonDieOptionRsp>() {
      @java.lang.Override
      public DungeonDieOptionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonDieOptionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonDieOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonDieOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonDieOptionRspOuterClass.DungeonDieOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonDieOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonDieOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DungeonDieOptionRsp.proto\032\025PlayerDieOp" +
      "tion.proto\"b\n\023DungeonDieOptionRsp\022$\n\ndie" +
      "_option\030\006 \001(\0162\020.PlayerDieOption\022\017\n\007retco" +
      "de\030\007 \001(\005\022\024\n\014revive_count\030\001 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerDieOptionOuterClass.getDescriptor(),
        });
    internal_static_DungeonDieOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonDieOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonDieOptionRsp_descriptor,
        new java.lang.String[] { "DieOption", "Retcode", "ReviveCount", });
    emu.grasscutter.net.proto.PlayerDieOptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
