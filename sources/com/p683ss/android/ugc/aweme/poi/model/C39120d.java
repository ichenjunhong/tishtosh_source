package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.d */
public final class C39120d implements Serializable {
    @C17952c(mo34828a = "coupon_type")

    /* renamed from: a */
    private int f99797a;
    @C17952c(mo34828a = "coupon")

    /* renamed from: b */
    private C25687b f99798b;
    @C17952c(mo34828a = "ad_card")

    /* renamed from: c */
    private C39085a f99799c;

    /* renamed from: d */
    private int f99800d;

    public final C39085a getAdCard() {
        return this.f99799c;
    }

    public final int getAdSrc() {
        return this.f99800d;
    }

    public final C25687b getCouponInfo() {
        return this.f99798b;
    }

    public final int getCouponType() {
        return this.f99797a;
    }

    public final List<AwemeRawAd> getAwemeRawAds() {
        if (this.f99799c != null) {
            return this.f99799c.getAwemeAds();
        }
        return null;
    }

    public final void parseRawData() {
        if (this.f99799c != null) {
            this.f99799c.parseRawData();
        }
    }

    public final void setAdCard(C39085a aVar) {
        this.f99799c = aVar;
    }

    public final void setAdSrc(int i) {
        this.f99800d = i;
    }

    public final void setCouponInfo(C25687b bVar) {
        this.f99798b = bVar;
    }

    public final void setCouponType(int i) {
        this.f99797a = i;
    }

    public final void setAwemeRawAds(List<AwemeRawAd> list) {
        if (this.f99799c != null) {
            this.f99799c.setAwemeRawAds(list);
        }
    }
}
