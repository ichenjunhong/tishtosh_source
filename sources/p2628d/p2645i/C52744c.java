package p2628d.p2645i;

import p2628d.p2635d.C52641b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.i.c */
public abstract class C52744c {

    /* renamed from: a */
    public static final C52744c f130990a = C52641b.f130929a.mo110266a();

    /* renamed from: b */
    public static final C52745a f130991b = C52745a.f130993d;

    /* renamed from: c */
    public static final C52746b f130992c = new C52746b(null);

    /* renamed from: d.i.c$a */
    public static final class C52745a extends C52744c {

        /* renamed from: d */
        public static final C52745a f130993d = new C52745a();

        private C52745a() {
        }

        /* renamed from: a */
        public final int mo110335a(int i) {
            return C52744c.f130992c.mo110335a(i);
        }
    }

    /* renamed from: d.i.c$b */
    public static final class C52746b extends C52744c {
        private C52746b() {
        }

        /* renamed from: b */
        public final int mo110337b() {
            return C52744c.f130990a.mo110337b();
        }

        /* renamed from: c */
        public final double mo110339c() {
            return C52744c.f130990a.mo110339c();
        }

        public /* synthetic */ C52746b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo110335a(int i) {
            return C52744c.f130990a.mo110335a(i);
        }

        /* renamed from: b */
        public final int mo110338b(int i) {
            return C52744c.f130990a.mo110338b(i);
        }

        /* renamed from: a */
        public final int mo110340a(int i, int i2) {
            return C52744c.f130990a.mo110340a(i, i2);
        }
    }

    /* renamed from: a */
    public abstract int mo110335a(int i);

    /* renamed from: b */
    public int mo110337b() {
        return mo110335a(32);
    }

    /* renamed from: c */
    public double mo110339c() {
        double a = (double) ((((long) mo110335a(26)) << 27) + ((long) mo110335a(27)));
        Double.isNaN(a);
        return a / 9.007199254740992E15d;
    }

    /* renamed from: b */
    public int mo110338b(int i) {
        return mo110340a(0, i);
    }

    /* renamed from: a */
    public int mo110340a(int i, int i2) {
        boolean z;
        int i3;
        int b;
        int i4;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i3 = mo110335a(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        b = mo110337b() >>> 1;
                        i4 = b % i5;
                    } while ((b - i4) + (i5 - 1) < 0);
                    i3 = i4;
                }
                return i + i3;
            }
            while (true) {
                int b2 = mo110337b();
                if (i <= b2 && i2 > b2) {
                    return b2;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            C52711k.m112240b(valueOf, "from");
            C52711k.m112240b(valueOf2, "until");
            StringBuilder sb = new StringBuilder("Random range is empty: [");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
}
