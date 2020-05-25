package androidx.work.impl.utils.p058a;

import com.google.p1057b.p1065h.p1066a.C17832m;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.a.a */
public abstract class C1634a<V> implements C17832m<V> {

    /* renamed from: a */
    static final boolean f5749a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final C1636a f5750b;

    /* renamed from: f */
    private static final Logger f5751f = Logger.getLogger(C1634a.class.getName());

    /* renamed from: g */
    private static final Object f5752g = new Object();

    /* renamed from: c */
    volatile Object f5753c;

    /* renamed from: d */
    volatile C1640d f5754d;

    /* renamed from: e */
    volatile C1644h f5755e;

    /* renamed from: androidx.work.impl.utils.a.a$a */
    static abstract class C1636a {
        private C1636a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6049a(C1644h hVar, C1644h hVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6050a(C1644h hVar, Thread thread);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6051a(C1634a<?> aVar, C1640d dVar, C1640d dVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6052a(C1634a<?> aVar, C1644h hVar, C1644h hVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6053a(C1634a<?> aVar, Object obj, Object obj2);
    }

    /* renamed from: androidx.work.impl.utils.a.a$b */
    static final class C1637b {

        /* renamed from: a */
        static final C1637b f5756a;

        /* renamed from: b */
        static final C1637b f5757b;

        /* renamed from: c */
        final boolean f5758c;

        /* renamed from: d */
        final Throwable f5759d;

        static {
            if (C1634a.f5749a) {
                f5757b = null;
                f5756a = null;
                return;
            }
            f5757b = new C1637b(false, null);
            f5756a = new C1637b(true, null);
        }

        C1637b(boolean z, Throwable th) {
            this.f5758c = z;
            this.f5759d = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$c */
    static final class C1638c {

        /* renamed from: a */
        static final C1638c f5760a = new C1638c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f5761b;

        C1638c(Throwable th) {
            this.f5761b = (Throwable) C1634a.m5726b(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$d */
    static final class C1640d {

        /* renamed from: a */
        static final C1640d f5762a = new C1640d(null, null);

        /* renamed from: b */
        final Runnable f5763b;

        /* renamed from: c */
        final Executor f5764c;

        /* renamed from: d */
        C1640d f5765d;

        C1640d(Runnable runnable, Executor executor) {
            this.f5763b = runnable;
            this.f5764c = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$e */
    static final class C1641e extends C1636a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1644h, Thread> f5766a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1644h, C1644h> f5767b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1634a, C1644h> f5768c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1634a, C1640d> f5769d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1634a, Object> f5770e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6049a(C1644h hVar, C1644h hVar2) {
            this.f5767b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6050a(C1644h hVar, Thread thread) {
            this.f5766a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6051a(C1634a<?> aVar, C1640d dVar, C1640d dVar2) {
            return this.f5769d.compareAndSet(aVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6052a(C1634a<?> aVar, C1644h hVar, C1644h hVar2) {
            return this.f5768c.compareAndSet(aVar, hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6053a(C1634a<?> aVar, Object obj, Object obj2) {
            return this.f5770e.compareAndSet(aVar, obj, obj2);
        }

        C1641e(AtomicReferenceFieldUpdater<C1644h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1644h, C1644h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1634a, C1644h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1634a, C1640d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1634a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5766a = atomicReferenceFieldUpdater;
            this.f5767b = atomicReferenceFieldUpdater2;
            this.f5768c = atomicReferenceFieldUpdater3;
            this.f5769d = atomicReferenceFieldUpdater4;
            this.f5770e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$f */
    static final class C1642f<V> implements Runnable {

        /* renamed from: a */
        final C1634a<V> f5771a;

        /* renamed from: b */
        final C17832m<? extends V> f5772b;

        public final void run() {
            if (this.f5771a.f5753c == this) {
                if (C1634a.f5750b.mo6053a(this.f5771a, (Object) this, C1634a.m5725b(this.f5772b))) {
                    C1634a.m5723a(this.f5771a);
                }
            }
        }

        C1642f(C1634a<V> aVar, C17832m<? extends V> mVar) {
            this.f5771a = aVar;
            this.f5772b = mVar;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$g */
    static final class C1643g extends C1636a {
        C1643g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6049a(C1644h hVar, C1644h hVar2) {
            hVar.f5775c = hVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6050a(C1644h hVar, Thread thread) {
            hVar.f5774b = thread;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6051a(C1634a<?> aVar, C1640d dVar, C1640d dVar2) {
            synchronized (aVar) {
                if (aVar.f5754d != dVar) {
                    return false;
                }
                aVar.f5754d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6052a(C1634a<?> aVar, C1644h hVar, C1644h hVar2) {
            synchronized (aVar) {
                if (aVar.f5755e != hVar) {
                    return false;
                }
                aVar.f5755e = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6053a(C1634a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5753c != obj) {
                    return false;
                }
                aVar.f5753c = obj2;
                return true;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$h */
    static final class C1644h {

        /* renamed from: a */
        static final C1644h f5773a = new C1644h(false);

        /* renamed from: b */
        volatile Thread f5774b;

        /* renamed from: c */
        volatile C1644h f5775c;

        C1644h() {
            C1634a.f5750b.mo6050a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6056a() {
            Thread thread = this.f5774b;
            if (thread != null) {
                this.f5774b = null;
                LockSupport.unpark(thread);
            }
        }

        private C1644h(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6057a(C1644h hVar) {
            C1634a.f5750b.mo6049a(this, hVar);
        }
    }

    protected C1634a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6041a(V v) {
        if (v == null) {
            v = f5752g;
        }
        if (!f5750b.mo6053a(this, (Object) null, (Object) v)) {
            return false;
        }
        m5723a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6042a(Throwable th) {
        if (!f5750b.mo6053a(this, (Object) null, (Object) new C1638c((Throwable) m5726b((T) th)))) {
            return false;
        }
        m5723a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6040a(C17832m<? extends V> mVar) {
        C1642f fVar;
        C1638c cVar;
        m5726b((T) mVar);
        Object obj = this.f5753c;
        if (obj == null) {
            if (mVar.isDone()) {
                if (!f5750b.mo6053a(this, (Object) null, m5725b(mVar))) {
                    return false;
                }
                m5723a(this);
                return true;
            }
            fVar = new C1642f(this, mVar);
            if (f5750b.mo6053a(this, (Object) null, (Object) fVar)) {
                try {
                    mVar.mo6039a(fVar, C1645b.INSTANCE);
                } catch (Throwable unused) {
                    cVar = C1638c.f5760a;
                }
                return true;
            }
            obj = this.f5753c;
        }
        if (obj instanceof C1637b) {
            mVar.cancel(((C1637b) obj).f5758c);
        }
        return false;
        f5750b.mo6053a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    public final boolean isCancelled() {
        return this.f5753c instanceof C1637b;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f5753c;
        boolean z2 = false;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(obj instanceof C1642f)) {
            z2 = true;
        }
        return z & z2;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [androidx.work.impl.utils.a.a$g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            f5749a = r0
            java.lang.Class<androidx.work.impl.utils.a.a> r0 = androidx.work.impl.utils.p058a.C1634a.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f5751f = r0
            androidx.work.impl.utils.a.a$e r0 = new androidx.work.impl.utils.a.a$e     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a$h> r1 = androidx.work.impl.utils.p058a.C1634a.C1644h.class
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r3)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a$h> r1 = androidx.work.impl.utils.p058a.C1634a.C1644h.class
            java.lang.Class<androidx.work.impl.utils.a.a$h> r3 = androidx.work.impl.utils.p058a.C1634a.C1644h.class
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r4)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p058a.C1634a.class
            java.lang.Class<androidx.work.impl.utils.a.a$h> r4 = androidx.work.impl.utils.p058a.C1634a.C1644h.class
            java.lang.String r5 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r4, r5)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p058a.C1634a.class
            java.lang.Class<androidx.work.impl.utils.a.a$d> r5 = androidx.work.impl.utils.p058a.C1634a.C1640d.class
            java.lang.String r6 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p058a.C1634a.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.String r7 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r6, r7)     // Catch:{ Throwable -> 0x0054 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            r1 = 0
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            r1 = r0
            androidx.work.impl.utils.a.a$g r0 = new androidx.work.impl.utils.a.a$g
            r0.<init>()
        L_0x005b:
            f5750b = r0
            if (r1 == 0) goto L_0x0068
            java.util.logging.Logger r0 = f5751f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r0.log(r2, r3, r1)
        L_0x0068:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5752g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p058a.C1634a.<clinit>():void");
    }

    /* renamed from: a */
    private void m5721a() {
        C1644h hVar;
        do {
            hVar = this.f5755e;
        } while (!f5750b.mo6052a(this, hVar, C1644h.f5773a));
        while (hVar != null) {
            hVar.mo6056a();
            hVar = hVar.f5775c;
        }
    }

    public final V get() throws InterruptedException, ExecutionException {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5753c;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj2 instanceof C1642f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return m5728c(obj2);
            }
            C1644h hVar = this.f5755e;
            if (hVar != C1644h.f5773a) {
                C1644h hVar2 = new C1644h();
                do {
                    hVar2.mo6057a(hVar);
                    if (f5750b.mo6052a(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5753c;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(obj instanceof C1642f)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                m5722a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & z4));
                        return m5728c(obj);
                    }
                    hVar = this.f5755e;
                } while (hVar != C1644h.f5773a);
            }
            return m5728c(this.f5753c);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5724a(sb);
        } else {
            try {
                Object obj = this.f5753c;
                if (obj instanceof C1642f) {
                    StringBuilder sb2 = new StringBuilder("setFuture=[");
                    sb2.append(m5729d(((C1642f) obj).f5772b));
                    sb2.append("]");
                    str = sb2.toString();
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder sb3 = new StringBuilder("remaining delay=[");
                    sb3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    sb3.append(" ms]");
                    str = sb3.toString();
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                StringBuilder sb4 = new StringBuilder("Exception thrown from implementation: ");
                sb4.append(e.getClass());
                str = sb4.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m5724a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    static <T> T m5726b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    private String m5729d(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C1640d m5718a(C1640d dVar) {
        C1640d dVar2;
        do {
            dVar2 = this.f5754d;
        } while (!f5750b.mo6051a(this, dVar2, C1640d.f5762a));
        C1640d dVar3 = dVar2;
        C1640d dVar4 = dVar;
        C1640d dVar5 = dVar3;
        while (dVar5 != null) {
            C1640d dVar6 = dVar5.f5765d;
            dVar5.f5765d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    /* renamed from: a */
    private static <V> V m5719a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: c */
    private static V m5728c(Object obj) throws ExecutionException {
        if (obj instanceof C1637b) {
            throw m5720a("Task was cancelled.", ((C1637b) obj).f5759d);
        } else if (obj instanceof C1638c) {
            throw new ExecutionException(((C1638c) obj).f5761b);
        } else if (obj == f5752g) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: b */
    static Object m5725b(C17832m<?> mVar) {
        if (mVar instanceof C1634a) {
            Object obj = ((C1634a) mVar).f5753c;
            if (obj instanceof C1637b) {
                C1637b bVar = (C1637b) obj;
                if (bVar.f5758c) {
                    obj = bVar.f5759d != null ? new C1637b(false, bVar.f5759d) : C1637b.f5757b;
                }
            }
            return obj;
        }
        boolean isCancelled = mVar.isCancelled();
        if ((!f5749a) && isCancelled) {
            return C1637b.f5757b;
        }
        try {
            Object a = m5719a((Future<V>) mVar);
            if (a == null) {
                a = f5752g;
            }
            return a;
        } catch (ExecutionException e) {
            return new C1638c(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1637b(false, e2);
            }
            StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(mVar);
            return new C1638c(new IllegalArgumentException(sb.toString(), e2));
        } catch (Throwable th) {
            return new C1638c(th);
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        C1637b bVar;
        boolean z3;
        Object obj = this.f5753c;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof C1642f)) {
            return false;
        }
        if (f5749a) {
            bVar = new C1637b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C1637b.f5756a;
        } else {
            bVar = C1637b.f5757b;
        }
        boolean z4 = false;
        Object obj2 = obj;
        C1634a aVar = this;
        while (true) {
            if (f5750b.mo6053a(aVar, obj2, (Object) bVar)) {
                m5723a(aVar);
                if (!(obj2 instanceof C1642f)) {
                    return true;
                }
                C17832m<? extends V> mVar = ((C1642f) obj2).f5772b;
                if (mVar instanceof C1634a) {
                    aVar = (C1634a) mVar;
                    obj2 = aVar.f5753c;
                    if (obj2 == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj2 instanceof C1642f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    mVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = aVar.f5753c;
                if (!(obj2 instanceof C1642f)) {
                    return z4;
                }
            }
        }
    }

    /* renamed from: a */
    private void m5722a(C1644h hVar) {
        hVar.f5774b = null;
        while (true) {
            C1644h hVar2 = this.f5755e;
            if (hVar2 != C1644h.f5773a) {
                C1644h hVar3 = null;
                while (hVar2 != null) {
                    C1644h hVar4 = hVar2.f5775c;
                    if (hVar2.f5774b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f5775c = hVar4;
                        if (hVar3.f5774b == null) {
                        }
                    } else if (f5750b.mo6052a(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=androidx.work.impl.utils.a.a<?>, code=androidx.work.impl.utils.a.a, for r4v0, types: [androidx.work.impl.utils.a.a, androidx.work.impl.utils.a.a<?>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m5723a(androidx.work.impl.utils.p058a.C1634a r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.m5721a()
            androidx.work.impl.utils.a.a$d r4 = r4.m5718a(r0)
        L_0x0008:
            if (r4 == 0) goto L_0x0030
            androidx.work.impl.utils.a.a$d r0 = r4.f5765d
            java.lang.Runnable r1 = r4.f5763b
            boolean r2 = r1 instanceof androidx.work.impl.utils.p058a.C1634a.C1642f
            if (r2 == 0) goto L_0x0029
            androidx.work.impl.utils.a.a$f r1 = (androidx.work.impl.utils.p058a.C1634a.C1642f) r1
            androidx.work.impl.utils.a.a<V> r4 = r1.f5771a
            java.lang.Object r2 = r4.f5753c
            if (r2 != r1) goto L_0x002e
            com.google.b.h.a.m<? extends V> r2 = r1.f5772b
            java.lang.Object r2 = m5725b(r2)
            androidx.work.impl.utils.a.a$a r3 = f5750b
            boolean r1 = r3.mo6053a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x002e
        L_0x0029:
            java.util.concurrent.Executor r4 = r4.f5764c
            m5727b(r1, r4)
        L_0x002e:
            r4 = r0
            goto L_0x0008
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p058a.C1634a.m5723a(androidx.work.impl.utils.a.a):void");
    }

    /* renamed from: a */
    private void m5724a(StringBuilder sb) {
        try {
            Object a = m5719a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(m5729d(a));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    private static CancellationException m5720a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void m5727b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5751f;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f5753c;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj instanceof C1642f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return m5728c(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C1644h hVar = this.f5755e;
                if (hVar != C1644h.f5773a) {
                    C1644h hVar2 = new C1644h();
                    do {
                        hVar2.mo6057a(hVar);
                        if (f5750b.mo6052a(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5753c;
                                    if (obj2 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!(obj2 instanceof C1642f)) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z6 && z7) {
                                        return m5728c(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m5722a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5722a(hVar2);
                        } else {
                            hVar = this.f5755e;
                        }
                    } while (hVar != C1644h.f5773a);
                }
                return m5728c(this.f5753c);
            }
            while (nanos > 0) {
                Object obj3 = this.f5753c;
                if (obj3 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!(obj3 instanceof C1642f)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 && z5) {
                    return m5728c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                if (convert == 0 || nanos2 > 1000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (convert > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(convert);
                    sb5.append(" ");
                    sb5.append(lowerCase);
                    String sb6 = sb5.toString();
                    if (z3) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append(",");
                        sb6 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(" ");
                    sb4 = sb8.toString();
                }
                if (z3) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(nanos2);
                    sb9.append(" nanoseconds ");
                    sb4 = sb9.toString();
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb4);
                sb10.append("delay)");
                sb2 = sb10.toString();
            }
            if (isDone()) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append(" but future completed as timeout expired");
                throw new TimeoutException(sb11.toString());
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb2);
            sb12.append(" for ");
            sb12.append(aVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public final void mo6039a(Runnable runnable, Executor executor) {
        m5726b((T) runnable);
        m5726b((T) executor);
        C1640d dVar = this.f5754d;
        if (dVar != C1640d.f5762a) {
            C1640d dVar2 = new C1640d(runnable, executor);
            do {
                dVar2.f5765d = dVar;
                if (!f5750b.mo6051a(this, dVar, dVar2)) {
                    dVar = this.f5754d;
                } else {
                    return;
                }
            } while (dVar != C1640d.f5762a);
        }
        m5727b(runnable, executor);
    }
}
