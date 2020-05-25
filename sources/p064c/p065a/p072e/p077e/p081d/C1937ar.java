package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p089g.C2148c;

/* renamed from: c.a.e.e.d.ar */
public final class C1937ar<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6324b;

    /* renamed from: c */
    final TimeUnit f6325c;

    /* renamed from: d */
    final C1675ac f6326d;

    /* renamed from: e */
    final boolean f6327e = false;

    /* renamed from: c.a.e.e.d.ar$a */
    static final class C1938a<T> extends C1940c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: a */
        final AtomicInteger f6328a = new AtomicInteger(1);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6327a() {
            mo6330b();
            if (this.f6328a.decrementAndGet() == 0) {
                this.f6329b.onComplete();
            }
        }

        public final void run() {
            if (this.f6328a.incrementAndGet() == 2) {
                mo6330b();
                if (this.f6328a.decrementAndGet() == 0) {
                    this.f6329b.onComplete();
                }
            }
        }

        C1938a(C1674ab<? super T> abVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            super(abVar, j, timeUnit, acVar);
        }
    }

    /* renamed from: c.a.e.e.d.ar$b */
    static final class C1939b<T> extends C1940c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public final void run() {
            mo6330b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6327a() {
            this.f6329b.onComplete();
        }

        C1939b(C1674ab<? super T> abVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            super(abVar, j, timeUnit, acVar);
        }
    }

    /* renamed from: c.a.e.e.d.ar$c */
    static abstract class C1940c<T> extends AtomicReference<T> implements C1674ab<T>, C1690c, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        final C1674ab<? super T> f6329b;

        /* renamed from: c */
        final long f6330c;

        /* renamed from: d */
        final TimeUnit f6331d;

        /* renamed from: e */
        final C1675ac f6332e;

        /* renamed from: f */
        final AtomicReference<C1690c> f6333f = new AtomicReference<>();

        /* renamed from: g */
        C1690c f6334g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6327a();

        /* renamed from: c */
        private void m6234c() {
            C1718b.dispose(this.f6333f);
        }

        public boolean isDisposed() {
            return this.f6334g.isDisposed();
        }

        public void onComplete() {
            m6234c();
            mo6327a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6330b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f6329b.onNext(andSet);
            }
        }

        public void dispose() {
            m6234c();
            this.f6334g.dispose();
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            m6234c();
            this.f6329b.onError(th);
        }

        public void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6334g, cVar)) {
                this.f6334g = cVar;
                this.f6329b.onSubscribe(this);
                C1718b.replace(this.f6333f, this.f6332e.mo6140a(this, this.f6330c, this.f6330c, this.f6331d));
            }
        }

        C1940c(C1674ab<? super T> abVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            this.f6329b = abVar;
            this.f6330c = j;
            this.f6331d = timeUnit;
            this.f6332e = acVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2148c cVar = new C2148c(abVar);
        if (this.f6327e) {
            C2206z zVar = this.f6202a;
            C1938a aVar = new C1938a(cVar, this.f6324b, this.f6325c, this.f6326d);
            zVar.mo6314a(aVar);
            return;
        }
        C2206z zVar2 = this.f6202a;
        C1939b bVar = new C1939b(cVar, this.f6324b, this.f6325c, this.f6326d);
        zVar2.mo6314a(bVar);
    }

    public C1937ar(C2206z<T> zVar, long j, TimeUnit timeUnit, C1675ac acVar, boolean z) {
        super(zVar);
        this.f6324b = j;
        this.f6325c = timeUnit;
        this.f6326d = acVar;
    }
}
