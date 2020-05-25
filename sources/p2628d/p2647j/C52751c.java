package p2628d.p2647j;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: d.j.c */
public final class C52751c extends C52748a {

    /* renamed from: e */
    public static final C52751c f131002e = new C52751c(1, 0);

    /* renamed from: f */
    public static final C52752a f131003f = new C52752a(null);

    /* renamed from: d.j.c$a */
    public static final class C52752a {
        private C52752a() {
        }

        /* renamed from: a */
        public static C52751c m112313a() {
            return C52751c.f131002e;
        }

        public /* synthetic */ C52752a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Integer mo110348b() {
        return Integer.valueOf(this.f130995a);
    }

    /* renamed from: c */
    public final Integer mo110349c() {
        return Integer.valueOf(this.f130996b);
    }

    /* renamed from: a */
    public final boolean mo110342a() {
        if (this.f130995a > this.f130996b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (mo110342a()) {
            return -1;
        }
        return (this.f130995a * 31) + this.f130996b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f130995a);
        sb.append("..");
        sb.append(this.f130996b);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2.f130996b == r3.f130996b) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p2628d.p2647j.C52751c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.mo110342a()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            d.j.c r0 = (p2628d.p2647j.C52751c) r0
            boolean r0 = r0.mo110342a()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            int r0 = r2.f130995a
            d.j.c r3 = (p2628d.p2647j.C52751c) r3
            int r1 = r3.f130995a
            if (r0 != r1) goto L_0x0023
            int r0 = r2.f130996b
            int r3 = r3.f130996b
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            return r3
        L_0x0023:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2647j.C52751c.equals(java.lang.Object):boolean");
    }

    public C52751c(int i, int i2) {
        super(i, i2, 1);
    }
}
