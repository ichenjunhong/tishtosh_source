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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig */
public final class com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig extends Message<com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig> ADAPTER = new C32838x803f1bf7();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 170490227)
    public final Integer enable_pre_load_friend_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 96925882)
    public final Boolean enable_preload;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig, Builder> {
        public Integer enable_pre_load_friend_count;
        public Boolean enable_preload;

        public final com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig build() {
            return new com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig(this.enable_pre_load_friend_count, this.enable_preload, super.buildUnknownFields());
        }

        public final Builder enable_pre_load_friend_count(Integer num) {
            this.enable_pre_load_friend_count = num;
            return this;
        }

        public final Builder enable_preload(Boolean bool) {
            this.enable_preload = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig$ProtoAdapter_com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig */
    static final class C32838x803f1bf7 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig> {
        public final com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig redact(com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig;
        }

        public C32838x803f1bf7() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig.class);
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(170490227, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_pre_load_friend_count) + ProtoAdapter.BOOL.encodedSizeWithTag(96925882, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_preload) + com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 170490227, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_pre_load_friend_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 96925882, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_preload);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.unknownFields());
        }

        public final com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig decode(ProtoReader protoReader, com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig2 = (com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig.class, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig);
            if (com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig2 != null) {
                builder = com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 96925882) {
                    builder.enable_preload((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 170490227) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.enable_pre_load_friend_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getEnablePreLoadFriendCount() throws C10174a {
        if (this.enable_pre_load_friend_count != null) {
            return this.enable_pre_load_friend_count;
        }
        throw new C10174a();
    }

    public final Boolean getEnablePreload() throws C10174a {
        if (this.enable_preload != null) {
            return this.enable_preload;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable_pre_load_friend_count = this.enable_pre_load_friend_count;
        builder.enable_preload = this.enable_preload;
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
        if (this.enable_pre_load_friend_count != null) {
            i = this.enable_pre_load_friend_count.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.enable_preload != null) {
            i3 = this.enable_preload.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_pre_load_friend_count != null) {
            sb.append(", enable_pre_load_friend_count=");
            sb.append(this.enable_pre_load_friend_count);
        }
        if (this.enable_preload != null) {
            sb.append(", enable_preload=");
            sb.append(this.enable_preload);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig)) {
            return false;
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.unknownFields()) || !Internal.equals(this.enable_pre_load_friend_count, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_pre_load_friend_count) || !Internal.equals(this.enable_preload, com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig.enable_preload)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_pre_load_friend_count = num;
        this.enable_preload = bool;
    }
}
