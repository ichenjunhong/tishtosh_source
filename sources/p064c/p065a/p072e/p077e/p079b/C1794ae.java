package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;

/* renamed from: c.a.e.e.b.ae */
public final class C1794ae<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1675ac f5945c;

    /* renamed from: d */
    final boolean f5946d;

    /* renamed from: c.a.e.e.b.ae$a */
    static final class C1795a<T> extends AtomicReference<Thread> implements C2177l<T>, Runnable, C53696d {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C53695c<? super T> f5947a;

        /* renamed from: b */
        final C1678c f5948b;

        /* renamed from: c */
        final AtomicReference<C53696d> f5949c = new AtomicReference<>();

        /* renamed from: d */
        final AtomicLong f5950d = new AtomicLong();

        /* renamed from: e */
        final boolean f5951e;

        /* renamed from: f */
        C53694b<T> f5952f;

        /* renamed from: c.a.e.e.b.ae$a$a */
        static final class C1796a implements Runnable {

            /* renamed from: a */
            final C53696d f5953a;

            /* renamed from: b */
            final long f5954b;

            public final void run() {
                this.f5953a.request(this.f5954b);
            }

            C1796a(C53696d dVar, long j) {
                this.f5953a = dVar;
                this.f5954b = j;
            }
        }

        public final void cancel() {
            C2122f.cancel(this.f5949c);
            this.f5948b.dispose();
        }

        public final void onComplete() {
            this.f5947a.onComplete();
            this.f5948b.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            C53694b<T> bVar = this.f5952f;
            this.f5952f = null;
            bVar.mo336a(this);
        }

        public final void onNext(T t) {
            this.f5947a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.f5947a.onError(th);
            this.f5948b.dispose();
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.setOnce(this.f5949c, dVar)) {
                long andSet = this.f5950d.getAndSet(0);
                if (andSet != 0) {
                    m6086a(andSet, dVar);
                }
            }
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C53696d dVar = (C53696d) this.f5949c.get();
                if (dVar != null) {
                    m6086a(j, dVar);
                    return;
                }
                C2127d.m6415a(this.f5950d, j);
                C53696d dVar2 = (C53696d) this.f5949c.get();
                if (dVar2 != null) {
                    long andSet = this.f5950d.getAndSet(0);
                    if (andSet != 0) {
                        m6086a(andSet, dVar2);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m6086a(long j, C53696d dVar) {
            if (this.f5951e || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.f5948b.mo6144a((Runnable) new C1796a(dVar, j));
            }
        }

        C1795a(C53695c<? super T> cVar, C1678c cVar2, C53694b<T> bVar, boolean z) {
            this.f5947a = cVar;
            this.f5948b = cVar2;
            this.f5952f = bVar;
            this.f5951e = !z;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C1678c a = this.f5945c.mo6130a();
        C1795a aVar = new C1795a(cVar, a, this.f5924a, this.f5946d);
        cVar.onSubscribe(aVar);
        a.mo6144a((Runnable) aVar);
    }

    public C1794ae(C2149h<T> hVar, C1675ac acVar, boolean z) {
        super(hVar);
        this.f5945c = acVar;
        this.f5946d = z;
    }
}
