package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15237g;
import com.google.android.gms.common.api.C15237g.C15238a;
import com.google.android.gms.common.api.C15239h;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15456m;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1042c.C16478e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends C15358j> extends C15237g<R> {

    /* renamed from: c */
    static final ThreadLocal<Boolean> f39317c = new C15314cm();

    /* renamed from: a */
    private final Object f39318a;

    /* renamed from: b */
    private final C15241a<R> f39319b;

    /* renamed from: d */
    R f39320d;

    /* renamed from: e */
    private final WeakReference<C15233f> f39321e;

    /* renamed from: f */
    private final CountDownLatch f39322f;

    /* renamed from: g */
    private final ArrayList<C15238a> f39323g;

    /* renamed from: h */
    private C15359k<? super R> f39324h;

    /* renamed from: i */
    private final AtomicReference<C15297bz> f39325i;

    /* renamed from: j */
    private Status f39326j;

    /* renamed from: k */
    private volatile boolean f39327k;

    /* renamed from: l */
    private boolean f39328l;

    /* renamed from: m */
    private boolean f39329m;
    private C15242b mResultGuardian;

    /* renamed from: n */
    private C15456m f39330n;

    /* renamed from: o */
    private volatile C15292bu<R> f39331o;

    /* renamed from: p */
    private boolean f39332p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C15241a<R extends C15358j> extends C16478e {
        public C15241a() {
            this(Looper.getMainLooper());
        }

        public C15241a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo28136a(C15359k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C15359k kVar = (C15359k) pair.first;
                    C15358j jVar = (C15358j) pair.second;
                    try {
                        kVar.mo23334a(jVar);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m31522b(jVar);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).mo28132c(Status.f39268d);
                    return;
                default:
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    final class C15242b {
        private C15242b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m31522b(BasePendingResult.this.f39320d);
            super.finalize();
        }

        /* synthetic */ C15242b(BasePendingResult basePendingResult, C15314cm cmVar) {
            this();
        }
    }

    BasePendingResult() {
        this.f39318a = new Object();
        this.f39322f = new CountDownLatch(1);
        this.f39323g = new ArrayList<>();
        this.f39325i = new AtomicReference<>();
        this.f39332p = false;
        this.f39319b = new C15241a<>(Looper.getMainLooper());
        this.f39321e = new WeakReference<>(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo27968a(Status status);

    /* renamed from: c */
    public final Integer mo28125c() {
        return null;
    }

    protected BasePendingResult(C15233f fVar) {
        this.f39318a = new Object();
        this.f39322f = new CountDownLatch(1);
        this.f39323g = new ArrayList<>();
        this.f39325i = new AtomicReference<>();
        this.f39332p = false;
        this.f39319b = new C15241a<>(fVar != null ? fVar.mo28107c() : Looper.getMainLooper());
        this.f39321e = new WeakReference<>(fVar);
    }

    /* renamed from: d */
    public final boolean mo28133d() {
        return this.f39322f.getCount() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28123a(com.google.android.gms.common.api.C15359k<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f39318a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.f39324h = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.f39327k     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C15464q.m32130a(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.bu<R> r1 = r4.f39331o     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C15464q.m32130a(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.mo28124b()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.mo28133d()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f39319b     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.j r2 = r4.m31524g()     // Catch:{ all -> 0x000a }
            r1.mo28136a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.f39324h = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo28123a(com.google.android.gms.common.api.k):void");
    }

    /* renamed from: a */
    public final void mo28122a(C15238a aVar) {
        C15464q.m32134b(true, "Callback cannot be null.");
        synchronized (this.f39318a) {
            if (mo28133d()) {
                aVar.mo28126a(this.f39326j);
            } else {
                this.f39323g.add(aVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28121a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f39318a
            monitor-enter(r0)
            boolean r1 = r2.f39328l     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f39327k     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.f39320d     // Catch:{ all -> 0x0021 }
            m31522b(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f39328l = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f39269e     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.j r1 = r2.mo27968a(r1)     // Catch:{ all -> 0x0021 }
            r2.m31523c((R) r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo28121a():void");
    }

    /* renamed from: e */
    public final boolean mo28134e() {
        boolean b;
        synchronized (this.f39318a) {
            if (((C15233f) this.f39321e.get()) == null || !this.f39332p) {
                mo28121a();
            }
            b = mo28124b();
        }
        return b;
    }

    /* renamed from: b */
    public final boolean mo28124b() {
        boolean z;
        synchronized (this.f39318a) {
            z = this.f39328l;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo28131a(R r) {
        synchronized (this.f39318a) {
            if (this.f39329m || this.f39328l) {
                m31522b(r);
                return;
            }
            mo28133d();
            C15464q.m32130a(!mo28133d(), (Object) "Results have already been set");
            C15464q.m32130a(!this.f39327k, (Object) "Result has already been consumed");
            m31523c(r);
        }
    }

    /* renamed from: c */
    public final void mo28132c(Status status) {
        synchronized (this.f39318a) {
            if (!mo28133d()) {
                mo28131a((R) mo27968a(status));
                this.f39329m = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo28130a(C15297bz bzVar) {
        this.f39325i.set(bzVar);
    }

    /* renamed from: f */
    public final void mo28135f() {
        this.f39332p = this.f39332p || ((Boolean) f39317c.get()).booleanValue();
    }

    /* renamed from: g */
    private final R m31524g() {
        R r;
        synchronized (this.f39318a) {
            C15464q.m32130a(!this.f39327k, (Object) "Result has already been consumed.");
            C15464q.m32130a(mo28133d(), (Object) "Result is not ready.");
            r = this.f39320d;
            this.f39320d = null;
            this.f39324h = null;
            this.f39327k = true;
        }
        C15297bz bzVar = (C15297bz) this.f39325i.getAndSet(null);
        if (bzVar != null) {
            bzVar.mo28227a(this);
        }
        return r;
    }

    /* renamed from: c */
    private final void m31523c(R r) {
        this.f39320d = r;
        this.f39330n = null;
        this.f39322f.countDown();
        this.f39326j = this.f39320d.mo27935a();
        if (this.f39328l) {
            this.f39324h = null;
        } else if (this.f39324h != null) {
            this.f39319b.removeMessages(2);
            this.f39319b.mo28136a(this.f39324h, m31524g());
        } else if (this.f39320d instanceof C15239h) {
            this.mResultGuardian = new C15242b(this, null);
        }
        ArrayList arrayList = this.f39323g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C15238a) obj).mo28126a(this.f39326j);
        }
        this.f39323g.clear();
    }

    /* renamed from: b */
    public static void m31522b(C15358j jVar) {
        if (jVar instanceof C15239h) {
            try {
                ((C15239h) jVar).mo28127b();
            } catch (RuntimeException unused) {
            }
        }
    }
}
