package p064c.p065a.p072e.p085h;

import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.h.c */
public final class C2114c<T> extends AtomicReference<C53696d> implements C1690c, C2177l<T>, C53696d {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final C1710e<? super T> f6857a;

    /* renamed from: b */
    final C1710e<? super Throwable> f6858b;

    /* renamed from: c */
    final C1706a f6859c;

    /* renamed from: d */
    final C1710e<? super C53696d> f6860d;

    public final void cancel() {
        C2122f.cancel(this);
    }

    public final void dispose() {
        cancel();
    }

    public final boolean hasCustomOnError() {
        if (this.f6858b != C1723a.f5847f) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        if (get() == C2122f.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (get() != C2122f.CANCELLED) {
            lazySet(C2122f.CANCELLED);
            try {
                this.f6859c.mo6199a();
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
        }
    }

    public final void request(long j) {
        ((C53696d) get()).request(j);
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f6857a.accept(t);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                ((C53696d) get()).cancel();
                onError(th);
            }
        }
    }

    public final void onSubscribe(C53696d dVar) {
        if (C2122f.setOnce(this, dVar)) {
            try {
                this.f6860d.accept(this);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != C2122f.CANCELLED) {
            lazySet(C2122f.CANCELLED);
            try {
                this.f6858b.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C2150a.m6492a((Throwable) new C1695a(th, th2));
            }
        } else {
            C2150a.m6492a(th);
        }
    }

    public C2114c(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1710e<? super C53696d> eVar3) {
        this.f6857a = eVar;
        this.f6858b = eVar2;
        this.f6859c = aVar;
        this.f6860d = eVar3;
    }
}
