// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerInfo.proto

package emu.grasscutter.net.proto;

public final class ScenePlayerInfoOuterClass {
  private ScenePlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     * @return Whether the onlinePlayerInfo field is set.
     */
    boolean hasOnlinePlayerInfo();
    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     * @return The onlinePlayerInfo.
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo();
    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder();

    /**
     * <code>string name = 11;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 11;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 peer_id = 13;</code>
     * @return The peerId.
     */
    int getPeerId();

    /**
     * <code>bool is_connected = 14;</code>
     * @return The isConnected.
     */
    boolean getIsConnected();
  }
  /**
   * <pre>
   * Name: OMMENNJPOHG
   * </pre>
   *
   * Protobuf type {@code ScenePlayerInfo}
   */
  public static final class ScenePlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerInfo)
      ScenePlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerInfo.newBuilder() to construct.
    private ScenePlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerInfo() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayerInfo(
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

              uid_ = input.readUInt32();
              break;
            }
            case 72: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
              if (onlinePlayerInfo_ != null) {
                subBuilder = onlinePlayerInfo_.toBuilder();
              }
              onlinePlayerInfo_ = input.readMessage(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(onlinePlayerInfo_);
                onlinePlayerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 104: {

              peerId_ = input.readUInt32();
              break;
            }
            case 112: {

              isConnected_ = input.readBool();
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
      return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.class, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int ONLINE_PLAYER_INFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     * @return Whether the onlinePlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasOnlinePlayerInfo() {
      return onlinePlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     * @return The onlinePlayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
      return onlinePlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo online_player_info = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
      return getOnlinePlayerInfo();
    }

    public static final int NAME_FIELD_NUMBER = 11;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 11;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 11;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCENE_ID_FIELD_NUMBER = 9;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int PEER_ID_FIELD_NUMBER = 13;
    private int peerId_;
    /**
     * <code>uint32 peer_id = 13;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }

    public static final int IS_CONNECTED_FIELD_NUMBER = 14;
    private boolean isConnected_;
    /**
     * <code>bool is_connected = 14;</code>
     * @return The isConnected.
     */
    @java.lang.Override
    public boolean getIsConnected() {
      return isConnected_;
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
      if (uid_ != 0) {
        output.writeUInt32(1, uid_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(9, sceneId_);
      }
      if (onlinePlayerInfo_ != null) {
        output.writeMessage(10, getOnlinePlayerInfo());
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, name_);
      }
      if (peerId_ != 0) {
        output.writeUInt32(13, peerId_);
      }
      if (isConnected_ != false) {
        output.writeBool(14, isConnected_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, uid_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sceneId_);
      }
      if (onlinePlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getOnlinePlayerInfo());
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, name_);
      }
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, peerId_);
      }
      if (isConnected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isConnected_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo other = (emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo) obj;

      if (getUid()
          != other.getUid()) return false;
      if (hasOnlinePlayerInfo() != other.hasOnlinePlayerInfo()) return false;
      if (hasOnlinePlayerInfo()) {
        if (!getOnlinePlayerInfo()
            .equals(other.getOnlinePlayerInfo())) return false;
      }
      if (!getName()
          .equals(other.getName())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getPeerId()
          != other.getPeerId()) return false;
      if (getIsConnected()
          != other.getIsConnected()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (hasOnlinePlayerInfo()) {
        hash = (37 * hash) + ONLINE_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getOnlinePlayerInfo().hashCode();
      }
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      hash = (37 * hash) + IS_CONNECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsConnected());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo prototype) {
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
     * Name: OMMENNJPOHG
     * </pre>
     *
     * Protobuf type {@code ScenePlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerInfo)
        emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.class, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.newBuilder()
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
        uid_ = 0;

        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = null;
        } else {
          onlinePlayerInfo_ = null;
          onlinePlayerInfoBuilder_ = null;
        }
        name_ = "";

        sceneId_ = 0;

        peerId_ = 0;

        isConnected_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.internal_static_ScenePlayerInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo build() {
        emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo buildPartial() {
        emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo result = new emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo(this);
        result.uid_ = uid_;
        if (onlinePlayerInfoBuilder_ == null) {
          result.onlinePlayerInfo_ = onlinePlayerInfo_;
        } else {
          result.onlinePlayerInfo_ = onlinePlayerInfoBuilder_.build();
        }
        result.name_ = name_;
        result.sceneId_ = sceneId_;
        result.peerId_ = peerId_;
        result.isConnected_ = isConnected_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo other) {
        if (other == emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.hasOnlinePlayerInfo()) {
          mergeOnlinePlayerInfo(other.getOnlinePlayerInfo());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
        }
        if (other.getIsConnected() != false) {
          setIsConnected(other.getIsConnected());
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
        emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 1;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo onlinePlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> onlinePlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       * @return Whether the onlinePlayerInfo field is set.
       */
      public boolean hasOnlinePlayerInfo() {
        return onlinePlayerInfoBuilder_ != null || onlinePlayerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       * @return The onlinePlayerInfo.
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getOnlinePlayerInfo() {
        if (onlinePlayerInfoBuilder_ == null) {
          return onlinePlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
        } else {
          return onlinePlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public Builder setOnlinePlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (onlinePlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          onlinePlayerInfo_ = value;
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public Builder setOnlinePlayerInfo(
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public Builder mergeOnlinePlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (onlinePlayerInfoBuilder_ == null) {
          if (onlinePlayerInfo_ != null) {
            onlinePlayerInfo_ =
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(onlinePlayerInfo_).mergeFrom(value).buildPartial();
          } else {
            onlinePlayerInfo_ = value;
          }
          onChanged();
        } else {
          onlinePlayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public Builder clearOnlinePlayerInfo() {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfo_ = null;
          onChanged();
        } else {
          onlinePlayerInfo_ = null;
          onlinePlayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getOnlinePlayerInfoBuilder() {
        
        onChanged();
        return getOnlinePlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getOnlinePlayerInfoOrBuilder() {
        if (onlinePlayerInfoBuilder_ != null) {
          return onlinePlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return onlinePlayerInfo_ == null ?
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : onlinePlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo online_player_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getOnlinePlayerInfoFieldBuilder() {
        if (onlinePlayerInfoBuilder_ == null) {
          onlinePlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getOnlinePlayerInfo(),
                  getParentForChildren(),
                  isClean());
          onlinePlayerInfo_ = null;
        }
        return onlinePlayerInfoBuilder_;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 11;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 11;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 11;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 11;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int peerId_ ;
      /**
       * <code>uint32 peer_id = 13;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <code>uint32 peer_id = 13;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 peer_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
        onChanged();
        return this;
      }

      private boolean isConnected_ ;
      /**
       * <code>bool is_connected = 14;</code>
       * @return The isConnected.
       */
      @java.lang.Override
      public boolean getIsConnected() {
        return isConnected_;
      }
      /**
       * <code>bool is_connected = 14;</code>
       * @param value The isConnected to set.
       * @return This builder for chaining.
       */
      public Builder setIsConnected(boolean value) {
        
        isConnected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_connected = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsConnected() {
        
        isConnected_ = false;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerInfo)
    private static final emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo();
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerInfo>() {
      @java.lang.Override
      public ScenePlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ScenePlayerInfo.proto\032\026OnlinePlayerInf" +
      "o.proto\"\224\001\n\017ScenePlayerInfo\022\013\n\003uid\030\001 \001(\r" +
      "\022-\n\022online_player_info\030\n \001(\0132\021.OnlinePla" +
      "yerInfo\022\014\n\004name\030\013 \001(\t\022\020\n\010scene_id\030\t \001(\r\022" +
      "\017\n\007peer_id\030\r \001(\r\022\024\n\014is_connected\030\016 \001(\010B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerInfo_descriptor,
        new java.lang.String[] { "Uid", "OnlinePlayerInfo", "Name", "SceneId", "PeerId", "IsConnected", });
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
