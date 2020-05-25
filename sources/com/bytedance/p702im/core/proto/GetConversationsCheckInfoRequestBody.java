package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody */
public final class GetConversationsCheckInfoRequestBody extends Message<GetConversationsCheckInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationsCheckInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationsCheckInfoRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationsCheckInfoRequestBody, Builder> {
        public final GetConversationsCheckInfoRequestBody build() {
            return new GetConversationsCheckInfoRequestBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody$ProtoAdapter_GetConversationsCheckInfoRequestBody */
    static final class ProtoAdapter_GetConversationsCheckInfoRequestBody extends ProtoAdapter<GetConversationsCheckInfoRequestBody> {
        public ProtoAdapter_GetConversationsCheckInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoRequestBody.class);
        }

        public final int encodedSize(GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            return getConversationsCheckInfoRequestBody.unknownFields().size();
        }

        public final GetConversationsCheckInfoRequestBody redact(GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            Builder newBuilder = getConversationsCheckInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationsCheckInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) throws IOException {
            protoWriter.writeBytes(getConversationsCheckInfoRequestBody.unknownFields());
        }
    }

    public GetConversationsCheckInfoRequestBody() {
        this(ByteString.EMPTY);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetConversationsCheckInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationsCheckInfoRequestBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
