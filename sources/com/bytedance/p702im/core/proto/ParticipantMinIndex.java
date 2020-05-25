package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ParticipantMinIndex */
public final class ParticipantMinIndex extends Message<ParticipantMinIndex, Builder> {
    public static final ProtoAdapter<ParticipantMinIndex> ADAPTER = new ProtoAdapter_ParticipantMinIndex();
    public static final Long DEFAULT_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long index;
    public final String sec_uid;
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.ParticipantMinIndex$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ParticipantMinIndex, Builder> {
        public Long index;
        public String sec_uid;
        public Long user_id;

        public final ParticipantMinIndex build() {
            return new ParticipantMinIndex(this.user_id, this.sec_uid, this.index, super.buildUnknownFields());
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

    /* renamed from: com.bytedance.im.core.proto.ParticipantMinIndex$ProtoAdapter_ParticipantMinIndex */
    static final class ProtoAdapter_ParticipantMinIndex extends ProtoAdapter<ParticipantMinIndex> {
        public ProtoAdapter_ParticipantMinIndex() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantMinIndex.class);
        }

        public final ParticipantMinIndex redact(ParticipantMinIndex participantMinIndex) {
            Builder newBuilder = participantMinIndex.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ParticipantMinIndex participantMinIndex) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participantMinIndex.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantMinIndex.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantMinIndex.index) + participantMinIndex.unknownFields().size();
        }

        public final ParticipantMinIndex decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, ParticipantMinIndex participantMinIndex) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participantMinIndex.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantMinIndex.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantMinIndex.index);
            protoWriter.writeBytes(participantMinIndex.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "ParticipantMinIndex{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantMinIndex(Long l, String str, Long l2) {
        this(l, str, l2, ByteString.EMPTY);
    }

    public ParticipantMinIndex(Long l, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sec_uid = str;
        this.index = l2;
    }
}
