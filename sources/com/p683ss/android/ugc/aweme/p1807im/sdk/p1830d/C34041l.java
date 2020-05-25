package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.l */
public final class C34041l {

    /* renamed from: a */
    public final String f88007a;

    /* renamed from: b */
    public final String f88008b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f88008b, (java.lang.Object) r3.f88008b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34041l
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.im.sdk.d.l r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34041l) r3
            java.lang.String r0 = r2.f88007a
            java.lang.String r1 = r3.f88007a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f88008b
            java.lang.String r3 = r3.f88008b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34041l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f88007a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f88008b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionUpdateEvent(sessionId=");
        sb.append(this.f88007a);
        sb.append(", content=");
        sb.append(this.f88008b);
        sb.append(")");
        return sb.toString();
    }

    public C34041l(String str, String str2) {
        this.f88007a = str;
        this.f88008b = str2;
    }
}
