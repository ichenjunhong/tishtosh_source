package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class asj extends axz<asj, C15635a> implements azl {
    private static volatile azv<asj> zzdu;
    static final asj zzfkt = new asj();
    private asp zzfkq;
    private asf zzfkr;
    private int zzfks;

    /* renamed from: com.google.android.gms.internal.ads.asj$a */
    public static final class C15635a extends C15671a<asj, C15635a> implements azl {
        /* synthetic */ C15635a(ask ask) {
            this();
        }

        private C15635a() {
            super(asj.zzfkt);
        }
    }

    private asj() {
    }

    /* renamed from: a */
    public final asp mo29494a() {
        return this.zzfkq == null ? asp.m34074c() : this.zzfkq;
    }

    /* renamed from: b */
    public final asf mo29495b() {
        return this.zzfkr == null ? asf.m34047b() : this.zzfkr;
    }

    /* renamed from: c */
    public final asc mo29496c() {
        asc zzdy = asc.zzdy(this.zzfks);
        return zzdy == null ? asc.UNRECOGNIZED : zzdy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ask.f41302a[i - 1]) {
            case 1:
                return new asj();
            case 2:
                return new C15635a(null);
            case 3:
                Object[] objArr = {"zzfkq", "zzfkr", "zzfks"};
                return m34713a((azj) zzfkt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", objArr);
            case 4:
                return zzfkt;
            case 5:
                azv<asj> azv = zzdu;
                if (azv == null) {
                    synchronized (asj.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkt);
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

    /* renamed from: d */
    public static asj m34053d() {
        return zzfkt;
    }

    static {
        axz.m34715a(asj.class, zzfkt);
    }
}
