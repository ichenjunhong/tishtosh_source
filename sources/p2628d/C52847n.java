package p2628d;

import java.io.Serializable;

/* renamed from: d.n */
public final class C52847n<A, B> implements Serializable {

    /* renamed from: a */
    private final A f131092a;

    /* renamed from: b */
    private final B f131093b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=A, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=B, for r2v0, types: [java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p2628d.C52847n copy$default(p2628d.C52847n r0, A r1, B r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            A r1 = r0.f131092a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            B r2 = r0.f131093b
        L_0x000c:
            d.n r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.C52847n.copy$default(d.n, java.lang.Object, java.lang.Object, int, java.lang.Object):d.n");
    }

    public final A component1() {
        return this.f131092a;
    }

    public final B component2() {
        return this.f131093b;
    }

    public final C52847n<A, B> copy(A a, B b) {
        return new C52847n<>(a, b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f131093b, (java.lang.Object) r3.f131093b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p2628d.C52847n
            if (r0 == 0) goto L_0x001d
            d.n r3 = (p2628d.C52847n) r3
            A r0 = r2.f131092a
            A r1 = r3.f131092a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f131093b
            B r3 = r3.f131093b
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
        throw new UnsupportedOperationException("Method not decompiled: p2628d.C52847n.equals(java.lang.Object):boolean");
    }

    public final A getFirst() {
        return this.f131092a;
    }

    public final B getSecond() {
        return this.f131093b;
    }

    public final int hashCode() {
        A a = this.f131092a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f131093b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f131092a);
        sb.append(", ");
        sb.append(this.f131093b);
        sb.append(')');
        return sb.toString();
    }

    public C52847n(A a, B b) {
        this.f131092a = a;
        this.f131093b = b;
    }
}
