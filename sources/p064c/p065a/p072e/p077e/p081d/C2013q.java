package p064c.p065a.p072e.p077e.p081d;

import java.util.NoSuchElementException;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p075c.C1749c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.q */
public final class C2013q<T> extends C1680ad<T> implements C1749c<T> {

    /* renamed from: a */
    final C2206z<T> f6591a;

    /* renamed from: b */
    final long f6592b;

    /* renamed from: c */
    final T f6593c = null;

    /* renamed from: c.a.e.e.d.q$a */
    static final class C2014a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1683ag<? super T> f6594a;

        /* renamed from: b */
        final long f6595b;

        /* renamed from: c */
        final T f6596c;

        /* renamed from: d */
        C1690c f6597d;

        /* renamed from: e */
        long f6598e;

        /* renamed from: f */
        boolean f6599f;

        public final void dispose() {
            this.f6597d.dispose();
        }

        public final boolean isDisposed() {
            return this.f6597d.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6599f) {
                this.f6599f = true;
                T t = this.f6596c;
                if (t != null) {
                    this.f6594a.onSuccess(t);
                    return;
                }
                this.f6594a.onError(new NoSuchElementException());
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6597d, cVar)) {
                this.f6597d = cVar;
                this.f6594a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6599f) {
                C2150a.m6492a(th);
                return;
            }
            this.f6599f = true;
            this.f6594a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6599f) {
                long j = this.f6598e;
                if (j == this.f6595b) {
                    this.f6599f = true;
                    this.f6597d.dispose();
                    this.f6594a.onSuccess(t);
                    return;
                }
                this.f6598e = j + 1;
            }
        }

        C2014a(C1683ag<? super T> agVar, long j, T t) {
            this.f6594a = agVar;
            this.f6595b = j;
            this.f6596c = t;
        }
    }

    public final C2201v<T> cz_() {
        C2009o oVar = new C2009o(this.f6591a, this.f6592b, this.f6593c, true);
        return C2150a.m6486a((C2201v<T>) oVar);
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6591a.mo6314a(new C2014a(agVar, this.f6592b, this.f6593c));
    }

    public C2013q(C2206z<T> zVar, long j, T t) {
        this.f6591a = zVar;
        this.f6592b = j;
    }
}
