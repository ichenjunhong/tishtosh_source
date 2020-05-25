package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.y */
public final class C11938y<A, B> {

    /* renamed from: a */
    public final A f31622a;

    /* renamed from: b */
    public final B f31623b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f31623b, (java.lang.Object) r3.f31623b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11938y
            if (r0 == 0) goto L_0x001d
            com.bytedance.jedi.arch.y r3 = (com.bytedance.jedi.arch.C11938y) r3
            A r0 = r2.f31622a
            A r1 = r3.f31622a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f31623b
            B r3 = r3.f31623b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11938y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31622a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31623b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple2(a=");
        sb.append(this.f31622a);
        sb.append(", b=");
        sb.append(this.f31623b);
        sb.append(")");
        return sb.toString();
    }

    public C11938y(A a, B b) {
        this.f31622a = a;
        this.f31623b = b;
    }
}
