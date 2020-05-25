package p064c.p065a.p072e.p077e.p080c;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.n */
public final class C1887n<T, U> extends C1862a<T, T> {

    /* renamed from: b */
    final C2198s<U> f6188b;

    /* renamed from: c */
    final C2198s<? extends T> f6189c = null;

    /* renamed from: c.a.e.e.c.n$a */
    static final class C1888a<T> extends AtomicReference<C1690c> implements C2196q<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C2196q<? super T> f6190a;

        public final void onComplete() {
            this.f6190a.onComplete();
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        C1888a(C2196q<? super T> qVar) {
            this.f6190a = qVar;
        }

        public final void onError(Throwable th) {
            this.f6190a.onError(th);
        }

        public final void onSuccess(T t) {
            this.f6190a.onSuccess(t);
        }
    }

    /* renamed from: c.a.e.e.c.n$b */
    static final class C1889b<T, U> extends AtomicReference<C1690c> implements C1690c, C2196q<T> {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: a */
        final C2196q<? super T> f6191a;

        /* renamed from: b */
        final C1890c<T, U> f6192b = new C1890c<>(this);

        /* renamed from: c */
        final C2198s<? extends T> f6193c;

        /* renamed from: d */
        final C1888a<T> f6194d;

        public final void dispose() {
            C1718b.dispose(this);
            C1718b.dispose(this.f6192b);
            C1888a<T> aVar = this.f6194d;
            if (aVar != null) {
                C1718b.dispose(aVar);
            }
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        /* renamed from: a */
        public final void mo6309a() {
            if (C1718b.dispose(this)) {
                if (this.f6193c == null) {
                    this.f6191a.onError(new TimeoutException());
                    return;
                }
                this.f6193c.mo6495b(this.f6194d);
            }
        }

        public final void onComplete() {
            C1718b.dispose(this.f6192b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6191a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            C1718b.dispose(this.f6192b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6191a.onError(th);
            } else {
                C2150a.m6492a(th);
            }
        }

        public final void onSuccess(T t) {
            C1718b.dispose(this.f6192b);
            if (getAndSet(C1718b.DISPOSED) != C1718b.DISPOSED) {
                this.f6191a.onSuccess(t);
            }
        }

        C1889b(C2196q<? super T> qVar, C2198s<? extends T> sVar) {
            C1888a<T> aVar;
            this.f6191a = qVar;
            this.f6193c = sVar;
            if (sVar != null) {
                aVar = new C1888a<>(qVar);
            } else {
                aVar = null;
            }
            this.f6194d = aVar;
        }
    }

    /* renamed from: c.a.e.e.c.n$c */
    static final class C1890c<T, U> extends AtomicReference<C1690c> implements C2196q<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C1889b<T, U> f6195a;

        public final void onComplete() {
            this.f6195a.mo6309a();
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        C1890c(C1889b<T, U> bVar) {
            this.f6195a = bVar;
        }

        public final void onSuccess(Object obj) {
            this.f6195a.mo6309a();
        }

        public final void onError(Throwable th) {
            C1889b<T, U> bVar = this.f6195a;
            if (C1718b.dispose(bVar)) {
                bVar.f6191a.onError(th);
            } else {
                C2150a.m6492a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        C1889b bVar = new C1889b(qVar, this.f6189c);
        qVar.onSubscribe(bVar);
        this.f6188b.mo6495b(bVar.f6192b);
        this.f6137a.mo6495b(bVar);
    }

    public C1887n(C2198s<T> sVar, C2198s<U> sVar2, C2198s<? extends T> sVar3) {
        super(sVar);
        this.f6188b = sVar2;
    }
}
