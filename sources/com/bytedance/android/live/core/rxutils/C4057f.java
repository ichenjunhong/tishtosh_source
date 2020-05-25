package com.bytedance.android.live.core.rxutils;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.core.rxutils.f */
public final class C4057f<T> extends AtomicReference<C1690c> implements C1674ab<T>, C1690c {

    /* renamed from: a */
    private final C1674ab<T> f11206a;

    /* renamed from: b */
    private final C52670a<C52860x> f11207b;

    public final void onComplete() {
        this.f11206a.onComplete();
    }

    public final void onError(Throwable th) {
        C52711k.m112240b(th, "p0");
        this.f11206a.onError(th);
    }

    public final void onNext(T t) {
        this.f11206a.onNext(t);
    }

    public final boolean isDisposed() {
        if (((C1690c) get()) == C1718b.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        C1718b bVar = C1718b.DISPOSED;
        if (((C1690c) get()) != bVar) {
            C1690c cVar = (C1690c) getAndSet(bVar);
            if (cVar != bVar) {
                if (cVar != null) {
                    cVar.dispose();
                }
                this.f11207b.invoke();
            }
        }
    }

    public final void onSubscribe(C1690c cVar) {
        C52711k.m112240b(cVar, "d");
        if (!compareAndSet(null, cVar)) {
            cVar.dispose();
        } else {
            this.f11206a.onSubscribe(cVar);
        }
    }

    public C4057f(C1674ab<T> abVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(abVar, "downstream");
        C52711k.m112240b(aVar, "doOnDispose");
        this.f11206a = abVar;
        this.f11207b = aVar;
    }

    public /* synthetic */ C4057f(C1674ab abVar, C52670a aVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            aVar = C40581.f11208a;
        }
        this(abVar, aVar);
    }
}
