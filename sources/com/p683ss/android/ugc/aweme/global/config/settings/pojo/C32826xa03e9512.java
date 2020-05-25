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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel */
public final class C32826xa03e9512 extends Message<C32826xa03e9512, Builder> {
    public static final DefaultValueProtoAdapter<C32826xa03e9512> ADAPTER = new C32827x89d8df3a();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 49270024)
    public final Boolean enable_upload_rerank_result;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 267416772)
    public final Boolean enabled;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32826xa03e9512, Builder> {
        public Boolean enable_upload_rerank_result;
        public Boolean enabled;

        public final C32826xa03e9512 build() {
            return new C32826xa03e9512(this.enabled, this.enable_upload_rerank_result, super.buildUnknownFields());
        }

        public final Builder enable_upload_rerank_result(Boolean bool) {
            this.enable_upload_rerank_result = bool;
            return this;
        }

        public final Builder enabled(Boolean bool) {
            this.enabled = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel$ProtoAdapter_com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel */
    static final class C32827x89d8df3a extends DefaultValueProtoAdapter<C32826xa03e9512> {
        public final C32826xa03e9512 redact(C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) {
            return com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel;
        }

        public C32827x89d8df3a() {
            super(FieldEncoding.LENGTH_DELIMITED, C32826xa03e9512.class);
        }

        public final C32826xa03e9512 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32826xa03e9512) null);
        }

        public final int encodedSize(C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(267416772, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled) + ProtoAdapter.BOOL.encodedSizeWithTag(49270024, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enable_upload_rerank_result) + com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 267416772, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 49270024, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enable_upload_rerank_result);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields());
        }

        public final C32826xa03e9512 decode(ProtoReader protoReader, C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) throws IOException {
            Builder builder;
            C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 = (C32826xa03e9512) C10617a.m21405a().mo18840a(C32826xa03e9512.class, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel);
            if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 != null) {
                builder = com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 49270024) {
                    builder.enable_upload_rerank_result((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 267416772) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final Boolean getEnableUploadRerankResult() throws C10174a {
        if (this.enable_upload_rerank_result != null) {
            return this.enable_upload_rerank_result;
        }
        throw new C10174a();
    }

    public final Boolean getEnabled() throws C10174a {
        if (this.enabled != null) {
            return this.enabled;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.enable_upload_rerank_result = this.enable_upload_rerank_result;
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
        if (this.enabled != null) {
            i = this.enabled.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.enable_upload_rerank_result != null) {
            i3 = this.enable_upload_rerank_result.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        if (this.enable_upload_rerank_result != null) {
            sb.append(", enable_upload_rerank_result=");
            sb.append(this.enable_upload_rerank_result);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32826xa03e9512)) {
            return false;
        }
        C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel = (C32826xa03e9512) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields()) || !Internal.equals(this.enabled, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled) || !Internal.equals(this.enable_upload_rerank_result, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enable_upload_rerank_result)) {
            return false;
        }
        return true;
    }

    public C32826xa03e9512(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public C32826xa03e9512(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
        this.enable_upload_rerank_result = bool2;
    }
}
