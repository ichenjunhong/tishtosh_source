package p064c.p065a.p072e.p076d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.m */
public final class C1768m<T> extends AtomicReference<C1690c> implements C1674ab<T>, C1690c {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final C1710e<? super T> f5893a;

    /* renamed from: b */
    final C1710e<? super Throwable> f5894b;

    /* renamed from: c */
    final C1706a f5895c;

    /* renamed from: d */
    final C1710e<? super C1690c> f5896d;

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.f5894b != C1723a.f5847f) {
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
        if (!isDisposed()) {
            lazySet(C1718b.DISPOSED);
            try {
                this.f5895c.mo6199a();
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f5893a.accept(t);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                ((C1690c) get()).dispose();
                onError(th);
            }
        }
    }

    public final void onSubscribe(C1690c cVar) {
        if (C1718b.setOnce(this, cVar)) {
            try {
                this.f5896d.accept(this);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                cVar.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C1718b.DISPOSED);
            try {
                this.f5894b.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C2150a.m6492a((Throwable) new C1695a(th, th2));
            }
        } else {
            C2150a.m6492a(th);
        }
    }

    public C1768m(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1710e<? super C1690c> eVar3) {
        this.f5893a = eVar;
        this.f5894b = eVar2;
        this.f5895c = aVar;
        this.f5896d = eVar3;
    }
}
