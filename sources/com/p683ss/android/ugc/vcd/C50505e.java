package com.p683ss.android.ugc.vcd;

import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.vcd.e */
public final class C50505e {
    @C17952c(mo34828a = "uri")

    /* renamed from: a */
    public final String f126603a;
    @C17952c(mo34828a = "url_list")

    /* renamed from: b */
    public final String[] f126604b;

    public C50505e() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f126604b, (java.lang.Object) r3.f126604b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.vcd.C50505e
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.vcd.e r3 = (com.p683ss.android.ugc.vcd.C50505e) r3
            java.lang.String r0 = r2.f126603a
            java.lang.String r1 = r3.f126603a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String[] r0 = r2.f126604b
            java.lang.String[] r3 = r3.f126604b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.vcd.C50505e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f126603a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String[] strArr = this.f126604b;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlStruct(uri=");
        sb.append(this.f126603a);
        sb.append(", urlList=");
        sb.append(Arrays.toString(this.f126604b));
        sb.append(")");
        return sb.toString();
    }

    private C50505e(String str, String[] strArr) {
        this.f126603a = str;
        this.f126604b = strArr;
    }

    private /* synthetic */ C50505e(String str, String[] strArr, int i, C52707g gVar) {
        this("", null);
    }
}
