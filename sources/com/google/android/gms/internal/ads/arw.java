package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class arw extends axz<arw, C15629a> implements azl {
    private static volatile azv<arw> zzdu;
    static final arw zzfjl = new arw();
    public int zzfih;
    public awo zzfip = awo.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.arw$a */
    public static final class C15629a extends C15671a<arw, C15629a> implements azl {
        /* renamed from: a */
        public final C15629a mo29487a(int i) {
            mo29830c();
            ((arw) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15629a mo29488a(awo awo) {
            mo29830c();
            arw arw = (arw) this.f41605a;
            if (awo != null) {
                arw.zzfip = awo;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15629a(arx arx) {
            this();
        }

        private C15629a() {
            super(arw.zzfjl);
        }
    }

    private arw() {
    }

    /* renamed from: a */
    public static arw m34035a(awo awo) throws ayi {
        return (arw) axz.m34706a(zzfjl, awo);
    }

    /* renamed from: a */
    public static C15629a m34034a() {
        return (C15629a) ((C15671a) zzfjl.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (arx.f41271a[i - 1]) {
            case 1:
                return new arw();
            case 2:
                return new C15629a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m34713a((azj) zzfjl, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", objArr);
            case 4:
                return zzfjl;
            case 5:
                azv<arw> azv = zzdu;
                if (azv == null) {
                    synchronized (arw.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfjl);
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
        axz.m34715a(arw.class, zzfjl);
    }
}
