package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class art extends axz<art, C15628a> implements azl {
    private static volatile azv<art> zzdu;
    static final art zzfjg = new art();
    public int zzfjb;

    /* renamed from: com.google.android.gms.internal.ads.art$a */
    public static final class C15628a extends C15671a<art, C15628a> implements azl {
        /* synthetic */ C15628a(aru aru) {
            this();
        }

        private C15628a() {
            super(art.zzfjg);
        }
    }

    private art() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aru.f41270a[i - 1]) {
            case 1:
                return new art();
            case 2:
                return new C15628a(null);
            case 3:
                Object[] objArr = {"zzfjb"};
                return m34713a((azj) zzfjg, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", objArr);
            case 4:
                return zzfjg;
            case 5:
                azv<art> azv = zzdu;
                if (azv == null) {
                    synchronized (art.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjg);
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
    public static art m34032a() {
        return zzfjg;
    }

    static {
        axz.m34715a(art.class, zzfjg);
    }
}
