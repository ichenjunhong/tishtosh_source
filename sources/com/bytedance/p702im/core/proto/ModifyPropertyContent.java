package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyPropertyContent */
public final class ModifyPropertyContent extends Message<ModifyPropertyContent, Builder> {
    public static final ProtoAdapter<ModifyPropertyContent> ADAPTER = new ProtoAdapter_ModifyPropertyContent();
    public static final OPERATION_TYPE DEFAULT_OPERATION = OPERATION_TYPE.ADD_PROPERTY_ITEM;
    private static final long serialVersionUID = 0;
    public final String idempotent_id;
    public final String key;
    public final OPERATION_TYPE operation;
    public final String value;

    /* renamed from: com.bytedance.im.core.proto.ModifyPropertyContent$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyPropertyContent, Builder> {
        public String idempotent_id;
        public String key;
        public OPERATION_TYPE operation;
        public String value;

        public final ModifyPropertyContent build() {
            ModifyPropertyContent modifyPropertyContent = new ModifyPropertyContent(this.operation, this.key, this.value, this.idempotent_id, super.buildUnknownFields());
            return modifyPropertyContent;
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder key(String str) {
            this.key = str;
            return this;
        }

        public final Builder operation(OPERATION_TYPE operation_type) {
            this.operation = operation_type;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyPropertyContent$ProtoAdapter_ModifyPropertyContent */
    static final class ProtoAdapter_ModifyPropertyContent extends ProtoAdapter<ModifyPropertyContent> {
        public ProtoAdapter_ModifyPropertyContent() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyContent.class);
        }

        public final ModifyPropertyContent redact(ModifyPropertyContent modifyPropertyContent) {
            Builder newBuilder = modifyPropertyContent.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ModifyPropertyContent modifyPropertyContent) {
            return OPERATION_TYPE.ADAPTER.encodedSizeWithTag(1, modifyPropertyContent.operation) + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyPropertyContent.key) + ProtoAdapter.STRING.encodedSizeWithTag(3, modifyPropertyContent.value) + ProtoAdapter.STRING.encodedSizeWithTag(4, modifyPropertyContent.idempotent_id) + modifyPropertyContent.unknownFields().size();
        }

        public final ModifyPropertyContent decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.operation((OPERATION_TYPE) OPERATION_TYPE.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            builder.key((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.value((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.idempotent_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyPropertyContent modifyPropertyContent) throws IOException {
            OPERATION_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, modifyPropertyContent.operation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyPropertyContent.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, modifyPropertyContent.value);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, modifyPropertyContent.idempotent_id);
            protoWriter.writeBytes(modifyPropertyContent.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.operation = this.operation;
        builder.key = this.key;
        builder.value = this.value;
        builder.idempotent_id = this.idempotent_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyPropertyContent{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyPropertyContent(OPERATION_TYPE operation_type, String str, String str2, String str3) {
        this(operation_type, str, str2, str3, ByteString.EMPTY);
    }

    public ModifyPropertyContent(OPERATION_TYPE operation_type, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation = operation_type;
        this.key = str;
        this.value = str2;
        this.idempotent_id = str3;
    }
}
