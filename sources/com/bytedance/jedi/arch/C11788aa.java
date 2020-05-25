package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.aa */
public final class C11788aa<A, B, C, D> {

    /* renamed from: a */
    public final A f31294a;

    /* renamed from: b */
    public final B f31295b;

    /* renamed from: c */
    public final C f31296c;

    /* renamed from: d */
    public final D f31297d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f31297d, (java.lang.Object) r3.f31297d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11788aa
            if (r0 == 0) goto L_0x0031
            com.bytedance.jedi.arch.aa r3 = (com.bytedance.jedi.arch.C11788aa) r3
            A r0 = r2.f31294a
            A r1 = r3.f31294a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            B r0 = r2.f31295b
            B r1 = r3.f31295b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            C r0 = r2.f31296c
            C r1 = r3.f31296c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            D r0 = r2.f31297d
            D r3 = r3.f31297d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11788aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31294a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31295b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31296c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f31297d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple4(a=");
        sb.append(this.f31294a);
        sb.append(", b=");
        sb.append(this.f31295b);
        sb.append(", c=");
        sb.append(this.f31296c);
        sb.append(", d=");
        sb.append(this.f31297d);
        sb.append(")");
        return sb.toString();
    }

    public C11788aa(A a, B b, C c, D d) {
        this.f31294a = a;
        this.f31295b = b;
        this.f31296c = c;
        this.f31297d = d;
    }
}
