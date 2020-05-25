package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.NewMessageNotify */
public final class NewMessageNotify extends Message<NewMessageNotify, Builder> {
    public static final ProtoAdapter<NewMessageNotify> ADAPTER = new ProtoAdapter_NewMessageNotify();
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = Long.valueOf(0);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    public static final NewMessageNotifyType DEFAULT_NOTIFY_TYPE = NewMessageNotifyType.PER_USER;
    public static final Long DEFAULT_PREVIOUS_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Integer conversation_type;
    public final Long index_in_conversation;
    public final MessageBody message;
    public final Long next_cursor;
    public final NewMessageNotifyType notify_type;
    public final Long previous_cursor;

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotify$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NewMessageNotify, Builder> {
        public String conversation_id;
        public Integer conversation_type;
        public Long index_in_conversation;
        public MessageBody message;
        public Long next_cursor;
        public NewMessageNotifyType notify_type;
        public Long previous_cursor;

        public final NewMessageNotify build() {
            NewMessageNotify newMessageNotify = new NewMessageNotify(this.conversation_id, this.conversation_type, this.notify_type, this.message, this.previous_cursor, this.next_cursor, this.index_in_conversation, super.buildUnknownFields());
            return newMessageNotify;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder index_in_conversation(Long l) {
            this.index_in_conversation = l;
            return this;
        }

        public final Builder message(MessageBody messageBody) {
            this.message = messageBody;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder notify_type(NewMessageNotifyType newMessageNotifyType) {
            this.notify_type = newMessageNotifyType;
            return this;
        }

        public final Builder previous_cursor(Long l) {
            this.previous_cursor = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotify$ProtoAdapter_NewMessageNotify */
    static final class ProtoAdapter_NewMessageNotify extends ProtoAdapter<NewMessageNotify> {
        public ProtoAdapter_NewMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, NewMessageNotify.class);
        }

        public final NewMessageNotify redact(NewMessageNotify newMessageNotify) {
            Builder newBuilder = newMessageNotify.newBuilder();
            if (newBuilder.message != null) {
                newBuilder.message = (MessageBody) MessageBody.ADAPTER.redact(newBuilder.message);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(NewMessageNotify newMessageNotify) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, newMessageNotify.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, newMessageNotify.conversation_type) + NewMessageNotifyType.ADAPTER.encodedSizeWithTag(4, newMessageNotify.notify_type) + MessageBody.ADAPTER.encodedSizeWithTag(5, newMessageNotify.message) + ProtoAdapter.INT64.encodedSizeWithTag(6, newMessageNotify.previous_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(7, newMessageNotify.next_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(8, newMessageNotify.index_in_conversation) + newMessageNotify.unknownFields().size();
        }

        public final NewMessageNotify decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.notify_type((NewMessageNotifyType) NewMessageNotifyType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.message((MessageBody) MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.previous_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.index_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewMessageNotify newMessageNotify) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newMessageNotify.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, newMessageNotify.conversation_type);
            NewMessageNotifyType.ADAPTER.encodeWithTag(protoWriter, 4, newMessageNotify.notify_type);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 5, newMessageNotify.message);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, newMessageNotify.previous_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, newMessageNotify.next_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, newMessageNotify.index_in_conversation);
            protoWriter.writeBytes(newMessageNotify.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.notify_type = this.notify_type;
        builder.message = this.message;
        builder.previous_cursor = this.previous_cursor;
        builder.next_cursor = this.next_cursor;
        builder.index_in_conversation = this.index_in_conversation;
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
        if (this.notify_type != null) {
            sb.append(", notify_type=");
            sb.append(this.notify_type);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.previous_cursor != null) {
            sb.append(", previous_cursor=");
            sb.append(this.previous_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        StringBuilder replace = sb.replace(0, 2, "NewMessageNotify{");
        replace.append('}');
        return replace.toString();
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l, Long l2, Long l3) {
        this(str, num, newMessageNotifyType, messageBody, l, l2, l3, ByteString.EMPTY);
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.notify_type = newMessageNotifyType;
        this.message = messageBody;
        this.previous_cursor = l;
        this.next_cursor = l2;
        this.index_in_conversation = l3;
    }
}
