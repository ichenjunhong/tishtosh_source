package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class atv extends axz<atv, C15656a> implements azl {
    private static volatile azv<atv> zzdu;
    static final atv zzfnj = new atv();
    public int zzfih;
    atx zzfni;

    /* renamed from: com.google.android.gms.internal.ads.atv$a */
    public static final class C15656a extends C15671a<atv, C15656a> implements azl {
        /* renamed from: a */
        public final C15656a mo29545a(int i) {
            mo29830c();
            ((atv) this.f41605a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15656a mo29546a(atx atx) {
            mo29830c();
            atv atv = (atv) this.f41605a;
            if (atx != null) {
                atv.zzfni = atx;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15656a(atw atw) {
            this();
        }

        private C15656a() {
            super(atv.zzfnj);
        }
    }

    private atv() {
    }

    /* renamed from: a */
    public final atx mo29544a() {
        return this.zzfni == null ? atx.m34153a() : this.zzfni;
    }

    /* renamed from: a */
    public static atv m34147a(awo awo) throws ayi {
        return (atv) axz.m34706a(zzfnj, awo);
    }

    /* renamed from: b */
    public static C15656a m34148b() {
        return (C15656a) ((C15671a) zzfnj.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (atw.f41347a[i - 1]) {
            case 1:
                return new atv();
            case 2:
                return new C15656a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfni"};
                return m34713a((azj) zzfnj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", objArr);
            case 4:
                return zzfnj;
            case 5:
                azv<atv> azv = zzdu;
                if (azv == null) {
                    synchronized (atv.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfnj);
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
        axz.m34715a(atv.class, zzfnj);
    }
}
