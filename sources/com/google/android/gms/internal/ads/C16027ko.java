package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ko */
final class C16027ko extends cam {

    /* renamed from: a */
    private final cal f45111a;

    C16027ko(cal cal) {
        this.f45111a = cal;
    }

    /* renamed from: a */
    public final void mo30870a(int i) throws RemoteException {
        this.f45111a.mo30870a(i);
    }

    /* renamed from: b */
    public final void mo30871b() throws RemoteException {
        this.f45111a.mo30871b();
    }

    /* renamed from: c */
    public final void mo30872c() throws RemoteException {
        this.f45111a.mo30872c();
    }

    /* renamed from: d */
    public final void mo30873d() throws RemoteException {
        this.f45111a.mo30873d();
    }

    /* renamed from: e */
    public final void mo30874e() throws RemoteException {
        this.f45111a.mo30874e();
    }

    /* renamed from: f */
    public final void mo30875f() throws RemoteException {
        this.f45111a.mo30875f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30869a() throws android.os.RemoteException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.ku r0 = com.google.android.gms.internal.ads.C16036kx.f45143a
            int r0 = r0.f45133d
            com.google.android.gms.internal.ads.ku r1 = com.google.android.gms.internal.ads.C16036kx.f45143a
            int r1 = r1.f45134e
            com.google.android.gms.internal.ads.ku r2 = com.google.android.gms.internal.ads.C16036kx.f45143a
            int r2 = r2.f45132c
            com.google.android.gms.internal.ads.ku r3 = com.google.android.gms.internal.ads.C16036kx.f45143a
            int r3 = r3.f45131b
            int r2 = r2 + r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r7 = 16
            r8 = 1
            if (r0 >= r7) goto L_0x0029
            long r9 = com.google.android.gms.internal.ads.C16036kx.f45147e
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0029
            long r9 = com.google.android.gms.internal.ads.C16036kx.f45147e
            int r9 = com.google.android.gms.internal.ads.C16036kx.m37982a(r9, r0)
            goto L_0x003a
        L_0x0029:
            float r9 = com.google.android.gms.internal.ads.C16036kx.f45146d
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0037
            float r9 = com.google.android.gms.internal.ads.C16036kx.f45146d
            float r10 = (float) r0
            float r9 = r9 * r10
            int r9 = (int) r9
            int r9 = r9 + r8
            goto L_0x003a
        L_0x0037:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x003a:
            if (r1 > r9) goto L_0x005b
            if (r0 >= r7) goto L_0x004b
            long r9 = com.google.android.gms.internal.ads.C16036kx.f45145c
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x004b
            long r3 = com.google.android.gms.internal.ads.C16036kx.f45145c
            int r3 = com.google.android.gms.internal.ads.C16036kx.m37982a(r3, r0)
            goto L_0x0057
        L_0x004b:
            float r1 = com.google.android.gms.internal.ads.C16036kx.f45144b
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0057
            float r1 = com.google.android.gms.internal.ads.C16036kx.f45144b
            float r0 = (float) r0
            float r1 = r1 * r0
            int r3 = (int) r1
        L_0x0057:
            if (r2 > r3) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C15740bx.f44234aU
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r0 = r1.mo30717a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15740bx.f44235aV
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r1 = r2.mo30717a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 <= 0) goto L_0x0097
            if (r1 >= 0) goto L_0x0083
            goto L_0x0097
        L_0x0083:
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r1 = r1 + r8
            int r1 = r2.nextInt(r1)
            int r0 = r0 + r1
            long r0 = (long) r0
            android.os.Handler r2 = com.google.android.gms.internal.ads.acd.f40245a
            java.lang.Runnable r3 = com.google.android.gms.internal.ads.C16028kp.f45112a
            r2.postDelayed(r3, r0)
            goto L_0x009e
        L_0x0097:
            com.google.android.gms.internal.ads.kq r0 = com.google.android.gms.ads.internal.C14963ax.m30842l()
            r0.mo31133a()
        L_0x009e:
            com.google.android.gms.internal.ads.cal r0 = r12.f45111a
            r0.mo30869a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16027ko.mo30869a():void");
    }
}
