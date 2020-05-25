package p064c.p065a;

import java.util.concurrent.TimeUnit;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p073a.C1722f;
import p064c.p065a.p072e.p084g.C2093i;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.ac */
public abstract class C1675ac {

    /* renamed from: a */
    static final long f5817a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: c.a.ac$a */
    static final class C1676a implements C1690c, Runnable {

        /* renamed from: a */
        final Runnable f5818a;

        /* renamed from: b */
        final C1678c f5819b;

        /* renamed from: c */
        Thread f5820c;

        public final boolean isDisposed() {
            return this.f5819b.isDisposed();
        }

        public final void run() {
            this.f5820c = Thread.currentThread();
            try {
                this.f5818a.run();
            } finally {
                dispose();
                this.f5820c = null;
            }
        }

        public final void dispose() {
            if (this.f5820c != Thread.currentThread() || !(this.f5819b instanceof C2093i)) {
                this.f5819b.dispose();
                return;
            }
            C2093i iVar = (C2093i) this.f5819b;
            if (!iVar.f6811c) {
                iVar.f6811c = true;
                iVar.f6810b.shutdown();
            }
        }

        C1676a(Runnable runnable, C1678c cVar) {
            this.f5818a = runnable;
            this.f5819b = cVar;
        }
    }

    /* renamed from: c.a.ac$b */
    static final class C1677b implements C1690c, Runnable {

        /* renamed from: a */
        final Runnable f5821a;

        /* renamed from: b */
        final C1678c f5822b;

        /* renamed from: c */
        volatile boolean f5823c;

        public final boolean isDisposed() {
            return this.f5823c;
        }

        public final void dispose() {
            this.f5823c = true;
            this.f5822b.dispose();
        }

        public final void run() {
            if (!this.f5823c) {
                try {
                    this.f5821a.run();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f5822b.dispose();
                    throw C2131h.m6422a(th);
                }
            }
        }

        C1677b(Runnable runnable, C1678c cVar) {
            this.f5821a = runnable;
            this.f5822b = cVar;
        }
    }

    /* renamed from: c.a.ac$c */
    public static abstract class C1678c implements C1690c {

        /* renamed from: c.a.ac$c$a */
        final class C1679a implements Runnable {

            /* renamed from: a */
            final Runnable f5824a;

            /* renamed from: b */
            final C1722f f5825b;

            /* renamed from: c */
            final long f5826c;

            /* renamed from: d */
            long f5827d;

            /* renamed from: e */
            long f5828e;

            /* renamed from: f */
            long f5829f;

            public final void run() {
                long j;
                this.f5824a.run();
                if (!this.f5825b.isDisposed()) {
                    long a = C1678c.m5952a(TimeUnit.NANOSECONDS);
                    if (C1675ac.f5817a + a < this.f5828e || a >= this.f5828e + this.f5826c + C1675ac.f5817a) {
                        j = this.f5826c + a;
                        long j2 = this.f5826c;
                        long j3 = this.f5827d + 1;
                        this.f5827d = j3;
                        this.f5829f = j - (j2 * j3);
                    } else {
                        long j4 = this.f5829f;
                        long j5 = this.f5827d + 1;
                        this.f5827d = j5;
                        j = j4 + (j5 * this.f5826c);
                    }
                    this.f5828e = a;
                    this.f5825b.replace(C1678c.this.mo6132a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }

            C1679a(long j, Runnable runnable, long j2, C1722f fVar, long j3) {
                this.f5824a = runnable;
                this.f5825b = fVar;
                this.f5826c = j3;
                this.f5828e = j2;
                this.f5829f = j;
            }
        }

        /* renamed from: a */
        public abstract C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public static long m5952a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public C1690c mo6144a(Runnable runnable) {
            return mo6132a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public final C1690c mo6145a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C1722f fVar = new C1722f();
            C1722f fVar2 = new C1722f(fVar);
            Runnable a = C2150a.m6489a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = m5952a(TimeUnit.NANOSECONDS);
            C1679a aVar = new C1679a(a2 + timeUnit2.toNanos(j3), a, a2, fVar2, nanos);
            C1690c a3 = mo6132a(aVar, j3, timeUnit2);
            if (a3 == C1719c.INSTANCE) {
                return a3;
            }
            fVar.replace(a3);
            return fVar2;
        }
    }

    /* renamed from: a */
    public abstract C1678c mo6130a();

    /* renamed from: b */
    public void mo6141b() {
    }

    /* renamed from: a */
    public C1690c mo6139a(Runnable runnable) {
        return mo6131a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        C1678c a = mo6130a();
        C1676a aVar = new C1676a(C2150a.m6489a(runnable), a);
        a.mo6132a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public C1690c mo6140a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C1678c a = mo6130a();
        C1677b bVar = new C1677b(C2150a.m6489a(runnable), a);
        C1690c a2 = a.mo6145a(bVar, j, j2, timeUnit);
        if (a2 == C1719c.INSTANCE) {
            return a2;
        }
        return bVar;
    }
}
