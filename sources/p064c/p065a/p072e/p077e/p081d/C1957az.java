package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.az */
public final class C1957az<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6370b;

    /* renamed from: c.a.e.e.d.az$a */
    static final class C1958a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6371a;

        /* renamed from: b */
        boolean f6372b;

        /* renamed from: c */
        C1690c f6373c;

        /* renamed from: d */
        long f6374d;

        public final void dispose() {
            this.f6373c.dispose();
        }

        public final boolean isDisposed() {
            return this.f6373c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6372b) {
                this.f6372b = true;
                this.f6373c.dispose();
                this.f6371a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.f6372b) {
                C2150a.m6492a(th);
                return;
            }
            this.f6372b = true;
            this.f6373c.dispose();
            this.f6371a.onError(th);
        }

        public final void onNext(T t) {
            boolean z;
            if (!this.f6372b) {
                long j = this.f6374d;
                this.f6374d = j - 1;
                if (j > 0) {
                    if (this.f6374d == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f6371a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6373c, cVar)) {
                this.f6373c = cVar;
                if (this.f6374d == 0) {
                    this.f6372b = true;
                    cVar.dispose();
                    C1719c.complete(this.f6371a);
                    return;
                }
                this.f6371a.onSubscribe(this);
            }
        }

        C1958a(C1674ab<? super T> abVar, long j) {
            this.f6371a = abVar;
            this.f6374d = j;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f6202a.mo6314a(new C1958a(abVar, this.f6370b));
    }

    public C1957az(C2206z<T> zVar, long j) {
        super(zVar);
        this.f6370b = j;
    }
}
