package com.facebook.imagepipeline.p974n;

import android.os.SystemClock;
import com.facebook.imagepipeline.p970j.C14044e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.n.w */
public final class C14212w {

    /* renamed from: a */
    final Executor f37099a;

    /* renamed from: b */
    final C14216a f37100b;

    /* renamed from: c */
    final Runnable f37101c = new Runnable() {
        public final void run() {
            C14044e eVar;
            int i;
            C14212w wVar = C14212w.this;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (wVar) {
                eVar = wVar.f37102d;
                i = wVar.f37103e;
                wVar.f37102d = null;
                wVar.f37103e = 0;
                wVar.f37104f = C14218c.RUNNING;
                wVar.f37106h = uptimeMillis;
            }
            try {
                if (C14212w.m29147b(eVar, i)) {
                    wVar.f37100b.mo26393a(eVar, i);
                }
            } finally {
                C14044e.m28705d(eVar);
                wVar.mo26427c();
            }
        }
    };

    /* renamed from: d */
    C14044e f37102d = null;

    /* renamed from: e */
    int f37103e = 0;

    /* renamed from: f */
    C14218c f37104f = C14218c.IDLE;

    /* renamed from: g */
    long f37105g = 0;

    /* renamed from: h */
    long f37106h = 0;

    /* renamed from: i */
    private final Runnable f37107i = new Runnable() {
        public final void run() {
            C14212w wVar = C14212w.this;
            wVar.f37099a.execute(wVar.f37101c);
        }
    };

    /* renamed from: j */
    private final int f37108j;

    /* renamed from: com.facebook.imagepipeline.n.w$a */
    public interface C14216a {
        /* renamed from: a */
        void mo26393a(C14044e eVar, int i);
    }

    /* renamed from: com.facebook.imagepipeline.n.w$b */
    static class C14217b {

        /* renamed from: a */
        private static ScheduledExecutorService f37112a;

        /* renamed from: a */
        static ScheduledExecutorService m29154a() {
            if (f37112a == null) {
                f37112a = C14219x.m29155a();
            }
            return f37112a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.w$c */
    enum C14218c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* renamed from: d */
    public final synchronized long mo26428d() {
        return this.f37106h - this.f37105g;
    }

    /* renamed from: a */
    public final void mo26424a() {
        C14044e eVar;
        synchronized (this) {
            eVar = this.f37102d;
            this.f37102d = null;
            this.f37103e = 0;
        }
        C14044e.m28705d(eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo26427c() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f37104f == C14218c.RUNNING_AND_PENDING) {
                j = Math.max(this.f37106h + ((long) this.f37108j), uptimeMillis);
                z = true;
                this.f37105g = uptimeMillis;
                this.f37104f = C14218c.QUEUED;
            } else {
                this.f37104f = C14218c.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m29146a(j - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        m29146a(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26426b() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            com.facebook.imagepipeline.j.e r2 = r7.f37102d     // Catch:{ all -> 0x0043 }
            int r3 = r7.f37103e     // Catch:{ all -> 0x0043 }
            boolean r2 = m29147b(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.p974n.C14212w.C142153.f37111a     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.n.w$c r4 = r7.f37104f     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            switch(r2) {
                case 1: goto L_0x0026;
                case 2: goto L_0x0039;
                case 3: goto L_0x0021;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x0043 }
        L_0x0020:
            goto L_0x0039
        L_0x0021:
            com.facebook.imagepipeline.n.w$c r2 = com.facebook.imagepipeline.p974n.C14212w.C14218c.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.f37104f = r2     // Catch:{ all -> 0x0043 }
            goto L_0x0039
        L_0x0026:
            long r2 = r7.f37106h     // Catch:{ all -> 0x0043 }
            int r5 = r7.f37108j     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.f37105g = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.n.w$c r5 = com.facebook.imagepipeline.p974n.C14212w.C14218c.QUEUED     // Catch:{ all -> 0x0043 }
            r7.f37104f = r5     // Catch:{ all -> 0x0043 }
            r5 = r2
            r3 = 1
            goto L_0x003b
        L_0x0039:
            r5 = 0
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.m29146a(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14212w.mo26426b():boolean");
    }

    /* renamed from: a */
    private void m29146a(long j) {
        if (j > 0) {
            C14217b.m29154a().schedule(this.f37107i, j, TimeUnit.MILLISECONDS);
        } else {
            this.f37107i.run();
        }
    }

    /* renamed from: b */
    static boolean m29147b(C14044e eVar, int i) {
        if (C14168b.m29025a(i) || C14168b.m29026a(i, 4) || C14044e.m28706e(eVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo26425a(C14044e eVar, int i) {
        C14044e eVar2;
        if (!m29147b(eVar, i)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f37102d;
            this.f37102d = C14044e.m28703a(eVar);
            this.f37103e = i;
        }
        C14044e.m28705d(eVar2);
        return true;
    }

    public C14212w(Executor executor, C14216a aVar, int i) {
        this.f37099a = executor;
        this.f37100b = aVar;
        this.f37108j = i;
    }
}
