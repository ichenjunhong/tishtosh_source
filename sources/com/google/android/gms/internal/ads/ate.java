package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class ate extends axz<ate, C15644a> implements azl {
    private static volatile azv<ate> zzdu;
    static final ate zzflz = new ate();
    public String zzflw = "";
    public awo zzflx = awo.zzfuo;
    int zzfly;

    /* renamed from: com.google.android.gms.internal.ads.ate$a */
    public static final class C15644a extends C15671a<ate, C15644a> implements azl {
        /* renamed from: a */
        public final C15644a mo29527a(String str) {
            mo29830c();
            ate ate = (ate) this.f41605a;
            if (str != null) {
                ate.zzflw = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15644a mo29526a(awo awo) {
            mo29830c();
            ate ate = (ate) this.f41605a;
            if (awo != null) {
                ate.zzflx = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15644a mo29525a(C15645b bVar) {
            mo29830c();
            ate ate = (ate) this.f41605a;
            if (bVar != null) {
                ate.zzfly = bVar.zzac();
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15644a(atf atf) {
            this();
        }

        private C15644a() {
            super(ate.zzflz);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ate$b */
    public enum C15645b implements ayc {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        private static final ayd<C15645b> f41334a = null;

        /* renamed from: b */
        private final int f41336b;

        public final int zzac() {
            if (this != UNRECOGNIZED) {
                return this.f41336b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static C15645b zzej(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        private C15645b(int i) {
            this.f41336b = i;
        }

        static {
            f41334a = new atg();
        }
    }

    private ate() {
    }

    /* renamed from: a */
    public final C15645b mo29524a() {
        C15645b zzej = C15645b.zzej(this.zzfly);
        return zzej == null ? C15645b.UNRECOGNIZED : zzej;
    }

    /* renamed from: b */
    public static C15644a m34108b() {
        return (C15644a) ((C15671a) zzflz.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atf.f41337a[i - 1]) {
            case 1:
                return new ate();
            case 2:
                return new C15644a(null);
            case 3:
                Object[] objArr = {"zzflw", "zzflx", "zzfly"};
                return m34713a((azj) zzflz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", objArr);
            case 4:
                return zzflz;
            case 5:
                azv<ate> azv = zzdu;
                if (azv == null) {
                    synchronized (ate.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzflz);
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
    public static ate m34109c() {
        return zzflz;
    }

    static {
        axz.m34715a(ate.class, zzflz);
    }
}
