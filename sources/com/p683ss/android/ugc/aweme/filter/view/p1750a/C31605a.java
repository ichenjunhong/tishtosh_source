package com.p683ss.android.ugc.aweme.filter.view.p1750a;

import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.a.a */
public final class C31605a {

    /* renamed from: a */
    public final C31606b f82610a;

    /* renamed from: b */
    public final C31489b f82611b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82611b, (java.lang.Object) r3.f82611b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.view.a.a r3 = (com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a) r3
            com.ss.android.ugc.aweme.filter.view.a.b r0 = r2.f82610a
            com.ss.android.ugc.aweme.filter.view.a.b r1 = r3.f82610a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.b r0 = r2.f82611b
            com.ss.android.ugc.aweme.filter.repository.a.b r3 = r3.f82611b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C31606b bVar = this.f82610a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C31489b bVar2 = this.f82611b;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterBoxActionEvent(type=");
        sb.append(this.f82610a);
        sb.append(", data=");
        sb.append(this.f82611b);
        sb.append(")");
        return sb.toString();
    }

    public C31605a(C31606b bVar, C31489b bVar2) {
        C52711k.m112240b(bVar, "type");
        C52711k.m112240b(bVar2, "data");
        this.f82610a = bVar;
        this.f82611b = bVar2;
    }
}
