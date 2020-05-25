package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ClientACKRequestBody */
public final class ClientACKRequestBody extends Message<ClientACKRequestBody, Builder> {
    public static final ProtoAdapter<ClientACKRequestBody> ADAPTER = new ProtoAdapter_ClientACKRequestBody();
    public static final Long DEFAULT_CLIENT_TIME_STAMP = Long.valueOf(0);
    public static final Integer DEFAULT_CMD = Integer.valueOf(0);
    public static final NetworkType DEFAULT_NETWORK_TYPE = NetworkType.UNKNOWN;
    public static final Long DEFAULT_START_TIME_STAMP = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long client_time_stamp;
    public final Integer cmd;
    public final String logid;
    public final NetworkType network_type;
    public final Long start_time_stamp;

    /* renamed from: com.bytedance.im.core.proto.ClientACKRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ClientACKRequestBody, Builder> {
        public Long client_time_stamp;
        public Integer cmd;
        public String logid;
        public NetworkType network_type;
        public Long start_time_stamp;

        public final ClientACKRequestBody build() {
            if (this.start_time_stamp == null || this.cmd == null) {
                throw Internal.missingRequiredFields(this.start_time_stamp, "start_time_stamp", this.cmd, "cmd");
            }
            ClientACKRequestBody clientACKRequestBody = new ClientACKRequestBody(this.start_time_stamp, this.cmd, this.network_type, this.logid, this.client_time_stamp, super.buildUnknownFields());
            return clientACKRequestBody;
        }

        public final Builder client_time_stamp(Long l) {
            this.client_time_stamp = l;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder logid(String str) {
            this.logid = str;
            return this;
        }

        public final Builder network_type(NetworkType networkType) {
            this.network_type = networkType;
            return this;
        }

        public final Builder start_time_stamp(Long l) {
            this.start_time_stamp = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ClientACKRequestBody$ProtoAdapter_ClientACKRequestBody */
    static final class ProtoAdapter_ClientACKRequestBody extends ProtoAdapter<ClientACKRequestBody> {
        public ProtoAdapter_ClientACKRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientACKRequestBody.class);
        }

        public final ClientACKRequestBody redact(ClientACKRequestBody clientACKRequestBody) {
            Builder newBuilder = clientACKRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ClientACKRequestBody clientACKRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, clientACKRequestBody.start_time_stamp) + ProtoAdapter.INT32.encodedSizeWithTag(2, clientACKRequestBody.cmd) + NetworkType.ADAPTER.encodedSizeWithTag(3, clientACKRequestBody.network_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, clientACKRequestBody.logid) + ProtoAdapter.INT64.encodedSizeWithTag(5, clientACKRequestBody.client_time_stamp) + clientACKRequestBody.unknownFields().size();
        }

        public final ClientACKRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start_time_stamp((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.cmd((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.network_type((NetworkType) NetworkType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            builder.logid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.client_time_stamp((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ClientACKRequestBody clientACKRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, clientACKRequestBody.start_time_stamp);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, clientACKRequestBody.cmd);
            NetworkType.ADAPTER.encodeWithTag(protoWriter, 3, clientACKRequestBody.network_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, clientACKRequestBody.logid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, clientACKRequestBody.client_time_stamp);
            protoWriter.writeBytes(clientACKRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_time_stamp = this.start_time_stamp;
        builder.cmd = this.cmd;
        builder.network_type = this.network_type;
        builder.logid = this.logid;
        builder.client_time_stamp = this.client_time_stamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time_stamp=");
        sb.append(this.start_time_stamp);
        sb.append(", cmd=");
        sb.append(this.cmd);
        if (this.network_type != null) {
            sb.append(", network_type=");
            sb.append(this.network_type);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.client_time_stamp != null) {
            sb.append(", client_time_stamp=");
            sb.append(this.client_time_stamp);
        }
        StringBuilder replace = sb.replace(0, 2, "ClientACKRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ClientACKRequestBody(Long l, Integer num, NetworkType networkType, String str, Long l2) {
        this(l, num, networkType, str, l2, ByteString.EMPTY);
    }

    public ClientACKRequestBody(Long l, Integer num, NetworkType networkType, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time_stamp = l;
        this.cmd = num;
        this.network_type = networkType;
        this.logid = str;
        this.client_time_stamp = l2;
    }
}
