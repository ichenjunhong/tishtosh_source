package com.p683ss.android.ugc.aweme.shortvideo;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dm */
public final class C43219dm {

    /* renamed from: a */
    public final String f109305a;

    /* renamed from: b */
    public final String f109306b;

    /* renamed from: c */
    public final String f109307c;

    public C43219dm() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f109307c, (java.lang.Object) r3.f109307c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.C43219dm
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.shortvideo.dm r3 = (com.p683ss.android.ugc.aweme.shortvideo.C43219dm) r3
            java.lang.String r0 = r2.f109305a
            java.lang.String r1 = r3.f109305a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f109306b
            java.lang.String r1 = r3.f109306b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f109307c
            java.lang.String r3 = r3.f109307c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C43219dm.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f109305a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109306b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f109307c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordCommonParameter(shootWay=");
        sb.append(this.f109305a);
        sb.append(", creationId=");
        sb.append(this.f109306b);
        sb.append(", enterForm=");
        sb.append(this.f109307c);
        sb.append(")");
        return sb.toString();
    }

    public C43219dm(String str, String str2, String str3) {
        this.f109305a = str;
        this.f109306b = str2;
        this.f109307c = str3;
    }

    public /* synthetic */ C43219dm(String str, String str2, String str3, int i, C52707g gVar) {
        this("", "", "");
    }
}
