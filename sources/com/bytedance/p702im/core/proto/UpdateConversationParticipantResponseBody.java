package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody */
public final class UpdateConversationParticipantResponseBody extends Message<UpdateConversationParticipantResponseBody, Builder> {
    public static final ProtoAdapter<UpdateConversationParticipantResponseBody> ADAPTER = new ProtoAdapter_UpdateConversationParticipantResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final String extra_info;
    public final Participant participant;
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpdateConversationParticipantResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public Participant participant;
        public Integer status;

        public final UpdateConversationParticipantResponseBody build() {
            UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody = new UpdateConversationParticipantResponseBody(this.participant, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
            return updateConversationParticipantResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder participant(Participant participant2) {
            this.participant = participant2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody$ProtoAdapter_UpdateConversationParticipantResponseBody */
    static final class ProtoAdapter_UpdateConversationParticipantResponseBody extends ProtoAdapter<UpdateConversationParticipantResponseBody> {
        public ProtoAdapter_UpdateConversationParticipantResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantResponseBody.class);
        }

        public final UpdateConversationParticipantResponseBody redact(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            Builder newBuilder = updateConversationParticipantResponseBody.newBuilder();
            if (newBuilder.participant != null) {
                newBuilder.participant = (Participant) Participant.ADAPTER.redact(newBuilder.participant);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            return Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResponseBody.participant) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, updateConversationParticipantResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, updateConversationParticipantResponseBody.check_message) + updateConversationParticipantResponseBody.unknownFields().size();
        }

        public final UpdateConversationParticipantResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.participant((Participant) Participant.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) throws IOException {
            Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResponseBody.participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateConversationParticipantResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, updateConversationParticipantResponseBody.check_message);
            protoWriter.writeBytes(updateConversationParticipantResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.participant = this.participant;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participant != null) {
            sb.append(", participant=");
            sb.append(this.participant);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateConversationParticipantResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateConversationParticipantResponseBody(Participant participant2, Integer num, String str, Long l, String str2) {
        this(participant2, num, str, l, str2, ByteString.EMPTY);
    }

    public UpdateConversationParticipantResponseBody(Participant participant2, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participant = participant2;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
