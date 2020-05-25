package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class ahj {

    /* renamed from: com.google.android.gms.internal.ads.ahj$a */
    public static final class C15575a extends axz<C15575a, C15576a> implements azl {
        private static volatile azv<C15575a> zzdu;
        static final C15575a zzdx = new C15575a();
        int zzdi;
        C15577b zzdv;
        private C15579c zzdw;

        /* renamed from: com.google.android.gms.internal.ads.ahj$a$a */
        public static final class C15576a extends C15671a<C15575a, C15576a> implements azl {
            /* synthetic */ C15576a(aik aik) {
                this();
            }

            private C15576a() {
                super(C15575a.zzdx);
            }
        }

        private C15575a() {
        }

        /* renamed from: a */
        public final boolean mo28886a() {
            return (this.zzdi & 2) == 2;
        }

        /* renamed from: b */
        public final C15579c mo28887b() {
            if (this.zzdw == null) {
                return C15579c.zzeo;
            }
            return this.zzdw;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (aik.f40600a[i - 1]) {
                case 1:
                    return new C15575a();
                case 2:
                    return new C15576a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdv", "zzdw"};
                    return m34713a((azj) zzdx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", objArr);
                case 4:
                    return zzdx;
                case 5:
                    azv<C15575a> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15575a.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzdx);
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
            axz.m34715a(C15575a.class, zzdx);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ahj$b */
    public static final class C15577b extends axz<C15577b, C15578a> implements azl {
        private static volatile azv<C15577b> zzdu;
        static final C15577b zzdz = new C15577b();
        private int zzdi;
        int zzdy = 2;

        /* renamed from: com.google.android.gms.internal.ads.ahj$b$a */
        public static final class C15578a extends C15671a<C15577b, C15578a> implements azl {
            /* synthetic */ C15578a(aik aik) {
                this();
            }

            private C15578a() {
                super(C15577b.zzdz);
            }
        }

        private C15577b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (aik.f40600a[i - 1]) {
                case 1:
                    return new C15577b();
                case 2:
                    return new C15578a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdy", ajl.zzad()};
                    return m34713a((azj) zzdz, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", objArr);
                case 4:
                    return zzdz;
                case 5:
                    azv<C15577b> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15577b.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzdz);
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
            axz.m34715a(C15577b.class, zzdz);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ahj$c */
    public static final class C15579c extends axz<C15579c, C15580a> implements azl {
        private static volatile azv<C15579c> zzdu;
        static final C15579c zzeo = new C15579c();
        private int zzdi;
        public String zzei = "";
        private String zzej = "";
        private String zzek = "";
        private String zzel = "";
        private String zzem = "";
        public String zzen = "";

        /* renamed from: com.google.android.gms.internal.ads.ahj$c$a */
        public static final class C15580a extends C15671a<C15579c, C15580a> implements azl {
            /* synthetic */ C15580a(aik aik) {
                this();
            }

            private C15580a() {
                super(C15579c.zzeo);
            }
        }

        private C15579c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (aik.f40600a[i - 1]) {
                case 1:
                    return new C15579c();
                case 2:
                    return new C15580a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzei", "zzej", "zzek", "zzel", "zzem", "zzen"};
                    return m34713a((azj) zzeo, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", objArr);
                case 4:
                    return zzeo;
                case 5:
                    azv<C15579c> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15579c.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzeo);
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
            axz.m34715a(C15579c.class, zzeo);
        }
    }
}
