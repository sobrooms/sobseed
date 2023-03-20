// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerIpRegionNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerIpRegionNotifyOuterClass {
  private PlayerIpRegionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerIpRegionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerIpRegionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string ip_code = 9;</code>
     * @return The ipCode.
     */
    java.lang.String getIpCode();
    /**
     * <code>string ip_code = 9;</code>
     * @return The bytes for ipCode.
     */
    com.google.protobuf.ByteString
        getIpCodeBytes();
  }
  /**
   * <pre>
   * Name: JCOFPPDEDON
   * CmdId: 151
   * </pre>
   *
   * Protobuf type {@code PlayerIpRegionNotify}
   */
  public static final class PlayerIpRegionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerIpRegionNotify)
      PlayerIpRegionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerIpRegionNotify.newBuilder() to construct.
    private PlayerIpRegionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerIpRegionNotify() {
      ipCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerIpRegionNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerIpRegionNotify(
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
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();

              ipCode_ = s;
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
      return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.internal_static_PlayerIpRegionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.internal_static_PlayerIpRegionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.class, emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.Builder.class);
    }

    public static final int IP_CODE_FIELD_NUMBER = 9;
    private volatile java.lang.Object ipCode_;
    /**
     * <code>string ip_code = 9;</code>
     * @return The ipCode.
     */
    @java.lang.Override
    public java.lang.String getIpCode() {
      java.lang.Object ref = ipCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipCode_ = s;
        return s;
      }
    }
    /**
     * <code>string ip_code = 9;</code>
     * @return The bytes for ipCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIpCodeBytes() {
      java.lang.Object ref = ipCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getIpCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, ipCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIpCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, ipCode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify other = (emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify) obj;

      if (!getIpCode()
          .equals(other.getIpCode())) return false;
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
      hash = (37 * hash) + IP_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getIpCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify prototype) {
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
     * Name: JCOFPPDEDON
     * CmdId: 151
     * </pre>
     *
     * Protobuf type {@code PlayerIpRegionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerIpRegionNotify)
        emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.internal_static_PlayerIpRegionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.internal_static_PlayerIpRegionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.class, emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.newBuilder()
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
        ipCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.internal_static_PlayerIpRegionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify build() {
        emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify result = new emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify(this);
        result.ipCode_ = ipCode_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify.getDefaultInstance()) return this;
        if (!other.getIpCode().isEmpty()) {
          ipCode_ = other.ipCode_;
          onChanged();
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
        emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object ipCode_ = "";
      /**
       * <code>string ip_code = 9;</code>
       * @return The ipCode.
       */
      public java.lang.String getIpCode() {
        java.lang.Object ref = ipCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ipCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ip_code = 9;</code>
       * @return The bytes for ipCode.
       */
      public com.google.protobuf.ByteString
          getIpCodeBytes() {
        java.lang.Object ref = ipCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ip_code = 9;</code>
       * @param value The ipCode to set.
       * @return This builder for chaining.
       */
      public Builder setIpCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ipCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string ip_code = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIpCode() {
        
        ipCode_ = getDefaultInstance().getIpCode();
        onChanged();
        return this;
      }
      /**
       * <code>string ip_code = 9;</code>
       * @param value The bytes for ipCode to set.
       * @return This builder for chaining.
       */
      public Builder setIpCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ipCode_ = value;
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


      // @@protoc_insertion_point(builder_scope:PlayerIpRegionNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerIpRegionNotify)
    private static final emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify();
    }

    public static emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerIpRegionNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerIpRegionNotify>() {
      @java.lang.Override
      public PlayerIpRegionNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerIpRegionNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerIpRegionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerIpRegionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerIpRegionNotifyOuterClass.PlayerIpRegionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerIpRegionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerIpRegionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerIpRegionNotify.proto\"\'\n\024PlayerIp" +
      "RegionNotify\022\017\n\007ip_code\030\t \001(\tB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerIpRegionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerIpRegionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerIpRegionNotify_descriptor,
        new java.lang.String[] { "IpCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
