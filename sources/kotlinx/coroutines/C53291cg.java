package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.cg */
public final class C53291cg {

    /* renamed from: a */
    static final ThreadLocal<C53249ba> f131915a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C53291cg f131916b = new C53291cg();

    private C53291cg() {
    }

    /* renamed from: b */
    public static C53249ba m113270b() {
        return (C53249ba) f131915a.get();
    }

    /* renamed from: a */
    public static C53249ba m113269a() {
        C53249ba baVar = (C53249ba) f131915a.get();
        if (baVar != null) {
            return baVar;
        }
        C53249ba a = C53254bc.m113164a();
        f131915a.set(a);
        return a;
    }
}
