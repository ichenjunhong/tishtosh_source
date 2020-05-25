package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class aue extends axz<aue, C15660a> implements azl {
    private static volatile azv<aue> zzdu;
    static final aue zzfow = new aue();
    public int zzfih;
    public awo zzfip = awo.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.aue$a */
    public static final class C15660a extends C15671a<aue, C15660a> implements azl {
        /* renamed from: a */
        public final C15660a mo29549a(int i) {
            mo29830c();
            ((aue) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15660a mo29550a(awo awo) {
            mo29830c();
            aue aue = (aue) this.f41605a;
            if (awo != null) {
                aue.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15660a(auf auf) {
            this();
        }

        private C15660a() {
            super(aue.zzfow);
        }
    }

    private aue() {
    }

    /* renamed from: a */
    public static aue m34164a(awo awo) throws ayi {
        return (aue) axz.m34706a(zzfow, awo);
    }

    /* renamed from: a */
    public static C15660a m34163a() {
        return (C15660a) ((C15671a) zzfow.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (auf.f41355a[i - 1]) {
            case 1:
                return new aue();
            case 2:
                return new C15660a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m34713a((azj) zzfow, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", objArr);
            case 4:
                return zzfow;
            case 5:
                azv<aue> azv = zzdu;
                if (azv == null) {
                    synchronized (aue.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfow);
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

    static {
        axz.m34715a(aue.class, zzfow);
    }
}
