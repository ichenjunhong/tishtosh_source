package com.p683ss.android.ugc.aweme.recommend.viewmodel;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.a */
public final class C41144a {

    /* renamed from: a */
    public final String f104535a;

    /* renamed from: b */
    public final String f104536b;

    /* renamed from: c */
    public final String f104537c;

    public C41144a() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f104537c, (java.lang.Object) r3.f104537c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.recommend.viewmodel.C41144a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.recommend.viewmodel.a r3 = (com.p683ss.android.ugc.aweme.recommend.viewmodel.C41144a) r3
            java.lang.String r0 = r2.f104535a
            java.lang.String r1 = r3.f104535a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f104536b
            java.lang.String r1 = r3.f104536b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f104537c
            java.lang.String r3 = r3.f104537c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.viewmodel.C41144a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f104535a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104536b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104537c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendMobParams(enterFrom=");
        sb.append(this.f104535a);
        sb.append(", previousPage=");
        sb.append(this.f104536b);
        sb.append(", pageStatus=");
        sb.append(this.f104537c);
        sb.append(")");
        return sb.toString();
    }

    public C41144a(String str, String str2, String str3) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
        C52711k.m112240b(str3, "pageStatus");
        this.f104535a = str;
        this.f104536b = str2;
        this.f104537c = str3;
    }

    public /* synthetic */ C41144a(String str, String str2, String str3, int i, C52707g gVar) {
        this("", "", "");
    }
}
