package com.bytedance.ies.bullet.kit.p644rn;

import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.rn.k */
public final class C10474k {

    /* renamed from: a */
    public final List<String> f27871a;

    /* renamed from: b */
    public final String f27872b = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f27872b, (java.lang.Object) r3.f27872b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.kit.p644rn.C10474k
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.kit.rn.k r3 = (com.bytedance.ies.bullet.kit.p644rn.C10474k) r3
            java.util.List<java.lang.String> r0 = r2.f27871a
            java.util.List<java.lang.String> r1 = r3.f27871a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f27872b
            java.lang.String r3 = r3.f27872b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p644rn.C10474k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<String> list = this.f27871a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f27872b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceUrlSettings(whiteListHosts=");
        sb.append(this.f27871a);
        sb.append(", debugSafeHost=");
        sb.append(this.f27872b);
        sb.append(")");
        return sb.toString();
    }

    public C10474k(List<String> list, String str) {
        C52711k.m112240b(list, "whiteListHosts");
        this.f27871a = list;
    }
}
