package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.m */
public final class C2006m<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1710e<? super T> f6561b;

    /* renamed from: c */
    final C1710e<? super Throwable> f6562c;

    /* renamed from: d */
    final C1706a f6563d;

    /* renamed from: e */
    final C1706a f6564e;

    /* renamed from: c.a.e.e.d.m$a */
    static final class C2007a<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6565a;

        /* renamed from: b */
        final C1710e<? super T> f6566b;

        /* renamed from: c */
        final C1710e<? super Throwable> f6567c;

        /* renamed from: d */
        final C1706a f6568d;

        /* renamed from: e */
        final C1706a f6569e;

        /* renamed from: f */
        C1690c f6570f;

        /* renamed from: g */
        boolean f6571g;

        public final void dispose() {
            this.f6570f.dispose();
        }

        public final boolean isDisposed() {
            return this.f6570f.isDisposed();
        }

        public final void onComplete() {
            if (!this.f6571g) {
                try {
                    this.f6568d.mo6199a();
                    this.f6571g = true;
                    this.f6565a.onComplete();
                    try {
                        this.f6569e.mo6199a();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C2150a.m6492a(th);
                    }
                } catch (Throwable th2) {
                    C1700b.m6017b(th2);
                    onError(th2);
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6570f, cVar)) {
                this.f6570f = cVar;
                this.f6565a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.f6571g) {
                try {
                    this.f6566b.accept(t);
                    this.f6565a.onNext(t);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f6570f.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f6571g) {
                C2150a.m6492a(th);
                return;
            }
            this.f6571g = true;
            try {
                this.f6567c.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                th = new C1695a(th, th2);
            }
            this.f6565a.onError(th);
            try {
                this.f6569e.mo6199a();
            } catch (Throwable th3) {
                C1700b.m6017b(th3);
                C2150a.m6492a(th3);
            }
        }

        C2007a(C1674ab<? super T> abVar, C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
            this.f6565a = abVar;
            this.f6566b = eVar;
            this.f6567c = eVar2;
            this.f6568d = aVar;
            this.f6569e = aVar2;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2206z zVar = this.f6202a;
        C2007a aVar = new C2007a(abVar, this.f6561b, this.f6562c, this.f6563d, this.f6564e);
        zVar.mo6314a(aVar);
    }

    public C2006m(C2206z<T> zVar, C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
        super(zVar);
        this.f6561b = eVar;
        this.f6562c = eVar2;
        this.f6563d = aVar;
        this.f6564e = aVar2;
    }
}
