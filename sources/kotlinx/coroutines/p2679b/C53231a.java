package kotlinx.coroutines.p2679b;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C53203ai;
import kotlinx.coroutines.internal.C53320k;
import kotlinx.coroutines.internal.C53332u;
import kotlinx.coroutines.internal.C53333v;
import p2628d.C52862z;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.b.a */
public final class C53231a implements Closeable, Executor {

    /* renamed from: d */
    static final AtomicLongFieldUpdater f131815d = AtomicLongFieldUpdater.newUpdater(C53231a.class, "controlState");

    /* renamed from: i */
    public static final int f131816i;

    /* renamed from: j */
    public static final int f131817j;

    /* renamed from: k */
    public static final int f131818k = ((int) TimeUnit.SECONDS.toNanos(1));

    /* renamed from: l */
    public static final int f131819l = ((int) C52753d.m112319b(C52753d.m112317a(C53246m.f131861a / 4, 10), (long) f131818k));

    /* renamed from: m */
    public static final C53332u f131820m = new C53332u("NOT_IN_STACK");

    /* renamed from: n */
    public static final C53232a f131821n = new C53232a(null);

    /* renamed from: o */
    private static final AtomicLongFieldUpdater f131822o = AtomicLongFieldUpdater.newUpdater(C53231a.class, "parkedWorkersStack");

    /* renamed from: p */
    private static final AtomicIntegerFieldUpdater f131823p = AtomicIntegerFieldUpdater.newUpdater(C53231a.class, "_isTerminated");
    private volatile int _isTerminated;

    /* renamed from: a */
    public final C53238e f131824a;

    /* renamed from: b */
    public final Semaphore f131825b;

    /* renamed from: c */
    public final C53233b[] f131826c;
    volatile long controlState;

    /* renamed from: e */
    public final Random f131827e;

    /* renamed from: f */
    public final int f131828f;

    /* renamed from: g */
    public final long f131829g;

    /* renamed from: h */
    public final String f131830h;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    private final int f131831q;

    /* renamed from: kotlinx.coroutines.b.a$a */
    public static final class C53232a {
        private C53232a() {
        }

        public /* synthetic */ C53232a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.b.a$b */
    public final class C53233b extends Thread {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater f131832c = AtomicIntegerFieldUpdater.newUpdater(C53233b.class, "terminationState");

        /* renamed from: a */
        public final C53248o f131833a;

        /* renamed from: d */
        private long f131835d;

        /* renamed from: e */
        private long f131836e;

        /* renamed from: f */
        private int f131837f;

        /* renamed from: g */
        private int f131838g;

        /* renamed from: h */
        private int f131839h;
        public volatile int indexInArray;
        public volatile Object nextParkedWorker;
        private volatile int spins;
        public volatile C53234c state;
        private volatile int terminationState;

        /* renamed from: d */
        public final void mo110816d() {
            this.f131837f = C53231a.f131819l;
            this.spins = 0;
        }

