package kotlinx.coroutines;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C53217ao.C53218a;
import kotlinx.coroutines.internal.C53320k;
import kotlinx.coroutines.internal.C53339x;
import kotlinx.coroutines.internal.C53340y;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.C52862z;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.bb */
public abstract class C53250bb extends C53249ba implements C53217ao {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f131875b = AtomicReferenceFieldUpdater.newUpdater(C53250bb.class, Object.class, "_queue");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f131876c = AtomicReferenceFieldUpdater.newUpdater(C53250bb.class, Object.class, "_delayed");
    volatile Object _delayed;
    volatile Object _queue;
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.bb$a */
    final class C53251a extends C53253c {

        /* renamed from: a */
        final /* synthetic */ C53250bb f131877a;

        /* renamed from: c */
        private final C53342j<C52860x> f131878c;

        public final void run() {
            this.f131878c.mo110934a(this.f131877a, C52860x.f131107a);
        }

        public C53251a(C53250bb bbVar, long j, C53342j<? super C52860x> jVar) {
            C52711k.m112240b(jVar, "cont");
            this.f131877a = bbVar;
            super(j);
            this.f131878c = jVar;
            C53344l.m113407a(this.f131878c, this);
        }
    }

    /* renamed from: kotlinx.coroutines.bb$b */
    public static final class C53252b extends C53253c {

        /* renamed from: a */
        private final Runnable f131879a;

        public final void run() {
            this.f131879a.run();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.f131879a.toString());
            return sb.toString();
        }

