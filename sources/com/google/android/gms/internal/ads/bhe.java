package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

final class bhe implements Callback {

    /* renamed from: a */
    final Handler f42352a;

    /* renamed from: b */
    int f42353b;

    /* renamed from: c */
    volatile long f42354c;

    /* renamed from: d */
    volatile long f42355d;

    /* renamed from: e */
    volatile long f42356e;

    /* renamed from: f */
    private final HandlerThread f42357f;

    /* renamed from: g */
    private final Handler f42358g;

    /* renamed from: h */
    private final bhg f42359h;

    /* renamed from: i */
    private final boolean[] f42360i;

    /* renamed from: j */
    private final long f42361j = 2500000;

    /* renamed from: k */
    private final long f42362k = 5000000;

    /* renamed from: l */
    private final List<bik> f42363l;

    /* renamed from: m */
    private bik[] f42364m;

    /* renamed from: n */
    private bik f42365n;

    /* renamed from: o */
    private boolean f42366o;

    /* renamed from: p */
    private boolean f42367p;

    /* renamed from: q */
    private boolean f42368q;

    /* renamed from: r */
    private int f42369r;

    /* renamed from: s */
    private int f42370s;

    /* renamed from: t */
    private long f42371t;

    public bhe(Handler handler, boolean z, boolean[] zArr, int i, int i2) {
        this.f42358g = handler;
        this.f42367p = z;
        this.f42360i = new boolean[zArr.length];
        for (int i3 = 0; i3 < zArr.length; i3++) {
            this.f42360i[i3] = zArr[i3];
        }
        this.f42369r = 1;
        this.f42354c = -1;
        this.f42356e = -1;
        this.f42359h = new bhg();
        this.f42363l = new ArrayList(zArr.length);
        this.f42357f = new bln(String.valueOf(getClass().getSimpleName()).concat(":Handler"), -16);
        this.f42357f.start();
        this.f42352a = new Handler(this.f42357f.getLooper(), this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|22|19|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x001e, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30164a(com.google.android.gms.internal.ads.bha r4, int r5, java.lang.Object r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f42366o     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            int r5 = r3.f42353b     // Catch:{ all -> 0x0030 }
            int r0 = r5 + 1
            r3.f42353b = r0     // Catch:{ all -> 0x0030 }
            android.os.Handler r0 = r3.f42352a     // Catch:{ all -> 0x0030 }
            r1 = 9
            r2 = 0
            android.util.Pair r4 = android.util.Pair.create(r4, r6)     // Catch:{ all -> 0x0030 }
            r6 = 1
            android.os.Message r4 = r0.obtainMessage(r1, r6, r2, r4)     // Catch:{ all -> 0x0030 }
            r4.sendToTarget()     // Catch:{ all -> 0x0030 }
        L_0x001e:
            int r4 = r3.f42370s     // Catch:{ all -> 0x0030 }
            if (r4 > r5) goto L_0x002e
            r3.wait()     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x001e
        L_0x0026:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
            r4.interrupt()     // Catch:{ all -> 0x0030 }
            goto L_0x001e
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhe.mo30164a(com.google.android.gms.internal.ads.bha, int, java.lang.Object):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30163a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f42366o     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f42352a     // Catch:{ all -> 0x0024 }
            r1 = 5
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f42366o     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f42357f     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhe.mo30163a():void");
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        try {
            switch (message2.what) {
                case 1:
                    bik[] bikArr = (bik[]) message2.obj;
                    m35659f();
                    this.f42364m = bikArr;
                    for (int i = 0; i < bikArr.length; i++) {
                        if (bikArr[i].mo30185a()) {
                            blg.m36001b(this.f42365n == null);
                            this.f42365n = bikArr[i];
                        }
                    }
                    m35651a(2);
                    this.f42352a.sendEmptyMessage(2);
                    return true;
                case 2:
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = true;
                    for (int i2 = 0; i2 < this.f42364m.length; i2++) {
                        if (this.f42364m[i2].f42494e == 0 && this.f42364m[i2].mo30226c(this.f42355d) == 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        m35652a(2, elapsedRealtime, 10);
                    } else {
                        long j = 0;
                        boolean z2 = true;
                        boolean z3 = true;
                        for (int i3 = 0; i3 < this.f42364m.length; i3++) {
                            bik bik = this.f42364m[i3];
                            if (this.f42360i[i3] && bik.f42494e == 1) {
                                bik.mo30225b(this.f42355d, false);
                                this.f42363l.add(bik);
                                z2 = z2 && bik.mo30190d();
                                z3 = z3 && m35653a(bik);
                                if (j != -1) {
                                    long l = bik.mo30204l();
                                    if (l == -1) {
                                        j = -1;
                                    } else {
                                        if (l != -2) {
                                            j = Math.max(j, l);
                                        }
                                    }
                                }
                            }
                        }
                        this.f42354c = j;
                        if (z2) {
                            m35651a(5);
                        } else {
                            m35651a(z3 ? 4 : 3);
                            if (this.f42367p && this.f42369r == 4) {
                                m35654b();
                            }
                        }
                        this.f42352a.sendEmptyMessage(7);
                    }
                    return true;
                case 3:
                    boolean z4 = message2.arg1 != 0;
                    this.f42368q = false;
                    this.f42367p = z4;
                    if (!z4) {
                        m35656c();
                        m35657d();
                    } else if (this.f42369r == 4) {
                        m35654b();
                        this.f42352a.sendEmptyMessage(7);
                    } else if (this.f42369r == 3) {
                        this.f42352a.sendEmptyMessage(7);
                    }
                    this.f42358g.obtainMessage(2).sendToTarget();
                    return true;
                case 4:
                    m35658e();
                    return true;
                case 5:
                    m35659f();
                    m35651a(1);
                    synchronized (this) {
                        this.f42366o = true;
                        notifyAll();
                    }
                    return true;
                case 6:
                    long longValue = ((Long) message2.obj).longValue();
                    this.f42368q = false;
                    this.f42355d = longValue * 1000;
                    this.f42359h.mo30178b();
                    this.f42359h.mo30177a(this.f42355d);
                    if (this.f42369r != 1) {
                        if (this.f42369r != 2) {
                            for (int i4 = 0; i4 < this.f42363l.size(); i4++) {
                                bik bik2 = (bik) this.f42363l.get(i4);
                                m35655b(bik2);
                                bik2.mo30181a(this.f42355d);
                            }
                            m35651a(3);
                            this.f42352a.sendEmptyMessage(7);
                        }
                    }
                    return true;
                case 7:
                    blo.m36020a("doSomeWork");
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = this.f42354c != -1 ? this.f42354c : Long.MAX_VALUE;
                    m35657d();
                    long j3 = j2;
                    boolean z5 = true;
                    boolean z6 = true;
                    for (int i5 = 0; i5 < this.f42363l.size(); i5++) {
                        bik bik3 = (bik) this.f42363l.get(i5);
                        bik3.mo30196a(this.f42355d, this.f42371t);
                        z5 = z5 && bik3.mo30190d();
                        z6 = z6 && m35653a(bik3);
                        if (j3 != -1) {
                            long l2 = bik3.mo30204l();
                            long m = bik3.mo30205m();
                            if (m == -1) {
                                j3 = -1;
                            } else if (m != -3 && (l2 == -1 || l2 == -2 || m < l2)) {
                                j3 = Math.min(j3, m);
                            }
                        }
                    }
                    this.f42356e = j3;
                    if (z5) {
                        m35651a(5);
                        m35656c();
                    } else if (this.f42369r == 3 && z6) {
                        m35651a(4);
                        if (this.f42367p) {
                            m35654b();
                        }
                    } else if (this.f42369r == 4 && !z6) {
                        this.f42368q = this.f42367p;
                        m35651a(3);
                        m35656c();
                    }
                    this.f42352a.removeMessages(7);
                    if ((this.f42367p && this.f42369r == 4) || this.f42369r == 3) {
                        m35652a(7, elapsedRealtime2, 10);
                    } else if (!this.f42363l.isEmpty()) {
                        m35652a(7, elapsedRealtime2, 1000);
                    }
                    blo.m36019a();
                    return true;
                case 8:
                    int i6 = message2.arg1;
                    boolean z7 = message2.arg2 != 0;
                    if (this.f42360i[i6] != z7) {
                        this.f42360i[i6] = z7;
                        if (this.f42369r != 1) {
                            if (this.f42369r != 2) {
                                bik bik4 = this.f42364m[i6];
                                int i7 = bik4.f42494e;
                                if (i7 == 1 || i7 == 2 || i7 == 3) {
                                    if (z7) {
                                        boolean z8 = this.f42367p && this.f42369r == 4;
                                        bik4.mo30225b(this.f42355d, z8);
                                        this.f42363l.add(bik4);
                                        if (z8) {
                                            bik4.mo30227n();
                                        }
                                        this.f42352a.sendEmptyMessage(7);
                                    } else {
                                        if (bik4 == this.f42365n) {
                                            this.f42359h.mo30177a(bik4.mo30192f());
                                        }
                                        m35655b(bik4);
                                        this.f42363l.remove(bik4);
                                        bik4.mo30229p();
                                    }
                                }
                            }
                        }
                    }
                    return true;
                case 9:
                    int i8 = message2.arg1;
                    Pair pair = (Pair) message2.obj;
                    ((bha) pair.first).mo30161a(i8, pair.second);
                    synchronized (this) {
                        this.f42370s++;
                        notifyAll();
                    }
                    if (!(this.f42369r == 1 || this.f42369r == 2)) {
                        this.f42352a.sendEmptyMessage(7);
                    }
                    return true;
                default:
                    return false;
            }
        } catch (bgy e) {
            this.f42358g.obtainMessage(3, e).sendToTarget();
            m35658e();
            return true;
        } catch (RuntimeException e2) {
            this.f42358g.obtainMessage(3, new bgy(e2, true)).sendToTarget();
            m35658e();
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f42370s++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final void m35651a(int i) {
        if (this.f42369r != i) {
            this.f42369r = i;
            this.f42358g.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final boolean m35653a(bik bik) {
        if (bik.mo30190d()) {
            return true;
        }
        if (!bik.mo30191e()) {
            return false;
        }
        if (this.f42369r == 4) {
            return true;
        }
        long l = bik.mo30204l();
        long m = bik.mo30205m();
        long j = this.f42368q ? this.f42362k : this.f42361j;
        if (j <= 0 || m == -1 || m == -3 || m >= this.f42355d + j || (l != -1 && l != -2 && m >= l)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m35654b() throws bgy {
        this.f42368q = false;
        this.f42359h.mo30176a();
        for (int i = 0; i < this.f42363l.size(); i++) {
            ((bik) this.f42363l.get(i)).mo30227n();
        }
    }

    /* renamed from: c */
    private final void m35656c() throws bgy {
        this.f42359h.mo30178b();
        for (int i = 0; i < this.f42363l.size(); i++) {
            m35655b((bik) this.f42363l.get(i));
        }
    }

    /* renamed from: d */
    private final void m35657d() {
        if (this.f42365n == null || !this.f42363l.contains(this.f42365n) || this.f42365n.mo30190d()) {
            this.f42355d = this.f42359h.mo30179c();
        } else {
            this.f42355d = this.f42365n.mo30192f();
            this.f42359h.mo30177a(this.f42355d);
        }
        this.f42371t = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: a */
    private final void m35652a(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f42352a.sendEmptyMessage(i);
        } else {
            this.f42352a.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }

    /* renamed from: e */
    private final void m35658e() {
        m35659f();
        m35651a(1);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m35659f() {
        /*
            r4 = this;
            android.os.Handler r0 = r4.f42352a
            r1 = 7
            r0.removeMessages(r1)
            android.os.Handler r0 = r4.f42352a
            r1 = 2
            r0.removeMessages(r1)
            r0 = 0
            r4.f42368q = r0
            com.google.android.gms.internal.ads.bhg r2 = r4.f42359h
            r2.mo30178b()
            com.google.android.gms.internal.ads.bik[] r2 = r4.f42364m
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            com.google.android.gms.internal.ads.bik[] r2 = r4.f42364m
            int r2 = r2.length
            if (r0 >= r2) goto L_0x0032
            com.google.android.gms.internal.ads.bik[] r2 = r4.f42364m
            r2 = r2[r0]
            m35655b(r2)     // Catch:{ bgy | RuntimeException -> 0x002c }
            int r3 = r2.f42494e     // Catch:{ bgy | RuntimeException -> 0x002c }
            if (r3 != r1) goto L_0x002c
            r2.mo30229p()     // Catch:{ bgy | RuntimeException -> 0x002c }
        L_0x002c:
            r2.mo30230q()     // Catch:{ bgy | RuntimeException -> 0x002f }
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0019
        L_0x0032:
            r0 = 0
            r4.f42364m = r0
            r4.f42365n = r0
            java.util.List<com.google.android.gms.internal.ads.bik> r0 = r4.f42363l
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhe.m35659f():void");
    }

    /* renamed from: b */
    private static void m35655b(bik bik) throws bgy {
        if (bik.f42494e == 3) {
            bik.mo30228o();
        }
    }
}
