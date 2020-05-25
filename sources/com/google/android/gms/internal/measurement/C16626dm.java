package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16737a;
import com.google.android.gms.internal.measurement.C16736hd.C16738b;
import com.google.android.gms.internal.measurement.C16736hd.C16741e;

/* renamed from: com.google.android.gms.internal.measurement.dm */
public final class C16626dm {

    /* renamed from: com.google.android.gms.internal.measurement.dm$a */
    public static final class C16627a extends C16736hd<C16627a, C16628a> implements C16777im {
        static final C16627a zzauw = new C16627a();
        private static volatile C16786iv<C16627a> zznw;
        String zzauu = "";
        long zzauv;
        int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.dm$a$a */
        public static final class C16628a extends C16737a<C16627a, C16628a> implements C16777im {
            /* renamed from: a */
            public final C16628a mo31919a(String str) {
                mo32237b();
                C16627a aVar = (C16627a) this.f47086a;
                if (str != null) {
                    aVar.zznr |= 1;
                    aVar.zzauu = str;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: a */
            public final C16628a mo31918a(long j) {
                mo32237b();
                C16627a aVar = (C16627a) this.f47086a;
                aVar.zznr |= 2;
                aVar.zzauv = j;
                return this;
            }

            /* synthetic */ C16628a(C16632dn dnVar) {
                this();
            }

            private C16628a() {
                super(C16627a.zzauw);
            }
        }

        private C16627a() {
        }

        /* renamed from: a */
        public static C16628a m39714a() {
            return (C16628a) ((C16737a) zzauw.mo31917a(C16741e.f47094e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo31917a(int i, Object obj, Object obj2) {
            switch (C16632dn.f46722a[i - 1]) {
                case 1:
                    return new C16627a();
                case 2:
                    return new C16628a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzauu", "zzauv"};
                    return m40278a((C16775ik) zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", objArr);
                case 4:
                    return zzauw;
                case 5:
                    C16786iv<C16627a> ivVar = zznw;
                    if (ivVar == null) {
                        synchronized (C16627a.class) {
                            ivVar = zznw;
                            if (ivVar == null) {
                                ivVar = new C16738b<>(zzauw);
                                zznw = ivVar;
                            }
                        }
                    }
                    return ivVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C16736hd.m40280a(C16627a.class, zzauw);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.dm$b */
    public static final class C16629b extends C16736hd<C16629b, C16630a> implements C16777im {
        static final C16629b zzauz = new C16629b();
        private static volatile C16786iv<C16629b> zznw;
        private int zzaux = 1;
        C16747hj<C16627a> zzauy = C16789iy.f47174a;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.dm$b$a */
        public static final class C16630a extends C16737a<C16629b, C16630a> implements C16777im {
            /* renamed from: a */
            public final C16630a mo31920a(C16627a aVar) {
                mo32237b();
                C16629b bVar = (C16629b) this.f47086a;
                if (aVar != null) {
                    if (!bVar.zzauy.mo31993a()) {
                        C16747hj<C16627a> hjVar = bVar.zzauy;
                        int size = hjVar.size();
                        bVar.zzauy = hjVar.mo32008a(size == 0 ? 10 : size << 1);
                    }
                    bVar.zzauy.add(aVar);
                    return this;
                }
                throw new NullPointerException();
            }

            /* synthetic */ C16630a(C16632dn dnVar) {
                this();
            }

            private C16630a() {
                super(C16629b.zzauz);
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.dm$b$b */
        public enum C16631b implements C16744hg {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c */
            private static final C16745hh<C16631b> f46719c = null;

            /* renamed from: d */
            private final int f46721d;

            public final int zzc() {
                return this.f46721d;
            }

            public static C16631b zzt(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return null;
                }
            }

            public static C16746hi zzd() {
                return C16634dp.f46723a;
            }

            private C16631b(int i) {
                this.f46721d = i;
            }

            static {
                f46719c = new C16633do();
            }
        }

        private C16629b() {
        }

        /* renamed from: a */
        public static C16630a m39718a() {
            return (C16630a) ((C16737a) zzauz.mo31917a(C16741e.f47094e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo31917a(int i, Object obj, Object obj2) {
            switch (C16632dn.f46722a[i - 1]) {
                case 1:
                    return new C16629b();
                case 2:
                    return new C16630a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzaux", C16631b.zzd(), "zzauy", C16627a.class};
                    return m40278a((C16775ik) zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", objArr);
                case 4:
                    return zzauz;
                case 5:
                    C16786iv<C16629b> ivVar = zznw;
                    if (ivVar == null) {
                        synchronized (C16629b.class) {
                            ivVar = zznw;
                            if (ivVar == null) {
                                ivVar = new C16738b<>(zzauz);
                                zznw = ivVar;
                            }
                        }
                    }
                    return ivVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b */
        public static C16786iv<C16629b> m39719b() {
            return (C16786iv) zzauz.mo31917a(C16741e.f47096g, (Object) null, (Object) null);
        }

        static {
            C16736hd.m40280a(C16629b.class, zzauz);
        }
    }
}
