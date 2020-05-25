package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class aoq extends axz<aoq, C15609b> implements azl {
    private static volatile azv<aoq> zzdu;
    private static final ayg<Integer, C15608a> zzfgc = new aor();
    static final aoq zzfgg = new aoq();
    int zzdi;
    ayf zzfgb = m34717j();
    String zzfgd = "";
    private String zzfge = "";
    private String zzfgf = "";

    /* renamed from: com.google.android.gms.internal.ads.aoq$a */
    public enum C15608a implements ayc {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: b */
        private static final ayd<C15608a> f41181b = null;

        /* renamed from: c */
        private final int f41183c;

        public final int zzac() {
            return this.f41183c;
        }

        public static C15608a zzdo(int i) {
            switch (i) {
                case 1:
                    return BLOCKED_REASON_UNKNOWN;
                case 2:
                    return BLOCKED_REASON_BACKGROUND;
                default:
                    return null;
            }
        }

        public static aye zzad() {
            return aou.f41185a;
        }

        private C15608a(int i) {
            this.f41183c = i;
        }

        static {
            f41181b = new aot();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aoq$b */
    public static final class C15609b extends C15671a<aoq, C15609b> implements azl {
        /* renamed from: a */
        public final C15609b mo29426a(C15608a aVar) {
            mo29830c();
            aoq aoq = (aoq) this.f41605a;
            if (aVar != null) {
                if (!aoq.zzfgb.mo29588a()) {
                    ayf ayf = aoq.zzfgb;
                    int size = ayf.size();
                    aoq.zzfgb = ayf.mo29833b(size == 0 ? 10 : size << 1);
                }
                aoq.zzfgb.mo29835d(aVar.zzac());
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15609b mo29427a(String str) {
            mo29830c();
            aoq aoq = (aoq) this.f41605a;
            if (str != null) {
                aoq.zzdi |= 1;
                aoq.zzfgd = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15609b(aor aor) {
            this();
        }

        private C15609b() {
            super(aoq.zzfgg);
        }
    }

    private aoq() {
    }

    /* renamed from: a */
    public static C15609b m33837a() {
        return (C15609b) ((C15671a) zzfgg.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aos.f41184a[i - 1]) {
            case 1:
                return new aoq();
            case 2:
                return new C15609b(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfgb", C15608a.zzad(), "zzfgd", "zzfge", "zzfgf"};
                return m34713a((azj) zzfgg, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", objArr);
            case 4:
                return zzfgg;
            case 5:
                azv<aoq> azv = zzdu;
                if (azv == null) {
                    synchronized (aoq.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfgg);
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
        axz.m34715a(aoq.class, zzfgg);
    }
}
