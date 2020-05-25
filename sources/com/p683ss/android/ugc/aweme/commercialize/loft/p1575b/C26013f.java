package com.p683ss.android.ugc.aweme.commercialize.loft.p1575b;

import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.b.f */
public final class C26013f {

    /* renamed from: a */
    public final UrlModel f68680a;

    /* renamed from: b */
    public final String f68681b;

    /* renamed from: c */
    public final LiveData<Float> f68682c;

    /* renamed from: d */
    public final float f68683d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (java.lang.Float.compare(r2.f68683d, r3.f68683d) == 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26013f
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.loft.b.f r3 = (com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26013f) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f68680a
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f68680a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68681b
            java.lang.String r1 = r3.f68681b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            android.arch.lifecycle.LiveData<java.lang.Float> r0 = r2.f68682c
            android.arch.lifecycle.LiveData<java.lang.Float> r1 = r3.f68682c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            float r0 = r2.f68683d
            float r3 = r3.f68683d
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26013f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        UrlModel urlModel = this.f68680a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f68681b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LiveData<Float> liveData = this.f68682c;
        if (liveData != null) {
            i = liveData.hashCode();
        }
        return ((hashCode2 + i) * 31) + Float.floatToIntBits(this.f68683d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullGuide(imageUrl=");
        sb.append(this.f68680a);
        sb.append(", guideText=");
        sb.append(this.f68681b);
        sb.append(", totalConsume=");
        sb.append(this.f68682c);
        sb.append(", refreshLayoutHeight=");
        sb.append(this.f68683d);
        sb.append(")");
        return sb.toString();
    }
}
