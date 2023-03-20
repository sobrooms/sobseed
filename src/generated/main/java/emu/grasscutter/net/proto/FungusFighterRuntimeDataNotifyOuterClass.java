// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterRuntimeDataNotify.proto

package emu.grasscutter.net.proto;

public final class FungusFighterRuntimeDataNotifyOuterClass {
  private FungusFighterRuntimeDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterRuntimeDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterRuntimeDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     * @return Whether the progressDetail field is set.
     */
    boolean hasProgressDetail();
    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     * @return The progressDetail.
     */
    emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail getProgressDetail();
    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     */
    emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder getProgressDetailOrBuilder();
  }
  /**
   * <pre>
   * Name: NMDMEHICCPN
   * CmdId: 23794
   * </pre>
   *
   * Protobuf type {@code FungusFighterRuntimeDataNotify}
   */
  public static final class FungusFighterRuntimeDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterRuntimeDataNotify)
      FungusFighterRuntimeDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterRuntimeDataNotify.newBuilder() to construct.
    private FungusFighterRuntimeDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterRuntimeDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterRuntimeDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterRuntimeDataNotify(
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
            case 106: {
              emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder subBuilder = null;
              if (progressDetail_ != null) {
                subBuilder = progressDetail_.toBuilder();
              }
              progressDetail_ = input.readMessage(emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(progressDetail_);
                progressDetail_ = subBuilder.buildPartial();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.internal_static_FungusFighterRuntimeDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.internal_static_FungusFighterRuntimeDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.class, emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.Builder.class);
    }

    public static final int PROGRESS_DETAIL_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail progressDetail_;
    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     * @return Whether the progressDetail field is set.
     */
    @java.lang.Override
    public boolean hasProgressDetail() {
      return progressDetail_ != null;
    }
    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     * @return The progressDetail.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail getProgressDetail() {
      return progressDetail_ == null ? emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.getDefaultInstance() : progressDetail_;
    }
    /**
     * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder getProgressDetailOrBuilder() {
      return getProgressDetail();
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
      if (progressDetail_ != null) {
        output.writeMessage(13, getProgressDetail());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progressDetail_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getProgressDetail());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify other = (emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify) obj;

      if (hasProgressDetail() != other.hasProgressDetail()) return false;
      if (hasProgressDetail()) {
        if (!getProgressDetail()
            .equals(other.getProgressDetail())) return false;
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
      if (hasProgressDetail()) {
        hash = (37 * hash) + PROGRESS_DETAIL_FIELD_NUMBER;
        hash = (53 * hash) + getProgressDetail().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify prototype) {
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
     * Name: NMDMEHICCPN
     * CmdId: 23794
     * </pre>
     *
     * Protobuf type {@code FungusFighterRuntimeDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterRuntimeDataNotify)
        emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.internal_static_FungusFighterRuntimeDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.internal_static_FungusFighterRuntimeDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.class, emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.newBuilder()
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
        if (progressDetailBuilder_ == null) {
          progressDetail_ = null;
        } else {
          progressDetail_ = null;
          progressDetailBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.internal_static_FungusFighterRuntimeDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify build() {
        emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify buildPartial() {
        emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify result = new emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify(this);
        if (progressDetailBuilder_ == null) {
          result.progressDetail_ = progressDetail_;
        } else {
          result.progressDetail_ = progressDetailBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify other) {
        if (other == emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify.getDefaultInstance()) return this;
        if (other.hasProgressDetail()) {
          mergeProgressDetail(other.getProgressDetail());
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
        emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail progressDetail_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder> progressDetailBuilder_;
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       * @return Whether the progressDetail field is set.
       */
      public boolean hasProgressDetail() {
        return progressDetailBuilder_ != null || progressDetail_ != null;
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       * @return The progressDetail.
       */
      public emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail getProgressDetail() {
        if (progressDetailBuilder_ == null) {
          return progressDetail_ == null ? emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.getDefaultInstance() : progressDetail_;
        } else {
          return progressDetailBuilder_.getMessage();
        }
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public Builder setProgressDetail(emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail value) {
        if (progressDetailBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          progressDetail_ = value;
          onChanged();
        } else {
          progressDetailBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public Builder setProgressDetail(
          emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder builderForValue) {
        if (progressDetailBuilder_ == null) {
          progressDetail_ = builderForValue.build();
          onChanged();
        } else {
          progressDetailBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public Builder mergeProgressDetail(emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail value) {
        if (progressDetailBuilder_ == null) {
          if (progressDetail_ != null) {
            progressDetail_ =
              emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.newBuilder(progressDetail_).mergeFrom(value).buildPartial();
          } else {
            progressDetail_ = value;
          }
          onChanged();
        } else {
          progressDetailBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public Builder clearProgressDetail() {
        if (progressDetailBuilder_ == null) {
          progressDetail_ = null;
          onChanged();
        } else {
          progressDetail_ = null;
          progressDetailBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder getProgressDetailBuilder() {
        
        onChanged();
        return getProgressDetailFieldBuilder().getBuilder();
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      public emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder getProgressDetailOrBuilder() {
        if (progressDetailBuilder_ != null) {
          return progressDetailBuilder_.getMessageOrBuilder();
        } else {
          return progressDetail_ == null ?
              emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.getDefaultInstance() : progressDetail_;
        }
      }
      /**
       * <code>.FungusTrainingProgressDetail progress_detail = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder> 
          getProgressDetailFieldBuilder() {
        if (progressDetailBuilder_ == null) {
          progressDetailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetail.Builder, emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.FungusTrainingProgressDetailOrBuilder>(
                  getProgressDetail(),
                  getParentForChildren(),
                  isClean());
          progressDetail_ = null;
        }
        return progressDetailBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterRuntimeDataNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterRuntimeDataNotify)
    private static final emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify();
    }

    public static emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterRuntimeDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterRuntimeDataNotify>() {
      @java.lang.Override
      public FungusFighterRuntimeDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterRuntimeDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterRuntimeDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterRuntimeDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterRuntimeDataNotifyOuterClass.FungusFighterRuntimeDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterRuntimeDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterRuntimeDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$FungusFighterRuntimeDataNotify.proto\032\"" +
      "FungusTrainingProgressDetail.proto\"X\n\036Fu" +
      "ngusFighterRuntimeDataNotify\0226\n\017progress" +
      "_detail\030\r \001(\0132\035.FungusTrainingProgressDe" +
      "tailB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.getDescriptor(),
        });
    internal_static_FungusFighterRuntimeDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterRuntimeDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterRuntimeDataNotify_descriptor,
        new java.lang.String[] { "ProgressDetail", });
    emu.grasscutter.net.proto.FungusTrainingProgressDetailOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
