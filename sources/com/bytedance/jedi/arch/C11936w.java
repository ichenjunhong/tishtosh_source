package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.w */
public final class C11936w<T> extends C11787a<T> {

    /* renamed from: a */
    public final T f31620a;

    /* renamed from: a */
    public final T mo22538a() {
        return this.f31620a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f31620a, (java.lang.Object) ((com.bytedance.jedi.arch.C11936w) r2).f31620a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.jedi.arch.C11936w
            if (r0 == 0) goto L_0x0013
            com.bytedance.jedi.arch.w r2 = (com.bytedance.jedi.arch.C11936w) r2
            T r0 = r1.f31620a
            T r2 = r2.f31620a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11936w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        T t = this.f31620a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(value=");
        sb.append(this.f31620a);
        sb.append(")");
        return sb.toString();
    }

    public C11936w(T t) {
        super(null);
        this.f31620a = t;
    }
}
