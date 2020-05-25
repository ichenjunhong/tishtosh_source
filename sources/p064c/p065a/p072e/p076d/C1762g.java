package p064c.p065a.p072e.p076d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1705d;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p070c.C1702d;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.g */
public final class C1762g extends AtomicReference<C1690c> implements C1690c, C1705d, C1710e<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: a */
    final C1710e<? super Throwable> f5878a;

    /* renamed from: b */
    final C1706a f5879b;

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f5878a != this) {
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

    public final void onComplete() {
        try {
            this.f5879b.mo6199a();
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
        }
        lazySet(C1718b.DISPOSED);
    }

    public final void onSubscribe(C1690c cVar) {
        C1718b.setOnce(this, cVar);
    }

    public C1762g(C1706a aVar) {
        this.f5878a = this;
        this.f5879b = aVar;
    }

    public final void accept(Throwable th) {
        C2150a.m6492a((Throwable) new C1702d(th));
    }

    public final void onError(Throwable th) {
        try {
            this.f5878a.accept(th);
        } catch (Throwable th2) {
            C1700b.m6017b(th2);
            C2150a.m6492a(th2);
        }
        lazySet(C1718b.DISPOSED);
    }

    public C1762g(C1710e<? super Throwable> eVar, C1706a aVar) {
        this.f5878a = eVar;
        this.f5879b = aVar;
    }
}
