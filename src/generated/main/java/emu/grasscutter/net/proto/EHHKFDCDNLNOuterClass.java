// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EHHKFDCDNLN.proto

package emu.grasscutter.net.proto;

public final class EHHKFDCDNLNOuterClass {
  private EHHKFDCDNLNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EHHKFDCDNLNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EHHKFDCDNLN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 NLPMDCHEHPB = 2;</code>
     * @return The nLPMDCHEHPB.
     */
    int getNLPMDCHEHPB();

    /**
     * <code>uint32 PDMJFKNGIOL = 4;</code>
     * @return The pDMJFKNGIOL.
     */
    int getPDMJFKNGIOL();

    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
     * @return The enum numeric value on the wire for fELJLGEOIBB.
     */
    int getFELJLGEOIBBValue();
    /**
     * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
     * @return The fELJLGEOIBB.
     */
    emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA getFELJLGEOIBB();

    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return A list containing the entityIdList.
     */
    java.util.List<java.lang.Integer> getEntityIdListList();
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return The count of entityIdList.
     */
    int getEntityIdListCount();
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    int getEntityIdList(int index);
  }
  /**
   * <pre>
   * Name: EHHKFDCDNLN
   * </pre>
   *
   * Protobuf type {@code EHHKFDCDNLN}
   */
  public static final class EHHKFDCDNLN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EHHKFDCDNLN)
      EHHKFDCDNLNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EHHKFDCDNLN.newBuilder() to construct.
    private EHHKFDCDNLN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EHHKFDCDNLN() {
      fELJLGEOIBB_ = 0;
      entityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EHHKFDCDNLN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EHHKFDCDNLN(
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
            case 16: {

              nLPMDCHEHPB_ = input.readUInt32();
              break;
            }
            case 32: {

              pDMJFKNGIOL_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              fELJLGEOIBB_ = rawValue;
              break;
            }
            case 64: {

              endTime_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              entityIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                entityIdList_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.internal_static_EHHKFDCDNLN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.internal_static_EHHKFDCDNLN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.class, emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.Builder.class);
    }

    public static final int NLPMDCHEHPB_FIELD_NUMBER = 2;
    private int nLPMDCHEHPB_;
    /**
     * <code>uint32 NLPMDCHEHPB = 2;</code>
     * @return The nLPMDCHEHPB.
     */
    @java.lang.Override
    public int getNLPMDCHEHPB() {
      return nLPMDCHEHPB_;
    }

    public static final int PDMJFKNGIOL_FIELD_NUMBER = 4;
    private int pDMJFKNGIOL_;
    /**
     * <code>uint32 PDMJFKNGIOL = 4;</code>
     * @return The pDMJFKNGIOL.
     */
    @java.lang.Override
    public int getPDMJFKNGIOL() {
      return pDMJFKNGIOL_;
    }

    public static final int END_TIME_FIELD_NUMBER = 8;
    private int endTime_;
    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int FELJLGEOIBB_FIELD_NUMBER = 5;
    private int fELJLGEOIBB_;
    /**
     * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
     * @return The enum numeric value on the wire for fELJLGEOIBB.
     */
    @java.lang.Override public int getFELJLGEOIBBValue() {
      return fELJLGEOIBB_;
    }
    /**
     * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
     * @return The fELJLGEOIBB.
     */
    @java.lang.Override public emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA getFELJLGEOIBB() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA result = emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.valueOf(fELJLGEOIBB_);
      return result == null ? emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList entityIdList_;
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return A list containing the entityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityIdListList() {
      return entityIdList_;
    }
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return The count of entityIdList.
     */
    public int getEntityIdListCount() {
      return entityIdList_.size();
    }
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    public int getEntityIdList(int index) {
      return entityIdList_.getInt(index);
    }
    private int entityIdListMemoizedSerializedSize = -1;

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
      if (nLPMDCHEHPB_ != 0) {
        output.writeUInt32(2, nLPMDCHEHPB_);
      }
      if (pDMJFKNGIOL_ != 0) {
        output.writeUInt32(4, pDMJFKNGIOL_);
      }
      if (fELJLGEOIBB_ != emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.AJKKNJIKCJA_LDHDOKHDOEK.getNumber()) {
        output.writeEnum(5, fELJLGEOIBB_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(8, endTime_);
      }
      if (getEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(entityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityIdList_.size(); i++) {
        output.writeUInt32NoTag(entityIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nLPMDCHEHPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, nLPMDCHEHPB_);
      }
      if (pDMJFKNGIOL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, pDMJFKNGIOL_);
      }
      if (fELJLGEOIBB_ != emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.AJKKNJIKCJA_LDHDOKHDOEK.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, fELJLGEOIBB_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, endTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN other = (emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN) obj;

      if (getNLPMDCHEHPB()
          != other.getNLPMDCHEHPB()) return false;
      if (getPDMJFKNGIOL()
          != other.getPDMJFKNGIOL()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (fELJLGEOIBB_ != other.fELJLGEOIBB_) return false;
      if (!getEntityIdListList()
          .equals(other.getEntityIdListList())) return false;
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
      hash = (37 * hash) + NLPMDCHEHPB_FIELD_NUMBER;
      hash = (53 * hash) + getNLPMDCHEHPB();
      hash = (37 * hash) + PDMJFKNGIOL_FIELD_NUMBER;
      hash = (53 * hash) + getPDMJFKNGIOL();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + FELJLGEOIBB_FIELD_NUMBER;
      hash = (53 * hash) + fELJLGEOIBB_;
      if (getEntityIdListCount() > 0) {
        hash = (37 * hash) + ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN prototype) {
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
     * Name: EHHKFDCDNLN
     * </pre>
     *
     * Protobuf type {@code EHHKFDCDNLN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EHHKFDCDNLN)
        emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.internal_static_EHHKFDCDNLN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.internal_static_EHHKFDCDNLN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.class, emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.newBuilder()
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
        nLPMDCHEHPB_ = 0;

        pDMJFKNGIOL_ = 0;

        endTime_ = 0;

        fELJLGEOIBB_ = 0;

        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.internal_static_EHHKFDCDNLN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN build() {
        emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN buildPartial() {
        emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN result = new emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN(this);
        int from_bitField0_ = bitField0_;
        result.nLPMDCHEHPB_ = nLPMDCHEHPB_;
        result.pDMJFKNGIOL_ = pDMJFKNGIOL_;
        result.endTime_ = endTime_;
        result.fELJLGEOIBB_ = fELJLGEOIBB_;
        if (((bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityIdList_ = entityIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN) {
          return mergeFrom((emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN other) {
        if (other == emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN.getDefaultInstance()) return this;
        if (other.getNLPMDCHEHPB() != 0) {
          setNLPMDCHEHPB(other.getNLPMDCHEHPB());
        }
        if (other.getPDMJFKNGIOL() != 0) {
          setPDMJFKNGIOL(other.getPDMJFKNGIOL());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.fELJLGEOIBB_ != 0) {
          setFELJLGEOIBBValue(other.getFELJLGEOIBBValue());
        }
        if (!other.entityIdList_.isEmpty()) {
          if (entityIdList_.isEmpty()) {
            entityIdList_ = other.entityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityIdListIsMutable();
            entityIdList_.addAll(other.entityIdList_);
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
        emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int nLPMDCHEHPB_ ;
      /**
       * <code>uint32 NLPMDCHEHPB = 2;</code>
       * @return The nLPMDCHEHPB.
       */
      @java.lang.Override
      public int getNLPMDCHEHPB() {
        return nLPMDCHEHPB_;
      }
      /**
       * <code>uint32 NLPMDCHEHPB = 2;</code>
       * @param value The nLPMDCHEHPB to set.
       * @return This builder for chaining.
       */
      public Builder setNLPMDCHEHPB(int value) {
        
        nLPMDCHEHPB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NLPMDCHEHPB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNLPMDCHEHPB() {
        
        nLPMDCHEHPB_ = 0;
        onChanged();
        return this;
      }

      private int pDMJFKNGIOL_ ;
      /**
       * <code>uint32 PDMJFKNGIOL = 4;</code>
       * @return The pDMJFKNGIOL.
       */
      @java.lang.Override
      public int getPDMJFKNGIOL() {
        return pDMJFKNGIOL_;
      }
      /**
       * <code>uint32 PDMJFKNGIOL = 4;</code>
       * @param value The pDMJFKNGIOL to set.
       * @return This builder for chaining.
       */
      public Builder setPDMJFKNGIOL(int value) {
        
        pDMJFKNGIOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PDMJFKNGIOL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPDMJFKNGIOL() {
        
        pDMJFKNGIOL_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 8;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int fELJLGEOIBB_ = 0;
      /**
       * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
       * @return The enum numeric value on the wire for fELJLGEOIBB.
       */
      @java.lang.Override public int getFELJLGEOIBBValue() {
        return fELJLGEOIBB_;
      }
      /**
       * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
       * @param value The enum numeric value on the wire for fELJLGEOIBB to set.
       * @return This builder for chaining.
       */
      public Builder setFELJLGEOIBBValue(int value) {
        
        fELJLGEOIBB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
       * @return The fELJLGEOIBB.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA getFELJLGEOIBB() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA result = emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.valueOf(fELJLGEOIBB_);
        return result == null ? emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA.UNRECOGNIZED : result;
      }
      /**
       * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
       * @param value The fELJLGEOIBB to set.
       * @return This builder for chaining.
       */
      public Builder setFELJLGEOIBB(emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.AJKKNJIKCJA value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        fELJLGEOIBB_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AJKKNJIKCJA FELJLGEOIBB = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFELJLGEOIBB() {
        
        fELJLGEOIBB_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList entityIdList_ = emptyIntList();
      private void ensureEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityIdList_ = mutableCopy(entityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return A list containing the entityIdList.
       */
      public java.util.List<java.lang.Integer>
          getEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityIdList_) : entityIdList_;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return The count of entityIdList.
       */
      public int getEntityIdListCount() {
        return entityIdList_.size();
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The entityIdList at the given index.
       */
      public int getEntityIdList(int index) {
        return entityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The entityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityIdList(
          int index, int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param value The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityIdList(int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param values The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityIdList() {
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:EHHKFDCDNLN)
    }

    // @@protoc_insertion_point(class_scope:EHHKFDCDNLN)
    private static final emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN();
    }

    public static emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EHHKFDCDNLN>
        PARSER = new com.google.protobuf.AbstractParser<EHHKFDCDNLN>() {
      @java.lang.Override
      public EHHKFDCDNLN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EHHKFDCDNLN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EHHKFDCDNLN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EHHKFDCDNLN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EHHKFDCDNLNOuterClass.EHHKFDCDNLN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EHHKFDCDNLN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EHHKFDCDNLN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EHHKFDCDNLN.proto\032\021AJKKNJIKCJA.proto\"\204" +
      "\001\n\013EHHKFDCDNLN\022\023\n\013NLPMDCHEHPB\030\002 \001(\r\022\023\n\013P" +
      "DMJFKNGIOL\030\004 \001(\r\022\020\n\010end_time\030\010 \001(\r\022!\n\013FE" +
      "LJLGEOIBB\030\005 \001(\0162\014.AJKKNJIKCJA\022\026\n\016entity_" +
      "id_list\030\r \003(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.getDescriptor(),
        });
    internal_static_EHHKFDCDNLN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EHHKFDCDNLN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EHHKFDCDNLN_descriptor,
        new java.lang.String[] { "NLPMDCHEHPB", "PDMJFKNGIOL", "EndTime", "FELJLGEOIBB", "EntityIdList", });
    emu.grasscutter.net.proto.AJKKNJIKCJAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}