package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1722f;

/* renamed from: c.a.e.e.d.ay */
public final class C1955ay<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C2206z<? extends T> f6365b;

    /* renamed from: c.a.e.e.d.ay$a */
    static final class C1956a<T> implements C1674ab<T> {

        /* renamed from: a */
        final C1674ab<? super T> f6366a;

        /* renamed from: b */
        final C2206z<? extends T> f6367b;

        /* renamed from: c */
        final C1722f f6368c = new C1722f();

        /* renamed from: d */
        boolean f6369d = true;

        public final void onComplete() {
            if (this.f6369d) {
                this.f6369d = false;
                this.f6367b.mo6314a(this);
                return;
            }
            this.f6366a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f6366a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6368c.update(cVar);
        }

        public final void onNext(T t) {
            if (this.f6369d) {
                this.f6369d = false;
            }
            this.f6366a.onNext(t);
        }

        C1956a(C1674ab<? super T> abVar, C2206z<? extends T> zVar) {
            this.f6366a = abVar;
            this.f6367b = zVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1956a aVar = new C1956a(abVar, this.f6365b);
        abVar.onSubscribe(aVar.f6368c);
        this.f6202a.mo6314a(aVar);
    }

    public C1955ay(C2206z<T> zVar, C2206z<? extends T> zVar2) {
        super(zVar);
        this.f6365b = zVar2;
    }
}
