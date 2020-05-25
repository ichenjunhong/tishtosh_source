package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p075c.C1749c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.p */
public final class C2011p<T> extends C2193n<T> implements C1749c<T> {

    /* renamed from: a */
    final C2206z<T> f6584a;

    /* renamed from: b */
    final long f6585b;

    /* renamed from: c.a.e.e.d.p$a */
    static final class C2012a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C2196q<? super T> f6586a;

        /* renamed from: b */
        final long f6587b;

        /* renamed from: c */
        C1690c f6588c;

        /* renamed from: d */
        long f6589d;

        /* renamed from: e */
        boolean f6590e;

        public final void dispose() {
            this.f6588c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6588c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6590e) {
                this.f6590e = true;
                this.f6586a.onComplete();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6588c, cVar)) {
                this.f6588c = cVar;
                this.f6586a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6590e) {
                C2150a.m6492a(th);
                return;
            }
            this.f6590e = true;
            this.f6586a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6590e) {
                long j = this.f6589d;
                if (j == this.f6587b) {
                    this.f6590e = true;
                    this.f6588c.dispose();
                    this.f6586a.onSuccess(t);
                    return;
                }
                this.f6589d = j + 1;
            }
        }

        C2012a(C2196q<? super T> qVar, long j) {
            this.f6586a = qVar;
            this.f6587b = j;
        }
    }

    public final C2201v<T> cz_() {
        C2009o oVar = new C2009o(this.f6584a, this.f6585b, null, false);
        return C2150a.m6486a((C2201v<T>) oVar);
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6584a.mo6314a(new C2012a(qVar, this.f6585b));
    }

    public C2011p(C2206z<T> zVar, long j) {
        this.f6584a = zVar;
        this.f6585b = j;
    }
}
