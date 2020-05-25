package com.p683ss.android.socialbase.downloader.p1216f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.socialbase.downloader.f.g */
public class C19928g {

    /* renamed from: a */
    private static final String f54751a = "g";

    /* renamed from: b */
    private final C19923b f54752b;

    /* renamed from: c */
    private volatile boolean f54753c;

    /* renamed from: d */
    private final AtomicReference<C19931h> f54754d;

    /* renamed from: e */
    private AtomicReference<C19931h> f54755e;

    /* renamed from: f */
    private final ArrayList<Object> f54756f;

    /* renamed from: g */
    private int f54757g;

    /* renamed from: com.ss.android.socialbase.downloader.f.g$a */
    static class C19930a {

        /* renamed from: a */
        public static final C19928g f54759a = new C19928g();
    }

    /* renamed from: a */
    public static C19928g m48914a() {
        return C19930a.f54759a;
    }

    private C19928g() {
        this.f54752b = new C19923b(0.05d);
        this.f54753c = false;
        this.f54754d = new AtomicReference<>(C19931h.UNKNOWN);
        this.f54756f = new ArrayList<>();
    }

    /* renamed from: c */
    private boolean m48915c() {
        if (this.f54752b == null) {
            return false;
        }
        try {
            double d = 2000.0d;
            double d2 = 550.0d;
            switch ((C19931h) this.f54754d.get()) {
                case POOR:
                    d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                    d2 = 150.0d;
                    break;
                case MODERATE:
                    d = 150.0d;
                    break;
                case GOOD:
                    d = 550.0d;
                    d2 = 2000.0d;
                    break;
                case EXCELLENT:
                    d2 = 3.4028234663852886E38d;
                    break;
                default:
                    return true;
            }
            double d3 = this.f54752b.f54749c;
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
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0042 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.socialbase.downloader.p1216f.C19931h mo41652b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ss.android.socialbase.downloader.f.b r0 = r5.f54752b     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0009
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.UNKNOWN     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return r0
        L_0x0009:
            com.ss.android.socialbase.downloader.f.b r0 = r5.f54752b     // Catch:{ Throwable -> 0x0042 }
            double r0 = r0.f54749c     // Catch:{ Throwable -> 0x0042 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0017
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.UNKNOWN     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0017:
            r2 = 4639481672377565184(0x4062c00000000000, double:150.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0024
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.POOR     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0024:
            r2 = 4648049066981195776(0x4081300000000000, double:550.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.MODERATE     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0031:
            r2 = 4656510908468559872(0x409f400000000000, double:2000.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x003e
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.GOOD     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x003e:
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.EXCELLENT     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0042:
            com.ss.android.socialbase.downloader.f.h r0 = com.p683ss.android.socialbase.downloader.p1216f.C19931h.UNKNOWN     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return r0
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1216f.C19928g.mo41652b():com.ss.android.socialbase.downloader.f.h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41651a(long r7, long r9) {
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
            if (r4 == 0) goto L_0x00e4
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00e4
        L_0x0020:
            com.ss.android.socialbase.downloader.f.b r9 = r6.f54752b     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r9.f54747a     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f54750d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            int r4 = r9.f54748b     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r10 <= r4) goto L_0x0046
            double r0 = r9.f54749c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = java.lang.Math.log(r0)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r2 * r0
            double r0 = r9.f54747a     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r9.f54749c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            goto L_0x0075
        L_0x0046:
            int r10 = r9.f54750d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r10 <= 0) goto L_0x0073
            int r10 = r9.f54750d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f54750d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f54749c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = java.lang.Math.log(r4)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r9.f54749c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            goto L_0x0075
        L_0x0073:
            r9.f54749c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
        L_0x0075:
            int r7 = r9.f54750d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r8 = 1
            int r7 = r7 + r8
            r9.f54750d = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            com.ss.android.socialbase.downloader.f.h r7 = r6.mo41652b()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            boolean r9 = r6.f54753c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r9 == 0) goto L_0x00cc
            int r9 = r6.f54757g     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            int r9 = r9 + r8
            r6.f54757g = r9     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.f.h> r9 = r6.f54755e     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r10 = 0
            if (r7 == r9) goto L_0x0095
            r6.f54753c = r10     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.f54757g = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
        L_0x0095:
            int r7 = r6.f54757g     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = (double) r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00ca
            boolean r7 = r6.m48915c()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r7 == 0) goto L_0x00ca
            r6.f54753c = r10     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.f54757g = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.f.h> r7 = r6.f54754d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.f.h> r8 = r6.f54755e     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r8 = r8.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r7.set(r8)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.ArrayList<java.lang.Object> r7 = r6.f54756f     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            int r7 = r7.size()     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
        L_0x00b9:
            if (r10 >= r7) goto L_0x00c8
            java.util.ArrayList<java.lang.Object> r8 = r6.f54756f     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            r8.get(r10)     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.f.h> r8 = r6.f54754d     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            r8.get()     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00c8:
            monitor-exit(r6)
            return
        L_0x00ca:
            monitor-exit(r6)
            return
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.f.h> r9 = r6.f54754d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r9 == r7) goto L_0x00dd
            r6.f54753c = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r8.<init>(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.f54755e = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
        L_0x00dd:
            monitor-exit(r6)
            return
        L_0x00df:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00e2:
            monitor-exit(r6)
            return
        L_0x00e4:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1216f.C19928g.mo41651a(long, long):void");
    }
}
