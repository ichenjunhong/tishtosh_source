package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody */
public final class MessagesPerUserRequestBody extends Message<MessagesPerUserRequestBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserRequestBody> ADAPTER = new ProtoAdapter_MessagesPerUserRequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Integer DEFAULT_LIMIT = Integer.valueOf(50);
    private static final long serialVersionUID = 0;
    public final Long cursor;
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesPerUserRequestBody, Builder> {
        public Long cursor;
        public Integer limit;

        public final MessagesPerUserRequestBody build() {
            return new MessagesPerUserRequestBody(this.cursor, this.limit, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserRequestBody$ProtoAdapter_MessagesPerUserRequestBody */
    static final class ProtoAdapter_MessagesPerUserRequestBody extends ProtoAdapter<MessagesPerUserRequestBody> {
        public ProtoAdapter_MessagesPerUserRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserRequestBody.class);
        }

        public final MessagesPerUserRequestBody redact(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            Builder newBuilder = messagesPerUserRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesPerUserRequestBody messagesPerUserRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserRequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesPerUserRequestBody.limit) + messagesPerUserRequestBody.unknownFields().size();
        }

        public final MessagesPerUserRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.limit((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessagesPerUserRequestBody messagesPerUserRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserRequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesPerUserRequestBody.limit);
            protoWriter.writeBytes(messagesPerUserRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesPerUserRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesPerUserRequestBody(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public MessagesPerUserRequestBody(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
    }
}
