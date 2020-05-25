package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.p */
public final class C53348p extends C53267bn<C53272bs> implements C53347o {

    /* renamed from: a */
    public final C53349q f131981a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildHandle[");
        sb.append(this.f131981a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        this.f131981a.mo110877a((C53285ca) this.f131894b);
    }

    /* renamed from: b */
    public final boolean mo110894b(Throwable th) {
        C52711k.m112240b(th, "cause");
        return ((C53272bs) this.f131894b).mo110881c(th);
    }

    public C53348p(C53272bs bsVar, C53349q qVar) {
        C52711k.m112240b(bsVar, "parent");
        C52711k.m112240b(qVar, "childJob");
        super(bsVar);
        this.f131981a = qVar;
    }
}
