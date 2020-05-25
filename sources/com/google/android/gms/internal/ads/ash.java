package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class ash extends axz<ash, C15634a> implements azl {
    private static volatile azv<ash> zzdu;
    static final ash zzfkp = new ash();
    private asj zzfko;

    /* renamed from: com.google.android.gms.internal.ads.ash$a */
    public static final class C15634a extends C15671a<ash, C15634a> implements azl {
        /* synthetic */ C15634a(asi asi) {
            this();
        }

        private C15634a() {
            super(ash.zzfkp);
        }
    }

    private ash() {
    }

    /* renamed from: a */
    public final asj mo29493a() {
        return this.zzfko == null ? asj.m34053d() : this.zzfko;
    }

    /* renamed from: a */
    public static ash m34050a(awo awo) throws ayi {
        return (ash) axz.m34706a(zzfkp, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asi.f41301a[i - 1]) {
            case 1:
                return new ash();
            case 2:
                return new C15634a(null);
            case 3:
                Object[] objArr = {"zzfko"};
                return m34713a((azj) zzfkp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", objArr);
            case 4:
                return zzfkp;
            case 5:
                azv<ash> azv = zzdu;
                if (azv == null) {
                    synchronized (ash.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkp);
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
        axz.m34715a(ash.class, zzfkp);
    }
}
