package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;

/* renamed from: c.a.e.e.d.ad */
public final class C1904ad<T> extends C1896a<T, T> {

    /* renamed from: c.a.e.e.d.ad$a */
    static final class C1905a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6229a;

        /* renamed from: b */
        C1690c f6230b;

        public final void onNext(T t) {
        }

        public final void dispose() {
            this.f6230b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6230b.isDisposed();
        }

        public final void onComplete() {
            this.f6229a.onComplete();
        }

        C1905a(C1674ab<? super T> abVar) {
            this.f6229a = abVar;
        }

        public final void onError(Throwable th) {
            this.f6229a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6230b = cVar;
            this.f6229a.onSubscribe(this);
        }
    }

    public C1904ad(C2206z<T> zVar) {
        super(zVar);
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1905a(abVar));
    }
}
