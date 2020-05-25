package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody */
public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyResponseBody();
    public static final ModifyMessagePropertyStatus DEFAULT_STATUS = ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS;
    public static final Long DEFAULT_VERSION = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final ModifyMessagePropertyStatus status;
    public final Long version;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyMessagePropertyResponseBody, Builder> {
        public ModifyMessagePropertyStatus status;
        public Long version;

        public final ModifyMessagePropertyResponseBody build() {
            return new ModifyMessagePropertyResponseBody(this.status, this.version, super.buildUnknownFields());
        }

        public final Builder status(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
            this.status = modifyMessagePropertyStatus;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$ProtoAdapter_ModifyMessagePropertyResponseBody */
    static final class ProtoAdapter_ModifyMessagePropertyResponseBody extends ProtoAdapter<ModifyMessagePropertyResponseBody> {
        public ProtoAdapter_ModifyMessagePropertyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyResponseBody.class);
        }

        public final ModifyMessagePropertyResponseBody redact(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            Builder newBuilder = modifyMessagePropertyResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            return ModifyMessagePropertyStatus.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, modifyMessagePropertyResponseBody.version) + modifyMessagePropertyResponseBody.unknownFields().size();
        }

        public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.status((ModifyMessagePropertyStatus) ModifyMessagePropertyStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            builder.version((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) throws IOException {
            ModifyMessagePropertyStatus.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, modifyMessagePropertyResponseBody.version);
            protoWriter.writeBytes(modifyMessagePropertyResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyMessagePropertyResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l) {
        this(modifyMessagePropertyStatus, l, ByteString.EMPTY);
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = modifyMessagePropertyStatus;
        this.version = l;
    }
}
