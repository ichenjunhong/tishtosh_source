package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.d */
public final class C27138d {

    /* renamed from: a */
    public final String f71596a;

    /* renamed from: b */
    public final String f71597b;

    /* renamed from: c */
    public final String f71598c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f71598c, (java.lang.Object) r3.f71598c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27138d
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.crossplatform.b.d r3 = (com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27138d) r3
            java.lang.String r0 = r2.f71596a
            java.lang.String r1 = r3.f71596a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f71597b
            java.lang.String r1 = r3.f71597b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f71598c
            java.lang.String r3 = r3.f71598c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27138d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f71596a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71597b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71598c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(projectName=");
        sb.append(this.f71596a);
        sb.append(", enterFrom=");
        sb.append(this.f71597b);
        sb.append(", type=");
        sb.append(this.f71598c);
        sb.append(")");
        return sb.toString();
    }

    public C27138d(String str, String str2, String str3) {
        C52711k.m112240b(str, "projectName");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "type");
        this.f71596a = str;
        this.f71597b = str2;
        this.f71598c = str3;
    }
}
