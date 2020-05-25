package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class bcb {

    /* renamed from: com.google.android.gms.internal.ads.bcb$a */
    public static final class C15687a extends axz<C15687a, C15688a> implements azl {
        private static volatile azv<C15687a> zzdu;
        static final C15687a zzggn = new C15687a();
        private int zzdi;
        private int zzggg;
        private C15689b zzggh;
        private awo zzggi = awo.zzfuo;
        private awo zzggj = awo.zzfuo;
        private boolean zzggk;
        private boolean zzggl;
        private byte zzggm = 2;

        /* renamed from: com.google.android.gms.internal.ads.bcb$a$a */
        public static final class C15688a extends C15671a<C15687a, C15688a> implements azl {
            /* synthetic */ C15688a(bcc bcc) {
                this();
            }

            private C15688a() {
                super(C15687a.zzggn);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$a$b */
        public static final class C15689b extends axz<C15689b, C15690a> implements azl {
            private static volatile azv<C15689b> zzdu;
            static final C15689b zzggs = new C15689b();
            private int zzdi;
            private String zzggo = "";
            private String zzggp = "";
            private String zzggq = "";
            private int zzggr;

            /* renamed from: com.google.android.gms.internal.ads.bcb$a$b$a */
            public static final class C15690a extends C15671a<C15689b, C15690a> implements azl {
                /* synthetic */ C15690a(bcc bcc) {
                    this();
                }

                private C15690a() {
                    super(C15689b.zzggs);
                }
            }

            private C15689b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15689b();
                    case 2:
                        return new C15690a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzggo", "zzggp", "zzggq", "zzggr"};
                        return m34713a((azj) zzggs, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", objArr);
                    case 4:
                        return zzggs;
                    case 5:
                        azv<C15689b> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15689b.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzggs);
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
                axz.m34715a(C15689b.class, zzggs);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$a$c */
        public enum C15691c implements ayc {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            

            /* renamed from: f */
            private static final ayd<C15691c> f41814f = null;

            /* renamed from: g */
            private final int f41816g;

            public final int zzac() {
                return this.f41816g;
            }

            public static C15691c zzhc(int i) {
                switch (i) {
                    case 0:
                        return SAFE;
                    case 1:
                        return DANGEROUS;
                    case 2:
                        return UNKNOWN;
                    case 3:
                        return POTENTIALLY_UNWANTED;
                    case 4:
                        return DANGEROUS_HOST;
                    default:
                        return null;
                }
            }

            public static aye zzad() {
                return bce.f41843a;
            }

            private C15691c(int i) {
                this.f41816g = i;
            }

            static {
                f41814f = new bcd();
            }
        }

        private C15687a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (bcc.f41842a[i - 1]) {
                case 1:
                    return new C15687a();
                case 2:
                    return new C15688a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzggg", C15691c.zzad(), "zzggh", "zzggi", "zzggj", "zzggk", "zzggl"};
                    return m34713a((azj) zzggn, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", objArr);
                case 4:
                    return zzggn;
                case 5:
                    azv<C15687a> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15687a.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzggn);
                                zzdu = azv;
                            }
                        }
                    }
                    return azv;
                case 6:
                    return Byte.valueOf(this.zzggm);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzggm = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axz.m34715a(C15687a.class, zzggn);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bcb$b */
    public static final class C15692b extends axz<C15692b, C15693a> implements azl {
        private static volatile azv<C15692b> zzdu;
        static final C15692b zzgho = new C15692b();
        private int zzcgq;
        private int zzdi;
        private awo zzggi = awo.zzfuo;
        private byte zzggm = 2;
        private String zzggp = "";
        private int zzggz;
        private String zzgha = "";
        private String zzghb = "";
        private C15694b zzghc;
        private ayh<C15710h> zzghd = m34718k();
        private String zzghe = "";
        private C15706f zzghf;
        private boolean zzghg;
        private ayh<String> zzghh = axz.m34718k();
        private String zzghi = "";
        private boolean zzghj;
        private boolean zzghk;
        private C15713i zzghl;
        private ayh<String> zzghm = axz.m34718k();
        private ayh<String> zzghn = axz.m34718k();

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$a */
        public static final class C15693a extends C15671a<C15692b, C15693a> implements azl {
            /* synthetic */ C15693a(bcc bcc) {
                this();
            }

            private C15693a() {
                super(C15692b.zzgho);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$b */
        public static final class C15694b extends axz<C15694b, C15695a> implements azl {
            private static volatile azv<C15694b> zzdu;
            static final C15694b zzghq = new C15694b();
            private int zzdi;
            private String zzghp = "";

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$b$a */
            public static final class C15695a extends C15671a<C15694b, C15695a> implements azl {
                /* synthetic */ C15695a(bcc bcc) {
                    this();
                }

                private C15695a() {
                    super(C15694b.zzghq);
                }
            }

            private C15694b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15694b();
                    case 2:
                        return new C15695a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzghp"};
                        return m34713a((azj) zzghq, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", objArr);
                    case 4:
                        return zzghq;
                    case 5:
                        azv<C15694b> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15694b.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzghq);
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
                axz.m34715a(C15694b.class, zzghq);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$c */
        public static final class C15696c extends axz<C15696c, C15697a> implements azl {
            private static volatile azv<C15696c> zzdu;
            static final C15696c zzghs = new C15696c();
            private int zzdi;
            private awo zzflx = awo.zzfuo;
            private byte zzggm = 2;
            private awo zzghr = awo.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$c$a */
            public static final class C15697a extends C15671a<C15696c, C15697a> implements azl {
                /* synthetic */ C15697a(bcc bcc) {
                    this();
                }

                private C15697a() {
                    super(C15696c.zzghs);
                }
            }

            private C15696c() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15696c();
                    case 2:
                        return new C15697a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzghr", "zzflx"};
                        return m34713a((azj) zzghs, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", objArr);
                    case 4:
                        return zzghs;
                    case 5:
                        azv<C15696c> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15696c.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzghs);
                                    zzdu = azv;
                                }
                            }
                        }
                        return azv;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axz.m34715a(C15696c.class, zzghs);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$d */
        public static final class C15698d extends axz<C15698d, C15699a> implements azl {
            private static volatile azv<C15698d> zzdu;
            static final C15698d zzghy = new C15698d();
            private int zzdi;
            private byte zzggm = 2;
            private C15700b zzght;
            private ayh<C15696c> zzghu = m34718k();
            private awo zzghv = awo.zzfuo;
            private awo zzghw = awo.zzfuo;
            private int zzghx;

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$d$a */
            public static final class C15699a extends C15671a<C15698d, C15699a> implements azl {
                /* synthetic */ C15699a(bcc bcc) {
                    this();
                }

                private C15699a() {
                    super(C15698d.zzghy);
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$d$b */
            public static final class C15700b extends axz<C15700b, C15701a> implements azl {
                private static volatile azv<C15700b> zzdu;
                static final C15700b zzgic = new C15700b();
                private int zzdi;
                private awo zzghz = awo.zzfuo;
                private awo zzgia = awo.zzfuo;
                private awo zzgib = awo.zzfuo;

                /* renamed from: com.google.android.gms.internal.ads.bcb$b$d$b$a */
                public static final class C15701a extends C15671a<C15700b, C15701a> implements azl {
                    /* synthetic */ C15701a(bcc bcc) {
                        this();
                    }

                    private C15701a() {
                        super(C15700b.zzgic);
                    }
                }

                private C15700b() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo28773a(int i, Object obj, Object obj2) {
                    switch (bcc.f41842a[i - 1]) {
                        case 1:
                            return new C15700b();
                        case 2:
                            return new C15701a(null);
                        case 3:
                            Object[] objArr = {"zzdi", "zzghz", "zzgia", "zzgib"};
                            return m34713a((azj) zzgic, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", objArr);
                        case 4:
                            return zzgic;
                        case 5:
                            azv<C15700b> azv = zzdu;
                            if (azv == null) {
                                synchronized (C15700b.class) {
                                    azv = zzdu;
                                    if (azv == null) {
                                        azv = new C15672b<>(zzgic);
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
                    axz.m34715a(C15700b.class, zzgic);
                }
            }

            private C15698d() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15698d();
                    case 2:
                        return new C15699a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzght", "zzghu", C15696c.class, "zzghv", "zzghw", "zzghx"};
                        return m34713a((azj) zzghy, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", objArr);
                    case 4:
                        return zzghy;
                    case 5:
                        azv<C15698d> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15698d.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzghy);
                                    zzdu = azv;
                                }
                            }
                        }
                        return azv;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axz.m34715a(C15698d.class, zzghy);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$e */
        public static final class C15702e extends axz<C15702e, C15703a> implements azl {
            private static volatile azv<C15702e> zzdu;
            static final C15702e zzgif = new C15702e();
            private int zzdi;
            private byte zzggm = 2;
            private ayh<C15696c> zzghu = m34718k();
            private awo zzghv = awo.zzfuo;
            private awo zzghw = awo.zzfuo;
            private int zzghx;
            private C15704b zzgid;
            private awo zzgie = awo.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$e$a */
            public static final class C15703a extends C15671a<C15702e, C15703a> implements azl {
                /* synthetic */ C15703a(bcc bcc) {
                    this();
                }

                private C15703a() {
                    super(C15702e.zzgif);
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$e$b */
            public static final class C15704b extends axz<C15704b, C15705a> implements azl {
                private static volatile azv<C15704b> zzdu;
                static final C15704b zzgii = new C15704b();
                private int zzdi;
                private awo zzgib = awo.zzfuo;
                private int zzgig;
                private awo zzgih = awo.zzfuo;

                /* renamed from: com.google.android.gms.internal.ads.bcb$b$e$b$a */
                public static final class C15705a extends C15671a<C15704b, C15705a> implements azl {
                    /* synthetic */ C15705a(bcc bcc) {
                        this();
                    }

                    private C15705a() {
                        super(C15704b.zzgii);
                    }
                }

                private C15704b() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo28773a(int i, Object obj, Object obj2) {
                    switch (bcc.f41842a[i - 1]) {
                        case 1:
                            return new C15704b();
                        case 2:
                            return new C15705a(null);
                        case 3:
                            Object[] objArr = {"zzdi", "zzgig", "zzgih", "zzgib"};
                            return m34713a((azj) zzgii, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", objArr);
                        case 4:
                            return zzgii;
                        case 5:
                            azv<C15704b> azv = zzdu;
                            if (azv == null) {
                                synchronized (C15704b.class) {
                                    azv = zzdu;
                                    if (azv == null) {
                                        azv = new C15672b<>(zzgii);
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
                    axz.m34715a(C15704b.class, zzgii);
                }
            }

            private C15702e() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15702e();
                    case 2:
                        return new C15703a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgid", "zzghu", C15696c.class, "zzghv", "zzghw", "zzghx", "zzgie"};
                        return m34713a((azj) zzgif, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", objArr);
                    case 4:
                        return zzgif;
                    case 5:
                        azv<C15702e> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15702e.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzgif);
                                    zzdu = azv;
                                }
                            }
                        }
                        return azv;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axz.m34715a(C15702e.class, zzgif);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$f */
        public static final class C15706f extends axz<C15706f, C15707a> implements azl {
            private static volatile azv<C15706f> zzdu;
            static final C15706f zzgil = new C15706f();
            private int zzcgq;
            private int zzdi;
            private String zzgij = "";
            private awo zzgik = awo.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$f$a */
            public static final class C15707a extends C15671a<C15706f, C15707a> implements azl {
                /* synthetic */ C15707a(bcc bcc) {
                    this();
                }

                private C15707a() {
                    super(C15706f.zzgil);
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$f$b */
            public enum C15708b implements ayc {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                

                /* renamed from: c */
                private static final ayd<C15708b> f41819c = null;

                /* renamed from: d */
                private final int f41821d;

                public final int zzac() {
                    return this.f41821d;
                }

                public static C15708b zzhd(int i) {
                    switch (i) {
                        case 0:
                            return TYPE_UNKNOWN;
                        case 1:
                            return TYPE_CREATIVE;
                        default:
                            return null;
                    }
                }

                public static aye zzad() {
                    return bcg.f41844a;
                }

                private C15708b(int i) {
                    this.f41821d = i;
                }

                static {
                    f41819c = new bcf();
                }
            }

            private C15706f() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15706f();
                    case 2:
                        return new C15707a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzcgq", C15708b.zzad(), "zzgij", "zzgik"};
                        return m34713a((azj) zzgil, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", objArr);
                    case 4:
                        return zzgil;
                    case 5:
                        azv<C15706f> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15706f.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzgil);
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
                axz.m34715a(C15706f.class, zzgil);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$g */
        public enum C15709g implements ayc {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            

            /* renamed from: k */
            private static final ayd<C15709g> f41832k = null;

            /* renamed from: l */
            private final int f41834l;

            public final int zzac() {
                return this.f41834l;
            }

            public static C15709g zzhe(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static aye zzad() {
                return bci.f41845a;
            }

            private C15709g(int i) {
                this.f41834l = i;
            }

            static {
                f41832k = new bch();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$h */
        public static final class C15710h extends axz<C15710h, C15712b> implements azl {
            private static volatile azv<C15710h> zzdu;
            static final C15710h zzgji = new C15710h();
            private int zzdi;
            private byte zzggm = 2;
            private String zzggp = "";
            private int zzgja;
            private C15698d zzgjb;
            private C15702e zzgjc;
            private int zzgjd;
            private ayf zzgje = m34717j();
            private String zzgjf = "";
            private int zzgjg;
            private ayh<String> zzgjh = axz.m34718k();

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$h$a */
            public enum C15711a implements ayc {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                

                /* renamed from: e */
                private static final ayd<C15711a> f41839e = null;

                /* renamed from: f */
                private final int f41841f;

                public final int zzac() {
                    return this.f41841f;
                }

                public static C15711a zzhf(int i) {
                    switch (i) {
                        case 0:
                            return AD_RESOURCE_UNKNOWN;
                        case 1:
                            return AD_RESOURCE_CREATIVE;
                        case 2:
                            return AD_RESOURCE_POST_CLICK;
                        case 3:
                            return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                        default:
                            return null;
                    }
                }

                public static aye zzad() {
                    return bck.f41846a;
                }

                private C15711a(int i) {
                    this.f41841f = i;
                }

                static {
                    f41839e = new bcj();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$h$b */
            public static final class C15712b extends C15671a<C15710h, C15712b> implements azl {
                /* synthetic */ C15712b(bcc bcc) {
                    this();
                }

                private C15712b() {
                    super(C15710h.zzgji);
                }
            }

            private C15710h() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15710h();
                    case 2:
                        return new C15712b(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgja", "zzggp", "zzgjb", "zzgjc", "zzgjd", "zzgje", "zzgjf", "zzgjg", C15711a.zzad(), "zzgjh"};
                        return m34713a((azj) zzgji, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", objArr);
                    case 4:
                        return zzgji;
                    case 5:
                        azv<C15710h> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15710h.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzgji);
                                    zzdu = azv;
                                }
                            }
                        }
                        return azv;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axz.m34715a(C15710h.class, zzgji);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bcb$b$i */
        public static final class C15713i extends axz<C15713i, C15714a> implements azl {
            private static volatile azv<C15713i> zzdu;
            static final C15713i zzgjr = new C15713i();
            private int zzdi;
            private String zzgjo = "";
            private long zzgjp;
            private boolean zzgjq;

            /* renamed from: com.google.android.gms.internal.ads.bcb$b$i$a */
            public static final class C15714a extends C15671a<C15713i, C15714a> implements azl {
                /* synthetic */ C15714a(bcc bcc) {
                    this();
                }

                private C15714a() {
                    super(C15713i.zzgjr);
                }
            }

            private C15713i() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo28773a(int i, Object obj, Object obj2) {
                switch (bcc.f41842a[i - 1]) {
                    case 1:
                        return new C15713i();
                    case 2:
                        return new C15714a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgjo", "zzgjp", "zzgjq"};
                        return m34713a((azj) zzgjr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", objArr);
                    case 4:
                        return zzgjr;
                    case 5:
                        azv<C15713i> azv = zzdu;
                        if (azv == null) {
                            synchronized (C15713i.class) {
                                azv = zzdu;
                                if (azv == null) {
                                    azv = new C15672b<>(zzgjr);
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
                axz.m34715a(C15713i.class, zzgjr);
            }
        }

        private C15692b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (bcc.f41842a[i - 1]) {
                case 1:
                    return new C15692b();
                case 2:
                    return new C15693a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzggp", "zzgha", "zzghb", "zzghd", C15710h.class, "zzghg", "zzghh", "zzghi", "zzghj", "zzghk", "zzcgq", C15709g.zzad(), "zzggz", C15691c.zzad(), "zzghc", "zzghe", "zzghf", "zzggi", "zzghl", "zzghm", "zzghn"};
                    return m34713a((azj) zzgho, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", objArr);
                case 4:
                    return zzgho;
                case 5:
                    azv<C15692b> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15692b.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzgho);
                                zzdu = azv;
                            }
                        }
                    }
                    return azv;
                case 6:
                    return Byte.valueOf(this.zzggm);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzggm = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axz.m34715a(C15692b.class, zzgho);
        }
    }
}
