package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class asx extends axz<asx, C15640a> implements azl {
    private static volatile azv<asx> zzdu;
    static final asx zzflr = new asx();
    public int zzfih;
    public awo zzfip = awo.zzfuo;
    atc zzflq;

    /* renamed from: com.google.android.gms.internal.ads.asx$a */
    public static final class C15640a extends C15671a<asx, C15640a> implements azl {
        /* renamed from: a */
        public final C15640a mo29509a(int i) {
            mo29830c();
            ((asx) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15640a mo29510a(atc atc) {
            mo29830c();
            asx asx = (asx) this.f41605a;
            if (atc != null) {
                asx.zzflq = atc;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15640a mo29511a(awo awo) {
            mo29830c();
            asx asx = (asx) this.f41605a;
            if (awo != null) {
                asx.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15640a(asy asy) {
            this();
        }

        private C15640a() {
            super(asx.zzflr);
        }
    }

    private asx() {
    }

    /* renamed from: a */
    public final atc mo29508a() {
        return this.zzflq == null ? atc.m34105b() : this.zzflq;
    }

    /* renamed from: a */
    public static asx m34080a(awo awo) throws ayi {
        return (asx) axz.m34706a(zzflr, awo);
    }

    /* renamed from: b */
    public static C15640a m34081b() {
        return (C15640a) ((C15671a) zzflr.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asy.f41314a[i - 1]) {
            case 1:
                return new asx();
            case 2:
                return new C15640a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzflq", "zzfip"};
                return m34713a((azj) zzflr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzflr;
            case 5:
                azv<asx> azv = zzdu;
                if (azv == null) {
                    synchronized (asx.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzflr);
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
    public static asx m34082c() {
        return zzflr;
    }

    static {
        axz.m34715a(asx.class, zzflr);
    }
}
