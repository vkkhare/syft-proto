// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syft_proto/types/torch/v1/size.proto

package org.openmined.syftproto.types.torch.v1;

public final class SizeOuterClass {
  private SizeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SizeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:syft_proto.types.torch.v1.Size)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    java.util.List<java.lang.Integer> getDimsList();
    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    int getDimsCount();
    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    int getDims(int index);
  }
  /**
   * Protobuf type {@code syft_proto.types.torch.v1.Size}
   */
  public  static final class Size extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:syft_proto.types.torch.v1.Size)
      SizeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Size.newBuilder() to construct.
    private Size(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Size() {
      dims_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Size();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Size(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dims_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              dims_.addInt(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dims_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dims_.addInt(input.readInt32());
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
          dims_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.openmined.syftproto.types.torch.v1.SizeOuterClass.internal_static_syft_proto_types_torch_v1_Size_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.openmined.syftproto.types.torch.v1.SizeOuterClass.internal_static_syft_proto_types_torch_v1_Size_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.class, org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.Builder.class);
    }

    public static final int DIMS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList dims_;
    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    public java.util.List<java.lang.Integer>
        getDimsList() {
      return dims_;
    }
    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    public int getDimsCount() {
      return dims_.size();
    }
    /**
     * <code>repeated int32 dims = 1[json_name = "dims"];</code>
     */
    public int getDims(int index) {
      return dims_.getInt(index);
    }
    private int dimsMemoizedSerializedSize = -1;

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
      if (getDimsList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(dimsMemoizedSerializedSize);
      }
      for (int i = 0; i < dims_.size(); i++) {
        output.writeInt32NoTag(dims_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < dims_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dims_.getInt(i));
        }
        size += dataSize;
        if (!getDimsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dimsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size)) {
        return super.equals(obj);
      }
      org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size other = (org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size) obj;

      if (!getDimsList()
          .equals(other.getDimsList())) return false;
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
      if (getDimsCount() > 0) {
        hash = (37 * hash) + DIMS_FIELD_NUMBER;
        hash = (53 * hash) + getDimsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parseFrom(
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
    public static Builder newBuilder(org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size prototype) {
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
     * Protobuf type {@code syft_proto.types.torch.v1.Size}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:syft_proto.types.torch.v1.Size)
        org.openmined.syftproto.types.torch.v1.SizeOuterClass.SizeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.openmined.syftproto.types.torch.v1.SizeOuterClass.internal_static_syft_proto_types_torch_v1_Size_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.openmined.syftproto.types.torch.v1.SizeOuterClass.internal_static_syft_proto_types_torch_v1_Size_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.class, org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.Builder.class);
      }

      // Construct using org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.newBuilder()
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
        dims_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.openmined.syftproto.types.torch.v1.SizeOuterClass.internal_static_syft_proto_types_torch_v1_Size_descriptor;
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size getDefaultInstanceForType() {
        return org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.getDefaultInstance();
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size build() {
        org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size buildPartial() {
        org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size result = new org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dims_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dims_ = dims_;
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
        if (other instanceof org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size) {
          return mergeFrom((org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size other) {
        if (other == org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size.getDefaultInstance()) return this;
        if (!other.dims_.isEmpty()) {
          if (dims_.isEmpty()) {
            dims_ = other.dims_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimsIsMutable();
            dims_.addAll(other.dims_);
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
        org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList dims_ = emptyIntList();
      private void ensureDimsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dims_ = mutableCopy(dims_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public java.util.List<java.lang.Integer>
          getDimsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dims_) : dims_;
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public int getDimsCount() {
        return dims_.size();
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public int getDims(int index) {
        return dims_.getInt(index);
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public Builder setDims(
          int index, int value) {
        ensureDimsIsMutable();
        dims_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public Builder addDims(int value) {
        ensureDimsIsMutable();
        dims_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public Builder addAllDims(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDimsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dims_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 dims = 1[json_name = "dims"];</code>
       */
      public Builder clearDims() {
        dims_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:syft_proto.types.torch.v1.Size)
    }

    // @@protoc_insertion_point(class_scope:syft_proto.types.torch.v1.Size)
    private static final org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size();
    }

    public static org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Size>
        PARSER = new com.google.protobuf.AbstractParser<Size>() {
      @java.lang.Override
      public Size parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Size(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Size> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Size> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.openmined.syftproto.types.torch.v1.SizeOuterClass.Size getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_syft_proto_types_torch_v1_Size_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_syft_proto_types_torch_v1_Size_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$syft_proto/types/torch/v1/size.proto\022\031" +
      "syft_proto.types.torch.v1\"\032\n\004Size\022\022\n\004dim" +
      "s\030\001 \003(\005R\004dimsB(\n&org.openmined.syftproto" +
      ".types.torch.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_syft_proto_types_torch_v1_Size_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_syft_proto_types_torch_v1_Size_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_syft_proto_types_torch_v1_Size_descriptor,
        new java.lang.String[] { "Dims", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
