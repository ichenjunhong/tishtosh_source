package com.p683ss.android.ugc.aweme.language;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.language.b */
public final class C35831b {
    @C17952c(mo34828a = "sub_region")

    /* renamed from: a */
    public final List<C35835f> f92007a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f92007a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.language.C35831b) r2).f92007a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.language.C35831b
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.language.b r2 = (com.p683ss.android.ugc.aweme.language.C35831b) r2
            java.util.List<com.ss.android.ugc.aweme.language.f> r0 = r1.f92007a
            java.util.List<com.ss.android.ugc.aweme.language.f> r2 = r2.f92007a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.language.C35831b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C35835f> list = this.f92007a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryData(provinceData=");
        sb.append(this.f92007a);
        sb.append(")");
        return sb.toString();
    }
}
