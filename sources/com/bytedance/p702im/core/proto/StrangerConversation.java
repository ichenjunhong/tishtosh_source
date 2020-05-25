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

/* renamed from: com.bytedance.im.core.proto.StrangerConversation */
public final class StrangerConversation extends Message<StrangerConversation, Builder> {
    public static final ProtoAdapter<StrangerConversation> ADAPTER = new ProtoAdapter_StrangerConversation();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_UNREAD = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final MessageBody last_message;
    public final List<Participant> participants;
    public final Integer unread;

    /* renamed from: com.bytedance.im.core.proto.StrangerConversation$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<StrangerConversation, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public MessageBody last_message;
        public List<Participant> participants = Internal.newMutableList();
        public Integer unread;

        public final StrangerConversation build() {
            StrangerConversation strangerConversation = new StrangerConversation(this.conversation_short_id, this.unread, this.last_message, this.conversation_id, this.participants, super.buildUnknownFields());
            return strangerConversation;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder last_message(MessageBody messageBody) {
            this.last_message = messageBody;
            return this;
        }

        public final Builder unread(Integer num) {
            this.unread = num;
            return this;
        }

        public final Builder participants(List<Participant> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.StrangerConversation$ProtoAdapter_StrangerConversation */
    static final class ProtoAdapter_StrangerConversation extends ProtoAdapter<StrangerConversation> {
        public ProtoAdapter_StrangerConversation() {
            super(FieldEncoding.LENGTH_DELIMITED, StrangerConversation.class);
        }

        public final int encodedSize(StrangerConversation strangerConversation) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, strangerConversation.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, strangerConversation.unread) + MessageBody.ADAPTER.encodedSizeWithTag(3, strangerConversation.last_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, strangerConversation.conversation_id) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(5, strangerConversation.participants) + strangerConversation.unknownFields().size();
        }

        public final StrangerConversation redact(StrangerConversation strangerConversation) {
            Builder newBuilder = strangerConversation.newBuilder();
            if (newBuilder.last_message != null) {
                newBuilder.last_message = (MessageBody) MessageBody.ADAPTER.redact(newBuilder.last_message);
            }
            Internal.redactElements(newBuilder.participants, Participant.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final StrangerConversation decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.unread((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.last_message((MessageBody) MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.participants.add(Participant.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, StrangerConversation strangerConversation) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, strangerConversation.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, strangerConversation.unread);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 3, strangerConversation.last_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, strangerConversation.conversation_id);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, strangerConversation.participants);
            protoWriter.writeBytes(strangerConversation.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.unread = this.unread;
        builder.last_message = this.last_message;
        builder.conversation_id = this.conversation_id;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.unread != null) {
            sb.append(", unread=");
            sb.append(this.unread);
        }
        if (this.last_message != null) {
            sb.append(", last_message=");
            sb.append(this.last_message);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "StrangerConversation{");
        replace.append('}');
        return replace.toString();
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list) {
        this(l, num, messageBody, str, list, ByteString.EMPTY);
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.unread = num;
        this.last_message = messageBody;
        this.conversation_id = str;
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
