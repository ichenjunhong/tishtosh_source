package com.google.android.gms.internal.ads;

final class bji {

    /* renamed from: a */
    int f42610a;

    /* renamed from: b */
    int f42611b;

    /* renamed from: c */
    int f42612c;

    /* renamed from: d */
    int f42613d;

    /* renamed from: e */
    private int f42614e = 1000;

    /* renamed from: f */
    private long[] f42615f = new long[this.f42614e];

    /* renamed from: g */
    private int[] f42616g = new int[this.f42614e];

    /* renamed from: h */
    private int[] f42617h = new int[this.f42614e];

    /* renamed from: i */
    private long[] f42618i = new long[this.f42614e];

    /* renamed from: j */
    private byte[][] f42619j = new byte[this.f42614e][];

    /* renamed from: a */
    public final synchronized boolean mo30289a(bih bih, bjj bjj) {
        if (this.f42610a == 0) {
            return false;
        }
        bih.f42490e = this.f42618i[this.f42612c];
        bih.f42488c = this.f42616g[this.f42612c];
        bih.f42489d = this.f42617h[this.f42612c];
        bjj.f42620a = this.f42615f[this.f42612c];
        bjj.f42621b = this.f42619j[this.f42612c];
        return true;
    }

    /* renamed from: a */
    public final synchronized long mo30286a() {
        this.f42610a--;
        int i = this.f42612c;
        this.f42612c = i + 1;
        this.f42611b++;
        if (this.f42612c == this.f42614e) {
            this.f42612c = 0;
        }
        if (this.f42610a > 0) {
            return this.f42615f[this.f42612c];
        }
        return ((long) this.f42616g[i]) + this.f42615f[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo30287a(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f42610a     // Catch:{ all -> 0x006a }
            r1 = -1
            if (r0 == 0) goto L_0x0068
            long[] r0 = r9.f42618i     // Catch:{ all -> 0x006a }
            int r3 = r9.f42612c     // Catch:{ all -> 0x006a }
            r3 = r0[r3]     // Catch:{ all -> 0x006a }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0068
        L_0x0012:
            int r0 = r9.f42613d     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0019
            int r0 = r9.f42614e     // Catch:{ all -> 0x006a }
            goto L_0x001b
        L_0x0019:
            int r0 = r9.f42613d     // Catch:{ all -> 0x006a }
        L_0x001b:
            int r0 = r0 + -1
            long[] r3 = r9.f42618i     // Catch:{ all -> 0x006a }
            r4 = r3[r0]     // Catch:{ all -> 0x006a }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            monitor-exit(r9)
            return r1
        L_0x0027:
            r0 = 0
            int r3 = r9.f42612c     // Catch:{ all -> 0x006a }
            r4 = -1
            r0 = -1
            r5 = 0
        L_0x002d:
            int r6 = r9.f42613d     // Catch:{ all -> 0x006a }
            if (r3 == r6) goto L_0x004a
            long[] r6 = r9.f42618i     // Catch:{ all -> 0x006a }
            r7 = r6[r3]     // Catch:{ all -> 0x006a }
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x004a
            int[] r6 = r9.f42617h     // Catch:{ all -> 0x006a }
            r6 = r6[r3]     // Catch:{ all -> 0x006a }
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0042
            r0 = r5
        L_0x0042:
            int r3 = r3 + 1
            int r6 = r9.f42614e     // Catch:{ all -> 0x006a }
            int r3 = r3 % r6
            int r5 = r5 + 1
            goto L_0x002d
        L_0x004a:
            if (r0 != r4) goto L_0x004e
            monitor-exit(r9)
            return r1
        L_0x004e:
            int r10 = r9.f42610a     // Catch:{ all -> 0x006a }
            int r10 = r10 - r0
            r9.f42610a = r10     // Catch:{ all -> 0x006a }
            int r10 = r9.f42612c     // Catch:{ all -> 0x006a }
            int r10 = r10 + r0
            int r11 = r9.f42614e     // Catch:{ all -> 0x006a }
            int r10 = r10 % r11
            r9.f42612c = r10     // Catch:{ all -> 0x006a }
            int r10 = r9.f42611b     // Catch:{ all -> 0x006a }
            int r10 = r10 + r0
            r9.f42611b = r10     // Catch:{ all -> 0x006a }
            long[] r10 = r9.f42615f     // Catch:{ all -> 0x006a }
            int r11 = r9.f42612c     // Catch:{ all -> 0x006a }
            r0 = r10[r11]     // Catch:{ all -> 0x006a }
            monitor-exit(r9)
            return r0
        L_0x0068:
            monitor-exit(r9)
            return r1
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bji.mo30287a(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30288a(long r4, int r6, long r7, int r9, byte[] r10) {
        /*
            r3 = this;
            monitor-enter(r3)
            long[] r0 = r3.f42618i     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            r0[r1] = r4     // Catch:{ all -> 0x00a5 }
            long[] r4 = r3.f42615f     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            r4[r5] = r7     // Catch:{ all -> 0x00a5 }
            int[] r4 = r3.f42616g     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            r4[r5] = r9     // Catch:{ all -> 0x00a5 }
            int[] r4 = r3.f42617h     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            r4[r5] = r6     // Catch:{ all -> 0x00a5 }
            byte[][] r4 = r3.f42619j     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            r4[r5] = r10     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42610a     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1
            r3.f42610a = r4     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42610a     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            r6 = 0
            if (r4 != r5) goto L_0x0095
            int r4 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1000
            long[] r5 = new long[r4]     // Catch:{ all -> 0x00a5 }
            long[] r7 = new long[r4]     // Catch:{ all -> 0x00a5 }
            int[] r8 = new int[r4]     // Catch:{ all -> 0x00a5 }
            int[] r9 = new int[r4]     // Catch:{ all -> 0x00a5 }
            byte[][] r10 = new byte[r4][]     // Catch:{ all -> 0x00a5 }
            int r0 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            int r0 = r0 - r1
            long[] r1 = r3.f42615f     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r5, r6, r0)     // Catch:{ all -> 0x00a5 }
            long[] r1 = r3.f42618i     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r7, r6, r0)     // Catch:{ all -> 0x00a5 }
            int[] r1 = r3.f42617h     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r8, r6, r0)     // Catch:{ all -> 0x00a5 }
            int[] r1 = r3.f42616g     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r9, r6, r0)     // Catch:{ all -> 0x00a5 }
            byte[][] r1 = r3.f42619j     // Catch:{ all -> 0x00a5 }
            int r2 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r1, r2, r10, r6, r0)     // Catch:{ all -> 0x00a5 }
            int r1 = r3.f42612c     // Catch:{ all -> 0x00a5 }
            long[] r2 = r3.f42615f     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r5, r0, r1)     // Catch:{ all -> 0x00a5 }
            long[] r2 = r3.f42618i     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r7, r0, r1)     // Catch:{ all -> 0x00a5 }
            int[] r2 = r3.f42617h     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r8, r0, r1)     // Catch:{ all -> 0x00a5 }
            int[] r2 = r3.f42616g     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r9, r0, r1)     // Catch:{ all -> 0x00a5 }
            byte[][] r2 = r3.f42619j     // Catch:{ all -> 0x00a5 }
            java.lang.System.arraycopy(r2, r6, r10, r0, r1)     // Catch:{ all -> 0x00a5 }
            r3.f42615f = r5     // Catch:{ all -> 0x00a5 }
            r3.f42618i = r7     // Catch:{ all -> 0x00a5 }
            r3.f42617h = r8     // Catch:{ all -> 0x00a5 }
            r3.f42616g = r9     // Catch:{ all -> 0x00a5 }
            r3.f42619j = r10     // Catch:{ all -> 0x00a5 }
            r3.f42612c = r6     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            r3.f42613d = r5     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            r3.f42610a = r5     // Catch:{ all -> 0x00a5 }
            r3.f42614e = r4     // Catch:{ all -> 0x00a5 }
            monitor-exit(r3)
            return
        L_0x0095:
            int r4 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            int r4 = r4 + 1
            r3.f42613d = r4     // Catch:{ all -> 0x00a5 }
            int r4 = r3.f42613d     // Catch:{ all -> 0x00a5 }
            int r5 = r3.f42614e     // Catch:{ all -> 0x00a5 }
            if (r4 != r5) goto L_0x00a3
            r3.f42613d = r6     // Catch:{ all -> 0x00a5 }
        L_0x00a3:
            monitor-exit(r3)
            return
        L_0x00a5:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bji.mo30288a(long, int, long, int, byte[]):void");
    }
}
