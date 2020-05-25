package com.bytedance.ies.bullet.p628b.p643i;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.i.i */
public final class C10388i<R> {

    /* renamed from: a */
    public final Class<R> f27812a;

    /* renamed from: b */
    public final R f27813b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f27813b, (java.lang.Object) r3.f27813b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.p628b.p643i.C10388i
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.b.i.i r3 = (com.bytedance.ies.bullet.p628b.p643i.C10388i) r3
            java.lang.Class<R> r0 = r2.f27812a
            java.lang.Class<R> r1 = r3.f27812a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            R r0 = r2.f27813b
            R r3 = r3.f27813b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p643i.C10388i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Class<R> cls = this.f27812a;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        R r = this.f27813b;
        if (r != null) {
            i = r.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputInterceptorResult(type=");
        sb.append(this.f27812a);
        sb.append(", value=");
        sb.append(this.f27813b);
        sb.append(")");
        return sb.toString();
    }

    public C10388i(Class<R> cls, R r) {
        C52711k.m112240b(cls, "type");
        this.f27812a = cls;
        this.f27813b = r;
    }
}
