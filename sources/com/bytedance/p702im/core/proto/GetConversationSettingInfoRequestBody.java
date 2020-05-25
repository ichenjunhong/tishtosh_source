package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody */
public final class GetConversationSettingInfoRequestBody extends Message<GetConversationSettingInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationSettingInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long conversation_short_id;

    /* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationSettingInfoRequestBody, Builder> {
        public Long conversation_short_id;

        public final GetConversationSettingInfoRequestBody build() {
            return new GetConversationSettingInfoRequestBody(this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationSettingInfoRequestBody$ProtoAdapter_GetConversationSettingInfoRequestBody */
    static final class ProtoAdapter_GetConversationSettingInfoRequestBody extends ProtoAdapter<GetConversationSettingInfoRequestBody> {
        public ProtoAdapter_GetConversationSettingInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationSettingInfoRequestBody.class);
        }

        public final GetConversationSettingInfoRequestBody redact(GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) {
            Builder newBuilder = getConversationSettingInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationSettingInfoRequestBody.conversation_short_id) + getConversationSettingInfoRequestBody.unknownFields().size();
        }

        public final GetConversationSettingInfoRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationSettingInfoRequestBody getConversationSettingInfoRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationSettingInfoRequestBody.conversation_short_id);
            protoWriter.writeBytes(getConversationSettingInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationSettingInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationSettingInfoRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public GetConversationSettingInfoRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
