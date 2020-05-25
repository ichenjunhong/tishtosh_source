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

/* renamed from: com.bytedance.im.core.proto.ConversationsListResponseBody */
public final class ConversationsListResponseBody extends Message<ConversationsListResponseBody, Builder> {
    public static final ProtoAdapter<ConversationsListResponseBody> ADAPTER = new ProtoAdapter_ConversationsListResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final List<ConversationInfo> conversations;
    public final Boolean has_more;
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.ConversationsListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationsListResponseBody, Builder> {
        public List<ConversationInfo> conversations = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;

        public final ConversationsListResponseBody build() {
            return new ConversationsListResponseBody(this.conversations, this.next_cursor, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder conversations(List<ConversationInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversations = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationsListResponseBody$ProtoAdapter_ConversationsListResponseBody */
    static final class ProtoAdapter_ConversationsListResponseBody extends ProtoAdapter<ConversationsListResponseBody> {
        public ProtoAdapter_ConversationsListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationsListResponseBody.class);
        }

        public final ConversationsListResponseBody redact(ConversationsListResponseBody conversationsListResponseBody) {
            Builder newBuilder = conversationsListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversations, ConversationInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationsListResponseBody conversationsListResponseBody) {
            return ConversationInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, conversationsListResponseBody.conversations) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationsListResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, conversationsListResponseBody.has_more) + conversationsListResponseBody.unknownFields().size();
        }

        public final ConversationsListResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversations.add(ConversationInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
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

        public final void encode(ProtoWriter protoWriter, ConversationsListResponseBody conversationsListResponseBody) throws IOException {
            ConversationInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, conversationsListResponseBody.conversations);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationsListResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, conversationsListResponseBody.has_more);
            protoWriter.writeBytes(conversationsListResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversations = Internal.copyOf("conversations", this.conversations);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversations.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationsListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationsListResponseBody(List<ConversationInfo> list, Long l, Boolean bool) {
        this(list, l, bool, ByteString.EMPTY);
    }

    public ConversationsListResponseBody(List<ConversationInfo> list, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversations = Internal.immutableCopyOf("conversations", list);
        this.next_cursor = l;
        this.has_more = bool;
    }
}
