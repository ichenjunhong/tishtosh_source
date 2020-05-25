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

/* renamed from: com.bytedance.im.core.proto.GetConfigsResponseBody */
public final class GetConfigsResponseBody extends Message<GetConfigsResponseBody, Builder> {
    public static final ProtoAdapter<GetConfigsResponseBody> ADAPTER = new ProtoAdapter_GetConfigsResponseBody();
    public static final Integer DEFAULT_VERSION = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final List<Config> configs;
    public final Integer version;

    /* renamed from: com.bytedance.im.core.proto.GetConfigsResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConfigsResponseBody, Builder> {
        public List<Config> configs = Internal.newMutableList();
        public Integer version;

        public final GetConfigsResponseBody build() {
            return new GetConfigsResponseBody(this.version, this.configs, super.buildUnknownFields());
        }

        public final Builder version(Integer num) {
            this.version = num;
            return this;
        }

        public final Builder configs(List<Config> list) {
            Internal.checkElementsNotNull(list);
            this.configs = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConfigsResponseBody$ProtoAdapter_GetConfigsResponseBody */
    static final class ProtoAdapter_GetConfigsResponseBody extends ProtoAdapter<GetConfigsResponseBody> {
        public ProtoAdapter_GetConfigsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigsResponseBody.class);
        }

        public final GetConfigsResponseBody redact(GetConfigsResponseBody getConfigsResponseBody) {
            Builder newBuilder = getConfigsResponseBody.newBuilder();
            Internal.redactElements(newBuilder.configs, Config.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConfigsResponseBody getConfigsResponseBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getConfigsResponseBody.version) + Config.ADAPTER.asRepeated().encodedSizeWithTag(2, getConfigsResponseBody.configs) + getConfigsResponseBody.unknownFields().size();
        }

        public final GetConfigsResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.version((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.configs.add(Config.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetConfigsResponseBody getConfigsResponseBody) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getConfigsResponseBody.version);
            Config.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getConfigsResponseBody.configs);
            protoWriter.writeBytes(getConfigsResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.configs = Internal.copyOf("configs", this.configs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.configs.isEmpty()) {
            sb.append(", configs=");
            sb.append(this.configs);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConfigsResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConfigsResponseBody(Integer num, List<Config> list) {
        this(num, list, ByteString.EMPTY);
    }

    public GetConfigsResponseBody(Integer num, List<Config> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.configs = Internal.immutableCopyOf("configs", list);
    }
}
