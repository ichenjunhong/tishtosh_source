package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2126c;
import p064c.p065a.p072e.p087j.C2133i;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;

/* renamed from: c.a.e.e.d.aq */
public final class C1934aq<T> extends C1896a<T, T> {

    /* renamed from: b */
    final C1711f<? super C2201v<Throwable>, ? extends C2206z<?>> f6314b;

    /* renamed from: c.a.e.e.d.aq$a */
    static final class C1935a<T> extends AtomicInteger implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: a */
        final C1674ab<? super T> f6315a;

        /* renamed from: b */
        final AtomicInteger f6316b = new AtomicInteger();

        /* renamed from: c */
        final C2126c f6317c = new C2126c();

        /* renamed from: d */
        final C2189f<Throwable> f6318d;

        /* renamed from: e */
        final C1936a f6319e = new C1936a<>();

        /* renamed from: f */
        final AtomicReference<C1690c> f6320f = new AtomicReference<>();

        /* renamed from: g */
        final C2206z<T> f6321g;

        /* renamed from: h */
        volatile boolean f6322h;

        /* renamed from: c.a.e.e.d.aq$a$a */
        final class C1936a extends AtomicReference<C1690c> implements C1674ab<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public final void onComplete() {
                C1935a aVar = C1935a.this;
                C1718b.dispose(aVar.f6320f);
                C2133i.m6426a(aVar.f6315a, aVar, aVar.f6317c);
            }

            public final void onSubscribe(C1690c cVar) {
                C1718b.setOnce(this, cVar);
            }

            C1936a() {
            }

            public final void onNext(Object obj) {
                C1935a.this.mo6326a();
            }

            public final void onError(Throwable th) {
                C1935a aVar = C1935a.this;
                C1718b.dispose(aVar.f6320f);
                C2133i.m6425a(aVar.f6315a, th, (AtomicInteger) aVar, aVar.f6317c);
            }
        }

        public final void dispose() {
            C1718b.dispose(this.f6320f);
            C1718b.dispose(this.f6319e);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) this.f6320f.get());
        }

        public final void onComplete() {
            C1718b.dispose(this.f6319e);
            C2133i.m6426a(this.f6315a, this, this.f6317c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6326a() {
            if (this.f6316b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f6322h) {
                        this.f6322h = true;
                        this.f6321g.mo6314a(this);
                    }
                    if (this.f6316b.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void onNext(T t) {
            C2133i.m6424a(this.f6315a, t, (AtomicInteger) this, this.f6317c);
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.replace(this.f6320f, cVar);
        }

        public final void onError(Throwable th) {
            C1718b.replace(this.f6320f, null);
            this.f6322h = false;
            this.f6318d.onNext(th);
        }

        C1935a(C1674ab<? super T> abVar, C2189f<Throwable> fVar, C2206z<T> zVar) {
            this.f6315a = abVar;
            this.f6318d = fVar;
            this.f6321g = zVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2189f n = C2180b.m6534l().mo6479n();
        try {
            C2206z zVar = (C2206z) C1745b.m6050a(this.f6314b.apply(n), "The handler returned a null ObservableSource");
            C1935a aVar = new C1935a(abVar, n, this.f6202a);
            abVar.onSubscribe(aVar);
            zVar.mo6314a(aVar.f6319e);
            aVar.mo6326a();
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, abVar);
        }
    }

    public C1934aq(C2206z<T> zVar, C1711f<? super C2201v<Throwable>, ? extends C2206z<?>> fVar) {
        super(zVar);
        this.f6314b = fVar;
    }
}
