package com.google.android.gms.internal.ads;

@C16299uq
public final class alq extends akt implements akh {

    /* renamed from: d */
    private ajz f40870d;

    /* renamed from: e */
    private String f40871e;

    /* renamed from: f */
    private boolean f40872f;

    /* renamed from: g */
    private Exception f40873g;

    /* renamed from: h */
    private boolean f40874h;

    public alq(aib aib, aia aia) {
        super(aib);
        this.f40870d = new ajz(aib.getContext(), aia);
    }

    /* renamed from: a */
    public final void mo29005a(int i, int i2) {
    }

    /* renamed from: g */
    public final void mo29008g(int i) {
    }

    /* renamed from: a */
    public final void mo29007a(boolean z, long j) {
        aib aib = (aib) this.f40784c.get();
        if (aib != null) {
            agf.f40430a.execute(new alr(aib, z, j));
        }
    }

    /* renamed from: a */
    public final void mo29006a(String str, Exception exc) {
        this.f40873g = exc;
        abv.m32795c("Precache error", exc);
        m33227c(str);
    }

    /* renamed from: a */
    public final void mo29089a(int i) {
        this.f40870d.f40745b.mo29045b(i);
    }

    /* renamed from: b */
    public final void mo29096b(int i) {
        this.f40870d.f40745b.mo29040a(i);
    }

    /* renamed from: c */
    public final void mo29097c(int i) {
        this.f40870d.f40745b.mo29047c(i);
    }

    /* renamed from: d */
    public final void mo29098d(int i) {
        this.f40870d.f40745b.mo29049d(i);
    }

