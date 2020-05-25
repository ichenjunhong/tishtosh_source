package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class afv implements Runnable {

    /* renamed from: a */
    private final agl f40411a;

    /* renamed from: b */
    private final aga f40412b;

    /* renamed from: c */
    private final Class f40413c;

    /* renamed from: d */
    private final afk f40414d;

    /* renamed from: e */
    private final Executor f40415e;

    afv(agl agl, aga aga, Class cls, afk afk, Executor executor) {
        this.f40411a = agl;
        this.f40412b = aga;
        this.f40413c = cls;
        this.f40414d = afk;
        this.f40415e = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.agl r0 = r6.f40411a
            com.google.android.gms.internal.ads.aga r1 = r6.f40412b
            java.lang.Class r2 = r6.f40413c
            com.google.android.gms.internal.ads.afk r3 = r6.f40414d
            java.util.concurrent.Executor r4 = r6.f40415e
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0014, Exception -> 0x0012 }
            r0.mo28823b(r1)     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0014, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            goto L_0x0022
        L_0x0014:
            r1 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L_0x0022
        L_0x001d:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
        L_0x0022:
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.afz r1 = com.google.android.gms.internal.ads.afp.m32820a(r1)
            com.google.android.gms.internal.ads.aga r1 = com.google.android.gms.internal.ads.afp.m32822a(r1, r3, r4)
            com.google.android.gms.internal.ads.afp.m32828a(r1, r0)
            return
        L_0x0034:
            r0.mo28822a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afv.run():void");
    }
}
