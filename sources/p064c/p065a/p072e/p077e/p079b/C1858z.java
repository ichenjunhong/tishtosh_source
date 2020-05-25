package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1675ac;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1722f;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p095m.C2192b;

/* renamed from: c.a.e.e.b.z */
public final class C1858z<T> extends C1785a<T, T> {

    /* renamed from: c */
    final long f6125c;

    /* renamed from: d */
    final TimeUnit f6126d;

    /* renamed from: e */
    final C1675ac f6127e;

    /* renamed from: f */
    final boolean f6128f;

    /* renamed from: c.a.e.e.b.z$a */
    static final class C1859a<T> extends C1861c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: a */
        final AtomicInteger f6129a = new AtomicInteger(1);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6298a() {
            mo6301b();
            if (this.f6129a.decrementAndGet() == 0) {
                this.f6130b.onComplete();
            }
        }

        public final void run() {
            if (this.f6129a.incrementAndGet() == 2) {
                mo6301b();
                if (this.f6129a.decrementAndGet() == 0) {
                    this.f6130b.onComplete();
                }
            }
        }

        C1859a(C53695c<? super T> cVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            super(cVar, j, timeUnit, acVar);
        }
    }

    /* renamed from: c.a.e.e.b.z$b */
    static final class C1860b<T> extends C1861c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public final void run() {
            mo6301b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6298a() {
            this.f6130b.onComplete();
        }

        C1860b(C53695c<? super T> cVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            super(cVar, j, timeUnit, acVar);
        }
    }

    /* renamed from: c.a.e.e.b.z$c */
    static abstract class C1861c<T> extends AtomicReference<T> implements C2177l<T>, Runnable, C53696d {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        final C53695c<? super T> f6130b;

        /* renamed from: c */
        final long f6131c;

        /* renamed from: d */
        final TimeUnit f6132d;

        /* renamed from: e */
        final C1675ac f6133e;

        /* renamed from: f */
        final AtomicLong f6134f = new AtomicLong();

        /* renamed from: g */
        final C1722f f6135g = new C1722f();

        /* renamed from: h */
        C53696d f6136h;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6298a();

        /* renamed from: c */
        private void m6172c() {
            C1718b.dispose(this.f6135g);
        }

        public void onComplete() {
            m6172c();
            mo6298a();
        }

        public void cancel() {
            m6172c();
            this.f6136h.cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6301b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f6134f.get() != 0) {
                    this.f6130b.onNext(andSet);
                    C2127d.m6416b(this.f6134f, 1);
                    return;
                }
                cancel();
                this.f6130b.onError(new C1701c("Couldn't emit value due to lack of requests!"));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            m6172c();
            this.f6130b.onError(th);
        }

        public void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a(this.f6134f, j);
            }
        }

        public void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6136h, dVar)) {
                this.f6136h = dVar;
                this.f6130b.onSubscribe(this);
                this.f6135g.replace(this.f6133e.mo6140a(this, this.f6131c, this.f6131c, this.f6132d));
                dVar.request(Long.MAX_VALUE);
            }
        }

        C1861c(C53695c<? super T> cVar, long j, TimeUnit timeUnit, C1675ac acVar) {
            this.f6130b = cVar;
            this.f6131c = j;
            this.f6132d = timeUnit;
            this.f6133e = acVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C2192b bVar = new C2192b(cVar);
        if (this.f6128f) {
            C2149h hVar = this.f5924a;
            C1859a aVar = new C1859a(bVar, this.f6125c, this.f6126d, this.f6127e);
            hVar.mo6449a((C2177l<? super T>) aVar);
            return;
        }
        C2149h hVar2 = this.f5924a;
        C1860b bVar2 = new C1860b(bVar, this.f6125c, this.f6126d, this.f6127e);
        hVar2.mo6449a((C2177l<? super T>) bVar2);
    }

    public C1858z(C2149h<T> hVar, long j, TimeUnit timeUnit, C1675ac acVar, boolean z) {
        super(hVar);
        this.f6125c = j;
        this.f6126d = timeUnit;
        this.f6127e = acVar;
        this.f6128f = z;
    }
}
