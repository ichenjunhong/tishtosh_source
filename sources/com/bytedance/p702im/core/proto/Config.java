package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.Config */
public final class Config extends Message<Config, Builder> {
    public static final ProtoAdapter<Config> ADAPTER = new ProtoAdapter_Config();
    private static final long serialVersionUID = 0;
    public final String conf_name;
    public final String conf_value;

    /* renamed from: com.bytedance.im.core.proto.Config$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Config, Builder> {
        public String conf_name;
        public String conf_value;

        public final Config build() {
            return new Config(this.conf_name, this.conf_value, super.buildUnknownFields());
        }

        public final Builder conf_name(String str) {
            this.conf_name = str;
            return this;
        }

        public final Builder conf_value(String str) {
            this.conf_value = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Config$ProtoAdapter_Config */
    static final class ProtoAdapter_Config extends ProtoAdapter<Config> {
        public ProtoAdapter_Config() {
            super(FieldEncoding.LENGTH_DELIMITED, Config.class);
        }

        public final Config redact(Config config) {
            Builder newBuilder = config.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Config config) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, config.conf_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, config.conf_value) + config.unknownFields().size();
        }

        public final Config decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conf_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conf_value((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, Config config) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, config.conf_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, config.conf_value);
            protoWriter.writeBytes(config.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conf_name = this.conf_name;
        builder.conf_value = this.conf_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conf_name != null) {
            sb.append(", conf_name=");
            sb.append(this.conf_name);
        }
        if (this.conf_value != null) {
            sb.append(", conf_value=");
            sb.append(this.conf_value);
        }
        StringBuilder replace = sb.replace(0, 2, "Config{");
        replace.append('}');
        return replace.toString();
    }

    public Config(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Config(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conf_name = str;
        this.conf_value = str2;
    }
}
