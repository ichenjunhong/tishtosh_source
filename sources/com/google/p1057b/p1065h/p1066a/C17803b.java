package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17405c;
import com.google.p1057b.p1058a.C17421k;
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
import sun.misc.Unsafe;

/* renamed from: com.google.b.h.a.b */
public abstract class C17803b<V> extends C17823g<V> {

    /* renamed from: a */
    private static final Logger f49550a = Logger.getLogger(C17803b.class.getName());

    /* renamed from: b */
    private static final Object f49551b = new Object();

    /* renamed from: d */
    public static final boolean f49552d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final C17805a f49553e;

    /* renamed from: f */
    public volatile Object f49554f;

    /* renamed from: g */
    public volatile C17809d f49555g;

    /* renamed from: h */
    public volatile C17816j f49556h;

    /* renamed from: com.google.b.h.a.b$a */
    static abstract class C17805a {
        private C17805a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo34632a(C17816j jVar, C17816j jVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo34633a(C17816j jVar, Thread thread);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo34634a(C17803b<?> bVar, C17809d dVar, C17809d dVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo34635a(C17803b<?> bVar, C17816j jVar, C17816j jVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo34636a(C17803b<?> bVar, Object obj, Object obj2);
    }

    /* renamed from: com.google.b.h.a.b$b */
    static final class C17806b {

        /* renamed from: a */
        static final C17806b f49557a;

        /* renamed from: b */
        static final C17806b f49558b;

        /* renamed from: c */
        final boolean f49559c;

        /* renamed from: d */
        final Throwable f49560d;

        static {
            if (C17803b.f49552d) {
                f49558b = null;
                f49557a = null;
                return;
            }
            f49558b = new C17806b(false, null);
            f49557a = new C17806b(true, null);
        }

        C17806b(boolean z, Throwable th) {
            this.f49559c = z;
            this.f49560d = th;
        }
    }

    /* renamed from: com.google.b.h.a.b$c */
    static final class C17807c {

        /* renamed from: a */
        static final C17807c f49561a = new C17807c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f49562b;

        C17807c(Throwable th) {
            this.f49562b = (Throwable) C17421k.m42653a(th);
        }
    }

    /* renamed from: com.google.b.h.a.b$d */
    static final class C17809d {

        /* renamed from: a */
        static final C17809d f49563a = new C17809d(null, null);

        /* renamed from: b */
        final Runnable f49564b;

        /* renamed from: c */
        final Executor f49565c;

        /* renamed from: d */
        C17809d f49566d;

        C17809d(Runnable runnable, Executor executor) {
            this.f49564b = runnable;
            this.f49565c = executor;
        }
    }

    /* renamed from: com.google.b.h.a.b$e */
    static final class C17810e extends C17805a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C17816j, Thread> f49567a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C17816j, C17816j> f49568b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C17803b, C17816j> f49569c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C17803b, C17809d> f49570d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C17803b, Object> f49571e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34632a(C17816j jVar, C17816j jVar2) {
            this.f49568b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34633a(C17816j jVar, Thread thread) {
            this.f49567a.lazySet(jVar, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34634a(C17803b<?> bVar, C17809d dVar, C17809d dVar2) {
            return this.f49570d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34635a(C17803b<?> bVar, C17816j jVar, C17816j jVar2) {
            return this.f49569c.compareAndSet(bVar, jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34636a(C17803b<?> bVar, Object obj, Object obj2) {
            return this.f49571e.compareAndSet(bVar, obj, obj2);
        }

        C17810e(AtomicReferenceFieldUpdater<C17816j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C17816j, C17816j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C17803b, C17816j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C17803b, C17809d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C17803b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f49567a = atomicReferenceFieldUpdater;
            this.f49568b = atomicReferenceFieldUpdater2;
            this.f49569c = atomicReferenceFieldUpdater3;
            this.f49570d = atomicReferenceFieldUpdater4;
            this.f49571e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: com.google.b.h.a.b$f */
    static final class C17811f<V> implements Runnable {

        /* renamed from: a */
        final C17803b<V> f49572a;

        /* renamed from: b */
        final C17832m<? extends V> f49573b;

        public final void run() {
            if (this.f49572a.f49554f == this) {
                if (C17803b.f49553e.mo34636a(this.f49572a, (Object) this, C17803b.m43690b(this.f49573b))) {
                    C17803b.m43688a(this.f49572a);
                }
            }
        }

        C17811f(C17803b<V> bVar, C17832m<? extends V> mVar) {
            this.f49572a = bVar;
            this.f49573b = mVar;
        }
    }

    /* renamed from: com.google.b.h.a.b$g */
    static final class C17812g extends C17805a {
        private C17812g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34632a(C17816j jVar, C17816j jVar2) {
            jVar.f49582c = jVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34633a(C17816j jVar, Thread thread) {
            jVar.f49581b = thread;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34634a(C17803b<?> bVar, C17809d dVar, C17809d dVar2) {
            synchronized (bVar) {
                if (bVar.f49555g != dVar) {
                    return false;
                }
                bVar.f49555g = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34635a(C17803b<?> bVar, C17816j jVar, C17816j jVar2) {
            synchronized (bVar) {
                if (bVar.f49556h != jVar) {
                    return false;
                }
                bVar.f49556h = jVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34636a(C17803b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f49554f != obj) {
                    return false;
                }
                bVar.f49554f = obj2;
                return true;
            }
        }
    }

    /* renamed from: com.google.b.h.a.b$h */
    static abstract class C17813h<V> extends C17803b<V> {
        C17813h() {
        }

        public final V get() throws InterruptedException, ExecutionException {
            return C17803b.super.get();
        }

        public final boolean isCancelled() {
            return C17803b.super.isCancelled();
        }

        public final boolean isDone() {
            return C17803b.super.isDone();
        }

        public final boolean cancel(boolean z) {
            return C17803b.super.cancel(z);
        }

        /* renamed from: a */
        public final void mo6039a(Runnable runnable, Executor executor) {
            C17803b.super.mo6039a(runnable, executor);
        }

        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return C17803b.super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.b.h.a.b$i */
    static final class C17814i extends C17805a {

        /* renamed from: a */
        static final Unsafe f49574a;

        /* renamed from: b */
        static final long f49575b;

        /* renamed from: c */
        static final long f49576c;

        /* renamed from: d */
        static final long f49577d;

        /* renamed from: e */
        static final long f49578e;

        /* renamed from: f */
        static final long f49579f;

        private C17814i() {
            super();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.p1057b.p1065h.p1066a.C17803b.C17814i.C178151());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.b.h.a.b$i$1 r0 = new com.google.b.h.a.b$i$1     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<com.google.b.h.a.b> r1 = com.google.p1057b.p1065h.p1066a.C17803b.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f49576c = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f49575b = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49577d = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.b.h.a.b$j> r1 = com.google.p1057b.p1065h.p1066a.C17803b.C17816j.class
                java.lang.String r2 = "b"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49578e = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.b.h.a.b$j> r1 = com.google.p1057b.p1065h.p1066a.C17803b.C17816j.class
                java.lang.String r2 = "c"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49579f = r1     // Catch:{ Exception -> 0x0055 }
                f49574a = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                com.google.p1057b.p1058a.C17437s.m42686a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1065h.p1066a.C17803b.C17814i.<clinit>():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34632a(C17816j jVar, C17816j jVar2) {
            f49574a.putObject(jVar, f49579f, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34633a(C17816j jVar, Thread thread) {
            f49574a.putObject(jVar, f49578e, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34634a(C17803b<?> bVar, C17809d dVar, C17809d dVar2) {
            return f49574a.compareAndSwapObject(bVar, f49575b, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34635a(C17803b<?> bVar, C17816j jVar, C17816j jVar2) {
            return f49574a.compareAndSwapObject(bVar, f49576c, jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34636a(C17803b<?> bVar, Object obj, Object obj2) {
            return f49574a.compareAndSwapObject(bVar, f49577d, obj, obj2);
        }
    }

    /* renamed from: com.google.b.h.a.b$j */
    static final class C17816j {

        /* renamed from: a */
        static final C17816j f49580a = new C17816j(false);

        /* renamed from: b */
        volatile Thread f49581b;

        /* renamed from: c */
        volatile C17816j f49582c;

        C17816j() {
            C17803b.f49553e.mo34633a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34640a() {
            Thread thread = this.f49581b;
            if (thread != null) {
                this.f49581b = null;
                LockSupport.unpark(thread);
            }
        }

        private C17816j(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34641a(C17816j jVar) {
            C17803b.f49553e.mo34632a(this, jVar);
        }
    }

    protected C17803b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34619b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34625c() {
    }

    /* renamed from: a */
    public boolean mo34623a(Throwable th) {
        if (!f49553e.mo34636a(this, (Object) null, (Object) new C17807c((Throwable) C17421k.m42653a(th)))) {
            return false;
        }
        m43688a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34622a(C17832m<? extends V> mVar) {
        C17811f fVar;
        C17807c cVar;
        C17421k.m42653a(mVar);
        Object obj = this.f49554f;
        if (obj == null) {
            if (mVar.isDone()) {
                if (!f49553e.mo34636a(this, (Object) null, m43690b(mVar))) {
                    return false;
                }
                m43688a(this);
                return true;
            }
            fVar = new C17811f(this, mVar);
            if (f49553e.mo34636a(this, (Object) null, (Object) fVar)) {
                try {
                    mVar.mo6039a(fVar, C17833n.m43743a());
                } catch (Throwable unused) {
                    cVar = C17807c.f49561a;
                }
                return true;
            }
            obj = this.f49554f;
        }
        if (obj instanceof C17806b) {
            mVar.cancel(((C17806b) obj).f49559c);
        }
        return false;
        f49553e.mo34636a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34621a(Future<?> future) {
        boolean z = false;
        if ((future != null) && isCancelled()) {
            Object obj = this.f49554f;
            if ((obj instanceof C17806b) && ((C17806b) obj).f49559c) {
                z = true;
            }
            future.cancel(z);
        }
    }

    public boolean isCancelled() {
        return this.f49554f instanceof C17806b;
    }

    /* renamed from: d */
    private void mo87844d() {
        C17816j jVar;
        do {
            jVar = this.f49556h;
        } while (!f49553e.mo34635a(this, jVar, C17816j.f49580a));
        while (jVar != null) {
            jVar.mo34640a();
            jVar = jVar.f49582c;
        }
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f49554f;
        boolean z2 = false;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(obj instanceof C17811f)) {
            z2 = true;
        }
        return z & z2;
    }

    public V get() throws InterruptedException, ExecutionException {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f49554f;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj2 instanceof C17811f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return mo34618a(obj2);
            }
            C17816j jVar = this.f49556h;
            if (jVar != C17816j.f49580a) {
                C17816j jVar2 = new C17816j();
                do {
                    jVar2.mo34641a(jVar);
                    if (f49553e.mo34635a(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f49554f;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(obj instanceof C17811f)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                m43687a(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & z4));
                        return mo34618a(obj);
                    }
                    jVar = this.f49556h;
                } while (jVar != C17816j.f49580a);
            }
            return mo34618a(this.f49554f);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m43689a(sb);
        } else {
            try {
                str = mo34617a();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                str = sb2.toString();
            }
            if (str == null || str.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m43689a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        Throwable th;
        C17805a aVar;
        Throwable th2 = null;
        try {
            th = null;
            aVar = new C17814i();
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            aVar = new C17812g();
        }
        f49553e = aVar;
        if (th2 != null) {
            f49550a.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f49550a.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo34617a() {
        Object obj = this.f49554f;
        if (obj instanceof C17811f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            sb.append(m43692c(((C17811f) obj).f49573b));
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("remaining delay=[");
            sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
    }

    /* renamed from: c */
    private String m43692c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C17809d m43684a(C17809d dVar) {
        C17809d dVar2;
        do {
            dVar2 = this.f49555g;
        } while (!f49553e.mo34634a(this, dVar2, C17809d.f49563a));
        C17809d dVar3 = dVar2;
        C17809d dVar4 = dVar;
        C17809d dVar5 = dVar3;
        while (dVar5 != null) {
            C17809d dVar6 = dVar5.f49566d;
            dVar5.f49566d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    /* renamed from: b */
    public boolean mo34624b(V v) {
        if (v == null) {
            v = f49551b;
        }
        if (!f49553e.mo34636a(this, (Object) null, (Object) v)) {
            return false;
        }
        m43688a(this);
        return true;
    }

    /* renamed from: a */
    private static V mo34618a(Object obj) throws ExecutionException {
        if (obj instanceof C17806b) {
            throw m43686a("Task was cancelled.", ((C17806b) obj).f49560d);
        } else if (obj instanceof C17807c) {
            throw new ExecutionException(((C17807c) obj).f49562b);
        } else if (obj == f49551b) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    private void m43687a(C17816j jVar) {
        jVar.f49581b = null;
        while (true) {
            C17816j jVar2 = this.f49556h;
            if (jVar2 != C17816j.f49580a) {
                C17816j jVar3 = null;
                while (jVar2 != null) {
                    C17816j jVar4 = jVar2.f49582c;
                    if (jVar2.f49581b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f49582c = jVar4;
                        if (jVar3.f49581b == null) {
                        }
                    } else if (f49553e.mo34635a(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: b */
    public static Object m43690b(C17832m<?> mVar) {
        Object obj;
        if (mVar instanceof C17813h) {
            Object obj2 = ((C17803b) mVar).f49554f;
            if (obj2 instanceof C17806b) {
                C17806b bVar = (C17806b) obj2;
                if (bVar.f49559c) {
                    obj2 = bVar.f49560d != null ? new C17806b(false, bVar.f49560d) : C17806b.f49558b;
                }
            }
            return obj2;
        }
        try {
            Object a = C17825i.m43738a((Future<V>) mVar);
            if (a == null) {
                a = f49551b;
            }
            obj = a;
        } catch (ExecutionException e) {
            obj = new C17807c(e.getCause());
        } catch (CancellationException e2) {
            obj = new C17806b(false, e2);
        } catch (Throwable th) {
            obj = new C17807c(th);
        }
        return obj;
    }

    public boolean cancel(boolean z) {
        boolean z2;
        C17806b bVar;
        boolean z3;
        Object obj = this.f49554f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof C17811f)) {
            return false;
        }
        if (f49552d) {
            bVar = new C17806b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C17806b.f49557a;
        } else {
            bVar = C17806b.f49558b;
        }
        boolean z4 = false;
        Object obj2 = obj;
        C17803b bVar2 = this;
        while (true) {
            if (f49553e.mo34636a(bVar2, obj2, (Object) bVar)) {
                if (z) {
                    bVar2.mo34625c();
                }
                m43688a(bVar2);
                if (!(obj2 instanceof C17811f)) {
                    return true;
                }
                C17832m<? extends V> mVar = ((C17811f) obj2).f49573b;
                if (mVar instanceof C17813h) {
                    bVar2 = (C17803b) mVar;
                    obj2 = bVar2.f49554f;
                    if (obj2 == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj2 instanceof C17811f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    mVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = bVar2.f49554f;
                if (!(obj2 instanceof C17811f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.b.h.a.b<?>, code=com.google.b.h.a.b, for r4v0, types: [com.google.b.h.a.b<?>, com.google.b.h.a.b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43688a(com.google.p1057b.p1065h.p1066a.C17803b r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.mo87844d()
            r4.mo34619b()
            com.google.b.h.a.b$d r4 = r4.m43684a(r0)
        L_0x000b:
            if (r4 == 0) goto L_0x0033
            com.google.b.h.a.b$d r0 = r4.f49566d
            java.lang.Runnable r1 = r4.f49564b
            boolean r2 = r1 instanceof com.google.p1057b.p1065h.p1066a.C17803b.C17811f
            if (r2 == 0) goto L_0x002c
            com.google.b.h.a.b$f r1 = (com.google.p1057b.p1065h.p1066a.C17803b.C17811f) r1
            com.google.b.h.a.b<V> r4 = r1.f49572a
            java.lang.Object r2 = r4.f49554f
            if (r2 != r1) goto L_0x0031
            com.google.b.h.a.m<? extends V> r2 = r1.f49573b
            java.lang.Object r2 = m43690b(r2)
            com.google.b.h.a.b$a r3 = f49553e
            boolean r1 = r3.mo34636a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x0031
        L_0x002c:
            java.util.concurrent.Executor r4 = r4.f49565c
            mo87843b(r1, r4)
        L_0x0031:
            r4 = r0
            goto L_0x000b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1065h.p1066a.C17803b.m43688a(com.google.b.h.a.b):void");
    }

    /* renamed from: a */
    private void m43689a(StringBuilder sb) {
        try {
            Object a = C17825i.m43738a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(m43692c(a));
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
    private static CancellationException m43686a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void mo87843b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49550a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j3 = j;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f49554f;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj instanceof C17811f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return mo34618a(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C17816j jVar = this.f49556h;
                if (jVar != C17816j.f49580a) {
                    C17816j jVar2 = new C17816j();
                    do {
                        jVar2.mo34641a(jVar);
                        if (f49553e.mo34635a(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f49554f;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!(obj2 instanceof C17811f)) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z5 && z6) {
                                        return mo34618a(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m43687a(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m43687a(jVar2);
                        } else {
                            jVar = this.f49556h;
                        }
                    } while (jVar != C17816j.f49580a);
                }
                return mo34618a(this.f49554f);
            }
            while (nanos > 0) {
                Object obj3 = this.f49554f;
                if (obj3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(obj3 instanceof C17811f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && z4) {
                    return mo34618a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            if (isDone()) {
                StringBuilder sb = new StringBuilder("Waited ");
                sb.append(j3);
                sb.append(" ");
                sb.append(C17405c.m42620a(timeUnit.toString()));
                sb.append(" but future completed as timeout expired");
                throw new TimeoutException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("Waited ");
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(C17405c.m42620a(timeUnit.toString()));
            sb2.append(" for ");
            sb2.append(bVar);
            throw new TimeoutException(sb2.toString());
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public void mo6039a(Runnable runnable, Executor executor) {
        C17421k.m42654a(runnable, (Object) "Runnable was null.");
        C17421k.m42654a(executor, (Object) "Executor was null.");
        C17809d dVar = this.f49555g;
        if (dVar != C17809d.f49563a) {
            C17809d dVar2 = new C17809d(runnable, executor);
            do {
                dVar2.f49566d = dVar;
                if (!f49553e.mo34634a(this, dVar, dVar2)) {
                    dVar = this.f49555g;
                } else {
                    return;
                }
            } while (dVar != C17809d.f49563a);
        }
        mo87843b(runnable, executor);
    }
}
