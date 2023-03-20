// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChallengeRecord.proto

package emu.grasscutter.net.proto;

public final class ChallengeRecordOuterClass {
  private ChallengeRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChallengeRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChallengeRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_index = 2;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();

    /**
     * <code>uint32 LLGLNCOOMPM = 7;</code>
     * @return The lLGLNCOOMPM.
     */
    int getLLGLNCOOMPM();

    /**
     * <code>uint32 IEIOKIIGBIA = 3;</code>
     * @return The iEIOKIIGBIA.
     */
    int getIEIOKIIGBIA();

    /**
     * <code>uint32 challenge_id = 9;</code>
     * @return The challengeId.
     */
    int getChallengeId();
  }
  /**
   * <pre>
   * Name: PCHDKENMKEJ
   * </pre>
   *
   * Protobuf type {@code ChallengeRecord}
   */
  public static final class ChallengeRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChallengeRecord)
      ChallengeRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChallengeRecord.newBuilder() to construct.
    private ChallengeRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChallengeRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChallengeRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChallengeRecord(
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

              challengeIndex_ = input.readUInt32();
              break;
            }
            case 24: {

              iEIOKIIGBIA_ = input.readUInt32();
              break;
            }
            case 56: {

              lLGLNCOOMPM_ = input.readUInt32();
              break;
            }
            case 72: {

              challengeId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ChallengeRecordOuterClass.internal_static_ChallengeRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChallengeRecordOuterClass.internal_static_ChallengeRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.class, emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.Builder.class);
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 2;
    private int challengeIndex_;
    /**
     * <code>uint32 challenge_index = 2;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
    }

    public static final int LLGLNCOOMPM_FIELD_NUMBER = 7;
    private int lLGLNCOOMPM_;
    /**
     * <code>uint32 LLGLNCOOMPM = 7;</code>
     * @return The lLGLNCOOMPM.
     */
    @java.lang.Override
    public int getLLGLNCOOMPM() {
      return lLGLNCOOMPM_;
    }

    public static final int IEIOKIIGBIA_FIELD_NUMBER = 3;
    private int iEIOKIIGBIA_;
    /**
     * <code>uint32 IEIOKIIGBIA = 3;</code>
     * @return The iEIOKIIGBIA.
     */
    @java.lang.Override
    public int getIEIOKIIGBIA() {
      return iEIOKIIGBIA_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 9;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 9;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
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
      if (challengeIndex_ != 0) {
        output.writeUInt32(2, challengeIndex_);
      }
      if (iEIOKIIGBIA_ != 0) {
        output.writeUInt32(3, iEIOKIIGBIA_);
      }
      if (lLGLNCOOMPM_ != 0) {
        output.writeUInt32(7, lLGLNCOOMPM_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(9, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, challengeIndex_);
      }
      if (iEIOKIIGBIA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, iEIOKIIGBIA_);
      }
      if (lLGLNCOOMPM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, lLGLNCOOMPM_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, challengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord other = (emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord) obj;

      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
      if (getLLGLNCOOMPM()
          != other.getLLGLNCOOMPM()) return false;
      if (getIEIOKIIGBIA()
          != other.getIEIOKIIGBIA()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
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
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (37 * hash) + LLGLNCOOMPM_FIELD_NUMBER;
      hash = (53 * hash) + getLLGLNCOOMPM();
      hash = (37 * hash) + IEIOKIIGBIA_FIELD_NUMBER;
      hash = (53 * hash) + getIEIOKIIGBIA();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord prototype) {
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
     * Name: PCHDKENMKEJ
     * </pre>
     *
     * Protobuf type {@code ChallengeRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChallengeRecord)
        emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChallengeRecordOuterClass.internal_static_ChallengeRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChallengeRecordOuterClass.internal_static_ChallengeRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.class, emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.newBuilder()
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
        challengeIndex_ = 0;

        lLGLNCOOMPM_ = 0;

        iEIOKIIGBIA_ = 0;

        challengeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChallengeRecordOuterClass.internal_static_ChallengeRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord build() {
        emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord buildPartial() {
        emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord result = new emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord(this);
        result.challengeIndex_ = challengeIndex_;
        result.lLGLNCOOMPM_ = lLGLNCOOMPM_;
        result.iEIOKIIGBIA_ = iEIOKIIGBIA_;
        result.challengeId_ = challengeId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord) {
          return mergeFrom((emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord other) {
        if (other == emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord.getDefaultInstance()) return this;
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
        }
        if (other.getLLGLNCOOMPM() != 0) {
          setLLGLNCOOMPM(other.getLLGLNCOOMPM());
        }
        if (other.getIEIOKIIGBIA() != 0) {
          setIEIOKIIGBIA(other.getIEIOKIIGBIA());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
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
        emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 2;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 2;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {
        
        challengeIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {
        
        challengeIndex_ = 0;
        onChanged();
        return this;
      }

      private int lLGLNCOOMPM_ ;
      /**
       * <code>uint32 LLGLNCOOMPM = 7;</code>
       * @return The lLGLNCOOMPM.
       */
      @java.lang.Override
      public int getLLGLNCOOMPM() {
        return lLGLNCOOMPM_;
      }
      /**
       * <code>uint32 LLGLNCOOMPM = 7;</code>
       * @param value The lLGLNCOOMPM to set.
       * @return This builder for chaining.
       */
      public Builder setLLGLNCOOMPM(int value) {
        
        lLGLNCOOMPM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LLGLNCOOMPM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLLGLNCOOMPM() {
        
        lLGLNCOOMPM_ = 0;
        onChanged();
        return this;
      }

      private int iEIOKIIGBIA_ ;
      /**
       * <code>uint32 IEIOKIIGBIA = 3;</code>
       * @return The iEIOKIIGBIA.
       */
      @java.lang.Override
      public int getIEIOKIIGBIA() {
        return iEIOKIIGBIA_;
      }
      /**
       * <code>uint32 IEIOKIIGBIA = 3;</code>
       * @param value The iEIOKIIGBIA to set.
       * @return This builder for chaining.
       */
      public Builder setIEIOKIIGBIA(int value) {
        
        iEIOKIIGBIA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IEIOKIIGBIA = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIEIOKIIGBIA() {
        
        iEIOKIIGBIA_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 9;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 9;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChallengeRecord)
    }

    // @@protoc_insertion_point(class_scope:ChallengeRecord)
    private static final emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord();
    }

    public static emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChallengeRecord>
        PARSER = new com.google.protobuf.AbstractParser<ChallengeRecord>() {
      @java.lang.Override
      public ChallengeRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChallengeRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChallengeRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChallengeRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChallengeRecordOuterClass.ChallengeRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChallengeRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChallengeRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ChallengeRecord.proto\"j\n\017ChallengeReco" +
      "rd\022\027\n\017challenge_index\030\002 \001(\r\022\023\n\013LLGLNCOOM" +
      "PM\030\007 \001(\r\022\023\n\013IEIOKIIGBIA\030\003 \001(\r\022\024\n\014challen" +
      "ge_id\030\t \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChallengeRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChallengeRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChallengeRecord_descriptor,
        new java.lang.String[] { "ChallengeIndex", "LLGLNCOOMPM", "IEIOKIIGBIA", "ChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
