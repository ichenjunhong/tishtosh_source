package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.at */
public final class C1944at<T> extends C2193n<T> {

    /* renamed from: a */
    final C2206z<T> f6339a;

    /* renamed from: c.a.e.e.d.at$a */
    static final class C1945a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C2196q<? super T> f6340a;

        /* renamed from: b */
        C1690c f6341b;

        /* renamed from: c */
        T f6342c;

        /* renamed from: d */
        boolean f6343d;

        public final void dispose() {
            this.f6341b.dispose();
        }

        public final boolean isDisposed() {
            return this.f6341b.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6343d) {
                this.f6343d = true;
                T t = this.f6342c;
                this.f6342c = null;
                if (t == null) {
                    this.f6340a.onComplete();
                } else {
                    this.f6340a.onSuccess(t);
                }
            }
        }

        C1945a(C2196q<? super T> qVar) {
            this.f6340a = qVar;
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6341b, cVar)) {
                this.f6341b = cVar;
                this.f6340a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6343d) {
                C2150a.m6492a(th);
                return;
            }
            this.f6343d = true;
            this.f6340a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6343d) {
                if (this.f6342c != null) {
                    this.f6343d = true;
                    this.f6341b.dispose();
                    this.f6340a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f6342c = t;
            }
        }
    }

    public C1944at(C2206z<T> zVar) {
        this.f6339a = zVar;
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6339a.mo6314a(new C1945a(qVar));
    }
}
