package com.facebook.p929d;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.d.a */
public abstract class C13740a<T> implements C13745c<T> {

    /* renamed from: a */
    private C13743a f35734a = C13743a.IN_PROGRESS;

    /* renamed from: b */
    private boolean f35735b;

    /* renamed from: c */
    private T f35736c;

    /* renamed from: d */
    private Throwable f35737d;

    /* renamed from: e */
    private float f35738e;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<C13748e<T>, Executor>> f35739f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.d.a$a */
    enum C13743a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25667a(T t) {
    }

    /* renamed from: a */
    public final synchronized boolean mo25668a() {
        return this.f35735b;
    }

    /* renamed from: d */
    public synchronized T mo25674d() {
        return this.f35736c;
    }

    /* renamed from: e */
    public final synchronized Throwable mo25675e() {
        return this.f35737d;
    }

    /* renamed from: f */
    public final synchronized float mo25676f() {
        return this.f35738e;
    }

    protected C13740a() {
    }

    /* renamed from: h */
    private synchronized boolean mo26238h() {
        boolean z;
        if (this.f35734a == C13743a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo25672b() {
        boolean z;
        if (this.f35734a != C13743a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo25673c() {
        boolean z;
        if (this.f35736c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    private synchronized boolean m27798j() {
        boolean z;
        if (!mo25668a() || mo25672b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    private void m27797i() {
        boolean h = mo26238h();
        boolean j = m27798j();
        Iterator it = this.f35739f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m27792a((C13748e) pair.first, (Executor) pair.second, h, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo25667a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo25672b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        m27797i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f35739f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25677g() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35735b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f35735b = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f35736c     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f35736c = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo25667a((T) r1)
        L_0x0016:
            boolean r1 = r3.mo25672b()
            if (r1 != 0) goto L_0x001f
            r3.m27797i()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r1 = r3.f35739f     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13740a.mo25677g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m27793b(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35735b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            com.facebook.d.a$a r0 = r3.f35734a     // Catch:{ all -> 0x001c }
            com.facebook.d.a$a r2 = com.facebook.p929d.C13740a.C13743a.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f35738e     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f35738e = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13740a.m27793b(float):boolean");
    }

    /* renamed from: b */
    private synchronized boolean mo26237b(Throwable th) {
        if (!this.f35735b) {
            if (this.f35734a == C13743a.IN_PROGRESS) {
                this.f35734a = C13743a.FAILURE;
                this.f35737d = th;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo25669a(float f) {
        boolean b = m27793b(f);
        if (b) {
            Iterator it = this.f35739f.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final C13748e eVar = (C13748e) pair.first;
                ((Executor) pair.second).execute(new Runnable() {
                    public final void run() {
                        eVar.onProgressUpdate(C13740a.this);
                    }
                });
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25671a(Throwable th) {
        boolean b = mo26237b(th);
        if (b) {
            m27797i();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25670a(T t, boolean z) {
        boolean b = m27794b(t, z);
        if (b) {
            m27797i();
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        if (r4 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        mo25667a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0025=Splitter:B:20:0x0025, B:26:0x002d=Splitter:B:26:0x002d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27794b(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f35735b     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            com.facebook.d.a$a r1 = r3.f35734a     // Catch:{ all -> 0x0039 }
            com.facebook.d.a$a r2 = com.facebook.p929d.C13740a.C13743a.IN_PROGRESS     // Catch:{ all -> 0x0039 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.d.a$a r5 = com.facebook.p929d.C13740a.C13743a.SUCCESS     // Catch:{ all -> 0x0039 }
            r3.f35734a = r5     // Catch:{ all -> 0x0039 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f35738e = r5     // Catch:{ all -> 0x0039 }
        L_0x0017:
            T r5 = r3.f35736c     // Catch:{ all -> 0x0039 }
            if (r5 == r4) goto L_0x0024
            T r5 = r3.f35736c     // Catch:{ all -> 0x0039 }
            r3.f35736c = r4     // Catch:{ all -> 0x0021 }
            r4 = r5
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0024:
            r4 = r0
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002b
            r3.mo25667a((T) r4)
        L_0x002b:
            r4 = 1
            return r4
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0033
            r3.mo25667a((T) r4)
        L_0x0033:
            r4 = 0
            return r4
        L_0x0035:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.mo25667a((T) r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13740a.m27794b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        m27792a(r3, r4, mo26238h(), m27798j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25666a(com.facebook.p929d.C13748e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.p920d.C13689i.m27652a(r3)
            com.facebook.common.p920d.C13689i.m27652a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f35735b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.d.a$a r0 = r2.f35734a     // Catch:{ all -> 0x0041 }
            com.facebook.d.a$a r1 = com.facebook.p929d.C13740a.C13743a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r0 = r2.f35739f     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo25673c()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo25672b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m27798j()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.mo26238h()
            boolean r1 = r2.m27798j()
            r2.m27792a(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13740a.mo25666a(com.facebook.d.e, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    private void m27792a(final C13748e<T> eVar, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            public final void run() {
                if (z) {
                    eVar.onFailure(C13740a.this);
                } else if (z2) {
                    eVar.onCancellation(C13740a.this);
                } else {
                    eVar.onNewResult(C13740a.this);
                }
            }
        });
    }
}
