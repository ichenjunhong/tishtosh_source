package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class afh {

    /* renamed from: com.google.android.gms.internal.ads.afh$a */
    public static final class C15571a extends axz<C15571a, C15572a> implements azl {
        static final C15571a zzdt = new C15571a();
        private static volatile azv<C15571a> zzdu;
        int zzdi;
        String zzdj = "";
        long zzdk;
        String zzdl = "";
        String zzdm = "";
        private String zzdn = "";
        private long zzdo;
        private long zzdp;
        private String zzdq = "";
        private long zzdr;
        private String zzds = "";

        /* renamed from: com.google.android.gms.internal.ads.afh$a$a */
        public static final class C15572a extends C15671a<C15571a, C15572a> implements azl {
            /* renamed from: a */
            public final C15572a mo28775a(String str) {
                mo29830c();
                C15571a aVar = (C15571a) this.f41605a;
                if (str != null) {
                    aVar.zzdi |= 1;
                    aVar.zzdj = str;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: a */
            public final C15572a mo28774a(long j) {
                mo29830c();
                C15571a aVar = (C15571a) this.f41605a;
                aVar.zzdi |= 2;
                aVar.zzdk = j;
                return this;
            }

            /* renamed from: b */
            public final C15572a mo28776b(String str) {
                mo29830c();
                C15571a aVar = (C15571a) this.f41605a;
                if (str != null) {
                    aVar.zzdi |= 4;
                    aVar.zzdl = str;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: c */
            public final C15572a mo28777c(String str) {
                mo29830c();
                C15571a aVar = (C15571a) this.f41605a;
                if (str != null) {
                    aVar.zzdi |= 8;
                    aVar.zzdm = str;
                    return this;
                }
                throw new NullPointerException();
            }

            /* synthetic */ C15572a(agi agi) {
                this();
            }

            private C15572a() {
                super(C15571a.zzdt);
            }
        }

        private C15571a() {
        }

        /* renamed from: a */
        public static C15572a m32805a() {
            return (C15572a) ((C15671a) zzdt.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (agi.f40435a[i - 1]) {
                case 1:
                    return new C15571a();
                case 2:
                    return new C15572a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds"};
                    return m34713a((azj) zzdt, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", objArr);
                case 4:
                    return zzdt;
                case 5:
                    azv<C15571a> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15571a.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzdt);
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
            axz.m34715a(C15571a.class, zzdt);
        }
    }
}
