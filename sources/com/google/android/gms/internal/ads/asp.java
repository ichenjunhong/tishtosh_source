package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class asp extends axz<asp, C15638a> implements azl {
    private static volatile azv<asp> zzdu;
    static final asp zzfkz = new asp();
    private int zzfiv;
    private int zzfkx;
    public awo zzfky = awo.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.asp$a */
    public static final class C15638a extends C15671a<asp, C15638a> implements azl {
        /* synthetic */ C15638a(asq asq) {
            this();
        }

        private C15638a() {
            super(asp.zzfkz);
        }
    }

    private asp() {
    }

    /* renamed from: a */
    public final asr mo29506a() {
        asr zzeg = asr.zzeg(this.zzfkx);
        return zzeg == null ? asr.UNRECOGNIZED : zzeg;
    }

    /* renamed from: b */
    public final asv mo29507b() {
        asv zzeh = asv.zzeh(this.zzfiv);
        return zzeh == null ? asv.UNRECOGNIZED : zzeh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asq.f41305a[i - 1]) {
            case 1:
                return new asp();
            case 2:
                return new C15638a(null);
            case 3:
                Object[] objArr = {"zzfkx", "zzfiv", "zzfky"};
                return m34713a((azj) zzfkz, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", objArr);
            case 4:
                return zzfkz;
            case 5:
                azv<asp> azv = zzdu;
                if (azv == null) {
                    synchronized (asp.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkz);
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
    public static asp m34074c() {
        return zzfkz;
    }

    static {
        axz.m34715a(asp.class, zzfkz);
    }
}
