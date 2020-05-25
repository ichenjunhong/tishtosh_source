package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex */
public final class ParticipantReadIndex extends Message<ParticipantReadIndex, Builder> {
    public static final ProtoAdapter<ParticipantReadIndex> ADAPTER = new ProtoAdapter_ParticipantReadIndex();
    public static final Long DEFAULT_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long index;
    public final String sec_uid;
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ParticipantReadIndex, Builder> {
        public Long index;
        public String sec_uid;
        public Long user_id;

        public final ParticipantReadIndex build() {
            return new ParticipantReadIndex(this.user_id, this.sec_uid, this.index, super.buildUnknownFields());
        }

        public final Builder index(Long l) {
            this.index = l;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ParticipantReadIndex$ProtoAdapter_ParticipantReadIndex */
    static final class ProtoAdapter_ParticipantReadIndex extends ProtoAdapter<ParticipantReadIndex> {
        public ProtoAdapter_ParticipantReadIndex() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantReadIndex.class);
        }

        public final ParticipantReadIndex redact(ParticipantReadIndex participantReadIndex) {
            Builder newBuilder = participantReadIndex.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ParticipantReadIndex participantReadIndex) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participantReadIndex.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantReadIndex.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantReadIndex.index) + participantReadIndex.unknownFields().size();
        }

        public final ParticipantReadIndex decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.index((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ParticipantReadIndex participantReadIndex) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participantReadIndex.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantReadIndex.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantReadIndex.index);
            protoWriter.writeBytes(participantReadIndex.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sec_uid = this.sec_uid;
        builder.index = this.index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantReadIndex{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantReadIndex(Long l, String str, Long l2) {
        this(l, str, l2, ByteString.EMPTY);
    }

    public ParticipantReadIndex(Long l, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
    }
}
