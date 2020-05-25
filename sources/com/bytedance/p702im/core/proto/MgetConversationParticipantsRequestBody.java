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

/* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody */
public final class MgetConversationParticipantsRequestBody extends Message<MgetConversationParticipantsRequestBody, Builder> {
    public static final ProtoAdapter<MgetConversationParticipantsRequestBody> ADAPTER = new ProtoAdapter_MgetConversationParticipantsRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final List<Long> participants;

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MgetConversationParticipantsRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        public final MgetConversationParticipantsRequestBody build() {
            MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody = new MgetConversationParticipantsRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, super.buildUnknownFields());
            return mgetConversationParticipantsRequestBody;
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

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MgetConversationParticipantsRequestBody$ProtoAdapter_MgetConversationParticipantsRequestBody */
    static final class ProtoAdapter_MgetConversationParticipantsRequestBody extends ProtoAdapter<MgetConversationParticipantsRequestBody> {
        public ProtoAdapter_MgetConversationParticipantsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MgetConversationParticipantsRequestBody.class);
        }

        public final MgetConversationParticipantsRequestBody redact(MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) {
            Builder newBuilder = mgetConversationParticipantsRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mgetConversationParticipantsRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, mgetConversationParticipantsRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, mgetConversationParticipantsRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, mgetConversationParticipantsRequestBody.participants) + mgetConversationParticipantsRequestBody.unknownFields().size();
        }

        public final MgetConversationParticipantsRequestBody decode(ProtoReader protoReader) throws IOException {
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
                        case 4:
                            builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MgetConversationParticipantsRequestBody mgetConversationParticipantsRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mgetConversationParticipantsRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mgetConversationParticipantsRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mgetConversationParticipantsRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, mgetConversationParticipantsRequestBody.participants);
            protoWriter.writeBytes(mgetConversationParticipantsRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
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
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        StringBuilder replace = sb.replace(0, 2, "MgetConversationParticipantsRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public MgetConversationParticipantsRequestBody(String str, Long l, Integer num, List<Long> list) {
        this(str, l, num, list, ByteString.EMPTY);
    }

    public MgetConversationParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
    }
}
