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

/* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody */
public final class GetMessagesCheckInfoInConversationResponseBody extends Message<GetMessagesCheckInfoInConversationResponseBody, Builder> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> ADAPTER = new ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody();
    public static final Long DEFAULT_CURSOR_REVERSE_NEXT = Long.valueOf(0);
    public static final Integer DEFAULT_REAL_MSG_TOTAL_COUNT = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long cursor_reverse_next;
    public final List<MessagesCheckInfo> msgs_checkinfo_list;
    public final Integer real_msg_total_count;

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetMessagesCheckInfoInConversationResponseBody, Builder> {
        public Long cursor_reverse_next;
        public List<MessagesCheckInfo> msgs_checkinfo_list = Internal.newMutableList();
        public Integer real_msg_total_count;

        public final GetMessagesCheckInfoInConversationResponseBody build() {
            return new GetMessagesCheckInfoInConversationResponseBody(this.msgs_checkinfo_list, this.real_msg_total_count, this.cursor_reverse_next, super.buildUnknownFields());
        }

        public final Builder cursor_reverse_next(Long l) {
            this.cursor_reverse_next = l;
            return this;
        }

        public final Builder real_msg_total_count(Integer num) {
            this.real_msg_total_count = num;
            return this;
        }

        public final Builder msgs_checkinfo_list(List<MessagesCheckInfo> list) {
            Internal.checkElementsNotNull(list);
            this.msgs_checkinfo_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody$ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody */
    static final class ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody extends ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> {
        public ProtoAdapter_GetMessagesCheckInfoInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationResponseBody.class);
        }

        public final GetMessagesCheckInfoInConversationResponseBody redact(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            Builder newBuilder = getMessagesCheckInfoInConversationResponseBody.newBuilder();
            Internal.redactElements(newBuilder.msgs_checkinfo_list, MessagesCheckInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            return MessagesCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoInConversationResponseBody.msgs_checkinfo_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesCheckInfoInConversationResponseBody.real_msg_total_count) + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessagesCheckInfoInConversationResponseBody.cursor_reverse_next) + getMessagesCheckInfoInConversationResponseBody.unknownFields().size();
        }

        public final GetMessagesCheckInfoInConversationResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 4) {
                    switch (nextTag) {
                        case 1:
                            builder.msgs_checkinfo_list.add(MessagesCheckInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.real_msg_total_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.cursor_reverse_next((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) throws IOException {
            MessagesCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesCheckInfoInConversationResponseBody.msgs_checkinfo_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationResponseBody.real_msg_total_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationResponseBody.cursor_reverse_next);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.msgs_checkinfo_list = Internal.copyOf("msgs_checkinfo_list", this.msgs_checkinfo_list);
        builder.real_msg_total_count = this.real_msg_total_count;
        builder.cursor_reverse_next = this.cursor_reverse_next;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.msgs_checkinfo_list.isEmpty()) {
            sb.append(", msgs_checkinfo_list=");
            sb.append(this.msgs_checkinfo_list);
        }
        if (this.real_msg_total_count != null) {
            sb.append(", real_msg_total_count=");
            sb.append(this.real_msg_total_count);
        }
        if (this.cursor_reverse_next != null) {
            sb.append(", cursor_reverse_next=");
            sb.append(this.cursor_reverse_next);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagesCheckInfoInConversationResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l) {
        this(list, num, l, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msgs_checkinfo_list = Internal.immutableCopyOf("msgs_checkinfo_list", list);
        this.real_msg_total_count = num;
        this.cursor_reverse_next = l;
    }
}
