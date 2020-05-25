package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class att extends axz<att, C15655a> implements azl {
    private static volatile azv<att> zzdu;
    static final att zzfnh = new att();
    public String zzfng = "";

    /* renamed from: com.google.android.gms.internal.ads.att$a */
    public static final class C15655a extends C15671a<att, C15655a> implements azl {
        /* synthetic */ C15655a(atu atu) {
            this();
        }

        private C15655a() {
            super(att.zzfnh);
        }
    }

    private att() {
    }

    /* renamed from: a */
    public static att m34145a(awo awo) throws ayi {
        return (att) axz.m34706a(zzfnh, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atu.f41346a[i - 1]) {
            case 1:
                return new att();
            case 2:
                return new C15655a(null);
            case 3:
                Object[] objArr = {"zzfng"};
                return m34713a((azj) zzfnh, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", objArr);
            case 4:
                return zzfnh;
            case 5:
                azv<att> azv = zzdu;
                if (azv == null) {
                    synchronized (att.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnh);
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
        axz.m34715a(att.class, zzfnh);
    }
}
