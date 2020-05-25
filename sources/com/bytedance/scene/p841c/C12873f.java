package com.bytedance.scene.p841c;

/* renamed from: com.bytedance.scene.c.f */
public final class C12873f<F, S> {

    /* renamed from: a */
    public final F f33705a;

    /* renamed from: b */
    public final S f33706b;

    public final int hashCode() {
        return this.f33705a.hashCode() ^ this.f33706b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f33705a));
        sb.append(" ");
        sb.append(String.valueOf(this.f33706b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12873f)) {
            return false;
        }
        C12873f fVar = (C12873f) obj;
        if (!m25793b(fVar.f33705a, this.f33705a) || !m25793b(fVar.f33706b, this.f33706b)) {
            return false;
        }
        return true;
    }

    private C12873f(F f, S s) {
        this.f33705a = f;
        this.f33706b = s;
    }

    /* renamed from: a */
    public static <A, B> C12873f<A, B> m25792a(A a, B b) {
        return new C12873f<>(a, b);
    }

    /* renamed from: b */
    private static boolean m25793b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
