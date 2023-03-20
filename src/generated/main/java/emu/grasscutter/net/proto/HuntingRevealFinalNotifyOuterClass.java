// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingRevealFinalNotify.proto

package emu.grasscutter.net.proto;

public final class HuntingRevealFinalNotifyOuterClass {
  private HuntingRevealFinalNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HuntingRevealFinalNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HuntingRevealFinalNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector final_position = 9;</code>
     * @return Whether the finalPosition field is set.
     */
    boolean hasFinalPosition();
    /**
     * <code>.Vector final_position = 9;</code>
     * @return The finalPosition.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getFinalPosition();
    /**
     * <code>.Vector final_position = 9;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinalPositionOrBuilder();

    /**
     * <code>uint32 finished_group_id = 1;</code>
     * @return The finishedGroupId.
     */
    int getFinishedGroupId();

    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     * @return The huntingPair.
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();
  }
  /**
   * <pre>
   * Name: HEBIPDKBIJB
   * CmdId: 4339
   * </pre>
   *
   * Protobuf type {@code HuntingRevealFinalNotify}
   */
  public static final class HuntingRevealFinalNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingRevealFinalNotify)
      HuntingRevealFinalNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingRevealFinalNotify.newBuilder() to construct.
    private HuntingRevealFinalNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingRevealFinalNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingRevealFinalNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HuntingRevealFinalNotify(
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
            case 8: {

              finishedGroupId_ = input.readUInt32();
              break;
            }
            case 74: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (finalPosition_ != null) {
                subBuilder = finalPosition_.toBuilder();
              }
              finalPosition_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(finalPosition_);
                finalPosition_ = subBuilder.buildPartial();
              }

              break;
            }
            case 98: {
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder subBuilder = null;
              if (huntingPair_ != null) {
                subBuilder = huntingPair_.toBuilder();
              }
              huntingPair_ = input.readMessage(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(huntingPair_);
                huntingPair_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.internal_static_HuntingRevealFinalNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.internal_static_HuntingRevealFinalNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.class, emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.Builder.class);
    }

    public static final int FINAL_POSITION_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector finalPosition_;
    /**
     * <code>.Vector final_position = 9;</code>
     * @return Whether the finalPosition field is set.
     */
    @java.lang.Override
    public boolean hasFinalPosition() {
      return finalPosition_ != null;
    }
    /**
     * <code>.Vector final_position = 9;</code>
     * @return The finalPosition.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getFinalPosition() {
      return finalPosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finalPosition_;
    }
    /**
     * <code>.Vector final_position = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinalPositionOrBuilder() {
      return getFinalPosition();
    }

    public static final int FINISHED_GROUP_ID_FIELD_NUMBER = 1;
    private int finishedGroupId_;
    /**
     * <code>uint32 finished_group_id = 1;</code>
     * @return The finishedGroupId.
     */
    @java.lang.Override
    public int getFinishedGroupId() {
      return finishedGroupId_;
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return getHuntingPair();
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
      if (finishedGroupId_ != 0) {
        output.writeUInt32(1, finishedGroupId_);
      }
      if (finalPosition_ != null) {
        output.writeMessage(9, getFinalPosition());
      }
      if (huntingPair_ != null) {
        output.writeMessage(12, getHuntingPair());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishedGroupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, finishedGroupId_);
      }
      if (finalPosition_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getFinalPosition());
      }
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getHuntingPair());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify other = (emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify) obj;

      if (hasFinalPosition() != other.hasFinalPosition()) return false;
      if (hasFinalPosition()) {
        if (!getFinalPosition()
            .equals(other.getFinalPosition())) return false;
      }
      if (getFinishedGroupId()
          != other.getFinishedGroupId()) return false;
      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
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
      if (hasFinalPosition()) {
        hash = (37 * hash) + FINAL_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getFinalPosition().hashCode();
      }
      hash = (37 * hash) + FINISHED_GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedGroupId();
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify prototype) {
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
     * Name: HEBIPDKBIJB
     * CmdId: 4339
     * </pre>
     *
     * Protobuf type {@code HuntingRevealFinalNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingRevealFinalNotify)
        emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.internal_static_HuntingRevealFinalNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.internal_static_HuntingRevealFinalNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.class, emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.newBuilder()
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
        if (finalPositionBuilder_ == null) {
          finalPosition_ = null;
        } else {
          finalPosition_ = null;
          finalPositionBuilder_ = null;
        }
        finishedGroupId_ = 0;

        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.internal_static_HuntingRevealFinalNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify build() {
        emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify buildPartial() {
        emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify result = new emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify(this);
        if (finalPositionBuilder_ == null) {
          result.finalPosition_ = finalPosition_;
        } else {
          result.finalPosition_ = finalPositionBuilder_.build();
        }
        result.finishedGroupId_ = finishedGroupId_;
        if (huntingPairBuilder_ == null) {
          result.huntingPair_ = huntingPair_;
        } else {
          result.huntingPair_ = huntingPairBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify other) {
        if (other == emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify.getDefaultInstance()) return this;
        if (other.hasFinalPosition()) {
          mergeFinalPosition(other.getFinalPosition());
        }
        if (other.getFinishedGroupId() != 0) {
          setFinishedGroupId(other.getFinishedGroupId());
        }
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
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
        emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector finalPosition_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> finalPositionBuilder_;
      /**
       * <code>.Vector final_position = 9;</code>
       * @return Whether the finalPosition field is set.
       */
      public boolean hasFinalPosition() {
        return finalPositionBuilder_ != null || finalPosition_ != null;
      }
      /**
       * <code>.Vector final_position = 9;</code>
       * @return The finalPosition.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getFinalPosition() {
        if (finalPositionBuilder_ == null) {
          return finalPosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finalPosition_;
        } else {
          return finalPositionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public Builder setFinalPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (finalPositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          finalPosition_ = value;
          onChanged();
        } else {
          finalPositionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public Builder setFinalPosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (finalPositionBuilder_ == null) {
          finalPosition_ = builderForValue.build();
          onChanged();
        } else {
          finalPositionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public Builder mergeFinalPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (finalPositionBuilder_ == null) {
          if (finalPosition_ != null) {
            finalPosition_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(finalPosition_).mergeFrom(value).buildPartial();
          } else {
            finalPosition_ = value;
          }
          onChanged();
        } else {
          finalPositionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public Builder clearFinalPosition() {
        if (finalPositionBuilder_ == null) {
          finalPosition_ = null;
          onChanged();
        } else {
          finalPosition_ = null;
          finalPositionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getFinalPositionBuilder() {
        
        onChanged();
        return getFinalPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getFinalPositionOrBuilder() {
        if (finalPositionBuilder_ != null) {
          return finalPositionBuilder_.getMessageOrBuilder();
        } else {
          return finalPosition_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : finalPosition_;
        }
      }
      /**
       * <code>.Vector final_position = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getFinalPositionFieldBuilder() {
        if (finalPositionBuilder_ == null) {
          finalPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getFinalPosition(),
                  getParentForChildren(),
                  isClean());
          finalPosition_ = null;
        }
        return finalPositionBuilder_;
      }

      private int finishedGroupId_ ;
      /**
       * <code>uint32 finished_group_id = 1;</code>
       * @return The finishedGroupId.
       */
      @java.lang.Override
      public int getFinishedGroupId() {
        return finishedGroupId_;
      }
      /**
       * <code>uint32 finished_group_id = 1;</code>
       * @param value The finishedGroupId to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedGroupId(int value) {
        
        finishedGroupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finished_group_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedGroupId() {
        
        finishedGroupId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return huntingPairBuilder_ != null || huntingPair_ != null;
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       * @return The huntingPair.
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public Builder setHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public Builder setHuntingPair(
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public Builder mergeHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (huntingPair_ != null) {
            huntingPair_ =
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.newBuilder(huntingPair_).mergeFrom(value).buildPartial();
          } else {
            huntingPair_ = value;
          }
          onChanged();
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public Builder clearHuntingPair() {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
          onChanged();
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HuntingRevealFinalNotify)
    }

    // @@protoc_insertion_point(class_scope:HuntingRevealFinalNotify)
    private static final emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify();
    }

    public static emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HuntingRevealFinalNotify>
        PARSER = new com.google.protobuf.AbstractParser<HuntingRevealFinalNotify>() {
      @java.lang.Override
      public HuntingRevealFinalNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HuntingRevealFinalNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HuntingRevealFinalNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingRevealFinalNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingRevealFinalNotifyOuterClass.HuntingRevealFinalNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HuntingRevealFinalNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HuntingRevealFinalNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036HuntingRevealFinalNotify.proto\032\021Huntin" +
      "gPair.proto\032\014Vector.proto\"z\n\030HuntingReve" +
      "alFinalNotify\022\037\n\016final_position\030\t \001(\0132\007." +
      "Vector\022\031\n\021finished_group_id\030\001 \001(\r\022\"\n\014hun" +
      "ting_pair\030\014 \001(\0132\014.HuntingPairB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HuntingRevealFinalNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HuntingRevealFinalNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingRevealFinalNotify_descriptor,
        new java.lang.String[] { "FinalPosition", "FinishedGroupId", "HuntingPair", });
    emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
