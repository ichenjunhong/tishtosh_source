package p064c.p065a.p072e.p077e.p080c;

import p064c.p065a.C2196q;
import p064c.p065a.C2198s;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.k */
public final class C1879k<T> extends C1862a<T, T> {

    /* renamed from: b */
    final C1710e<? super C1690c> f6170b;

    /* renamed from: c */
    final C1710e<? super T> f6171c;

    /* renamed from: d */
    final C1710e<? super Throwable> f6172d;

    /* renamed from: e */
    final C1706a f6173e;

    /* renamed from: f */
    final C1706a f6174f;

    /* renamed from: g */
    final C1706a f6175g;

    /* renamed from: c.a.e.e.c.k$a */
    static final class C1880a<T> implements C1690c, C2196q<T> {

        /* renamed from: a */
        final C2196q<? super T> f6176a;

        /* renamed from: b */
        final C1879k<T> f6177b;

        /* renamed from: c */
        C1690c f6178c;

        public final boolean isDisposed() {
            return this.f6178c.isDisposed();
        }

        /* renamed from: a */
        private void m6188a() {
            try {
                this.f6177b.f6174f.mo6199a();
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
        }

        public final void dispose() {
            try {
                this.f6177b.f6175g.mo6199a();
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
            this.f6178c.dispose();
            this.f6178c = C1718b.DISPOSED;
        }

        public final void onComplete() {
            if (this.f6178c != C1718b.DISPOSED) {
                try {
                    this.f6177b.f6173e.mo6199a();
                    this.f6178c = C1718b.DISPOSED;
                    this.f6176a.onComplete();
                    m6188a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    m6189a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f6178c == C1718b.DISPOSED) {
                C2150a.m6492a(th);
            } else {
                m6189a(th);
            }
        }

        /* renamed from: a */
        private void m6189a(Throwable th) {
            try {
                this.f6177b.f6172d.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                th = new C1695a(th, th2);
            }
            this.f6178c = C1718b.DISPOSED;
            this.f6176a.onError(th);
            m6188a();
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6178c, cVar)) {
                try {
                    this.f6177b.f6170b.accept(cVar);
                    this.f6178c = cVar;
                    this.f6176a.onSubscribe(this);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    cVar.dispose();
                    this.f6178c = C1718b.DISPOSED;
                    C1719c.error(th, this.f6176a);
                }
            }
        }

        public final void onSuccess(T t) {
            if (this.f6178c != C1718b.DISPOSED) {
                try {
                    this.f6177b.f6171c.accept(t);
                    this.f6178c = C1718b.DISPOSED;
                    this.f6176a.onSuccess(t);
                    m6188a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    m6189a(th);
                }
            }
        }

        C1880a(C2196q<? super T> qVar, C1879k<T> kVar) {
            this.f6176a = qVar;
            this.f6177b = kVar;
        }
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        this.f6137a.mo6495b(new C1880a(qVar, this));
    }

    public C1879k(C2198s<T> sVar, C1710e<? super C1690c> eVar, C1710e<? super T> eVar2, C1710e<? super Throwable> eVar3, C1706a aVar, C1706a aVar2, C1706a aVar3) {
        super(sVar);
        this.f6170b = eVar;
        this.f6171c = eVar2;
        this.f6172d = eVar3;
        this.f6173e = aVar;
        this.f6174f = aVar2;
        this.f6175g = aVar3;
    }
}
