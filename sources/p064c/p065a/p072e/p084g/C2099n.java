package p064c.p065a.p072e.p084g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1717a;

/* renamed from: c.a.e.g.n */
public final class C2099n extends AtomicReferenceArray<Object> implements C1690c, Runnable, Callable<Object> {

    /* renamed from: b */
    static final Object f6815b = new Object();

    /* renamed from: c */
    static final Object f6816c = new Object();

    /* renamed from: d */
    static final Object f6817d = new Object();

    /* renamed from: e */
    static final Object f6818e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a */
    final Runnable f6819a;

    public final Object call() {
        run();
        return null;
    }

    public final boolean isDisposed() {
        Object obj = get(0);
        if (obj == f6815b || obj == f6818e) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f6818e
            r3 = 0
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = f6816c
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = f6817d
            if (r1 == r2) goto L_0x0034
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r4 = f6817d
            goto L_0x0027
        L_0x0025:
            java.lang.Object r4 = f6816c
        L_0x0027:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0034
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0034:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f6818e
            if (r0 == r1) goto L_0x0051
            java.lang.Object r1 = f6815b
            if (r0 == r1) goto L_0x0051
            if (r0 != 0) goto L_0x0043
            goto L_0x0051
        L_0x0043:
            java.lang.Object r1 = f6815b
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0034
            c.a.e.a.a r0 = (p064c.p065a.p072e.p073a.C1717a) r0
            r0.mo6184c(r5)
            return
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p084g.C2099n.dispose():void");
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f6819a.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f6815b || !compareAndSet(0, obj3, f6818e) || obj3 == null)) {
                ((C1717a) obj3).mo6184c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f6816c || obj2 == f6817d) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f6818e));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f6815b || !compareAndSet(0, obj4, f6818e) || obj4 == null)) {
            ((C1717a) obj4).mo6184c(this);
        }
        do {
            obj = get(1);
            if (obj == f6816c || obj == f6817d) {
                return;
            }
        } while (!compareAndSet(1, obj, f6818e));
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f6818e) {
                if (obj == f6816c) {
                    future.cancel(false);
                    return;
                } else if (obj == f6817d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public C2099n(Runnable runnable, C1717a aVar) {
        super(3);
        this.f6819a = runnable;
        lazySet(0, aVar);
    }
}