        public C53252b(long j, Runnable runnable) {
            C52711k.m112240b(runnable, "block");
            super(j);
            this.f131879a = runnable;
        }
    }

    /* renamed from: kotlinx.coroutines.bb$c */
    public static abstract class C53253c implements Comparable<C53253c>, Runnable, C53226aw, C53340y {

        /* renamed from: a */
        private Object f131880a;

        /* renamed from: b */
        public final long f131881b;

        /* renamed from: c */
        private int f131882c = -1;

        /* renamed from: c */
        public final int mo110855c() {
            return this.f131882c;
        }

        /* renamed from: b */
        public final C53339x<?> mo110854b() {
            Object obj = this.f131880a;
            if (!(obj instanceof C53339x)) {
                obj = null;
            }
            return (C53339x) obj;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Delayed[nanos=");
            sb.append(this.f131881b);
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final synchronized void mo110788a() {
            Object obj = this.f131880a;
            if (obj != C53254bc.f131883a) {
                if (!(obj instanceof C53339x)) {
                    obj = null;
                }
                C53339x xVar = (C53339x) obj;
                if (xVar != null) {
                    xVar.mo110927a(this);
                }
                this.f131880a = C53254bc.f131883a;
            }
        }

        /* renamed from: a */
        public final void mo110852a(int i) {
            this.f131882c = i;
        }

        /* renamed from: a */
        public final void mo110853a(C53339x<?> xVar) {
            boolean z;
            if (this.f131880a != C53254bc.f131883a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f131880a = xVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public /* synthetic */ int compareTo(Object obj) {
            C53253c cVar = (C53253c) obj;
            C52711k.m112240b(cVar, "other");
            long j = this.f131881b - cVar.f131881b;
            if (j > 0) {
                return 1;
            }
            if (j < 0) {
                return -1;
            }
            return 0;
        }

        public C53253c(long j) {
            long a = C53293ci.m113275a().mo110775a();
            long j2 = 0;
            if (j > 0) {
                if (j >= 9223372036854L) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = 1000000 * j;
                }
            }
            this.f131881b = a + j2;
        }

        /* renamed from: a */
        public final synchronized int mo110851a(C53339x<C53253c> xVar, C53250bb bbVar) {
            boolean z;
            boolean z2;
            C52711k.m112240b(xVar, "delayed");
            C52711k.m112240b(bbVar, "eventLoop");
            if (this.f131880a == C53254bc.f131883a) {
                return 2;
            }
            T t = this;
            synchronized (xVar) {
                if (!bbVar.isCompleted) {
                    C52711k.m112240b(t, "node");
                    if (t.mo110854b() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        t.mo110853a(xVar);
                        T[] tArr = xVar.f131970a;
                        if (tArr == null) {
                            tArr = new C53340y[4];
                            xVar.f131970a = tArr;
                        } else if (xVar.size >= tArr.length) {
                            T[] copyOf = Arrays.copyOf(tArr, xVar.size * 2);
                            C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
                            xVar.f131970a = (C53340y[]) copyOf;
                            tArr = (C53340y[]) copyOf;
                        }
                        int i = xVar.size;
                        xVar.size = i + 1;
                        tArr[i] = t;
                        t.mo110852a(i);
                        xVar.mo110929b(i);
                        z = true;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                return 0;
            }
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Thread mo110772a();

    /* renamed from: i */
    private final void m113146i() {
        Thread a = mo110772a();
        if (Thread.currentThread() != a) {
            C53293ci.m113275a().mo110778a(a);
        }
    }

    /* renamed from: j */
    private final void m113147j() {
        while (true) {
            C53339x xVar = (C53339x) this._delayed;
            if (xVar != null) {
                C53253c cVar = (C53253c) xVar.mo110930c();
                if (cVar != null) {
                    C53204aj.f131779b.mo110847a(cVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo110840c() {
        if (!mo110844g()) {
            return false;
        }
        C53339x xVar = (C53339x) this._delayed;
        if (xVar != null && !xVar.mo110926a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C53320k) {
            return ((C53320k) obj).mo110918a();
        }
        if (obj == C53254bc.f131884b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo110841d() {
        if (super.mo110841d() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C53320k) {
                if (!((C53320k) obj).mo110918a()) {
                    return 0;
                }
            } else if (obj == C53254bc.f131884b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C53339x xVar = (C53339x) this._delayed;
        if (xVar == null) {
            return Long.MAX_VALUE;
        }
        C53253c cVar = (C53253c) xVar.mo110928b();
        if (cVar == null) {
            return Long.MAX_VALUE;
        }
        return C52753d.m112317a(cVar.f131881b - C53293ci.m113275a().mo110775a(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo110845h() {
        C53291cg.f131915a.set(null);
        this.isCompleted = true;
        boolean z = this.isCompleted;
        if (!C52862z.f131110a || z) {
            while (true) {
                Object obj = this._queue;
                if (obj != null) {
                    if (!(obj instanceof C53320k)) {
                        if (obj == C53254bc.f131884b) {
                            break;
                        }
                        C53320k kVar = new C53320k(8, true);
                        if (obj != null) {
                            kVar.mo110916a((Runnable) obj);
                            if (f131875b.compareAndSet(this, obj, kVar)) {
                                break;
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                        }
                    } else {
                        ((C53320k) obj).mo110919b();
                        break;
                    }
                } else if (f131875b.compareAndSet(this, null, C53254bc.f131884b)) {
                    break;
                }
            }
            do {
            } while (mo110838b() <= 0);
            m113147j();
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fa A[EDGE_INSN: B:80:0x00fa->B:71:0x00fa ?: BREAK  
    EDGE_INSN: B:80:0x00fa->B:71:0x00fa ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo110838b() {
        /*
            r15 = this;
            boolean r0 = r15.mo110842e()
            if (r0 == 0) goto L_0x000b
            long r0 = r15.mo110841d()
            return r0
        L_0x000b:
            java.lang.Object r0 = r15._delayed
            kotlinx.coroutines.internal.x r0 = (kotlinx.coroutines.internal.C53339x) r0
            r1 = 0
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0056
            boolean r5 = r0.mo110926a()
            if (r5 != 0) goto L_0x0056
            kotlinx.coroutines.ch r5 = kotlinx.coroutines.C53293ci.m113275a()
            long r5 = r5.mo110775a()
        L_0x0023:
            monitor-enter(r0)
            kotlinx.coroutines.internal.y r7 = r0.mo110931d()     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x002d
            monitor-exit(r0)
            r7 = r4
            goto L_0x004e
        L_0x002d:
            kotlinx.coroutines.bb$c r7 = (kotlinx.coroutines.C53250bb.C53253c) r7     // Catch:{ all -> 0x0053 }
            long r8 = r7.f131881b     // Catch:{ all -> 0x0053 }
            r10 = 0
            long r8 = r5 - r8
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x003a
            r8 = 1
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0044
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0053 }
            boolean r7 = r15.m113143b(r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x004c
            kotlinx.coroutines.internal.y r7 = r0.mo110925a(r3)     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x004c:
            r7 = r4
        L_0x004d:
            monitor-exit(r0)
        L_0x004e:
            kotlinx.coroutines.bb$c r7 = (kotlinx.coroutines.C53250bb.C53253c) r7
            if (r7 != 0) goto L_0x0023
            goto L_0x0056
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0056:
            java.lang.Object r0 = r15._queue
            if (r0 != 0) goto L_0x005c
            goto L_0x00fa
        L_0x005c:
            boolean r5 = r0 instanceof kotlinx.coroutines.internal.C53320k
            if (r5 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e0
            r5 = r0
            kotlinx.coroutines.internal.k r5 = (kotlinx.coroutines.internal.C53320k) r5
        L_0x0065:
            long r8 = r5._state$internal
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r6 & r8
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0071
            kotlinx.coroutines.internal.u r6 = kotlinx.coroutines.internal.C53320k.f131945e
            goto L_0x00cd
        L_0x0071:
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r8
            long r6 = r6 >> r3
            int r12 = (int) r6
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r8
            r10 = 30
            long r6 = r6 >> r10
            int r6 = (int) r6
            int r7 = r5.f131948a
            r6 = r6 & r7
            int r7 = r5.f131948a
            r7 = r7 & r12
            if (r6 != r7) goto L_0x008b
        L_0x0089:
            r6 = r4
            goto L_0x00cd
        L_0x008b:
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r6 = r5.f131949c
            int r7 = r5.f131948a
            r7 = r7 & r12
            java.lang.Object r13 = r6.get(r7)
            if (r13 != 0) goto L_0x009b
            boolean r6 = r5.f131950d
            if (r6 == 0) goto L_0x0065
            goto L_0x0089
        L_0x009b:
            boolean r6 = r13 instanceof kotlinx.coroutines.internal.C53320k.C53322b
            if (r6 == 0) goto L_0x00a0
            goto L_0x0089
        L_0x00a0:
            int r6 = r12 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r14 = r6 & r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.C53320k.f131944b
            kotlinx.coroutines.internal.k$a r7 = kotlinx.coroutines.internal.C53320k.f131946f
            long r10 = r7.mo110921a(r8, r14)
            r7 = r5
            boolean r6 = r6.compareAndSet(r7, r8, r10)
            if (r6 == 0) goto L_0x00bf
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r6 = r5.f131949c
            int r7 = r5.f131948a
            r7 = r7 & r12
            r6.set(r7, r4)
            goto L_0x00cc
        L_0x00bf:
            boolean r6 = r5.f131950d
            if (r6 == 0) goto L_0x0065
            r6 = r5
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.C53320k) r6
        L_0x00c6:
            kotlinx.coroutines.internal.k r6 = r6.mo110917a(r12, r14)
            if (r6 != 0) goto L_0x00c6
        L_0x00cc:
            r6 = r13
        L_0x00cd:
            kotlinx.coroutines.internal.u r7 = kotlinx.coroutines.internal.C53320k.f131945e
            if (r6 == r7) goto L_0x00d5
            r4 = r6
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x00fa
        L_0x00d5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f131875b
            kotlinx.coroutines.internal.k r5 = r5.mo110920c()
            r6.compareAndSet(r15, r0, r5)
            goto L_0x0056
        L_0x00e0:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */"
            r0.<init>(r1)
            throw r0
        L_0x00e8:
            kotlinx.coroutines.internal.u r5 = kotlinx.coroutines.C53254bc.f131884b
            if (r0 != r5) goto L_0x00ed
            goto L_0x00fa
        L_0x00ed:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f131875b
            boolean r5 = r5.compareAndSet(r15, r0, r4)
            if (r5 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0104
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x00fa:
            if (r4 == 0) goto L_0x00ff
            r4.run()
        L_0x00ff:
            long r0 = r15.mo110841d()
            return r0
        L_0x0104:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53250bb.mo110838b():long");
    }

    /* renamed from: b */
    private final boolean m113144b(C53253c cVar) {
        C53253c cVar2;
        C53339x xVar = (C53339x) this._delayed;
        if (xVar != null) {
            cVar2 = (C53253c) xVar.mo110928b();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final int m113145c(C53253c cVar) {
        if (this.isCompleted) {
            return 1;
        }
        C53339x xVar = (C53339x) this._delayed;
        if (xVar == null) {
            C53250bb bbVar = this;
            f131876c.compareAndSet(bbVar, null, new C53339x());
            Object obj = bbVar._delayed;
            if (obj == null) {
                C52711k.m112234a();
            }
            xVar = (C53339x) obj;
        }
        return cVar.mo110851a(xVar, this);
    }

    /* renamed from: b */
    private final boolean m113143b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f131875b.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C53320k) {
                if (obj != null) {
                    C53320k kVar = (C53320k) obj;
                    switch (kVar.mo110916a(runnable)) {
                        case 0:
                            return true;
                        case 1:
                            f131875b.compareAndSet(this, obj, kVar.mo110920c());
                            break;
                        case 2:
                            return false;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C53254bc.f131884b) {
                return false;
            } else {
                C53320k kVar2 = new C53320k(8, true);
                if (obj != null) {
                    kVar2.mo110916a((Runnable) obj);
                    kVar2.mo110916a(runnable);
                    if (f131875b.compareAndSet(this, obj, kVar2)) {
                        return true;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo110846a(Runnable runnable) {
        C53250bb bbVar = this;
        while (true) {
            C52711k.m112240b(runnable, "task");
            if (bbVar.m113143b(runnable)) {
                bbVar.m113146i();
                return;
            }
            bbVar = C53204aj.f131779b;
        }
    }

    /* renamed from: a */
    public final void mo110847a(C53253c cVar) {
        C52711k.m112240b(cVar, "delayedTask");
        switch (m113145c(cVar)) {
            case 0:
                if (m113144b(cVar)) {
                    m113146i();
                    return;
                }
                return;
            case 1:
                C53204aj.f131779b.mo110847a(cVar);
                return;
            case 2:
                return;
            default:
                throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: a */
    public C53226aw mo110773a(long j, Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        return C53218a.m113056a(this, j, runnable);
    }

    /* renamed from: a */
    public final void mo110784a(long j, C53342j<? super C52860x> jVar) {
        C52711k.m112240b(jVar, "continuation");
        mo110847a((C53253c) new C53251a(this, j, jVar));
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        mo110846a(runnable);
    }
}
