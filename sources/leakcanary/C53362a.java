package leakcanary;

import java.util.concurrent.TimeUnit;
import leakcanary.internal.C53420k;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

/* renamed from: leakcanary.a */
public final class C53362a {

    /* renamed from: a */
    public static final C53362a f131991a = new C53362a();

    /* renamed from: b */
    private static volatile C53363a f131992b;

    /* renamed from: leakcanary.a$a */
    public static final class C53363a {

        /* renamed from: a */
        public final boolean f131993a;

        /* renamed from: b */
        public final boolean f131994b;

        /* renamed from: c */
        public final boolean f131995c;

        /* renamed from: d */
        public final boolean f131996d;

        /* renamed from: e */
        public final long f131997e;

        public C53363a() {
            this(false, false, false, false, 0, 31, null);
        }

        /* renamed from: a */
        public static /* synthetic */ C53363a m113433a(C53363a aVar, boolean z, boolean z2, boolean z3, boolean z4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f131993a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f131994b;
            }
            boolean z5 = z2;
            if ((i & 4) != 0) {
                z3 = aVar.f131995c;
            }
            boolean z6 = z3;
            if ((i & 8) != 0) {
                z4 = aVar.f131996d;
            }
            boolean z7 = z4;
            if ((i & 16) != 0) {
                j = aVar.f131997e;
            }
            return m113434a(z, z5, z6, z7, j);
        }

        /* renamed from: a */
        private static C53363a m113434a(boolean z, boolean z2, boolean z3, boolean z4, long j) {
            C53363a aVar = new C53363a(z, z2, z3, z4, j);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C53363a) {
                    C53363a aVar = (C53363a) obj;
                    if (this.f131993a == aVar.f131993a) {
                        if (this.f131994b == aVar.f131994b) {
                            if (this.f131995c == aVar.f131995c) {
                                if (this.f131996d == aVar.f131996d) {
                                    if (this.f131997e == aVar.f131997e) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f131993a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f131994b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f131995c;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f131996d;
            if (!z4) {
                i = z4;
            }
            int i5 = (i4 + i) * 31;
            long j = this.f131997e;
            return i5 + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(enabled=");
            sb.append(this.f131993a);
            sb.append(", watchActivities=");
            sb.append(this.f131994b);
            sb.append(", watchFragments=");
            sb.append(this.f131995c);
            sb.append(", watchFragmentViews=");
            sb.append(this.f131996d);
            sb.append(", watchDurationMillis=");
            sb.append(this.f131997e);
            sb.append(")");
            return sb.toString();
        }

        private C53363a(boolean z, boolean z2, boolean z3, boolean z4, long j) {
            this.f131993a = z;
            this.f131994b = z2;
            this.f131995c = z3;
            this.f131996d = z4;
            this.f131997e = j;
        }

        public /* synthetic */ C53363a(boolean z, boolean z2, boolean z3, boolean z4, long j, int i, C52707g gVar) {
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8 = true;
            if ((i & 1) != 0) {
                z5 = true;
            } else {
                z5 = z;
            }
            if ((i & 2) != 0) {
                z6 = true;
            } else {
                z6 = z2;
            }
            if ((i & 4) != 0) {
                z7 = true;
            } else {
                z7 = z3;
            }
            if ((i & 8) == 0) {
                z8 = z4;
            }
            if ((i & 16) != 0) {
                j = TimeUnit.SECONDS.toMillis(5);
            }
            this(z5, z6, z7, z8, j);
        }
    }

    private C53362a() {
    }

    /* renamed from: a */
    public static C53363a m113429a() {
        return f131992b;
    }

    /* renamed from: b */
    public static C53372h m113431b() {
        return C53420k.f132115d;
    }

    /* renamed from: c */
    public static boolean m113432c() {
        return C53420k.m113480a();
    }

    static {
        C53363a aVar;
        if (m113432c()) {
            aVar = new C53363a(false, false, false, false, 0, 31, null);
        } else {
            aVar = new C53363a(false, false, false, false, 0, 30, null);
        }
        f131992b = aVar;
    }

    /* renamed from: a */
    public static void m113430a(C53363a aVar) {
        C52711k.m112240b(aVar, "value");
        f131992b = aVar;
        C53174a a = C53173a.m112969a();
        if (a != null) {
            StringBuilder sb = new StringBuilder("Updated AppWatcher.config to ");
            sb.append(aVar);
            a.mo110681a(sb.toString());
        }
    }
}
