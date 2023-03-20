// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgClientPerform.proto

package emu.grasscutter.net.proto;

public final class GCGMsgClientPerformOuterClass {
  private GCGMsgClientPerformOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgClientPerformOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgClientPerform)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGClientPerformType perform_type = 3;</code>
     * @return The enum numeric value on the wire for performType.
     */
    int getPerformTypeValue();
    /**
     * <code>.GCGClientPerformType perform_type = 3;</code>
     * @return The performType.
     */
    emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType getPerformType();

    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);
  }
  /**
   * <pre>
   * Name: DIGAEAGCDDK
   * </pre>
   *
   * Protobuf type {@code GCGMsgClientPerform}
   */
  public static final class GCGMsgClientPerform extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgClientPerform)
      GCGMsgClientPerformOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgClientPerform.newBuilder() to construct.
    private GCGMsgClientPerform(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgClientPerform() {
      performType_ = 0;
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgClientPerform();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgClientPerform(
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
            case 24: {
              int rawValue = input.readEnum();

              performType_ = rawValue;
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readUInt32());
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
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.internal_static_GCGMsgClientPerform_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.internal_static_GCGMsgClientPerform_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.class, emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.Builder.class);
    }

    public static final int PERFORM_TYPE_FIELD_NUMBER = 3;
    private int performType_;
    /**
     * <code>.GCGClientPerformType perform_type = 3;</code>
     * @return The enum numeric value on the wire for performType.
     */
    @java.lang.Override public int getPerformTypeValue() {
      return performType_;
    }
    /**
     * <code>.GCGClientPerformType perform_type = 3;</code>
     * @return The performType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType getPerformType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType result = emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.valueOf(performType_);
      return result == null ? emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.UNRECOGNIZED : result;
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 param_list = 5;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

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
      if (performType_ != emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.GCG_PERFORM_INVALID.getNumber()) {
        output.writeEnum(3, performType_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (performType_ != emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.GCG_PERFORM_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, performType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform other = (emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform) obj;

      if (performType_ != other.performType_) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
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
      hash = (37 * hash) + PERFORM_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + performType_;
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform prototype) {
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
     * Name: DIGAEAGCDDK
     * </pre>
     *
     * Protobuf type {@code GCGMsgClientPerform}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgClientPerform)
        emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerformOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.internal_static_GCGMsgClientPerform_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.internal_static_GCGMsgClientPerform_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.class, emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.newBuilder()
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
        performType_ = 0;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.internal_static_GCGMsgClientPerform_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform build() {
        emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform buildPartial() {
        emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform result = new emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform(this);
        int from_bitField0_ = bitField0_;
        result.performType_ = performType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform other) {
        if (other == emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform.getDefaultInstance()) return this;
        if (other.performType_ != 0) {
          setPerformTypeValue(other.getPerformTypeValue());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
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
        emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int performType_ = 0;
      /**
       * <code>.GCGClientPerformType perform_type = 3;</code>
       * @return The enum numeric value on the wire for performType.
       */
      @java.lang.Override public int getPerformTypeValue() {
        return performType_;
      }
      /**
       * <code>.GCGClientPerformType perform_type = 3;</code>
       * @param value The enum numeric value on the wire for performType to set.
       * @return This builder for chaining.
       */
      public Builder setPerformTypeValue(int value) {
        
        performType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGClientPerformType perform_type = 3;</code>
       * @return The performType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType getPerformType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType result = emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.valueOf(performType_);
        return result == null ? emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGClientPerformType perform_type = 3;</code>
       * @param value The performType to set.
       * @return This builder for chaining.
       */
      public Builder setPerformType(emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.GCGClientPerformType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        performType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGClientPerformType perform_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPerformType() {
        
        performType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGMsgClientPerform)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgClientPerform)
    private static final emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform();
    }

    public static emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgClientPerform>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgClientPerform>() {
      @java.lang.Override
      public GCGMsgClientPerform parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgClientPerform(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgClientPerform> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgClientPerform> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgClientPerformOuterClass.GCGMsgClientPerform getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgClientPerform_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgClientPerform_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGMsgClientPerform.proto\032\032GCGClientPe" +
      "rformType.proto\"V\n\023GCGMsgClientPerform\022+" +
      "\n\014perform_type\030\003 \001(\0162\025.GCGClientPerformT" +
      "ype\022\022\n\nparam_list\030\005 \003(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgClientPerform_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgClientPerform_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgClientPerform_descriptor,
        new java.lang.String[] { "PerformType", "ParamList", });
    emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
