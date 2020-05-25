package p2628d.p2639f.p2641b;

import java.lang.annotation.Annotation;
import java.util.List;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.C52693b;
import p2628d.p2648k.C52760c;

/* renamed from: d.f.b.e */
public final class C52705e implements C52704d, C52760c<Object> {

    /* renamed from: a */
    private final Class<?> f130965a;

    /* renamed from: a */
    public final Class<?> mo110297a() {
        return this.f130965a;
    }

    public final List<Annotation> getAnnotations() {
        throw new C52693b();
    }

    public final int hashCode() {
        return C52669a.m112220b(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo110297a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public C52705e(Class<?> cls) {
        C52711k.m112240b(cls, "jClass");
        this.f130965a = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C52705e) || !C52711k.m112239a((Object) C52669a.m112220b(this), (Object) C52669a.m112220b((C52760c) obj))) {
            return false;
        }
        return true;
    }
}
