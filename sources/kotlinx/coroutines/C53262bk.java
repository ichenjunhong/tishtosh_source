package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bk */
final class C53262bk extends C53271br<C53263bl> {

    /* renamed from: a */
    private final C52671b<Throwable, C52860x> f131891a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCompletion[");
        sb.append(C53203ai.m113030b(this));
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        this.f131891a.invoke(th);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    public C53262bk(C53263bl blVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(blVar, "job");
        C52711k.m112240b(bVar, "handler");
        super(blVar);
        this.f131891a = bVar;
    }
}
