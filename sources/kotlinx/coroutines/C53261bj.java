package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bj */
final class C53261bj extends C53267bn<C53263bl> {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f131889a = AtomicIntegerFieldUpdater.newUpdater(C53261bj.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: e */
    private final C52671b<Throwable, C52860x> f131890e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCancelling[");
        sb.append(C53203ai.m113030b(this));
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        if (f131889a.compareAndSet(this, 0, 1)) {
            this.f131890e.invoke(th);
        }
    }

    public C53261bj(C53263bl blVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(blVar, "job");
        C52711k.m112240b(bVar, "handler");
        super(blVar);
        this.f131890e = bVar;
    }
}
