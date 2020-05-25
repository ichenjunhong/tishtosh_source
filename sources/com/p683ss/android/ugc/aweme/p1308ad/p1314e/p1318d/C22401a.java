package com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.ad.e.d.a */
public final class C22401a {
    @C17952c(mo34828a = "raw_ad_data")

    /* renamed from: a */
    public final AwemeRawAd f60338a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f60338a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a) r2).f60338a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ad.e.d.a r2 = (com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a) r2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.f60338a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.f60338a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AwemeRawAd awemeRawAd = this.f60338a;
        if (awemeRawAd != null) {
            return awemeRawAd.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdItem(rawAd=");
        sb.append(this.f60338a);
        sb.append(")");
        return sb.toString();
    }
}
