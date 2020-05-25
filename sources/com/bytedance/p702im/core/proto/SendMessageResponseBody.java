package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody */
public final class SendMessageResponseBody extends Message<SendMessageResponseBody, Builder> {
    public static final ProtoAdapter<SendMessageResponseBody> ADAPTER = new ProtoAdapter_SendMessageResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final String client_message_id;
    public final String extra_info;
    public final Long server_message_id;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendMessageResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String client_message_id;
        public String extra_info;
        public Long server_message_id;
        public Integer status;

        public final SendMessageResponseBody build() {
            SendMessageResponseBody sendMessageResponseBody = new SendMessageResponseBody(this.server_message_id, this.extra_info, this.status, this.client_message_id, this.check_code, this.check_message, super.buildUnknownFields());
            return sendMessageResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
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
    }

    /* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody$ProtoAdapter_SendMessageResponseBody */
    static final class ProtoAdapter_SendMessageResponseBody extends ProtoAdapter<SendMessageResponseBody> {
        public ProtoAdapter_SendMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageResponseBody.class);
        }

        public final SendMessageResponseBody redact(SendMessageResponseBody sendMessageResponseBody) {
            Builder newBuilder = sendMessageResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SendMessageResponseBody sendMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, sendMessageResponseBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendMessageResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, sendMessageResponseBody.client_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, sendMessageResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, sendMessageResponseBody.check_message) + sendMessageResponseBody.unknownFields().size();
        }

        public final SendMessageResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendMessageResponseBody sendMessageResponseBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sendMessageResponseBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendMessageResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendMessageResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendMessageResponseBody.client_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, sendMessageResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendMessageResponseBody.check_message);
            protoWriter.writeBytes(sendMessageResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.extra_info = this.extra_info;
        builder.status = this.status;
        builder.client_message_id = this.client_message_id;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMessageResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3) {
        this(l, str, num, str2, l2, str3, ByteString.EMPTY);
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.extra_info = str;
        this.status = num;
        this.client_message_id = str2;
        this.check_code = l2;
        this.check_message = str3;
    }
}
