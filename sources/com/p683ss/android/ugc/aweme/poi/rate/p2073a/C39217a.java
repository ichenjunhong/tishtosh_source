package com.p683ss.android.ugc.aweme.poi.rate.p2073a;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.a.a */
public final class C39217a {
    @C17952c(mo34828a = "spu_id")

    /* renamed from: a */
    public final String f100139a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public final String f100140b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f100140b, (java.lang.Object) r3.f100140b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39217a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.rate.a.a r3 = (com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39217a) r3
            java.lang.String r0 = r2.f100139a
            java.lang.String r1 = r3.f100139a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f100140b
            java.lang.String r3 = r3.f100140b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.rate.p2073a.C39217a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f100139a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100140b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiSpu(spuId=");
        sb.append(this.f100139a);
        sb.append(", name=");
        sb.append(this.f100140b);
        sb.append(")");
        return sb.toString();
    }
}
