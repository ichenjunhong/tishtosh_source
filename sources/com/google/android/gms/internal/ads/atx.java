package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class atx extends axz<atx, C15657a> implements azl {
    private static volatile azv<atx> zzdu;
    static final atx zzfnm = new atx();
    public String zzfnk = "";
    atj zzfnl;

    /* renamed from: com.google.android.gms.internal.ads.atx$a */
    public static final class C15657a extends C15671a<atx, C15657a> implements azl {
        /* synthetic */ C15657a(aty aty) {
            this();
        }

        private C15657a() {
            super(atx.zzfnm);
        }
    }

    private atx() {
    }

    /* renamed from: a */
    public static atx m34154a(awo awo) throws ayi {
        return (atx) axz.m34706a(zzfnm, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aty.f41348a[i - 1]) {
            case 1:
                return new atx();
            case 2:
                return new C15657a(null);
            case 3:
                Object[] objArr = {"zzfnk", "zzfnl"};
                return m34713a((azj) zzfnm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", objArr);
            case 4:
                return zzfnm;
            case 5:
                azv<atx> azv = zzdu;
                if (azv == null) {
                    synchronized (atx.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnm);
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
    public static atx m34153a() {
        return zzfnm;
    }

    static {
        axz.m34715a(atx.class, zzfnm);
    }
}
