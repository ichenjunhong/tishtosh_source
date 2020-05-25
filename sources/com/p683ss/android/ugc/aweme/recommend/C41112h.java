package com.p683ss.android.ugc.aweme.recommend;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.h */
public final class C41112h {

    /* renamed from: a */
    public final String f104478a;

    /* renamed from: b */
    public final String f104479b;

    /* renamed from: c */
    public final String f104480c;

    public C41112h() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f104480c, (java.lang.Object) r3.f104480c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.recommend.C41112h
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.recommend.h r3 = (com.p683ss.android.ugc.aweme.recommend.C41112h) r3
            java.lang.String r0 = r2.f104478a
            java.lang.String r1 = r3.f104478a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f104479b
            java.lang.String r1 = r3.f104479b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f104480c
            java.lang.String r3 = r3.f104480c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.C41112h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f104478a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104479b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104480c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendMobParams(enterFrom=");
        sb.append(this.f104478a);
        sb.append(", previousPage=");
        sb.append(this.f104479b);
        sb.append(", pageStatus=");
        sb.append(this.f104480c);
        sb.append(")");
        return sb.toString();
    }

    public C41112h(String str, String str2, String str3) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
        C52711k.m112240b(str3, "pageStatus");
        this.f104478a = str;
        this.f104479b = str2;
        this.f104480c = str3;
    }

    public /* synthetic */ C41112h(String str, String str2, String str3, int i, C52707g gVar) {
        this("", "", "");
    }
}
