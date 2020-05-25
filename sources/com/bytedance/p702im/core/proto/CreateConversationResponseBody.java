package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.CreateConversationResponseBody */
public final class CreateConversationResponseBody extends Message<CreateConversationResponseBody, Builder> {
    public static final ProtoAdapter<CreateConversationResponseBody> ADAPTER = new ProtoAdapter_CreateConversationResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final ConversationInfo conversation;
    public final String extra_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.CreateConversationResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CreateConversationResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationInfo conversation;
        public String extra_info;
        public Integer status;

        public final CreateConversationResponseBody build() {
            CreateConversationResponseBody createConversationResponseBody = new CreateConversationResponseBody(this.conversation, this.check_code, this.check_message, this.extra_info, this.status, super.buildUnknownFields());
            return createConversationResponseBody;
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

    /* renamed from: com.bytedance.im.core.proto.CreateConversationResponseBody$ProtoAdapter_CreateConversationResponseBody */
    static final class ProtoAdapter_CreateConversationResponseBody extends ProtoAdapter<CreateConversationResponseBody> {
        public ProtoAdapter_CreateConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationResponseBody.class);
        }

        public final CreateConversationResponseBody redact(CreateConversationResponseBody createConversationResponseBody) {
            Builder newBuilder = createConversationResponseBody.newBuilder();
            if (newBuilder.conversation != null) {
                newBuilder.conversation = (ConversationInfo) ConversationInfo.ADAPTER.redact(newBuilder.conversation);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(CreateConversationResponseBody createConversationResponseBody) {
            return ConversationInfo.ADAPTER.encodedSizeWithTag(1, createConversationResponseBody.conversation) + ProtoAdapter.INT64.encodedSizeWithTag(2, createConversationResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, createConversationResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, createConversationResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, createConversationResponseBody.status) + createConversationResponseBody.unknownFields().size();
        }

        public final CreateConversationResponseBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CreateConversationResponseBody createConversationResponseBody) throws IOException {
            ConversationInfo.ADAPTER.encodeWithTag(protoWriter, 1, createConversationResponseBody.conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, createConversationResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createConversationResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createConversationResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, createConversationResponseBody.status);
            protoWriter.writeBytes(createConversationResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation = this.conversation;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
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
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateConversationResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public CreateConversationResponseBody(ConversationInfo conversationInfo, Long l, String str, String str2, Integer num) {
        this(conversationInfo, l, str, str2, num, ByteString.EMPTY);
    }

    public CreateConversationResponseBody(ConversationInfo conversationInfo, Long l, String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation = conversationInfo;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
        this.status = num;
    }
}
