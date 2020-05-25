package com.p683ss.android.ugc.aweme.mix;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.mix.s */
public final class C37088s {

    /* renamed from: a */
    public final String f94727a;

    public C37088s() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f94727a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.mix.C37088s) r2).f94727a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.mix.C37088s
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.mix.s r2 = (com.p683ss.android.ugc.aweme.mix.C37088s) r2
            java.lang.String r0 = r1.f94727a
            java.lang.String r2 = r2.f94727a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37088s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f94727a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixInfoRequestParams(mixId=");
        sb.append(this.f94727a);
        sb.append(")");
        return sb.toString();
    }

    public C37088s(String str) {
        this.f94727a = str;
    }

    private /* synthetic */ C37088s(String str, int i, C52707g gVar) {
        this(null);
    }
}
