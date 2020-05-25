package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationLeaveRequestBody */
public final class ConversationLeaveRequestBody extends Message<ConversationLeaveRequestBody, Builder> {
    public static final ProtoAdapter<ConversationLeaveRequestBody> ADAPTER = new ProtoAdapter_ConversationLeaveRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.ConversationLeaveRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationLeaveRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final ConversationLeaveRequestBody build() {
            return new ConversationLeaveRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
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
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationLeaveRequestBody$ProtoAdapter_ConversationLeaveRequestBody */
    static final class ProtoAdapter_ConversationLeaveRequestBody extends ProtoAdapter<ConversationLeaveRequestBody> {
        public ProtoAdapter_ConversationLeaveRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationLeaveRequestBody.class);
        }

        public final ConversationLeaveRequestBody redact(ConversationLeaveRequestBody conversationLeaveRequestBody) {
            Builder newBuilder = conversationLeaveRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationLeaveRequestBody conversationLeaveRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationLeaveRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationLeaveRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationLeaveRequestBody.conversation_type) + conversationLeaveRequestBody.unknownFields().size();
        }

        public final ConversationLeaveRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationLeaveRequestBody conversationLeaveRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationLeaveRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationLeaveRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationLeaveRequestBody.conversation_type);
            protoWriter.writeBytes(conversationLeaveRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationLeaveRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationLeaveRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public ConversationLeaveRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
