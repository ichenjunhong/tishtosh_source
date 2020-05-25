package p064c.p065a.p072e.p084g;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1717a;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p073a.C1722f;
import p064c.p065a.p072e.p083f.C2069a;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: c.a.e.g.d */
public final class C2079d extends C1675ac {

    /* renamed from: d */
    static final C1675ac f6763d = C2168a.m6523d();

    /* renamed from: b */
    final boolean f6764b = false;

    /* renamed from: c */
    final Executor f6765c;

    /* renamed from: c.a.e.g.d$a */
    final class C2080a implements Runnable {

        /* renamed from: b */
        private final C2081b f6767b;

        public final void run() {
            this.f6767b.f6769b.replace(C2079d.this.mo6139a(this.f6767b));
        }

        C2080a(C2081b bVar) {
            this.f6767b = bVar;
        }
    }

    /* renamed from: c.a.e.g.d$b */
    static final class C2081b extends AtomicReference<Runnable> implements C1690c, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: a */
        final C1722f f6768a = new C1722f();

        /* renamed from: b */
        final C1722f f6769b = new C1722f();

        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (getAndSet(null) != null) {
                this.f6768a.dispose();
                this.f6769b.dispose();
            }
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f6768a.lazySet(C1718b.DISPOSED);
                    this.f6769b.lazySet(C1718b.DISPOSED);
                }
            }
        }

        C2081b(Runnable runnable) {
            super(runnable);
        }
    }

    /* renamed from: c.a.e.g.d$c */
    public static final class C2082c extends C1678c implements Runnable {

        /* renamed from: a */
        final boolean f6770a;

        /* renamed from: b */
        final Executor f6771b;

        /* renamed from: c */
        final C2069a<Runnable> f6772c;

        /* renamed from: d */
        volatile boolean f6773d;

        /* renamed from: e */
        final AtomicInteger f6774e = new AtomicInteger();

        /* renamed from: f */
        final C1689b f6775f = new C1689b();

        /* renamed from: c.a.e.g.d$c$a */
        static final class C2083a extends AtomicBoolean implements C1690c, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: a */
            final Runnable f6776a;

            public final void dispose() {
                lazySet(true);
            }

            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.f6776a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            C2083a(Runnable runnable) {
                this.f6776a = runnable;
            }
        }

        /* renamed from: c.a.e.g.d$c$b */
        static final class C2084b extends AtomicInteger implements C1690c, Runnable {
            private static final long serialVersionUID = -3603436687413320876L;

            /* renamed from: a */
            final Runnable f6777a;

            /* renamed from: b */
            final C1717a f6778b;

            /* renamed from: c */
            volatile Thread f6779c;

            /* renamed from: a */
            private void m6369a() {
                if (this.f6778b != null) {
                    this.f6778b.mo6184c(this);
                }
            }

            public final boolean isDisposed() {
                if (get() >= 2) {
                    return true;
                }
                return false;
            }

            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m6369a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f6779c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f6779c = null;
                        }
                        set(4);
                        m6369a();
                        return;
                    }
                }
            }

            public final void run() {
                if (get() == 0) {
                    this.f6779c = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f6777a.run();
                            this.f6779c = null;
                            if (compareAndSet(1, 2)) {
                                m6369a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.f6779c = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                m6369a();
                            }
                            throw th;
                        }
                    } else {
                        this.f6779c = null;
                    }
                }
            }

            C2084b(Runnable runnable, C1717a aVar) {
                this.f6777a = runnable;
                this.f6778b = aVar;
            }
        }

        /* renamed from: c.a.e.g.d$c$c */
        final class C2085c implements Runnable {

            /* renamed from: b */
            private final C1722f f6781b;

            /* renamed from: c */
            private final Runnable f6782c;

            public final void run() {
                this.f6781b.replace(C2082c.this.mo6144a(this.f6782c));
            }

            C2085c(C1722f fVar, Runnable runnable) {
                this.f6781b = fVar;
                this.f6782c = runnable;
            }
        }

        public final boolean isDisposed() {
            return this.f6773d;
        }

        public final void dispose() {
            if (!this.f6773d) {
                this.f6773d = true;
                this.f6775f.dispose();
                if (this.f6774e.getAndIncrement() == 0) {
                    this.f6772c.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r3.f6773d == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r1 = r3.f6774e.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                c.a.e.f.a<java.lang.Runnable> r0 = r3.f6772c
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f6773d
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 == 0) goto L_0x001e
                r2.run()
                boolean r2 = r3.f6773d
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x001e:
                boolean r2 = r3.f6773d
                if (r2 == 0) goto L_0x0026
                r0.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f6774e
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p084g.C2079d.C2082c.run():void");
        }

        /* renamed from: a */
        public final C1690c mo6144a(Runnable runnable) {
            C1690c cVar;
            if (this.f6773d) {
                return C1719c.INSTANCE;
            }
            Runnable a = C2150a.m6489a(runnable);
            if (this.f6770a) {
                cVar = new C2084b(a, this.f6775f);
                this.f6775f.mo6181a(cVar);
            } else {
                cVar = new C2083a(a);
            }
            this.f6772c.offer(cVar);
            if (this.f6774e.getAndIncrement() == 0) {
                try {
                    this.f6771b.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f6773d = true;
                    this.f6772c.clear();
                    C2150a.m6492a((Throwable) e);
                    return C1719c.INSTANCE;
                }
            }
            return cVar;
        }

        public C2082c(Executor executor, boolean z) {
            this.f6771b = executor;
            this.f6772c = new C2069a<>();
            this.f6770a = z;
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo6144a(runnable);
            }
            if (this.f6773d) {
                return C1719c.INSTANCE;
            }
            C1722f fVar = new C1722f();
            C1722f fVar2 = new C1722f(fVar);
            C2099n nVar = new C2099n(new C2085c(fVar2, C2150a.m6489a(runnable)), this.f6775f);
            this.f6775f.mo6181a((C1690c) nVar);
            if (this.f6771b instanceof ScheduledExecutorService) {
                try {
                    nVar.setFuture(((ScheduledExecutorService) this.f6771b).schedule(nVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f6773d = true;
                    C2150a.m6492a((Throwable) e);
                    return C1719c.INSTANCE;
                }
            } else {
                nVar.setFuture(new C2078c(C2079d.f6763d.mo6131a(nVar, j, timeUnit)));
            }
            fVar.replace(nVar);
            return fVar2;
        }
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2082c(this.f6765c, this.f6764b);
    }

    /* renamed from: a */
    public final C1690c mo6139a(Runnable runnable) {
        Runnable a = C2150a.m6489a(runnable);
        try {
            if (this.f6765c instanceof ExecutorService) {
                C2098m mVar = new C2098m(a);
                mVar.setFuture(((ExecutorService) this.f6765c).submit(mVar));
                return mVar;
            } else if (this.f6764b) {
                C2084b bVar = new C2084b(a, null);
                this.f6765c.execute(bVar);
                return bVar;
            } else {
                C2083a aVar = new C2083a(a);
                this.f6765c.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e) {
            C2150a.m6492a((Throwable) e);
            return C1719c.INSTANCE;
        }
    }

    public C2079d(Executor executor, boolean z) {
        this.f6765c = executor;
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C2150a.m6489a(runnable);
        if (this.f6765c instanceof ScheduledExecutorService) {
            try {
                C2098m mVar = new C2098m(a);
                mVar.setFuture(((ScheduledExecutorService) this.f6765c).schedule(mVar, j, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e) {
                C2150a.m6492a((Throwable) e);
                return C1719c.INSTANCE;
            }
        } else {
            C2081b bVar = new C2081b(a);
            bVar.f6768a.replace(f6763d.mo6131a(new C2080a(bVar), j, timeUnit));
            return bVar;
        }
    }

    /* renamed from: a */
    public final C1690c mo6140a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f6765c instanceof ScheduledExecutorService)) {
            return super.mo6140a(runnable, j, j2, timeUnit);
        }
        try {
            C2097l lVar = new C2097l(C2150a.m6489a(runnable));
            lVar.setFuture(((ScheduledExecutorService) this.f6765c).scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e) {
            C2150a.m6492a((Throwable) e);
            return C1719c.INSTANCE;
        }
    }
}
