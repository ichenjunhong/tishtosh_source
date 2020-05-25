package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SetConversationInfoResponseBody */
public final class SetConversationInfoResponseBody extends Message<SetConversationInfoResponseBody, Builder> {
    public static final ProtoAdapter<SetConversationInfoResponseBody> ADAPTER = new ProtoAdapter_SetConversationInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final ConversationInfo conversation;
    public final String extra_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SetConversationInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetConversationInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationInfo conversation;
        public String extra_info;
        public Integer status;

        public final SetConversationInfoResponseBody build() {
            SetConversationInfoResponseBody setConversationInfoResponseBody = new SetConversationInfoResponseBody(this.conversation, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return setConversationInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder conversation(ConversationInfo conversationInfo) {
            this.conversation = conversationInfo;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetConversationInfoResponseBody$ProtoAdapter_SetConversationInfoResponseBody */
    static final class ProtoAdapter_SetConversationInfoResponseBody extends ProtoAdapter<SetConversationInfoResponseBody> {
        public ProtoAdapter_SetConversationInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationInfoResponseBody.class);
        }

        public final SetConversationInfoResponseBody redact(SetConversationInfoResponseBody setConversationInfoResponseBody) {
            Builder newBuilder = setConversationInfoResponseBody.newBuilder();
            if (newBuilder.conversation != null) {
                newBuilder.conversation = (ConversationInfo) ConversationInfo.ADAPTER.redact(newBuilder.conversation);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetConversationInfoResponseBody setConversationInfoResponseBody) {
            return ConversationInfo.ADAPTER.encodedSizeWithTag(1, setConversationInfoResponseBody.conversation) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, setConversationInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, setConversationInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationInfoResponseBody.extra_info) + setConversationInfoResponseBody.unknownFields().size();
        }

        public final SetConversationInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation((ConversationInfo) ConversationInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetConversationInfoResponseBody setConversationInfoResponseBody) throws IOException {
            ConversationInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationInfoResponseBody.conversation);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, setConversationInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setConversationInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationInfoResponseBody.extra_info);
            protoWriter.writeBytes(setConversationInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation = this.conversation;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SetConversationInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public SetConversationInfoResponseBody(ConversationInfo conversationInfo, Integer num, Long l, String str, String str2) {
        this(conversationInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public SetConversationInfoResponseBody(ConversationInfo conversationInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation = conversationInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
