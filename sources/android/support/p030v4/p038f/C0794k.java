package android.support.p030v4.p038f;

/* renamed from: android.support.v4.f.k */
public final class C0794k<F, S> {

    /* renamed from: a */
    public final F f2711a;

    /* renamed from: b */
    public final S f2712b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f2711a == null) {
            i = 0;
        } else {
            i = this.f2711a.hashCode();
        }
        if (this.f2712b != null) {
            i2 = this.f2712b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f2711a));
        sb.append(" ");
        sb.append(String.valueOf(this.f2712b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0794k)) {
            return false;
        }
        C0794k kVar = (C0794k) obj;
        if (!C0793j.m2264a(kVar.f2711a, this.f2711a) || !C0793j.m2264a(kVar.f2712b, this.f2712b)) {
            return false;
        }
        return true;
    }

    public C0794k(F f, S s) {
        this.f2711a = f;
        this.f2712b = s;
    }

    /* renamed from: a */
    public static <A, B> C0794k<A, B> m2265a(A a, B b) {
        return new C0794k<>(a, b);
    }
}
