package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.d.ac */
public final class C1902ac<T> extends C1896a<T, T> {

    /* renamed from: c.a.e.e.d.ac$a */
    static final class C1903a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6227a;

        /* renamed from: b */
        C1690c f6228b;

        public final void dispose() {
            this.f6228b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6228b.isDisposed();
        }

        public final void onComplete() {
            this.f6227a.onComplete();
        }

        C1903a(C1674ab<? super T> abVar) {
            this.f6227a = abVar;
        }

        public final void onError(Throwable th) {
            this.f6227a.onError(th);
        }

        public final void onNext(T t) {
            this.f6227a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6228b, cVar)) {
                this.f6228b = cVar;
                this.f6227a.onSubscribe(this);
            }
        }
    }

    public C1902ac(C2206z<T> zVar) {
        super(zVar);
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1903a(abVar));
    }
}
