package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.b */
public final class C1863b<T> extends AtomicReference<C1690c> implements C1690c, C2196q<T> {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: a */
    final C1710e<? super T> f6138a;

    /* renamed from: b */
    final C1710e<? super Throwable> f6139b;

    /* renamed from: c */
    final C1706a f6140c;

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f6139b != C1723a.f5847f) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        return C1718b.isDisposed((C1690c) get());
    }

    public final void onComplete() {
        lazySet(C1718b.DISPOSED);
        try {
            this.f6140c.mo6199a();
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
        }
    }

    public final void onSubscribe(C1690c cVar) {
        C1718b.setOnce(this, cVar);
    }

    public final void onSuccess(T t) {
        lazySet(C1718b.DISPOSED);
        try {
            this.f6138a.accept(t);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
        }
    }

    public final void onError(Throwable th) {
        lazySet(C1718b.DISPOSED);
        try {
            this.f6139b.accept(th);
        } catch (Throwable th2) {
            C1700b.m6017b(th2);
            C2150a.m6492a((Throwable) new C1695a(th, th2));
        }
    }

    public C1863b(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar) {
        this.f6138a = eVar;
        this.f6139b = eVar2;
        this.f6140c = aVar;
    }
}
