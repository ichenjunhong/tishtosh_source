package com.p683ss.android.ugc.vcd;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.vcd.d */
public final class C50504d {
    @C17952c(mo34828a = "text")

    /* renamed from: a */
    public final String f126601a;
    @C17952c(mo34828a = "link")

    /* renamed from: b */
    public final C50505e f126602b;

    public C50504d() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f126602b, (java.lang.Object) r3.f126602b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.vcd.C50504d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.vcd.d r3 = (com.p683ss.android.ugc.vcd.C50504d) r3
            java.lang.String r0 = r2.f126601a
            java.lang.String r1 = r3.f126601a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.vcd.e r0 = r2.f126602b
            com.ss.android.ugc.vcd.e r3 = r3.f126602b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.vcd.C50504d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f126601a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C50505e eVar = this.f126602b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkTextStruct(text=");
        sb.append(this.f126601a);
        sb.append(", link=");
        sb.append(this.f126602b);
        sb.append(")");
        return sb.toString();
    }

    private C50504d(String str, C50505e eVar) {
        this.f126601a = str;
        this.f126602b = eVar;
    }

    private /* synthetic */ C50504d(String str, C50505e eVar, int i, C52707g gVar) {
        this("", null);
    }
}
