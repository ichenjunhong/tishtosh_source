package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ReactionContent */
public final class ReactionContent extends Message<ReactionContent, Builder> {
    public static final ProtoAdapter<ReactionContent> ADAPTER = new ProtoAdapter_ReactionContent();
    public static final Integer DEFAULT_ID = Integer.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    public static final Long DEFAULT_TARGET_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;

    /* renamed from: id */
    public final Integer f30847id;
    public final String name;
    public final Integer status;
    public final String target_client_message_id;
    public final Long target_message_id;

    /* renamed from: com.bytedance.im.core.proto.ReactionContent$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReactionContent, Builder> {

        /* renamed from: id */
        public Integer f30848id;
        public String name;
        public Integer status;
        public String target_client_message_id;
        public Long target_message_id;

        public final ReactionContent build() {
            ReactionContent reactionContent = new ReactionContent(this.f30848id, this.name, this.status, this.target_message_id, this.target_client_message_id, super.buildUnknownFields());
            return reactionContent;
        }

        /* renamed from: id */
        public final Builder mo21837id(Integer num) {
            this.f30848id = num;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder target_client_message_id(String str) {
            this.target_client_message_id = str;
            return this;
        }

        public final Builder target_message_id(Long l) {
            this.target_message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ReactionContent$ProtoAdapter_ReactionContent */
    static final class ProtoAdapter_ReactionContent extends ProtoAdapter<ReactionContent> {
        public ProtoAdapter_ReactionContent() {
            super(FieldEncoding.LENGTH_DELIMITED, ReactionContent.class);
        }

        public final ReactionContent redact(ReactionContent reactionContent) {
            Builder newBuilder = reactionContent.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReactionContent reactionContent) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, reactionContent.f30847id) + ProtoAdapter.STRING.encodedSizeWithTag(2, reactionContent.name) + ProtoAdapter.INT32.encodedSizeWithTag(3, reactionContent.status) + ProtoAdapter.INT64.encodedSizeWithTag(4, reactionContent.target_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, reactionContent.target_client_message_id) + reactionContent.unknownFields().size();
        }

        public final ReactionContent decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo21837id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.target_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.target_client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ReactionContent reactionContent) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, reactionContent.f30847id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reactionContent.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, reactionContent.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, reactionContent.target_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, reactionContent.target_client_message_id);
            protoWriter.writeBytes(reactionContent.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f30848id = this.f30847id;
        builder.name = this.name;
        builder.status = this.status;
        builder.target_message_id = this.target_message_id;
        builder.target_client_message_id = this.target_client_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f30847id != null) {
            sb.append(", id=");
            sb.append(this.f30847id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.target_message_id != null) {
            sb.append(", target_message_id=");
            sb.append(this.target_message_id);
        }
        if (this.target_client_message_id != null) {
            sb.append(", target_client_message_id=");
            sb.append(this.target_client_message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ReactionContent{");
        replace.append('}');
        return replace.toString();
    }

    public ReactionContent(Integer num, String str, Integer num2, Long l, String str2) {
        this(num, str, num2, l, str2, ByteString.EMPTY);
    }

    public ReactionContent(Integer num, String str, Integer num2, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f30847id = num;
        this.name = str;
        this.status = num2;
        this.target_message_id = l;
        this.target_client_message_id = str2;
    }
}
