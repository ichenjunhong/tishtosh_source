package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.aa */
public final class C26106aa {
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    public final String f68911a;
    @C17952c(mo34828a = "children")

    /* renamed from: b */
    public final List<C26106aa> f68912b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68912b, (java.lang.Object) r3.f68912b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.model.C26106aa
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commercialize.model.aa r3 = (com.p683ss.android.ugc.aweme.commercialize.model.C26106aa) r3
            java.lang.String r0 = r2.f68911a
            java.lang.String r1 = r3.f68911a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.commercialize.model.aa> r0 = r2.f68912b
            java.util.List<com.ss.android.ugc.aweme.commercialize.model.aa> r3 = r3.f68912b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.model.C26106aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68911a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C26106aa> list = this.f68912b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionListItemParams(name=");
        sb.append(this.f68911a);
        sb.append(", children=");
        sb.append(this.f68912b);
        sb.append(")");
        return sb.toString();
    }
}
