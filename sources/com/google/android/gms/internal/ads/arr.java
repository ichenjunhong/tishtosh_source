package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class arr extends axz<arr, C15627a> implements azl {
    private static volatile azv<arr> zzdu;
    static final arr zzfjf = new arr();
    public int zzfir;
    private art zzfjd;

    /* renamed from: com.google.android.gms.internal.ads.arr$a */
    public static final class C15627a extends C15671a<arr, C15627a> implements azl {
        /* synthetic */ C15627a(ars ars) {
            this();
        }

        private C15627a() {
            super(arr.zzfjf);
        }
    }

    private arr() {
    }

    /* renamed from: a */
    public final art mo29486a() {
        return this.zzfjd == null ? art.m34032a() : this.zzfjd;
    }

    /* renamed from: a */
    public static arr m34029a(awo awo) throws ayi {
        return (arr) axz.m34706a(zzfjf, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ars.f41269a[i - 1]) {
            case 1:
                return new arr();
            case 2:
                return new C15627a(null);
            case 3:
                Object[] objArr = {"zzfjd", "zzfir"};
                return m34713a((azj) zzfjf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfjf;
            case 5:
                azv<arr> azv = zzdu;
                if (azv == null) {
                    synchronized (arr.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjf);
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
        axz.m34715a(arr.class, zzfjf);
    }
}
