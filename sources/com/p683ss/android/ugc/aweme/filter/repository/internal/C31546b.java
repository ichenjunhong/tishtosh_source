package com.p683ss.android.ugc.aweme.filter.repository.internal;

import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.b */
public final class C31546b {

    /* renamed from: a */
    public final C31549c f82507a;

    /* renamed from: b */
    public final C31493f f82508b;

    /* renamed from: c */
    public final C31550d f82509c;

    /* renamed from: d */
    public final Exception f82510d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82510d, (java.lang.Object) r3.f82510d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.filter.repository.internal.b r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b) r3
            com.ss.android.ugc.aweme.filter.repository.internal.c r0 = r2.f82507a
            com.ss.android.ugc.aweme.filter.repository.internal.c r1 = r3.f82507a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.filter.repository.a.f r0 = r2.f82508b
            com.ss.android.ugc.aweme.filter.repository.a.f r1 = r3.f82508b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.filter.repository.internal.d r0 = r2.f82509c
            com.ss.android.ugc.aweme.filter.repository.internal.d r1 = r3.f82509c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Exception r0 = r2.f82510d
            java.lang.Exception r3 = r3.f82510d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C31549c cVar = this.f82507a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C31493f fVar = this.f82508b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C31550d dVar = this.f82509c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Exception exc = this.f82510d;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterDownloadEvent(state=");
        sb.append(this.f82507a);
        sb.append(", filterMeta=");
        sb.append(this.f82508b);
        sb.append(", downloadResult=");
        sb.append(this.f82509c);
        sb.append(", exception=");
        sb.append(this.f82510d);
        sb.append(")");
        return sb.toString();
    }

    public C31546b(C31549c cVar, C31493f fVar, C31550d dVar, Exception exc) {
        C52711k.m112240b(cVar, "state");
        C52711k.m112240b(fVar, "filterMeta");
        this.f82507a = cVar;
        this.f82508b = fVar;
        this.f82509c = dVar;
        this.f82510d = exc;
    }
}
