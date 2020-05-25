package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class atr extends axz<atr, C15654a> implements azl {
    private static volatile azv<atr> zzdu;
    static final atr zzfnf = new atr();
    public int zzfih;
    att zzfne;

    /* renamed from: com.google.android.gms.internal.ads.atr$a */
    public static final class C15654a extends C15671a<atr, C15654a> implements azl {
        /* renamed from: a */
        public final C15654a mo29542a(int i) {
            mo29830c();
            ((atr) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15654a mo29543a(att att) {
            mo29830c();
            atr atr = (atr) this.f41605a;
            if (att != null) {
                atr.zzfne = att;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15654a(ats ats) {
            this();
        }

        private C15654a() {
            super(atr.zzfnf);
        }
    }

    private atr() {
    }

    /* renamed from: a */
    public static atr m34141a(awo awo) throws ayi {
        return (atr) axz.m34706a(zzfnf, awo);
    }

    /* renamed from: a */
    public static C15654a m34140a() {
        return (C15654a) ((C15671a) zzfnf.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ats.f41345a[i - 1]) {
            case 1:
                return new atr();
            case 2:
                return new C15654a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfne"};
                return m34713a((azj) zzfnf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", objArr);
            case 4:
                return zzfnf;
            case 5:
                azv<atr> azv = zzdu;
                if (azv == null) {
                    synchronized (atr.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnf);
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
        axz.m34715a(atr.class, zzfnf);
    }
}
