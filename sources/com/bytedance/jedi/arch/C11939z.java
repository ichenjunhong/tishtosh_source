package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.z */
public final class C11939z<A, B, C> {

    /* renamed from: a */
    public final A f31624a;

    /* renamed from: b */
    public final B f31625b;

    /* renamed from: c */
    public final C f31626c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f31626c, (java.lang.Object) r3.f31626c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11939z
            if (r0 == 0) goto L_0x0027
            com.bytedance.jedi.arch.z r3 = (com.bytedance.jedi.arch.C11939z) r3
            A r0 = r2.f31624a
            A r1 = r3.f31624a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f31625b
            B r1 = r3.f31625b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f31626c
            C r3 = r3.f31626c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11939z.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31624a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31625b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31626c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple3(a=");
        sb.append(this.f31624a);
        sb.append(", b=");
        sb.append(this.f31625b);
        sb.append(", c=");
        sb.append(this.f31626c);
        sb.append(")");
        return sb.toString();
    }

    public C11939z(A a, B b, C c) {
        this.f31624a = a;
        this.f31625b = b;
        this.f31626c = c;
    }
}
