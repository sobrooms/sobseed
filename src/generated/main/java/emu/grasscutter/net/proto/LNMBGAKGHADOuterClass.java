// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LNMBGAKGHAD.proto

package emu.grasscutter.net.proto;

public final class LNMBGAKGHADOuterClass {
  private LNMBGAKGHADOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LNMBGAKGHADOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LNMBGAKGHAD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string CNJPBIDDKCK = 2;</code>
     * @return The cNJPBIDDKCK.
     */
    java.lang.String getCNJPBIDDKCK();
    /**
     * <code>string CNJPBIDDKCK = 2;</code>
     * @return The bytes for cNJPBIDDKCK.
     */
    com.google.protobuf.ByteString
        getCNJPBIDDKCKBytes();

    /**
     * <code>float KKNMAJLOPIM = 5;</code>
     * @return The kKNMAJLOPIM.
     */
    float getKKNMAJLOPIM();

    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>float BLBHOEGPKOF = 15;</code>
     * @return The bLBHOEGPKOF.
     */
    float getBLBHOEGPKOF();

    /**
     * <code>float LMPPEKDJNIN = 9;</code>
     * @return The lMPPEKDJNIN.
     */
    float getLMPPEKDJNIN();

    /**
     * <code>bool CMANPKKNAMG = 4;</code>
     * @return The cMANPKKNAMG.
     */
    boolean getCMANPKKNAMG();
  }
  /**
   * <pre>
   * Name: LNMBGAKGHAD
   * </pre>
   *
   * Protobuf type {@code LNMBGAKGHAD}
   */
  public static final class LNMBGAKGHAD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LNMBGAKGHAD)
      LNMBGAKGHADOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LNMBGAKGHAD.newBuilder() to construct.
    private LNMBGAKGHAD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LNMBGAKGHAD() {
      cNJPBIDDKCK_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LNMBGAKGHAD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LNMBGAKGHAD(
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              cNJPBIDDKCK_ = s;
              break;
            }
            case 32: {

              cMANPKKNAMG_ = input.readBool();
              break;
            }
            case 45: {

              kKNMAJLOPIM_ = input.readFloat();
              break;
            }
            case 77: {

              lMPPEKDJNIN_ = input.readFloat();
              break;
            }
            case 112: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 125: {

              bLBHOEGPKOF_ = input.readFloat();
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
      return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.internal_static_LNMBGAKGHAD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.internal_static_LNMBGAKGHAD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.class, emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.Builder.class);
    }

    public static final int CNJPBIDDKCK_FIELD_NUMBER = 2;
    private volatile java.lang.Object cNJPBIDDKCK_;
    /**
     * <code>string CNJPBIDDKCK = 2;</code>
     * @return The cNJPBIDDKCK.
     */
    @java.lang.Override
    public java.lang.String getCNJPBIDDKCK() {
      java.lang.Object ref = cNJPBIDDKCK_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cNJPBIDDKCK_ = s;
        return s;
      }
    }
    /**
     * <code>string CNJPBIDDKCK = 2;</code>
     * @return The bytes for cNJPBIDDKCK.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCNJPBIDDKCKBytes() {
      java.lang.Object ref = cNJPBIDDKCK_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cNJPBIDDKCK_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KKNMAJLOPIM_FIELD_NUMBER = 5;
    private float kKNMAJLOPIM_;
    /**
     * <code>float KKNMAJLOPIM = 5;</code>
     * @return The kKNMAJLOPIM.
     */
    @java.lang.Override
    public float getKKNMAJLOPIM() {
      return kKNMAJLOPIM_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 14;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int BLBHOEGPKOF_FIELD_NUMBER = 15;
    private float bLBHOEGPKOF_;
    /**
     * <code>float BLBHOEGPKOF = 15;</code>
     * @return The bLBHOEGPKOF.
     */
    @java.lang.Override
    public float getBLBHOEGPKOF() {
      return bLBHOEGPKOF_;
    }

    public static final int LMPPEKDJNIN_FIELD_NUMBER = 9;
    private float lMPPEKDJNIN_;
    /**
     * <code>float LMPPEKDJNIN = 9;</code>
     * @return The lMPPEKDJNIN.
     */
    @java.lang.Override
    public float getLMPPEKDJNIN() {
      return lMPPEKDJNIN_;
    }

    public static final int CMANPKKNAMG_FIELD_NUMBER = 4;
    private boolean cMANPKKNAMG_;
    /**
     * <code>bool CMANPKKNAMG = 4;</code>
     * @return The cMANPKKNAMG.
     */
    @java.lang.Override
    public boolean getCMANPKKNAMG() {
      return cMANPKKNAMG_;
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
      if (!getCNJPBIDDKCKBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cNJPBIDDKCK_);
      }
      if (cMANPKKNAMG_ != false) {
        output.writeBool(4, cMANPKKNAMG_);
      }
      if (kKNMAJLOPIM_ != 0F) {
        output.writeFloat(5, kKNMAJLOPIM_);
      }
      if (lMPPEKDJNIN_ != 0F) {
        output.writeFloat(9, lMPPEKDJNIN_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(14, avatarId_);
      }
      if (bLBHOEGPKOF_ != 0F) {
        output.writeFloat(15, bLBHOEGPKOF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getCNJPBIDDKCKBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cNJPBIDDKCK_);
      }
      if (cMANPKKNAMG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, cMANPKKNAMG_);
      }
      if (kKNMAJLOPIM_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, kKNMAJLOPIM_);
      }
      if (lMPPEKDJNIN_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, lMPPEKDJNIN_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, avatarId_);
      }
      if (bLBHOEGPKOF_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(15, bLBHOEGPKOF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD other = (emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD) obj;

      if (!getCNJPBIDDKCK()
          .equals(other.getCNJPBIDDKCK())) return false;
      if (java.lang.Float.floatToIntBits(getKKNMAJLOPIM())
          != java.lang.Float.floatToIntBits(
              other.getKKNMAJLOPIM())) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (java.lang.Float.floatToIntBits(getBLBHOEGPKOF())
          != java.lang.Float.floatToIntBits(
              other.getBLBHOEGPKOF())) return false;
      if (java.lang.Float.floatToIntBits(getLMPPEKDJNIN())
          != java.lang.Float.floatToIntBits(
              other.getLMPPEKDJNIN())) return false;
      if (getCMANPKKNAMG()
          != other.getCMANPKKNAMG()) return false;
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
      hash = (37 * hash) + CNJPBIDDKCK_FIELD_NUMBER;
      hash = (53 * hash) + getCNJPBIDDKCK().hashCode();
      hash = (37 * hash) + KKNMAJLOPIM_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getKKNMAJLOPIM());
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + BLBHOEGPKOF_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getBLBHOEGPKOF());
      hash = (37 * hash) + LMPPEKDJNIN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLMPPEKDJNIN());
      hash = (37 * hash) + CMANPKKNAMG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCMANPKKNAMG());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD prototype) {
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
     * Name: LNMBGAKGHAD
     * </pre>
     *
     * Protobuf type {@code LNMBGAKGHAD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LNMBGAKGHAD)
        emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHADOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.internal_static_LNMBGAKGHAD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.internal_static_LNMBGAKGHAD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.class, emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.newBuilder()
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
        cNJPBIDDKCK_ = "";

        kKNMAJLOPIM_ = 0F;

        avatarId_ = 0;

        bLBHOEGPKOF_ = 0F;

        lMPPEKDJNIN_ = 0F;

        cMANPKKNAMG_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.internal_static_LNMBGAKGHAD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD build() {
        emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD buildPartial() {
        emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD result = new emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD(this);
        result.cNJPBIDDKCK_ = cNJPBIDDKCK_;
        result.kKNMAJLOPIM_ = kKNMAJLOPIM_;
        result.avatarId_ = avatarId_;
        result.bLBHOEGPKOF_ = bLBHOEGPKOF_;
        result.lMPPEKDJNIN_ = lMPPEKDJNIN_;
        result.cMANPKKNAMG_ = cMANPKKNAMG_;
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
        if (other instanceof emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD) {
          return mergeFrom((emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD other) {
        if (other == emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD.getDefaultInstance()) return this;
        if (!other.getCNJPBIDDKCK().isEmpty()) {
          cNJPBIDDKCK_ = other.cNJPBIDDKCK_;
          onChanged();
        }
        if (other.getKKNMAJLOPIM() != 0F) {
          setKKNMAJLOPIM(other.getKKNMAJLOPIM());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getBLBHOEGPKOF() != 0F) {
          setBLBHOEGPKOF(other.getBLBHOEGPKOF());
        }
        if (other.getLMPPEKDJNIN() != 0F) {
          setLMPPEKDJNIN(other.getLMPPEKDJNIN());
        }
        if (other.getCMANPKKNAMG() != false) {
          setCMANPKKNAMG(other.getCMANPKKNAMG());
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
        emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object cNJPBIDDKCK_ = "";
      /**
       * <code>string CNJPBIDDKCK = 2;</code>
       * @return The cNJPBIDDKCK.
       */
      public java.lang.String getCNJPBIDDKCK() {
        java.lang.Object ref = cNJPBIDDKCK_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          cNJPBIDDKCK_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string CNJPBIDDKCK = 2;</code>
       * @return The bytes for cNJPBIDDKCK.
       */
      public com.google.protobuf.ByteString
          getCNJPBIDDKCKBytes() {
        java.lang.Object ref = cNJPBIDDKCK_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cNJPBIDDKCK_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string CNJPBIDDKCK = 2;</code>
       * @param value The cNJPBIDDKCK to set.
       * @return This builder for chaining.
       */
      public Builder setCNJPBIDDKCK(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        cNJPBIDDKCK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string CNJPBIDDKCK = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCNJPBIDDKCK() {
        
        cNJPBIDDKCK_ = getDefaultInstance().getCNJPBIDDKCK();
        onChanged();
        return this;
      }
      /**
       * <code>string CNJPBIDDKCK = 2;</code>
       * @param value The bytes for cNJPBIDDKCK to set.
       * @return This builder for chaining.
       */
      public Builder setCNJPBIDDKCKBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        cNJPBIDDKCK_ = value;
        onChanged();
        return this;
      }

      private float kKNMAJLOPIM_ ;
      /**
       * <code>float KKNMAJLOPIM = 5;</code>
       * @return The kKNMAJLOPIM.
       */
      @java.lang.Override
      public float getKKNMAJLOPIM() {
        return kKNMAJLOPIM_;
      }
      /**
       * <code>float KKNMAJLOPIM = 5;</code>
       * @param value The kKNMAJLOPIM to set.
       * @return This builder for chaining.
       */
      public Builder setKKNMAJLOPIM(float value) {
        
        kKNMAJLOPIM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float KKNMAJLOPIM = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKKNMAJLOPIM() {
        
        kKNMAJLOPIM_ = 0F;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private float bLBHOEGPKOF_ ;
      /**
       * <code>float BLBHOEGPKOF = 15;</code>
       * @return The bLBHOEGPKOF.
       */
      @java.lang.Override
      public float getBLBHOEGPKOF() {
        return bLBHOEGPKOF_;
      }
      /**
       * <code>float BLBHOEGPKOF = 15;</code>
       * @param value The bLBHOEGPKOF to set.
       * @return This builder for chaining.
       */
      public Builder setBLBHOEGPKOF(float value) {
        
        bLBHOEGPKOF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float BLBHOEGPKOF = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBLBHOEGPKOF() {
        
        bLBHOEGPKOF_ = 0F;
        onChanged();
        return this;
      }

      private float lMPPEKDJNIN_ ;
      /**
       * <code>float LMPPEKDJNIN = 9;</code>
       * @return The lMPPEKDJNIN.
       */
      @java.lang.Override
      public float getLMPPEKDJNIN() {
        return lMPPEKDJNIN_;
      }
      /**
       * <code>float LMPPEKDJNIN = 9;</code>
       * @param value The lMPPEKDJNIN to set.
       * @return This builder for chaining.
       */
      public Builder setLMPPEKDJNIN(float value) {
        
        lMPPEKDJNIN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float LMPPEKDJNIN = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLMPPEKDJNIN() {
        
        lMPPEKDJNIN_ = 0F;
        onChanged();
        return this;
      }

      private boolean cMANPKKNAMG_ ;
      /**
       * <code>bool CMANPKKNAMG = 4;</code>
       * @return The cMANPKKNAMG.
       */
      @java.lang.Override
      public boolean getCMANPKKNAMG() {
        return cMANPKKNAMG_;
      }
      /**
       * <code>bool CMANPKKNAMG = 4;</code>
       * @param value The cMANPKKNAMG to set.
       * @return This builder for chaining.
       */
      public Builder setCMANPKKNAMG(boolean value) {
        
        cMANPKKNAMG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool CMANPKKNAMG = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMANPKKNAMG() {
        
        cMANPKKNAMG_ = false;
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


      // @@protoc_insertion_point(builder_scope:LNMBGAKGHAD)
    }

    // @@protoc_insertion_point(class_scope:LNMBGAKGHAD)
    private static final emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD();
    }

    public static emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LNMBGAKGHAD>
        PARSER = new com.google.protobuf.AbstractParser<LNMBGAKGHAD>() {
      @java.lang.Override
      public LNMBGAKGHAD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LNMBGAKGHAD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LNMBGAKGHAD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LNMBGAKGHAD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LNMBGAKGHADOuterClass.LNMBGAKGHAD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LNMBGAKGHAD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LNMBGAKGHAD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LNMBGAKGHAD.proto\"\211\001\n\013LNMBGAKGHAD\022\023\n\013C" +
      "NJPBIDDKCK\030\002 \001(\t\022\023\n\013KKNMAJLOPIM\030\005 \001(\002\022\021\n" +
      "\tavatar_id\030\016 \001(\r\022\023\n\013BLBHOEGPKOF\030\017 \001(\002\022\023\n" +
      "\013LMPPEKDJNIN\030\t \001(\002\022\023\n\013CMANPKKNAMG\030\004 \001(\010B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LNMBGAKGHAD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LNMBGAKGHAD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LNMBGAKGHAD_descriptor,
        new java.lang.String[] { "CNJPBIDDKCK", "KKNMAJLOPIM", "AvatarId", "BLBHOEGPKOF", "LMPPEKDJNIN", "CMANPKKNAMG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
