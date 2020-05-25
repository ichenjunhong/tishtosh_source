package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2119c;
import p064c.p065a.p072e.p086i.C2121e;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p091i.C2152a;
import p064c.p065a.p091i.C2156d;
import p064c.p065a.p095m.C2192b;

/* renamed from: c.a.e.e.b.w */
public final class C1850w<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1711f<? super C2149h<Object>, ? extends C53694b<?>> f6107c;

    /* renamed from: c.a.e.e.b.w$a */
    static final class C1851a<T> extends C1853c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            mo6296a(Integer.valueOf(0));
        }

        public final void onError(Throwable th) {
            this.f6114c.cancel();
            this.f6112a.onError(th);
        }

        C1851a(C53695c<? super T> cVar, C2152a<Object> aVar, C53696d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* renamed from: c.a.e.e.b.w$b */
    static final class C1852b<T, U> extends AtomicInteger implements C2177l<Object>, C53696d {
        private static final long serialVersionUID = 2827772011130406689L;

        /* renamed from: a */
        final C53694b<T> f6108a;

        /* renamed from: b */
        final AtomicReference<C53696d> f6109b = new AtomicReference<>();

        /* renamed from: c */
        final AtomicLong f6110c = new AtomicLong();

        /* renamed from: d */
        C1853c<T, U> f6111d;

        public final void cancel() {
            C2122f.cancel(this.f6109b);
        }

        public final void onComplete() {
            this.f6111d.cancel();
            this.f6111d.f6112a.onComplete();
        }

        public final void onSubscribe(C53696d dVar) {
            C2122f.deferredSetOnce(this.f6109b, this.f6110c, dVar);
        }

        public final void request(long j) {
            C2122f.deferredRequest(this.f6109b, this.f6110c, j);
        }

        public final void onError(Throwable th) {
            this.f6111d.cancel();
            this.f6111d.f6112a.onError(th);
        }

        C1852b(C53694b<T> bVar) {
            this.f6108a = bVar;
        }

        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f6109b.get() != C2122f.CANCELLED) {
                    this.f6108a.mo336a(this.f6111d);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: c.a.e.e.b.w$c */
    static abstract class C1853c<T, U> extends C2121e implements C2177l<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* renamed from: a */
        protected final C53695c<? super T> f6112a;

        /* renamed from: b */
        protected final C2152a<U> f6113b;

        /* renamed from: c */
        protected final C53696d f6114c;

        /* renamed from: l */
        private long f6115l;

        public final void cancel() {
            super.cancel();
            this.f6114c.cancel();
        }

        public final void onSubscribe(C53696d dVar) {
            setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.f6115l++;
            this.f6112a.onNext(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6296a(U u) {
            setSubscription(C2119c.INSTANCE);
            long j = this.f6115l;
            if (j != 0) {
                this.f6115l = 0;
                produced(j);
            }
            this.f6114c.request(1);
            this.f6113b.onNext(u);
        }

        C1853c(C53695c<? super T> cVar, C2152a<U> aVar, C53696d dVar) {
            super(false);
            this.f6112a = cVar;
            this.f6113b = aVar;
            this.f6114c = dVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2192b bVar = new C2192b(cVar);
        C2152a f = C2156d.m6507a(8).mo6458f();
        try {
            C53694b bVar2 = (C53694b) C1745b.m6050a(this.f6107c.apply(f), "handler returned a null Publisher");
            C1852b bVar3 = new C1852b(this.f5924a);
            C1851a aVar = new C1851a(bVar, f, bVar3);
            bVar3.f6111d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo336a(bVar3);
            bVar3.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2119c.error(th, cVar);
        }
    }
}
