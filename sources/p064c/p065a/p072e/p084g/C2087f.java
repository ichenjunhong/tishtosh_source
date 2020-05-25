package p064c.p065a.p072e.p084g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1719c;

/* renamed from: c.a.e.g.f */
public final class C2087f extends C1675ac {

    /* renamed from: b */
    static final C2095k f6789b;

    /* renamed from: c */
    static final C2095k f6790c;

    /* renamed from: d */
    static final C2090c f6791d;

    /* renamed from: g */
    static final C2088a f6792g;

    /* renamed from: h */
    private static final long f6793h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: i */
    private static final TimeUnit f6794i = TimeUnit.SECONDS;

    /* renamed from: e */
    final ThreadFactory f6795e;

    /* renamed from: f */
    final AtomicReference<C2088a> f6796f;

    /* renamed from: c.a.e.g.f$a */
    static final class C2088a implements Runnable {

        /* renamed from: a */
        final long f6797a;

        /* renamed from: b */
        final ConcurrentLinkedQueue<C2090c> f6798b;

        /* renamed from: c */
        final C1689b f6799c;

        /* renamed from: d */
        private final ScheduledExecutorService f6800d;

        /* renamed from: e */
        private final Future<?> f6801e;

        /* renamed from: f */
        private final ThreadFactory f6802f;

        /* renamed from: b */
        static long m6374b() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6386c() {
            this.f6799c.dispose();
            if (this.f6801e != null) {
                this.f6801e.cancel(true);
            }
            if (this.f6800d != null) {
                this.f6800d.shutdownNow();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C2090c mo6385a() {
            if (this.f6799c.isDisposed()) {
                return C2087f.f6791d;
            }
            while (!this.f6798b.isEmpty()) {
                C2090c cVar = (C2090c) this.f6798b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C2090c cVar2 = new C2090c(this.f6802f);
            this.f6799c.mo6181a((C1690c) cVar2);
            return cVar2;
        }

        public final void run() {
            if (!this.f6798b.isEmpty()) {
                long b = m6374b();
                Iterator it = this.f6798b.iterator();
                while (it.hasNext()) {
                    C2090c cVar = (C2090c) it.next();
                    if (cVar.f6807a > b) {
                        return;
                    }
                    if (this.f6798b.remove(cVar)) {
                        this.f6799c.mo6183b(cVar);
                    }
                }
            }
        }

        C2088a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            Future<?> future;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f6797a = j2;
            this.f6798b = new ConcurrentLinkedQueue<>();
            this.f6799c = new C1689b();
            this.f6802f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = C2091g.m6378a(1, C2087f.f6790c);
                future = scheduledExecutorService.scheduleWithFixedDelay(this, this.f6797a, this.f6797a, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f6800d = scheduledExecutorService;
            this.f6801e = future;
        }
    }

    /* renamed from: c.a.e.g.f$b */
    static final class C2089b extends C1678c {

        /* renamed from: a */
        final AtomicBoolean f6803a = new AtomicBoolean();

        /* renamed from: b */
        private final C1689b f6804b;

        /* renamed from: c */
        private final C2088a f6805c;

        /* renamed from: d */
        private final C2090c f6806d;

        public final boolean isDisposed() {
            return this.f6803a.get();
        }

        public final void dispose() {
            if (this.f6803a.compareAndSet(false, true)) {
                this.f6804b.dispose();
                C2088a aVar = this.f6805c;
                C2090c cVar = this.f6806d;
                cVar.f6807a = C2088a.m6374b() + aVar.f6797a;
                aVar.f6798b.offer(cVar);
            }
        }

        C2089b(C2088a aVar) {
            this.f6805c = aVar;
            this.f6804b = new C1689b();
            this.f6806d = aVar.mo6385a();
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f6804b.isDisposed()) {
                return C1719c.INSTANCE;
            }
            return this.f6806d.mo6388a(runnable, j, timeUnit, this.f6804b);
        }
    }

    /* renamed from: c.a.e.g.f$c */
    static final class C2090c extends C2093i {

        /* renamed from: a */
        public long f6807a;

        C2090c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public C2087f() {
        this(f6789b);
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2089b((C2088a) this.f6796f.get());
    }

    /* renamed from: b */
    public final void mo6141b() {
        C2088a aVar = new C2088a(f6793h, f6794i, this.f6795e);
        if (!this.f6796f.compareAndSet(f6792g, aVar)) {
            aVar.mo6386c();
        }
    }

    static {
        C2090c cVar = new C2090c(new C2095k("RxCachedThreadSchedulerShutdown"));
        f6791d = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f6789b = new C2095k("RxCachedThreadScheduler", max);
        f6790c = new C2095k("RxCachedWorkerPoolEvictor", max);
        C2088a aVar = new C2088a(0, null, f6789b);
        f6792g = aVar;
        aVar.mo6386c();
    }

    private C2087f(ThreadFactory threadFactory) {
        this.f6795e = threadFactory;
        this.f6796f = new AtomicReference<>(f6792g);
        mo6141b();
    }
}
