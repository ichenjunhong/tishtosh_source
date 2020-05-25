package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class azq<T> implements bab<T> {

    /* renamed from: a */
    private final azj f41684a;

    /* renamed from: b */
    private final bau<?, ?> f41685b;

    /* renamed from: c */
    private final boolean f41686c;

    /* renamed from: d */
    private final axn<?> f41687d;

    private azq(bau<?, ?> bau, axn<?> axn, azj azj) {
        this.f41685b = bau;
        this.f41686c = axn.mo29794a(azj);
        this.f41687d = axn;
        this.f41684a = azj;
    }

    /* renamed from: a */
    static <T> azq<T> m34925a(bau<?, ?> bau, axn<?> axn, azj azj) {
        return new azq<>(bau, axn, azj);
    }

    /* renamed from: a */
    public final T mo29894a() {
        return this.f41684a.mo29826m().mo29831d();
    }

    /* renamed from: a */
    public final boolean mo29898a(T t, T t2) {
        if (!this.f41685b.mo29963b(t).equals(this.f41685b.mo29963b(t2))) {
            return false;
        }
        if (this.f41686c) {
            return this.f41687d.mo29788a((Object) t).equals(this.f41687d.mo29788a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo29892a(T t) {
        int hashCode = this.f41685b.mo29963b(t).hashCode();
        return this.f41686c ? (hashCode * 53) + this.f41687d.mo29788a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo29900b(T t, T t2) {
        bad.m35024a(this.f41685b, t, t2);
        if (this.f41686c) {
            bad.m35023a(this.f41687d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo29896a(T t, bbq bbq) throws IOException {
        Iterator c = this.f41687d.mo29788a((Object) t).mo29800c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            axs axs = (axs) entry.getKey();
            if (axs.mo29809c() != bbp.MESSAGE || axs.mo29810d() || axs.mo29811e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof ayo) {
                bbq.mo29747a(axs.mo29805a(), (Object) ((aym) ((ayo) entry).f41638a.getValue()).mo29854c());
            } else {
                bbq.mo29747a(axs.mo29805a(), entry.getValue());
            }
        }
        bau<?, ?> bau = this.f41685b;
        bau.mo29965b(bau.mo29963b(t), bbq);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29897a(T r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.ads.awl r13) throws java.io.IOException {
        /*
            r8 = this;
            r0 = r9
            com.google.android.gms.internal.ads.axz r0 = (com.google.android.gms.internal.ads.axz) r0
            com.google.android.gms.internal.ads.bav r1 = r0.zzfza
            com.google.android.gms.internal.ads.bav r2 = com.google.android.gms.internal.ads.bav.m35112a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.bav r1 = com.google.android.gms.internal.ads.bav.m35114b()
            r0.zzfza = r1
        L_0x0011:
            com.google.android.gms.internal.ads.axz$c r9 = (com.google.android.gms.internal.ads.axz.C15673c) r9
            com.google.android.gms.internal.ads.axq<java.lang.Object> r0 = r9.zzfzg
            boolean r0 = r0.f41530b
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.axq<java.lang.Object> r0 = r9.zzfzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.axq r0 = (com.google.android.gms.internal.ads.axq) r0
            r9.zzfzg = r0
        L_0x0023:
            r9 = 0
            r0 = r9
        L_0x0025:
            if (r11 >= r12) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r10, r11, r13)
            int r2 = r13.f41461a
            r11 = 11
            r3 = 2
            if (r2 == r11) goto L_0x005b
            r11 = r2 & 7
            if (r11 != r3) goto L_0x0056
            com.google.android.gms.internal.ads.axn<?> r11 = r8.f41687d
            com.google.android.gms.internal.ads.axm r0 = r13.f41464d
            com.google.android.gms.internal.ads.azj r3 = r8.f41684a
            int r5 = r2 >>> 3
            java.lang.Object r11 = r11.mo29789a(r0, r3, r5)
            r0 = r11
            com.google.android.gms.internal.ads.axz$d r0 = (com.google.android.gms.internal.ads.axz.C15674d) r0
            if (r0 != 0) goto L_0x0050
            r3 = r10
            r5 = r12
            r6 = r1
            r7 = r13
            int r11 = com.google.android.gms.internal.ads.awk.m34270a(r2, r3, r4, r5, r6, r7)
            goto L_0x0025
        L_0x0050:
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L_0x0056:
            int r11 = com.google.android.gms.internal.ads.awk.m34268a(r2, r10, r4, r12, r13)
            goto L_0x0025
        L_0x005b:
            r11 = 0
            r11 = r9
            r2 = 0
        L_0x005e:
            if (r4 >= r12) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r10, r4, r13)
            int r5 = r13.f41461a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            switch(r6) {
                case 2: goto L_0x0081;
                case 3: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0096
        L_0x006e:
            if (r0 != 0) goto L_0x007b
            if (r7 != r3) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.awk.m34284e(r10, r4, r13)
            java.lang.Object r11 = r13.f41463c
            com.google.android.gms.internal.ads.awo r11 = (com.google.android.gms.internal.ads.awo) r11
            goto L_0x005e
        L_0x007b:
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L_0x0081:
            if (r7 != 0) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r10, r4, r13)
            int r2 = r13.f41461a
            com.google.android.gms.internal.ads.axn<?> r0 = r8.f41687d
            com.google.android.gms.internal.ads.axm r5 = r13.f41464d
            com.google.android.gms.internal.ads.azj r6 = r8.f41684a
            java.lang.Object r0 = r0.mo29789a(r5, r6, r2)
            com.google.android.gms.internal.ads.axz$d r0 = (com.google.android.gms.internal.ads.axz.C15674d) r0
            goto L_0x005e
        L_0x0096:
            r6 = 12
            if (r5 == r6) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.awk.m34268a(r5, r10, r4, r12, r13)
            goto L_0x005e
        L_0x009f:
            if (r11 == 0) goto L_0x00a7
            int r2 = r2 << 3
            r2 = r2 | r3
            r1.mo29972a(r2, r11)
        L_0x00a7:
            r11 = r4
            goto L_0x0025
        L_0x00aa:
            if (r11 != r12) goto L_0x00ad
            return
        L_0x00ad:
            com.google.android.gms.internal.ads.ayi r9 = com.google.android.gms.internal.ads.ayi.m34784g()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azq.mo29897a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.awl):void");
    }

    /* renamed from: a */
    public final void mo29895a(T t, baa baa, axm axm) throws IOException {
        boolean z;
        bau<?, ?> bau = this.f41685b;
        axn<?> axn = this.f41687d;
        Object c = bau.mo29967c(t);
        axq b = axn.mo29795b(t);
        do {
            try {
                if (baa.mo29659a() == Integer.MAX_VALUE) {
                    bau.mo29966b((Object) t, c);
                    return;
                }
                int b2 = baa.mo29664b();
                if (b2 == 11) {
                    Object obj = null;
                    awo awo = null;
                    int i = 0;
                    while (baa.mo29659a() != Integer.MAX_VALUE) {
                        int b3 = baa.mo29664b();
                        if (b3 == 16) {
                            i = baa.mo29692o();
                            obj = axn.mo29789a(axm, this.f41684a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                axn.mo29792a(baa, obj, axm, b);
                            } else {
                                awo = baa.mo29690n();
                            }
                        } else if (!baa.mo29669c()) {
                            break;
                        }
                    }
                    if (baa.mo29664b() != 12) {
                        throw ayi.m34782e();
                    } else if (awo != null) {
                        if (obj != null) {
                            axn.mo29791a(awo, obj, axm, b);
                        } else {
                            bau.mo29958a(c, i, awo);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = axn.mo29789a(axm, this.f41684a, b2 >>> 3);
                    if (a != null) {
                        axn.mo29792a(baa, a, axm, b);
                    } else {
                        z = bau.mo29962a(c, baa);
                        continue;
                    }
                } else {
                    z = baa.mo29669c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                bau.mo29966b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo29901c(T t) {
        this.f41685b.mo29969d(t);
        this.f41687d.mo29796c(t);
    }

    /* renamed from: d */
    public final boolean mo29902d(T t) {
        return this.f41687d.mo29788a((Object) t).mo29802d();
    }

    /* renamed from: b */
    public final int mo29899b(T t) {
        bau<?, ?> bau = this.f41685b;
        int e = bau.mo29970e(bau.mo29963b(t)) + 0;
        if (!this.f41686c) {
            return e;
        }
        axq a = this.f41687d.mo29788a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a.f41529a.mo29914b(); i2++) {
            i += axq.m34675a(a.f41529a.mo29915b(i2));
        }
        for (Entry a2 : a.f41529a.mo29916c()) {
            i += axq.m34675a(a2);
        }
        return e + i;
    }
}