    /* renamed from: b */
    public final void mo28127b() {
        if (this.f40870d != null) {
            this.f40870d.f40749f = null;
            this.f40870d.mo29060c();
        }
        super.mo28127b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29095b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo29095b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final boolean mo29093a(String str) {
        return mo29094a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01af, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r12.f40873g == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r1 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw r12.f40873g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0119, code lost:
        r3 = r35;
        r4 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r3.mo29091a(r4, r14, r12);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29094a(java.lang.String r36, java.lang.String[] r37) {
        /*
            r35 = this;
            r12 = r35
            r13 = r36
            r0 = r37
            r12.f40871e = r13
            java.lang.String r14 = r35.mo29095b(r36)
            java.lang.String r15 = "error"
            r16 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01b3 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01b3 }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01b3 }
            if (r2 >= r3) goto L_0x0027
            r3 = r0[r2]     // Catch:{ Exception -> 0x0022 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0022 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0022 }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            r0 = move-exception
            r3 = r12
            r4 = r13
            goto L_0x01b8
        L_0x0027:
            com.google.android.gms.internal.ads.ajz r0 = r12.f40870d     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r2 = r12.f40783b     // Catch:{ Exception -> 0x01b3 }
            r0.mo29058a(r1, r2)     // Catch:{ Exception -> 0x01b3 }
            java.lang.ref.WeakReference r0 = r12.f40784c     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.aib r0 = (com.google.android.gms.internal.ads.aib) r0     // Catch:{ Exception -> 0x01b3 }
            if (r0 == 0) goto L_0x003b
            r0.mo28933a(r14, r12)     // Catch:{ Exception -> 0x0022 }
        L_0x003b:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ Exception -> 0x01b3 }
            long r17 = r0.mo28523a()     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15740bx.f44491u     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ Exception -> 0x01b3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01b3 }
            long r10 = r1.longValue()     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15740bx.f44490t     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ Exception -> 0x01b3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01b3 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01b3 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r1 * r3
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15740bx.f44489s     // Catch:{ Exception -> 0x01b3 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ Exception -> 0x01b3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01b3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01b3 }
            long r5 = (long) r1     // Catch:{ Exception -> 0x01b3 }
            r1 = -1
        L_0x007a:
            monitor-enter(r35)     // Catch:{ Exception -> 0x01b3 }
            long r3 = r0.mo28523a()     // Catch:{ all -> 0x01a8 }
            r9 = 0
            long r3 = r3 - r17
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0179
            boolean r3 = r12.f40872f     // Catch:{ all -> 0x01a8 }
            if (r3 == 0) goto L_0x00a5
            java.lang.Exception r0 = r12.f40873g     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r12.f40873g     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            r15 = r1
            goto L_0x00a1
        L_0x0096:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x00a0:
            r0 = move-exception
        L_0x00a1:
            r3 = r12
            r4 = r13
            goto L_0x01ad
        L_0x00a5:
            boolean r3 = r12.f40874h     // Catch:{ all -> 0x01a8 }
            r19 = 1
            if (r3 == 0) goto L_0x00af
            monitor-exit(r35)     // Catch:{ all -> 0x00a0 }
            r3 = r12
            goto L_0x0135
        L_0x00af:
            com.google.android.gms.internal.ads.ajz r3 = r12.f40870d     // Catch:{ all -> 0x01a8 }
            com.google.android.gms.internal.ads.blu r3 = r3.f40748e     // Catch:{ all -> 0x01a8 }
            if (r3 == 0) goto L_0x016b
            r20 = r10
            long r11 = r3.mo30375f()     // Catch:{ all -> 0x0164 }
            r22 = 0
            int r4 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r4 <= 0) goto L_0x013a
            long r24 = r3.mo30377h()     // Catch:{ all -> 0x0164 }
            int r3 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x010a
            int r1 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cf
            r9 = 1
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            int r10 = com.google.android.gms.internal.ads.ajz.m33121a()     // Catch:{ all -> 0x0101 }
            int r26 = com.google.android.gms.internal.ads.ajz.m33123b()     // Catch:{ all -> 0x0101 }
            android.os.Handler r4 = com.google.android.gms.internal.ads.aes.f40377a     // Catch:{ all -> 0x0101 }
            com.google.android.gms.internal.ads.akx r3 = new com.google.android.gms.internal.ads.akx     // Catch:{ all -> 0x0101 }
            r1 = r3
            r2 = r35
            r27 = r0
            r0 = r3
            r3 = r36
            r28 = r15
            r15 = r4
            r4 = r14
            r29 = r5
            r5 = r24
            r31 = r7
            r7 = r11
            r33 = r20
            r12 = r11
            r11 = r26
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ all -> 0x00fd }
            r15.post(r0)     // Catch:{ all -> 0x00fd }
            r1 = r24
            goto L_0x0115
        L_0x00fd:
            r0 = move-exception
            r15 = r28
            goto L_0x0104
        L_0x0101:
            r0 = move-exception
            r28 = r15
        L_0x0104:
            r3 = r35
            r4 = r36
            goto L_0x01ad
        L_0x010a:
            r27 = r0
            r29 = r5
            r31 = r7
            r12 = r11
            r28 = r15
            r33 = r20
        L_0x0115:
            int r0 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0123
            r5 = r12
            r3 = r35
            r4 = r36
            r3.mo29091a(r4, r14, r5)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r35)     // Catch:{ all -> 0x01a4 }
            goto L_0x0135
        L_0x0123:
            r3 = r35
            r4 = r36
            com.google.android.gms.internal.ads.ajz r0 = r3.f40870d     // Catch:{ all -> 0x01a4 }
            int r0 = r0.f40750g     // Catch:{ all -> 0x01a4 }
            long r5 = (long) r0     // Catch:{ all -> 0x01a4 }
            int r0 = (r5 > r29 ? 1 : (r5 == r29 ? 0 : -1))
            if (r0 < 0) goto L_0x0136
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            monitor-exit(r35)     // Catch:{ all -> 0x01a4 }
        L_0x0135:
            return r19
        L_0x0136:
            r5 = r1
            r0 = r33
            goto L_0x0148
        L_0x013a:
            r27 = r0
            r29 = r5
            r31 = r7
            r4 = r13
            r28 = r15
            r3 = r35
            r5 = r1
            r0 = r20
        L_0x0148:
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x015a }
            monitor-exit(r35)     // Catch:{ all -> 0x01a4 }
            r10 = r0
            r12 = r3
            r13 = r4
            r1 = r5
            r0 = r27
            r15 = r28
            r5 = r29
            r7 = r31
            goto L_0x007a
        L_0x015a:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0164:
            r0 = move-exception
            r4 = r13
            r28 = r15
            r3 = r35
            goto L_0x01ad
        L_0x016b:
            r3 = r12
            r4 = r13
            r28 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x0179:
            r31 = r7
            r3 = r12
            r4 = r13
            r28 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a1 }
            r2 = 47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r5.<init>(r2)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r5.append(r2)     // Catch:{ all -> 0x01a1 }
            r6 = r31
            r5.append(r6)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = " ms"
            r5.append(r2)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x01a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            r15 = r1
            goto L_0x01ad
        L_0x01a4:
            r0 = move-exception
            r15 = r28
            goto L_0x01ad
        L_0x01a8:
            r0 = move-exception
            r3 = r12
            r4 = r13
            r28 = r15
        L_0x01ad:
            monitor-exit(r35)     // Catch:{ all -> 0x01b1 }
            throw r0     // Catch:{ Exception -> 0x01af }
        L_0x01af:
            r0 = move-exception
            goto L_0x01b8
        L_0x01b1:
            r0 = move-exception
            goto L_0x01ad
        L_0x01b3:
            r0 = move-exception
            r3 = r12
            r4 = r13
            r28 = r15
        L_0x01b8:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r36)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r2 = r2 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = " Exception: "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.google.android.gms.internal.ads.abv.m32798e(r1)
            r35.mo28127b()
            java.lang.String r0 = m33226b(r15, r0)
            r3.mo29092a(r4, r14, r15, r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alq.mo29094a(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: a */
    public final void mo29088a() {
        m33227c((String) null);
    }

    /* renamed from: c */
    private final void m33227c(String str) {
        synchronized (this) {
            this.f40872f = true;
            notify();
            mo28127b();
        }
        if (this.f40871e != null) {
            String b = mo29095b(this.f40871e);
            if (this.f40873g != null) {
                mo29092a(this.f40871e, b, "badUrl", m33226b(str, this.f40873g));
                return;
            }
            mo29092a(this.f40871e, b, "externalAbort", "Programmatic precache abort.");
        }
    }

    /* renamed from: c */
    public final ajz mo29115c() {
        synchronized (this) {
            this.f40874h = true;
            notify();
        }
        this.f40870d.f40749f = null;
        ajz ajz = this.f40870d;
        this.f40870d = null;
        return ajz;
    }

    /* renamed from: b */
    private static String m33226b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
