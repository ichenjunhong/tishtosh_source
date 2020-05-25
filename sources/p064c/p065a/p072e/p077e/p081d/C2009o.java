package p064c.p065a.p072e.p077e.p081d;

import java.util.NoSuchElementException;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.o */
public final class C2009o<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6574b;

    /* renamed from: c */
    final T f6575c;

    /* renamed from: d */
    final boolean f6576d;

    /* renamed from: c.a.e.e.d.o$a */
    static final class C2010a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6577a;

        /* renamed from: b */
        final long f6578b;

        /* renamed from: c */
        final T f6579c;

        /* renamed from: d */
        final boolean f6580d;

        /* renamed from: e */
        C1690c f6581e;

        /* renamed from: f */
        long f6582f;

        /* renamed from: g */
        boolean f6583g;

        public final void dispose() {
            this.f6581e.dispose();
        }

        public final boolean isDisposed() {
            return this.f6581e.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6583g) {
                this.f6583g = true;
                T t = this.f6579c;
                if (t != null || !this.f6580d) {
                    if (t != null) {
                        this.f6577a.onNext(t);
                    }
                    this.f6577a.onComplete();
                } else {
                    this.f6577a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6581e, cVar)) {
                this.f6581e = cVar;
                this.f6577a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6583g) {
                C2150a.m6492a(th);
                return;
            }
            this.f6583g = true;
            this.f6577a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f6583g) {
                long j = this.f6582f;
                if (j == this.f6578b) {
                    this.f6583g = true;
                    this.f6581e.dispose();
                    this.f6577a.onNext(t);
                    this.f6577a.onComplete();
                    return;
                }
                this.f6582f = j + 1;
            }
        }

        C2010a(C1674ab<? super T> abVar, long j, T t, boolean z) {
            this.f6577a = abVar;
            this.f6578b = j;
            this.f6579c = t;
            this.f6580d = z;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2206z zVar = this.f6202a;
        C2010a aVar = new C2010a(abVar, this.f6574b, this.f6575c, this.f6576d);
        zVar.mo6314a(aVar);
    }

    public C2009o(C2206z<T> zVar, long j, T t, boolean z) {
        super(zVar);
        this.f6574b = j;
        this.f6575c = t;
        this.f6576d = z;
    }
}
