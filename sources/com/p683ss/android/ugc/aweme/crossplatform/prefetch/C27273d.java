package com.p683ss.android.ugc.aweme.crossplatform.prefetch;

import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48307b;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48309d;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.d */
public final class C27273d {

    /* renamed from: a */
    public final C48307b f71948a;

    /* renamed from: b */
    public final C48309d f71949b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f71949b, (java.lang.Object) r3.f71949b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.crossplatform.prefetch.d r3 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r3
            com.ss.android.ugc.aweme.web.jsbridge.a.a$b r0 = r2.f71948a
            com.ss.android.ugc.aweme.web.jsbridge.a.a$b r1 = r3.f71948a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.web.jsbridge.a.a$d r0 = r2.f71949b
            com.ss.android.ugc.aweme.web.jsbridge.a.a$d r3 = r3.f71949b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C48307b bVar = this.f71948a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C48309d dVar = this.f71949b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsRequestAndResponse(jsRequest=");
        sb.append(this.f71948a);
        sb.append(", jsResponse=");
        sb.append(this.f71949b);
        sb.append(")");
        return sb.toString();
    }

    public C27273d(C48307b bVar, C48309d dVar) {
        this.f71948a = bVar;
        this.f71949b = dVar;
    }
}
