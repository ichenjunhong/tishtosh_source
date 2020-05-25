package com.p683ss.android.ugc.aweme.poi.p2059b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.b.g */
public final class C39047g {

    /* renamed from: a */
    public final C39048h f99542a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f99542a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.poi.p2059b.C39047g) r2).f99542a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.poi.p2059b.C39047g
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.poi.b.g r2 = (com.p683ss.android.ugc.aweme.poi.p2059b.C39047g) r2
            com.ss.android.ugc.aweme.poi.b.h r0 = r1.f99542a
            com.ss.android.ugc.aweme.poi.b.h r2 = r2.f99542a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2059b.C39047g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C39048h hVar = this.f99542a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QAUpdateEvent(editedQA=");
        sb.append(this.f99542a);
        sb.append(")");
        return sb.toString();
    }

    public C39047g(C39048h hVar) {
        C52711k.m112240b(hVar, "editedQA");
        this.f99542a = hVar;
    }
}
