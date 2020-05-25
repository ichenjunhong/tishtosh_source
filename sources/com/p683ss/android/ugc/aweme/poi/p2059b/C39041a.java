package com.p683ss.android.ugc.aweme.poi.p2059b;

import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;

/* renamed from: com.ss.android.ugc.aweme.poi.b.a */
public final class C39041a {

    /* renamed from: a */
    public final C25687b f99536a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f99536a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.poi.p2059b.C39041a) r2).f99536a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.poi.p2059b.C39041a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.poi.b.a r2 = (com.p683ss.android.ugc.aweme.poi.p2059b.C39041a) r2
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r0 = r1.f99536a
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r2 = r2.f99536a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2059b.C39041a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C25687b bVar = this.f99536a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponUpdateEvent(couponInfo=");
        sb.append(this.f99536a);
        sb.append(")");
        return sb.toString();
    }

    public C39041a(C25687b bVar) {
        this.f99536a = bVar;
    }
}
