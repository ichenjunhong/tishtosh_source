package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.b.b */
public final class C22497b {

    /* renamed from: a */
    public final String f60615a;

    /* renamed from: b */
    public final String f60616b;

    /* renamed from: c */
    public final String f60617c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f60617c, (java.lang.Object) r3.f60617c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22497b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.af.a.b.b r3 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22497b) r3
            java.lang.String r0 = r2.f60615a
            java.lang.String r1 = r3.f60615a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f60616b
            java.lang.String r1 = r3.f60616b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f60617c
            java.lang.String r3 = r3.f60617c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b.C22497b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f60615a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f60616b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f60617c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefinedTimingInfo(preTrigger=");
        sb.append(this.f60615a);
        sb.append(", curTrigger=");
        sb.append(this.f60616b);
        sb.append(", intervalName=");
        sb.append(this.f60617c);
        sb.append(")");
        return sb.toString();
    }

    public C22497b(String str, String str2, String str3) {
        C52711k.m112240b(str, "preTrigger");
        C52711k.m112240b(str2, "curTrigger");
        C52711k.m112240b(str3, "intervalName");
        this.f60615a = str;
        this.f60616b = str2;
        this.f60617c = str3;
    }
}
