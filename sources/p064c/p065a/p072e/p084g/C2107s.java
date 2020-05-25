package p064c.p065a.p072e.p084g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p069b.C1691d;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.g.s */
public final class C2107s extends C1675ac {

    /* renamed from: b */
    public static final C2107s f6833b = new C2107s();

    /* renamed from: c.a.e.g.s$a */
    static final class C2108a implements Runnable {

        /* renamed from: a */
        private final Runnable f6834a;

        /* renamed from: b */
        private final C2110c f6835b;

        /* renamed from: c */
        private final long f6836c;

        public final void run() {
            if (!this.f6835b.f6843c) {
                long a = C2110c.m5952a(TimeUnit.MILLISECONDS);
                if (this.f6836c > a) {
                    try {
                        Thread.sleep(this.f6836c - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C2150a.m6492a((Throwable) e);
                        return;
                    }
                }
                if (!this.f6835b.f6843c) {
                    this.f6834a.run();
                }
            }
        }

        C2108a(Runnable runnable, C2110c cVar, long j) {
            this.f6834a = runnable;
            this.f6835b = cVar;
            this.f6836c = j;
        }
    }

    /* renamed from: c.a.e.g.s$b */
    static final class C2109b implements Comparable<C2109b> {

        /* renamed from: a */
        final Runnable f6837a;

        /* renamed from: b */
        final long f6838b;

        /* renamed from: c */
        final int f6839c;

        /* renamed from: d */
        volatile boolean f6840d;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            int i;
            C2109b bVar = (C2109b) obj;
            long j = this.f6838b;
            long j2 = bVar.f6838b;
            if (j < j2) {
                i = -1;
            } else if (j > j2) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 0) {
                int i2 = this.f6839c;
                int i3 = bVar.f6839c;
                if (i2 < i3) {
                    i = -1;
                } else if (i2 <= i3) {
                    return 0;
                } else {
                    i = 1;
                }
            }
            return i;
        }

        C2109b(Runnable runnable, Long l, int i) {
            this.f6837a = runnable;
            this.f6838b = l.longValue();
            this.f6839c = i;
        }
    }

    /* renamed from: c.a.e.g.s$c */
    static final class C2110c extends C1678c implements C1690c {

        /* renamed from: a */
        final PriorityBlockingQueue<C2109b> f6841a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f6842b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f6843c;

        /* renamed from: d */
        private final AtomicInteger f6844d = new AtomicInteger();

        /* renamed from: c.a.e.g.s$c$a */
        final class C2111a implements Runnable {

            /* renamed from: a */
            final C2109b f6845a;

            public final void run() {
                this.f6845a.f6840d = true;
                C2110c.this.f6841a.remove(this.f6845a);
            }

            C2111a(C2109b bVar) {
                this.f6845a = bVar;
            }
        }

        public final void dispose() {
            this.f6843c = true;
        }

        public final boolean isDisposed() {
            return this.f6843c;
        }

        C2110c() {
        }

        /* renamed from: a */
        public final C1690c mo6144a(Runnable runnable) {
            return m6399a(runnable, m5952a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        private C1690c m6399a(Runnable runnable, long j) {
            if (this.f6843c) {
                return C1719c.INSTANCE;
            }
            C2109b bVar = new C2109b(runnable, Long.valueOf(j), this.f6842b.incrementAndGet());
            this.f6841a.add(bVar);
            if (this.f6844d.getAndIncrement() != 0) {
                return C1691d.m6005a((Runnable) new C2111a(bVar));
            }
            int i = 1;
            while (!this.f6843c) {
                C2109b bVar2 = (C2109b) this.f6841a.poll();
                if (bVar2 == null) {
                    i = this.f6844d.addAndGet(-i);
                    if (i == 0) {
                        return C1719c.INSTANCE;
                    }
                } else if (!bVar2.f6840d) {
                    bVar2.f6837a.run();
                }
            }
            this.f6841a.clear();
            return C1719c.INSTANCE;
        }

        /* renamed from: a */
        public final C1690c mo6132a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = m5952a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m6399a(new C2108a(runnable, this, a), a);
        }
    }

    C2107s() {
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2110c();
    }

    /* renamed from: a */
    public final C1690c mo6139a(Runnable runnable) {
        C2150a.m6489a(runnable).run();
        return C1719c.INSTANCE;
    }

    /* renamed from: a */
    public final C1690c mo6131a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C2150a.m6489a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2150a.m6492a((Throwable) e);
        }
        return C1719c.INSTANCE;
    }
}
