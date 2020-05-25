package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class arh extends axz<arh, C15622a> implements azl {
    private static volatile azv<arh> zzdu;
    static final arh zzfin = new arh();
    private arl zzfil;
    private ata zzfim;

    /* renamed from: com.google.android.gms.internal.ads.arh$a */
    public static final class C15622a extends C15671a<arh, C15622a> implements azl {
        /* synthetic */ C15622a(ari ari) {
            this();
        }

        private C15622a() {
            super(arh.zzfin);
        }
    }

    private arh() {
    }

    /* renamed from: a */
    public final arl mo29475a() {
        return this.zzfil == null ? arl.m34017b() : this.zzfil;
    }

    /* renamed from: b */
    public final ata mo29476b() {
        return this.zzfim == null ? ata.m34102b() : this.zzfim;
    }

    /* renamed from: a */
    public static arh m34004a(awo awo) throws ayi {
        return (arh) axz.m34706a(zzfin, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ari.f41264a[i - 1]) {
            case 1:
                return new arh();
            case 2:
                return new C15622a(null);
            case 3:
                Object[] objArr = {"zzfil", "zzfim"};
                return m34713a((azj) zzfin, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", objArr);
            case 4:
                return zzfin;
            case 5:
                azv<arh> azv = zzdu;
                if (azv == null) {
                    synchronized (arh.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfin);
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
        axz.m34715a(arh.class, zzfin);
    }
}
