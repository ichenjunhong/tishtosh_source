package com.google.android.gms.internal.ads;

public abstract class bmp {

    /* renamed from: a */
    public static final bmp f42976a = new bmq();

    /* renamed from: a */
    public abstract int mo30409a(Object obj);

    /* renamed from: a */
    public abstract bmr mo30410a(int i, bmr bmr, boolean z);

    /* renamed from: a */
    public abstract bms mo30412a(int i, bms bms, boolean z, long j);

    /* renamed from: b */
    public abstract int mo30414b();

    /* renamed from: c */
    public abstract int mo30415c();

    /* renamed from: a */
    public final boolean mo30413a() {
        return mo30414b() == 0;
    }

    /* renamed from: a */
    public final bms mo30411a(int i, bms bms, boolean z) {
        return mo30412a(i, bms, false, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if ((mo30414b() - 1) == 0) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30408a(int r2, com.google.android.gms.internal.ads.bmr r3, com.google.android.gms.internal.ads.bms r4, int r5) {
        /*
            r1 = this;
            r0 = 0
            r1.mo30410a(r2, r3, r0)
            r1.mo30411a(r0, r4, r0)
            r3 = 1
            if (r2 != 0) goto L_0x002c
            r2 = -1
            switch(r5) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001b;
                case 2: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L_0x0014:
            int r5 = r1.mo30414b()
            int r5 = r5 - r3
            if (r5 != 0) goto L_0x0025
        L_0x001b:
            r3 = 0
            goto L_0x0025
        L_0x001d:
            int r5 = r1.mo30414b()
            int r5 = r5 - r3
            if (r5 != 0) goto L_0x0025
            r3 = -1
        L_0x0025:
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0028:
            r1.mo30411a(r3, r4, r0)
            return r0
        L_0x002c:
            int r2 = r2 + r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmp.mo30408a(int, com.google.android.gms.internal.ads.bmr, com.google.android.gms.internal.ads.bms, int):int");
    }
}
