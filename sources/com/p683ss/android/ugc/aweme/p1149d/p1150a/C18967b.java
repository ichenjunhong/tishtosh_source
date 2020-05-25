package com.p683ss.android.ugc.aweme.p1149d.p1150a;

import com.bytedance.retrofit2.p830a.C12685b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.d.a.b */
public final class C18967b {

    /* renamed from: a */
    public String f52266a;

    /* renamed from: b */
    public String f52267b;

    /* renamed from: c */
    public List<C12685b> f52268c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f52268c, (java.lang.Object) r3.f52268c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1149d.p1150a.C18967b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.d.a.b r3 = (com.p683ss.android.ugc.aweme.p1149d.p1150a.C18967b) r3
            java.lang.String r0 = r2.f52266a
            java.lang.String r1 = r3.f52266a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f52267b
            java.lang.String r1 = r3.f52267b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bytedance.retrofit2.a.b> r0 = r2.f52268c
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f52268c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1149d.p1150a.C18967b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f52266a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f52267b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C12685b> list = this.f52268c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("URL:         ");
        sb.append(this.f52266a);
        sb.append("\r\n\r\nHEADERS:          ");
        List<C12685b> list = this.f52268c;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\r\n\r\nRESPONSE:         ");
        sb.append(this.f52267b);
        sb.append("\r\n\r\n");
        return sb.toString();
    }
}
