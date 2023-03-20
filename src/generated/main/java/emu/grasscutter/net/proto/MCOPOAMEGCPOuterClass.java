// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MCOPOAMEGCP.proto

package emu.grasscutter.net.proto;

public final class MCOPOAMEGCPOuterClass {
  private MCOPOAMEGCPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MCOPOAMEGCPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MCOPOAMEGCP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @return A list containing the cNDHCLDMGJP.
     */
    java.util.List<java.lang.Integer> getCNDHCLDMGJPList();
    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @return The count of cNDHCLDMGJP.
     */
    int getCNDHCLDMGJPCount();
    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @param index The index of the element to return.
     * @return The cNDHCLDMGJP at the given index.
     */
    int getCNDHCLDMGJP(int index);

    /**
     * <code>uint32 map_id = 4;</code>
     * @return The mapId.
     */
    int getMapId();

    /**
     * <code>uint32 best_score = 9;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     * @return Whether the entranceDetailInfo field is set.
     */
    boolean hasEntranceDetailInfo();
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     * @return The entranceDetailInfo.
     */
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo();
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder();
  }
  /**
   * <pre>
   * Name: MCOPOAMEGCP
   * </pre>
   *
   * Protobuf type {@code MCOPOAMEGCP}
   */
  public static final class MCOPOAMEGCP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MCOPOAMEGCP)
      MCOPOAMEGCPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MCOPOAMEGCP.newBuilder() to construct.
    private MCOPOAMEGCP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MCOPOAMEGCP() {
      cNDHCLDMGJP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MCOPOAMEGCP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MCOPOAMEGCP(
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

              mapId_ = input.readUInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cNDHCLDMGJP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cNDHCLDMGJP_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cNDHCLDMGJP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cNDHCLDMGJP_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder subBuilder = null;
              if (entranceDetailInfo_ != null) {
                subBuilder = entranceDetailInfo_.toBuilder();
              }
              entranceDetailInfo_ = input.readMessage(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entranceDetailInfo_);
                entranceDetailInfo_ = subBuilder.buildPartial();
              }

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
          cNDHCLDMGJP_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.internal_static_MCOPOAMEGCP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.internal_static_MCOPOAMEGCP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.class, emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.Builder.class);
    }

    public static final int CNDHCLDMGJP_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList cNDHCLDMGJP_;
    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @return A list containing the cNDHCLDMGJP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCNDHCLDMGJPList() {
      return cNDHCLDMGJP_;
    }
    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @return The count of cNDHCLDMGJP.
     */
    public int getCNDHCLDMGJPCount() {
      return cNDHCLDMGJP_.size();
    }
    /**
     * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
     * @param index The index of the element to return.
     * @return The cNDHCLDMGJP at the given index.
     */
    public int getCNDHCLDMGJP(int index) {
      return cNDHCLDMGJP_.getInt(index);
    }
    private int cNDHCLDMGJPMemoizedSerializedSize = -1;

    public static final int MAP_ID_FIELD_NUMBER = 4;
    private int mapId_;
    /**
     * <code>uint32 map_id = 4;</code>
     * @return The mapId.
     */
    @java.lang.Override
    public int getMapId() {
      return mapId_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 9;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 9;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int ENTRANCE_DETAIL_INFO_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo entranceDetailInfo_;
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     * @return Whether the entranceDetailInfo field is set.
     */
    @java.lang.Override
    public boolean hasEntranceDetailInfo() {
      return entranceDetailInfo_ != null;
    }
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     * @return The entranceDetailInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo() {
      return entranceDetailInfo_ == null ? emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
    }
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder() {
      return getEntranceDetailInfo();
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
      getSerializedSize();
      if (mapId_ != 0) {
        output.writeUInt32(4, mapId_);
      }
      if (getCNDHCLDMGJPList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(cNDHCLDMGJPMemoizedSerializedSize);
      }
      for (int i = 0; i < cNDHCLDMGJP_.size(); i++) {
        output.writeUInt32NoTag(cNDHCLDMGJP_.getInt(i));
      }
      if (bestScore_ != 0) {
        output.writeUInt32(9, bestScore_);
      }
      if (entranceDetailInfo_ != null) {
        output.writeMessage(13, getEntranceDetailInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mapId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mapId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cNDHCLDMGJP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cNDHCLDMGJP_.getInt(i));
        }
        size += dataSize;
        if (!getCNDHCLDMGJPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cNDHCLDMGJPMemoizedSerializedSize = dataSize;
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, bestScore_);
      }
      if (entranceDetailInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getEntranceDetailInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP other = (emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP) obj;

      if (!getCNDHCLDMGJPList()
          .equals(other.getCNDHCLDMGJPList())) return false;
      if (getMapId()
          != other.getMapId()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (hasEntranceDetailInfo() != other.hasEntranceDetailInfo()) return false;
      if (hasEntranceDetailInfo()) {
        if (!getEntranceDetailInfo()
            .equals(other.getEntranceDetailInfo())) return false;
      }
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
      if (getCNDHCLDMGJPCount() > 0) {
        hash = (37 * hash) + CNDHCLDMGJP_FIELD_NUMBER;
        hash = (53 * hash) + getCNDHCLDMGJPList().hashCode();
      }
      hash = (37 * hash) + MAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapId();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      if (hasEntranceDetailInfo()) {
        hash = (37 * hash) + ENTRANCE_DETAIL_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEntranceDetailInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP prototype) {
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
     * Name: MCOPOAMEGCP
     * </pre>
     *
     * Protobuf type {@code MCOPOAMEGCP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MCOPOAMEGCP)
        emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.internal_static_MCOPOAMEGCP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.internal_static_MCOPOAMEGCP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.class, emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.newBuilder()
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
        cNDHCLDMGJP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        mapId_ = 0;

        bestScore_ = 0;

        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = null;
        } else {
          entranceDetailInfo_ = null;
          entranceDetailInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.internal_static_MCOPOAMEGCP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP build() {
        emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP buildPartial() {
        emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP result = new emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cNDHCLDMGJP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cNDHCLDMGJP_ = cNDHCLDMGJP_;
        result.mapId_ = mapId_;
        result.bestScore_ = bestScore_;
        if (entranceDetailInfoBuilder_ == null) {
          result.entranceDetailInfo_ = entranceDetailInfo_;
        } else {
          result.entranceDetailInfo_ = entranceDetailInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP) {
          return mergeFrom((emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP other) {
        if (other == emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP.getDefaultInstance()) return this;
        if (!other.cNDHCLDMGJP_.isEmpty()) {
          if (cNDHCLDMGJP_.isEmpty()) {
            cNDHCLDMGJP_ = other.cNDHCLDMGJP_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCNDHCLDMGJPIsMutable();
            cNDHCLDMGJP_.addAll(other.cNDHCLDMGJP_);
          }
          onChanged();
        }
        if (other.getMapId() != 0) {
          setMapId(other.getMapId());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.hasEntranceDetailInfo()) {
          mergeEntranceDetailInfo(other.getEntranceDetailInfo());
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
        emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList cNDHCLDMGJP_ = emptyIntList();
      private void ensureCNDHCLDMGJPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cNDHCLDMGJP_ = mutableCopy(cNDHCLDMGJP_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @return A list containing the cNDHCLDMGJP.
       */
      public java.util.List<java.lang.Integer>
          getCNDHCLDMGJPList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cNDHCLDMGJP_) : cNDHCLDMGJP_;
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @return The count of cNDHCLDMGJP.
       */
      public int getCNDHCLDMGJPCount() {
        return cNDHCLDMGJP_.size();
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @param index The index of the element to return.
       * @return The cNDHCLDMGJP at the given index.
       */
      public int getCNDHCLDMGJP(int index) {
        return cNDHCLDMGJP_.getInt(index);
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @param index The index to set the value at.
       * @param value The cNDHCLDMGJP to set.
       * @return This builder for chaining.
       */
      public Builder setCNDHCLDMGJP(
          int index, int value) {
        ensureCNDHCLDMGJPIsMutable();
        cNDHCLDMGJP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @param value The cNDHCLDMGJP to add.
       * @return This builder for chaining.
       */
      public Builder addCNDHCLDMGJP(int value) {
        ensureCNDHCLDMGJPIsMutable();
        cNDHCLDMGJP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @param values The cNDHCLDMGJP to add.
       * @return This builder for chaining.
       */
      public Builder addAllCNDHCLDMGJP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCNDHCLDMGJPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cNDHCLDMGJP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CNDHCLDMGJP = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCNDHCLDMGJP() {
        cNDHCLDMGJP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int mapId_ ;
      /**
       * <code>uint32 map_id = 4;</code>
       * @return The mapId.
       */
      @java.lang.Override
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>uint32 map_id = 4;</code>
       * @param value The mapId to set.
       * @return This builder for chaining.
       */
      public Builder setMapId(int value) {
        
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapId() {
        
        mapId_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 9;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 9;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo entranceDetailInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder> entranceDetailInfoBuilder_;
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       * @return Whether the entranceDetailInfo field is set.
       */
      public boolean hasEntranceDetailInfo() {
        return entranceDetailInfoBuilder_ != null || entranceDetailInfo_ != null;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       * @return The entranceDetailInfo.
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo() {
        if (entranceDetailInfoBuilder_ == null) {
          return entranceDetailInfo_ == null ? emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
        } else {
          return entranceDetailInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public Builder setEntranceDetailInfo(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo value) {
        if (entranceDetailInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entranceDetailInfo_ = value;
          onChanged();
        } else {
          entranceDetailInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public Builder setEntranceDetailInfo(
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder builderForValue) {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = builderForValue.build();
          onChanged();
        } else {
          entranceDetailInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public Builder mergeEntranceDetailInfo(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo value) {
        if (entranceDetailInfoBuilder_ == null) {
          if (entranceDetailInfo_ != null) {
            entranceDetailInfo_ =
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.newBuilder(entranceDetailInfo_).mergeFrom(value).buildPartial();
          } else {
            entranceDetailInfo_ = value;
          }
          onChanged();
        } else {
          entranceDetailInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public Builder clearEntranceDetailInfo() {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = null;
          onChanged();
        } else {
          entranceDetailInfo_ = null;
          entranceDetailInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder getEntranceDetailInfoBuilder() {
        
        onChanged();
        return getEntranceDetailInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder() {
        if (entranceDetailInfoBuilder_ != null) {
          return entranceDetailInfoBuilder_.getMessageOrBuilder();
        } else {
          return entranceDetailInfo_ == null ?
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
        }
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder> 
          getEntranceDetailInfoFieldBuilder() {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder>(
                  getEntranceDetailInfo(),
                  getParentForChildren(),
                  isClean());
          entranceDetailInfo_ = null;
        }
        return entranceDetailInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MCOPOAMEGCP)
    }

    // @@protoc_insertion_point(class_scope:MCOPOAMEGCP)
    private static final emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP();
    }

    public static emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MCOPOAMEGCP>
        PARSER = new com.google.protobuf.AbstractParser<MCOPOAMEGCP>() {
      @java.lang.Override
      public MCOPOAMEGCP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MCOPOAMEGCP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MCOPOAMEGCP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MCOPOAMEGCP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MCOPOAMEGCPOuterClass.MCOPOAMEGCP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MCOPOAMEGCP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MCOPOAMEGCP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MCOPOAMEGCP.proto\032$IrodoriChessEntranc" +
      "eDetailInfo.proto\"\205\001\n\013MCOPOAMEGCP\022\023\n\013CND" +
      "HCLDMGJP\030\007 \003(\r\022\016\n\006map_id\030\004 \001(\r\022\022\n\nbest_s" +
      "core\030\t \001(\r\022=\n\024entrance_detail_info\030\r \001(\013" +
      "2\037.IrodoriChessEntranceDetailInfoB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.getDescriptor(),
        });
    internal_static_MCOPOAMEGCP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MCOPOAMEGCP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MCOPOAMEGCP_descriptor,
        new java.lang.String[] { "CNDHCLDMGJP", "MapId", "BestScore", "EntranceDetailInfo", });
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
