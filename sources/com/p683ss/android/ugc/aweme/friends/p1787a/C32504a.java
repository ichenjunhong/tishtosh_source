package com.p683ss.android.ugc.aweme.friends.p1787a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.a.a */
public final class C32504a {

    /* renamed from: a */
    public final String f84605a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f84605a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.friends.p1787a.C32504a) r2).f84605a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.friends.p1787a.C32504a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.friends.a.a r2 = (com.p683ss.android.ugc.aweme.friends.p1787a.C32504a) r2
            java.lang.String r0 = r1.f84605a
            java.lang.String r2 = r2.f84605a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.p1787a.C32504a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f84605a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackFromSettingEvent(enterFrom=");
        sb.append(this.f84605a);
        sb.append(")");
        return sb.toString();
    }

    public C32504a(String str) {
        C52711k.m112240b(str, "enterFrom");
        this.f84605a = str;
    }
}
