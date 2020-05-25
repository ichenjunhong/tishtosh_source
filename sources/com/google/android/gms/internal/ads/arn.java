package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class arn extends axz<arn, C15625a> implements azl {
    private static volatile azv<arn> zzdu;
    static final arn zzfjc = new arn();
    public int zzfjb;

    /* renamed from: com.google.android.gms.internal.ads.arn$a */
    public static final class C15625a extends C15671a<arn, C15625a> implements azl {
        /* synthetic */ C15625a(aro aro) {
            this();
        }

        private C15625a() {
            super(arn.zzfjc);
        }
    }

    private arn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aro.f41267a[i - 1]) {
            case 1:
                return new arn();
            case 2:
                return new C15625a(null);
            case 3:
                Object[] objArr = {"zzfjb"};
                return m34713a((azj) zzfjc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", objArr);
            case 4:
                return zzfjc;
            case 5:
                azv<arn> azv = zzdu;
                if (azv == null) {
                    synchronized (arn.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjc);
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
    public static arn m34020a() {
        return zzfjc;
    }

    static {
        axz.m34715a(arn.class, zzfjc);
    }
}
