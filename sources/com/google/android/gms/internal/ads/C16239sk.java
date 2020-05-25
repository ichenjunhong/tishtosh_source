package com.google.android.gms.internal.ads;

import android.content.Context;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.sk */
public abstract class C16239sk extends C15563abr {

    /* renamed from: a */
    protected final C16244sp f45532a;

    /* renamed from: b */
    protected final Context f45533b;

    /* renamed from: c */
    protected final Object f45534c = new Object();

    /* renamed from: d */
    protected final Object f45535d = new Object();

    /* renamed from: e */
    protected final abc f45536e;

    /* renamed from: f */
    protected zzaxi f45537f;

    protected C16239sk(Context context, abc abc, C16244sp spVar) {
        super(true);
        this.f45533b = context;
        this.f45536e = abc;
        this.f45537f = abc.f40130b;
        this.f45532a = spVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract abb mo31381a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31382a(long j) throws C16242sn;

    /* renamed from: x_ */
    public void mo27697x_() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ sn -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ sn -> 0x0014 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27696a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f45534c
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.abv.m32792b(r1)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.abc r1 = r5.f45536e     // Catch:{ all -> 0x0061 }
            int r1 = r1.f40133e     // Catch:{ all -> 0x0061 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ sn -> 0x0014 }
            r5.mo31382a(r2)     // Catch:{ sn -> 0x0014 }
            goto L_0x0051
        L_0x0014:
            r1 = move-exception
            int r2 = r1.getErrorCode()     // Catch:{ all -> 0x0061 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.abv.m32798e(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.abv.m32796d(r1)     // Catch:{ all -> 0x0061 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzaxi r1 = r5.f45537f     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaxi r1 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0061 }
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            r5.f45537f = r1     // Catch:{ all -> 0x0061 }
            goto L_0x0046
        L_0x003b:
            com.google.android.gms.internal.ads.zzaxi r1 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzaxi r3 = r5.f45537f     // Catch:{ all -> 0x0061 }
            long r3 = r3.f46192j     // Catch:{ all -> 0x0061 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0061 }
            r5.f45537f = r1     // Catch:{ all -> 0x0061 }
        L_0x0046:
            android.os.Handler r1 = com.google.android.gms.internal.ads.acd.f40245a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.sl r3 = new com.google.android.gms.internal.ads.sl     // Catch:{ all -> 0x0061 }
            r3.<init>(r5)     // Catch:{ all -> 0x0061 }
            r1.post(r3)     // Catch:{ all -> 0x0061 }
            r1 = r2
        L_0x0051:
            com.google.android.gms.internal.ads.abb r1 = r5.mo31381a(r1)     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.acd.f40245a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.sm r3 = new com.google.android.gms.internal.ads.sm     // Catch:{ all -> 0x0061 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16239sk.mo27696a():void");
    }
}
