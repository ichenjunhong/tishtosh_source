package p2628d;

import java.io.Serializable;

/* renamed from: d.s */
public final class C52855s<A, B, C> implements Serializable {

    /* renamed from: a */
    private final A f131103a;

    /* renamed from: b */
    private final B f131104b;

    /* renamed from: c */
    private final C f131105c;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=A, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=B, for r2v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=C, for r3v0, types: [java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p2628d.C52855s copy$default(p2628d.C52855s r0, A r1, B r2, C r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            A r1 = r0.f131103a
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            B r2 = r0.f131104b
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            C r3 = r0.f131105c
        L_0x0012:
            d.s r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.C52855s.copy$default(d.s, java.lang.Object, java.lang.Object, java.lang.Object, int, java.lang.Object):d.s");
    }

    public final A component1() {
        return this.f131103a;
    }

    public final B component2() {
        return this.f131104b;
    }

    public final C component3() {
        return this.f131105c;
    }

    public final C52855s<A, B, C> copy(A a, B b, C c) {
        return new C52855s<>(a, b, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f131105c, (java.lang.Object) r3.f131105c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p2628d.C52855s
            if (r0 == 0) goto L_0x0027
            d.s r3 = (p2628d.C52855s) r3
            A r0 = r2.f131103a
            A r1 = r3.f131103a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f131104b
            B r1 = r3.f131104b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f131105c
            C r3 = r3.f131105c
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
        throw new UnsupportedOperationException("Method not decompiled: p2628d.C52855s.equals(java.lang.Object):boolean");
    }

    public final A getFirst() {
        return this.f131103a;
    }

    public final B getSecond() {
        return this.f131104b;
    }

    public final C getThird() {
        return this.f131105c;
    }

    public final int hashCode() {
        A a = this.f131103a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f131104b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f131105c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f131103a);
        sb.append(", ");
        sb.append(this.f131104b);
        sb.append(", ");
        sb.append(this.f131105c);
        sb.append(')');
        return sb.toString();
    }

    public C52855s(A a, B b, C c) {
        this.f131103a = a;
        this.f131104b = b;
        this.f131105c = c;
    }
}
