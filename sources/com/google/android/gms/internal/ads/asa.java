package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class asa extends axz<asa, C15632a> implements azl {
    private static volatile azv<asa> zzdu;
    static final asa zzfjp = new asa();
    public int zzfih;
    public awo zzfip = awo.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.asa$a */
    public static final class C15632a extends C15671a<asa, C15632a> implements azl {
        /* renamed from: a */
        public final C15632a mo29490a(int i) {
            mo29830c();
            ((asa) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15632a mo29491a(awo awo) {
            mo29830c();
            asa asa = (asa) this.f41605a;
            if (awo != null) {
                asa.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15632a(asb asb) {
            this();
        }

        private C15632a() {
            super(asa.zzfjp);
        }
    }

    private asa() {
    }

    /* renamed from: a */
    public static asa m34043a(awo awo) throws ayi {
        return (asa) axz.m34706a(zzfjp, awo);
    }

    /* renamed from: a */
    public static C15632a m34042a() {
        return (C15632a) ((C15671a) zzfjp.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asb.f41290a[i - 1]) {
            case 1:
                return new asa();
            case 2:
                return new C15632a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m34713a((azj) zzfjp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", objArr);
            case 4:
                return zzfjp;
            case 5:
                azv<asa> azv = zzdu;
                if (azv == null) {
                    synchronized (asa.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjp);
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
        axz.m34715a(asa.class, zzfjp);
    }
}
