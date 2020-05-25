package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.w */
public final class C28369w {
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    public String f74470a;
    @C17952c(mo34828a = "item")

    /* renamed from: b */
    public List<Object> f74471b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f74471b, (java.lang.Object) r3.f74471b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.mixfeed.C28369w
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.mixfeed.w r3 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28369w) r3
            java.lang.String r0 = r2.f74470a
            java.lang.String r1 = r3.f74470a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.lang.Object> r0 = r2.f74471b
            java.util.List<java.lang.Object> r3 = r3.f74471b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mixfeed.C28369w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f74470a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Object> list = this.f74471b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRelate(relateName=");
        sb.append(this.f74470a);
        sb.append(", ralateList=");
        sb.append(this.f74471b);
        sb.append(")");
        return sb.toString();
    }
}
