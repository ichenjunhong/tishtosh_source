package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c */
public final class C31096c {

    /* renamed from: a */
    public final String f81379a;

    /* renamed from: b */
    public final String f81380b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f81380b, (java.lang.Object) r3.f81380b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31096c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c r3 = (com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31096c) r3
            java.lang.String r0 = r2.f81379a
            java.lang.String r1 = r3.f81379a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f81380b
            java.lang.String r3 = r3.f81380b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31096c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f81379a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81380b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikeReasonVO(id=");
        sb.append(this.f81379a);
        sb.append(", reason=");
        sb.append(this.f81380b);
        sb.append(")");
        return sb.toString();
    }

    public C31096c(String str, String str2) {
        this.f81379a = str;
        this.f81380b = str2;
    }
}
