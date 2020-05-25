package com.p683ss.android.ugc.aweme.location;

import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.location.k */
public final class C36271k {

    /* renamed from: a */
    public final String f92844a;

    /* renamed from: b */
    public List<? extends Throwable> f92845b;

    public C36271k() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f92845b, (java.lang.Object) r3.f92845b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.location.C36271k
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.location.k r3 = (com.p683ss.android.ugc.aweme.location.C36271k) r3
            java.lang.String r0 = r2.f92844a
            java.lang.String r1 = r3.f92844a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<? extends java.lang.Throwable> r0 = r2.f92845b
            java.util.List<? extends java.lang.Throwable> r3 = r3.f92845b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.location.C36271k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f92844a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<? extends Throwable> list = this.f92845b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationException(code=");
        sb.append(this.f92844a);
        sb.append(", causes=");
        sb.append(this.f92845b);
        sb.append(")");
        return sb.toString();
    }

    public C36271k(String str, List<? extends Throwable> list) {
        this.f92844a = str;
        this.f92845b = list;
    }

    private /* synthetic */ C36271k(String str, List list, int i, C52707g gVar) {
        this(null, null);
    }
}
