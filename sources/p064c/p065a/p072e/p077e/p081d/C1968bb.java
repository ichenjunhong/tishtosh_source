package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.bb */
public final class C1968bb<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1715j<? super T> f6417b;

    /* renamed from: c.a.e.e.d.bb$a */
    static final class C1969a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6418a;

        /* renamed from: b */
        final C1715j<? super T> f6419b;

        /* renamed from: c */
        C1690c f6420c;

        /* renamed from: d */
        boolean f6421d;

        public final void dispose() {
            this.f6420c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6420c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6421d) {
                this.f6421d = true;
                this.f6418a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6420c, cVar)) {
                this.f6420c = cVar;
                this.f6418a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (!this.f6421d) {
                this.f6421d = true;
                this.f6418a.onError(th);
                return;
            }
            C2150a.m6492a(th);
        }

        public final void onNext(T t) {
            if (!this.f6421d) {
                this.f6418a.onNext(t);
                try {
                    if (this.f6419b.mo6207a(t)) {
                        this.f6421d = true;
                        this.f6420c.dispose();
                        this.f6418a.onComplete();
                    }
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f6420c.dispose();
                    onError(th);
                }
            }
        }

        C1969a(C1674ab<? super T> abVar, C1715j<? super T> jVar) {
            this.f6418a = abVar;
            this.f6419b = jVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1969a(abVar, this.f6417b));
    }

    public C1968bb(C2206z<T> zVar, C1715j<? super T> jVar) {
        super(zVar);
        this.f6417b = jVar;
    }
}
