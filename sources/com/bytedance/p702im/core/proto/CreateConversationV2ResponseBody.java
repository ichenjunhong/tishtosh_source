package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.CreateConversationV2ResponseBody */
public final class CreateConversationV2ResponseBody extends Message<CreateConversationV2ResponseBody, Builder> {
    public static final ProtoAdapter<CreateConversationV2ResponseBody> ADAPTER = new ProtoAdapter_CreateConversationV2ResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final ConversationInfoV2 conversation;
    public final String extra_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.CreateConversationV2ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CreateConversationV2ResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationInfoV2 conversation;
        public String extra_info;
        public Integer status;

        public final CreateConversationV2ResponseBody build() {
            CreateConversationV2ResponseBody createConversationV2ResponseBody = new CreateConversationV2ResponseBody(this.conversation, this.check_code, this.check_message, this.extra_info, this.status, super.buildUnknownFields());
            return createConversationV2ResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder conversation(ConversationInfoV2 conversationInfoV2) {
            this.conversation = conversationInfoV2;
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

    /* renamed from: com.bytedance.im.core.proto.CreateConversationV2ResponseBody$ProtoAdapter_CreateConversationV2ResponseBody */
    static final class ProtoAdapter_CreateConversationV2ResponseBody extends ProtoAdapter<CreateConversationV2ResponseBody> {
        public ProtoAdapter_CreateConversationV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2ResponseBody.class);
        }

        public final CreateConversationV2ResponseBody redact(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            Builder newBuilder = createConversationV2ResponseBody.newBuilder();
            if (newBuilder.conversation != null) {
                newBuilder.conversation = (ConversationInfoV2) ConversationInfoV2.ADAPTER.redact(newBuilder.conversation);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, createConversationV2ResponseBody.conversation) + ProtoAdapter.INT64.encodedSizeWithTag(2, createConversationV2ResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, createConversationV2ResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, createConversationV2ResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, createConversationV2ResponseBody.status) + createConversationV2ResponseBody.unknownFields().size();
        }

        public final CreateConversationV2ResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation((ConversationInfoV2) ConversationInfoV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CreateConversationV2ResponseBody createConversationV2ResponseBody) throws IOException {
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, createConversationV2ResponseBody.conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, createConversationV2ResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createConversationV2ResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createConversationV2ResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, createConversationV2ResponseBody.status);
            protoWriter.writeBytes(createConversationV2ResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "CreateConversationV2ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num) {
        this(conversationInfoV2, l, str, str2, num, ByteString.EMPTY);
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation = conversationInfoV2;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
        this.status = num;
    }
}
