package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class asn extends axz<asn, C15637a> implements azl {
    private static volatile azv<asn> zzdu;
    static final asn zzfkw = new asn();
    public int zzfih;
    public awo zzfke = awo.zzfuo;
    public awo zzfkf = awo.zzfuo;
    asj zzfko;

    /* renamed from: com.google.android.gms.internal.ads.asn$a */
    public static final class C15637a extends C15671a<asn, C15637a> implements azl {
        /* renamed from: a */
        public final C15637a mo29502a(int i) {
            mo29830c();
            ((asn) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15637a mo29503a(asj asj) {
            mo29830c();
            asn asn = (asn) this.f41605a;
            if (asj != null) {
                asn.zzfko = asj;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15637a mo29504a(awo awo) {
            mo29830c();
            asn asn = (asn) this.f41605a;
            if (awo != null) {
                asn.zzfke = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: b */
        public final C15637a mo29505b(awo awo) {
            mo29830c();
            asn asn = (asn) this.f41605a;
            if (awo != null) {
                asn.zzfkf = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15637a(aso aso) {
            this();
        }

        private C15637a() {
            super(asn.zzfkw);
        }
    }

    private asn() {
    }

    /* renamed from: a */
    public final asj mo29501a() {
        return this.zzfko == null ? asj.m34053d() : this.zzfko;
    }

    /* renamed from: a */
    public static asn m34065a(awo awo) throws ayi {
        return (asn) axz.m34706a(zzfkw, awo);
    }

    /* renamed from: b */
    public static C15637a m34066b() {
        return (C15637a) ((C15671a) zzfkw.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aso.f41304a[i - 1]) {
            case 1:
                return new asn();
            case 2:
                return new C15637a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfko", "zzfke", "zzfkf"};
                return m34713a((azj) zzfkw, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", objArr);
            case 4:
                return zzfkw;
            case 5:
                azv<asn> azv = zzdu;
                if (azv == null) {
                    synchronized (asn.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkw);
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

    /* renamed from: c */
    public static asn m34067c() {
        return zzfkw;
    }

    static {
        axz.m34715a(asn.class, zzfkw);
    }
}
