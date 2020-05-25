package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody */
public final class MessagesPerUserInitV2ResponseBody extends Message<MessagesPerUserInitV2ResponseBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserInitV2ResponseBody> ADAPTER = new ProtoAdapter_MessagesPerUserInitV2ResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    public static final Long DEFAULT_PER_USER_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final List<ConversationInfoV2> conversations;
    public final Boolean has_more;
    public final List<MessageBody> messages;
    public final Long next_cursor;
    public final Long per_user_cursor;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesPerUserInitV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversations = Internal.newMutableList();
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;
        public Long per_user_cursor;

        public final MessagesPerUserInitV2ResponseBody build() {
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = new MessagesPerUserInitV2ResponseBody(this.messages, this.conversations, this.per_user_cursor, this.next_cursor, this.has_more, super.buildUnknownFields());
            return messagesPerUserInitV2ResponseBody;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder per_user_cursor(Long l) {
            this.per_user_cursor = l;
            return this;
        }

        public final Builder conversations(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversations = list;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody$ProtoAdapter_MessagesPerUserInitV2ResponseBody */
    static final class ProtoAdapter_MessagesPerUserInitV2ResponseBody extends ProtoAdapter<MessagesPerUserInitV2ResponseBody> {
        public ProtoAdapter_MessagesPerUserInitV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2ResponseBody.class);
        }

        public final MessagesPerUserInitV2ResponseBody redact(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            Builder newBuilder = messagesPerUserInitV2ResponseBody.newBuilder();
            Internal.redactElements(newBuilder.messages, MessageBody.ADAPTER);
            Internal.redactElements(newBuilder.conversations, ConversationInfoV2.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MessagesPerUserInitV2ResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.conversations.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.per_user_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
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

        public final int encodedSize(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserInitV2ResponseBody.messages) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(2, messagesPerUserInitV2ResponseBody.conversations) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesPerUserInitV2ResponseBody.per_user_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(4, messagesPerUserInitV2ResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(5, messagesPerUserInitV2ResponseBody.has_more) + messagesPerUserInitV2ResponseBody.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) throws IOException {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserInitV2ResponseBody.messages);
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messagesPerUserInitV2ResponseBody.conversations);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesPerUserInitV2ResponseBody.per_user_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messagesPerUserInitV2ResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, messagesPerUserInitV2ResponseBody.has_more);
            protoWriter.writeBytes(messagesPerUserInitV2ResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.conversations = Internal.copyOf("conversations", this.conversations);
        builder.per_user_cursor = this.per_user_cursor;
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (!this.conversations.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        if (this.per_user_cursor != null) {
            sb.append(", per_user_cursor=");
            sb.append(this.per_user_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesPerUserInitV2ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool) {
        this(list, list2, l, l2, bool, ByteString.EMPTY);
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.conversations = Internal.immutableCopyOf("conversations", list2);
        this.per_user_cursor = l;
        this.next_cursor = l2;
        this.has_more = bool;
    }
}