        /* renamed from: a */
        public final boolean mo110812a() {
            if (this.state == C53234c.PARKING) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private final boolean m113097g() {
            C53242i a = C53231a.this.f131824a.mo110821a(C53245l.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.f131833a.mo110832a(a, C53231a.this.f131824a);
            return false;
        }

        /* renamed from: c */
        public final boolean mo110815c() {
            if (this.state == C53234c.CPU_ACQUIRED) {
                return true;
            }
            if (!C53231a.this.f131825b.tryAcquire()) {
                return false;
            }
            this.state = C53234c.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: e */
        public final C53242i mo110817e() {
            if (mo110815c()) {
                return m113098h();
            }
            C53242i b = this.f131833a.mo110834b();
            if (b == null) {
                b = C53231a.this.f131824a.mo110821a(C53245l.PROBABLY_BLOCKING);
            }
            return b;
        }

        /* renamed from: h */
        private final C53242i m113098h() {
            boolean z;
            if (m113095b(C53231a.this.f131828f * 2) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C53242i a = C53231a.this.f131824a.mo110821a(C53245l.NON_BLOCKING);
                if (a != null) {
                    return a;
                }
            }
            C53242i b = this.f131833a.mo110834b();
            if (b != null) {
                return b;
            }
            if (!z) {
                C53242i iVar = (C53242i) C53231a.this.f131824a.mo110915b();
                if (iVar != null) {
                    return iVar;
                }
            }
            return m113099i();
        }

        /* renamed from: i */
        private final C53242i m113099i() {
            int a = C53231a.this.mo110803a();
            if (a < 2) {
                return null;
            }
            int i = this.f131839h;
            if (i == 0) {
                i = m113095b(a);
            }
            int i2 = i + 1;
            if (i2 > a) {
                i2 = 1;
            }
            this.f131839h = i2;
            C53233b bVar = C53231a.this.f131826c[i2];
            if (bVar == null || bVar == this || !this.f131833a.mo110833a(bVar.f131833a, C53231a.this.f131824a)) {
                return null;
            }
            return this.f131833a.mo110834b();
        }

        /* renamed from: f */
        private final void m113096f() {
            synchronized (C53231a.this.f131826c) {
                if (!C53231a.this.mo110807b()) {
                    if (C53231a.this.mo110803a() > C53231a.this.f131828f) {
                        if (m113097g()) {
                            if (f131832c.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                m113093a(0);
                                C53231a.this.mo110806a(this, i, 0);
                                int andDecrement = (int) (C53231a.f131815d.getAndDecrement(C53231a.this) & 2097151);
                                if (andDecrement != i) {
                                    C53233b bVar = C53231a.this.f131826c[andDecrement];
                                    if (bVar == null) {
                                        C52711k.m112234a();
                                    }
                                    C53231a.this.f131826c[i] = bVar;
                                    bVar.m113093a(i);
                                    C53231a.this.mo110806a(bVar, andDecrement, i);
                                }
                                C53231a.this.f131826c[andDecrement] = null;
                                this.state = C53234c.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo110814b() {
            int i = this.terminationState;
            switch (i) {
                case -1:
                    return false;
                case 0:
                    return f131832c.compareAndSet(this, 0, -1);
                case 1:
                    return false;
                default:
                    StringBuilder sb = new StringBuilder("Invalid terminationState = ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString().toString());
            }
        }

        public final void run() {
            boolean z;
            boolean z2;
            boolean z3 = false;
            while (!C53231a.this.mo110807b() && this.state != C53234c.TERMINATED) {
                C53242i e = mo110817e();
                if (e == null) {
                    if (this.state == C53234c.CPU_ACQUIRED) {
                        int i = this.spins;
                        if (i <= C53231a.f131817j) {
                            this.spins = i + 1;
                            if (i >= C53231a.f131816i) {
                                Thread.yield();
                            }
                        } else {
                            if (this.f131837f < C53231a.f131818k) {
                                this.f131837f = C52753d.m112322d((this.f131837f * 3) >>> 1, C53231a.f131818k);
                            }
                            mo110813a(C53234c.PARKING);
                            m113094a((long) this.f131837f);
                        }
                    } else {
                        mo110813a(C53234c.PARKING);
                        if (m113097g()) {
                            this.terminationState = 0;
                            if (this.f131835d == 0) {
                                this.f131835d = System.nanoTime() + C53231a.this.f131829g;
                            }
                            if (m113094a(C53231a.this.f131829g) && System.nanoTime() - this.f131835d >= 0) {
                                this.f131835d = 0;
                                m113096f();
                            }
                        }
                    }
                    z3 = true;
                } else {
                    C53245l e2 = e.mo110827e();
                    if (z3) {
                        this.f131835d = 0;
                        this.f131839h = 0;
                        if (this.state == C53234c.PARKING) {
                            if (e2 == C53245l.PROBABLY_BLOCKING) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!C52862z.f131110a || z2) {
                                this.state = C53234c.BLOCKING;
                                this.f131837f = C53231a.f131819l;
                            } else {
                                throw new AssertionError("Assertion failed");
                            }
                        }
                        this.spins = 0;
                        z3 = false;
                    }
                    long j = e.f131857f;
                    if (e2 != C53245l.NON_BLOCKING) {
                        C53231a.f131815d.addAndGet(C53231a.this, 2097152);
                        if (mo110813a(C53234c.BLOCKING)) {
                            C53231a.this.mo110808c();
                        }
                    } else if (C53231a.this.f131825b.availablePermits() != 0) {
                        long a = C53246m.f131867g.mo110826a();
                        if (a - j >= C53246m.f131861a && a - this.f131836e >= C53246m.f131861a * 5) {
                            this.f131836e = a;
                            C53231a.this.mo110808c();
                        }
                    }
                    C53231a.m113082a(e);
                    if (e2 != C53245l.NON_BLOCKING) {
                        C53231a.f131815d.addAndGet(C53231a.this, -2097152);
                        C53234c cVar = this.state;
                        if (cVar == C53234c.TERMINATED) {
                            continue;
                        } else {
                            if (cVar == C53234c.BLOCKING) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!C52862z.f131110a || z) {
                                this.state = C53234c.RETIRING;
                            } else {
                                StringBuilder sb = new StringBuilder("Expected BLOCKING state, but has ");
                                sb.append(cVar);
                                throw new AssertionError(sb.toString());
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            mo110813a(C53234c.TERMINATED);
        }

        /* renamed from: a */
        private final boolean m113094a(long j) {
            C53231a.this.mo110805a(this);
            if (!m113097g()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        private C53233b() {
            setDaemon(true);
            this.f131833a = new C53248o();
            this.state = C53234c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = C53231a.f131820m;
            this.f131837f = C53231a.f131819l;
            this.f131838g = C53231a.this.f131827e.nextInt();
        }

        /* renamed from: a */
        private void m113093a(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(C53231a.this.f131830h);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: b */
        private int m113095b(int i) {
            this.f131838g ^= this.f131838g << 13;
            this.f131838g ^= this.f131838g >> 17;
            this.f131838g ^= this.f131838g << 5;
            int i2 = i - 1;
            if ((i2 & i) == 0) {
                return this.f131838g & i2;
            }
            return (this.f131838g & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final boolean mo110813a(C53234c cVar) {
            boolean z;
            C52711k.m112240b(cVar, "newState");
            C53234c cVar2 = this.state;
            if (cVar2 == C53234c.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C53231a.this.f131825b.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z;
        }

        public C53233b(C53231a aVar, int i) {
            this();
            m113093a(i);
        }
    }

    /* renamed from: kotlinx.coroutines.b.a$c */
    public enum C53234c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    /* renamed from: a */
    public final int mo110803a() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: b */
    public final boolean mo110807b() {
        if (this._isTerminated != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m113085e() {
        while (true) {
            C53233b d = m113084d();
            if (d == null) {
                return false;
            }
            d.mo110816d();
            boolean a = d.mo110812a();
            LockSupport.unpark(d);
            if (a && d.mo110814b()) {
                return true;
            }
        }
    }

    /* renamed from: d */
    private final C53233b m113084d() {
        while (true) {
            long j = this.parkedWorkersStack;
            C53233b bVar = this.f131826c[(int) (2097151 & j)];
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int b = m113083b(bVar);
            if (b >= 0) {
                if (f131822o.compareAndSet(this, j, ((long) b) | j2)) {
                    bVar.nextParkedWorker = f131820m;
                    return bVar;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo110808c() {
        if (this.f131825b.availablePermits() == 0) {
            m113085e();
        } else if (!m113085e()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f131828f) {
                int f = m113086f();
                if (f == 1 && this.f131828f > 1) {
                    m113086f();
                }
                if (f > 0) {
                    return;
                }
            }
            m113085e();
        }
    }

    static {
        int a = C53333v.m113364a("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
        f131816i = a;
        f131817j = a + C53333v.m113364a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m113086f() {
        /*
            r10 = this;
            kotlinx.coroutines.b.a$b[] r0 = r10.f131826c
            monitor-enter(r0)
            boolean r1 = r10.mo110807b()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            r0 = -1
            return r0
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x0081 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0081 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0081 }
            int r1 = r5 - r1
            int r2 = r10.f131828f     // Catch:{ all -> 0x0081 }
            r6 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r6
        L_0x0027:
            int r2 = r10.f131831q     // Catch:{ all -> 0x0081 }
            if (r5 >= r2) goto L_0x007f
            java.util.concurrent.Semaphore r2 = r10.f131825b     // Catch:{ all -> 0x0081 }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0034
            goto L_0x007f
        L_0x0034:
            long r7 = r10.controlState     // Catch:{ all -> 0x0081 }
            long r7 = r7 & r3
            int r2 = (int) r7     // Catch:{ all -> 0x0081 }
            r5 = 1
            int r2 = r2 + r5
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.b.a$b[] r7 = r10.f131826c     // Catch:{ all -> 0x0081 }
            r7 = r7[r2]     // Catch:{ all -> 0x0081 }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x0071
            kotlinx.coroutines.b.a$b r7 = new kotlinx.coroutines.b.a$b     // Catch:{ all -> 0x0081 }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x0081 }
            r7.start()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f131815d     // Catch:{ all -> 0x0081 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0081 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x005a
            r6 = 1
        L_0x005a:
            if (r6 == 0) goto L_0x0063
            kotlinx.coroutines.b.a$b[] r3 = r10.f131826c     // Catch:{ all -> 0x0081 }
            r3[r2] = r7     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r5
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0071:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r0)
            return r6
        L_0x0081:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p2679b.C53231a.m113086f():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r3 == null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f131823p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 == 0) goto L_0x00ba
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.p2679b.C53231a.C53233b
            if (r3 != 0) goto L_0x0013
            r0 = 0
        L_0x0013:
            kotlinx.coroutines.b.a$b r0 = (kotlinx.coroutines.p2679b.C53231a.C53233b) r0
            kotlinx.coroutines.b.a$b[] r3 = r8.f131826c
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00b7 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r4 <= 0) goto L_0x0072
            r3 = 1
        L_0x0023:
            kotlinx.coroutines.b.a$b[] r5 = r8.f131826c
            r5 = r5[r3]
            if (r5 != 0) goto L_0x002c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002c:
            if (r5 == r0) goto L_0x006d
        L_0x002e:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x0040
            r6 = r5
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x002e
        L_0x0040:
            kotlinx.coroutines.b.a$c r6 = r5.state
            kotlinx.coroutines.b.a$c r7 = kotlinx.coroutines.p2679b.C53231a.C53234c.TERMINATED
            if (r6 != r7) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            if (r7 == 0) goto L_0x0053
            kotlinx.coroutines.b.o r5 = r5.f131833a
            kotlinx.coroutines.b.e r6 = r8.f131824a
            r5.mo110831a(r6)
            goto L_0x006d
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected TERMINATED state, but found "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x006d:
            if (r3 == r4) goto L_0x0072
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0072:
            kotlinx.coroutines.b.e r3 = r8.f131824a
            r3.mo110913a()
        L_0x0077:
            if (r0 == 0) goto L_0x007f
            kotlinx.coroutines.b.i r3 = r0.mo110817e()
            if (r3 != 0) goto L_0x0087
        L_0x007f:
            kotlinx.coroutines.b.e r3 = r8.f131824a
            java.lang.Object r3 = r3.mo110915b()
            kotlinx.coroutines.b.i r3 = (kotlinx.coroutines.p2679b.C53242i) r3
        L_0x0087:
            if (r3 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x0090
            kotlinx.coroutines.b.a$c r3 = kotlinx.coroutines.p2679b.C53231a.C53234c.TERMINATED
            r0.mo110813a(r3)
        L_0x0090:
            java.util.concurrent.Semaphore r0 = r8.f131825b
            int r0 = r0.availablePermits()
            int r3 = r8.f131828f
            if (r0 != r3) goto L_0x009b
            r1 = 1
        L_0x009b:
            boolean r0 = p2628d.C52862z.f131110a
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00a2
            goto L_0x00ac
        L_0x00a2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Assertion failed"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00ac:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
            goto L_0x00ba
        L_0x00b3:
            m113082a(r3)
            goto L_0x0077
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p2679b.C53231a.close():void");
    }

    public final String toString() {
        C53233b[] bVarArr;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (C53233b bVar : this.f131826c) {
            if (bVar != null) {
                C53248o oVar = bVar.f131833a;
                if (oVar.lastScheduledTask != null) {
                    i = oVar.mo110830a() + 1;
                } else {
                    i = oVar.mo110830a();
                }
                switch (C53235b.f131841a[bVar.state.ordinal()]) {
                    case 1:
                        i4++;
                        break;
                    case 2:
                        i3++;
                        Collection collection = arrayList;
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf(i));
                        sb.append("b");
                        collection.add(sb.toString());
                        break;
                    case 3:
                        i2++;
                        Collection collection2 = arrayList;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(String.valueOf(i));
                        sb2.append("c");
                        collection2.add(sb2.toString());
                        break;
                    case 4:
                        i5++;
                        if (i <= 0) {
                            break;
                        } else {
                            Collection collection3 = arrayList;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(String.valueOf(i));
                            sb3.append("r");
                            collection3.add(sb3.toString());
                            break;
                        }
                    case 5:
                        i6++;
                        break;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f131830h);
        sb4.append('@');
        sb4.append(C53203ai.m113029a((Object) this));
        sb4.append('[');
        sb4.append("Pool Size {core = ");
        sb4.append(this.f131828f);
        sb4.append(", max = ");
        sb4.append(this.f131831q);
        sb4.append("}, Worker States {");
        sb4.append("CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", retired = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global queue size = ");
        long j2 = ((C53320k) this.f131824a._cur$internal)._state$internal;
        sb4.append(1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0))));
        sb4.append(", Control State Workers {");
        sb4.append("created = ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking = ");
        sb4.append((int) ((j & 4398044413952L) >> 21));
        sb4.append('}');
        sb4.append("]");
        return sb4.toString();
    }

    public final void execute(Runnable runnable) {
        C52711k.m112240b(runnable, "command");
        mo110804a(runnable, (C53243j) C53241h.f131855a, false);
    }

    /* renamed from: a */
    public static void m113082a(C53242i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            C52711k.m112236a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: b */
    private static int m113083b(C53233b bVar) {
        Object obj = bVar.nextParkedWorker;
        while (obj != f131820m) {
            if (obj == null) {
                return 0;
            }
            C53233b bVar2 = (C53233b) obj;
            int i = bVar2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = bVar2.nextParkedWorker;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo110805a(C53233b bVar) {
        long j;
        long j2;
        int i;
        boolean z;
        if (bVar.nextParkedWorker == f131820m) {
            do {
                j = this.parkedWorkersStack;
                int i2 = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                i = bVar.indexInArray;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C52862z.f131110a || z) {
                    bVar.nextParkedWorker = this.f131826c[i2];
                } else {
                    throw new AssertionError("Assertion failed");
                }
            } while (!f131822o.compareAndSet(this, j, ((long) i) | j2));
        }
    }

    /* renamed from: a */
    public static C53242i m113080a(Runnable runnable, C53243j jVar) {
        C52711k.m112240b(runnable, "block");
        C52711k.m112240b(jVar, "taskContext");
        long a = C53246m.f131867g.mo110826a();
        if (!(runnable instanceof C53242i)) {
            return new C53244k(runnable, a, jVar);
        }
        C53242i iVar = (C53242i) runnable;
        iVar.f131857f = a;
        iVar.f131858g = jVar;
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r7.mo110815c() == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110804a(java.lang.Runnable r6, kotlinx.coroutines.p2679b.C53243j r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "block"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "taskContext"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            kotlinx.coroutines.b.i r6 = m113080a(r6, r7)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            boolean r0 = r7 instanceof kotlinx.coroutines.p2679b.C53231a.C53233b
            if (r0 != 0) goto L_0x0017
            r7 = 0
        L_0x0017:
            kotlinx.coroutines.b.a$b r7 = (kotlinx.coroutines.p2679b.C53231a.C53233b) r7
            r0 = -1
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x0020
        L_0x001e:
            r1 = 1
            goto L_0x006c
        L_0x0020:
            kotlinx.coroutines.b.a r3 = kotlinx.coroutines.p2679b.C53231a.this
            r4 = r5
            kotlinx.coroutines.b.a r4 = (kotlinx.coroutines.p2679b.C53231a) r4
            if (r3 == r4) goto L_0x0028
            goto L_0x001e
        L_0x0028:
            kotlinx.coroutines.b.a$c r3 = r7.state
            kotlinx.coroutines.b.a$c r4 = kotlinx.coroutines.p2679b.C53231a.C53234c.TERMINATED
            if (r3 != r4) goto L_0x002f
            goto L_0x001e
        L_0x002f:
            kotlinx.coroutines.b.l r3 = r6.mo110827e()
            kotlinx.coroutines.b.l r4 = kotlinx.coroutines.p2679b.C53245l.NON_BLOCKING
            if (r3 != r4) goto L_0x004b
            kotlinx.coroutines.b.a$c r3 = r7.state
            kotlinx.coroutines.b.a$c r4 = kotlinx.coroutines.p2679b.C53231a.C53234c.BLOCKING
            if (r3 != r4) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x0044
            r3 = 0
            goto L_0x004c
        L_0x0044:
            boolean r3 = r7.mo110815c()
            if (r3 != 0) goto L_0x004b
            goto L_0x001e
        L_0x004b:
            r3 = -1
        L_0x004c:
            if (r8 == 0) goto L_0x0057
            kotlinx.coroutines.b.o r8 = r7.f131833a
            kotlinx.coroutines.b.e r4 = r5.f131824a
            boolean r8 = r8.mo110835b(r6, r4)
            goto L_0x005f
        L_0x0057:
            kotlinx.coroutines.b.o r8 = r7.f131833a
            kotlinx.coroutines.b.e r4 = r5.f131824a
            boolean r8 = r8.mo110832a(r6, r4)
        L_0x005f:
            if (r8 == 0) goto L_0x006c
            kotlinx.coroutines.b.o r7 = r7.f131833a
            int r7 = r7.mo110830a()
            int r8 = kotlinx.coroutines.p2679b.C53246m.f131862b
            if (r7 > r8) goto L_0x006c
            r1 = r3
        L_0x006c:
            if (r1 == r0) goto L_0x009b
            if (r1 == r2) goto L_0x0074
            r5.mo110808c()
            return
        L_0x0074:
            kotlinx.coroutines.b.e r7 = r5.f131824a
            boolean r6 = r7.mo110914a(r6)
            if (r6 == 0) goto L_0x0080
            r5.mo110808c()
            return
        L_0x0080:
            java.util.concurrent.RejectedExecutionException r6 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f131830h
            r7.append(r8)
            java.lang.String r8 = " was terminated"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p2679b.C53231a.mo110804a(java.lang.Runnable, kotlinx.coroutines.b.j, boolean):void");
    }

    /* renamed from: a */
    public final void mo110806a(C53233b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m113083b(bVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f131822o.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public C53231a(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C52711k.m112240b(str, "schedulerName");
        this.f131828f = i;
        this.f131831q = i2;
        this.f131829g = j;
        this.f131830h = str;
        if (this.f131828f > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f131831q >= this.f131828f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f131831q <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f131829g > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f131824a = new C53238e();
                        this.f131825b = new Semaphore(this.f131828f, false);
                        this.parkedWorkersStack = 0;
                        this.f131826c = new C53233b[(this.f131831q + 1)];
                        this.controlState = 0;
                        this.f131827e = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Idle worker keep alive time ");
                    sb.append(this.f131829g);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder("Max pool size ");
                sb2.append(this.f131831q);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(this.f131831q);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.f131828f);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder("Core pool size ");
        sb4.append(this.f131828f);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
}
