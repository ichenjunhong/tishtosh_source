package p2628d.p2639f.p2641b;

/* renamed from: d.f.b.p */
public final class C52716p implements C52704d {

    /* renamed from: a */
    private final Class<?> f130976a;

    /* renamed from: b */
    private final String f130977b;

    /* renamed from: a */
    public final Class<?> mo110297a() {
        return this.f130976a;
    }

    public final int hashCode() {
        return mo110297a().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo110297a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C52716p) || !C52711k.m112239a((Object) mo110297a(), (Object) ((C52716p) obj).mo110297a())) {
            return false;
        }
        return true;
    }

    public C52716p(Class<?> cls, String str) {
        C52711k.m112240b(cls, "jClass");
        C52711k.m112240b(str, "moduleName");
        this.f130976a = cls;
        this.f130977b = str;
    }
}
