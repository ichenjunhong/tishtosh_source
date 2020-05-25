package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesInConversationRequestBody */
public final class MessagesInConversationRequestBody extends Message<MessagesInConversationRequestBody, Builder> {
    public static final ProtoAdapter<MessagesInConversationRequestBody> ADAPTER = new ProtoAdapter_MessagesInConversationRequestBody();
    public static final Long DEFAULT_ANCHOR_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final MessageDirection DEFAULT_DIRECTION = MessageDirection.OLDER;
    public static final Integer DEFAULT_LIMIT = Integer.valueOf(50);
    private static final long serialVersionUID = 0;
    public final Long anchor_index;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final MessageDirection direction;
    public final Integer limit;

    /* renamed from: com.bytedance.im.core.proto.MessagesInConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesInConversationRequestBody, Builder> {
        public Long anchor_index;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public MessageDirection direction;
        public Integer limit;

        public final MessagesInConversationRequestBody build() {
            MessagesInConversationRequestBody messagesInConversationRequestBody = new MessagesInConversationRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.direction, this.anchor_index, this.limit, super.buildUnknownFields());
            return messagesInConversationRequestBody;
        }

        public final Builder anchor_index(Long l) {
            this.anchor_index = l;
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

        public final Builder direction(MessageDirection messageDirection) {
            this.direction = messageDirection;
            return this;
        }

        public final Builder limit(Integer num) {
            this.limit = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesInConversationRequestBody$ProtoAdapter_MessagesInConversationRequestBody */
    static final class ProtoAdapter_MessagesInConversationRequestBody extends ProtoAdapter<MessagesInConversationRequestBody> {
        public ProtoAdapter_MessagesInConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesInConversationRequestBody.class);
        }

        public final MessagesInConversationRequestBody redact(MessagesInConversationRequestBody messagesInConversationRequestBody) {
            Builder newBuilder = messagesInConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesInConversationRequestBody messagesInConversationRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, messagesInConversationRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesInConversationRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesInConversationRequestBody.conversation_short_id) + MessageDirection.ADAPTER.encodedSizeWithTag(4, messagesInConversationRequestBody.direction) + ProtoAdapter.INT64.encodedSizeWithTag(5, messagesInConversationRequestBody.anchor_index) + ProtoAdapter.INT32.encodedSizeWithTag(6, messagesInConversationRequestBody.limit) + messagesInConversationRequestBody.unknownFields().size();
        }

        public final MessagesInConversationRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            try {
                                builder.direction((MessageDirection) MessageDirection.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.anchor_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
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

        public final void encode(ProtoWriter protoWriter, MessagesInConversationRequestBody messagesInConversationRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messagesInConversationRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesInConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesInConversationRequestBody.conversation_short_id);
            MessageDirection.ADAPTER.encodeWithTag(protoWriter, 4, messagesInConversationRequestBody.direction);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messagesInConversationRequestBody.anchor_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messagesInConversationRequestBody.limit);
            protoWriter.writeBytes(messagesInConversationRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.direction = this.direction;
        builder.anchor_index = this.anchor_index;
        builder.limit = this.limit;
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
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        if (this.anchor_index != null) {
            sb.append(", anchor_index=");
            sb.append(this.anchor_index);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesInConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, MessageDirection messageDirection, Long l2, Integer num2) {
        this(str, num, l, messageDirection, l2, num2, ByteString.EMPTY);
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, MessageDirection messageDirection, Long l2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.direction = messageDirection;
        this.anchor_index = l2;
        this.limit = num2;
    }
}
