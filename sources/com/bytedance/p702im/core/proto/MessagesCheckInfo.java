package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo */
public final class MessagesCheckInfo extends Message<MessagesCheckInfo, Builder> {
    public static final ProtoAdapter<MessagesCheckInfo> ADAPTER = new ProtoAdapter_MessagesCheckInfo();
    public static final Long DEFAULT_HEAD_MSG_INDEX = Long.valueOf(0);
    public static final Integer DEFAULT_INDEXES_CHECKSUM = Integer.valueOf(0);
    public static final Integer DEFAULT_MSG_COUNT = Integer.valueOf(0);
    public static final Long DEFAULT_TAIL_MSG_INDEX = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long head_msg_index;
    public final Integer indexes_checksum;
    public final Integer msg_count;
    public final Long tail_msg_index;

    /* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesCheckInfo, Builder> {
        public Long head_msg_index;
        public Integer indexes_checksum;
        public Integer msg_count;
        public Long tail_msg_index;

        public final MessagesCheckInfo build() {
            MessagesCheckInfo messagesCheckInfo = new MessagesCheckInfo(this.head_msg_index, this.tail_msg_index, this.msg_count, this.indexes_checksum, super.buildUnknownFields());
            return messagesCheckInfo;
        }

        public final Builder head_msg_index(Long l) {
            this.head_msg_index = l;
            return this;
        }

        public final Builder indexes_checksum(Integer num) {
            this.indexes_checksum = num;
            return this;
        }

        public final Builder msg_count(Integer num) {
            this.msg_count = num;
            return this;
        }

        public final Builder tail_msg_index(Long l) {
            this.tail_msg_index = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesCheckInfo$ProtoAdapter_MessagesCheckInfo */
    static final class ProtoAdapter_MessagesCheckInfo extends ProtoAdapter<MessagesCheckInfo> {
        public ProtoAdapter_MessagesCheckInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesCheckInfo.class);
        }

        public final MessagesCheckInfo redact(MessagesCheckInfo messagesCheckInfo) {
            Builder newBuilder = messagesCheckInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesCheckInfo messagesCheckInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesCheckInfo.head_msg_index) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesCheckInfo.tail_msg_index) + ProtoAdapter.INT32.encodedSizeWithTag(3, messagesCheckInfo.msg_count) + ProtoAdapter.UINT32.encodedSizeWithTag(4, messagesCheckInfo.indexes_checksum) + messagesCheckInfo.unknownFields().size();
        }

        public final MessagesCheckInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.head_msg_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.tail_msg_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.msg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.indexes_checksum((Integer) ProtoAdapter.UINT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessagesCheckInfo messagesCheckInfo) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesCheckInfo.head_msg_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesCheckInfo.tail_msg_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messagesCheckInfo.msg_count);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, messagesCheckInfo.indexes_checksum);
            protoWriter.writeBytes(messagesCheckInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.head_msg_index = this.head_msg_index;
        builder.tail_msg_index = this.tail_msg_index;
        builder.msg_count = this.msg_count;
        builder.indexes_checksum = this.indexes_checksum;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_msg_index != null) {
            sb.append(", head_msg_index=");
            sb.append(this.head_msg_index);
        }
        if (this.tail_msg_index != null) {
            sb.append(", tail_msg_index=");
            sb.append(this.tail_msg_index);
        }
        if (this.msg_count != null) {
            sb.append(", msg_count=");
            sb.append(this.msg_count);
        }
        if (this.indexes_checksum != null) {
            sb.append(", indexes_checksum=");
            sb.append(this.indexes_checksum);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesCheckInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2) {
        this(l, l2, num, num2, ByteString.EMPTY);
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.head_msg_index = l;
        this.tail_msg_index = l2;
        this.msg_count = num;
        this.indexes_checksum = num2;
    }
}
