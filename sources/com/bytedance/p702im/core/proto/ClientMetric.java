package com.bytedance.p702im.core.proto;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ClientMetric */
public final class ClientMetric extends Message<ClientMetric, Builder> {
    public static final ProtoAdapter<ClientMetric> ADAPTER = new ProtoAdapter_ClientMetric();
    public static final ClientMetricType DEFAULT_METRIC_TYPE = ClientMetricType.COUNTER;
    public static final Long DEFAULT_V = Long.valueOf(0);
    private static final long serialVersionUID = 0;

    /* renamed from: k */
    public final String f30843k;
    public final ClientMetricType metric_type;
    public final Map<String, String> tags;

    /* renamed from: v */
    public final Long f30844v;

    /* renamed from: com.bytedance.im.core.proto.ClientMetric$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ClientMetric, Builder> {

        /* renamed from: k */
        public String f30845k;
        public ClientMetricType metric_type;
        public Map<String, String> tags = Internal.newMutableMap();

        /* renamed from: v */
        public Long f30846v;

        public final ClientMetric build() {
            ClientMetric clientMetric = new ClientMetric(this.metric_type, this.f30845k, this.f30846v, this.tags, super.buildUnknownFields());
            return clientMetric;
        }

        /* renamed from: k */
        public final Builder mo21156k(String str) {
            this.f30845k = str;
            return this;
        }

        public final Builder metric_type(ClientMetricType clientMetricType) {
            this.metric_type = clientMetricType;
            return this;
        }

        /* renamed from: v */
        public final Builder mo21159v(Long l) {
            this.f30846v = l;
            return this;
        }

        public final Builder tags(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.tags = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ClientMetric$ProtoAdapter_ClientMetric */
    static final class ProtoAdapter_ClientMetric extends ProtoAdapter<ClientMetric> {
        private final ProtoAdapter<Map<String, String>> tags;

        public ProtoAdapter_ClientMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientMetric.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.tags = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ClientMetric redact(ClientMetric clientMetric) {
            Builder newBuilder = clientMetric.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ClientMetric clientMetric) {
            return ClientMetricType.ADAPTER.encodedSizeWithTag(1, clientMetric.metric_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, clientMetric.f30843k) + ProtoAdapter.INT64.encodedSizeWithTag(3, clientMetric.f30844v) + this.tags.encodedSizeWithTag(4, clientMetric.tags) + clientMetric.unknownFields().size();
        }

        public final ClientMetric decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.metric_type((ClientMetricType) ClientMetricType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            builder.mo21156k((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.mo21159v((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.tags.putAll((Map) this.tags.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ClientMetric clientMetric) throws IOException {
            ClientMetricType.ADAPTER.encodeWithTag(protoWriter, 1, clientMetric.metric_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, clientMetric.f30843k);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clientMetric.f30844v);
            this.tags.encodeWithTag(protoWriter, 4, clientMetric.tags);
            protoWriter.writeBytes(clientMetric.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.metric_type = this.metric_type;
        builder.f30845k = this.f30843k;
        builder.f30846v = this.f30844v;
        builder.tags = Internal.copyOf(C42311c.f106869m, this.tags);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.metric_type != null) {
            sb.append(", metric_type=");
            sb.append(this.metric_type);
        }
        if (this.f30843k != null) {
            sb.append(", k=");
            sb.append(this.f30843k);
        }
        if (this.f30844v != null) {
            sb.append(", v=");
            sb.append(this.f30844v);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "ClientMetric{");
        replace.append('}');
        return replace.toString();
    }

    public ClientMetric(ClientMetricType clientMetricType, String str, Long l, Map<String, String> map) {
        this(clientMetricType, str, l, map, ByteString.EMPTY);
    }

    public ClientMetric(ClientMetricType clientMetricType, String str, Long l, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.metric_type = clientMetricType;
        this.f30843k = str;
        this.f30844v = l;
        this.tags = Internal.immutableCopyOf(C42311c.f106869m, map);
    }
}
