package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.x */
public final class C11937x<A> {

    /* renamed from: a */
    public final A f31621a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f31621a, (java.lang.Object) ((com.bytedance.jedi.arch.C11937x) r2).f31621a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.jedi.arch.C11937x
            if (r0 == 0) goto L_0x0013
            com.bytedance.jedi.arch.x r2 = (com.bytedance.jedi.arch.C11937x) r2
            A r0 = r1.f31621a
            A r2 = r2.f31621a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11937x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31621a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple1(a=");
        sb.append(this.f31621a);
        sb.append(")");
        return sb.toString();
    }

    public C11937x(A a) {
        this.f31621a = a;
    }
}
