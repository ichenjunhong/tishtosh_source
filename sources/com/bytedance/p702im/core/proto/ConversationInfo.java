package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationInfo */
public final class ConversationInfo extends Message<ConversationInfo, Builder> {
    public static final ProtoAdapter<ConversationInfo> ADAPTER = new ProtoAdapter_ConversationInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CONVERSATION_VERSION = Long.valueOf(0);
    public static final Boolean DEFAULT_IS_PARTICIPANT = Boolean.valueOf(false);
    public static final Long DEFAULT_LAST_MESSAGE_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_MIN_INDEX = Long.valueOf(0);
    public static final Integer DEFAULT_MUTE = Integer.valueOf(0);
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = Integer.valueOf(0);
    public static final Long DEFAULT_READ_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_UNREAD_COUNT = Long.valueOf(0);
    public static final Integer DEFAULT_STICK_ON_TOP = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Long conversation_version;
    public final Map<String, String> ext;
    public final ParticipantsPage first_page_participants;
    public final Boolean is_participant;
    public final Long last_message_index;
    public final Long min_index;
    public final Integer mute;
    public final Integer participants_count;
    public final Long read_index;
    public final Long server_unread_count;
    public final Integer stick_on_top;
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.ConversationInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long conversation_version;
        public Map<String, String> ext = Internal.newMutableMap();
        public ParticipantsPage first_page_participants;
        public Boolean is_participant;
        public Long last_message_index;
        public Long min_index;
        public Integer mute;
        public Integer participants_count;
        public Long read_index;
        public Long server_unread_count;
        public Integer stick_on_top;
        public String ticket;

