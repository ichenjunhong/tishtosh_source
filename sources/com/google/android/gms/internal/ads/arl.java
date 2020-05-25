package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class arl extends axz<arl, C15624a> implements azl {
    private static volatile azv<arl> zzdu;
    static final arl zzfja = new arl();
    public int zzfir;
    private arn zzfiy;

    /* renamed from: com.google.android.gms.internal.ads.arl$a */
    public static final class C15624a extends C15671a<arl, C15624a> implements azl {
        /* synthetic */ C15624a(arm arm) {
            this();
        }

        private C15624a() {
            super(arl.zzfja);
        }
    }

    private arl() {
    }

    /* renamed from: a */
    public final arn mo29481a() {
        return this.zzfiy == null ? arn.m34020a() : this.zzfiy;
    }

    /* renamed from: a */
    public static arl m34016a(awo awo) throws ayi {
        return (arl) axz.m34706a(zzfja, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (arm.f41266a[i - 1]) {
            case 1:
                return new arl();
            case 2:
                return new C15624a(null);
            case 3:
                Object[] objArr = {"zzfiy", "zzfir"};
                return m34713a((azj) zzfja, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfja;
            case 5:
                azv<arl> azv = zzdu;
                if (azv == null) {
                    synchronized (arl.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfja);
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
    public static arl m34017b() {
        return zzfja;
    }

    static {
        axz.m34715a(arl.class, zzfja);
    }
}
