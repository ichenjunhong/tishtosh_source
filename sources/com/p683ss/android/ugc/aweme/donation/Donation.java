package com.p683ss.android.ugc.aweme.donation;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.donation.Donation */
public final class Donation {
    @C17952c(mo34828a = "bannerUrl")
    public String bannerUrl = "https://p16.muscdn.com/obj/musically-maliva-obj/981a029e70b816fce920cf874a16b2c8";
    @C17952c(mo34828a = "donationUrl")
    public String donationUrl = "";
    @C17952c(mo34828a = "tiltifyUrl")
    public String tiltifyUrl = "https://tiktok.tiltify.com/tiltify";

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getDonationUrl() {
        return this.donationUrl;
    }

    public final String getTiltifyUrl() {
        return this.tiltifyUrl;
    }

    public final void setBannerUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.bannerUrl = str;
    }

    public final void setDonationUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.donationUrl = str;
    }

    public final void setTiltifyUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.tiltifyUrl = str;
    }
}
