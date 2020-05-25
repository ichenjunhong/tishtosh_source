package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody */
public final class ModifyMessagePropertyRequestBody extends Message<ModifyMessagePropertyRequestBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyRequestBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyRequestBody();
    private static final long serialVersionUID = 0;
    public final ModifyPropertyBody property_list;
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyMessagePropertyRequestBody, Builder> {
        public ModifyPropertyBody property_list;
        public String ticket;

        public final ModifyMessagePropertyRequestBody build() {
            return new ModifyMessagePropertyRequestBody(this.property_list, this.ticket, super.buildUnknownFields());
        }

        public final Builder property_list(ModifyPropertyBody modifyPropertyBody) {
            this.property_list = modifyPropertyBody;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$ProtoAdapter_ModifyMessagePropertyRequestBody */
    static final class ProtoAdapter_ModifyMessagePropertyRequestBody extends ProtoAdapter<ModifyMessagePropertyRequestBody> {
        public ProtoAdapter_ModifyMessagePropertyRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyRequestBody.class);
        }

        public final int encodedSize(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            return ModifyPropertyBody.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyRequestBody.property_list) + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyMessagePropertyRequestBody.ticket) + modifyMessagePropertyRequestBody.unknownFields().size();
        }

        public final ModifyMessagePropertyRequestBody redact(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            Builder newBuilder = modifyMessagePropertyRequestBody.newBuilder();
            if (newBuilder.property_list != null) {
                newBuilder.property_list = (ModifyPropertyBody) ModifyPropertyBody.ADAPTER.redact(newBuilder.property_list);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ModifyMessagePropertyRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.property_list((ModifyPropertyBody) ModifyPropertyBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) throws IOException {
            ModifyPropertyBody.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyRequestBody.property_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyMessagePropertyRequestBody.ticket);
            protoWriter.writeBytes(modifyMessagePropertyRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.property_list = this.property_list;
        builder.ticket = this.ticket;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.property_list != null) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyMessagePropertyRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str) {
        this(modifyPropertyBody, str, ByteString.EMPTY);
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.property_list = modifyPropertyBody;
        this.ticket = str;
    }
}
