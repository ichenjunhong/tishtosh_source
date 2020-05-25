package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.google.android.gms.internal.ads.axz.C15675e;

public final class arf extends axz<arf, C15621a> implements azl {
    private static volatile azv<arf> zzdu;
    static final arf zzfik = new arf();
    public int zzfih;
    arj zzfii;
    asx zzfij;

    /* renamed from: com.google.android.gms.internal.ads.arf$a */
    public static final class C15621a extends C15671a<arf, C15621a> implements azl {
        /* renamed from: a */
        public final C15621a mo29472a(int i) {
            mo29830c();
            ((arf) this.f41605a).zzfih = i;
            return this;
        }

        /* renamed from: a */
        public final C15621a mo29473a(arj arj) {
            mo29830c();
            arf arf = (arf) this.f41605a;
            if (arj != null) {
                arf.zzfii = arj;
                return this;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public final C15621a mo29474a(asx asx) {
            mo29830c();
            arf arf = (arf) this.f41605a;
            if (asx != null) {
                arf.zzfij = asx;
                return this;
            }
            throw new NullPointerException();
        }

        /* synthetic */ C15621a(arg arg) {
            this();
        }

        private C15621a() {
            super(arf.zzfik);
        }
    }

    private arf() {
    }

    /* renamed from: a */
    public final arj mo29470a() {
        return this.zzfii == null ? arj.m34010c() : this.zzfii;
    }

    /* renamed from: b */
    public final asx mo29471b() {
        return this.zzfij == null ? asx.m34082c() : this.zzfij;
    }

    /* renamed from: a */
    public static arf m33996a(awo awo) throws ayi {
        return (arf) axz.m34706a(zzfik, awo);
    }

    /* renamed from: c */
    public static C15621a m33997c() {
        return (C15621a) ((C15671a) zzfik.mo28773a(C15675e.f41613e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (arg.f41263a[i - 1]) {
            case 1:
                return new arf();
            case 2:
                return new C15621a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfii", "zzfij"};
                return m34713a((azj) zzfik, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", objArr);
            case 4:
                return zzfik;
            case 5:
                azv<arf> azv = zzdu;
                if (azv == null) {
                    synchronized (arf.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzfik);
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
        axz.m34715a(arf.class, zzfik);
    }
}
