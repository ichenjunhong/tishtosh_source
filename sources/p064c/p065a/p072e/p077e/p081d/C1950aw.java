package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.d.aw */
public final class C1950aw<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1715j<? super T> f6355b;

    /* renamed from: c.a.e.e.d.aw$a */
    static final class C1951a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6356a;

        /* renamed from: b */
        final C1715j<? super T> f6357b;

        /* renamed from: c */
        C1690c f6358c;

        /* renamed from: d */
        boolean f6359d;

        public final void dispose() {
            this.f6358c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6358c.isDisposed();
        }

        public final void onComplete() {
            this.f6356a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f6356a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6358c, cVar)) {
                this.f6358c = cVar;
                this.f6356a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.f6359d) {
                this.f6356a.onNext(t);
                return;
            }
            try {
                if (!this.f6357b.mo6207a(t)) {
                    this.f6359d = true;
                    this.f6356a.onNext(t);
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6358c.dispose();
                this.f6356a.onError(th);
            }
        }

        C1951a(C1674ab<? super T> abVar, C1715j<? super T> jVar) {
            this.f6356a = abVar;
            this.f6357b = jVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1951a(abVar, this.f6355b));
    }

    public C1950aw(C2206z<T> zVar, C1715j<? super T> jVar) {
        super(zVar);
        this.f6355b = jVar;
    }
}
