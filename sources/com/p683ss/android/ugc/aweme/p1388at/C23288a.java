package com.p683ss.android.ugc.aweme.p1388at;

import java.io.Serializable;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.at.a */
public final class C23288a implements Serializable {

    /* renamed from: a */
    private final String f62273a;

    /* renamed from: b */
    private final List<C52847n<String, String>> f62274b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<d.n<java.lang.String, java.lang.String>>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.p1388at.C23288a copy$default(com.p683ss.android.ugc.aweme.p1388at.C23288a r0, java.lang.String r1, java.util.List<p2628d.C52847n<java.lang.String, java.lang.String>> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.f62273a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<d.n<java.lang.String, java.lang.String>> r2 = r0.f62274b
        L_0x000c:
            com.ss.android.ugc.aweme.at.a r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1388at.C23288a.copy$default(com.ss.android.ugc.aweme.at.a, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.at.a");
    }

    public final String component1() {
        return this.f62273a;
    }

    public final List<C52847n<String, String>> component2() {
        return this.f62274b;
    }

    public final C23288a copy(String str, List<C52847n<String, String>> list) {
        C52711k.m112240b(str, "photonPath");
        C52711k.m112240b(list, "maskFiles");
        return new C23288a(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f62274b, (java.lang.Object) r3.f62274b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1388at.C23288a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.at.a r3 = (com.p683ss.android.ugc.aweme.p1388at.C23288a) r3
            java.lang.String r0 = r2.f62273a
            java.lang.String r1 = r3.f62273a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<d.n<java.lang.String, java.lang.String>> r0 = r2.f62274b
            java.util.List<d.n<java.lang.String, java.lang.String>> r3 = r3.f62274b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1388at.C23288a.equals(java.lang.Object):boolean");
    }

    public final List<C52847n<String, String>> getMaskFiles() {
        return this.f62274b;
    }

    public final String getPhotonPath() {
        return this.f62273a;
    }

    public final int hashCode() {
        String str = this.f62273a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C52847n<String, String>> list = this.f62274b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfrFileBean(photonPath=");
        sb.append(this.f62273a);
        sb.append(", maskFiles=");
        sb.append(this.f62274b);
        sb.append(")");
        return sb.toString();
    }

    public C23288a(String str, List<C52847n<String, String>> list) {
        C52711k.m112240b(str, "photonPath");
        C52711k.m112240b(list, "maskFiles");
        this.f62273a = str;
        this.f62274b = list;
    }
}