        public final ConversationInfo build() {
            ConversationInfo conversationInfo = new ConversationInfo(this.conversation_id, this.conversation_type, this.first_page_participants, this.participants_count, this.min_index, this.read_index, this.mute, this.stick_on_top, this.ext, this.ticket, this.conversation_short_id, this.conversation_version, this.is_participant, this.server_unread_count, this.last_message_index, super.buildUnknownFields());
            return conversationInfo;
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

        public final Builder conversation_version(Long l) {
            this.conversation_version = l;
            return this;
        }

        public final Builder first_page_participants(ParticipantsPage participantsPage) {
            this.first_page_participants = participantsPage;
            return this;
        }

        public final Builder is_participant(Boolean bool) {
            this.is_participant = bool;
            return this;
        }

        public final Builder last_message_index(Long l) {
            this.last_message_index = l;
            return this;
        }

        public final Builder min_index(Long l) {
            this.min_index = l;
            return this;
        }

        public final Builder mute(Integer num) {
            this.mute = num;
            return this;
        }

        public final Builder participants_count(Integer num) {
            this.participants_count = num;
            return this;
        }

        public final Builder read_index(Long l) {
            this.read_index = l;
            return this;
        }

        public final Builder server_unread_count(Long l) {
            this.server_unread_count = l;
            return this;
        }

        public final Builder stick_on_top(Integer num) {
            this.stick_on_top = num;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationInfo$ProtoAdapter_ConversationInfo */
    static final class ProtoAdapter_ConversationInfo extends ProtoAdapter<ConversationInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_ConversationInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ConversationInfo redact(ConversationInfo conversationInfo) {
            Builder newBuilder = conversationInfo.newBuilder();
            if (newBuilder.first_page_participants != null) {
                newBuilder.first_page_participants = (ParticipantsPage) ParticipantsPage.ADAPTER.redact(newBuilder.first_page_participants);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationInfo conversationInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationInfo.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationInfo.conversation_type) + ParticipantsPage.ADAPTER.encodedSizeWithTag(3, conversationInfo.first_page_participants) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationInfo.participants_count) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationInfo.min_index) + ProtoAdapter.INT64.encodedSizeWithTag(6, conversationInfo.read_index) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationInfo.mute) + ProtoAdapter.INT32.encodedSizeWithTag(9, conversationInfo.stick_on_top) + this.ext.encodedSizeWithTag(10, conversationInfo.ext) + ProtoAdapter.STRING.encodedSizeWithTag(11, conversationInfo.ticket) + ProtoAdapter.INT64.encodedSizeWithTag(12, conversationInfo.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(13, conversationInfo.conversation_version) + ProtoAdapter.BOOL.encodedSizeWithTag(14, conversationInfo.is_participant) + ProtoAdapter.INT64.encodedSizeWithTag(20, conversationInfo.server_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(21, conversationInfo.last_message_index) + conversationInfo.unknownFields().size();
        }

        public final ConversationInfo decode(ProtoReader protoReader) throws IOException {
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
                            builder.first_page_participants((ParticipantsPage) ParticipantsPage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.participants_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.min_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.read_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.mute((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.stick_on_top((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 11:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 13:
                            builder.conversation_version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 14:
                            builder.is_participant((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 20:
                            builder.server_unread_count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 21:
                            builder.last_message_index((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationInfo conversationInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationInfo.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationInfo.conversation_type);
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 3, conversationInfo.first_page_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationInfo.participants_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationInfo.min_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, conversationInfo.read_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationInfo.mute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, conversationInfo.stick_on_top);
            this.ext.encodeWithTag(protoWriter, 10, conversationInfo.ext);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, conversationInfo.ticket);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, conversationInfo.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, conversationInfo.conversation_version);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, conversationInfo.is_participant);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, conversationInfo.server_unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, conversationInfo.last_message_index);
            protoWriter.writeBytes(conversationInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.first_page_participants = this.first_page_participants;
        builder.participants_count = this.participants_count;
        builder.min_index = this.min_index;
        builder.read_index = this.read_index;
        builder.mute = this.mute;
        builder.stick_on_top = this.stick_on_top;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.ticket = this.ticket;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_version = this.conversation_version;
        builder.is_participant = this.is_participant;
        builder.server_unread_count = this.server_unread_count;
        builder.last_message_index = this.last_message_index;
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
        if (this.first_page_participants != null) {
            sb.append(", first_page_participants=");
            sb.append(this.first_page_participants);
        }
        if (this.participants_count != null) {
            sb.append(", participants_count=");
            sb.append(this.participants_count);
        }
        if (this.min_index != null) {
            sb.append(", min_index=");
            sb.append(this.min_index);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.mute != null) {
            sb.append(", mute=");
            sb.append(this.mute);
        }
        if (this.stick_on_top != null) {
            sb.append(", stick_on_top=");
            sb.append(this.stick_on_top);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_version != null) {
            sb.append(", conversation_version=");
            sb.append(this.conversation_version);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.server_unread_count != null) {
            sb.append(", server_unread_count=");
            sb.append(this.server_unread_count);
        }
        if (this.last_message_index != null) {
            sb.append(", last_message_index=");
            sb.append(this.last_message_index);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationInfo(String str, Integer num, ParticipantsPage participantsPage, Integer num2, Long l, Long l2, Integer num3, Integer num4, Map<String, String> map, String str2, Long l3, Long l4, Boolean bool, Long l5, Long l6) {
        this(str, num, participantsPage, num2, l, l2, num3, num4, map, str2, l3, l4, bool, l5, l6, ByteString.EMPTY);
    }

    public ConversationInfo(String str, Integer num, ParticipantsPage participantsPage, Integer num2, Long l, Long l2, Integer num3, Integer num4, Map<String, String> map, String str2, Long l3, Long l4, Boolean bool, Long l5, Long l6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.min_index = l;
        this.read_index = l2;
        this.mute = num3;
        this.stick_on_top = num4;
        Map<String, String> map2 = map;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.ticket = str2;
        this.conversation_short_id = l3;
        this.conversation_version = l4;
        this.is_participant = bool;
        this.server_unread_count = l5;
        this.last_message_index = l6;
    }
}
