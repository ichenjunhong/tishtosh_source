package p064c.p065a.p072e.p076d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.h */
public final class C1763h<T> extends AtomicReference<C1690c> implements C1683ag<T>, C1690c {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: a */
    final C1710e<? super T> f5880a;

    /* renamed from: b */
    final C1710e<? super Throwable> f5881b;

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f5881b != C1723a.f5847f) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        if (get() == C1718b.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C1690c cVar) {
        C1718b.setOnce(this, cVar);
    }

    public final void onSuccess(T t) {
        lazySet(C1718b.DISPOSED);
        try {
            this.f5880a.accept(t);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
        }
    }

    public final void onError(Throwable th) {
        lazySet(C1718b.DISPOSED);
        try {
            this.f5881b.accept(th);
        } catch (Throwable th2) {
            C1700b.m6017b(th2);
            C2150a.m6492a((Throwable) new C1695a(th, th2));
        }
    }

    public C1763h(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
        this.f5880a = eVar;
        this.f5881b = eVar2;
    }
}
