package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody */
public final class UpsertConversationCoreExtInfoResponseBody extends Message<UpsertConversationCoreExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> ADAPTER = new ProtoAdapter_UpsertConversationCoreExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final ConversationCoreInfo core_info;
    public final String extra_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpsertConversationCoreExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo core_info;
        public String extra_info;
        public Integer status;

        public final UpsertConversationCoreExtInfoResponseBody build() {
            UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody = new UpsertConversationCoreExtInfoResponseBody(this.core_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return upsertConversationCoreExtInfoResponseBody;
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

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody$ProtoAdapter_UpsertConversationCoreExtInfoResponseBody */
    static final class ProtoAdapter_UpsertConversationCoreExtInfoResponseBody extends ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> {
        public ProtoAdapter_UpsertConversationCoreExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationCoreExtInfoResponseBody.class);
        }

        public final UpsertConversationCoreExtInfoResponseBody redact(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            Builder newBuilder = upsertConversationCoreExtInfoResponseBody.newBuilder();
            if (newBuilder.core_info != null) {
                newBuilder.core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.core_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationCoreExtInfoResponseBody.core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationCoreExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationCoreExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, upsertConversationCoreExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, upsertConversationCoreExtInfoResponseBody.extra_info) + upsertConversationCoreExtInfoResponseBody.unknownFields().size();
        }

        public final UpsertConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoResponseBody.core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upsertConversationCoreExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(upsertConversationCoreExtInfoResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "UpsertConversationCoreExtInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
