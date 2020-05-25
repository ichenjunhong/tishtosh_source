package com.facebook.p987k.p988a;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.k.a.b */
public final class C14460b {

    /* renamed from: a */
    private C14468e f37556a;

    /* renamed from: b */
    private volatile boolean f37557b;

    /* renamed from: c */
    private AtomicReference<C14463c> f37558c;

    /* renamed from: d */
    private AtomicReference<C14463c> f37559d;

    /* renamed from: e */
    private ArrayList<Object> f37560e;

    /* renamed from: f */
    private int f37561f;

    /* renamed from: com.facebook.k.a.b$a */
    static class C14462a {

        /* renamed from: a */
        public static final C14460b f37562a = new C14460b();
    }

    /* renamed from: a */
    public static C14460b m29586a() {
        return C14462a.f37562a;
    }

    /* renamed from: c */
    public final synchronized double mo26626c() {
        if (this.f37556a == null) {
            return -1.0d;
        }
        return this.f37556a.f37573c;
    }

    private C14460b() {
        this.f37556a = new C14468e(0.05d);
        this.f37557b = false;
        this.f37558c = new AtomicReference<>(C14463c.UNKNOWN);
        this.f37560e = new ArrayList<>();
    }

    /* renamed from: b */
    public final synchronized C14463c mo26625b() {
        if (this.f37556a == null) {
            return C14463c.UNKNOWN;
        }
        double d = this.f37556a.f37573c;
        if (d < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return C14463c.UNKNOWN;
        } else if (d < 150.0d) {
            return C14463c.POOR;
        } else if (d < 550.0d) {
            return C14463c.MODERATE;
        } else if (d < 2000.0d) {
            return C14463c.GOOD;
        } else {
            return C14463c.EXCELLENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e3, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26624a(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00e2
            double r7 = (double) r7
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r0
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r7 = r7 / r9
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r9
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00e2
        L_0x0020:
            com.facebook.k.a.e r9 = r6.f37556a     // Catch:{ all -> 0x00df }
            double r2 = r9.f37571a     // Catch:{ all -> 0x00df }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f37574d     // Catch:{ all -> 0x00df }
            int r4 = r9.f37572b     // Catch:{ all -> 0x00df }
            if (r10 <= r4) goto L_0x0046
            double r0 = r9.f37573c     // Catch:{ all -> 0x00df }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x00df }
            double r2 = r2 * r0
            double r0 = r9.f37571a     // Catch:{ all -> 0x00df }
            double r7 = java.lang.Math.log(r7)     // Catch:{ all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x00df }
            r9.f37573c = r7     // Catch:{ all -> 0x00df }
            goto L_0x0075
        L_0x0046:
            int r10 = r9.f37574d     // Catch:{ all -> 0x00df }
            if (r10 <= 0) goto L_0x0073
            int r10 = r9.f37574d     // Catch:{ all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f37574d     // Catch:{ all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f37573c     // Catch:{ all -> 0x00df }
            double r4 = java.lang.Math.log(r4)     // Catch:{ all -> 0x00df }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x00df }
            r9.f37573c = r7     // Catch:{ all -> 0x00df }
            goto L_0x0075
        L_0x0073:
            r9.f37573c = r7     // Catch:{ all -> 0x00df }
        L_0x0075:
            int r7 = r9.f37574d     // Catch:{ all -> 0x00df }
            r8 = 1
            int r7 = r7 + r8
            r9.f37574d = r7     // Catch:{ all -> 0x00df }
            boolean r7 = r6.f37557b     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00c4
            int r7 = r6.f37561f     // Catch:{ all -> 0x00df }
            int r7 = r7 + r8
            r6.f37561f = r7     // Catch:{ all -> 0x00df }
            com.facebook.k.a.c r7 = r6.mo26625b()     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.k.a.c> r9 = r6.f37559d     // Catch:{ all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00df }
            r10 = 0
            if (r7 == r9) goto L_0x0095
            r6.f37557b = r10     // Catch:{ all -> 0x00df }
            r6.f37561f = r8     // Catch:{ all -> 0x00df }
        L_0x0095:
            int r7 = r6.f37561f     // Catch:{ all -> 0x00df }
            double r0 = (double) r7     // Catch:{ all -> 0x00df }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00c2
            r6.f37557b = r10     // Catch:{ all -> 0x00df }
            r6.f37561f = r8     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.k.a.c> r7 = r6.f37558c     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.k.a.c> r8 = r6.f37559d     // Catch:{ all -> 0x00df }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x00df }
            r7.set(r8)     // Catch:{ all -> 0x00df }
            java.util.ArrayList<java.lang.Object> r7 = r6.f37560e     // Catch:{ all -> 0x00df }
            int r7 = r7.size()     // Catch:{ all -> 0x00df }
        L_0x00b3:
            if (r10 >= r7) goto L_0x00c2
            java.util.ArrayList<java.lang.Object> r8 = r6.f37560e     // Catch:{ all -> 0x00df }
            r8.get(r10)     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.k.a.c> r8 = r6.f37558c     // Catch:{ all -> 0x00df }
            r8.get()     // Catch:{ all -> 0x00df }
            int r10 = r10 + 1
            goto L_0x00b3
        L_0x00c2:
            monitor-exit(r6)
            return
        L_0x00c4:
            java.util.concurrent.atomic.AtomicReference<com.facebook.k.a.c> r7 = r6.f37558c     // Catch:{ all -> 0x00df }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00df }
            com.facebook.k.a.c r9 = r6.mo26625b()     // Catch:{ all -> 0x00df }
            if (r7 == r9) goto L_0x00dd
            r6.f37557b = r8     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x00df }
            com.facebook.k.a.c r8 = r6.mo26625b()     // Catch:{ all -> 0x00df }
            r7.<init>(r8)     // Catch:{ all -> 0x00df }
            r6.f37559d = r7     // Catch:{ all -> 0x00df }
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p987k.p988a.C14460b.mo26624a(long, long):void");
    }
}
