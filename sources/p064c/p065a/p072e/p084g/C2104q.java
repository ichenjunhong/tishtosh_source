package p064c.p065a.p072e.p084g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.g.q */
public final class C2104q extends C1675ac {

    /* renamed from: d */
    static final C2095k f6826d = new C2095k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f6827e;

    /* renamed from: b */
    final ThreadFactory f6828b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f6829c;

    /* renamed from: c.a.e.g.q$a */
    static final class C2105a extends C1678c {

        /* renamed from: a */
        final ScheduledExecutorService f6830a;

        /* renamed from: b */
        final C1689b f6831b = new C1689b();

        /* renamed from: c */
        volatile boolean f6832c;

        public final boolean isDisposed() {
            return this.f6832c;
        }

        public final void dispose() {
            if (!this.f6832c) {
                this.f6832c = true;
                this.f6831b.dispose();
            }
        }

        C2105a(ScheduledExecutorService scheduledExecutorService) {
            this.f6830a = scheduledExecutorService;
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f6832c) {
                return C1719c.INSTANCE;
            }
            C2099n nVar = new C2099n(C2150a.m6489a(runnable), this.f6831b);
            this.f6831b.mo6181a((C1690c) nVar);
            if (j <= 0) {
                try {
                    future = this.f6830a.submit(nVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C2150a.m6492a((Throwable) e);
                    return C1719c.INSTANCE;
                }
            } else {
                future = this.f6830a.schedule(nVar, j, timeUnit);
            }
            nVar.setFuture(future);
            return nVar;
        }
    }

    public C2104q() {
        this(f6826d);
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2105a((ScheduledExecutorService) this.f6829c.get());
    }

    static {
        ScheduledExecutorService a = C2106r.m6395a(0);
        f6827e = a;
        a.shutdown();
    }

    /* renamed from: b */
    public final void mo6141b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.f6829c.get();
            if (scheduledExecutorService != f6827e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m6389a(this.f6828b);
            }
        } while (!this.f6829c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    private static ScheduledExecutorService m6389a(ThreadFactory threadFactory) {
        return C2100o.m6385a(threadFactory);
    }

    private C2104q(ThreadFactory threadFactory) {
        this.f6829c = new AtomicReference<>();
        this.f6828b = threadFactory;
        this.f6829c.lazySet(m6389a(threadFactory));
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C2098m mVar = new C2098m(C2150a.m6489a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f6829c.get()).submit(mVar);
            } catch (RejectedExecutionException e) {
                C2150a.m6492a((Throwable) e);
                return C1719c.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f6829c.get()).schedule(mVar, j, timeUnit);
        }
        mVar.setFuture(future);
        return mVar;
    }

    /* renamed from: a */
    public final C1690c mo6140a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C2150a.m6489a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6829c.get();
            C2086e eVar = new C2086e(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C2150a.m6492a((Throwable) e);
                    return C1719c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo6383a(future);
            return eVar;
        }
        C2097l lVar = new C2097l(a);
        try {
            lVar.setFuture(((ScheduledExecutorService) this.f6829c.get()).scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e2) {
            C2150a.m6492a((Throwable) e2);
            return C1719c.INSTANCE;
        }
    }
}
