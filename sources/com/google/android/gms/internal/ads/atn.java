package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class atn extends axz<atn, C15648a> implements azl {
    private static volatile azv<atn> zzdu;
    static final atn zzfmw = new atn();
    private int zzdi;
    public int zzfmu;
    public ayh<C15649b> zzfmv = m34718k();

    /* renamed from: com.google.android.gms.internal.ads.atn$a */
    public static final class C15648a extends C15671a<atn, C15648a> implements azl {
        /* synthetic */ C15648a(ato ato) {
            this();
        }

        private C15648a() {
            super(atn.zzfmw);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.atn$b */
    public static final class C15649b extends axz<C15649b, C15650a> implements azl {
        private static volatile azv<C15649b> zzdu;
        static final C15649b zzfna = new C15649b();
        private int zzfmn;
        ate zzfmx;
        private int zzfmy;
        public int zzfmz;

        /* renamed from: com.google.android.gms.internal.ads.atn$b$a */
        public static final class C15650a extends C15671a<C15649b, C15650a> implements azl {
            /* synthetic */ C15650a(ato ato) {
                this();
            }

            private C15650a() {
                super(C15649b.zzfna);
            }
        }

        private C15649b() {
        }

        /* renamed from: a */
        public final ate mo29533a() {
            return this.zzfmx == null ? ate.m34109c() : this.zzfmx;
        }

        /* renamed from: b */
        public final ath mo29534b() {
            ath zzek = ath.zzek(this.zzfmy);
            return zzek == null ? ath.UNRECOGNIZED : zzek;
        }

        /* renamed from: c */
        public final atz mo29535c() {
            atz zzev = atz.zzev(this.zzfmn);
            return zzev == null ? atz.UNRECOGNIZED : zzev;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (ato.f41343a[i - 1]) {
                case 1:
                    return new C15649b();
                case 2:
                    return new C15650a(null);
                case 3:
                    Object[] objArr = {"zzfmx", "zzfmy", "zzfmz", "zzfmn"};
                    return m34713a((azj) zzfna, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", objArr);
                case 4:
                    return zzfna;
                case 5:
                    azv<C15649b> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15649b.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzfna);
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
            axz.m34715a(C15649b.class, zzfna);
        }
    }

    private atn() {
    }

    /* renamed from: a */
    public static atn m34124a(byte[] bArr) throws ayi {
        return (atn) axz.m34709a(zzfmw, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (ato.f41343a[i - 1]) {
            case 1:
                return new atn();
            case 2:
                return new C15648a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfmu", "zzfmv", C15649b.class};
                return m34713a((azj) zzfmw, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objArr);
            case 4:
                return zzfmw;
            case 5:
                azv<atn> azv = zzdu;
                if (azv == null) {
                    synchronized (atn.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfmw);
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
        axz.m34715a(atn.class, zzfmw);
    }
}
