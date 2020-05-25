package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.l */
public final class C2476l<T> {

    /* renamed from: a */
    public Executor f7662a;

    /* renamed from: b */
    final Set<C2473i<T>> f7663b;

    /* renamed from: c */
    public final FutureTask<C2475k<T>> f7664c;

    /* renamed from: d */
    public volatile C2475k<T> f7665d;

    /* renamed from: e */
    private Thread f7666e;

    /* renamed from: f */
    private final Set<C2473i<Throwable>> f7667f;

    /* renamed from: g */
    private final Handler f7668g;

    /* renamed from: c */
    private boolean m7226c() {
        if (this.f7666e == null || !this.f7666e.isAlive()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m7225b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m7226c()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            com.airbnb.lottie.k<T> r0 = r2.f7665d     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            com.airbnb.lottie.l$2 r0 = new com.airbnb.lottie.l$2     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x001e }
            r2.f7666e = r0     // Catch:{ all -> 0x001e }
            java.lang.Thread r0 = r2.f7666e     // Catch:{ all -> 0x001e }
            r0.start()     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C2476l.m7225b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6870a() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m7226c()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.util.Set<com.airbnb.lottie.i<T>> r0 = r1.f7663b     // Catch:{ all -> 0x001f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0015
            com.airbnb.lottie.k<T> r0 = r1.f7665d     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
        L_0x0015:
            java.lang.Thread r0 = r1.f7666e     // Catch:{ all -> 0x001f }
            r0.interrupt()     // Catch:{ all -> 0x001f }
            r0 = 0
            r1.f7666e = r0     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C2476l.mo6870a():void");
    }

    public C2476l(Callable<C2475k<T>> callable) {
        this(callable, false);
    }

    /* renamed from: b */
    public final synchronized C2476l<T> mo6873b(C2473i<T> iVar) {
        this.f7663b.remove(iVar);
        mo6870a();
        return this;
    }

    /* renamed from: d */
    public final synchronized C2476l<T> mo6875d(C2473i<T> iVar) {
        this.f7667f.remove(iVar);
        mo6870a();
        return this;
    }

    /* renamed from: a */
    public final synchronized C2476l<T> mo6869a(C2473i<T> iVar) {
        if (!(this.f7665d == null || this.f7665d.f7660a == null)) {
            iVar.mo6703a(this.f7665d.f7660a);
        }
        this.f7663b.add(iVar);
        m7225b();
        return this;
    }

    /* renamed from: c */
    public final synchronized C2476l<T> mo6874c(C2473i<Throwable> iVar) {
        if (!(this.f7665d == null || this.f7665d.f7661b == null)) {
            iVar.mo6703a(this.f7665d.f7661b);
        }
        this.f7667f.add(iVar);
        m7225b();
        return this;
    }

    /* renamed from: a */
    public final void mo6871a(C2475k<T> kVar) {
        if (this.f7665d == null) {
            this.f7665d = kVar;
            this.f7668g.post(new Runnable() {
                public final void run() {
                    if (C2476l.this.f7665d != null && !C2476l.this.f7664c.isCancelled()) {
                        C2475k<T> kVar = C2476l.this.f7665d;
                        if (kVar.f7660a != null) {
                            C2476l lVar = C2476l.this;
                            V v = kVar.f7660a;
                            for (C2473i a : new ArrayList(lVar.f7663b)) {
                                a.mo6703a(v);
                            }
                            return;
                        }
                        C2476l.this.mo6872a(kVar.f7661b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public final void mo6872a(Throwable th) {
        ArrayList<C2473i> arrayList = new ArrayList<>(this.f7667f);
        if (!arrayList.isEmpty()) {
            for (C2473i a : arrayList) {
                a.mo6703a(th);
            }
        }
    }

    private C2476l(Callable<C2475k<T>> callable, boolean z) {
        this.f7662a = Executors.newCachedThreadPool();
        this.f7663b = new LinkedHashSet(1);
        this.f7667f = new LinkedHashSet(1);
        this.f7668g = new Handler(Looper.getMainLooper());
        this.f7665d = null;
        this.f7664c = new FutureTask<>(callable);
        this.f7662a.execute(this.f7664c);
        m7225b();
    }
}
