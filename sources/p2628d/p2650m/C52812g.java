package p2628d.p2650m;

import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52751c;

/* renamed from: d.m.g */
public final class C52812g {

    /* renamed from: a */
    public final String f131060a;

    /* renamed from: b */
    public final C52751c f131061b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f131061b, (java.lang.Object) r3.f131061b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p2628d.p2650m.C52812g
            if (r0 == 0) goto L_0x001d
            d.m.g r3 = (p2628d.p2650m.C52812g) r3
            java.lang.String r0 = r2.f131060a
            java.lang.String r1 = r3.f131060a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            d.j.c r0 = r2.f131061b
            d.j.c r3 = r3.f131061b
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
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2650m.C52812g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f131060a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C52751c cVar = this.f131061b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchGroup(value=");
        sb.append(this.f131060a);
        sb.append(", range=");
        sb.append(this.f131061b);
        sb.append(")");
        return sb.toString();
    }

    public C52812g(String str, C52751c cVar) {
        C52711k.m112240b(str, "value");
        C52711k.m112240b(cVar, "range");
        this.f131060a = str;
        this.f131061b = cVar;
    }
}
