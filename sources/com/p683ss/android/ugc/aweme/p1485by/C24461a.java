package com.p683ss.android.ugc.aweme.p1485by;

import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.by.a */
public final class C24461a {

    /* renamed from: a */
    public final List<C41684a> f64839a;

    /* renamed from: b */
    public final List<C41684a> f64840b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f64840b, (java.lang.Object) r3.f64840b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1485by.C24461a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.by.a r3 = (com.p683ss.android.ugc.aweme.p1485by.C24461a) r3
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.a.a> r0 = r2.f64839a
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.a.a> r1 = r3.f64839a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.a.a> r0 = r2.f64840b
            java.util.List<com.ss.android.ugc.aweme.setting.serverpush.a.a> r3 = r3.f64840b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1485by.C24461a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C41684a> list = this.f64839a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C41684a> list2 = this.f64840b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentLanguageResult(selected=");
        sb.append(this.f64839a);
        sb.append(", unselect=");
        sb.append(this.f64840b);
        sb.append(")");
        return sb.toString();
    }

    public C24461a(List<? extends C41684a> list, List<? extends C41684a> list2) {
        this.f64839a = list;
        this.f64840b = list2;
    }
}
