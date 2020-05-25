package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.v */
public final class C2022v<T, R> extends C1896a<T, R> {

    /* renamed from: b */
    final C1711f<? super T, ? extends Iterable<? extends R>> f6631b;

    /* renamed from: c.a.e.e.d.v$a */
    static final class C2023a<T, R> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super R> f6632a;

        /* renamed from: b */
        final C1711f<? super T, ? extends Iterable<? extends R>> f6633b;

        /* renamed from: c */
        C1690c f6634c;

        public final boolean isDisposed() {
            return this.f6634c.isDisposed();
        }

        public final void dispose() {
            this.f6634c.dispose();
            this.f6634c = C1718b.DISPOSED;
        }

        public final void onComplete() {
            if (this.f6634c != C1718b.DISPOSED) {
                this.f6634c = C1718b.DISPOSED;
                this.f6632a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6634c, cVar)) {
                this.f6634c = cVar;
                this.f6632a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6634c == C1718b.DISPOSED) {
                C2150a.m6492a(th);
                return;
            }
            this.f6634c = C1718b.DISPOSED;
            this.f6632a.onError(th);
        }

        public final void onNext(T t) {
            if (this.f6634c != C1718b.DISPOSED) {
                try {
                    C1674ab<? super R> abVar = this.f6632a;
                    for (Object a : (Iterable) this.f6633b.apply(t)) {
                        try {
                            try {
                                abVar.onNext(C1745b.m6050a(a, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C1700b.m6017b(th);
                                this.f6634c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C1700b.m6017b(th2);
                            this.f6634c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C1700b.m6017b(th3);
                    this.f6634c.dispose();
                    onError(th3);
                }
            }
        }

        C2023a(C1674ab<? super R> abVar, C1711f<? super T, ? extends Iterable<? extends R>> fVar) {
            this.f6632a = abVar;
            this.f6633b = fVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super R> abVar) {
        this.f6202a.mo6314a(new C2023a(abVar, this.f6631b));
    }

    public C2022v(C2206z<T> zVar, C1711f<? super T, ? extends Iterable<? extends R>> fVar) {
        super(zVar);
        this.f6631b = fVar;
    }
}
