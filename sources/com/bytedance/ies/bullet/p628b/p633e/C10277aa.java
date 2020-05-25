package com.bytedance.ies.bullet.p628b.p633e;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.aa */
public final class C10277aa {

    /* renamed from: a */
    public final String f27674a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f27674a, (java.lang.Object) ((com.bytedance.ies.bullet.p628b.p633e.C10277aa) r2).f27674a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.ies.bullet.p628b.p633e.C10277aa
            if (r0 == 0) goto L_0x0013
            com.bytedance.ies.bullet.b.e.aa r2 = (com.bytedance.ies.bullet.p628b.p633e.C10277aa) r2
            java.lang.String r0 = r1.f27674a
            java.lang.String r2 = r2.f27674a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p633e.C10277aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f27674a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(id=");
        sb.append(this.f27674a);
        sb.append(")");
        return sb.toString();
    }

    public C10277aa(String str) {
        C52711k.m112240b(str, "id");
        this.f27674a = str;
    }
}
