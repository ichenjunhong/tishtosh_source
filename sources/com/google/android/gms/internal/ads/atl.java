package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class atl extends axz<atl, C15647a> implements azl {
    private static volatile azv<atl> zzdu;
    static final atl zzfmt = new atl();
    public String zzflw = "";
    public String zzfmp = "";
    public int zzfmq;
    public boolean zzfmr;
    public String zzfms = "";

    /* renamed from: com.google.android.gms.internal.ads.atl$a */
    public static final class C15647a extends C15671a<atl, C15647a> implements azl {
        /* renamed from: a */
        public final C15647a mo29529a(String str) {
            mo29830c();
            atl atl = (atl) this.f41605a;
            if (str != null) {
                atl.zzfmp = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: b */
        public final C15647a mo29531b(String str) {
            mo29830c();
            atl atl = (atl) this.f41605a;
            if (str != null) {
                atl.zzflw = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15647a mo29528a(int i) {
            mo29830c();
            ((atl) this.f41605a).zzfmq = 0;
            return this;
        }

        /* renamed from: a */
        public final C15647a mo29530a(boolean z) {
            mo29830c();
            ((atl) this.f41605a).zzfmr = true;
            return this;
        }

        /* renamed from: c */
        public final C15647a mo29532c(String str) {
            mo29830c();
            atl atl = (atl) this.f41605a;
            if (str != null) {
                atl.zzfms = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15647a(atm atm) {
            this();
        }

        private C15647a() {
            super(atl.zzfmt);
        }
    }

    private atl() {
    }

    /* renamed from: a */
    public static C15647a m34117a() {
        return (C15647a) ((C15671a) zzfmt.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atm.f41342a[i - 1]) {
            case 1:
                return new atl();
            case 2:
                return new C15647a(null);
            case 3:
                Object[] objArr = {"zzfmp", "zzflw", "zzfmq", "zzfmr", "zzfms"};
                return m34713a((azj) zzfmt, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", objArr);
            case 4:
                return zzfmt;
            case 5:
                azv<atl> azv = zzdu;
                if (azv == null) {
                    synchronized (atl.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfmt);
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
        axz.m34715a(atl.class, zzfmt);
    }
}
