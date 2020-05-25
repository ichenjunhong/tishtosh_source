package p064c.p065a.p072e.p084g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p073a.C1720d;

/* renamed from: c.a.e.g.b */
public final class C2074b extends C1675ac {

    /* renamed from: b */
    static final C2076b f6748b;

    /* renamed from: c */
    static final C2095k f6749c = new C2095k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: d */
    static final int f6750d;

    /* renamed from: e */
    static final C2077c f6751e;

    /* renamed from: f */
    final ThreadFactory f6752f;

    /* renamed from: g */
    final AtomicReference<C2076b> f6753g;

    /* renamed from: c.a.e.g.b$a */
    static final class C2075a extends C1678c {

        /* renamed from: a */
        volatile boolean f6754a;

        /* renamed from: b */
        private final C1720d f6755b = new C1720d();

        /* renamed from: c */
        private final C1689b f6756c = new C1689b();

        /* renamed from: d */
        private final C1720d f6757d = new C1720d();

        /* renamed from: e */
        private final C2077c f6758e;

        public final boolean isDisposed() {
            return this.f6754a;
        }

        public final void dispose() {
            if (!this.f6754a) {
                this.f6754a = true;
                this.f6757d.dispose();
            }
        }

        /* renamed from: a */
        public final C1690c mo6144a(Runnable runnable) {
            if (this.f6754a) {
                return C1719c.INSTANCE;
            }
            return this.f6758e.mo6388a(runnable, 0, TimeUnit.MILLISECONDS, this.f6755b);
        }

        C2075a(C2077c cVar) {
            this.f6758e = cVar;
            this.f6757d.mo6181a(this.f6755b);
            this.f6757d.mo6181a(this.f6756c);
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f6754a) {
                return C1719c.INSTANCE;
            }
            return this.f6758e.mo6388a(runnable, j, timeUnit, this.f6756c);
        }
    }

    /* renamed from: c.a.e.g.b$b */
    static final class C2076b {

        /* renamed from: a */
        final int f6759a;

        /* renamed from: b */
        final C2077c[] f6760b;

        /* renamed from: c */
        long f6761c;

        /* renamed from: b */
        public final void mo6371b() {
            for (C2077c dispose : this.f6760b) {
                dispose.dispose();
            }
        }

        /* renamed from: a */
        public final C2077c mo6370a() {
            int i = this.f6759a;
            if (i == 0) {
                return C2074b.f6751e;
            }
            C2077c[] cVarArr = this.f6760b;
            long j = this.f6761c;
            this.f6761c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        C2076b(int i, ThreadFactory threadFactory) {
            this.f6759a = i;
            this.f6760b = new C2077c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f6760b[i2] = new C2077c(threadFactory);
            }
        }
    }

    /* renamed from: c.a.e.g.b$c */
    static final class C2077c extends C2093i {
        C2077c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public C2074b() {
        this(f6749c);
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2075a(((C2076b) this.f6753g.get()).mo6370a());
    }

    /* renamed from: b */
    public final void mo6141b() {
        C2076b bVar = new C2076b(f6750d, this.f6752f);
        if (!this.f6753g.compareAndSet(f6748b, bVar)) {
            bVar.mo6371b();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f6750d = availableProcessors;
        C2077c cVar = new C2077c(new C2095k("RxComputationShutdown"));
        f6751e = cVar;
        cVar.dispose();
        C2076b bVar = new C2076b(0, f6749c);
        f6748b = bVar;
        bVar.mo6371b();
    }

    private C2074b(ThreadFactory threadFactory) {
        this.f6752f = threadFactory;
        this.f6753g = new AtomicReference<>(f6748b);
        mo6141b();
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C2076b) this.f6753g.get()).mo6370a().mo6390b(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public final C1690c mo6140a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C2076b) this.f6753g.get()).mo6370a().mo6389b(runnable, j, j2, timeUnit);
    }
}
