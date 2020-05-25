package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody */
public final class MessagesPerUserInitV2RequestBody extends Message<MessagesPerUserInitV2RequestBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserInitV2RequestBody> ADAPTER = new ProtoAdapter_MessagesPerUserInitV2RequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long cursor;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesPerUserInitV2RequestBody, Builder> {
        public Long cursor;

        public final MessagesPerUserInitV2RequestBody build() {
            return new MessagesPerUserInitV2RequestBody(this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody$ProtoAdapter_MessagesPerUserInitV2RequestBody */
    static final class ProtoAdapter_MessagesPerUserInitV2RequestBody extends ProtoAdapter<MessagesPerUserInitV2RequestBody> {
        public ProtoAdapter_MessagesPerUserInitV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2RequestBody.class);
        }

        public final MessagesPerUserInitV2RequestBody redact(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            Builder newBuilder = messagesPerUserInitV2RequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserInitV2RequestBody.cursor) + messagesPerUserInitV2RequestBody.unknownFields().size();
        }

        public final MessagesPerUserInitV2RequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserInitV2RequestBody.cursor);
            protoWriter.writeBytes(messagesPerUserInitV2RequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesPerUserInitV2RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesPerUserInitV2RequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public MessagesPerUserInitV2RequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
    }
}
