package com.google.android.gms.internal.ads;

final class brm {

    /* renamed from: a */
    private int f43678a = 1000;

    /* renamed from: b */
    private int[] f43679b = new int[this.f43678a];

    /* renamed from: c */
    private long[] f43680c = new long[this.f43678a];

    /* renamed from: d */
    private int[] f43681d = new int[this.f43678a];

    /* renamed from: e */
    private int[] f43682e = new int[this.f43678a];

    /* renamed from: f */
    private long[] f43683f = new long[this.f43678a];

    /* renamed from: g */
    private bou[] f43684g = new bou[this.f43678a];

    /* renamed from: h */
    private zzlg[] f43685h = new zzlg[this.f43678a];

    /* renamed from: i */
    private int f43686i;

    /* renamed from: j */
    private int f43687j;

    /* renamed from: k */
    private int f43688k;

    /* renamed from: l */
    private int f43689l;

    /* renamed from: m */
    private long f43690m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f43691n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f43692o = true;

    /* renamed from: p */
    private boolean f43693p = true;

    /* renamed from: q */
    private zzlg f43694q;

    /* renamed from: a */
    public final void mo30604a() {
        this.f43687j = 0;
        this.f43688k = 0;
        this.f43689l = 0;
        this.f43686i = 0;
        this.f43692o = true;
    }

