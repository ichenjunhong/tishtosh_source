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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config */
public final class com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config extends Message<com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config> ADAPTER = new C32834x73c90561();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13971774)
    public final String cn_tip;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 225148927)
    public final String en_tip;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 184758960)
    public final Integer freq_day;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 184748742)
    public final Integer freq_num;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 24693913)
    public final Integer show_flag;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 83172569)
    public final Integer version;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config, Builder> {
        public String cn_tip;
        public String en_tip;
        public Integer freq_day;
        public Integer freq_num;
        public Integer show_flag;
        public Integer version;

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config build() {
            com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config = new com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config(this.version, this.freq_day, this.freq_num, this.show_flag, this.cn_tip, this.en_tip, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config;
        }

        public final Builder cn_tip(String str) {
            this.cn_tip = str;
            return this;
        }

        public final Builder en_tip(String str) {
            this.en_tip = str;
            return this;
        }

        public final Builder freq_day(Integer num) {
            this.freq_day = num;
            return this;
        }

        public final Builder freq_num(Integer num) {
            this.freq_num = num;
            return this;
        }

        public final Builder show_flag(Integer num) {
            this.show_flag = num;
            return this;
        }

        public final Builder version(Integer num) {
            this.version = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config */
    static final class C32834x73c90561 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config> {
        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config redact(com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config;
        }

        public C32834x73c90561() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config.class);
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config) {
            return ProtoAdapter.INT32.encodedSizeWithTag(83172569, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.version) + ProtoAdapter.INT32.encodedSizeWithTag(184758960, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_day) + ProtoAdapter.INT32.encodedSizeWithTag(184748742, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_num) + ProtoAdapter.INT32.encodedSizeWithTag(24693913, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.show_flag) + ProtoAdapter.STRING.encodedSizeWithTag(13971774, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.cn_tip) + ProtoAdapter.STRING.encodedSizeWithTag(225148927, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.en_tip) + com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 83172569, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 184758960, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_day);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 184748742, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 24693913, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.show_flag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13971774, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.cn_tip);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 225148927, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.en_tip);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.unknownFields());
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config decode(ProtoReader protoReader, com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config2 = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config.class, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 13971774:
                            builder.cn_tip((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24693913:
                            builder.show_flag((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 83172569:
                            builder.version((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 184748742:
                            builder.freq_num((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 184758960:
                            builder.freq_day((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 225148927:
                            builder.en_tip((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config2 != null) {
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

    public final String getCnTip() throws C10174a {
        if (this.cn_tip != null) {
            return this.cn_tip;
        }
        throw new C10174a();
    }

    public final String getEnTip() throws C10174a {
        if (this.en_tip != null) {
            return this.en_tip;
        }
        throw new C10174a();
    }

    public final Integer getFreqDay() throws C10174a {
        if (this.freq_day != null) {
            return this.freq_day;
        }
        throw new C10174a();
    }

    public final Integer getFreqNum() throws C10174a {
        if (this.freq_num != null) {
            return this.freq_num;
        }
        throw new C10174a();
    }

    public final Integer getShowFlag() throws C10174a {
        if (this.show_flag != null) {
            return this.show_flag;
        }
        throw new C10174a();
    }

    public final Integer getVersion() throws C10174a {
        if (this.version != null) {
            return this.version;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.freq_day = this.freq_day;
        builder.freq_num = this.freq_num;
        builder.show_flag = this.show_flag;
        builder.cn_tip = this.cn_tip;
        builder.en_tip = this.en_tip;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.version != null) {
            i = this.version.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.freq_day != null) {
            i2 = this.freq_day.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.freq_num != null) {
            i3 = this.freq_num.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.show_flag != null) {
            i4 = this.show_flag.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.cn_tip != null) {
            i5 = this.cn_tip.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.en_tip != null) {
            i7 = this.en_tip.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.freq_day != null) {
            sb.append(", freq_day=");
            sb.append(this.freq_day);
        }
        if (this.freq_num != null) {
            sb.append(", freq_num=");
            sb.append(this.freq_num);
        }
        if (this.show_flag != null) {
            sb.append(", show_flag=");
            sb.append(this.show_flag);
        }
        if (this.cn_tip != null) {
            sb.append(", cn_tip=");
            sb.append(this.cn_tip);
        }
        if (this.en_tip != null) {
            sb.append(", en_tip=");
            sb.append(this.en_tip);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config)) {
            return false;
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.unknownFields()) || !Internal.equals(this.version, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.version) || !Internal.equals(this.freq_day, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_day) || !Internal.equals(this.freq_num, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.freq_num) || !Internal.equals(this.show_flag, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.show_flag) || !Internal.equals(this.cn_tip, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.cn_tip) || !Internal.equals(this.en_tip, com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config.en_tip)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        this(num, num2, num3, num4, str, str2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.freq_day = num2;
        this.freq_num = num3;
        this.show_flag = num4;
        this.cn_tip = str;
        this.en_tip = str2;
    }
}
