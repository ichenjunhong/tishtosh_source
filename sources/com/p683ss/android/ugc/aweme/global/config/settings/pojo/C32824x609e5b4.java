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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_bullet_ab_CommerceAdLandpageBulletConfig */
public final class C32824x609e5b4 extends Message<C32824x609e5b4, Builder> {
    public static final DefaultValueProtoAdapter<C32824x609e5b4> ADAPTER = new C32825x756f83dc();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 130947485)
    public final Boolean ad_landpage_card_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 156559953)
    public final Boolean ad_landpage_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 253615488)
    public final Boolean ad_landpage_fake_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 140093015)
    public final Boolean ad_landpage_non_fullscreen_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 113497068)
    public final Boolean ad_landpage_real_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 236985407)
    public final Boolean douplus_enable;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_bullet_ab_CommerceAdLandpageBulletConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32824x609e5b4, Builder> {
        public Boolean ad_landpage_card_enable;
        public Boolean ad_landpage_enable;
        public Boolean ad_landpage_fake_enable;
        public Boolean ad_landpage_non_fullscreen_enable;
        public Boolean ad_landpage_real_enable;
        public Boolean douplus_enable;

        public final C32824x609e5b4 build() {
            C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig = new C32824x609e5b4(this.ad_landpage_enable, this.ad_landpage_fake_enable, this.ad_landpage_real_enable, this.ad_landpage_card_enable, this.ad_landpage_non_fullscreen_enable, this.douplus_enable, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig;
        }

        public final Builder ad_landpage_card_enable(Boolean bool) {
            this.ad_landpage_card_enable = bool;
            return this;
        }

        public final Builder ad_landpage_enable(Boolean bool) {
            this.ad_landpage_enable = bool;
            return this;
        }

        public final Builder ad_landpage_fake_enable(Boolean bool) {
            this.ad_landpage_fake_enable = bool;
            return this;
        }

        public final Builder ad_landpage_non_fullscreen_enable(Boolean bool) {
            this.ad_landpage_non_fullscreen_enable = bool;
            return this;
        }

        public final Builder ad_landpage_real_enable(Boolean bool) {
            this.ad_landpage_real_enable = bool;
            return this;
        }

        public final Builder douplus_enable(Boolean bool) {
            this.douplus_enable = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_bullet_ab_CommerceAdLandpageBulletConfig$ProtoAdapter_com_ss_android_ugc_aweme_bullet_ab_CommerceAdLandpageBulletConfig */
    static final class C32825x756f83dc extends DefaultValueProtoAdapter<C32824x609e5b4> {
        public final C32824x609e5b4 redact(C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig) {
            return com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig;
        }

        public C32825x756f83dc() {
            super(FieldEncoding.LENGTH_DELIMITED, C32824x609e5b4.class);
        }

        public final C32824x609e5b4 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32824x609e5b4) null);
        }

        public final int encodedSize(C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(156559953, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(253615488, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_fake_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(113497068, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_real_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(130947485, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_card_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(140093015, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_non_fullscreen_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(236985407, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.douplus_enable) + com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 156559953, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 253615488, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_fake_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 113497068, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_real_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 130947485, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_card_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 140093015, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_non_fullscreen_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 236985407, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.douplus_enable);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.unknownFields());
        }

        public final C32824x609e5b4 decode(ProtoReader protoReader, C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig) throws IOException {
            Builder builder;
            C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig2 = (C32824x609e5b4) C10617a.m21405a().mo18840a(C32824x609e5b4.class, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig);
            if (com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig2 != null) {
                builder = com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 113497068:
                            builder.ad_landpage_real_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 130947485:
                            builder.ad_landpage_card_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 140093015:
                            builder.ad_landpage_non_fullscreen_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 156559953:
                            builder.ad_landpage_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 236985407:
                            builder.douplus_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 253615488:
                            builder.ad_landpage_fake_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig2 != null) {
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

    public final Boolean getAdLandpageCardEnable() throws C10174a {
        if (this.ad_landpage_card_enable != null) {
            return this.ad_landpage_card_enable;
        }
        throw new C10174a();
    }

    public final Boolean getAdLandpageEnable() throws C10174a {
        if (this.ad_landpage_enable != null) {
            return this.ad_landpage_enable;
        }
        throw new C10174a();
    }

    public final Boolean getAdLandpageFakeEnable() throws C10174a {
        if (this.ad_landpage_fake_enable != null) {
            return this.ad_landpage_fake_enable;
        }
        throw new C10174a();
    }

    public final Boolean getAdLandpageNonFullscreenEnable() throws C10174a {
        if (this.ad_landpage_non_fullscreen_enable != null) {
            return this.ad_landpage_non_fullscreen_enable;
        }
        throw new C10174a();
    }

    public final Boolean getAdLandpageRealEnable() throws C10174a {
        if (this.ad_landpage_real_enable != null) {
            return this.ad_landpage_real_enable;
        }
        throw new C10174a();
    }

    public final Boolean getDouplusEnable() throws C10174a {
        if (this.douplus_enable != null) {
            return this.douplus_enable;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_landpage_enable = this.ad_landpage_enable;
        builder.ad_landpage_fake_enable = this.ad_landpage_fake_enable;
        builder.ad_landpage_real_enable = this.ad_landpage_real_enable;
        builder.ad_landpage_card_enable = this.ad_landpage_card_enable;
        builder.ad_landpage_non_fullscreen_enable = this.ad_landpage_non_fullscreen_enable;
        builder.douplus_enable = this.douplus_enable;
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
        if (this.ad_landpage_enable != null) {
            i = this.ad_landpage_enable.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.ad_landpage_fake_enable != null) {
            i2 = this.ad_landpage_fake_enable.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.ad_landpage_real_enable != null) {
            i3 = this.ad_landpage_real_enable.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.ad_landpage_card_enable != null) {
            i4 = this.ad_landpage_card_enable.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.ad_landpage_non_fullscreen_enable != null) {
            i5 = this.ad_landpage_non_fullscreen_enable.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.douplus_enable != null) {
            i7 = this.douplus_enable.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_landpage_enable != null) {
            sb.append(", ad_landpage_enable=");
            sb.append(this.ad_landpage_enable);
        }
        if (this.ad_landpage_fake_enable != null) {
            sb.append(", ad_landpage_fake_enable=");
            sb.append(this.ad_landpage_fake_enable);
        }
        if (this.ad_landpage_real_enable != null) {
            sb.append(", ad_landpage_real_enable=");
            sb.append(this.ad_landpage_real_enable);
        }
        if (this.ad_landpage_card_enable != null) {
            sb.append(", ad_landpage_card_enable=");
            sb.append(this.ad_landpage_card_enable);
        }
        if (this.ad_landpage_non_fullscreen_enable != null) {
            sb.append(", ad_landpage_non_fullscreen_enable=");
            sb.append(this.ad_landpage_non_fullscreen_enable);
        }
        if (this.douplus_enable != null) {
            sb.append(", douplus_enable=");
            sb.append(this.douplus_enable);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_bullet_ab_CommerceAdLandpageBulletConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32824x609e5b4)) {
            return false;
        }
        C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig = (C32824x609e5b4) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.unknownFields()) || !Internal.equals(this.ad_landpage_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_enable) || !Internal.equals(this.ad_landpage_fake_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_fake_enable) || !Internal.equals(this.ad_landpage_real_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_real_enable) || !Internal.equals(this.ad_landpage_card_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_card_enable) || !Internal.equals(this.ad_landpage_non_fullscreen_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.ad_landpage_non_fullscreen_enable) || !Internal.equals(this.douplus_enable, com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig.douplus_enable)) {
            return false;
        }
        return true;
    }

    public C32824x609e5b4(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this(bool, bool2, bool3, bool4, bool5, bool6, ByteString.EMPTY);
    }

    public C32824x609e5b4(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_landpage_enable = bool;
        this.ad_landpage_fake_enable = bool2;
        this.ad_landpage_real_enable = bool3;
        this.ad_landpage_card_enable = bool4;
        this.ad_landpage_non_fullscreen_enable = bool5;
        this.douplus_enable = bool6;
    }
}
