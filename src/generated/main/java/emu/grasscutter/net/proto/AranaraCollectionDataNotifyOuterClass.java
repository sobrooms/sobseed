// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AranaraCollectionDataNotify.proto

package emu.grasscutter.net.proto;

public final class AranaraCollectionDataNotifyOuterClass {
  private AranaraCollectionDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AranaraCollectionDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AranaraCollectionDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> 
        getCollectionSuiteListList();
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite getCollectionSuiteList(int index);
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    int getCollectionSuiteListCount();
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder> 
        getCollectionSuiteListOrBuilderList();
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder getCollectionSuiteListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: KPDCOFIBKFD
   * CmdId: 6398
   * </pre>
   *
   * Protobuf type {@code AranaraCollectionDataNotify}
   */
  public static final class AranaraCollectionDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AranaraCollectionDataNotify)
      AranaraCollectionDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AranaraCollectionDataNotify.newBuilder() to construct.
    private AranaraCollectionDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AranaraCollectionDataNotify() {
      collectionSuiteList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AranaraCollectionDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AranaraCollectionDataNotify(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                collectionSuiteList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite>();
                mutable_bitField0_ |= 0x00000001;
              }
              collectionSuiteList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.parser(), extensionRegistry));
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
          collectionSuiteList_ = java.util.Collections.unmodifiableList(collectionSuiteList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.internal_static_AranaraCollectionDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.internal_static_AranaraCollectionDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.class, emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.Builder.class);
    }

    public static final int COLLECTION_SUITE_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> collectionSuiteList_;
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> getCollectionSuiteListList() {
      return collectionSuiteList_;
    }
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder> 
        getCollectionSuiteListOrBuilderList() {
      return collectionSuiteList_;
    }
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    @java.lang.Override
    public int getCollectionSuiteListCount() {
      return collectionSuiteList_.size();
    }
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite getCollectionSuiteList(int index) {
      return collectionSuiteList_.get(index);
    }
    /**
     * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder getCollectionSuiteListOrBuilder(
        int index) {
      return collectionSuiteList_.get(index);
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
      for (int i = 0; i < collectionSuiteList_.size(); i++) {
        output.writeMessage(6, collectionSuiteList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < collectionSuiteList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, collectionSuiteList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify other = (emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify) obj;

      if (!getCollectionSuiteListList()
          .equals(other.getCollectionSuiteListList())) return false;
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
      if (getCollectionSuiteListCount() > 0) {
        hash = (37 * hash) + COLLECTION_SUITE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCollectionSuiteListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify prototype) {
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
     * Name: KPDCOFIBKFD
     * CmdId: 6398
     * </pre>
     *
     * Protobuf type {@code AranaraCollectionDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AranaraCollectionDataNotify)
        emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.internal_static_AranaraCollectionDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.internal_static_AranaraCollectionDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.class, emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.newBuilder()
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
          getCollectionSuiteListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (collectionSuiteListBuilder_ == null) {
          collectionSuiteList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          collectionSuiteListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.internal_static_AranaraCollectionDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify build() {
        emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify buildPartial() {
        emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify result = new emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (collectionSuiteListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            collectionSuiteList_ = java.util.Collections.unmodifiableList(collectionSuiteList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.collectionSuiteList_ = collectionSuiteList_;
        } else {
          result.collectionSuiteList_ = collectionSuiteListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify other) {
        if (other == emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify.getDefaultInstance()) return this;
        if (collectionSuiteListBuilder_ == null) {
          if (!other.collectionSuiteList_.isEmpty()) {
            if (collectionSuiteList_.isEmpty()) {
              collectionSuiteList_ = other.collectionSuiteList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCollectionSuiteListIsMutable();
              collectionSuiteList_.addAll(other.collectionSuiteList_);
            }
            onChanged();
          }
        } else {
          if (!other.collectionSuiteList_.isEmpty()) {
            if (collectionSuiteListBuilder_.isEmpty()) {
              collectionSuiteListBuilder_.dispose();
              collectionSuiteListBuilder_ = null;
              collectionSuiteList_ = other.collectionSuiteList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              collectionSuiteListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCollectionSuiteListFieldBuilder() : null;
            } else {
              collectionSuiteListBuilder_.addAllMessages(other.collectionSuiteList_);
            }
          }
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
        emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> collectionSuiteList_ =
        java.util.Collections.emptyList();
      private void ensureCollectionSuiteListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          collectionSuiteList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite>(collectionSuiteList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder> collectionSuiteListBuilder_;

      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> getCollectionSuiteListList() {
        if (collectionSuiteListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(collectionSuiteList_);
        } else {
          return collectionSuiteListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public int getCollectionSuiteListCount() {
        if (collectionSuiteListBuilder_ == null) {
          return collectionSuiteList_.size();
        } else {
          return collectionSuiteListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite getCollectionSuiteList(int index) {
        if (collectionSuiteListBuilder_ == null) {
          return collectionSuiteList_.get(index);
        } else {
          return collectionSuiteListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder setCollectionSuiteList(
          int index, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite value) {
        if (collectionSuiteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.set(index, value);
          onChanged();
        } else {
          collectionSuiteListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder setCollectionSuiteList(
          int index, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder builderForValue) {
        if (collectionSuiteListBuilder_ == null) {
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.set(index, builderForValue.build());
          onChanged();
        } else {
          collectionSuiteListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder addCollectionSuiteList(emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite value) {
        if (collectionSuiteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.add(value);
          onChanged();
        } else {
          collectionSuiteListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder addCollectionSuiteList(
          int index, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite value) {
        if (collectionSuiteListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.add(index, value);
          onChanged();
        } else {
          collectionSuiteListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder addCollectionSuiteList(
          emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder builderForValue) {
        if (collectionSuiteListBuilder_ == null) {
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.add(builderForValue.build());
          onChanged();
        } else {
          collectionSuiteListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder addCollectionSuiteList(
          int index, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder builderForValue) {
        if (collectionSuiteListBuilder_ == null) {
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.add(index, builderForValue.build());
          onChanged();
        } else {
          collectionSuiteListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder addAllCollectionSuiteList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite> values) {
        if (collectionSuiteListBuilder_ == null) {
          ensureCollectionSuiteListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, collectionSuiteList_);
          onChanged();
        } else {
          collectionSuiteListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder clearCollectionSuiteList() {
        if (collectionSuiteListBuilder_ == null) {
          collectionSuiteList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          collectionSuiteListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public Builder removeCollectionSuiteList(int index) {
        if (collectionSuiteListBuilder_ == null) {
          ensureCollectionSuiteListIsMutable();
          collectionSuiteList_.remove(index);
          onChanged();
        } else {
          collectionSuiteListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder getCollectionSuiteListBuilder(
          int index) {
        return getCollectionSuiteListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder getCollectionSuiteListOrBuilder(
          int index) {
        if (collectionSuiteListBuilder_ == null) {
          return collectionSuiteList_.get(index);  } else {
          return collectionSuiteListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder> 
           getCollectionSuiteListOrBuilderList() {
        if (collectionSuiteListBuilder_ != null) {
          return collectionSuiteListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(collectionSuiteList_);
        }
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder addCollectionSuiteListBuilder() {
        return getCollectionSuiteListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.getDefaultInstance());
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder addCollectionSuiteListBuilder(
          int index) {
        return getCollectionSuiteListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.getDefaultInstance());
      }
      /**
       * <code>repeated .AranaraCollectionSuite collection_suite_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder> 
           getCollectionSuiteListBuilderList() {
        return getCollectionSuiteListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder> 
          getCollectionSuiteListFieldBuilder() {
        if (collectionSuiteListBuilder_ == null) {
          collectionSuiteListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuite.Builder, emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.AranaraCollectionSuiteOrBuilder>(
                  collectionSuiteList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          collectionSuiteList_ = null;
        }
        return collectionSuiteListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AranaraCollectionDataNotify)
    }

    // @@protoc_insertion_point(class_scope:AranaraCollectionDataNotify)
    private static final emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify();
    }

    public static emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AranaraCollectionDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<AranaraCollectionDataNotify>() {
      @java.lang.Override
      public AranaraCollectionDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AranaraCollectionDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AranaraCollectionDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AranaraCollectionDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AranaraCollectionDataNotifyOuterClass.AranaraCollectionDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AranaraCollectionDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AranaraCollectionDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AranaraCollectionDataNotify.proto\032\034Ara" +
      "naraCollectionSuite.proto\"U\n\033AranaraColl" +
      "ectionDataNotify\0226\n\025collection_suite_lis" +
      "t\030\006 \003(\0132\027.AranaraCollectionSuiteB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.getDescriptor(),
        });
    internal_static_AranaraCollectionDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AranaraCollectionDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AranaraCollectionDataNotify_descriptor,
        new java.lang.String[] { "CollectionSuiteList", });
    emu.grasscutter.net.proto.AranaraCollectionSuiteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
