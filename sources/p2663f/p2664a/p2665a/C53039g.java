package p2663f.p2664a.p2665a;

/* renamed from: f.a.a.g */
final class C53039g<T> implements C53040h<T>, C53041i<T> {

    /* renamed from: a */
    private final C53037e f131522a;

    /* renamed from: b */
    private final Class<? extends T> f131523b;

    /* renamed from: c */
    private C53035c<T, ?>[] f131524c;

    @SafeVarargs
    /* renamed from: a */
    public final C53040h<T> mo110586a(C53035c<T, ?>... cVarArr) {
        this.f131524c = cVarArr;
        return this;
    }

    /* renamed from: a */
    public final void mo110587a(C53036d<T> dVar) {
        for (C53035c<T, ?> a : this.f131524c) {
            this.f131522a.f131518b.mo110582a(this.f131523b, a, dVar);
        }
    }

    C53039g(C53037e eVar, Class<? extends T> cls) {
        this.f131523b = cls;
        this.f131522a = eVar;
    }
}
