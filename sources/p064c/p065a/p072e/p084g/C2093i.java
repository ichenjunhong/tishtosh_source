package p064c.p065a.p072e.p084g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1717a;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.g.i */
public class C2093i extends C1678c implements C1690c {

    /* renamed from: b */
    public final ScheduledExecutorService f6810b;

    /* renamed from: c */
    public volatile boolean f6811c;

    public boolean isDisposed() {
        return this.f6811c;
    }

    public void dispose() {
        if (!this.f6811c) {
            this.f6811c = true;
            this.f6810b.shutdownNow();
        }
    }

    /* renamed from: a */
    public final C1690c mo6144a(Runnable runnable) {
        return mo6132a(runnable, 0, null);
    }

    public C2093i(ThreadFactory threadFactory) {
        this.f6810b = C2100o.m6385a(threadFactory);
    }

    /* renamed from: a */
    public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f6811c) {
            return C1719c.INSTANCE;
        }
        return mo6388a(runnable, j, timeUnit, null);
    }

    /* renamed from: b */
    public final C1690c mo6390b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C2098m mVar = new C2098m(C2150a.m6489a(runnable));
        if (j <= 0) {
            try {
                future = this.f6810b.submit(mVar);
            } catch (RejectedExecutionException e) {
                C2150a.m6492a((Throwable) e);
                return C1719c.INSTANCE;
            }
        } else {
            future = this.f6810b.schedule(mVar, j, timeUnit);
        }
        mVar.setFuture(future);
        return mVar;
    }

    /* renamed from: a */
    public final C2099n mo6388a(Runnable runnable, long j, TimeUnit timeUnit, C1717a aVar) {
        Future future;
        C2099n nVar = new C2099n(C2150a.m6489a(runnable), aVar);
        if (aVar != null && !aVar.mo6181a(nVar)) {
            return nVar;
        }
        if (j <= 0) {
            try {
                future = this.f6810b.submit(nVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo6183b(nVar);
                }
                C2150a.m6492a((Throwable) e);
            }
        } else {
            future = this.f6810b.schedule(nVar, j, timeUnit);
        }
        nVar.setFuture(future);
        return nVar;
    }

    /* renamed from: b */
    public final C1690c mo6389b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C2150a.m6489a(runnable);
        if (j2 <= 0) {
            C2086e eVar = new C2086e(a, this.f6810b);
            if (j <= 0) {
                try {
                    future = this.f6810b.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C2150a.m6492a((Throwable) e);
                    return C1719c.INSTANCE;
                }
            } else {
                future = this.f6810b.schedule(eVar, j, timeUnit);
            }
            eVar.mo6383a(future);
            return eVar;
        }
        C2097l lVar = new C2097l(a);
        try {
            lVar.setFuture(this.f6810b.scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e2) {
            C2150a.m6492a((Throwable) e2);
            return C1719c.INSTANCE;
        }
    }
}
