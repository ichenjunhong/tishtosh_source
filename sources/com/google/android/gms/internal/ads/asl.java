package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class asl extends axz<asl, C15636a> implements azl {
    private static volatile azv<asl> zzdu;
    static final asl zzfkv = new asl();
    public int zzfih;
    public awo zzfip = awo.zzfuo;
    asn zzfku;

    /* renamed from: com.google.android.gms.internal.ads.asl$a */
    public static final class C15636a extends C15671a<asl, C15636a> implements azl {
        /* renamed from: a */
        public final C15636a mo29498a(int i) {
            mo29830c();
            ((asl) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15636a mo29499a(asn asn) {
            mo29830c();
            asl asl = (asl) this.f41605a;
            if (asn != null) {
                asl.zzfku = asn;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15636a mo29500a(awo awo) {
            mo29830c();
            asl asl = (asl) this.f41605a;
            if (awo != null) {
                asl.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15636a(asm asm) {
            this();
        }

        private C15636a() {
            super(asl.zzfkv);
        }
    }

    private asl() {
    }

    /* renamed from: a */
    public final asn mo29497a() {
        return this.zzfku == null ? asn.m34067c() : this.zzfku;
    }

    /* renamed from: a */
    public static asl m34058a(awo awo) throws ayi {
        return (asl) axz.m34706a(zzfkv, awo);
    }

    /* renamed from: b */
    public static C15636a m34059b() {
        return (C15636a) ((C15671a) zzfkv.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asm.f41303a[i - 1]) {
            case 1:
                return new asl();
            case 2:
                return new C15636a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfku", "zzfip"};
                return m34713a((azj) zzfkv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfkv;
            case 5:
                azv<asl> azv = zzdu;
                if (azv == null) {
                    synchronized (asl.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfkv);
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
        axz.m34715a(asl.class, zzfkv);
    }
}
