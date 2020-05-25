package com.p683ss.android.ugc.aweme;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t */
public final class C27983t {

    /* renamed from: a */
    public final String f73410a;

    /* renamed from: b */
    public final String f73411b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f73411b, (java.lang.Object) r3.f73411b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.C27983t
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.t r3 = (com.p683ss.android.ugc.aweme.C27983t) r3
            java.lang.String r0 = r2.f73410a
            java.lang.String r1 = r3.f73410a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f73411b
            java.lang.String r3 = r3.f73411b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.C27983t.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f73410a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73411b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BindMobileFinishData(phone=");
        sb.append(this.f73410a);
        sb.append(", response=");
        sb.append(this.f73411b);
        sb.append(")");
        return sb.toString();
    }

    public C27983t(String str, String str2) {
        C52711k.m112240b(str, "phone");
        C52711k.m112240b(str2, "response");
        this.f73410a = str;
        this.f73411b = str2;
    }
}
