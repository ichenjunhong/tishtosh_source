package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.e.f */
public final class C2041f<T, R> extends C1680ad<R> {

    /* renamed from: a */
    final C1685ai<? extends T> f6672a;

    /* renamed from: b */
    final C1711f<? super T, ? extends C1685ai<? extends R>> f6673b;

    /* renamed from: c.a.e.e.e.f$a */
    static final class C2042a<T, R> extends AtomicReference<C1690c> implements C1683ag<T>, C1690c {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: a */
        final C1683ag<? super R> f6674a;

        /* renamed from: b */
        final C1711f<? super T, ? extends C1685ai<? extends R>> f6675b;

        /* renamed from: c.a.e.e.e.f$a$a */
        static final class C2043a<R> implements C1683ag<R> {

            /* renamed from: a */
            final AtomicReference<C1690c> f6676a;

            /* renamed from: b */
            final C1683ag<? super R> f6677b;

            public final void onError(Throwable th) {
                this.f6677b.onError(th);
            }

            public final void onSubscribe(C1690c cVar) {
                C1718b.replace(this.f6676a, cVar);
            }

            public final void onSuccess(R r) {
                this.f6677b.onSuccess(r);
            }

            C2043a(AtomicReference<C1690c> atomicReference, C1683ag<? super R> agVar) {
                this.f6676a = atomicReference;
                this.f6677b = agVar;
            }
        }

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onError(Throwable th) {
            this.f6674a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar)) {
                this.f6674a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                C1685ai aiVar = (C1685ai) C1745b.m6050a(this.f6675b.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    aiVar.mo6159b(new C2043a(this, this.f6674a));
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6674a.onError(th);
            }
        }

        C2042a(C1683ag<? super R> agVar, C1711f<? super T, ? extends C1685ai<? extends R>> fVar) {
            this.f6674a = agVar;
            this.f6675b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super R> agVar) {
        this.f6672a.mo6159b(new C2042a(agVar, this.f6673b));
    }

    public C2041f(C1685ai<? extends T> aiVar, C1711f<? super T, ? extends C1685ai<? extends R>> fVar) {
        this.f6673b = fVar;
        this.f6672a = aiVar;
    }
}
