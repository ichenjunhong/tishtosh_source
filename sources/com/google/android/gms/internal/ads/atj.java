package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class atj extends axz<atj, C15646a> implements azl {
    private static volatile azv<atj> zzdu;
    static final atj zzfmo = new atj();
    public String zzflw = "";
    public awo zzflx = awo.zzfuo;
    private int zzfmn;

    /* renamed from: com.google.android.gms.internal.ads.atj$a */
    public static final class C15646a extends C15671a<atj, C15646a> implements azl {
        /* synthetic */ C15646a(atk atk) {
            this();
        }

        private C15646a() {
            super(atj.zzfmo);
        }
    }

    private atj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atk.f41341a[i - 1]) {
            case 1:
                return new atj();
            case 2:
                return new C15646a(null);
            case 3:
                Object[] objArr = {"zzflw", "zzflx", "zzfmn"};
                return m34713a((azj) zzfmo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", objArr);
            case 4:
                return zzfmo;
            case 5:
                azv<atj> azv = zzdu;
                if (azv == null) {
                    synchronized (atj.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfmo);
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

    /* renamed from: a */
    public static atj m34115a() {
        return zzfmo;
    }

    static {
        axz.m34715a(atj.class, zzfmo);
    }
}
