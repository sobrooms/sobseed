// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OFEAIAMAIOH.proto

package emu.grasscutter.net.proto;

public final class OFEAIAMAIOHOuterClass {
  private OFEAIAMAIOHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OFEAIAMAIOHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OFEAIAMAIOH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 EGKHACMKHMD = 9;</code>
     * @return The eGKHACMKHMD.
     */
    int getEGKHACMKHMD();

    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Name: OFEAIAMAIOH
   * CmdId: 7957
   * </pre>
   *
   * Protobuf type {@code OFEAIAMAIOH}
   */
  public static final class OFEAIAMAIOH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OFEAIAMAIOH)
      OFEAIAMAIOHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OFEAIAMAIOH.newBuilder() to construct.
    private OFEAIAMAIOH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OFEAIAMAIOH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OFEAIAMAIOH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OFEAIAMAIOH(
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
            case 72: {

              eGKHACMKHMD_ = input.readUInt32();
              break;
            }
            case 104: {

              uid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.internal_static_OFEAIAMAIOH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.internal_static_OFEAIAMAIOH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.class, emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.Builder.class);
    }

    public static final int EGKHACMKHMD_FIELD_NUMBER = 9;
    private int eGKHACMKHMD_;
    /**
     * <code>uint32 EGKHACMKHMD = 9;</code>
     * @return The eGKHACMKHMD.
     */
    @java.lang.Override
    public int getEGKHACMKHMD() {
      return eGKHACMKHMD_;
    }

    public static final int UID_FIELD_NUMBER = 13;
    private int uid_;
    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (eGKHACMKHMD_ != 0) {
        output.writeUInt32(9, eGKHACMKHMD_);
      }
      if (uid_ != 0) {
        output.writeUInt32(13, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eGKHACMKHMD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, eGKHACMKHMD_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH other = (emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH) obj;

      if (getEGKHACMKHMD()
          != other.getEGKHACMKHMD()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + EGKHACMKHMD_FIELD_NUMBER;
      hash = (53 * hash) + getEGKHACMKHMD();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH prototype) {
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
     * Name: OFEAIAMAIOH
     * CmdId: 7957
     * </pre>
     *
     * Protobuf type {@code OFEAIAMAIOH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OFEAIAMAIOH)
        emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.internal_static_OFEAIAMAIOH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.internal_static_OFEAIAMAIOH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.class, emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.newBuilder()
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
        eGKHACMKHMD_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.internal_static_OFEAIAMAIOH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH build() {
        emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH buildPartial() {
        emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH result = new emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH(this);
        result.eGKHACMKHMD_ = eGKHACMKHMD_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH) {
          return mergeFrom((emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH other) {
        if (other == emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH.getDefaultInstance()) return this;
        if (other.getEGKHACMKHMD() != 0) {
          setEGKHACMKHMD(other.getEGKHACMKHMD());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int eGKHACMKHMD_ ;
      /**
       * <code>uint32 EGKHACMKHMD = 9;</code>
       * @return The eGKHACMKHMD.
       */
      @java.lang.Override
      public int getEGKHACMKHMD() {
        return eGKHACMKHMD_;
      }
      /**
       * <code>uint32 EGKHACMKHMD = 9;</code>
       * @param value The eGKHACMKHMD to set.
       * @return This builder for chaining.
       */
      public Builder setEGKHACMKHMD(int value) {
        
        eGKHACMKHMD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EGKHACMKHMD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEGKHACMKHMD() {
        
        eGKHACMKHMD_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 13;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OFEAIAMAIOH)
    }

    // @@protoc_insertion_point(class_scope:OFEAIAMAIOH)
    private static final emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH();
    }

    public static emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OFEAIAMAIOH>
        PARSER = new com.google.protobuf.AbstractParser<OFEAIAMAIOH>() {
      @java.lang.Override
      public OFEAIAMAIOH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OFEAIAMAIOH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OFEAIAMAIOH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OFEAIAMAIOH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OFEAIAMAIOHOuterClass.OFEAIAMAIOH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OFEAIAMAIOH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OFEAIAMAIOH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OFEAIAMAIOH.proto\"/\n\013OFEAIAMAIOH\022\023\n\013EG" +
      "KHACMKHMD\030\t \001(\r\022\013\n\003uid\030\r \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OFEAIAMAIOH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OFEAIAMAIOH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OFEAIAMAIOH_descriptor,
        new java.lang.String[] { "EGKHACMKHMD", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}