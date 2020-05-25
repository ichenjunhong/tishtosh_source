package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody */
public final class DeleteMessageRequestBody extends Message<DeleteMessageRequestBody, Builder> {
    public static final ProtoAdapter<DeleteMessageRequestBody> ADAPTER = new ProtoAdapter_DeleteMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Long message_id;

    /* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long message_id;

        public final DeleteMessageRequestBody build() {
            DeleteMessageRequestBody deleteMessageRequestBody = new DeleteMessageRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.message_id, super.buildUnknownFields());
            return deleteMessageRequestBody;
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

        public final Builder message_id(Long l) {
            this.message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody$ProtoAdapter_DeleteMessageRequestBody */
    static final class ProtoAdapter_DeleteMessageRequestBody extends ProtoAdapter<DeleteMessageRequestBody> {
        public ProtoAdapter_DeleteMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessageRequestBody.class);
        }

        public final DeleteMessageRequestBody redact(DeleteMessageRequestBody deleteMessageRequestBody) {
            Builder newBuilder = deleteMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteMessageRequestBody deleteMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteMessageRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, deleteMessageRequestBody.message_id) + deleteMessageRequestBody.unknownFields().size();
        }

        public final DeleteMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.message_id((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteMessageRequestBody deleteMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, deleteMessageRequestBody.message_id);
            protoWriter.writeBytes(deleteMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.message_id = this.message_id;
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
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, ByteString.EMPTY);
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.message_id = l2;
    }
}
