package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ClientACKResponseBody */
public final class ClientACKResponseBody extends Message<ClientACKResponseBody, Builder> {
    public static final ProtoAdapter<ClientACKResponseBody> ADAPTER = new ProtoAdapter_ClientACKResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ClientACKResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ClientACKResponseBody, Builder> {
        public final ClientACKResponseBody build() {
            return new ClientACKResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ClientACKResponseBody$ProtoAdapter_ClientACKResponseBody */
    static final class ProtoAdapter_ClientACKResponseBody extends ProtoAdapter<ClientACKResponseBody> {
        public ProtoAdapter_ClientACKResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientACKResponseBody.class);
        }

        public final int encodedSize(ClientACKResponseBody clientACKResponseBody) {
            return clientACKResponseBody.unknownFields().size();
        }

        public final ClientACKResponseBody redact(ClientACKResponseBody clientACKResponseBody) {
            Builder newBuilder = clientACKResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ClientACKResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ClientACKResponseBody clientACKResponseBody) throws IOException {
            protoWriter.writeBytes(clientACKResponseBody.unknownFields());
        }
    }

    public ClientACKResponseBody() {
        this(ByteString.EMPTY);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "ClientACKResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ClientACKResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
