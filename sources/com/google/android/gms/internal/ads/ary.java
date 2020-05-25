package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class ary extends axz<ary, C15630a> implements azl {
    private static volatile azv<ary> zzdu;
    static final ary zzfjm = new ary();
    public int zzfir;

    /* renamed from: com.google.android.gms.internal.ads.ary$a */
    public static final class C15630a extends C15671a<ary, C15630a> implements azl {
        /* synthetic */ C15630a(arz arz) {
            this();
        }

        private C15630a() {
            super(ary.zzfjm);
        }
    }

    private ary() {
    }

    /* renamed from: a */
    public static ary m34039a(awo awo) throws ayi {
        return (ary) axz.m34706a(zzfjm, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (arz.f41272a[i - 1]) {
            case 1:
                return new ary();
            case 2:
                return new C15630a(null);
            case 3:
                Object[] objArr = {"zzfir"};
                return m34713a((azj) zzfjm, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", objArr);
            case 4:
                return zzfjm;
            case 5:
                azv<ary> azv = zzdu;
                if (azv == null) {
                    synchronized (ary.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjm);
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
        axz.m34715a(ary.class, zzfjm);
    }
}
