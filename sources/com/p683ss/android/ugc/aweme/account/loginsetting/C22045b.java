package com.p683ss.android.ugc.aweme.account.loginsetting;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.b */
public final class C22045b {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public final C22046c f59541a;
    @C17952c(mo34828a = "message")

    /* renamed from: b */
    public final String f59542b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f59542b, (java.lang.Object) r3.f59542b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.loginsetting.C22045b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.loginsetting.b r3 = (com.p683ss.android.ugc.aweme.account.loginsetting.C22045b) r3
            com.ss.android.ugc.aweme.account.loginsetting.c r0 = r2.f59541a
            com.ss.android.ugc.aweme.account.loginsetting.c r1 = r3.f59541a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f59542b
            java.lang.String r3 = r3.f59542b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.loginsetting.C22045b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C22046c cVar = this.f59541a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f59542b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoolData(data=");
        sb.append(this.f59541a);
        sb.append(", message=");
        sb.append(this.f59542b);
        sb.append(")");
        return sb.toString();
    }
}
