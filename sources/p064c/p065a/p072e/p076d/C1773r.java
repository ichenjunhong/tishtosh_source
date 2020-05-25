package p064c.p065a.p072e.p076d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.d.r */
public final class C1773r<T> implements C1683ag<T> {

    /* renamed from: a */
    final AtomicReference<C1690c> f5903a;

    /* renamed from: b */
    final C1683ag<? super T> f5904b;

    public final void onError(Throwable th) {
        this.f5904b.onError(th);
    }

    public final void onSubscribe(C1690c cVar) {
        C1718b.replace(this.f5903a, cVar);
    }

    public final void onSuccess(T t) {
        this.f5904b.onSuccess(t);
    }

    public C1773r(AtomicReference<C1690c> atomicReference, C1683ag<? super T> agVar) {
        this.f5903a = atomicReference;
        this.f5904b = agVar;
    }
}
