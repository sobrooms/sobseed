// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStoreOpInfo.proto

package emu.grasscutter.net.proto;

public final class VintageMarketStoreOpInfoOuterClass {
  private VintageMarketStoreOpInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStoreOpInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStoreOpInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OMJNBCDJOOM = 5;</code>
     * @return The oMJNBCDJOOM.
     */
    int getOMJNBCDJOOM();

    /**
     * <code>uint32 store_id = 11;</code>
     * @return The storeId.
     */
    int getStoreId();

    /**
     * <code>uint32 FMMECOPACKC = 10;</code>
     * @return The fMMECOPACKC.
     */
    int getFMMECOPACKC();

    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @return A list containing the addAttrList.
     */
    java.util.List<java.lang.Integer> getAddAttrListList();
    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @return The count of addAttrList.
     */
    int getAddAttrListCount();
    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @param index The index of the element to return.
     * @return The addAttrList at the given index.
     */
    int getAddAttrList(int index);

    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @return A list containing the strategyList.
     */
    java.util.List<java.lang.Integer> getStrategyListList();
    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @return The count of strategyList.
     */
    int getStrategyListCount();
    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    int getStrategyList(int index);
  }
  /**
   * <pre>
   * Name: CNMOCADLDKL
   * </pre>
   *
   * Protobuf type {@code VintageMarketStoreOpInfo}
   */
  public static final class VintageMarketStoreOpInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStoreOpInfo)
      VintageMarketStoreOpInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStoreOpInfo.newBuilder() to construct.
    private VintageMarketStoreOpInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStoreOpInfo() {
      addAttrList_ = emptyIntList();
      strategyList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStoreOpInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketStoreOpInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              strategyList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                strategyList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {

              oMJNBCDJOOM_ = input.readUInt32();
              break;
            }
            case 80: {

              fMMECOPACKC_ = input.readUInt32();
              break;
            }
            case 88: {

              storeId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                addAttrList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              addAttrList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                addAttrList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                addAttrList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          strategyList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          addAttrList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.internal_static_VintageMarketStoreOpInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.internal_static_VintageMarketStoreOpInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.class, emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.Builder.class);
    }

    public static final int OMJNBCDJOOM_FIELD_NUMBER = 5;
    private int oMJNBCDJOOM_;
    /**
     * <code>uint32 OMJNBCDJOOM = 5;</code>
     * @return The oMJNBCDJOOM.
     */
    @java.lang.Override
    public int getOMJNBCDJOOM() {
      return oMJNBCDJOOM_;
    }

    public static final int STORE_ID_FIELD_NUMBER = 11;
    private int storeId_;
    /**
     * <code>uint32 store_id = 11;</code>
     * @return The storeId.
     */
    @java.lang.Override
    public int getStoreId() {
      return storeId_;
    }

    public static final int FMMECOPACKC_FIELD_NUMBER = 10;
    private int fMMECOPACKC_;
    /**
     * <code>uint32 FMMECOPACKC = 10;</code>
     * @return The fMMECOPACKC.
     */
    @java.lang.Override
    public int getFMMECOPACKC() {
      return fMMECOPACKC_;
    }

    public static final int ADD_ATTR_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList addAttrList_;
    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @return A list containing the addAttrList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAddAttrListList() {
      return addAttrList_;
    }
    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @return The count of addAttrList.
     */
    public int getAddAttrListCount() {
      return addAttrList_.size();
    }
    /**
     * <code>repeated uint32 add_attr_list = 12;</code>
     * @param index The index of the element to return.
     * @return The addAttrList at the given index.
     */
    public int getAddAttrList(int index) {
      return addAttrList_.getInt(index);
    }
    private int addAttrListMemoizedSerializedSize = -1;

    public static final int STRATEGY_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList strategyList_;
    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @return A list containing the strategyList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getStrategyListList() {
      return strategyList_;
    }
    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @return The count of strategyList.
     */
    public int getStrategyListCount() {
      return strategyList_.size();
    }
    /**
     * <code>repeated uint32 strategy_list = 4;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    public int getStrategyList(int index) {
      return strategyList_.getInt(index);
    }
    private int strategyListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getStrategyListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(strategyListMemoizedSerializedSize);
      }
      for (int i = 0; i < strategyList_.size(); i++) {
        output.writeUInt32NoTag(strategyList_.getInt(i));
      }
      if (oMJNBCDJOOM_ != 0) {
        output.writeUInt32(5, oMJNBCDJOOM_);
      }
      if (fMMECOPACKC_ != 0) {
        output.writeUInt32(10, fMMECOPACKC_);
      }
      if (storeId_ != 0) {
        output.writeUInt32(11, storeId_);
      }
      if (getAddAttrListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(addAttrListMemoizedSerializedSize);
      }
      for (int i = 0; i < addAttrList_.size(); i++) {
        output.writeUInt32NoTag(addAttrList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < strategyList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(strategyList_.getInt(i));
        }
        size += dataSize;
        if (!getStrategyListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        strategyListMemoizedSerializedSize = dataSize;
      }
      if (oMJNBCDJOOM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, oMJNBCDJOOM_);
      }
      if (fMMECOPACKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, fMMECOPACKC_);
      }
      if (storeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, storeId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < addAttrList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(addAttrList_.getInt(i));
        }
        size += dataSize;
        if (!getAddAttrListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        addAttrListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo other = (emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo) obj;

      if (getOMJNBCDJOOM()
          != other.getOMJNBCDJOOM()) return false;
      if (getStoreId()
          != other.getStoreId()) return false;
      if (getFMMECOPACKC()
          != other.getFMMECOPACKC()) return false;
      if (!getAddAttrListList()
          .equals(other.getAddAttrListList())) return false;
      if (!getStrategyListList()
          .equals(other.getStrategyListList())) return false;
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
      hash = (37 * hash) + OMJNBCDJOOM_FIELD_NUMBER;
      hash = (53 * hash) + getOMJNBCDJOOM();
      hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStoreId();
      hash = (37 * hash) + FMMECOPACKC_FIELD_NUMBER;
      hash = (53 * hash) + getFMMECOPACKC();
      if (getAddAttrListCount() > 0) {
        hash = (37 * hash) + ADD_ATTR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAddAttrListList().hashCode();
      }
      if (getStrategyListCount() > 0) {
        hash = (37 * hash) + STRATEGY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStrategyListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo prototype) {
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
     * Name: CNMOCADLDKL
     * </pre>
     *
     * Protobuf type {@code VintageMarketStoreOpInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStoreOpInfo)
        emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.internal_static_VintageMarketStoreOpInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.internal_static_VintageMarketStoreOpInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.class, emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.newBuilder()
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
        oMJNBCDJOOM_ = 0;

        storeId_ = 0;

        fMMECOPACKC_ = 0;

        addAttrList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.internal_static_VintageMarketStoreOpInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo build() {
        emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo buildPartial() {
        emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo result = new emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo(this);
        int from_bitField0_ = bitField0_;
        result.oMJNBCDJOOM_ = oMJNBCDJOOM_;
        result.storeId_ = storeId_;
        result.fMMECOPACKC_ = fMMECOPACKC_;
        if (((bitField0_ & 0x00000001) != 0)) {
          addAttrList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.addAttrList_ = addAttrList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          strategyList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.strategyList_ = strategyList_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo other) {
        if (other == emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo.getDefaultInstance()) return this;
        if (other.getOMJNBCDJOOM() != 0) {
          setOMJNBCDJOOM(other.getOMJNBCDJOOM());
        }
        if (other.getStoreId() != 0) {
          setStoreId(other.getStoreId());
        }
        if (other.getFMMECOPACKC() != 0) {
          setFMMECOPACKC(other.getFMMECOPACKC());
        }
        if (!other.addAttrList_.isEmpty()) {
          if (addAttrList_.isEmpty()) {
            addAttrList_ = other.addAttrList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddAttrListIsMutable();
            addAttrList_.addAll(other.addAttrList_);
          }
          onChanged();
        }
        if (!other.strategyList_.isEmpty()) {
          if (strategyList_.isEmpty()) {
            strategyList_ = other.strategyList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStrategyListIsMutable();
            strategyList_.addAll(other.strategyList_);
          }
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
        emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int oMJNBCDJOOM_ ;
      /**
       * <code>uint32 OMJNBCDJOOM = 5;</code>
       * @return The oMJNBCDJOOM.
       */
      @java.lang.Override
      public int getOMJNBCDJOOM() {
        return oMJNBCDJOOM_;
      }
      /**
       * <code>uint32 OMJNBCDJOOM = 5;</code>
       * @param value The oMJNBCDJOOM to set.
       * @return This builder for chaining.
       */
      public Builder setOMJNBCDJOOM(int value) {
        
        oMJNBCDJOOM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OMJNBCDJOOM = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMJNBCDJOOM() {
        
        oMJNBCDJOOM_ = 0;
        onChanged();
        return this;
      }

      private int storeId_ ;
      /**
       * <code>uint32 store_id = 11;</code>
       * @return The storeId.
       */
      @java.lang.Override
      public int getStoreId() {
        return storeId_;
      }
      /**
       * <code>uint32 store_id = 11;</code>
       * @param value The storeId to set.
       * @return This builder for chaining.
       */
      public Builder setStoreId(int value) {
        
        storeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 store_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreId() {
        
        storeId_ = 0;
        onChanged();
        return this;
      }

      private int fMMECOPACKC_ ;
      /**
       * <code>uint32 FMMECOPACKC = 10;</code>
       * @return The fMMECOPACKC.
       */
      @java.lang.Override
      public int getFMMECOPACKC() {
        return fMMECOPACKC_;
      }
      /**
       * <code>uint32 FMMECOPACKC = 10;</code>
       * @param value The fMMECOPACKC to set.
       * @return This builder for chaining.
       */
      public Builder setFMMECOPACKC(int value) {
        
        fMMECOPACKC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FMMECOPACKC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFMMECOPACKC() {
        
        fMMECOPACKC_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList addAttrList_ = emptyIntList();
      private void ensureAddAttrListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          addAttrList_ = mutableCopy(addAttrList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @return A list containing the addAttrList.
       */
      public java.util.List<java.lang.Integer>
          getAddAttrListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(addAttrList_) : addAttrList_;
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @return The count of addAttrList.
       */
      public int getAddAttrListCount() {
        return addAttrList_.size();
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @param index The index of the element to return.
       * @return The addAttrList at the given index.
       */
      public int getAddAttrList(int index) {
        return addAttrList_.getInt(index);
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The addAttrList to set.
       * @return This builder for chaining.
       */
      public Builder setAddAttrList(
          int index, int value) {
        ensureAddAttrListIsMutable();
        addAttrList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @param value The addAttrList to add.
       * @return This builder for chaining.
       */
      public Builder addAddAttrList(int value) {
        ensureAddAttrListIsMutable();
        addAttrList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @param values The addAttrList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAddAttrList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAddAttrListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addAttrList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_attr_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddAttrList() {
        addAttrList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList strategyList_ = emptyIntList();
      private void ensureStrategyListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          strategyList_ = mutableCopy(strategyList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @return A list containing the strategyList.
       */
      public java.util.List<java.lang.Integer>
          getStrategyListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(strategyList_) : strategyList_;
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @return The count of strategyList.
       */
      public int getStrategyListCount() {
        return strategyList_.size();
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @param index The index of the element to return.
       * @return The strategyList at the given index.
       */
      public int getStrategyList(int index) {
        return strategyList_.getInt(index);
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The strategyList to set.
       * @return This builder for chaining.
       */
      public Builder setStrategyList(
          int index, int value) {
        ensureStrategyListIsMutable();
        strategyList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @param value The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addStrategyList(int value) {
        ensureStrategyListIsMutable();
        strategyList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @param values The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addAllStrategyList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStrategyListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, strategyList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrategyList() {
        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStoreOpInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStoreOpInfo)
    private static final emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo();
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStoreOpInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStoreOpInfo>() {
      @java.lang.Override
      public VintageMarketStoreOpInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketStoreOpInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketStoreOpInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStoreOpInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketStoreOpInfoOuterClass.VintageMarketStoreOpInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStoreOpInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStoreOpInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036VintageMarketStoreOpInfo.proto\"\204\001\n\030Vin" +
      "tageMarketStoreOpInfo\022\023\n\013OMJNBCDJOOM\030\005 \001" +
      "(\r\022\020\n\010store_id\030\013 \001(\r\022\023\n\013FMMECOPACKC\030\n \001(" +
      "\r\022\025\n\radd_attr_list\030\014 \003(\r\022\025\n\rstrategy_lis" +
      "t\030\004 \003(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStoreOpInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStoreOpInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStoreOpInfo_descriptor,
        new java.lang.String[] { "OMJNBCDJOOM", "StoreId", "FMMECOPACKC", "AddAttrList", "StrategyList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
