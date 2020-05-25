package com.p683ss.android.ugc.aweme.commercialize.egg.p1560e;

import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e.d */
public final class C25778d {

    /* renamed from: a */
    public final String f68184a;

    /* renamed from: b */
    public final String f68185b;

    /* renamed from: c */
    public final String f68186c;

    /* renamed from: d */
    public final C25749d f68187d;

    public C25778d() {
        this(null, null, null, null, 15, null);
    }

    public C25778d(String str) {
        this(str, null, null, null, 14, null);
    }

    public C25778d(String str, String str2, String str3) {
        this(str, str2, str3, null, 8, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68187d, (java.lang.Object) r3.f68187d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.egg.e.d r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d) r3
            java.lang.String r0 = r2.f68184a
            java.lang.String r1 = r3.f68184a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68185b
            java.lang.String r1 = r3.f68185b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68186c
            java.lang.String r1 = r3.f68186c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.egg.a.d r0 = r2.f68187d
            com.ss.android.ugc.aweme.commercialize.egg.a.d r3 = r3.f68187d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68184a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68185b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68186c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C25749d dVar = this.f68187d;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceEggShowParam(eggType=");
        sb.append(this.f68184a);
        sb.append(", commentText=");
        sb.append(this.f68185b);
        sb.append(", enterFrom=");
        sb.append(this.f68186c);
        sb.append(", eventCallback=");
        sb.append(this.f68187d);
        sb.append(")");
        return sb.toString();
    }

    private C25778d(String str, String str2, String str3, C25749d dVar) {
        C52711k.m112240b(str, "eggType");
        C52711k.m112240b(str2, "commentText");
        C52711k.m112240b(str3, "enterFrom");
        this.f68184a = str;
        this.f68185b = str2;
        this.f68186c = str3;
        this.f68187d = dVar;
    }

    public /* synthetic */ C25778d(String str, String str2, String str3, C25749d dVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        this(str, str2, str3, null);
    }
}
