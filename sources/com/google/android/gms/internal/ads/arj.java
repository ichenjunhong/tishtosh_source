package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class arj extends axz<arj, C15623a> implements azl {
    private static volatile azv<arj> zzdu;
    static final arj zzfiz = new arj();
    public int zzfih;
    public awo zzfip = awo.zzfuo;
    arn zzfiy;

    /* renamed from: com.google.android.gms.internal.ads.arj$a */
    public static final class C15623a extends C15671a<arj, C15623a> implements azl {
        /* renamed from: a */
        public final C15623a mo29478a(int i) {
            mo29830c();
            ((arj) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15623a mo29479a(arn arn) {
            mo29830c();
            arj arj = (arj) this.f41605a;
            if (arn != null) {
                arj.zzfiy = arn;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15623a mo29480a(awo awo) {
            mo29830c();
            arj arj = (arj) this.f41605a;
            if (awo != null) {
                arj.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15623a(ark ark) {
            this();
        }

        private C15623a() {
            super(arj.zzfiz);
        }
    }

    private arj() {
    }

    /* renamed from: a */
    public final arn mo29477a() {
        return this.zzfiy == null ? arn.m34020a() : this.zzfiy;
    }

    /* renamed from: a */
    public static arj m34008a(awo awo) throws ayi {
        return (arj) axz.m34706a(zzfiz, awo);
    }

    /* renamed from: b */
    public static C15623a m34009b() {
        return (C15623a) ((C15671a) zzfiz.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ark.f41265a[i - 1]) {
            case 1:
                return new arj();
            case 2:
                return new C15623a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfiy", "zzfip"};
                return m34713a((azj) zzfiz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfiz;
            case 5:
                azv<arj> azv = zzdu;
                if (azv == null) {
                    synchronized (arj.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfiz);
                            zzdu = azv;
                        }
                    }
                }
                return azv;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public static arj m34010c() {
        return zzfiz;
    }

    static {
        axz.m34715a(arj.class, zzfiz);
    }
}
