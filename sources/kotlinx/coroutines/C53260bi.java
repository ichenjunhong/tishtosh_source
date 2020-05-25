package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bi */
final class C53260bi extends C53302h {

    /* renamed from: a */
    private final C52671b<Throwable, C52860x> f131888a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCancel[");
        sb.append(C53203ai.m113030b(this.f131888a));
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo110795a(Throwable th) {
        this.f131888a.invoke(th);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110795a((Throwable) obj);
        return C52860x.f131107a;
    }

    public C53260bi(C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(bVar, "handler");
        this.f131888a = bVar;
    }
}
