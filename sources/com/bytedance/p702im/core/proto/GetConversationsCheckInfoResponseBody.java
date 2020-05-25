package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody */
public final class GetConversationsCheckInfoResponseBody extends Message<GetConversationsCheckInfoResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationsCheckInfoResponseBody> ADAPTER = new ProtoAdapter_GetConversationsCheckInfoResponseBody();
    private static final long serialVersionUID = 0;
    public final List<ConversationCheckInfo> conversation_checkinfo_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationsCheckInfoResponseBody, Builder> {
        public List<ConversationCheckInfo> conversation_checkinfo_list = Internal.newMutableList();

        public final GetConversationsCheckInfoResponseBody build() {
            return new GetConversationsCheckInfoResponseBody(this.conversation_checkinfo_list, super.buildUnknownFields());
        }

        public final Builder conversation_checkinfo_list(List<ConversationCheckInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_checkinfo_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody$ProtoAdapter_GetConversationsCheckInfoResponseBody */
    static final class ProtoAdapter_GetConversationsCheckInfoResponseBody extends ProtoAdapter<GetConversationsCheckInfoResponseBody> {
        public ProtoAdapter_GetConversationsCheckInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoResponseBody.class);
        }

        public final int encodedSize(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            return ConversationCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoResponseBody.conversation_checkinfo_list) + getConversationsCheckInfoResponseBody.unknownFields().size();
        }

        public final GetConversationsCheckInfoResponseBody redact(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            Builder newBuilder = getConversationsCheckInfoResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_checkinfo_list, ConversationCheckInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationsCheckInfoResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_checkinfo_list.add(ConversationCheckInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) throws IOException {
            ConversationCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationsCheckInfoResponseBody.conversation_checkinfo_list);
            protoWriter.writeBytes(getConversationsCheckInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_checkinfo_list = Internal.copyOf("conversation_checkinfo_list", this.conversation_checkinfo_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_checkinfo_list.isEmpty()) {
            sb.append(", conversation_checkinfo_list=");
            sb.append(this.conversation_checkinfo_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationsCheckInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_checkinfo_list = Internal.immutableCopyOf("conversation_checkinfo_list", list);
    }
}
