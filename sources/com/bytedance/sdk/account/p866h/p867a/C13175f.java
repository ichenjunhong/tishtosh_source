package com.bytedance.sdk.account.p866h.p867a;

import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.sdk.account.p866h.p867a.C13173e.C13174a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.account.h.a.f */
public class C13175f {

    /* renamed from: a */
    private static AtomicInteger f34390a = new AtomicInteger();

    /* renamed from: c */
    private static volatile C13175f f34391c;

    /* renamed from: d */
    private static volatile boolean f34392d = true;

    /* renamed from: b */
    private volatile boolean f34393b;

    /* renamed from: e */
    private int f34394e;

    /* renamed from: f */
    private int f34395f;

    /* renamed from: g */
    private final PriorityBlockingQueue<C13173e> f34396g;

    /* renamed from: h */
    private final PriorityBlockingQueue<C13173e> f34397h;

    /* renamed from: i */
    private final PriorityBlockingQueue<C13173e> f34398i;

    /* renamed from: j */
    private C13169a[] f34399j;

    /* renamed from: k */
    private C13172d[] f34400k;

    /* renamed from: l */
    private C13170b f34401l;

    /* renamed from: m */
    private volatile long f34402m;

    /* renamed from: n */
    private volatile long f34403n;

    /* renamed from: o */
    private volatile long f34404o;

    /* renamed from: p */
    private volatile long f34405p;

    public C13175f() {
        this(4, 4, true);
    }

    /* renamed from: f */
    private static int m26552f() {
        return f34390a.incrementAndGet();
    }

    /* renamed from: a */
    public static C13175f m26551a() {
        if (f34391c == null) {
            synchronized (C13175f.class) {
                if (f34391c == null) {
                    f34391c = new C13175f(false);
                }
            }
        }
        return f34391c;
    }

