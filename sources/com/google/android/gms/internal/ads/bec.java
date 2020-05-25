package com.google.android.gms.internal.ads;

final class bec implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bea f42159a;

    bec(bea bea) {
        this.f42159a = bea;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:10|(2:11|12)|(2:16|17)|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.bea r0 = r7.f42159a
            java.lang.Boolean r0 = r0.f42151c
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.bea.f42148d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bea r1 = r7.f42159a     // Catch:{ all -> 0x004b }
            java.lang.Boolean r1 = r1.f42151c     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x0014:
            r1 = 0
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C15740bx.f44309bq     // Catch:{ IllegalStateException -> 0x0026 }
            com.google.android.gms.internal.ads.bu r3 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Object r2 = r3.mo30717a(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IllegalStateException -> 0x0026 }
            boolean r2 = r2.booleanValue()     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.byh r3 = new com.google.android.gms.internal.ads.byh     // Catch:{ Throwable -> 0x003a }
            com.google.android.gms.internal.ads.bea r4 = r7.f42159a     // Catch:{ Throwable -> 0x003a }
            com.google.android.gms.internal.ads.bey r4 = r4.f42150a     // Catch:{ Throwable -> 0x003a }
            android.content.Context r4 = r4.f42216a     // Catch:{ Throwable -> 0x003a }
            java.lang.String r5 = "ADSHIELD"
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x003a }
            com.google.android.gms.internal.ads.bea.f42147b = r3     // Catch:{ Throwable -> 0x003a }
        L_0x0039:
            r1 = r2
        L_0x003a:
            com.google.android.gms.internal.ads.bea r2 = r7.f42159a     // Catch:{ all -> 0x004b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x004b }
            r2.f42151c = r1     // Catch:{ all -> 0x004b }
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.bea.f42148d     // Catch:{ all -> 0x004b }
            r1.open()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bec.run():void");
    }
}
