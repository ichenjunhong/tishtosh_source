package okhttp3;

import java.util.concurrent.TimeUnit;

/* renamed from: okhttp3.d */
public final class C53522d {

    /* renamed from: a */
    public static final C53522d f132470a;

    /* renamed from: b */
    public static final C53522d f132471b;

    /* renamed from: c */
    public final boolean f132472c;

    /* renamed from: d */
    public final boolean f132473d;

    /* renamed from: e */
    public final int f132474e;

    /* renamed from: f */
    public final int f132475f;

    /* renamed from: g */
    public final boolean f132476g;

    /* renamed from: h */
    public final boolean f132477h;

    /* renamed from: i */
    public final boolean f132478i;

    /* renamed from: j */
    public final int f132479j;

    /* renamed from: k */
    public final int f132480k;

    /* renamed from: l */
    public final boolean f132481l;

    /* renamed from: m */
    public final boolean f132482m;

    /* renamed from: n */
    public final boolean f132483n;

    /* renamed from: o */
    String f132484o;

    /* renamed from: okhttp3.d$a */
    public static final class C53523a {

        /* renamed from: a */
        boolean f132485a;

        /* renamed from: b */
        boolean f132486b;

        /* renamed from: c */
        int f132487c = -1;

        /* renamed from: d */
        int f132488d = -1;

        /* renamed from: e */
        int f132489e = -1;

        /* renamed from: f */
        boolean f132490f;

        /* renamed from: g */
        boolean f132491g;

        /* renamed from: h */
        boolean f132492h;

        /* renamed from: a */
        public final C53523a mo111322a() {
            this.f132486b = true;
            return this;
        }

        /* renamed from: b */
        public final C53522d mo111324b() {
            return new C53522d(this);
        }

        /* renamed from: a */
        public final C53523a mo111323a(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.f132488d = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        C53523a aVar = new C53523a();
        aVar.f132485a = true;
        f132470a = aVar.mo111324b();
        C53523a aVar2 = new C53523a();
        aVar2.f132490f = true;
        f132471b = aVar2.mo111323a(Integer.MAX_VALUE, TimeUnit.SECONDS).mo111324b();
    }

    public final String toString() {
        String str;
        String str2 = this.f132484o;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f132472c) {
            sb.append("no-cache, ");
        }
        if (this.f132473d) {
            sb.append("no-store, ");
        }
        if (this.f132474e != -1) {
            sb.append("max-age=");
            sb.append(this.f132474e);
            sb.append(", ");
        }
        if (this.f132475f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f132475f);
            sb.append(", ");
        }
        if (this.f132476g) {
            sb.append("private, ");
        }
        if (this.f132477h) {
            sb.append("public, ");
        }
        if (this.f132478i) {
            sb.append("must-revalidate, ");
        }
        if (this.f132479j != -1) {
            sb.append("max-stale=");
            sb.append(this.f132479j);
            sb.append(", ");
        }
        if (this.f132480k != -1) {
            sb.append("min-fresh=");
            sb.append(this.f132480k);
            sb.append(", ");
        }
        if (this.f132481l) {
            sb.append("only-if-cached, ");
        }
        if (this.f132482m) {
            sb.append("no-transform, ");
        }
        if (this.f132483n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.f132484o = str;
        return str;
    }

