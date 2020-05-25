package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class asf extends axz<asf, C15633a> implements azl {
    private static volatile azv<asf> zzdu;
    static final asf zzfkn = new asf();
    private atj zzfkm;

    /* renamed from: com.google.android.gms.internal.ads.asf$a */
    public static final class C15633a extends C15671a<asf, C15633a> implements azl {
        /* synthetic */ C15633a(asg asg) {
            this();
        }

        private C15633a() {
            super(asf.zzfkn);
        }
    }

    private asf() {
    }

    /* renamed from: a */
    public final atj mo29492a() {
        return this.zzfkm == null ? atj.m34115a() : this.zzfkm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asg.f41300a[i - 1]) {
            case 1:
                return new asf();
            case 2:
                return new C15633a(null);
            case 3:
                Object[] objArr = {"zzfkm"};
                return m34713a((azj) zzfkn, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", objArr);
            case 4:
                return zzfkn;
            case 5:
                azv<asf> azv = zzdu;
                if (azv == null) {
                    synchronized (asf.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkn);
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
    public static asf m34047b() {
        return zzfkn;
    }

    static {
        axz.m34715a(asf.class, zzfkn);
    }
}
