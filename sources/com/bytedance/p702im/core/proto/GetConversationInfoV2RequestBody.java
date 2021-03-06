package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody */
public final class GetConversationInfoV2RequestBody extends Message<GetConversationInfoV2RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoV2RequestBody> ADAPTER = new ProtoAdapter_GetConversationInfoV2RequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoV2RequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final GetConversationInfoV2RequestBody build() {
            return new GetConversationInfoV2RequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
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

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2RequestBody$ProtoAdapter_GetConversationInfoV2RequestBody */
    static final class ProtoAdapter_GetConversationInfoV2RequestBody extends ProtoAdapter<GetConversationInfoV2RequestBody> {
        public ProtoAdapter_GetConversationInfoV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2RequestBody.class);
        }

        public final GetConversationInfoV2RequestBody redact(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            Builder newBuilder = getConversationInfoV2RequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationInfoV2RequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationInfoV2RequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationInfoV2RequestBody.conversation_type) + getConversationInfoV2RequestBody.unknownFields().size();
        }

        public final GetConversationInfoV2RequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationInfoV2RequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationInfoV2RequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationInfoV2RequestBody.conversation_type);
            protoWriter.writeBytes(getConversationInfoV2RequestBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoV2RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
