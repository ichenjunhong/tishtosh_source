package com.google.android.gms.internal.ads;

import android.content.Context;

@C16299uq
public final class aac implements bvw {

    /* renamed from: a */
    public String f40046a;

    /* renamed from: b */
    private final Context f40047b;

    /* renamed from: c */
    private final Object f40048c;

    /* renamed from: d */
    private boolean f40049d;

    public aac(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f40047b = context;
        this.f40046a = str;
        this.f40049d = false;
        this.f40048c = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28550a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.aad r0 = com.google.android.gms.ads.internal.C14963ax.m30849s()
            android.content.Context r1 = r3.f40047b
            boolean r0 = r0.mo28557a(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f40048c
            monitor-enter(r0)
            boolean r1 = r3.f40049d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f40049d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f40046a     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f40049d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.aad r4 = com.google.android.gms.ads.internal.C14963ax.m30849s()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f40047b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f40046a     // Catch:{ all -> 0x003f }
            r4.mo28553a(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.aad r4 = com.google.android.gms.ads.internal.C14963ax.m30849s()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f40047b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f40046a     // Catch:{ all -> 0x003f }
            r4.mo28559b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aac.mo28550a(boolean):void");
    }

    /* renamed from: a */
    public final void mo28549a(bvv bvv) {
        mo28550a(bvv.f44078a);
    }
}
