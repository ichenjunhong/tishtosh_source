package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.e */
public final class C31492e {

    /* renamed from: a */
    public final C31491d f82402a;

    /* renamed from: b */
    public final C31491d f82403b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82403b, (java.lang.Object) r3.f82403b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.e r3 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e) r3
            com.ss.android.ugc.aweme.filter.repository.a.d r0 = r2.f82402a
            com.ss.android.ugc.aweme.filter.repository.a.d r1 = r3.f82402a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.d r0 = r2.f82403b
            com.ss.android.ugc.aweme.filter.repository.a.d r3 = r3.f82403b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C31491d dVar = this.f82402a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        C31491d dVar2 = this.f82403b;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterInfoEvent(from=");
        sb.append(this.f82402a);
        sb.append(", to=");
        sb.append(this.f82403b);
        sb.append(")");
        return sb.toString();
    }

    public C31492e(C31491d dVar, C31491d dVar2) {
        C52711k.m112240b(dVar, "from");
        C52711k.m112240b(dVar2, "to");
        this.f82402a = dVar;
        this.f82403b = dVar2;
    }
}