    C53522d(C53523a aVar) {
        this.f132472c = aVar.f132485a;
        this.f132473d = aVar.f132486b;
        this.f132474e = aVar.f132487c;
        this.f132475f = -1;
        this.f132479j = aVar.f132488d;
        this.f132480k = aVar.f132489e;
        this.f132481l = aVar.f132490f;
        this.f132482m = aVar.f132491g;
        this.f132483n = aVar.f132492h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.C53522d m113673a(okhttp3.C53671s r23) {
        /*
            r0 = r23
            int r1 = r23.mo111591a()
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x001b:
            if (r6 >= r1) goto L_0x015b
            java.lang.String r9 = r0.mo111592a(r6)
            java.lang.String r2 = r0.mo111594b(r6)
            java.lang.String r4 = "Cache-Control"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0033
            if (r8 == 0) goto L_0x0031
        L_0x002f:
            r7 = 0
            goto L_0x003c
        L_0x0031:
            r8 = r2
            goto L_0x003c
        L_0x0033:
            java.lang.String r4 = "Pragma"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0154
            goto L_0x002f
        L_0x003c:
            r4 = 0
        L_0x003d:
            int r9 = r2.length()
            if (r4 >= r9) goto L_0x0154
            java.lang.String r9 = "=,;"
            int r9 = okhttp3.internal.p2685c.C53568e.m113829a(r2, r4, r9)
            java.lang.String r4 = r2.substring(r4, r9)
            java.lang.String r4 = r4.trim()
            int r3 = r2.length()
            if (r9 == r3) goto L_0x00af
            char r3 = r2.charAt(r9)
            r5 = 44
            if (r3 == r5) goto L_0x00af
            char r3 = r2.charAt(r9)
            r5 = 59
            if (r3 != r5) goto L_0x0068
            goto L_0x00af
        L_0x0068:
            int r9 = r9 + 1
        L_0x006a:
            int r3 = r2.length()
            if (r9 >= r3) goto L_0x007f
            char r3 = r2.charAt(r9)
            r5 = 32
            if (r3 == r5) goto L_0x007c
            r5 = 9
            if (r3 != r5) goto L_0x007f
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x006a
        L_0x007f:
            int r3 = r2.length()
            if (r9 >= r3) goto L_0x009e
            char r3 = r2.charAt(r9)
            r5 = 34
            if (r3 != r5) goto L_0x009e
            int r9 = r9 + 1
            java.lang.String r3 = "\""
            int r3 = okhttp3.internal.p2685c.C53568e.m113829a(r2, r9, r3)
            java.lang.String r5 = r2.substring(r9, r3)
            r22 = 1
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x009e:
            r22 = 1
            java.lang.String r3 = ",;"
            int r3 = okhttp3.internal.p2685c.C53568e.m113829a(r2, r9, r3)
            java.lang.String r5 = r2.substring(r9, r3)
            java.lang.String r5 = r5.trim()
            goto L_0x00b5
        L_0x00af:
            r22 = 1
            int r9 = r9 + 1
            r3 = r9
            r5 = 0
        L_0x00b5:
            java.lang.String r9 = "no-cache"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00c1
            r4 = r3
            r10 = 1
            goto L_0x003d
        L_0x00c1:
            java.lang.String r9 = "no-store"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00cd
            r4 = r3
            r11 = 1
            goto L_0x003d
        L_0x00cd:
            java.lang.String r9 = "max-age"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00dd
            r9 = -1
            int r12 = okhttp3.internal.p2685c.C53568e.m113828a(r5, r9)
        L_0x00da:
            r4 = r3
            goto L_0x003d
        L_0x00dd:
            java.lang.String r9 = "s-maxage"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00eb
            r9 = -1
            int r13 = okhttp3.internal.p2685c.C53568e.m113828a(r5, r9)
            goto L_0x00da
        L_0x00eb:
            java.lang.String r9 = "private"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00f7
            r4 = r3
            r14 = 1
            goto L_0x003d
        L_0x00f7:
            java.lang.String r9 = "public"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0103
            r4 = r3
            r15 = 1
            goto L_0x003d
        L_0x0103:
            java.lang.String r9 = "must-revalidate"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0110
            r4 = r3
            r16 = 1
            goto L_0x003d
        L_0x0110:
            java.lang.String r9 = "max-stale"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0120
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r17 = okhttp3.internal.p2685c.C53568e.m113828a(r5, r4)
            goto L_0x00da
        L_0x0120:
            java.lang.String r9 = "min-fresh"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x012e
            r9 = -1
            int r18 = okhttp3.internal.p2685c.C53568e.m113828a(r5, r9)
            goto L_0x00da
        L_0x012e:
            r9 = -1
            java.lang.String r5 = "only-if-cached"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x013c
            r4 = r3
            r19 = 1
            goto L_0x003d
        L_0x013c:
            java.lang.String r5 = "no-transform"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x0149
            r4 = r3
            r20 = 1
            goto L_0x003d
        L_0x0149:
            java.lang.String r5 = "immutable"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x00da
            r21 = 1
            goto L_0x00da
        L_0x0154:
            r9 = -1
            r22 = 1
            int r6 = r6 + 1
            goto L_0x001b
        L_0x015b:
            if (r7 != 0) goto L_0x0160
            r22 = 0
            goto L_0x0162
        L_0x0160:
            r22 = r8
        L_0x0162:
            okhttp3.d r0 = new okhttp3.d
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53522d.m113673a(okhttp3.s):okhttp3.d");
    }

    private C53522d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f132472c = z;
        this.f132473d = z2;
        this.f132474e = i;
        this.f132475f = i2;
        this.f132476g = z3;
        this.f132477h = z4;
        this.f132478i = z5;
        this.f132479j = i3;
        this.f132480k = i4;
        this.f132481l = z6;
        this.f132482m = z7;
        this.f132483n = z8;
        this.f132484o = str;
    }
}
