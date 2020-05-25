package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConfigsRequestBody */
public final class GetConfigsRequestBody extends Message<GetConfigsRequestBody, Builder> {
    public static final ProtoAdapter<GetConfigsRequestBody> ADAPTER = new ProtoAdapter_GetConfigsRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.GetConfigsRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConfigsRequestBody, Builder> {
        public final GetConfigsRequestBody build() {
            return new GetConfigsRequestBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConfigsRequestBody$ProtoAdapter_GetConfigsRequestBody */
    static final class ProtoAdapter_GetConfigsRequestBody extends ProtoAdapter<GetConfigsRequestBody> {
        public ProtoAdapter_GetConfigsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigsRequestBody.class);
        }

        public final int encodedSize(GetConfigsRequestBody getConfigsRequestBody) {
            return getConfigsRequestBody.unknownFields().size();
        }

        public final GetConfigsRequestBody redact(GetConfigsRequestBody getConfigsRequestBody) {
            Builder newBuilder = getConfigsRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConfigsRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, GetConfigsRequestBody getConfigsRequestBody) throws IOException {
            protoWriter.writeBytes(getConfigsRequestBody.unknownFields());
        }
    }

    public GetConfigsRequestBody() {
        this(ByteString.EMPTY);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetConfigsRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConfigsRequestBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
