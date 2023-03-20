// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingDeliverItemRsp.proto

package emu.grasscutter.net.proto;

public final class MiracleRingDeliverItemRspOuterClass {
  private MiracleRingDeliverItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingDeliverItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingDeliverItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 2;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 gadget_id = 6;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>.InterOpType op_type = 8;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.InterOpType op_type = 8;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType();

    /**
     * <code>.InteractType interact_type = 7;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    int getInteractTypeValue();
    /**
     * <code>.InteractType interact_type = 7;</code>
     * @return The interactType.
     */
    emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType getInteractType();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: PDCEJKGIPPA
   * CmdId: 5232
   * </pre>
   *
   * Protobuf type {@code MiracleRingDeliverItemRsp}
   */
  public static final class MiracleRingDeliverItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingDeliverItemRsp)
      MiracleRingDeliverItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingDeliverItemRsp.newBuilder() to construct.
    private MiracleRingDeliverItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingDeliverItemRsp() {
      opType_ = 0;
      interactType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingDeliverItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MiracleRingDeliverItemRsp(
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
            case 16: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 48: {

              gadgetId_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              interactType_ = rawValue;
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
              break;
            }
            case 104: {

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
      return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.internal_static_MiracleRingDeliverItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.internal_static_MiracleRingDeliverItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.class, emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 2;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 2;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int GADGET_ID_FIELD_NUMBER = 6;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 6;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 8;
    private int opType_;
    /**
     * <code>.InterOpType op_type = 8;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType op_type = 8;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
      return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
    }

    public static final int INTERACT_TYPE_FIELD_NUMBER = 7;
    private int interactType_;
    /**
     * <code>.InteractType interact_type = 7;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.InteractType interact_type = 7;</code>
     * @return The interactType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType getInteractType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType result = emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.valueOf(interactType_);
      return result == null ? emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(2, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(6, gadgetId_);
      }
      if (interactType_ != emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.INTERACT_NONE.getNumber()) {
        output.writeEnum(7, interactType_);
      }
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_FINISH.getNumber()) {
        output.writeEnum(8, opType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gadgetId_);
      }
      if (interactType_ != emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.INTERACT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, interactType_);
      }
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_FINISH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, opType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp other = (emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (opType_ != other.opType_) return false;
      if (interactType_ != other.interactType_) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + INTERACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + interactType_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp prototype) {
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
     * Name: PDCEJKGIPPA
     * CmdId: 5232
     * </pre>
     *
     * Protobuf type {@code MiracleRingDeliverItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingDeliverItemRsp)
        emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.internal_static_MiracleRingDeliverItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.internal_static_MiracleRingDeliverItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.class, emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.newBuilder()
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
        gadgetEntityId_ = 0;

        gadgetId_ = 0;

        opType_ = 0;

        interactType_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.internal_static_MiracleRingDeliverItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp build() {
        emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp buildPartial() {
        emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp result = new emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.gadgetId_ = gadgetId_;
        result.opType_ = opType_;
        result.interactType_ = interactType_;
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
        if (other instanceof emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp other) {
        if (other == emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.interactType_ != 0) {
          setInteractTypeValue(other.getInteractTypeValue());
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
        emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 2;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 2;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 6;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 6;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.InterOpType op_type = 8;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.InterOpType op_type = 8;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 8;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
        return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InterOpType op_type = 8;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int interactType_ = 0;
      /**
       * <code>.InteractType interact_type = 7;</code>
       * @return The enum numeric value on the wire for interactType.
       */
      @java.lang.Override public int getInteractTypeValue() {
        return interactType_;
      }
      /**
       * <code>.InteractType interact_type = 7;</code>
       * @param value The enum numeric value on the wire for interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractTypeValue(int value) {
        
        interactType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InteractType interact_type = 7;</code>
       * @return The interactType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType getInteractType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType result = emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.valueOf(interactType_);
        return result == null ? emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InteractType interact_type = 7;</code>
       * @param value The interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractType(emu.grasscutter.net.proto.InteractTypeOuterClass.InteractType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        interactType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InteractType interact_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearInteractType() {
        
        interactType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:MiracleRingDeliverItemRsp)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingDeliverItemRsp)
    private static final emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp();
    }

    public static emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingDeliverItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingDeliverItemRsp>() {
      @java.lang.Override
      public MiracleRingDeliverItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MiracleRingDeliverItemRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MiracleRingDeliverItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingDeliverItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MiracleRingDeliverItemRspOuterClass.MiracleRingDeliverItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingDeliverItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingDeliverItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MiracleRingDeliverItemRsp.proto\032\022Inter" +
      "actType.proto\032\021InterOpType.proto\"\236\001\n\031Mir" +
      "acleRingDeliverItemRsp\022\030\n\020gadget_entity_" +
      "id\030\002 \001(\r\022\021\n\tgadget_id\030\006 \001(\r\022\035\n\007op_type\030\010" +
      " \001(\0162\014.InterOpType\022$\n\rinteract_type\030\007 \001(" +
      "\0162\r.InteractType\022\017\n\007retcode\030\r \001(\005B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InteractTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor(),
        });
    internal_static_MiracleRingDeliverItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingDeliverItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingDeliverItemRsp_descriptor,
        new java.lang.String[] { "GadgetEntityId", "GadgetId", "OpType", "InteractType", "Retcode", });
    emu.grasscutter.net.proto.InteractTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