    /* renamed from: g */
    private synchronized void m26553g() {
        m26554h();
        this.f34401l = new C13170b(this.f34396g, this.f34397h);
        this.f34401l.start();
        for (int i = 0; i < this.f34394e; i++) {
            C13169a aVar = new C13169a(this.f34397h, "Account-ApiDispatcher-Thread", "ApiDispatcher");
            this.f34399j[i] = aVar;
            aVar.start();
        }
        if (this.f34400k != null) {
            for (int i2 = 0; i2 < this.f34395f; i2++) {
                C13172d dVar = new C13172d(this.f34398i, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
                this.f34400k[i2] = dVar;
                dVar.start();
            }
        }
        this.f34393b = true;
    }

    /* renamed from: h */
    private synchronized void m26554h() {
        this.f34393b = false;
        if (this.f34401l != null) {
            C13170b bVar = this.f34401l;
            bVar.f34379a = true;
            bVar.interrupt();
        }
        for (int i = 0; i < this.f34399j.length; i++) {
            if (this.f34399j[i] != null) {
                this.f34399j[i].mo24771a();
                this.f34399j[i] = null;
            }
        }
        if (this.f34400k != null) {
            for (int i2 = 0; i2 < this.f34400k.length; i2++) {
                if (this.f34400k[i2] != null) {
                    this.f34400k[i2].mo24771a();
                    this.f34400k[i2] = null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24789b() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f34392d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            long r2 = r7.f34402m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.f34402m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0013:
            long r2 = r7.f34402m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.f34402m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r0 = 0
            r1 = 0
        L_0x0024:
            com.bytedance.sdk.account.h.a.a[] r2 = r7.f34399j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r2 = r2.length     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 >= r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.a[] r2 = r7.f34399j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r7.f34394e     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r1 > r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.a r2 = new com.bytedance.sdk.account.h.a.a     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.h.a.e> r3 = r7.f34397h     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "Account-ApiDispatcher-Thread"
            java.lang.String r5 = "ApiDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            com.bytedance.sdk.account.h.a.a[] r3 = r7.f34399j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r3[r0] = r2     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2.start()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004f:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p866h.p867a.C13175f.mo24789b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24790c() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f34392d     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            long r2 = r7.f34403n     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.f34403n = r0     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
        L_0x0013:
            long r2 = r7.f34403n     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.f34403n = r0     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            com.bytedance.sdk.account.h.a.d[] r0 = r7.f34400k     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            if (r0 != 0) goto L_0x0028
            monitor-exit(r7)
            return
        L_0x0028:
            r0 = 0
            r1 = 0
        L_0x002a:
            com.bytedance.sdk.account.h.a.d[] r2 = r7.f34400k     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            if (r0 >= r2) goto L_0x0050
            com.bytedance.sdk.account.h.a.d[] r2 = r7.f34400k     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            if (r2 != 0) goto L_0x004d
            int r1 = r1 + 1
            int r2 = r7.f34395f     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            if (r1 > r2) goto L_0x0050
            com.bytedance.sdk.account.h.a.d r2 = new com.bytedance.sdk.account.h.a.d     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.h.a.e> r3 = r7.f34398i     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            java.lang.String r4 = "Account-DownloadDispatcher-Thread"
            java.lang.String r5 = "DownloadDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            com.bytedance.sdk.account.h.a.d[] r3 = r7.f34400k     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            r3[r0] = r2     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
            r2.start()     // Catch:{ Throwable -> 0x0055, all -> 0x0052 }
        L_0x004d:
            int r0 = r0 + 1
            goto L_0x002a
        L_0x0050:
            monitor-exit(r7)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0055:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p866h.p867a.C13175f.mo24790c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24791d() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f34392d     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            long r2 = r9.f34404o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.f34404o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
        L_0x0013:
            long r2 = r9.f34404o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.h.a.a[] r2 = r9.f34399j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x0027:
            int r6 = r9.f34394e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r2 < r6) goto L_0x003f
            com.bytedance.sdk.account.h.a.a[] r6 = r9.f34399j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r7 = 0
            if (r6 == 0) goto L_0x0039
            boolean r8 = r6.mo24773b()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r8 == 0) goto L_0x0039
            r4 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            int r2 = r2 + -1
            goto L_0x0027
        L_0x003f:
            r9.f34404o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            com.bytedance.sdk.account.h.a.a[] r0 = r9.f34399j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0 - r3
        L_0x004a:
            int r1 = r9.f34394e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 < r1) goto L_0x006d
            com.bytedance.sdk.account.h.a.a[] r1 = r9.f34399j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r1 == 0) goto L_0x006a
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 == r3) goto L_0x006a
            boolean r2 = r1.mo24773b()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 != 0) goto L_0x006a
            r1.mo24771a()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            com.bytedance.sdk.account.h.a.a[] r1 = r9.f34399j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
        L_0x006a:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0074:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p866h.p867a.C13175f.mo24791d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24792e() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f34392d     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            long r2 = r9.f34405p     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.f34405p = r0     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
        L_0x0013:
            long r2 = r9.f34405p     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.h.a.d[] r2 = r9.f34400k     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r2 != 0) goto L_0x0026
            monitor-exit(r9)
            return
        L_0x0026:
            com.bytedance.sdk.account.h.a.d[] r2 = r9.f34400k     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x002d:
            int r6 = r9.f34395f     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r2 < r6) goto L_0x0045
            com.bytedance.sdk.account.h.a.d[] r6 = r9.f34400k     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            r7 = 0
            if (r6 == 0) goto L_0x003f
            boolean r8 = r6.mo24773b()     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r8 == 0) goto L_0x003f
            r4 = 0
        L_0x003f:
            if (r6 == 0) goto L_0x0042
            r5 = 0
        L_0x0042:
            int r2 = r2 + -1
            goto L_0x002d
        L_0x0045:
            r9.f34405p = r0     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r4 == 0) goto L_0x0075
            if (r5 == 0) goto L_0x004c
            goto L_0x0075
        L_0x004c:
            com.bytedance.sdk.account.h.a.d[] r0 = r9.f34400k     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            int r0 = r0 - r3
        L_0x0050:
            int r1 = r9.f34395f     // Catch:{ Throwable -> 0x007a, all -> 0x0077 }
            if (r0 < r1) goto L_0x0073
            com.bytedance.sdk.account.h.a.d[] r1 = r9.f34400k     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            if (r1 == 0) goto L_0x0070
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            if (r2 == r3) goto L_0x0070
            boolean r2 = r1.mo24773b()     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            if (r2 != 0) goto L_0x0070
            r1.mo24771a()     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            com.bytedance.sdk.account.h.a.d[] r1 = r9.f34400k     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x0070, all -> 0x0077 }
        L_0x0070:
            int r0 = r0 + -1
            goto L_0x0050
        L_0x0073:
            monitor-exit(r9)
            return
        L_0x0075:
            monitor-exit(r9)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x007a:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p866h.p867a.C13175f.mo24792e():void");
    }

    private C13175f(boolean z) {
        this(4, 0, false);
    }

    /* renamed from: a */
    public final synchronized void mo24788a(C13171c cVar) {
        cVar.mo24778a(m26552f());
        if (!this.f34393b) {
            m26553g();
        }
        if (cVar.mo24783d() == C13174a.IMMEDIATE) {
            C9393e.submitRunnable(cVar);
            return;
        }
        cVar.mo24785f();
        this.f34397h.add(cVar);
    }

    private C13175f(int i, int i2, boolean z) {
        this.f34396g = new PriorityBlockingQueue<>();
        this.f34397h = new PriorityBlockingQueue<>();
        this.f34398i = new PriorityBlockingQueue<>();
        this.f34402m = 0;
        this.f34403n = 0;
        this.f34404o = 0;
        this.f34405p = 0;
        this.f34394e = 4;
        this.f34399j = new C13169a[16];
        if (z) {
            this.f34395f = i2;
            this.f34400k = new C13172d[(i2 * 4)];
        }
    }
}
