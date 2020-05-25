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

/* renamed from: com.bytedance.im.core.proto.MessageBody */
public final class MessageBody extends Message<MessageBody, Builder> {
    public static final ProtoAdapter<MessageBody> ADAPTER = new ProtoAdapter_MessageBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CREATE_TIME = Long.valueOf(0);
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = Long.valueOf(0);
    public static final Integer DEFAULT_MESSAGE_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_ORDER_IN_CONVERSATION = Long.valueOf(0);
    public static final Long DEFAULT_SENDER = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    public static final Long DEFAULT_VERSION = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String content;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Long create_time;
    public final Map<String, String> ext;
    public final Long index_in_conversation;
    public final Integer message_type;
    public final Long order_in_conversation;
    public final Map<String, PropertyItemList> property_list;
    public final String sec_sender;
    public final Long sender;
    public final Long server_message_id;
    public final Integer status;
    public final Long version;

    /* renamed from: com.bytedance.im.core.proto.MessageBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessageBody, Builder> {
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long create_time;
        public Map<String, String> ext = Internal.newMutableMap();
        public Long index_in_conversation;
        public Integer message_type;
        public Long order_in_conversation;
        public Map<String, PropertyItemList> property_list = Internal.newMutableMap();
        public String sec_sender;
        public Long sender;
        public Long server_message_id;
        public Integer status;
        public Long version;

        public final MessageBody build() {
            MessageBody messageBody = new MessageBody(this.conversation_id, this.conversation_type, this.server_message_id, this.index_in_conversation, this.conversation_short_id, this.message_type, this.sender, this.content, this.ext, this.create_time, this.version, this.status, this.order_in_conversation, this.sec_sender, this.property_list, super.buildUnknownFields());
            return messageBody;
        }

        public final Builder content(String str) {
            this.content = str;
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

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder index_in_conversation(Long l) {
            this.index_in_conversation = l;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder order_in_conversation(Long l) {
            this.order_in_conversation = l;
            return this;
        }

        public final Builder sec_sender(String str) {
            this.sec_sender = str;
            return this;
        }

        public final Builder sender(Long l) {
            this.sender = l;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder property_list(Map<String, PropertyItemList> map) {
            Internal.checkElementsNotNull(map);
            this.property_list = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessageBody$ProtoAdapter_MessageBody */
    static final class ProtoAdapter_MessageBody extends ProtoAdapter<MessageBody> {
        private final ProtoAdapter<Map<String, String>> ext;
        private final ProtoAdapter<Map<String, PropertyItemList>> property_list = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PropertyItemList.ADAPTER);

        public ProtoAdapter_MessageBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final MessageBody redact(MessageBody messageBody) {
            Builder newBuilder = messageBody.newBuilder();
            Internal.redactElements(newBuilder.property_list, PropertyItemList.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessageBody messageBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, messageBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, messageBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, messageBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, messageBody.index_in_conversation) + ProtoAdapter.INT64.encodedSizeWithTag(5, messageBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, messageBody.message_type) + ProtoAdapter.INT64.encodedSizeWithTag(7, messageBody.sender) + ProtoAdapter.STRING.encodedSizeWithTag(8, messageBody.content) + this.ext.encodedSizeWithTag(9, messageBody.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, messageBody.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(11, messageBody.version) + ProtoAdapter.INT32.encodedSizeWithTag(12, messageBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(13, messageBody.order_in_conversation) + ProtoAdapter.STRING.encodedSizeWithTag(14, messageBody.sec_sender) + this.property_list.encodedSizeWithTag(15, messageBody.property_list) + messageBody.unknownFields().size();
        }

        public final MessageBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.index_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.message_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.sender((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 10:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 11:
                            builder.version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 12:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.order_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 14:
                            builder.sec_sender((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.property_list.putAll((Map) this.property_list.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessageBody messageBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageBody.index_in_conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messageBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messageBody.message_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, messageBody.sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messageBody.content);
            this.ext.encodeWithTag(protoWriter, 9, messageBody.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, messageBody.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, messageBody.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, messageBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, messageBody.order_in_conversation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, messageBody.sec_sender);
            this.property_list.encodeWithTag(protoWriter, 15, messageBody.property_list);
            protoWriter.writeBytes(messageBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.server_message_id = this.server_message_id;
        builder.index_in_conversation = this.index_in_conversation;
        builder.conversation_short_id = this.conversation_short_id;
        builder.message_type = this.message_type;
        builder.sender = this.sender;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.create_time = this.create_time;
        builder.version = this.version;
        builder.status = this.status;
        builder.order_in_conversation = this.order_in_conversation;
        builder.sec_sender = this.sec_sender;
        builder.property_list = Internal.copyOf("property_list", this.property_list);
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.order_in_conversation != null) {
            sb.append(", order_in_conversation=");
            sb.append(this.order_in_conversation);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
        if (!this.property_list.isEmpty()) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2) {
        this(str, num, l, l2, l3, num2, l4, str2, map, l5, l6, num3, l7, str3, map2, ByteString.EMPTY);
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.server_message_id = l;
        this.index_in_conversation = l2;
        this.conversation_short_id = l3;
        this.message_type = num2;
        this.sender = l4;
        this.content = str2;
        Map<String, String> map3 = map;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.create_time = l5;
        this.version = l6;
        this.status = num3;
        this.order_in_conversation = l7;
        this.sec_sender = str3;
        this.property_list = Internal.immutableCopyOf("property_list", map2);
    }
}
