package com.p683ss.android.ugc.aweme.discover.p1642d;

import com.p683ss.android.ugc.aweme.search.model.C41440e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.d.f */
public final class C28098f {

    /* renamed from: a */
    public C41440e f73788a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f73788a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.p1642d.C28098f) r2).f73788a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.p1642d.C28098f
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.d.f r2 = (com.p683ss.android.ugc.aweme.discover.p1642d.C28098f) r2
            com.ss.android.ugc.aweme.search.model.e r0 = r1.f73788a
            com.ss.android.ugc.aweme.search.model.e r2 = r2.f73788a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1642d.C28098f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C41440e eVar = this.f73788a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InnerSearchEvent(param=");
        sb.append(this.f73788a);
        sb.append(")");
        return sb.toString();
    }

    public C28098f(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        this.f73788a = eVar;
    }
}
