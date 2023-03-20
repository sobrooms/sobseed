// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSearchBlueprintRsp.proto

package emu.grasscutter.net.proto;

public final class HomeSearchBlueprintRspOuterClass {
  private HomeSearchBlueprintRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSearchBlueprintRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSearchBlueprintRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     * @return Whether the searchInfo field is set.
     */
    boolean hasSearchInfo();
    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     * @return The searchInfo.
     */
    emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo getSearchInfo();
    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     */
    emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder getSearchInfoOrBuilder();
  }
  /**
   * <pre>
   * Name: MLACPPJOPOM
   * CmdId: 4659
   * </pre>
   *
   * Protobuf type {@code HomeSearchBlueprintRsp}
   */
  public static final class HomeSearchBlueprintRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSearchBlueprintRsp)
      HomeSearchBlueprintRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSearchBlueprintRsp.newBuilder() to construct.
    private HomeSearchBlueprintRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSearchBlueprintRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSearchBlueprintRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSearchBlueprintRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder subBuilder = null;
              if (searchInfo_ != null) {
                subBuilder = searchInfo_.toBuilder();
              }
              searchInfo_ = input.readMessage(emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(searchInfo_);
                searchInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.internal_static_HomeSearchBlueprintRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.internal_static_HomeSearchBlueprintRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.class, emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SEARCH_INFO_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo searchInfo_;
    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     * @return Whether the searchInfo field is set.
     */
    @java.lang.Override
    public boolean hasSearchInfo() {
      return searchInfo_ != null;
    }
    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     * @return The searchInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo getSearchInfo() {
      return searchInfo_ == null ? emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.getDefaultInstance() : searchInfo_;
    }
    /**
     * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder getSearchInfoOrBuilder() {
      return getSearchInfo();
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (searchInfo_ != null) {
        output.writeMessage(13, getSearchInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (searchInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getSearchInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp other = (emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasSearchInfo() != other.hasSearchInfo()) return false;
      if (hasSearchInfo()) {
        if (!getSearchInfo()
            .equals(other.getSearchInfo())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasSearchInfo()) {
        hash = (37 * hash) + SEARCH_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSearchInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp prototype) {
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
     * Name: MLACPPJOPOM
     * CmdId: 4659
     * </pre>
     *
     * Protobuf type {@code HomeSearchBlueprintRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSearchBlueprintRsp)
        emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.internal_static_HomeSearchBlueprintRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.internal_static_HomeSearchBlueprintRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.class, emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.newBuilder()
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
        retcode_ = 0;

        if (searchInfoBuilder_ == null) {
          searchInfo_ = null;
        } else {
          searchInfo_ = null;
          searchInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.internal_static_HomeSearchBlueprintRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp build() {
        emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp buildPartial() {
        emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp result = new emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp(this);
        result.retcode_ = retcode_;
        if (searchInfoBuilder_ == null) {
          result.searchInfo_ = searchInfo_;
        } else {
          result.searchInfo_ = searchInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp other) {
        if (other == emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasSearchInfo()) {
          mergeSearchInfo(other.getSearchInfo());
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
        emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo searchInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder> searchInfoBuilder_;
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       * @return Whether the searchInfo field is set.
       */
      public boolean hasSearchInfo() {
        return searchInfoBuilder_ != null || searchInfo_ != null;
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       * @return The searchInfo.
       */
      public emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo getSearchInfo() {
        if (searchInfoBuilder_ == null) {
          return searchInfo_ == null ? emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.getDefaultInstance() : searchInfo_;
        } else {
          return searchInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public Builder setSearchInfo(emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo value) {
        if (searchInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          searchInfo_ = value;
          onChanged();
        } else {
          searchInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public Builder setSearchInfo(
          emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder builderForValue) {
        if (searchInfoBuilder_ == null) {
          searchInfo_ = builderForValue.build();
          onChanged();
        } else {
          searchInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public Builder mergeSearchInfo(emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo value) {
        if (searchInfoBuilder_ == null) {
          if (searchInfo_ != null) {
            searchInfo_ =
              emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.newBuilder(searchInfo_).mergeFrom(value).buildPartial();
          } else {
            searchInfo_ = value;
          }
          onChanged();
        } else {
          searchInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public Builder clearSearchInfo() {
        if (searchInfoBuilder_ == null) {
          searchInfo_ = null;
          onChanged();
        } else {
          searchInfo_ = null;
          searchInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder getSearchInfoBuilder() {
        
        onChanged();
        return getSearchInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      public emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder getSearchInfoOrBuilder() {
        if (searchInfoBuilder_ != null) {
          return searchInfoBuilder_.getMessageOrBuilder();
        } else {
          return searchInfo_ == null ?
              emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.getDefaultInstance() : searchInfo_;
        }
      }
      /**
       * <code>.HomeBlueprintSearchInfo search_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder> 
          getSearchInfoFieldBuilder() {
        if (searchInfoBuilder_ == null) {
          searchInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfo.Builder, emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.HomeBlueprintSearchInfoOrBuilder>(
                  getSearchInfo(),
                  getParentForChildren(),
                  isClean());
          searchInfo_ = null;
        }
        return searchInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeSearchBlueprintRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSearchBlueprintRsp)
    private static final emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp();
    }

    public static emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSearchBlueprintRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSearchBlueprintRsp>() {
      @java.lang.Override
      public HomeSearchBlueprintRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSearchBlueprintRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSearchBlueprintRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSearchBlueprintRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSearchBlueprintRspOuterClass.HomeSearchBlueprintRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSearchBlueprintRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSearchBlueprintRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeSearchBlueprintRsp.proto\032\035HomeBlue" +
      "printSearchInfo.proto\"X\n\026HomeSearchBluep" +
      "rintRsp\022\017\n\007retcode\030\010 \001(\005\022-\n\013search_info\030" +
      "\r \001(\0132\030.HomeBlueprintSearchInfoB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeSearchBlueprintRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSearchBlueprintRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSearchBlueprintRsp_descriptor,
        new java.lang.String[] { "Retcode", "SearchInfo", });
    emu.grasscutter.net.proto.HomeBlueprintSearchInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}