// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syft_proto/types/torch/v1/c_function.proto

package org.openmined.syftproto.types.torch.v1;

public final class CFunctionOuterClass {
  private CFunctionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CFunctionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:syft_proto.types.torch.v1.CFunction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes obj = 1[json_name = "obj"];</code>
     */
    com.google.protobuf.ByteString getObj();
  }
  /**
   * <pre>
   * torch._C.Function
   * </pre>
   *
   * Protobuf type {@code syft_proto.types.torch.v1.CFunction}
   */
  public  static final class CFunction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:syft_proto.types.torch.v1.CFunction)
      CFunctionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CFunction.newBuilder() to construct.
    private CFunction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CFunction() {
      obj_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CFunction();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CFunction(
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
            case 10: {

              obj_ = input.readBytes();
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
      return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.internal_static_syft_proto_types_torch_v1_CFunction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.internal_static_syft_proto_types_torch_v1_CFunction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.class, org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.Builder.class);
    }

    public static final int OBJ_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString obj_;
    /**
     * <code>bytes obj = 1[json_name = "obj"];</code>
     */
    public com.google.protobuf.ByteString getObj() {
      return obj_;
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
      if (!obj_.isEmpty()) {
        output.writeBytes(1, obj_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!obj_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, obj_);
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
      if (!(obj instanceof org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction)) {
        return super.equals(obj);
      }
      org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction other = (org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction) obj;

      if (!getObj()
          .equals(other.getObj())) return false;
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
      hash = (37 * hash) + OBJ_FIELD_NUMBER;
      hash = (53 * hash) + getObj().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parseFrom(
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
    public static Builder newBuilder(org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction prototype) {
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
     * torch._C.Function
     * </pre>
     *
     * Protobuf type {@code syft_proto.types.torch.v1.CFunction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:syft_proto.types.torch.v1.CFunction)
        org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunctionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.internal_static_syft_proto_types_torch_v1_CFunction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.internal_static_syft_proto_types_torch_v1_CFunction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.class, org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.Builder.class);
      }

      // Construct using org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.newBuilder()
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
        obj_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.internal_static_syft_proto_types_torch_v1_CFunction_descriptor;
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction getDefaultInstanceForType() {
        return org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.getDefaultInstance();
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction build() {
        org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction buildPartial() {
        org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction result = new org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction(this);
        result.obj_ = obj_;
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
        if (other instanceof org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction) {
          return mergeFrom((org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction other) {
        if (other == org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction.getDefaultInstance()) return this;
        if (other.getObj() != com.google.protobuf.ByteString.EMPTY) {
          setObj(other.getObj());
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
        org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString obj_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes obj = 1[json_name = "obj"];</code>
       */
      public com.google.protobuf.ByteString getObj() {
        return obj_;
      }
      /**
       * <code>bytes obj = 1[json_name = "obj"];</code>
       */
      public Builder setObj(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        obj_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes obj = 1[json_name = "obj"];</code>
       */
      public Builder clearObj() {
        
        obj_ = getDefaultInstance().getObj();
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


      // @@protoc_insertion_point(builder_scope:syft_proto.types.torch.v1.CFunction)
    }

    // @@protoc_insertion_point(class_scope:syft_proto.types.torch.v1.CFunction)
    private static final org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction();
    }

    public static org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CFunction>
        PARSER = new com.google.protobuf.AbstractParser<CFunction>() {
      @java.lang.Override
      public CFunction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CFunction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CFunction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CFunction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.openmined.syftproto.types.torch.v1.CFunctionOuterClass.CFunction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_syft_proto_types_torch_v1_CFunction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_syft_proto_types_torch_v1_CFunction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*syft_proto/types/torch/v1/c_function.p" +
      "roto\022\031syft_proto.types.torch.v1\"\035\n\tCFunc" +
      "tion\022\020\n\003obj\030\001 \001(\014R\003objB(\n&org.openmined." +
      "syftproto.types.torch.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_syft_proto_types_torch_v1_CFunction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_syft_proto_types_torch_v1_CFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_syft_proto_types_torch_v1_CFunction_descriptor,
        new java.lang.String[] { "Obj", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}