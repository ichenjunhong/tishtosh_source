package com.toutiao.proxyserver.p2613e;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.toutiao.proxyserver.e.a */
public final class C51822a {

    /* renamed from: a */
    private C51831e f129300a;

    /* renamed from: b */
    private volatile boolean f129301b;

    /* renamed from: c */
    private AtomicReference<C51825b> f129302c;

    /* renamed from: d */
    private AtomicReference<C51825b> f129303d;

    /* renamed from: e */
    private ArrayList<Object> f129304e;

    /* renamed from: f */
    private int f129305f;

    /* renamed from: com.toutiao.proxyserver.e.a$a */
    static class C51824a {

        /* renamed from: a */
        public static final C51822a f129307a = new C51822a();
    }

    /* renamed from: a */
    public static C51822a m111147a() {
        return C51824a.f129307a;
    }

    /* renamed from: b */
    public final synchronized double mo107320b() {
        if (this.f129300a == null) {
            return -1.0d;
        }
        return this.f129300a.f129323c;
    }

    private C51822a() {
        this.f129300a = new C51831e(0.05d);
        this.f129301b = false;
        this.f129302c = new AtomicReference<>(C51825b.UNKNOWN);
        this.f129304e = new ArrayList<>();
    }

    /* renamed from: c */
    private synchronized C51825b m111148c() {
        if (this.f129300a == null) {
            return C51825b.UNKNOWN;
        }
        double d = this.f129300a.f129323c;
        if (d < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return C51825b.UNKNOWN;
        } else if (d < 150.0d) {
            return C51825b.POOR;
        } else if (d < 550.0d) {
            return C51825b.MODERATE;
        } else if (d < 2000.0d) {
            return C51825b.GOOD;
        } else {
            return C51825b.EXCELLENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r4 = r8.f129300a.f129323c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r4 <= r2) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e3, code lost:
        if (r4 <= (r2 * 1.25d)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if (r4 >= (r0 * 0.8d)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo107319a(long r9, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0139
            double r9 = (double) r9
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r0
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            double r9 = r9 / r11
            r11 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r9 = r9 * r11
            r11 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x0139
        L_0x0020:
            com.toutiao.proxyserver.e.e r11 = r8.f129300a     // Catch:{ all -> 0x0136 }
            double r2 = r11.f129321a     // Catch:{ all -> 0x0136 }
            r12 = 0
            double r2 = r0 - r2
            int r12 = r11.f129324d     // Catch:{ all -> 0x0136 }
            int r4 = r11.f129322b     // Catch:{ all -> 0x0136 }
            if (r12 <= r4) goto L_0x0046
            double r0 = r11.f129323c     // Catch:{ all -> 0x0136 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x0136 }
            double r2 = r2 * r0
            double r0 = r11.f129321a     // Catch:{ all -> 0x0136 }
            double r9 = java.lang.Math.log(r9)     // Catch:{ all -> 0x0136 }
            double r0 = r0 * r9
            r9 = 0
            double r2 = r2 + r0
            double r9 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x0136 }
            r11.f129323c = r9     // Catch:{ all -> 0x0136 }
            goto L_0x0075
        L_0x0046:
            int r12 = r11.f129324d     // Catch:{ all -> 0x0136 }
            if (r12 <= 0) goto L_0x0073
            int r12 = r11.f129324d     // Catch:{ all -> 0x0136 }
            double r4 = (double) r12
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r12 = r11.f129324d     // Catch:{ all -> 0x0136 }
            double r4 = (double) r12
            java.lang.Double.isNaN(r4)
            r12 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r11.f129323c     // Catch:{ all -> 0x0136 }
            double r4 = java.lang.Math.log(r4)     // Catch:{ all -> 0x0136 }
            double r2 = r2 * r4
            double r9 = java.lang.Math.log(r9)     // Catch:{ all -> 0x0136 }
            double r0 = r0 * r9
            r9 = 0
            double r2 = r2 + r0
            double r9 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x0136 }
            r11.f129323c = r9     // Catch:{ all -> 0x0136 }
            goto L_0x0075
        L_0x0073:
            r11.f129323c = r9     // Catch:{ all -> 0x0136 }
        L_0x0075:
            int r9 = r11.f129324d     // Catch:{ all -> 0x0136 }
            r10 = 1
            int r9 = r9 + r10
            r11.f129324d = r9     // Catch:{ all -> 0x0136 }
            boolean r9 = r8.f129301b     // Catch:{ all -> 0x0136 }
            if (r9 == 0) goto L_0x011b
            int r9 = r8.f129305f     // Catch:{ all -> 0x0136 }
            int r9 = r9 + r10
            r8.f129305f = r9     // Catch:{ all -> 0x0136 }
            com.toutiao.proxyserver.e.b r9 = r8.m111148c()     // Catch:{ all -> 0x0136 }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r11 = r8.f129303d     // Catch:{ all -> 0x0136 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0136 }
            r12 = 0
            if (r9 == r11) goto L_0x0095
            r8.f129301b = r12     // Catch:{ all -> 0x0136 }
            r8.f129305f = r10     // Catch:{ all -> 0x0136 }
        L_0x0095:
            int r9 = r8.f129305f     // Catch:{ all -> 0x0136 }
            double r0 = (double) r9     // Catch:{ all -> 0x0136 }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x0119
            com.toutiao.proxyserver.e.e r9 = r8.f129300a     // Catch:{ all -> 0x0136 }
            if (r9 == 0) goto L_0x00f2
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r9 = r8.f129302c     // Catch:{ all -> 0x0136 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0136 }
            com.toutiao.proxyserver.e.b r9 = (com.toutiao.proxyserver.p2613e.C51825b) r9     // Catch:{ all -> 0x0136 }
            int[] r11 = com.toutiao.proxyserver.p2613e.C51822a.C518231.f129306a     // Catch:{ all -> 0x0136 }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x0136 }
            r9 = r11[r9]     // Catch:{ all -> 0x0136 }
            r0 = 4656510908468559872(0x409f400000000000, double:2000.0)
            r2 = 4648049066981195776(0x4081300000000000, double:550.0)
            r4 = 4639481672377565184(0x4062c00000000000, double:150.0)
            switch(r9) {
                case 1: goto L_0x00d2;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00c6;
                default: goto L_0x00c4;
            }     // Catch:{ all -> 0x0136 }
        L_0x00c4:
            r9 = 1
            goto L_0x00f3
        L_0x00c6:
            r2 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            goto L_0x00d5
        L_0x00cc:
            r6 = r0
            r0 = r2
            r2 = r6
            goto L_0x00d5
        L_0x00d0:
            r0 = r4
            goto L_0x00d5
        L_0x00d2:
            r0 = 0
            r2 = r4
        L_0x00d5:
            com.toutiao.proxyserver.e.e r9 = r8.f129300a     // Catch:{ all -> 0x0136 }
            double r4 = r9.f129323c     // Catch:{ all -> 0x0136 }
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e6
            r0 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r2 = r2 * r0
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00f2
            goto L_0x00c4
        L_0x00e6:
            r2 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r0 = r0 * r2
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x00f2
            goto L_0x00c4
        L_0x00f2:
            r9 = 0
        L_0x00f3:
            if (r9 == 0) goto L_0x0119
            r8.f129301b = r12     // Catch:{ all -> 0x0136 }
            r8.f129305f = r10     // Catch:{ all -> 0x0136 }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r9 = r8.f129302c     // Catch:{ all -> 0x0136 }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r10 = r8.f129303d     // Catch:{ all -> 0x0136 }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x0136 }
            r9.set(r10)     // Catch:{ all -> 0x0136 }
            java.util.ArrayList<java.lang.Object> r9 = r8.f129304e     // Catch:{ all -> 0x0136 }
            int r9 = r9.size()     // Catch:{ all -> 0x0136 }
        L_0x010a:
            if (r12 >= r9) goto L_0x0119
            java.util.ArrayList<java.lang.Object> r10 = r8.f129304e     // Catch:{ all -> 0x0136 }
            r10.get(r12)     // Catch:{ all -> 0x0136 }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r10 = r8.f129302c     // Catch:{ all -> 0x0136 }
            r10.get()     // Catch:{ all -> 0x0136 }
            int r12 = r12 + 1
            goto L_0x010a
        L_0x0119:
            monitor-exit(r8)
            return
        L_0x011b:
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r9 = r8.f129302c     // Catch:{ all -> 0x0136 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0136 }
            com.toutiao.proxyserver.e.b r11 = r8.m111148c()     // Catch:{ all -> 0x0136 }
            if (r9 == r11) goto L_0x0134
            r8.f129301b = r10     // Catch:{ all -> 0x0136 }
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0136 }
            com.toutiao.proxyserver.e.b r10 = r8.m111148c()     // Catch:{ all -> 0x0136 }
            r9.<init>(r10)     // Catch:{ all -> 0x0136 }
            r8.f129303d = r9     // Catch:{ all -> 0x0136 }
        L_0x0134:
            monitor-exit(r8)
            return
        L_0x0136:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x0139:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p2613e.C51822a.mo107319a(long, long):void");
    }
}
