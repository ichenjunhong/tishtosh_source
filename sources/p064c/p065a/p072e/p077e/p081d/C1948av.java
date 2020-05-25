package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.d.av */
public final class C1948av<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6351b;

    /* renamed from: c.a.e.e.d.av$a */
    static final class C1949a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6352a;

        /* renamed from: b */
        long f6353b;

        /* renamed from: c */
        C1690c f6354c;

        public final void dispose() {
            this.f6354c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6354c.isDisposed();
        }

        public final void onComplete() {
            this.f6352a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f6352a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6354c, cVar)) {
                this.f6354c = cVar;
                this.f6352a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.f6353b != 0) {
                this.f6353b--;
            } else {
                this.f6352a.onNext(t);
            }
        }

        C1949a(C1674ab<? super T> abVar, long j) {
            this.f6352a = abVar;
            this.f6353b = j;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1949a(abVar, this.f6351b));
    }

    public C1948av(C2206z<T> zVar, long j) {
        super(zVar);
        this.f6351b = j;
    }
}
