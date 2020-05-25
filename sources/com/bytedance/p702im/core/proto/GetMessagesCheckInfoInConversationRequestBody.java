package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody */
public final class GetMessagesCheckInfoInConversationRequestBody extends Message<GetMessagesCheckInfoInConversationRequestBody, Builder> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> ADAPTER = new ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CURSOR_REVERSE_BEGIN = Long.valueOf(0);
    public static final Long DEFAULT_CURSOR_REVERSE_END = Long.valueOf(0);
    public static final Integer DEFAULT_EXPECT_MSG_TOTAL_COUNT = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Long cursor_reverse_begin;
    public final Long cursor_reverse_end;
    public final Integer expect_msg_total_count;

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetMessagesCheckInfoInConversationRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long cursor_reverse_begin;
        public Long cursor_reverse_end;
        public Integer expect_msg_total_count;

        public final GetMessagesCheckInfoInConversationRequestBody build() {
            GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody = new GetMessagesCheckInfoInConversationRequestBody(this.conversation_short_id, this.conversation_id, this.conversation_type, this.cursor_reverse_begin, this.cursor_reverse_end, this.expect_msg_total_count, super.buildUnknownFields());
            return getMessagesCheckInfoInConversationRequestBody;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder cursor_reverse_begin(Long l) {
            this.cursor_reverse_begin = l;
            return this;
        }

        public final Builder cursor_reverse_end(Long l) {
            this.cursor_reverse_end = l;
            return this;
        }

        public final Builder expect_msg_total_count(Integer num) {
            this.expect_msg_total_count = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody$ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody */
    static final class ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody extends ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> {
        public ProtoAdapter_GetMessagesCheckInfoInConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationRequestBody.class);
        }

        public final GetMessagesCheckInfoInConversationRequestBody redact(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            Builder newBuilder = getMessagesCheckInfoInConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, getMessagesCheckInfoInConversationRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, getMessagesCheckInfoInConversationRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, getMessagesCheckInfoInConversationRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_begin) + ProtoAdapter.INT64.encodedSizeWithTag(7, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_end) + ProtoAdapter.INT32.encodedSizeWithTag(4, getMessagesCheckInfoInConversationRequestBody.expect_msg_total_count) + getMessagesCheckInfoInConversationRequestBody.unknownFields().size();
        }

        public final GetMessagesCheckInfoInConversationRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.cursor_reverse_begin((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.expect_msg_total_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.cursor_reverse_end((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMessagesCheckInfoInConversationRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getMessagesCheckInfoInConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_begin);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getMessagesCheckInfoInConversationRequestBody.cursor_reverse_end);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationRequestBody.expect_msg_total_count);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.cursor_reverse_begin = this.cursor_reverse_begin;
        builder.cursor_reverse_end = this.cursor_reverse_end;
        builder.expect_msg_total_count = this.expect_msg_total_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.cursor_reverse_begin != null) {
            sb.append(", cursor_reverse_begin=");
            sb.append(this.cursor_reverse_begin);
        }
        if (this.cursor_reverse_end != null) {
            sb.append(", cursor_reverse_end=");
            sb.append(this.cursor_reverse_end);
        }
        if (this.expect_msg_total_count != null) {
            sb.append(", expect_msg_total_count=");
            sb.append(this.expect_msg_total_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagesCheckInfoInConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2) {
        this(l, str, num, l2, l3, num2, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
        this.cursor_reverse_begin = l2;
        this.cursor_reverse_end = l3;
        this.expect_msg_total_count = num2;
    }
}
