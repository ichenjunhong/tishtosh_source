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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_main_experiment_pneumonia_DynamicTabSettingStruct */
public final class C32846x13043613 extends Message<C32846x13043613, Builder> {
    public static final DefaultValueProtoAdapter<C32846x13043613> ADAPTER = new C32847xa48a04eb();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 81539280)
    public final String virus_map_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 97690965)
    public final Long virus_refresh_interval;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_main_experiment_pneumonia_DynamicTabSettingStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32846x13043613, Builder> {
        public String virus_map_url;
        public Long virus_refresh_interval;

        public final C32846x13043613 build() {
            return new C32846x13043613(this.virus_refresh_interval, this.virus_map_url, super.buildUnknownFields());
        }

        public final Builder virus_map_url(String str) {
            this.virus_map_url = str;
            return this;
        }

        public final Builder virus_refresh_interval(Long l) {
            this.virus_refresh_interval = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_main_experiment_pneumonia_DynamicTabSettingStruct$ProtoAdapter_com_ss_android_ugc_aweme_main_experiment_pneumonia_DynamicTabSettingStruct */
    static final class C32847xa48a04eb extends DefaultValueProtoAdapter<C32846x13043613> {
        public final C32846x13043613 redact(C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct) {
            return com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct;
        }

        public C32847xa48a04eb() {
            super(FieldEncoding.LENGTH_DELIMITED, C32846x13043613.class);
        }

        public final C32846x13043613 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32846x13043613) null);
        }

        public final int encodedSize(C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct) {
            return ProtoAdapter.INT64.encodedSizeWithTag(97690965, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_refresh_interval) + ProtoAdapter.STRING.encodedSizeWithTag(81539280, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_map_url) + com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 97690965, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_refresh_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 81539280, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_map_url);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.unknownFields());
        }

        public final C32846x13043613 decode(ProtoReader protoReader, C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct) throws IOException {
            Builder builder;
            C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct2 = (C32846x13043613) C10617a.m21405a().mo18840a(C32846x13043613.class, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct);
            if (com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct2 != null) {
                builder = com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 81539280) {
                    builder.virus_map_url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 97690965) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.virus_refresh_interval((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }
    }

    public final String getVirusMapUrl() throws C10174a {
        if (this.virus_map_url != null) {
            return this.virus_map_url;
        }
        throw new C10174a();
    }

    public final Long getVirusRefreshInterval() throws C10174a {
        if (this.virus_refresh_interval != null) {
            return this.virus_refresh_interval;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.virus_refresh_interval = this.virus_refresh_interval;
        builder.virus_map_url = this.virus_map_url;
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
        if (this.virus_refresh_interval != null) {
            i = this.virus_refresh_interval.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.virus_map_url != null) {
            i3 = this.virus_map_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.virus_refresh_interval != null) {
            sb.append(", virus_refresh_interval=");
            sb.append(this.virus_refresh_interval);
        }
        if (this.virus_map_url != null) {
            sb.append(", virus_map_url=");
            sb.append(this.virus_map_url);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_main_experiment_pneumonia_DynamicTabSettingStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32846x13043613)) {
            return false;
        }
        C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct = (C32846x13043613) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.unknownFields()) || !Internal.equals(this.virus_refresh_interval, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_refresh_interval) || !Internal.equals(this.virus_map_url, com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct.virus_map_url)) {
            return false;
        }
        return true;
    }

    public C32846x13043613(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C32846x13043613(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.virus_refresh_interval = l;
        this.virus_map_url = str;
    }
}
