package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf */
public final class FeAnchorAdConf extends Message<FeAnchorAdConf, Builder> {
    public static final DefaultValueProtoAdapter<FeAnchorAdConf> ADAPTER = new ProtoAdapter_FeAnchorAdConf();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String ad_tcm_schema;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String ad_video_authorization;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FeAnchorAdConf, Builder> {
        public String ad_tcm_schema;
        public String ad_video_authorization;

        public final FeAnchorAdConf build() {
            return new FeAnchorAdConf(this.ad_tcm_schema, this.ad_video_authorization, super.buildUnknownFields());
        }

        public final Builder ad_tcm_schema(String str) {
            this.ad_tcm_schema = str;
            return this;
        }

        public final Builder ad_video_authorization(String str) {
            this.ad_video_authorization = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf$ProtoAdapter_FeAnchorAdConf */
    static final class ProtoAdapter_FeAnchorAdConf extends DefaultValueProtoAdapter<FeAnchorAdConf> {
        public final FeAnchorAdConf redact(FeAnchorAdConf feAnchorAdConf) {
            return feAnchorAdConf;
        }

        public ProtoAdapter_FeAnchorAdConf() {
            super(FieldEncoding.LENGTH_DELIMITED, FeAnchorAdConf.class);
        }

        public final FeAnchorAdConf decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FeAnchorAdConf) null);
        }

        public final int encodedSize(FeAnchorAdConf feAnchorAdConf) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, feAnchorAdConf.ad_tcm_schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, feAnchorAdConf.ad_video_authorization) + feAnchorAdConf.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FeAnchorAdConf feAnchorAdConf) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feAnchorAdConf.ad_tcm_schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feAnchorAdConf.ad_video_authorization);
            protoWriter.writeBytes(feAnchorAdConf.unknownFields());
        }

        public final FeAnchorAdConf decode(ProtoReader protoReader, FeAnchorAdConf feAnchorAdConf) throws IOException {
            Builder builder;
            FeAnchorAdConf feAnchorAdConf2 = (FeAnchorAdConf) C10617a.m21405a().mo18840a(FeAnchorAdConf.class, feAnchorAdConf);
            if (feAnchorAdConf2 != null) {
                builder = feAnchorAdConf2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ad_tcm_schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_video_authorization((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (feAnchorAdConf2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getAdTcmSchema() throws C10174a {
        if (this.ad_tcm_schema != null) {
            return this.ad_tcm_schema;
        }
        throw new C10174a();
    }

    public final String getAdVideoAuthorization() throws C10174a {
        if (this.ad_video_authorization != null) {
            return this.ad_video_authorization;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_tcm_schema = this.ad_tcm_schema;
        builder.ad_video_authorization = this.ad_video_authorization;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.ad_tcm_schema != null) {
            i = this.ad_tcm_schema.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.ad_video_authorization != null) {
            i3 = this.ad_video_authorization.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_tcm_schema != null) {
            sb.append(", ad_tcm_schema=");
            sb.append(this.ad_tcm_schema);
        }
        if (this.ad_video_authorization != null) {
            sb.append(", ad_video_authorization=");
            sb.append(this.ad_video_authorization);
        }
        StringBuilder replace = sb.replace(0, 2, "FeAnchorAdConf{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeAnchorAdConf)) {
            return false;
        }
        FeAnchorAdConf feAnchorAdConf = (FeAnchorAdConf) obj;
        if (!unknownFields().equals(feAnchorAdConf.unknownFields()) || !Internal.equals(this.ad_tcm_schema, feAnchorAdConf.ad_tcm_schema) || !Internal.equals(this.ad_video_authorization, feAnchorAdConf.ad_video_authorization)) {
            return false;
        }
        return true;
    }

    public FeAnchorAdConf(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public FeAnchorAdConf(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_tcm_schema = str;
        this.ad_video_authorization = str2;
    }
}
