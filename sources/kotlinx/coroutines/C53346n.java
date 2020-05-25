package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.n */
public final class C53346n extends C53267bn<C53263bl> {

    /* renamed from: a */
    public final C53343k<?> f131980a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildContinuation[");
        sb.append(this.f131980a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        this.f131980a.mo110936a(this.f131980a.mo110886a(this.f131894b));
    }

    public C53346n(C53263bl blVar, C53343k<?> kVar) {
        C52711k.m112240b(blVar, "parent");
        C52711k.m112240b(kVar, "child");
        super(blVar);
        this.f131980a = kVar;
    }
}
