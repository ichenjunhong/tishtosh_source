package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class atp extends axz<atp, C15651a> implements azl {
    private static volatile azv<atp> zzdu;
    static final atp zzfnc = new atp();
    private int zzdi;
    public int zzfmu;
    ayh<C15652b> zzfnb = m34718k();

    /* renamed from: com.google.android.gms.internal.ads.atp$a */
    public static final class C15651a extends C15671a<atp, C15651a> implements azl {
        /* renamed from: a */
        public final C15651a mo29536a(int i) {
            mo29830c();
            ((atp) this.f41605a).zzfmu = i;
            return this;
        }

        /* renamed from: a */
        public final C15651a mo29537a(C15652b bVar) {
            mo29830c();
            atp atp = (atp) this.f41605a;
            if (bVar != null) {
                if (!atp.zzfnb.mo29588a()) {
                    ayh<C15652b> ayh = atp.zzfnb;
                    int size = ayh.size();
                    atp.zzfnb = ayh.mo29603a(size == 0 ? 10 : size << 1);
                }
                atp.zzfnb.add(bVar);
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15651a(atq atq) {
            this();
        }

        private C15651a() {
            super(atp.zzfnc);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.atp$b */
    public static final class C15652b extends axz<C15652b, C15653a> implements azl {
        private static volatile azv<C15652b> zzdu;
        static final C15652b zzfnd = new C15652b();
        String zzflw = "";
        int zzfmn;
        int zzfmy;
        public int zzfmz;

        /* renamed from: com.google.android.gms.internal.ads.atp$b$a */
        public static final class C15653a extends C15671a<C15652b, C15653a> implements azl {
            /* renamed from: a */
            public final C15653a mo29541a(String str) {
                mo29830c();
                C15652b bVar = (C15652b) this.f41605a;
                if (str != null) {
                    bVar.zzflw = str;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: a */
            public final C15653a mo29539a(ath ath) {
                mo29830c();
                C15652b bVar = (C15652b) this.f41605a;
                if (ath != null) {
                    bVar.zzfmy = ath.zzac();
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: a */
            public final C15653a mo29538a(int i) {
                mo29830c();
                ((C15652b) this.f41605a).zzfmz = i;
                return this;
            }

            /* renamed from: a */
            public final C15653a mo29540a(atz atz) {
                mo29830c();
                C15652b bVar = (C15652b) this.f41605a;
                if (atz != null) {
                    bVar.zzfmn = atz.zzac();
                    return this;
                }
                throw new NullPointerException();
            }

            /* synthetic */ C15653a(atq atq) {
                this();
            }

            private C15653a() {
                super(C15652b.zzfnd);
            }
        }

        private C15652b() {
        }

        /* renamed from: a */
        public static C15653a m34134a() {
            return (C15653a) ((C15671a) zzfnd.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (atq.f41344a[i - 1]) {
                case 1:
                    return new C15652b();
                case 2:
                    return new C15653a(null);
                case 3:
                    Object[] objArr = {"zzflw", "zzfmy", "zzfmz", "zzfmn"};
                    return m34713a((azj) zzfnd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", objArr);
                case 4:
                    return zzfnd;
                case 5:
                    azv<C15652b> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15652b.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzfnd);
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
            axz.m34715a(C15652b.class, zzfnd);
        }
    }

    private atp() {
    }

    /* renamed from: a */
    public static C15651a m34130a() {
        return (C15651a) ((C15671a) zzfnc.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atq.f41344a[i - 1]) {
            case 1:
                return new atp();
            case 2:
                return new C15651a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfmu", "zzfnb", C15652b.class};
                return m34713a((azj) zzfnc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objArr);
            case 4:
                return zzfnc;
            case 5:
                azv<atp> azv = zzdu;
                if (azv == null) {
                    synchronized (atp.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnc);
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
        axz.m34715a(atp.class, zzfnc);
    }
}
