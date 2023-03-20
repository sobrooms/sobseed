// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionSearch.proto

package emu.grasscutter.net.proto;

public final class RegionSearchOuterClass {
  private RegionSearchOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionSearchOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionSearch)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_entered = 8;</code>
     * @return The isEntered.
     */
    boolean getIsEntered();

    /**
     * <code>.RegionSearchState state = 9;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.RegionSearchState state = 9;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState getState();

    /**
     * <code>uint32 progress = 2;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 region_search_id = 3;</code>
     * @return The regionSearchId.
     */
    int getRegionSearchId();
  }
  /**
   * <pre>
   * Name: AIOFHFPBCHH
   * </pre>
   *
   * Protobuf type {@code RegionSearch}
   */
  public static final class RegionSearch extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionSearch)
      RegionSearchOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionSearch.newBuilder() to construct.
    private RegionSearch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionSearch() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionSearch();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RegionSearch(
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

              progress_ = input.readUInt32();
              break;
            }
            case 24: {

              regionSearchId_ = input.readUInt32();
              break;
            }
            case 64: {

              isEntered_ = input.readBool();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              state_ = rawValue;
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
      return emu.grasscutter.net.proto.RegionSearchOuterClass.internal_static_RegionSearch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RegionSearchOuterClass.internal_static_RegionSearch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.class, emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.Builder.class);
    }

    public static final int IS_ENTERED_FIELD_NUMBER = 8;
    private boolean isEntered_;
    /**
     * <code>bool is_entered = 8;</code>
     * @return The isEntered.
     */
    @java.lang.Override
    public boolean getIsEntered() {
      return isEntered_;
    }

    public static final int STATE_FIELD_NUMBER = 9;
    private int state_;
    /**
     * <code>.RegionSearchState state = 9;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.RegionSearchState state = 9;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState result = emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.UNRECOGNIZED : result;
    }

    public static final int PROGRESS_FIELD_NUMBER = 2;
    private int progress_;
    /**
     * <code>uint32 progress = 2;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int REGION_SEARCH_ID_FIELD_NUMBER = 3;
    private int regionSearchId_;
    /**
     * <code>uint32 region_search_id = 3;</code>
     * @return The regionSearchId.
     */
    @java.lang.Override
    public int getRegionSearchId() {
      return regionSearchId_;
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
      if (progress_ != 0) {
        output.writeUInt32(2, progress_);
      }
      if (regionSearchId_ != 0) {
        output.writeUInt32(3, regionSearchId_);
      }
      if (isEntered_ != false) {
        output.writeBool(8, isEntered_);
      }
      if (state_ != emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.REGION_SEARCH_NONE.getNumber()) {
        output.writeEnum(9, state_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, progress_);
      }
      if (regionSearchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, regionSearchId_);
      }
      if (isEntered_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isEntered_);
      }
      if (state_ != emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.REGION_SEARCH_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, state_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch other = (emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch) obj;

      if (getIsEntered()
          != other.getIsEntered()) return false;
      if (state_ != other.state_) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getRegionSearchId()
          != other.getRegionSearchId()) return false;
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
      hash = (37 * hash) + IS_ENTERED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEntered());
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + REGION_SEARCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRegionSearchId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch prototype) {
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
     * Name: AIOFHFPBCHH
     * </pre>
     *
     * Protobuf type {@code RegionSearch}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionSearch)
        emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearchOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RegionSearchOuterClass.internal_static_RegionSearch_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RegionSearchOuterClass.internal_static_RegionSearch_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.class, emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.newBuilder()
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
        isEntered_ = false;

        state_ = 0;

        progress_ = 0;

        regionSearchId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RegionSearchOuterClass.internal_static_RegionSearch_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch build() {
        emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch buildPartial() {
        emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch result = new emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch(this);
        result.isEntered_ = isEntered_;
        result.state_ = state_;
        result.progress_ = progress_;
        result.regionSearchId_ = regionSearchId_;
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
        if (other instanceof emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch) {
          return mergeFrom((emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch other) {
        if (other == emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch.getDefaultInstance()) return this;
        if (other.getIsEntered() != false) {
          setIsEntered(other.getIsEntered());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getRegionSearchId() != 0) {
          setRegionSearchId(other.getRegionSearchId());
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
        emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isEntered_ ;
      /**
       * <code>bool is_entered = 8;</code>
       * @return The isEntered.
       */
      @java.lang.Override
      public boolean getIsEntered() {
        return isEntered_;
      }
      /**
       * <code>bool is_entered = 8;</code>
       * @param value The isEntered to set.
       * @return This builder for chaining.
       */
      public Builder setIsEntered(boolean value) {
        
        isEntered_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_entered = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEntered() {
        
        isEntered_ = false;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.RegionSearchState state = 9;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.RegionSearchState state = 9;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RegionSearchState state = 9;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState result = emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState.UNRECOGNIZED : result;
      }
      /**
       * <code>.RegionSearchState state = 9;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.RegionSearchStateOuterClass.RegionSearchState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RegionSearchState state = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 2;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 2;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
        onChanged();
        return this;
      }

      private int regionSearchId_ ;
      /**
       * <code>uint32 region_search_id = 3;</code>
       * @return The regionSearchId.
       */
      @java.lang.Override
      public int getRegionSearchId() {
        return regionSearchId_;
      }
      /**
       * <code>uint32 region_search_id = 3;</code>
       * @param value The regionSearchId to set.
       * @return This builder for chaining.
       */
      public Builder setRegionSearchId(int value) {
        
        regionSearchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 region_search_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRegionSearchId() {
        
        regionSearchId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RegionSearch)
    }

    // @@protoc_insertion_point(class_scope:RegionSearch)
    private static final emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch();
    }

    public static emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionSearch>
        PARSER = new com.google.protobuf.AbstractParser<RegionSearch>() {
      @java.lang.Override
      public RegionSearch parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegionSearch(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RegionSearch> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionSearch> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RegionSearchOuterClass.RegionSearch getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionSearch_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionSearch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022RegionSearch.proto\032\027RegionSearchState." +
      "proto\"q\n\014RegionSearch\022\022\n\nis_entered\030\010 \001(" +
      "\010\022!\n\005state\030\t \001(\0162\022.RegionSearchState\022\020\n\010" +
      "progress\030\002 \001(\r\022\030\n\020region_search_id\030\003 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RegionSearchStateOuterClass.getDescriptor(),
        });
    internal_static_RegionSearch_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionSearch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionSearch_descriptor,
        new java.lang.String[] { "IsEntered", "State", "Progress", "RegionSearchId", });
    emu.grasscutter.net.proto.RegionSearchStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
