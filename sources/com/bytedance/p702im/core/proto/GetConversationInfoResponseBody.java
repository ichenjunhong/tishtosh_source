package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoResponseBody */
public final class GetConversationInfoResponseBody extends Message<GetConversationInfoResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoResponseBody();
    private static final long serialVersionUID = 0;
    public final ConversationInfo conversation_info;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoResponseBody, Builder> {
        public ConversationInfo conversation_info;

        public final GetConversationInfoResponseBody build() {
            return new GetConversationInfoResponseBody(this.conversation_info, super.buildUnknownFields());
        }

        public final Builder conversation_info(ConversationInfo conversationInfo) {
            this.conversation_info = conversationInfo;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoResponseBody$ProtoAdapter_GetConversationInfoResponseBody */
    static final class ProtoAdapter_GetConversationInfoResponseBody extends ProtoAdapter<GetConversationInfoResponseBody> {
        public ProtoAdapter_GetConversationInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoResponseBody getConversationInfoResponseBody) {
            return ConversationInfo.ADAPTER.encodedSizeWithTag(1, getConversationInfoResponseBody.conversation_info) + getConversationInfoResponseBody.unknownFields().size();
        }

        public final GetConversationInfoResponseBody redact(GetConversationInfoResponseBody getConversationInfoResponseBody) {
            Builder newBuilder = getConversationInfoResponseBody.newBuilder();
            if (newBuilder.conversation_info != null) {
                newBuilder.conversation_info = (ConversationInfo) ConversationInfo.ADAPTER.redact(newBuilder.conversation_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_info((ConversationInfo) ConversationInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoResponseBody getConversationInfoResponseBody) throws IOException {
            ConversationInfo.ADAPTER.encodeWithTag(protoWriter, 1, getConversationInfoResponseBody.conversation_info);
            protoWriter.writeBytes(getConversationInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info = this.conversation_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_info != null) {
            sb.append(", conversation_info=");
            sb.append(this.conversation_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoResponseBody(ConversationInfo conversationInfo) {
        this(conversationInfo, ByteString.EMPTY);
    }

    public GetConversationInfoResponseBody(ConversationInfo conversationInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info = conversationInfo;
    }
}
