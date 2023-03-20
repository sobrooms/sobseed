// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class CustomDungeonUpdateNotifyOuterClass {
  private CustomDungeonUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     * @return Whether the dungeonBrief field is set.
     */
    boolean hasDungeonBrief();
    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     * @return The dungeonBrief.
     */
    emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief getDungeonBrief();
    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     */
    emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder getDungeonBriefOrBuilder();
  }
  /**
   * <pre>
   * Name: PMGNHJBGGAJ
   * CmdId: 6225
   * </pre>
   *
   * Protobuf type {@code CustomDungeonUpdateNotify}
   */
  public static final class CustomDungeonUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonUpdateNotify)
      CustomDungeonUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonUpdateNotify.newBuilder() to construct.
    private CustomDungeonUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonUpdateNotify(
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
            case 90: {
              emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder subBuilder = null;
              if (dungeonBrief_ != null) {
                subBuilder = dungeonBrief_.toBuilder();
              }
              dungeonBrief_ = input.readMessage(emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dungeonBrief_);
                dungeonBrief_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.internal_static_CustomDungeonUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.internal_static_CustomDungeonUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.class, emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.Builder.class);
    }

    public static final int DUNGEON_BRIEF_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief dungeonBrief_;
    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     * @return Whether the dungeonBrief field is set.
     */
    @java.lang.Override
    public boolean hasDungeonBrief() {
      return dungeonBrief_ != null;
    }
    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     * @return The dungeonBrief.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief getDungeonBrief() {
      return dungeonBrief_ == null ? emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.getDefaultInstance() : dungeonBrief_;
    }
    /**
     * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder getDungeonBriefOrBuilder() {
      return getDungeonBrief();
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
      if (dungeonBrief_ != null) {
        output.writeMessage(11, getDungeonBrief());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonBrief_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getDungeonBrief());
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
      if (!(obj instanceof emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify other = (emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify) obj;

      if (hasDungeonBrief() != other.hasDungeonBrief()) return false;
      if (hasDungeonBrief()) {
        if (!getDungeonBrief()
            .equals(other.getDungeonBrief())) return false;
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
      if (hasDungeonBrief()) {
        hash = (37 * hash) + DUNGEON_BRIEF_FIELD_NUMBER;
        hash = (53 * hash) + getDungeonBrief().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify prototype) {
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
     * Name: PMGNHJBGGAJ
     * CmdId: 6225
     * </pre>
     *
     * Protobuf type {@code CustomDungeonUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonUpdateNotify)
        emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.internal_static_CustomDungeonUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.internal_static_CustomDungeonUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.class, emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.newBuilder()
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
        if (dungeonBriefBuilder_ == null) {
          dungeonBrief_ = null;
        } else {
          dungeonBrief_ = null;
          dungeonBriefBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.internal_static_CustomDungeonUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify build() {
        emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify result = new emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify(this);
        if (dungeonBriefBuilder_ == null) {
          result.dungeonBrief_ = dungeonBrief_;
        } else {
          result.dungeonBrief_ = dungeonBriefBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify.getDefaultInstance()) return this;
        if (other.hasDungeonBrief()) {
          mergeDungeonBrief(other.getDungeonBrief());
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
        emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief dungeonBrief_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder> dungeonBriefBuilder_;
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       * @return Whether the dungeonBrief field is set.
       */
      public boolean hasDungeonBrief() {
        return dungeonBriefBuilder_ != null || dungeonBrief_ != null;
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       * @return The dungeonBrief.
       */
      public emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief getDungeonBrief() {
        if (dungeonBriefBuilder_ == null) {
          return dungeonBrief_ == null ? emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.getDefaultInstance() : dungeonBrief_;
        } else {
          return dungeonBriefBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public Builder setDungeonBrief(emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief value) {
        if (dungeonBriefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dungeonBrief_ = value;
          onChanged();
        } else {
          dungeonBriefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public Builder setDungeonBrief(
          emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder builderForValue) {
        if (dungeonBriefBuilder_ == null) {
          dungeonBrief_ = builderForValue.build();
          onChanged();
        } else {
          dungeonBriefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public Builder mergeDungeonBrief(emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief value) {
        if (dungeonBriefBuilder_ == null) {
          if (dungeonBrief_ != null) {
            dungeonBrief_ =
              emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.newBuilder(dungeonBrief_).mergeFrom(value).buildPartial();
          } else {
            dungeonBrief_ = value;
          }
          onChanged();
        } else {
          dungeonBriefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public Builder clearDungeonBrief() {
        if (dungeonBriefBuilder_ == null) {
          dungeonBrief_ = null;
          onChanged();
        } else {
          dungeonBrief_ = null;
          dungeonBriefBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder getDungeonBriefBuilder() {
        
        onChanged();
        return getDungeonBriefFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder getDungeonBriefOrBuilder() {
        if (dungeonBriefBuilder_ != null) {
          return dungeonBriefBuilder_.getMessageOrBuilder();
        } else {
          return dungeonBrief_ == null ?
              emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.getDefaultInstance() : dungeonBrief_;
        }
      }
      /**
       * <code>.CustomDungeonBrief dungeon_brief = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder> 
          getDungeonBriefFieldBuilder() {
        if (dungeonBriefBuilder_ == null) {
          dungeonBriefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBrief.Builder, emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.CustomDungeonBriefOrBuilder>(
                  getDungeonBrief(),
                  getParentForChildren(),
                  isClean());
          dungeonBrief_ = null;
        }
        return dungeonBriefBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonUpdateNotify)
    private static final emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify();
    }

    public static emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonUpdateNotify>() {
      @java.lang.Override
      public CustomDungeonUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonUpdateNotifyOuterClass.CustomDungeonUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CustomDungeonUpdateNotify.proto\032\030Custo" +
      "mDungeonBrief.proto\"G\n\031CustomDungeonUpda" +
      "teNotify\022*\n\rdungeon_brief\030\013 \001(\0132\023.Custom" +
      "DungeonBriefB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.getDescriptor(),
        });
    internal_static_CustomDungeonUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonUpdateNotify_descriptor,
        new java.lang.String[] { "DungeonBrief", });
    emu.grasscutter.net.proto.CustomDungeonBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
