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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_LikoAnalysisConfig */
public final class com_ss_android_ugc_aweme_settings_LikoAnalysisConfig extends Message<com_ss_android_ugc_aweme_settings_LikoAnalysisConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_LikoAnalysisConfig> ADAPTER = new C32854x9d57d73c();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 52446779)
    public final Boolean bigObjectFilterSystem;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 235631127)
    public final Integer bigObjectLatitude;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 139354815)
    public final Integer bitmapLatitude;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 135471836)
    public final Boolean objectInstanceFilterSystem;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 133576323)
    public final Integer objectInstanceLatitude;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 124685394)
    public final Boolean supportBigObjectAnalysis;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 110305577)
    public final Boolean supportBitmapAnalysis;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 114612581)
    public final Boolean supportObjectInstanceAnalysis;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_LikoAnalysisConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_settings_LikoAnalysisConfig, Builder> {
        public Boolean bigObjectFilterSystem;
        public Integer bigObjectLatitude;
        public Integer bitmapLatitude;
        public Boolean objectInstanceFilterSystem;
        public Integer objectInstanceLatitude;
        public Boolean supportBigObjectAnalysis;
        public Boolean supportBitmapAnalysis;
        public Boolean supportObjectInstanceAnalysis;

        public final com_ss_android_ugc_aweme_settings_LikoAnalysisConfig build() {
            com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig = new com_ss_android_ugc_aweme_settings_LikoAnalysisConfig(this.supportBigObjectAnalysis, this.objectInstanceFilterSystem, this.bigObjectFilterSystem, this.supportObjectInstanceAnalysis, this.bitmapLatitude, this.objectInstanceLatitude, this.supportBitmapAnalysis, this.bigObjectLatitude, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_settings_likoanalysisconfig;
        }

        public final Builder bigObjectFilterSystem(Boolean bool) {
            this.bigObjectFilterSystem = bool;
            return this;
        }

        public final Builder bigObjectLatitude(Integer num) {
            this.bigObjectLatitude = num;
            return this;
        }

        public final Builder bitmapLatitude(Integer num) {
            this.bitmapLatitude = num;
            return this;
        }

        public final Builder objectInstanceFilterSystem(Boolean bool) {
            this.objectInstanceFilterSystem = bool;
            return this;
        }

        public final Builder objectInstanceLatitude(Integer num) {
            this.objectInstanceLatitude = num;
            return this;
        }

        public final Builder supportBigObjectAnalysis(Boolean bool) {
            this.supportBigObjectAnalysis = bool;
            return this;
        }

        public final Builder supportBitmapAnalysis(Boolean bool) {
            this.supportBitmapAnalysis = bool;
            return this;
        }

        public final Builder supportObjectInstanceAnalysis(Boolean bool) {
            this.supportObjectInstanceAnalysis = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_LikoAnalysisConfig$ProtoAdapter_com_ss_android_ugc_aweme_settings_LikoAnalysisConfig */
    static final class C32854x9d57d73c extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_LikoAnalysisConfig> {
        public final com_ss_android_ugc_aweme_settings_LikoAnalysisConfig redact(com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig) {
            return com_ss_android_ugc_aweme_settings_likoanalysisconfig;
        }

        public C32854x9d57d73c() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_settings_LikoAnalysisConfig.class);
        }

        public final com_ss_android_ugc_aweme_settings_LikoAnalysisConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_settings_LikoAnalysisConfig) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(124685394, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBigObjectAnalysis) + ProtoAdapter.BOOL.encodedSizeWithTag(135471836, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceFilterSystem) + ProtoAdapter.BOOL.encodedSizeWithTag(52446779, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectFilterSystem) + ProtoAdapter.BOOL.encodedSizeWithTag(114612581, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportObjectInstanceAnalysis) + ProtoAdapter.INT32.encodedSizeWithTag(139354815, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bitmapLatitude) + ProtoAdapter.INT32.encodedSizeWithTag(133576323, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceLatitude) + ProtoAdapter.BOOL.encodedSizeWithTag(110305577, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBitmapAnalysis) + ProtoAdapter.INT32.encodedSizeWithTag(235631127, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectLatitude) + com_ss_android_ugc_aweme_settings_likoanalysisconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 124685394, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBigObjectAnalysis);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 135471836, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceFilterSystem);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 52446779, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectFilterSystem);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 114612581, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportObjectInstanceAnalysis);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 139354815, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bitmapLatitude);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 133576323, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceLatitude);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 110305577, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBitmapAnalysis);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 235631127, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectLatitude);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_settings_likoanalysisconfig.unknownFields());
        }

        public final com_ss_android_ugc_aweme_settings_LikoAnalysisConfig decode(ProtoReader protoReader, com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig2 = (com_ss_android_ugc_aweme_settings_LikoAnalysisConfig) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_settings_LikoAnalysisConfig.class, com_ss_android_ugc_aweme_settings_likoanalysisconfig);
            if (com_ss_android_ugc_aweme_settings_likoanalysisconfig2 != null) {
                builder = com_ss_android_ugc_aweme_settings_likoanalysisconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 52446779:
                            builder.bigObjectFilterSystem((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 110305577:
                            builder.supportBitmapAnalysis((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 114612581:
                            builder.supportObjectInstanceAnalysis((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 124685394:
                            builder.supportBigObjectAnalysis((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 133576323:
                            builder.objectInstanceLatitude((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 135471836:
                            builder.objectInstanceFilterSystem((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 139354815:
                            builder.bitmapLatitude((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 235631127:
                            builder.bigObjectLatitude((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_settings_likoanalysisconfig2 != null) {
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

    public final Boolean getBigObjectFilterSystem() throws C10174a {
        if (this.bigObjectFilterSystem != null) {
            return this.bigObjectFilterSystem;
        }
        throw new C10174a();
    }

    public final Integer getBigObjectLatitude() throws C10174a {
        if (this.bigObjectLatitude != null) {
            return this.bigObjectLatitude;
        }
        throw new C10174a();
    }

    public final Integer getBitmapLatitude() throws C10174a {
        if (this.bitmapLatitude != null) {
            return this.bitmapLatitude;
        }
        throw new C10174a();
    }

    public final Boolean getObjectInstanceFilterSystem() throws C10174a {
        if (this.objectInstanceFilterSystem != null) {
            return this.objectInstanceFilterSystem;
        }
        throw new C10174a();
    }

    public final Integer getObjectInstanceLatitude() throws C10174a {
        if (this.objectInstanceLatitude != null) {
            return this.objectInstanceLatitude;
        }
        throw new C10174a();
    }

    public final Boolean getSupportBigObjectAnalysis() throws C10174a {
        if (this.supportBigObjectAnalysis != null) {
            return this.supportBigObjectAnalysis;
        }
        throw new C10174a();
    }

    public final Boolean getSupportBitmapAnalysis() throws C10174a {
        if (this.supportBitmapAnalysis != null) {
            return this.supportBitmapAnalysis;
        }
        throw new C10174a();
    }

    public final Boolean getSupportObjectInstanceAnalysis() throws C10174a {
        if (this.supportObjectInstanceAnalysis != null) {
            return this.supportObjectInstanceAnalysis;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.supportBigObjectAnalysis = this.supportBigObjectAnalysis;
        builder.objectInstanceFilterSystem = this.objectInstanceFilterSystem;
        builder.bigObjectFilterSystem = this.bigObjectFilterSystem;
        builder.supportObjectInstanceAnalysis = this.supportObjectInstanceAnalysis;
        builder.bitmapLatitude = this.bitmapLatitude;
        builder.objectInstanceLatitude = this.objectInstanceLatitude;
        builder.supportBitmapAnalysis = this.supportBitmapAnalysis;
        builder.bigObjectLatitude = this.bigObjectLatitude;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.supportBigObjectAnalysis != null) {
            i = this.supportBigObjectAnalysis.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.objectInstanceFilterSystem != null) {
            i2 = this.objectInstanceFilterSystem.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.bigObjectFilterSystem != null) {
            i3 = this.bigObjectFilterSystem.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.supportObjectInstanceAnalysis != null) {
            i4 = this.supportObjectInstanceAnalysis.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.bitmapLatitude != null) {
            i5 = this.bitmapLatitude.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.objectInstanceLatitude != null) {
            i6 = this.objectInstanceLatitude.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.supportBitmapAnalysis != null) {
            i7 = this.supportBitmapAnalysis.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.bigObjectLatitude != null) {
            i9 = this.bigObjectLatitude.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.supportBigObjectAnalysis != null) {
            sb.append(", supportBigObjectAnalysis=");
            sb.append(this.supportBigObjectAnalysis);
        }
        if (this.objectInstanceFilterSystem != null) {
            sb.append(", objectInstanceFilterSystem=");
            sb.append(this.objectInstanceFilterSystem);
        }
        if (this.bigObjectFilterSystem != null) {
            sb.append(", bigObjectFilterSystem=");
            sb.append(this.bigObjectFilterSystem);
        }
        if (this.supportObjectInstanceAnalysis != null) {
            sb.append(", supportObjectInstanceAnalysis=");
            sb.append(this.supportObjectInstanceAnalysis);
        }
        if (this.bitmapLatitude != null) {
            sb.append(", bitmapLatitude=");
            sb.append(this.bitmapLatitude);
        }
        if (this.objectInstanceLatitude != null) {
            sb.append(", objectInstanceLatitude=");
            sb.append(this.objectInstanceLatitude);
        }
        if (this.supportBitmapAnalysis != null) {
            sb.append(", supportBitmapAnalysis=");
            sb.append(this.supportBitmapAnalysis);
        }
        if (this.bigObjectLatitude != null) {
            sb.append(", bigObjectLatitude=");
            sb.append(this.bigObjectLatitude);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_settings_LikoAnalysisConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_settings_LikoAnalysisConfig)) {
            return false;
        }
        com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig = (com_ss_android_ugc_aweme_settings_LikoAnalysisConfig) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_settings_likoanalysisconfig.unknownFields()) || !Internal.equals(this.supportBigObjectAnalysis, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBigObjectAnalysis) || !Internal.equals(this.objectInstanceFilterSystem, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceFilterSystem) || !Internal.equals(this.bigObjectFilterSystem, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectFilterSystem) || !Internal.equals(this.supportObjectInstanceAnalysis, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportObjectInstanceAnalysis) || !Internal.equals(this.bitmapLatitude, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bitmapLatitude) || !Internal.equals(this.objectInstanceLatitude, com_ss_android_ugc_aweme_settings_likoanalysisconfig.objectInstanceLatitude) || !Internal.equals(this.supportBitmapAnalysis, com_ss_android_ugc_aweme_settings_likoanalysisconfig.supportBitmapAnalysis) || !Internal.equals(this.bigObjectLatitude, com_ss_android_ugc_aweme_settings_likoanalysisconfig.bigObjectLatitude)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_settings_LikoAnalysisConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Boolean bool5, Integer num3) {
        this(bool, bool2, bool3, bool4, num, num2, bool5, num3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_settings_LikoAnalysisConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Boolean bool5, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.supportBigObjectAnalysis = bool;
        this.objectInstanceFilterSystem = bool2;
        this.bigObjectFilterSystem = bool3;
        this.supportObjectInstanceAnalysis = bool4;
        this.bitmapLatitude = num;
        this.objectInstanceLatitude = num2;
        this.supportBitmapAnalysis = bool5;
        this.bigObjectLatitude = num3;
    }
}
