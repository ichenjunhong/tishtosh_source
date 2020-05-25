package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ReactionMessageRequestBody */
public final class ReactionMessageRequestBody extends Message<ReactionMessageRequestBody, Builder> {
    public static final ProtoAdapter<ReactionMessageRequestBody> ADAPTER = new ProtoAdapter_ReactionMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_MESSAGE_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String client_message_id;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Integer message_type;
    public final ReactionContent reaction_content;
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.ReactionMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReactionMessageRequestBody, Builder> {
        public String client_message_id;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Integer message_type;
        public ReactionContent reaction_content;
        public String ticket;

        public final ReactionMessageRequestBody build() {
            ReactionMessageRequestBody reactionMessageRequestBody = new ReactionMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.reaction_content, this.message_type, this.ticket, this.client_message_id, super.buildUnknownFields());
            return reactionMessageRequestBody;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
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

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder reaction_content(ReactionContent reactionContent) {
            this.reaction_content = reactionContent;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ReactionMessageRequestBody$ProtoAdapter_ReactionMessageRequestBody */
    static final class ProtoAdapter_ReactionMessageRequestBody extends ProtoAdapter<ReactionMessageRequestBody> {
        public ProtoAdapter_ReactionMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReactionMessageRequestBody.class);
        }

        public final ReactionMessageRequestBody redact(ReactionMessageRequestBody reactionMessageRequestBody) {
            Builder newBuilder = reactionMessageRequestBody.newBuilder();
            if (newBuilder.reaction_content != null) {
                newBuilder.reaction_content = (ReactionContent) ReactionContent.ADAPTER.redact(newBuilder.reaction_content);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReactionMessageRequestBody reactionMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, reactionMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, reactionMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, reactionMessageRequestBody.conversation_short_id) + ReactionContent.ADAPTER.encodedSizeWithTag(4, reactionMessageRequestBody.reaction_content) + ProtoAdapter.INT32.encodedSizeWithTag(6, reactionMessageRequestBody.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, reactionMessageRequestBody.ticket) + ProtoAdapter.STRING.encodedSizeWithTag(8, reactionMessageRequestBody.client_message_id) + reactionMessageRequestBody.unknownFields().size();
        }

        public final ReactionMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.reaction_content((ReactionContent) ReactionContent.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.message_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ReactionMessageRequestBody reactionMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reactionMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, reactionMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, reactionMessageRequestBody.conversation_short_id);
            ReactionContent.ADAPTER.encodeWithTag(protoWriter, 4, reactionMessageRequestBody.reaction_content);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, reactionMessageRequestBody.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, reactionMessageRequestBody.ticket);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, reactionMessageRequestBody.client_message_id);
            protoWriter.writeBytes(reactionMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.reaction_content = this.reaction_content;
        builder.message_type = this.message_type;
        builder.ticket = this.ticket;
        builder.client_message_id = this.client_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.reaction_content != null) {
            sb.append(", reaction_content=");
            sb.append(this.reaction_content);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ReactionMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ReactionMessageRequestBody(String str, Integer num, Long l, ReactionContent reactionContent, Integer num2, String str2, String str3) {
        this(str, num, l, reactionContent, num2, str2, str3, ByteString.EMPTY);
    }

    public ReactionMessageRequestBody(String str, Integer num, Long l, ReactionContent reactionContent, Integer num2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.reaction_content = reactionContent;
        this.message_type = num2;
        this.ticket = str2;
        this.client_message_id = str3;
    }
}
