package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class auc extends axz<auc, C15659a> implements azl {
    private static volatile azv<auc> zzdu;
    static final auc zzfnw = new auc();
    private int zzdi;
    String zzfnu = "";
    public ayh<atl> zzfnv = m34718k();

    /* renamed from: com.google.android.gms.internal.ads.auc$a */
    public static final class C15659a extends C15671a<auc, C15659a> implements azl {
        /* renamed from: a */
        public final C15659a mo29548a(String str) {
            mo29830c();
            auc auc = (auc) this.f41605a;
            if (str != null) {
                auc.zzfnu = str;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15659a mo29547a(atl atl) {
            mo29830c();
            auc auc = (auc) this.f41605a;
            if (atl != null) {
                if (!auc.zzfnv.mo29588a()) {
                    ayh<atl> ayh = auc.zzfnv;
                    int size = ayh.size();
                    auc.zzfnv = ayh.mo29603a(size == 0 ? 10 : size << 1);
                }
                auc.zzfnv.add(atl);
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15659a(aud aud) {
            this();
        }

        private C15659a() {
            super(auc.zzfnw);
        }
    }

    private auc() {
    }

    /* renamed from: a */
    public static C15659a m34159a() {
        return (C15659a) ((C15671a) zzfnw.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (aud.f41354a[i - 1]) {
            case 1:
                return new auc();
            case 2:
                return new C15659a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfnu", "zzfnv", atl.class};
                return m34713a((azj) zzfnw, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", objArr);
            case 4:
                return zzfnw;
            case 5:
                azv<auc> azv = zzdu;
                if (azv == null) {
                    synchronized (auc.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnw);
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
        axz.m34715a(auc.class, zzfnw);
    }
}
