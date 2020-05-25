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

/* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListResponseBody */
public final class GetConversationCoreInfoListResponseBody extends Message<GetConversationCoreInfoListResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationCoreInfoListResponseBody> ADAPTER = new ProtoAdapter_GetConversationCoreInfoListResponseBody();
    private static final long serialVersionUID = 0;
    public final List<ConversationCoreInfo> conversation_core_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationCoreInfoListResponseBody, Builder> {
        public List<ConversationCoreInfo> conversation_core_info_list = Internal.newMutableList();

        public final GetConversationCoreInfoListResponseBody build() {
            return new GetConversationCoreInfoListResponseBody(this.conversation_core_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_core_info_list(List<ConversationCoreInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_core_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoListResponseBody$ProtoAdapter_GetConversationCoreInfoListResponseBody */
    static final class ProtoAdapter_GetConversationCoreInfoListResponseBody extends ProtoAdapter<GetConversationCoreInfoListResponseBody> {
        public ProtoAdapter_GetConversationCoreInfoListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationCoreInfoListResponseBody.class);
        }

        public final int encodedSize(GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody) {
            return ConversationCoreInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationCoreInfoListResponseBody.conversation_core_info_list) + getConversationCoreInfoListResponseBody.unknownFields().size();
        }

        public final GetConversationCoreInfoListResponseBody redact(GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody) {
            Builder newBuilder = getConversationCoreInfoListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_core_info_list, ConversationCoreInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationCoreInfoListResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_core_info_list.add(ConversationCoreInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationCoreInfoListResponseBody.conversation_core_info_list);
            protoWriter.writeBytes(getConversationCoreInfoListResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_core_info_list = Internal.copyOf("conversation_core_info_list", this.conversation_core_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_core_info_list.isEmpty()) {
            sb.append(", conversation_core_info_list=");
            sb.append(this.conversation_core_info_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationCoreInfoListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationCoreInfoListResponseBody(List<ConversationCoreInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationCoreInfoListResponseBody(List<ConversationCoreInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_core_info_list = Internal.immutableCopyOf("conversation_core_info_list", list);
    }
}