    /* renamed from: b */
    public final void mo30608b() {
        this.f43690m = Long.MIN_VALUE;
        this.f43691n = Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final int mo30609c() {
        return this.f43687j + this.f43686i;
    }

    /* renamed from: d */
    public final synchronized boolean mo30610d() {
        return this.f43686i != 0;
    }

    /* renamed from: e */
    public final synchronized zzlg mo30611e() {
        if (this.f43693p) {
            return null;
        }
        return this.f43694q;
    }

    /* renamed from: f */
    public final synchronized long mo30612f() {
        return Math.max(this.f43690m, this.f43691n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return -3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo30602a(com.google.android.gms.internal.ads.bmh r5, com.google.android.gms.internal.ads.boc r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzlg r9, com.google.android.gms.internal.ads.brn r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo30610d()     // Catch:{ all -> 0x00a4 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0023
            if (r8 == 0) goto L_0x0011
            r5 = 4
            r6.f43156a = r5     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x0011:
            com.google.android.gms.internal.ads.zzlg r6 = r4.f43694q     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzlg r6 = r4.f43694q     // Catch:{ all -> 0x00a4 }
            if (r6 == r9) goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.zzlg r6 = r4.f43694q     // Catch:{ all -> 0x00a4 }
            r5.f42966a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x0021:
            monitor-exit(r4)
            return r2
        L_0x0023:
            if (r7 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzlg[] r7 = r4.f43685h     // Catch:{ all -> 0x00a4 }
            int r8 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a4 }
            if (r7 == r9) goto L_0x002e
            goto L_0x009a
        L_0x002e:
            java.nio.ByteBuffer r5 = r6.f43182c     // Catch:{ all -> 0x00a4 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 == 0) goto L_0x003b
            monitor-exit(r4)
            return r2
        L_0x003b:
            long[] r5 = r4.f43683f     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.f43183d = r0     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f43682e     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.f43156a = r5     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f43681d     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f43695a = r5     // Catch:{ all -> 0x00a4 }
            long[] r5 = r4.f43680c     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f43696b = r0     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.bou[] r5 = r4.f43684g     // Catch:{ all -> 0x00a4 }
            int r9 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f43698d = r5     // Catch:{ all -> 0x00a4 }
            long r0 = r4.f43690m     // Catch:{ all -> 0x00a4 }
            long r5 = r6.f43183d     // Catch:{ all -> 0x00a4 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a4 }
            r4.f43690m = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f43686i     // Catch:{ all -> 0x00a4 }
            int r5 = r5 - r8
            r4.f43686i = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            int r5 = r5 + r8
            r4.f43688k = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f43687j     // Catch:{ all -> 0x00a4 }
            int r5 = r5 + r8
            r4.f43687j = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f43678a     // Catch:{ all -> 0x00a4 }
            if (r5 != r6) goto L_0x0084
            r4.f43688k = r7     // Catch:{ all -> 0x00a4 }
        L_0x0084:
            int r5 = r4.f43686i     // Catch:{ all -> 0x00a4 }
            if (r5 <= 0) goto L_0x0090
            long[] r5 = r4.f43680c     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a4 }
            r5 = r6
            goto L_0x0096
        L_0x0090:
            long r5 = r10.f43696b     // Catch:{ all -> 0x00a4 }
            int r7 = r10.f43695a     // Catch:{ all -> 0x00a4 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a4 }
            long r5 = r5 + r7
        L_0x0096:
            r10.f43697c = r5     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x009a:
            com.google.android.gms.internal.ads.zzlg[] r6 = r4.f43685h     // Catch:{ all -> 0x00a4 }
            int r7 = r4.f43688k     // Catch:{ all -> 0x00a4 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a4 }
            r5.f42966a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x00a4:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.brm.mo30602a(com.google.android.gms.internal.ads.bmh, com.google.android.gms.internal.ads.boc, boolean, boolean, com.google.android.gms.internal.ads.zzlg, com.google.android.gms.internal.ads.brn):int");
    }

    /* renamed from: g */
    public final synchronized long mo30613g() {
        if (!mo30610d()) {
            return -1;
        }
        int i = ((this.f43688k + this.f43686i) - 1) % this.f43678a;
        this.f43688k = (this.f43688k + this.f43686i) % this.f43678a;
        this.f43687j += this.f43686i;
        this.f43686i = 0;
        return this.f43680c[i] + ((long) this.f43681d[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo30603a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo30610d()     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 == 0) goto L_0x005f
            long[] r0 = r8.f43683f     // Catch:{ all -> 0x0061 }
            int r3 = r8.f43688k     // Catch:{ all -> 0x0061 }
            r3 = r0[r3]     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005f
        L_0x0014:
            long r3 = r8.f43691n     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.f43688k     // Catch:{ all -> 0x0061 }
            r3 = -1
            r11 = -1
            r4 = 0
        L_0x0024:
            int r5 = r8.f43689l     // Catch:{ all -> 0x0061 }
            if (r0 == r5) goto L_0x0041
            long[] r5 = r8.f43683f     // Catch:{ all -> 0x0061 }
            r6 = r5[r0]     // Catch:{ all -> 0x0061 }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            int[] r5 = r8.f43682e     // Catch:{ all -> 0x0061 }
            r5 = r5[r0]     // Catch:{ all -> 0x0061 }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0039
            r11 = r4
        L_0x0039:
            int r0 = r0 + 1
            int r5 = r8.f43678a     // Catch:{ all -> 0x0061 }
            int r0 = r0 % r5
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0041:
            if (r11 != r3) goto L_0x0045
            monitor-exit(r8)
            return r1
        L_0x0045:
            int r9 = r8.f43688k     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            int r10 = r8.f43678a     // Catch:{ all -> 0x0061 }
            int r9 = r9 % r10
            r8.f43688k = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.f43687j     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            r8.f43687j = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.f43686i     // Catch:{ all -> 0x0061 }
            int r9 = r9 - r11
            r8.f43686i = r9     // Catch:{ all -> 0x0061 }
            long[] r9 = r8.f43680c     // Catch:{ all -> 0x0061 }
            int r10 = r8.f43688k     // Catch:{ all -> 0x0061 }
            r10 = r9[r10]     // Catch:{ all -> 0x0061 }
            monitor-exit(r8)
            return r10
        L_0x005f:
            monitor-exit(r8)
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.brm.mo30603a(long, boolean):long");
    }

    /* renamed from: a */
    public final synchronized boolean mo30607a(zzlg zzlg) {
        if (zzlg == null) {
            this.f43693p = true;
            return false;
        }
        this.f43693p = false;
        if (btw.m36762a((Object) zzlg, (Object) this.f43694q)) {
            return false;
        }
        this.f43694q = zzlg;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30606a(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.bou r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f43692o     // Catch:{ all -> 0x00e9 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f43692o = r1     // Catch:{ all -> 0x00e9 }
        L_0x000e:
            boolean r0 = r5.f43693p     // Catch:{ all -> 0x00e9 }
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.bti.m36701b(r0)     // Catch:{ all -> 0x00e9 }
            r5.mo30605a(r6)     // Catch:{ all -> 0x00e9 }
            long[] r0 = r5.f43683f     // Catch:{ all -> 0x00e9 }
            int r2 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r0[r2] = r6     // Catch:{ all -> 0x00e9 }
            long[] r6 = r5.f43680c     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r9     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f43681d     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r11     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f43682e     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r8     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bou[] r6 = r5.f43684g     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r12     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzlg[] r6 = r5.f43685h     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzlg r8 = r5.f43694q     // Catch:{ all -> 0x00e9 }
            r6[r7] = r8     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f43679b     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r1     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f43686i     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1
            r5.f43686i = r6     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f43686i     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            if (r6 != r7) goto L_0x00d9
            int r6 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e9 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e9 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e9 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e9 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bou[] r12 = new com.google.android.gms.internal.ads.bou[r6]     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzlg[] r0 = new com.google.android.gms.internal.ads.zzlg[r6]     // Catch:{ all -> 0x00e9 }
            int r2 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            int r3 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            int r2 = r2 - r3
            long[] r3 = r5.f43680c     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e9 }
            long[] r3 = r5.f43683f     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f43682e     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f43681d     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bou[] r3 = r5.f43684g     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzlg[] r3 = r5.f43685h     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f43679b     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e9 }
            int r3 = r5.f43688k     // Catch:{ all -> 0x00e9 }
            long[] r4 = r5.f43680c     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e9 }
            long[] r4 = r5.f43683f     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f43682e     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f43681d     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bou[] r4 = r5.f43684g     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzlg[] r4 = r5.f43685h     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f43679b     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e9 }
            r5.f43680c = r8     // Catch:{ all -> 0x00e9 }
            r5.f43683f = r9     // Catch:{ all -> 0x00e9 }
            r5.f43682e = r10     // Catch:{ all -> 0x00e9 }
            r5.f43681d = r11     // Catch:{ all -> 0x00e9 }
            r5.f43684g = r12     // Catch:{ all -> 0x00e9 }
            r5.f43685h = r0     // Catch:{ all -> 0x00e9 }
            r5.f43679b = r7     // Catch:{ all -> 0x00e9 }
            r5.f43688k = r1     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            r5.f43689l = r7     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            r5.f43686i = r7     // Catch:{ all -> 0x00e9 }
            r5.f43678a = r6     // Catch:{ all -> 0x00e9 }
            monitor-exit(r5)
            return
        L_0x00d9:
            int r6 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1
            r5.f43689l = r6     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f43689l     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f43678a     // Catch:{ all -> 0x00e9 }
            if (r6 != r7) goto L_0x00e7
            r5.f43689l = r1     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            monitor-exit(r5)
            return
        L_0x00e9:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.brm.mo30606a(long, int, long, int, com.google.android.gms.internal.ads.bou):void");
    }

    /* renamed from: a */
    public final synchronized void mo30605a(long j) {
        this.f43691n = Math.max(this.f43691n, j);
    }
}
