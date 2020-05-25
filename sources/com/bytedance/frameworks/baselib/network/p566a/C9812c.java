package com.bytedance.frameworks.baselib.network.p566a;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.frameworks.baselib.network.a.c */
public class C9812c {

    /* renamed from: a */
    public AtomicReference<C9814d> f26686a = new AtomicReference<>(C9814d.UNKNOWN);

    /* renamed from: b */
    public ArrayList<Object> f26687b = new ArrayList<>();

    /* renamed from: c */
    private C9818f f26688c = new C9818f(0.05d);

    /* renamed from: d */
    private volatile boolean f26689d = false;

    /* renamed from: e */
    private AtomicReference<C9814d> f26690e;

    /* renamed from: f */
    private int f26691f;

    /* renamed from: com.bytedance.frameworks.baselib.network.a.c$a */
    static class C9813a {

        /* renamed from: a */
        public static final C9812c f26692a = new C9812c();
    }

    /* renamed from: b */
    public static C9812c m19639b() {
        return C9813a.f26692a;
    }

    /* renamed from: d */
    public final synchronized double mo17653d() {
        if (this.f26688c == null) {
            return -1.0d;
        }
        return this.f26688c.f26705c;
    }

    protected C9812c() {
    }

    /* renamed from: a */
    private boolean m19638a() {
        if (this.f26688c == null) {
            return false;
        }
        try {
            C9814d dVar = (C9814d) this.f26686a.get();
            double d = 560.0d;
            double d2 = 112.0d;
            if (C9814d.POOR == dVar) {
                d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                d2 = 28.0d;
            } else if (C9814d.MODERATE == dVar) {
                d = 28.0d;
            } else if (C9814d.GOOD == dVar) {
                d = 112.0d;
                d2 = 560.0d;
            } else if (C9814d.EXCELLENT != dVar) {
                return true;
            } else {
                d2 = 3.4028234663852886E38d;
            }
            double d3 = this.f26688c.f26705c;
            if (d3 > d2) {
                if (d3 > d2 * 1.25d) {
                    return true;
                }
            } else if (d3 < d * 0.8d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|(4:15|16|17|18)(2:19|(4:21|22|23|24)(2:25|(4:27|28|29|30)(4:31|32|33|34)))|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x003c */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.baselib.network.p566a.C9814d mo17652c() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bytedance.frameworks.baselib.network.a.f r0 = r5.f26688c     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0009
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.UNKNOWN     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return r0
        L_0x0009:
            com.bytedance.frameworks.baselib.network.a.f r0 = r5.f26688c     // Catch:{ Throwable -> 0x003c }
            double r0 = r0.f26705c     // Catch:{ Throwable -> 0x003c }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0017
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.UNKNOWN     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0017:
            r2 = 4628574517030027264(0x403c000000000000, double:28.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0021
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.POOR     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0021:
            r2 = 4637581716284768256(0x405c000000000000, double:112.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002b
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.MODERATE     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x002b:
            r2 = 4648137027911417856(0x4081800000000000, double:560.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0038
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.GOOD     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0038:
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.EXCELLENT     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x003c:
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.p566a.C9814d.UNKNOWN     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.p566a.C9812c.mo17652c():com.bytedance.frameworks.baselib.network.a.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17651a(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            double r7 = (double) r7
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r0
            double r2 = (double) r9
            java.lang.Double.isNaN(r2)
            double r7 = r7 / r2
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r2
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ec
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00ec
        L_0x0020:
            com.bytedance.frameworks.baselib.network.a.f r9 = r6.f26688c     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r2 = r9.f26703a     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f26706d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            int r4 = r9.f26704b     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r10 <= r4) goto L_0x0046
            double r0 = r9.f26705c     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r2 = r2 * r0
            double r0 = r9.f26703a     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r9.f26705c = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            goto L_0x0075
        L_0x0046:
            int r10 = r9.f26706d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r10 <= 0) goto L_0x0073
            int r10 = r9.f26706d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f26706d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f26705c     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r4 = java.lang.Math.log(r4)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r9.f26705c = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            goto L_0x0075
        L_0x0073:
            r9.f26705c = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        L_0x0075:
            int r7 = r9.f26706d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r8 = 1
            int r7 = r7 + r8
            r9.f26706d = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            boolean r7 = r6.f26689d     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r7 == 0) goto L_0x00cc
            int r7 = r6.f26691f     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            int r7 = r7 + r8
            r6.f26691f = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            com.bytedance.frameworks.baselib.network.a.d r7 = r6.mo17652c()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r9 = r6.f26690e     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r10 = 0
            if (r7 == r9) goto L_0x0095
            r6.f26689d = r10     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r6.f26691f = r8     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        L_0x0095:
            int r7 = r6.f26691f     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            double r0 = (double) r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00ca
            boolean r7 = r6.m19638a()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r7 == 0) goto L_0x00ca
            r6.f26689d = r10     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r6.f26691f = r8     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r7 = r6.f26686a     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r8 = r6.f26690e     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.Object r8 = r8.get()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r7.set(r8)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.ArrayList<java.lang.Object> r7 = r6.f26687b     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
            int r7 = r7.size()     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
        L_0x00b9:
            if (r10 >= r7) goto L_0x00c8
            java.util.ArrayList<java.lang.Object> r8 = r6.f26687b     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
            r8.get(r10)     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r8 = r6.f26686a     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
            r8.get()     // Catch:{ Throwable -> 0x00ca, all -> 0x00e7 }
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00c8:
            monitor-exit(r6)
            return
        L_0x00ca:
            monitor-exit(r6)
            return
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r7 = r6.f26686a     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.lang.Object r7 = r7.get()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            com.bytedance.frameworks.baselib.network.a.d r9 = r6.mo17652c()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            if (r7 == r9) goto L_0x00e5
            r6.f26689d = r8     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            com.bytedance.frameworks.baselib.network.a.d r8 = r6.mo17652c()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
            r6.f26690e = r7     // Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r6)
            return
        L_0x00e7:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00ea:
            monitor-exit(r6)
            return
        L_0x00ec:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.p566a.C9812c.mo17651a(long, long):void");
    }
}
