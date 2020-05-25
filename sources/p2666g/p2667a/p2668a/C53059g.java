package p2666g.p2667a.p2668a;

import java.lang.reflect.Type;
import p064c.p065a.C1663a;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p2666g.C53061b;
import p2666g.C53068c;

/* renamed from: g.a.a.g */
final class C53059g<R> implements C53068c<R, Object> {

    /* renamed from: a */
    private final Type f131543a;

    /* renamed from: b */
    private final C1675ac f131544b;

    /* renamed from: c */
    private final boolean f131545c;

    /* renamed from: d */
    private final boolean f131546d;

    /* renamed from: e */
    private final boolean f131547e;

    /* renamed from: f */
    private final boolean f131548f;

    /* renamed from: g */
    private final boolean f131549g;

    /* renamed from: h */
    private final boolean f131550h;

    /* renamed from: i */
    private final boolean f131551i;

    /* renamed from: a */
    public final Type mo110592a() {
        return this.f131543a;
    }

    /* renamed from: a */
    public final Object mo110591a(C53061b<R> bVar) {
        C2201v vVar;
        C2201v vVar2;
        if (this.f131545c) {
            vVar = new C53051b(bVar);
        } else {
            vVar = new C53053c(bVar);
        }
        if (this.f131546d) {
            vVar2 = new C53057f(vVar);
        } else if (this.f131547e) {
            vVar2 = new C53049a(vVar);
        } else {
            vVar2 = vVar;
        }
        if (this.f131544b != null) {
            vVar2 = vVar2.mo6529b(this.f131544b);
        }
        if (this.f131548f) {
            return vVar2.mo6508a(C1663a.LATEST);
        }
        if (this.f131549g) {
            return vVar2.mo6550i();
        }
        if (this.f131550h) {
            return vVar2.mo6549h();
        }
        if (this.f131551i) {
            return vVar2.mo6546f();
        }
        return vVar2;
    }

    C53059g(Type type, C1675ac acVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f131543a = type;
        this.f131544b = acVar;
        this.f131545c = z;
        this.f131546d = z2;
        this.f131547e = z3;
        this.f131548f = z4;
        this.f131549g = z5;
        this.f131550h = z6;
        this.f131551i = z7;
    }
}
