package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.Participant */
public final class Participant extends Message<Participant, Builder> {
    public static final ProtoAdapter<Participant> ADAPTER = new ProtoAdapter_Participant();
    public static final Integer DEFAULT_ROLE = Integer.valueOf(0);
    public static final Long DEFAULT_SORT_ORDER = Long.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String alias;
    public final Integer role;
    public final String sec_uid;
    public final Long sort_order;
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.Participant$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Participant, Builder> {
        public String alias;
        public Integer role;
        public String sec_uid;
        public Long sort_order;
        public Long user_id;

        public final Participant build() {
            Participant participant = new Participant(this.user_id, this.sort_order, this.role, this.alias, this.sec_uid, super.buildUnknownFields());
            return participant;
        }

        public final Builder alias(String str) {
            this.alias = str;
            return this;
        }

        public final Builder role(Integer num) {
            this.role = num;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder sort_order(Long l) {
            this.sort_order = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Participant$ProtoAdapter_Participant */
    static final class ProtoAdapter_Participant extends ProtoAdapter<Participant> {
        public ProtoAdapter_Participant() {
            super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
        }

        public final Participant redact(Participant participant) {
            Builder newBuilder = participant.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Participant participant) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participant.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, participant.sort_order) + ProtoAdapter.INT32.encodedSizeWithTag(3, participant.role) + ProtoAdapter.STRING.encodedSizeWithTag(4, participant.alias) + ProtoAdapter.STRING.encodedSizeWithTag(5, participant.sec_uid) + participant.unknownFields().size();
        }

        public final Participant decode(ProtoReader protoReader) throws IOException {
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
                            builder.sort_order((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.role((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.alias((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, Participant participant) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participant.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, participant.sort_order);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, participant.role);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, participant.alias);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, participant.sec_uid);
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sort_order = this.sort_order;
        builder.role = this.role;
        builder.alias = this.alias;
        builder.sec_uid = this.sec_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sort_order != null) {
            sb.append(", sort_order=");
            sb.append(this.sort_order);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        StringBuilder replace = sb.replace(0, 2, "Participant{");
        replace.append('}');
        return replace.toString();
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2) {
        this(l, l2, num, str, str2, ByteString.EMPTY);
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.sort_order = l2;
        this.role = num;
        this.alias = str;
        this.sec_uid = str2;
    }
}
