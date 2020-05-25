package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vc */
final /* synthetic */ class C16312vc implements Runnable {

    /* renamed from: a */
    private final C16302ut f45713a;

    /* renamed from: b */
    private final agn f45714b;

    C16312vc(C16302ut utVar, agn agn) {
        this.f45713a = utVar;
        this.f45714b = agn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ut r0 = r6.f45713a
            com.google.android.gms.internal.ads.agn r1 = r6.f45714b
            java.lang.Object r2 = r0.f45694b
            monitor-enter(r2)
            boolean r3 = r0.f45697e     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0012
            java.lang.String r0 = "Request task was already canceled"
            com.google.android.gms.internal.ads.abv.m32798e(r0)     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.vo r3 = r0.f45693a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzbgz r3 = r3.f45769j     // Catch:{ all -> 0x0061 }
            android.content.Context r4 = r0.f45695c     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.ve r5 = new com.google.android.gms.internal.ads.ve     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            boolean r5 = r5.mo31432a(r3)     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0031
            java.lang.String r3 = "Fetching ad response from local ad request service."
            com.google.android.gms.internal.ads.abv.m32792b(r3)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.vl r3 = new com.google.android.gms.internal.ads.vl     // Catch:{ all -> 0x0061 }
            r3.<init>(r4, r1, r0)     // Catch:{ all -> 0x0061 }
            r3.mo28618c()     // Catch:{ all -> 0x0061 }
            goto L_0x004c
        L_0x0031:
            java.lang.String r5 = "Fetching ad response from remote ad request service."
            com.google.android.gms.internal.ads.abv.m32792b(r5)     // Catch:{ all -> 0x0061 }
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r5 = com.google.android.gms.internal.ads.aes.m32765c(r4, r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0046
            java.lang.String r1 = "Failed to connect to remote ad request service."
            com.google.android.gms.internal.ads.abv.m32798e(r1)     // Catch:{ all -> 0x0061 }
            r3 = 0
            goto L_0x004c
        L_0x0046:
            com.google.android.gms.internal.ads.vm r5 = new com.google.android.gms.internal.ads.vm     // Catch:{ all -> 0x0061 }
            r5.<init>(r4, r3, r1, r0)     // Catch:{ all -> 0x0061 }
            r3 = r5
        L_0x004c:
            r0.f45698f = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.acz r1 = r0.f45698f     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005f
            r1 = 0
            java.lang.String r3 = "Could not start the ad request service."
            r0.mo31427a(r1, r3)     // Catch:{ all -> 0x0061 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.acd.f40245a     // Catch:{ all -> 0x0061 }
            java.lang.Runnable r0 = r0.f45696d     // Catch:{ all -> 0x0061 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16312vc.run():void");
    }
}
