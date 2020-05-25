package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class atc extends axz<atc, C15643a> implements azl {
    private static volatile azv<atc> zzdu;
    static final atc zzflv = new atc();
    private int zzflt;
    public int zzflu;

    /* renamed from: com.google.android.gms.internal.ads.atc$a */
    public static final class C15643a extends C15671a<atc, C15643a> implements azl {
        /* synthetic */ C15643a(atd atd) {
            this();
        }

        private C15643a() {
            super(atc.zzflv);
        }
    }

    private atc() {
    }

    /* renamed from: a */
    public final asv mo29523a() {
        asv zzeh = asv.zzeh(this.zzflt);
        return zzeh == null ? asv.UNRECOGNIZED : zzeh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atd.f41333a[i - 1]) {
            case 1:
                return new atc();
            case 2:
                return new C15643a(null);
            case 3:
                Object[] objArr = {"zzflt", "zzflu"};
                return m34713a((azj) zzflv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", objArr);
            case 4:
                return zzflv;
            case 5:
                azv<atc> azv = zzdu;
                if (azv == null) {
                    synchronized (atc.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzflv);
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

    /* renamed from: b */
    public static atc m34105b() {
        return zzflv;
    }

    static {
        axz.m34715a(atc.class, zzflv);
    }
}
