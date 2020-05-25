package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p089g.C2148c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.g */
public final class C1991g<T> extends C1896a<T, T> {

    /* renamed from: b */
    final long f6518b;

    /* renamed from: c */
    final TimeUnit f6519c;

    /* renamed from: d */
    final C1675ac f6520d;

    /* renamed from: c.a.e.e.d.g$a */
    static final class C1992a<T> extends AtomicReference<C1690c> implements C1690c, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: a */
        final T f6521a;

        /* renamed from: b */
        final long f6522b;

        /* renamed from: c */
        final C1993b<T> f6523c;

        /* renamed from: d */
        final AtomicBoolean f6524d = new AtomicBoolean();

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            if (get() == C1718b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (this.f6524d.compareAndSet(false, true)) {
                C1993b<T> bVar = this.f6523c;
                long j = this.f6522b;
                T t = this.f6521a;
                if (j == bVar.f6531g) {
                    bVar.f6525a.onNext(t);
                    dispose();
                }
            }
        }

        C1992a(T t, long j, C1993b<T> bVar) {
            this.f6521a = t;
            this.f6522b = j;
            this.f6523c = bVar;
        }
    }

    /* renamed from: c.a.e.e.d.g$b */
    static final class C1993b<T> implements C1674ab<T>, C1690c {

        /* renamed from: a */
        final C1674ab<? super T> f6525a;

        /* renamed from: b */
        final long f6526b;

        /* renamed from: c */
        final TimeUnit f6527c;

        /* renamed from: d */
        final C1678c f6528d;

        /* renamed from: e */
        C1690c f6529e;

        /* renamed from: f */
        C1690c f6530f;

        /* renamed from: g */
        volatile long f6531g;

        /* renamed from: h */
        boolean f6532h;

        public final boolean isDisposed() {
            return this.f6528d.isDisposed();
        }

        public final void dispose() {
            this.f6529e.dispose();
            this.f6528d.dispose();
        }

        public final void onComplete() {
            if (!this.f6532h) {
                this.f6532h = true;
                C1690c cVar = this.f6530f;
                if (cVar != null) {
                    cVar.dispose();
                }
                C1992a aVar = (C1992a) cVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f6525a.onComplete();
                this.f6528d.dispose();
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6529e, cVar)) {
                this.f6529e = cVar;
                this.f6525a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f6532h) {
                C2150a.m6492a(th);
                return;
            }
            C1690c cVar = this.f6530f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f6532h = true;
            this.f6525a.onError(th);
            this.f6528d.dispose();
        }

        public final void onNext(T t) {
            if (!this.f6532h) {
                long j = this.f6531g + 1;
                this.f6531g = j;
                C1690c cVar = this.f6530f;
                if (cVar != null) {
                    cVar.dispose();
                }
                C1992a aVar = new C1992a(t, j, this);
                this.f6530f = aVar;
                C1718b.replace(aVar, this.f6528d.mo6132a(aVar, this.f6526b, this.f6527c));
            }
        }

        C1993b(C1674ab<? super T> abVar, long j, TimeUnit timeUnit, C1678c cVar) {
            this.f6525a = abVar;
            this.f6526b = j;
            this.f6527c = timeUnit;
            this.f6528d = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C2206z zVar = this.f6202a;
        C1993b bVar = new C1993b(new C2148c(abVar), this.f6518b, this.f6519c, this.f6520d.mo6130a());
        zVar.mo6314a(bVar);
    }

    public C1991g(C2206z<T> zVar, long j, TimeUnit timeUnit, C1675ac acVar) {
        super(zVar);
        this.f6518b = j;
        this.f6519c = timeUnit;
        this.f6520d = acVar;
    }
}
