package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2133i;

/* renamed from: c.a.e.e.d.ba */
public final class C1965ba<T, U> extends C1896a<T, T> {

    /* renamed from: b */
    final C2206z<? extends U> f6411b;

    /* renamed from: c.a.e.e.d.ba$a */
    static final class C1966a<T, U> extends AtomicInteger implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: a */
        final C1674ab<? super T> f6412a;

        /* renamed from: b */
        final AtomicReference<C1690c> f6413b = new AtomicReference<>();

        /* renamed from: c */
        final C1967a f6414c = new C1967a<>();

        /* renamed from: d */
        final C2126c f6415d = new C2126c();

        /* renamed from: c.a.e.e.d.ba$a$a */
        final class C1967a extends AtomicReference<C1690c> implements C1674ab<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public final void onComplete() {
                C1966a.this.mo6339a();
            }

            public final void onSubscribe(C1690c cVar) {
                C1718b.setOnce(this, cVar);
            }

            C1967a() {
            }

            public final void onError(Throwable th) {
                C1966a aVar = C1966a.this;
                C1718b.dispose(aVar.f6413b);
                C2133i.m6425a(aVar.f6412a, th, (AtomicInteger) aVar, aVar.f6415d);
            }

            public final void onNext(U u) {
                C1718b.dispose(this);
                C1966a.this.mo6339a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6339a() {
            C1718b.dispose(this.f6413b);
            C2133i.m6426a(this.f6412a, this, this.f6415d);
        }

        public final void dispose() {
            C1718b.dispose(this.f6413b);
            C1718b.dispose(this.f6414c);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) this.f6413b.get());
        }

        public final void onComplete() {
            C1718b.dispose(this.f6414c);
            C2133i.m6426a(this.f6412a, this, this.f6415d);
        }

        public final void onNext(T t) {
            C2133i.m6424a(this.f6412a, t, (AtomicInteger) this, this.f6415d);
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this.f6413b, cVar);
        }

        public final void onError(Throwable th) {
            C1718b.dispose(this.f6414c);
            C2133i.m6425a(this.f6412a, th, (AtomicInteger) this, this.f6415d);
        }

        C1966a(C1674ab<? super T> abVar) {
            this.f6412a = abVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1966a aVar = new C1966a(abVar);
        abVar.onSubscribe(aVar);
        this.f6411b.mo6314a(aVar.f6414c);
        this.f6202a.mo6314a(aVar);
    }

    public C1965ba(C2206z<T> zVar, C2206z<? extends U> zVar2) {
        super(zVar);
        this.f6411b = zVar2;
    }
}
