package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody */
public final class InboxMessagesPerUserResponseBody extends Message<InboxMessagesPerUserResponseBody, Builder> {
    public static final ProtoAdapter<InboxMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter_InboxMessagesPerUserResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final Integer inbox_type;

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<InboxMessagesPerUserResponseBody, Builder> {
        public Boolean has_more;
        public Integer inbox_type;

        public final InboxMessagesPerUserResponseBody build() {
            return new InboxMessagesPerUserResponseBody(this.inbox_type, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody$ProtoAdapter_InboxMessagesPerUserResponseBody */
    static final class ProtoAdapter_InboxMessagesPerUserResponseBody extends ProtoAdapter<InboxMessagesPerUserResponseBody> {
        public ProtoAdapter_InboxMessagesPerUserResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUserResponseBody.class);
        }

        public final InboxMessagesPerUserResponseBody redact(InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            Builder newBuilder = inboxMessagesPerUserResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUserResponseBody.inbox_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, inboxMessagesPerUserResponseBody.has_more) + inboxMessagesPerUserResponseBody.unknownFields().size();
        }

        public final InboxMessagesPerUserResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUserResponseBody.inbox_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, inboxMessagesPerUserResponseBody.has_more);
            protoWriter.writeBytes(inboxMessagesPerUserResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.inbox_type = this.inbox_type;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "InboxMessagesPerUserResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.has_more = bool;
    }
}
