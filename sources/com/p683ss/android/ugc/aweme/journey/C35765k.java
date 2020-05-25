package com.p683ss.android.ugc.aweme.journey;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.journey.k */
public final class C35765k {
    @C17952c(mo34828a = "code")

    /* renamed from: a */
    public final String f91857a;
    @C17952c(mo34828a = "en_name")

    /* renamed from: b */
    public final String f91858b;
    @C17952c(mo34828a = "local_name")

    /* renamed from: c */
    public final String f91859c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f91859c, (java.lang.Object) r3.f91859c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.journey.C35765k
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.journey.k r3 = (com.p683ss.android.ugc.aweme.journey.C35765k) r3
            java.lang.String r0 = r2.f91857a
            java.lang.String r1 = r3.f91857a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f91858b
            java.lang.String r1 = r3.f91858b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f91859c
            java.lang.String r3 = r3.f91859c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35765k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f91857a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f91858b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f91859c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyContentLanguage(code=");
        sb.append(this.f91857a);
        sb.append(", en_name=");
        sb.append(this.f91858b);
        sb.append(", local_name=");
        sb.append(this.f91859c);
        sb.append(")");
        return sb.toString();
    }
}
