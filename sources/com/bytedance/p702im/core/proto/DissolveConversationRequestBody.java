package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DissolveConversationRequestBody */
public final class DissolveConversationRequestBody extends Message<DissolveConversationRequestBody, Builder> {
    public static final ProtoAdapter<DissolveConversationRequestBody> ADAPTER = new ProtoAdapter_DissolveConversationRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.DissolveConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DissolveConversationRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final DissolveConversationRequestBody build() {
            return new DissolveConversationRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
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
    }

    /* renamed from: com.bytedance.im.core.proto.DissolveConversationRequestBody$ProtoAdapter_DissolveConversationRequestBody */
    static final class ProtoAdapter_DissolveConversationRequestBody extends ProtoAdapter<DissolveConversationRequestBody> {
        public ProtoAdapter_DissolveConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DissolveConversationRequestBody.class);
        }

        public final DissolveConversationRequestBody redact(DissolveConversationRequestBody dissolveConversationRequestBody) {
            Builder newBuilder = dissolveConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DissolveConversationRequestBody dissolveConversationRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, dissolveConversationRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, dissolveConversationRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, dissolveConversationRequestBody.conversation_type) + dissolveConversationRequestBody.unknownFields().size();
        }

        public final DissolveConversationRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, DissolveConversationRequestBody dissolveConversationRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dissolveConversationRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, dissolveConversationRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, dissolveConversationRequestBody.conversation_type);
            protoWriter.writeBytes(dissolveConversationRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
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
        StringBuilder replace = sb.replace(0, 2, "DissolveConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
