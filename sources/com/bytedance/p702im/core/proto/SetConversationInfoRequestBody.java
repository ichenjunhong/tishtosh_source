package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SetConversationInfoRequestBody */
public final class SetConversationInfoRequestBody extends Message<SetConversationInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetConversationInfoRequestBody> ADAPTER = new ProtoAdapter_SetConversationInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Map<String, String> ext;

    /* renamed from: com.bytedance.im.core.proto.SetConversationInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetConversationInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();

        public final SetConversationInfoRequestBody build() {
            SetConversationInfoRequestBody setConversationInfoRequestBody = new SetConversationInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.ext, super.buildUnknownFields());
            return setConversationInfoRequestBody;
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

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetConversationInfoRequestBody$ProtoAdapter_SetConversationInfoRequestBody */
    static final class ProtoAdapter_SetConversationInfoRequestBody extends ProtoAdapter<SetConversationInfoRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_SetConversationInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationInfoRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final SetConversationInfoRequestBody redact(SetConversationInfoRequestBody setConversationInfoRequestBody) {
            Builder newBuilder = setConversationInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetConversationInfoRequestBody setConversationInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationInfoRequestBody.conversation_type) + this.ext.encodedSizeWithTag(4, setConversationInfoRequestBody.ext) + setConversationInfoRequestBody.unknownFields().size();
        }

        public final SetConversationInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetConversationInfoRequestBody setConversationInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationInfoRequestBody.conversation_type);
            this.ext.encodeWithTag(protoWriter, 4, setConversationInfoRequestBody.ext);
            protoWriter.writeBytes(setConversationInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.ext = Internal.copyOf("ext", this.ext);
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
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        StringBuilder replace = sb.replace(0, 2, "SetConversationInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public SetConversationInfoRequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, ByteString.EMPTY);
    }

    public SetConversationInfoRequestBody(String str, Long l, Integer num, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
