package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody */
public final class UpsertConversationSettingExtInfoResponseBody extends Message<UpsertConversationSettingExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> ADAPTER = new ProtoAdapter_UpsertConversationSettingExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final String extra_info;
    public final ConversationSettingInfo setting_info;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpsertConversationSettingExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public ConversationSettingInfo setting_info;
        public Integer status;

        public final UpsertConversationSettingExtInfoResponseBody build() {
            UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody = new UpsertConversationSettingExtInfoResponseBody(this.setting_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return upsertConversationSettingExtInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.setting_info = conversationSettingInfo;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody$ProtoAdapter_UpsertConversationSettingExtInfoResponseBody */
    static final class ProtoAdapter_UpsertConversationSettingExtInfoResponseBody extends ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> {
        public ProtoAdapter_UpsertConversationSettingExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationSettingExtInfoResponseBody.class);
        }

        public final UpsertConversationSettingExtInfoResponseBody redact(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            Builder newBuilder = upsertConversationSettingExtInfoResponseBody.newBuilder();
            if (newBuilder.setting_info != null) {
                newBuilder.setting_info = (ConversationSettingInfo) ConversationSettingInfo.ADAPTER.redact(newBuilder.setting_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            return ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationSettingExtInfoResponseBody.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationSettingExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationSettingExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, upsertConversationSettingExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, upsertConversationSettingExtInfoResponseBody.extra_info) + upsertConversationSettingExtInfoResponseBody.unknownFields().size();
        }

        public final UpsertConversationSettingExtInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.setting_info((ConversationSettingInfo) ConversationSettingInfo.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) throws IOException {
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoResponseBody.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, upsertConversationSettingExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(upsertConversationSettingExtInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setting_info = this.setting_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setting_info != null) {
            sb.append(", setting_info=");
            sb.append(this.setting_info);
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
        StringBuilder replace = sb.replace(0, 2, "UpsertConversationSettingExtInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
