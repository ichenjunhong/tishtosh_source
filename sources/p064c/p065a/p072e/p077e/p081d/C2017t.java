package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p076d.C1756a;

/* renamed from: c.a.e.e.d.t */
public final class C2017t<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1715j<? super T> f6602b;

    /* renamed from: c.a.e.e.d.t$a */
    static final class C2018a<T> extends C1756a<T, T> {

        /* renamed from: f */
        final C1715j<? super T> f6603f;

        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.f5867c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f6603f.mo6207a(poll));
            return poll;
        }

        public final int requestFusion(int i) {
            return mo6231a(i);
        }

        public final void onNext(T t) {
            if (this.f5869e == 0) {
                try {
                    if (this.f6603f.mo6207a(t)) {
                        this.f5865a.onNext(t);
                    }
                } catch (Throwable th) {
                    mo6232a(th);
                }
            } else {
                this.f5865a.onNext(null);
            }
        }

        C2018a(C1674ab<? super T> abVar, C1715j<? super T> jVar) {
            super(abVar);
            this.f6603f = jVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C2018a(abVar, this.f6602b));
    }

    public C2017t(C2206z<T> zVar, C1715j<? super T> jVar) {
        super(zVar);
        this.f6602b = jVar;
    }
}
