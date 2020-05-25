package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class arp extends axz<arp, C15626a> implements azl {
    private static volatile azv<arp> zzdu;
    static final arp zzfje = new arp();
    public int zzfih;
    public awo zzfip = awo.zzfuo;
    art zzfjd;

    /* renamed from: com.google.android.gms.internal.ads.arp$a */
    public static final class C15626a extends C15671a<arp, C15626a> implements azl {
        /* renamed from: a */
        public final C15626a mo29483a(int i) {
            mo29830c();
            ((arp) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15626a mo29484a(art art) {
            mo29830c();
            arp arp = (arp) this.f41605a;
            if (art != null) {
                arp.zzfjd = art;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15626a mo29485a(awo awo) {
            mo29830c();
            arp arp = (arp) this.f41605a;
            if (awo != null) {
                arp.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15626a(arq arq) {
            this();
        }

        private C15626a() {
            super(arp.zzfje);
        }
    }

    private arp() {
    }

    /* renamed from: a */
    public final art mo29482a() {
        return this.zzfjd == null ? art.m34032a() : this.zzfjd;
    }

    /* renamed from: a */
    public static arp m34022a(awo awo) throws ayi {
        return (arp) axz.m34706a(zzfje, awo);
    }

    /* renamed from: b */
    public static C15626a m34023b() {
        return (C15626a) ((C15671a) zzfje.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (arq.f41268a[i - 1]) {
            case 1:
                return new arp();
            case 2:
                return new C15626a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfjd", "zzfip"};
                return m34713a((azj) zzfje, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfje;
            case 5:
                azv<arp> azv = zzdu;
                if (azv == null) {
                    synchronized (arp.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfje);
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
        axz.m34715a(arp.class, zzfje);
    }
}
