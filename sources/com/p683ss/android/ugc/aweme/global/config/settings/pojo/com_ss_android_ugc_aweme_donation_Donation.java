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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_donation_Donation */
public final class com_ss_android_ugc_aweme_donation_Donation extends Message<com_ss_android_ugc_aweme_donation_Donation, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_donation_Donation> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_donation_Donation();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 85234019)
    public final String bannerUrl;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 122239877)
    public final String donationUrl;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 95229392)
    public final String tiltifyUrl;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_donation_Donation$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_donation_Donation, Builder> {
        public String bannerUrl;
        public String donationUrl;
        public String tiltifyUrl;

        public final com_ss_android_ugc_aweme_donation_Donation build() {
            return new com_ss_android_ugc_aweme_donation_Donation(this.donationUrl, this.bannerUrl, this.tiltifyUrl, super.buildUnknownFields());
        }

        public final Builder bannerUrl(String str) {
            this.bannerUrl = str;
            return this;
        }

        public final Builder donationUrl(String str) {
            this.donationUrl = str;
            return this;
        }

        public final Builder tiltifyUrl(String str) {
            this.tiltifyUrl = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_donation_Donation$ProtoAdapter_com_ss_android_ugc_aweme_donation_Donation */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_donation_Donation extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_donation_Donation> {
        public final com_ss_android_ugc_aweme_donation_Donation redact(com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation) {
            return com_ss_android_ugc_aweme_donation_donation;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_donation_Donation() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_donation_Donation.class);
        }

        public final com_ss_android_ugc_aweme_donation_Donation decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_donation_Donation) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation) {
            return ProtoAdapter.STRING.encodedSizeWithTag(122239877, com_ss_android_ugc_aweme_donation_donation.donationUrl) + ProtoAdapter.STRING.encodedSizeWithTag(85234019, com_ss_android_ugc_aweme_donation_donation.bannerUrl) + ProtoAdapter.STRING.encodedSizeWithTag(95229392, com_ss_android_ugc_aweme_donation_donation.tiltifyUrl) + com_ss_android_ugc_aweme_donation_donation.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 122239877, com_ss_android_ugc_aweme_donation_donation.donationUrl);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 85234019, com_ss_android_ugc_aweme_donation_donation.bannerUrl);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 95229392, com_ss_android_ugc_aweme_donation_donation.tiltifyUrl);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_donation_donation.unknownFields());
        }

        public final com_ss_android_ugc_aweme_donation_Donation decode(ProtoReader protoReader, com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation2 = (com_ss_android_ugc_aweme_donation_Donation) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_donation_Donation.class, com_ss_android_ugc_aweme_donation_donation);
            if (com_ss_android_ugc_aweme_donation_donation2 != null) {
                builder = com_ss_android_ugc_aweme_donation_donation2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 85234019) {
                    builder.bannerUrl((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 95229392) {
                    builder.tiltifyUrl((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 122239877) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_donation_donation2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.donationUrl((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getBannerUrl() throws C10174a {
        if (this.bannerUrl != null) {
            return this.bannerUrl;
        }
        throw new C10174a();
    }

    public final String getDonationUrl() throws C10174a {
        if (this.donationUrl != null) {
            return this.donationUrl;
        }
        throw new C10174a();
    }

    public final String getTiltifyUrl() throws C10174a {
        if (this.tiltifyUrl != null) {
            return this.tiltifyUrl;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.donationUrl = this.donationUrl;
        builder.bannerUrl = this.bannerUrl;
        builder.tiltifyUrl = this.tiltifyUrl;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.donationUrl != null) {
            i = this.donationUrl.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.bannerUrl != null) {
            i2 = this.bannerUrl.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.tiltifyUrl != null) {
            i4 = this.tiltifyUrl.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.donationUrl != null) {
            sb.append(", donationUrl=");
            sb.append(this.donationUrl);
        }
        if (this.bannerUrl != null) {
            sb.append(", bannerUrl=");
            sb.append(this.bannerUrl);
        }
        if (this.tiltifyUrl != null) {
            sb.append(", tiltifyUrl=");
            sb.append(this.tiltifyUrl);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_donation_Donation{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_donation_Donation)) {
            return false;
        }
        com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation = (com_ss_android_ugc_aweme_donation_Donation) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_donation_donation.unknownFields()) || !Internal.equals(this.donationUrl, com_ss_android_ugc_aweme_donation_donation.donationUrl) || !Internal.equals(this.bannerUrl, com_ss_android_ugc_aweme_donation_donation.bannerUrl) || !Internal.equals(this.tiltifyUrl, com_ss_android_ugc_aweme_donation_donation.tiltifyUrl)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_donation_Donation(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_donation_Donation(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.donationUrl = str;
        this.bannerUrl = str2;
        this.tiltifyUrl = str3;
    }
}
