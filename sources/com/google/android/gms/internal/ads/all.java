package com.google.android.gms.internal.ads;

@C16299uq
public abstract class all extends akt {

    /* renamed from: d */
    public final aig f40853d = new aig();

    /* renamed from: e */
    String f40854e;

    /* renamed from: f */
    private boolean f40855f;

    /* renamed from: g */
    private boolean f40856g;

    public all(aib aib) {
        super(aib);
        this.f40853d.mo28964a((ail) new alm(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bii mo29109c(String str);

    /* renamed from: b */
    public final void mo28127b() {
        this.f40853d.mo28967b();
        super.mo28127b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29095b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo29095b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(r10.f40854e) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        r1 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        r15 = r10.f40854e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        r1 = "externalAbort";
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        java.lang.Thread.sleep(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f8, code lost:
        r1 = "error";
        r15 = "Sleep interrupted.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0103, code lost:
        throw new java.io.IOException("Interrupted sleep.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0136, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0160, code lost:
        r13 = r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29093a(java.lang.String r33) {
        /*
            r32 = this;
            r10 = r32
            r11 = r33
            com.google.android.gms.internal.ads.bii r0 = r32.mo29109c(r33)
            java.lang.String r12 = r32.mo29095b(r33)
            java.lang.String r13 = "error"
            com.google.android.gms.internal.ads.aig r1 = r10.f40853d     // Catch:{ IOException -> 0x0165 }
            boolean r0 = r1.mo28966a(r0)     // Catch:{ IOException -> 0x0165 }
            if (r0 == 0) goto L_0x0150
            com.google.android.gms.internal.ads.aig r0 = r10.f40853d     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bgz r0 = r0.f40589b     // Catch:{ IOException -> 0x0165 }
            if (r0 == 0) goto L_0x0141
            java.lang.ref.WeakReference r1 = r10.f40784c     // Catch:{ IOException -> 0x0165 }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.aib r1 = (com.google.android.gms.internal.ads.aib) r1     // Catch:{ IOException -> 0x0165 }
            if (r1 == 0) goto L_0x0029
            r1.mo28933a(r12, r10)     // Catch:{ IOException -> 0x0165 }
        L_0x0029:
            com.google.android.gms.common.util.e r16 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ IOException -> 0x0165 }
            long r17 = r16.mo28523a()     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15740bx.f44491u     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ IOException -> 0x0165 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ IOException -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x0165 }
            long r19 = r1.longValue()     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15740bx.f44490t     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ IOException -> 0x0165 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ IOException -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x0165 }
            long r1 = r1.longValue()     // Catch:{ IOException -> 0x0165 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r21 = r1 * r3
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15740bx.f44489s     // Catch:{ IOException -> 0x0165 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ IOException -> 0x0165 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ IOException -> 0x0165 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0165 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0165 }
            long r7 = (long) r1     // Catch:{ IOException -> 0x0165 }
            r1 = -1
        L_0x0068:
            monitor-enter(r32)     // Catch:{ IOException -> 0x0165 }
            long r3 = r16.mo28523a()     // Catch:{ all -> 0x0139 }
            r5 = 0
            long r3 = r3 - r17
            int r5 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r5 > 0) goto L_0x0104
            boolean r3 = r10.f40855f     // Catch:{ all -> 0x0139 }
            if (r3 == 0) goto L_0x0095
            java.lang.String r0 = r10.f40854e     // Catch:{ all -> 0x0139 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0139 }
            if (r0 != 0) goto L_0x0086
            java.lang.String r1 = "badUrl"
            java.lang.String r0 = r10.f40854e     // Catch:{ all -> 0x0136 }
            r15 = r0
            goto L_0x0089
        L_0x0086:
            java.lang.String r1 = "externalAbort"
            r15 = 0
        L_0x0089:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r13 = r1
            goto L_0x013b
        L_0x0095:
            boolean r3 = r10.f40856g     // Catch:{ all -> 0x0139 }
            r23 = 1
            if (r3 == 0) goto L_0x009d
            monitor-exit(r32)     // Catch:{ all -> 0x0139 }
            goto L_0x00eb
        L_0x009d:
            long r5 = r0.mo30155e()     // Catch:{ all -> 0x0139 }
            r24 = 0
            int r3 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ee
            long r26 = r0.mo30157g()     // Catch:{ all -> 0x0139 }
            int r3 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00d5
            int r1 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r9 = 1
            goto L_0x00b6
        L_0x00b5:
            r9 = 0
        L_0x00b6:
            android.os.Handler r4 = com.google.android.gms.internal.ads.aes.f40377a     // Catch:{ all -> 0x0139 }
            com.google.android.gms.internal.ads.akw r3 = new com.google.android.gms.internal.ads.akw     // Catch:{ all -> 0x0139 }
            r1 = r3
            r2 = r32
            r15 = r3
            r3 = r33
            r14 = r4
            r4 = r12
            r28 = r5
            r5 = r26
            r30 = r7
            r7 = r28
            r1.<init>(r2, r3, r4, r5, r7, r9)     // Catch:{ all -> 0x0139 }
            r14.post(r15)     // Catch:{ all -> 0x0139 }
            r3 = r26
            r1 = r28
            goto L_0x00d9
        L_0x00d5:
            r30 = r7
            r3 = r1
            r1 = r5
        L_0x00d9:
            int r5 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x00e2
            r10.mo29091a(r11, r12, r1)     // Catch:{ all -> 0x0139 }
            monitor-exit(r32)     // Catch:{ all -> 0x0139 }
            goto L_0x00eb
        L_0x00e2:
            int r1 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r1 < 0) goto L_0x00ec
            int r1 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ec
            monitor-exit(r32)     // Catch:{ all -> 0x0139 }
        L_0x00eb:
            return r23
        L_0x00ec:
            r1 = r3
            goto L_0x00f0
        L_0x00ee:
            r30 = r7
        L_0x00f0:
            monitor-exit(r32)     // Catch:{ all -> 0x0139 }
            java.lang.Thread.sleep(r19)     // Catch:{ InterruptedException -> 0x00f8 }
            r7 = r30
            goto L_0x0068
        L_0x00f8:
            java.lang.String r1 = "error"
            java.lang.String r15 = "Sleep interrupted."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x015f }
            java.lang.String r2 = "Interrupted sleep."
            r0.<init>(r2)     // Catch:{ IOException -> 0x015f }
            throw r0     // Catch:{ IOException -> 0x015f }
        L_0x0104:
            java.lang.String r1 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r21)     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0136 }
            int r2 = r2.length()     // Catch:{ all -> 0x0136 }
            int r2 = r2 + 27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            r3.<init>(r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0136 }
            r3.append(r0)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = " ms"
            r3.append(r0)     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0136 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "Timed out while buffering."
            r0.<init>(r3)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            r13 = r1
            r15 = r2
            goto L_0x013b
        L_0x0136:
            r0 = move-exception
            r13 = r1
            goto L_0x013a
        L_0x0139:
            r0 = move-exception
        L_0x013a:
            r15 = 0
        L_0x013b:
            monitor-exit(r32)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ IOException -> 0x013d }
        L_0x013d:
            r0 = move-exception
            goto L_0x0167
        L_0x013f:
            r0 = move-exception
            goto L_0x013b
        L_0x0141:
            java.lang.String r1 = "playerFailed"
            java.lang.String r15 = "ExoPlayer not created"
            r32.mo28127b()     // Catch:{ IOException -> 0x015f }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x015f }
            java.lang.String r2 = "Failed to get ExoPlayer"
            r0.<init>(r2)     // Catch:{ IOException -> 0x015f }
            throw r0     // Catch:{ IOException -> 0x015f }
        L_0x0150:
            java.lang.String r1 = "playerFailed"
            java.lang.String r15 = "ExoPlayer prepare failed"
            r32.mo28127b()     // Catch:{ IOException -> 0x015f }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x015f }
            java.lang.String r2 = "Failed to prepare AdExoPlayerHelper"
            r0.<init>(r2)     // Catch:{ IOException -> 0x015f }
            throw r0     // Catch:{ IOException -> 0x015f }
        L_0x015f:
            r0 = move-exception
            r13 = r1
            goto L_0x0167
        L_0x0162:
            r0 = move-exception
            r13 = r1
            goto L_0x0166
        L_0x0165:
            r0 = move-exception
        L_0x0166:
            r15 = 0
        L_0x0167:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r33)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            r10.mo29092a(r11, r12, r13, r15)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.all.mo29093a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo29088a() {
        synchronized (this) {
            this.f40855f = true;
        }
    }

    /* renamed from: c */
    public final void mo29111c() {
        synchronized (this) {
            this.f40856g = true;
            this.f40853d.mo28968c();
        }
    }
}
