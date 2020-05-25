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

/* renamed from: com.bytedance.im.core.proto.SetGroupInfoRequestBody */
public final class SetGroupInfoRequestBody extends Message<SetGroupInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetGroupInfoRequestBody> ADAPTER = new ProtoAdapter_SetGroupInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Map<String, String> ext;
    public final String group_desc;
    public final String group_icon;
    public final String group_name;

    /* renamed from: com.bytedance.im.core.proto.SetGroupInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetGroupInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public String group_desc;
        public String group_icon;
        public String group_name;

        public final SetGroupInfoRequestBody build() {
            SetGroupInfoRequestBody setGroupInfoRequestBody = new SetGroupInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.group_name, this.group_desc, this.group_icon, this.ext, super.buildUnknownFields());
            return setGroupInfoRequestBody;
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

        public final Builder group_desc(String str) {
            this.group_desc = str;
            return this;
        }

        public final Builder group_icon(String str) {
            this.group_icon = str;
            return this;
        }

        public final Builder group_name(String str) {
            this.group_name = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetGroupInfoRequestBody$ProtoAdapter_SetGroupInfoRequestBody */
    static final class ProtoAdapter_SetGroupInfoRequestBody extends ProtoAdapter<SetGroupInfoRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_SetGroupInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetGroupInfoRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final SetGroupInfoRequestBody redact(SetGroupInfoRequestBody setGroupInfoRequestBody) {
            Builder newBuilder = setGroupInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetGroupInfoRequestBody setGroupInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setGroupInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setGroupInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setGroupInfoRequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, setGroupInfoRequestBody.group_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, setGroupInfoRequestBody.group_desc) + ProtoAdapter.STRING.encodedSizeWithTag(7, setGroupInfoRequestBody.group_icon) + this.ext.encodedSizeWithTag(8, setGroupInfoRequestBody.ext) + setGroupInfoRequestBody.unknownFields().size();
        }

        public final SetGroupInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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
                        case 5:
                            builder.group_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.group_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.group_icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
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

        public final void encode(ProtoWriter protoWriter, SetGroupInfoRequestBody setGroupInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setGroupInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setGroupInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setGroupInfoRequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setGroupInfoRequestBody.group_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, setGroupInfoRequestBody.group_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, setGroupInfoRequestBody.group_icon);
            this.ext.encodeWithTag(protoWriter, 8, setGroupInfoRequestBody.ext);
            protoWriter.writeBytes(setGroupInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.group_name = this.group_name;
        builder.group_desc = this.group_desc;
        builder.group_icon = this.group_icon;
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
        if (this.group_name != null) {
            sb.append(", group_name=");
            sb.append(this.group_name);
        }
        if (this.group_desc != null) {
            sb.append(", group_desc=");
            sb.append(this.group_desc);
        }
        if (this.group_icon != null) {
            sb.append(", group_icon=");
            sb.append(this.group_icon);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        StringBuilder replace = sb.replace(0, 2, "SetGroupInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public SetGroupInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, Map<String, String> map) {
        this(str, l, num, str2, str3, str4, map, ByteString.EMPTY);
    }

    public SetGroupInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.group_name = str2;
        this.group_desc = str3;
        this.group_icon = str4;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
