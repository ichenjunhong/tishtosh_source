package com.p683ss.android.ugc.aweme.filter.repository.internal;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.d */
public final class C31550d {

    /* renamed from: a */
    public final String f82513a;

    /* renamed from: b */
    public final String f82514b;

    /* renamed from: c */
    public final String f82515c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82515c, (java.lang.Object) r3.f82515c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.filter.repository.internal.d r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d) r3
            java.lang.String r0 = r2.f82513a
            java.lang.String r1 = r3.f82513a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f82514b
            java.lang.String r1 = r3.f82514b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f82515c
            java.lang.String r3 = r3.f82515c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f82513a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f82514b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f82515c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterPaths(filterFilePath=");
        sb.append(this.f82513a);
        sb.append(", filterFolder=");
        sb.append(this.f82514b);
        sb.append(", thumbnailFilePath=");
        sb.append(this.f82515c);
        sb.append(")");
        return sb.toString();
    }

    public C31550d(String str, String str2, String str3) {
        C52711k.m112240b(str, "filterFilePath");
        C52711k.m112240b(str2, "filterFolder");
        C52711k.m112240b(str3, "thumbnailFilePath");
        this.f82513a = str;
        this.f82514b = str2;
        this.f82515c = str3;
    }
}
