package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class ata extends axz<ata, C15642a> implements azl {
    private static volatile azv<ata> zzdu;
    static final ata zzfls = new ata();
    public int zzfir;
    private atc zzflq;

    /* renamed from: com.google.android.gms.internal.ads.ata$a */
    public static final class C15642a extends C15671a<ata, C15642a> implements azl {
        /* synthetic */ C15642a(atb atb) {
            this();
        }

        private C15642a() {
            super(ata.zzfls);
        }
    }

    private ata() {
    }

    /* renamed from: a */
    public final atc mo29522a() {
        return this.zzflq == null ? atc.m34105b() : this.zzflq;
    }

    /* renamed from: a */
    public static ata m34101a(awo awo) throws ayi {
        return (ata) axz.m34706a(zzfls, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atb.f41332a[i - 1]) {
            case 1:
                return new ata();
            case 2:
                return new C15642a(null);
            case 3:
                Object[] objArr = {"zzflq", "zzfir"};
                return m34713a((azj) zzfls, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfls;
            case 5:
                azv<ata> azv = zzdu;
                if (azv == null) {
                    synchronized (ata.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfls);
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
    public static ata m34102b() {
        return zzfls;
    }

    static {
        axz.m34715a(ata.class, zzfls);
    }
}
