package com.bytedance.ies.bullet.p628b.p641h;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.k */
public final class C10365k {

    /* renamed from: a */
    public final String f27807a;

    /* renamed from: b */
    public final String f27808b;

    /* renamed from: c */
    public final String f27809c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f27809c, (java.lang.Object) r3.f27809c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.p628b.p641h.C10365k
            if (r0 == 0) goto L_0x0027
            com.bytedance.ies.bullet.b.h.k r3 = (com.bytedance.ies.bullet.p628b.p641h.C10365k) r3
            java.lang.String r0 = r2.f27807a
            java.lang.String r1 = r3.f27807a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f27808b
            java.lang.String r1 = r3.f27808b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f27809c
            java.lang.String r3 = r3.f27809c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p641h.C10365k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f27807a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27808b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27809c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimingInfo(preTrigger=");
        sb.append(this.f27807a);
        sb.append(", curTrigger=");
        sb.append(this.f27808b);
        sb.append(", intervalName=");
        sb.append(this.f27809c);
        sb.append(")");
        return sb.toString();
    }

    public C10365k(String str, String str2, String str3) {
        C52711k.m112240b(str, "preTrigger");
        C52711k.m112240b(str2, "curTrigger");
        C52711k.m112240b(str3, "intervalName");
        this.f27807a = str;
        this.f27808b = str2;
        this.f27809c = str3;
    }
}
