package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eh */
final class C15858eh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15845dv f44964a;

    /* renamed from: b */
    private final /* synthetic */ C15857eg f44965b;

    C15858eh(C15857eg egVar, C15845dv dvVar) {
        this.f44965b = egVar;
        this.f44964a = dvVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.eg r0 = r8.f44965b
            com.google.android.gms.internal.ads.dv r1 = r8.f44964a
            java.lang.Object r2 = r0.f44954a
            monitor-enter(r2)
            java.lang.String[] r3 = com.google.android.gms.internal.ads.C15857eg.f44953e     // Catch:{ all -> 0x003f }
            int r4 = r3.length     // Catch:{ all -> 0x003f }
            r5 = 0
        L_0x000b:
            if (r5 >= r4) goto L_0x0023
            r6 = r3[r5]     // Catch:{ all -> 0x003f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r0.f44957d     // Catch:{ all -> 0x003f }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x003f }
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x0020
            java.lang.Object r3 = r6.get()     // Catch:{ all -> 0x003f }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x003f }
            goto L_0x0024
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x0023:
            r3 = 0
        L_0x0024:
            boolean r4 = r3 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x002d
            r1.mo31029l()     // Catch:{ all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            return
        L_0x002d:
            com.google.android.gms.internal.ads.ei r4 = new com.google.android.gms.internal.ads.ei     // Catch:{ all -> 0x003f }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x003f }
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003a
            r1.mo31050b(r3, r4)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003a:
            r1.mo31032a(r3, r4)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15858eh.run():void");
    }
}
