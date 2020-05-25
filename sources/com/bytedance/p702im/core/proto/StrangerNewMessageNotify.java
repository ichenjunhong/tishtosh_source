package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.StrangerNewMessageNotify */
public final class StrangerNewMessageNotify extends Message<StrangerNewMessageNotify, Builder> {
    public static final ProtoAdapter<StrangerNewMessageNotify> ADAPTER = new ProtoAdapter_StrangerNewMessageNotify();
    private static final long serialVersionUID = 0;
    public final MessageBody message;

    /* renamed from: com.bytedance.im.core.proto.StrangerNewMessageNotify$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<StrangerNewMessageNotify, Builder> {
        public MessageBody message;

        public final StrangerNewMessageNotify build() {
            return new StrangerNewMessageNotify(this.message, super.buildUnknownFields());
        }

        public final Builder message(MessageBody messageBody) {
            this.message = messageBody;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.StrangerNewMessageNotify$ProtoAdapter_StrangerNewMessageNotify */
    static final class ProtoAdapter_StrangerNewMessageNotify extends ProtoAdapter<StrangerNewMessageNotify> {
        public ProtoAdapter_StrangerNewMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, StrangerNewMessageNotify.class);
        }

        public final int encodedSize(StrangerNewMessageNotify strangerNewMessageNotify) {
            return MessageBody.ADAPTER.encodedSizeWithTag(2, strangerNewMessageNotify.message) + strangerNewMessageNotify.unknownFields().size();
        }

        public final StrangerNewMessageNotify redact(StrangerNewMessageNotify strangerNewMessageNotify) {
            Builder newBuilder = strangerNewMessageNotify.newBuilder();
            if (newBuilder.message != null) {
                newBuilder.message = (MessageBody) MessageBody.ADAPTER.redact(newBuilder.message);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final StrangerNewMessageNotify decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.message((MessageBody) MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StrangerNewMessageNotify strangerNewMessageNotify) throws IOException {
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, strangerNewMessageNotify.message);
            protoWriter.writeBytes(strangerNewMessageNotify.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.message = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        StringBuilder replace = sb.replace(0, 2, "StrangerNewMessageNotify{");
        replace.append('}');
        return replace.toString();
    }

    public StrangerNewMessageNotify(MessageBody messageBody) {
        this(messageBody, ByteString.EMPTY);
    }

    public StrangerNewMessageNotify(MessageBody messageBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = messageBody;
    }
}
