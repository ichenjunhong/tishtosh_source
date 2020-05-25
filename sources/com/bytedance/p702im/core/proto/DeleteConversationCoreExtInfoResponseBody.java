package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody */
public final class DeleteConversationCoreExtInfoResponseBody extends Message<DeleteConversationCoreExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<DeleteConversationCoreExtInfoResponseBody> ADAPTER = new ProtoAdapter_DeleteConversationCoreExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final ConversationCoreInfo core_info;
    public final String extra_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteConversationCoreExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo core_info;
        public String extra_info;
        public Integer status;

        public final DeleteConversationCoreExtInfoResponseBody build() {
            DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody = new DeleteConversationCoreExtInfoResponseBody(this.core_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return deleteConversationCoreExtInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder core_info(ConversationCoreInfo conversationCoreInfo) {
            this.core_info = conversationCoreInfo;
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

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody$ProtoAdapter_DeleteConversationCoreExtInfoResponseBody */
    static final class ProtoAdapter_DeleteConversationCoreExtInfoResponseBody extends ProtoAdapter<DeleteConversationCoreExtInfoResponseBody> {
        public ProtoAdapter_DeleteConversationCoreExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteConversationCoreExtInfoResponseBody.class);
        }

        public final DeleteConversationCoreExtInfoResponseBody redact(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            Builder newBuilder = deleteConversationCoreExtInfoResponseBody.newBuilder();
            if (newBuilder.core_info != null) {
                newBuilder.core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.core_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, deleteConversationCoreExtInfoResponseBody.core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, deleteConversationCoreExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, deleteConversationCoreExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, deleteConversationCoreExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, deleteConversationCoreExtInfoResponseBody.extra_info) + deleteConversationCoreExtInfoResponseBody.unknownFields().size();
        }

        public final DeleteConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.core_info((ConversationCoreInfo) ConversationCoreInfo.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, deleteConversationCoreExtInfoResponseBody.core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, deleteConversationCoreExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, deleteConversationCoreExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, deleteConversationCoreExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, deleteConversationCoreExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(deleteConversationCoreExtInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.core_info = this.core_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.core_info != null) {
            sb.append(", core_info=");
            sb.append(this.core_info);
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
        StringBuilder replace = sb.replace(0, 2, "DeleteConversationCoreExtInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public DeleteConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
