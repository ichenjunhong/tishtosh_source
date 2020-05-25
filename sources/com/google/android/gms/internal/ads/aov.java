package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aoq.C15609b;
import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class aov extends axz<aov, C15610a> implements azl {
    private static volatile azv<aov> zzdu;
    static final aov zzfgn = new aov();
    int zzdi;
    String zzdj = "";
    int zzfgk;
    private String zzfgl = "";
    aoq zzfgm;

    /* renamed from: com.google.android.gms.internal.ads.aov$a */
    public static final class C15610a extends C15671a<aov, C15610a> implements azl {
        /* renamed from: a */
        public final C15610a mo29429a(C15611b bVar) {
            mo29830c();
            aov aov = (aov) this.f41605a;
            if (bVar != null) {
                aov.zzdi |= 1;
                aov.zzfgk = bVar.zzac();
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15610a mo29430a(String str) {
            mo29830c();
            aov aov = (aov) this.f41605a;
            if (str != null) {
                aov.zzdi |= 2;
                aov.zzdj = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15610a mo29428a(C15609b bVar) {
            mo29830c();
            aov aov = (aov) this.f41605a;
            aov.zzfgm = (aoq) ((axz) bVar.mo29832e());
            aov.zzdi |= 8;
            return this;
        }

        /* synthetic */ C15610a(aow aow) {
            this();
        }

        private C15610a() {
            super(aov.zzfgn);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aov$b */
    public enum C15611b implements ayc {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: b */
        private static final ayd<C15611b> f41187b = null;

        /* renamed from: c */
        private final int f41189c;

        public final int zzac() {
            return this.f41189c;
        }

        public static C15611b zzdp(int i) {
            switch (i) {
                case 0:
                    return EVENT_TYPE_UNKNOWN;
                case 1:
                    return BLOCKED_IMPRESSION;
                default:
                    return null;
            }
        }

        public static aye zzad() {
            return aoy.f41191a;
        }

        private C15611b(int i) {
            this.f41189c = i;
        }

        static {
            f41187b = new aox();
        }
    }

    private aov() {
    }

    /* renamed from: a */
    public static C15610a m33842a() {
        return (C15610a) ((C15671a) zzfgn.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aow.f41190a[i - 1]) {
            case 1:
                return new aov();
            case 2:
                return new C15610a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfgk", C15611b.zzad(), "zzdj", "zzfgl", "zzfgm"};
                return m34713a((azj) zzfgn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", objArr);
            case 4:
                return zzfgn;
            case 5:
                azv<aov> azv = zzdu;
                if (azv == null) {
                    synchronized (aov.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfgn);
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
        axz.m34715a(aov.class, zzfgn);
    }
}
