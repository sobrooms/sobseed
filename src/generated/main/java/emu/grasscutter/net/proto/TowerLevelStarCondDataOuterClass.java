// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelStarCondData.proto

package emu.grasscutter.net.proto;

public final class TowerLevelStarCondDataOuterClass {
  private TowerLevelStarCondDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelStarCondDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelStarCondData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool EOJOAHGECCE = 13;</code>
     * @return The eOJOAHGECCE.
     */
    boolean getEOJOAHGECCE();

    /**
     * <code>uint32 NLNHJFLCGHB = 4;</code>
     * @return The nLNHJFLCGHB.
     */
    int getNLNHJFLCGHB();

    /**
     * <code>uint32 KOPBLHONCEF = 7;</code>
     * @return The kOPBLHONCEF.
     */
    int getKOPBLHONCEF();

    /**
     * <code>bool MFPMLIGPNIJ = 2;</code>
     * @return The mFPMLIGPNIJ.
     */
    boolean getMFPMLIGPNIJ();
  }
  /**
   * <pre>
   * Name: KMPDADDDNCP
   * </pre>
   *
   * Protobuf type {@code TowerLevelStarCondData}
   */
  public static final class TowerLevelStarCondData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelStarCondData)
      TowerLevelStarCondDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelStarCondData.newBuilder() to construct.
    private TowerLevelStarCondData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelStarCondData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelStarCondData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerLevelStarCondData(
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

              mFPMLIGPNIJ_ = input.readBool();
              break;
            }
            case 32: {

              nLNHJFLCGHB_ = input.readUInt32();
              break;
            }
            case 56: {

              kOPBLHONCEF_ = input.readUInt32();
              break;
            }
            case 104: {

              eOJOAHGECCE_ = input.readBool();
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
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
    }

    public static final int EOJOAHGECCE_FIELD_NUMBER = 13;
    private boolean eOJOAHGECCE_;
    /**
     * <code>bool EOJOAHGECCE = 13;</code>
     * @return The eOJOAHGECCE.
     */
    @java.lang.Override
    public boolean getEOJOAHGECCE() {
      return eOJOAHGECCE_;
    }

    public static final int NLNHJFLCGHB_FIELD_NUMBER = 4;
    private int nLNHJFLCGHB_;
    /**
     * <code>uint32 NLNHJFLCGHB = 4;</code>
     * @return The nLNHJFLCGHB.
     */
    @java.lang.Override
    public int getNLNHJFLCGHB() {
      return nLNHJFLCGHB_;
    }

    public static final int KOPBLHONCEF_FIELD_NUMBER = 7;
    private int kOPBLHONCEF_;
    /**
     * <code>uint32 KOPBLHONCEF = 7;</code>
     * @return The kOPBLHONCEF.
     */
    @java.lang.Override
    public int getKOPBLHONCEF() {
      return kOPBLHONCEF_;
    }

    public static final int MFPMLIGPNIJ_FIELD_NUMBER = 2;
    private boolean mFPMLIGPNIJ_;
    /**
     * <code>bool MFPMLIGPNIJ = 2;</code>
     * @return The mFPMLIGPNIJ.
     */
    @java.lang.Override
    public boolean getMFPMLIGPNIJ() {
      return mFPMLIGPNIJ_;
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
      if (mFPMLIGPNIJ_ != false) {
        output.writeBool(2, mFPMLIGPNIJ_);
      }
      if (nLNHJFLCGHB_ != 0) {
        output.writeUInt32(4, nLNHJFLCGHB_);
      }
      if (kOPBLHONCEF_ != 0) {
        output.writeUInt32(7, kOPBLHONCEF_);
      }
      if (eOJOAHGECCE_ != false) {
        output.writeBool(13, eOJOAHGECCE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mFPMLIGPNIJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, mFPMLIGPNIJ_);
      }
      if (nLNHJFLCGHB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, nLNHJFLCGHB_);
      }
      if (kOPBLHONCEF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, kOPBLHONCEF_);
      }
      if (eOJOAHGECCE_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, eOJOAHGECCE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other = (emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) obj;

      if (getEOJOAHGECCE()
          != other.getEOJOAHGECCE()) return false;
      if (getNLNHJFLCGHB()
          != other.getNLNHJFLCGHB()) return false;
      if (getKOPBLHONCEF()
          != other.getKOPBLHONCEF()) return false;
      if (getMFPMLIGPNIJ()
          != other.getMFPMLIGPNIJ()) return false;
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
      hash = (37 * hash) + EOJOAHGECCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEOJOAHGECCE());
      hash = (37 * hash) + NLNHJFLCGHB_FIELD_NUMBER;
      hash = (53 * hash) + getNLNHJFLCGHB();
      hash = (37 * hash) + KOPBLHONCEF_FIELD_NUMBER;
      hash = (53 * hash) + getKOPBLHONCEF();
      hash = (37 * hash) + MFPMLIGPNIJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMFPMLIGPNIJ());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData prototype) {
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
     * Name: KMPDADDDNCP
     * </pre>
     *
     * Protobuf type {@code TowerLevelStarCondData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelStarCondData)
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.newBuilder()
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
        eOJOAHGECCE_ = false;

        nLNHJFLCGHB_ = 0;

        kOPBLHONCEF_ = 0;

        mFPMLIGPNIJ_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData build() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData buildPartial() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData(this);
        result.eOJOAHGECCE_ = eOJOAHGECCE_;
        result.nLNHJFLCGHB_ = nLNHJFLCGHB_;
        result.kOPBLHONCEF_ = kOPBLHONCEF_;
        result.mFPMLIGPNIJ_ = mFPMLIGPNIJ_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) {
          return mergeFrom((emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other) {
        if (other == emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance()) return this;
        if (other.getEOJOAHGECCE() != false) {
          setEOJOAHGECCE(other.getEOJOAHGECCE());
        }
        if (other.getNLNHJFLCGHB() != 0) {
          setNLNHJFLCGHB(other.getNLNHJFLCGHB());
        }
        if (other.getKOPBLHONCEF() != 0) {
          setKOPBLHONCEF(other.getKOPBLHONCEF());
        }
        if (other.getMFPMLIGPNIJ() != false) {
          setMFPMLIGPNIJ(other.getMFPMLIGPNIJ());
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
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean eOJOAHGECCE_ ;
      /**
       * <code>bool EOJOAHGECCE = 13;</code>
       * @return The eOJOAHGECCE.
       */
      @java.lang.Override
      public boolean getEOJOAHGECCE() {
        return eOJOAHGECCE_;
      }
      /**
       * <code>bool EOJOAHGECCE = 13;</code>
       * @param value The eOJOAHGECCE to set.
       * @return This builder for chaining.
       */
      public Builder setEOJOAHGECCE(boolean value) {
        
        eOJOAHGECCE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool EOJOAHGECCE = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEOJOAHGECCE() {
        
        eOJOAHGECCE_ = false;
        onChanged();
        return this;
      }

      private int nLNHJFLCGHB_ ;
      /**
       * <code>uint32 NLNHJFLCGHB = 4;</code>
       * @return The nLNHJFLCGHB.
       */
      @java.lang.Override
      public int getNLNHJFLCGHB() {
        return nLNHJFLCGHB_;
      }
      /**
       * <code>uint32 NLNHJFLCGHB = 4;</code>
       * @param value The nLNHJFLCGHB to set.
       * @return This builder for chaining.
       */
      public Builder setNLNHJFLCGHB(int value) {
        
        nLNHJFLCGHB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NLNHJFLCGHB = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNLNHJFLCGHB() {
        
        nLNHJFLCGHB_ = 0;
        onChanged();
        return this;
      }

      private int kOPBLHONCEF_ ;
      /**
       * <code>uint32 KOPBLHONCEF = 7;</code>
       * @return The kOPBLHONCEF.
       */
      @java.lang.Override
      public int getKOPBLHONCEF() {
        return kOPBLHONCEF_;
      }
      /**
       * <code>uint32 KOPBLHONCEF = 7;</code>
       * @param value The kOPBLHONCEF to set.
       * @return This builder for chaining.
       */
      public Builder setKOPBLHONCEF(int value) {
        
        kOPBLHONCEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KOPBLHONCEF = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearKOPBLHONCEF() {
        
        kOPBLHONCEF_ = 0;
        onChanged();
        return this;
      }

      private boolean mFPMLIGPNIJ_ ;
      /**
       * <code>bool MFPMLIGPNIJ = 2;</code>
       * @return The mFPMLIGPNIJ.
       */
      @java.lang.Override
      public boolean getMFPMLIGPNIJ() {
        return mFPMLIGPNIJ_;
      }
      /**
       * <code>bool MFPMLIGPNIJ = 2;</code>
       * @param value The mFPMLIGPNIJ to set.
       * @return This builder for chaining.
       */
      public Builder setMFPMLIGPNIJ(boolean value) {
        
        mFPMLIGPNIJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool MFPMLIGPNIJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMFPMLIGPNIJ() {
        
        mFPMLIGPNIJ_ = false;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelStarCondData)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelStarCondData)
    private static final emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData();
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelStarCondData>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelStarCondData>() {
      @java.lang.Override
      public TowerLevelStarCondData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerLevelStarCondData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerLevelStarCondData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelStarCondData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelStarCondData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelStarCondData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TowerLevelStarCondData.proto\"l\n\026TowerL" +
      "evelStarCondData\022\023\n\013EOJOAHGECCE\030\r \001(\010\022\023\n" +
      "\013NLNHJFLCGHB\030\004 \001(\r\022\023\n\013KOPBLHONCEF\030\007 \001(\r\022" +
      "\023\n\013MFPMLIGPNIJ\030\002 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerLevelStarCondData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelStarCondData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelStarCondData_descriptor,
        new java.lang.String[] { "EOJOAHGECCE", "NLNHJFLCGHB", "KOPBLHONCEF", "MFPMLIGPNIJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
