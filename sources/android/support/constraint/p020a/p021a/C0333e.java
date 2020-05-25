package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0349c;
import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.p021a.C0328d.C0331b;
import android.support.constraint.p020a.p021a.C0328d.C0332c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.e */
public class C0333e {

    /* renamed from: Y */
    public static float f946Y = 0.5f;

    /* renamed from: A */
    C0328d f947A = new C0328d(this, C0332c.CENTER_X);

    /* renamed from: B */
    C0328d f948B = new C0328d(this, C0332c.CENTER_Y);

    /* renamed from: C */
    C0328d f949C = new C0328d(this, C0332c.CENTER);

    /* renamed from: D */
    protected C0328d[] f950D = {this.f1008v, this.f1010x, this.f1009w, this.f1011y, this.f1012z, this.f949C};

    /* renamed from: E */
    protected ArrayList<C0328d> f951E = new ArrayList<>();

    /* renamed from: F */
    protected C0335a[] f952F = {C0335a.FIXED, C0335a.FIXED};

    /* renamed from: G */
    public C0333e f953G = null;

    /* renamed from: H */
    int f954H = 0;

    /* renamed from: I */
    int f955I = 0;

    /* renamed from: J */
    public float f956J = 0.0f;

    /* renamed from: K */
    public int f957K = -1;

    /* renamed from: L */
    public int f958L = 0;

    /* renamed from: M */
    public int f959M = 0;

    /* renamed from: N */
    public int f960N = 0;

    /* renamed from: O */
    public int f961O = 0;

    /* renamed from: P */
    public int f962P = 0;

    /* renamed from: Q */
    public int f963Q = 0;

    /* renamed from: R */
    protected int f964R = 0;

    /* renamed from: S */
    protected int f965S = 0;

    /* renamed from: T */
    public int f966T = 0;

    /* renamed from: U */
    public int f967U;

    /* renamed from: V */
    public int f968V;

    /* renamed from: W */
    public int f969W;

    /* renamed from: X */
    public int f970X;

    /* renamed from: Z */
    public float f971Z = f946Y;

    /* renamed from: aa */
    public float f972aa = f946Y;

    /* renamed from: ab */
    public Object f973ab;

    /* renamed from: ac */
    public int f974ac = 0;

    /* renamed from: ad */
    public int f975ad = 0;

    /* renamed from: ae */
    public String f976ae = null;

    /* renamed from: af */
    public String f977af = null;

    /* renamed from: ag */
    boolean f978ag;

    /* renamed from: ah */
    boolean f979ah;

    /* renamed from: ai */
    public int f980ai = 0;

    /* renamed from: aj */
    public int f981aj = 0;

    /* renamed from: ak */
    boolean f982ak;

    /* renamed from: al */
    boolean f983al;

    /* renamed from: am */
    public float[] f984am = {-1.0f, -1.0f};

    /* renamed from: an */
    protected C0333e[] f985an = {null, null};

    /* renamed from: ao */
    protected C0333e[] f986ao = {null, null};

    /* renamed from: ap */
    C0333e f987ap = null;

    /* renamed from: aq */
    C0333e f988aq = null;

    /* renamed from: c */
    public int f989c = -1;

    /* renamed from: d */
    public int f990d = -1;

    /* renamed from: e */
    C0343l f991e;

    /* renamed from: f */
    C0343l f992f;

    /* renamed from: g */
    public int f993g;

    /* renamed from: h */
    public int f994h;

    /* renamed from: i */
    int[] f995i = new int[2];

    /* renamed from: j */
    public int f996j;

    /* renamed from: k */
    public int f997k;

    /* renamed from: l */
    public float f998l = 1.0f;

    /* renamed from: m */
    public int f999m;

    /* renamed from: n */
    public int f1000n;

    /* renamed from: o */
    public float f1001o = 1.0f;

    /* renamed from: p */
    public boolean f1002p;

    /* renamed from: q */
    public boolean f1003q;

    /* renamed from: r */
    int f1004r = -1;

    /* renamed from: s */
    float f1005s = 1.0f;

    /* renamed from: t */
    public int[] f1006t = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: u */
    public float f1007u;

    /* renamed from: v */
    C0328d f1008v = new C0328d(this, C0332c.LEFT);

    /* renamed from: w */
    C0328d f1009w = new C0328d(this, C0332c.TOP);

    /* renamed from: x */
    C0328d f1010x = new C0328d(this, C0332c.RIGHT);

    /* renamed from: y */
    C0328d f1011y = new C0328d(this, C0332c.BOTTOM);

    /* renamed from: z */
    C0328d f1012z = new C0328d(this, C0332c.BASELINE);

    /* renamed from: android.support.constraint.a.a.e$a */
    public enum C0335a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: c */
    public void mo703c() {
    }

    /* renamed from: s */
    public ArrayList<C0328d> mo739s() {
        return this.f951E;
    }

    /* renamed from: l */
    public final int mo732l() {
        return this.f960N + this.f964R;
    }

    /* renamed from: m */
    public final int mo733m() {
        return this.f961O + this.f965S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo734n() {
        return this.f958L + this.f964R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo735o() {
        return this.f959M + this.f965S;
    }

    /* renamed from: p */
    public final int mo736p() {
        return this.f958L + this.f954H;
    }

    /* renamed from: q */
    public final int mo737q() {
        return this.f959M + this.f955I;
    }

    /* renamed from: r */
    public final boolean mo738r() {
        if (this.f966T > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final C0335a mo743v() {
        return this.f952F[0];
    }

    /* renamed from: w */
    public final C0335a mo744w() {
        return this.f952F[1];
    }

    /* renamed from: h */
    public final C0343l mo728h() {
        if (this.f991e == null) {
            this.f991e = new C0343l();
        }
        return this.f991e;
    }

    /* renamed from: i */
    public final C0343l mo729i() {
        if (this.f992f == null) {
            this.f992f = new C0343l();
        }
        return this.f992f;
    }

    /* renamed from: j */
    public final int mo730j() {
        if (this.f975ad == 8) {
            return 0;
        }
        return this.f954H;
    }

    /* renamed from: k */
    public final int mo731k() {
        if (this.f975ad == 8) {
            return 0;
        }
        return this.f955I;
    }

    /* renamed from: b */
    public void mo702b() {
        for (int i = 0; i < 6; i++) {
            this.f950D[i].f932a.mo760b();
        }
    }

    /* renamed from: d */
    public final boolean mo723d() {
        if (this.f993g == 0 && this.f956J == 0.0f && this.f996j == 0 && this.f997k == 0 && this.f952F[0] == C0335a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo725e() {
        if (this.f994h == 0 && this.f956J == 0.0f && this.f999m == 0 && this.f1000n == 0 && this.f952F[1] == C0335a.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public void mo740t() {
        int i = this.f958L;
        int i2 = this.f959M;
        int i3 = this.f958L + this.f954H;
        int i4 = this.f959M + this.f955I;
        this.f960N = i;
        this.f961O = i2;
        this.f962P = i3 - i;
        this.f963Q = i4 - i2;
    }

    /* renamed from: u */
    public final void mo742u() {
        int size = this.f951E.size();
        for (int i = 0; i < size; i++) {
            ((C0328d) this.f951E.get(i)).mo708b();
        }
    }

    /* renamed from: g */
    public final void mo727g() {
        for (int i = 0; i < 6; i++) {
            C0342k kVar = this.f950D[i].f932a;
            C0328d dVar = kVar.f1043a.f935d;
            if (dVar != null) {
                if (dVar.f935d == kVar.f1043a) {
                    kVar.f1049g = 4;
                    dVar.f932a.f1049g = 4;
                }
                int a = kVar.f1043a.mo705a();
                if (kVar.f1043a.f934c == C0332c.RIGHT || kVar.f1043a.f934c == C0332c.BOTTOM) {
                    a = -a;
                }
                kVar.mo757a(dVar.f932a, a);
            }
        }
    }

    /* renamed from: f */
    public void mo726f() {
        this.f1008v.mo708b();
        this.f1009w.mo708b();
        this.f1010x.mo708b();
        this.f1011y.mo708b();
        this.f1012z.mo708b();
        this.f947A.mo708b();
        this.f948B.mo708b();
        this.f949C.mo708b();
        this.f953G = null;
        this.f1007u = 0.0f;
        this.f954H = 0;
        this.f955I = 0;
        this.f956J = 0.0f;
        this.f957K = -1;
        this.f958L = 0;
        this.f959M = 0;
        this.f960N = 0;
        this.f961O = 0;
        this.f962P = 0;
        this.f963Q = 0;
        this.f964R = 0;
        this.f965S = 0;
        this.f966T = 0;
        this.f967U = 0;
        this.f968V = 0;
        this.f969W = 0;
        this.f970X = 0;
        this.f971Z = f946Y;
        this.f972aa = f946Y;
        this.f952F[0] = C0335a.FIXED;
        this.f952F[1] = C0335a.FIXED;
        this.f973ab = null;
        this.f974ac = 0;
        this.f975ad = 0;
        this.f977af = null;
        this.f978ag = false;
        this.f979ah = false;
        this.f980ai = 0;
        this.f981aj = 0;
        this.f982ak = false;
        this.f983al = false;
        this.f984am[0] = -1.0f;
        this.f984am[1] = -1.0f;
        this.f989c = -1;
        this.f990d = -1;
        this.f1006t[0] = Integer.MAX_VALUE;
        this.f1006t[1] = Integer.MAX_VALUE;
        this.f993g = 0;
        this.f994h = 0;
        this.f998l = 1.0f;
        this.f1001o = 1.0f;
        this.f997k = Integer.MAX_VALUE;
        this.f1000n = Integer.MAX_VALUE;
        this.f996j = 0;
        this.f999m = 0;
        this.f1004r = -1;
        this.f1005s = 1.0f;
        if (this.f991e != null) {
            this.f991e.mo760b();
        }
        if (this.f992f != null) {
            this.f992f.mo760b();
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f977af != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.f977af);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f976ae != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.f976ae);
            sb3.append(" ");
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f958L);
        sb.append(", ");
        sb.append(this.f959M);
        sb.append(") - (");
        sb.append(this.f954H);
        sb.append(" x ");
        sb.append(this.f955I);
        sb.append(") wrap: (");
        sb.append(this.f969W);
        sb.append(" x ");
        sb.append(this.f970X);
        sb.append(")");
        return sb.toString();
    }

    public C0333e() {
        this.f951E.add(this.f1008v);
        this.f951E.add(this.f1009w);
        this.f951E.add(this.f1010x);
        this.f951E.add(this.f1011y);
        this.f951E.add(this.f947A);
        this.f951E.add(this.f948B);
        this.f951E.add(this.f949C);
        this.f951E.add(this.f1012z);
    }

    /* renamed from: a */
    public boolean mo701a() {
        if (this.f975ad != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo699a(int i) {
        C0340i.m797a(i, this);
    }

    /* renamed from: a */
    public final void mo714a(C0335a aVar) {
        this.f952F[0] = aVar;
        if (aVar == C0335a.WRAP_CONTENT) {
            mo717b(this.f969W);
        }
    }

    /* renamed from: b */
    public final void mo717b(int i) {
        this.f954H = i;
        if (this.f954H < this.f967U) {
            this.f954H = this.f967U;
        }
    }

    /* renamed from: c */
    public final void mo720c(int i) {
        this.f955I = i;
        if (this.f955I < this.f968V) {
            this.f955I = this.f968V;
        }
    }

    /* renamed from: d */
    public final void mo722d(int i) {
        if (i < 0) {
            this.f967U = 0;
        } else {
            this.f967U = i;
        }
    }

    /* renamed from: e */
    public final void mo724e(int i) {
        if (i < 0) {
            this.f968V = 0;
        } else {
            this.f968V = i;
        }
    }

    /* renamed from: a */
    public void mo715a(C0349c cVar) {
        this.f1008v.mo706a(cVar);
        this.f1009w.mo706a(cVar);
        this.f1010x.mo706a(cVar);
        this.f1011y.mo706a(cVar);
        this.f1012z.mo706a(cVar);
        this.f949C.mo706a(cVar);
        this.f947A.mo706a(cVar);
        this.f948B.mo706a(cVar);
    }

    /* renamed from: b */
    public final void mo718b(C0335a aVar) {
        this.f952F[1] = aVar;
        if (aVar == C0335a.WRAP_CONTENT) {
            mo720c(this.f970X);
        }
    }

    /* renamed from: a */
    public C0328d mo711a(C0332c cVar) {
        switch (cVar) {
            case LEFT:
                return this.f1008v;
            case TOP:
                return this.f1009w;
            case RIGHT:
                return this.f1010x;
            case BOTTOM:
                return this.f1011y;
            case BASELINE:
                return this.f1012z;
            case CENTER:
                return this.f949C;
            case CENTER_X:
                return this.f947A;
            case CENTER_Y:
                return this.f948B;
            case NONE:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    /* renamed from: b */
    public final void mo719b(C0351e eVar) {
        eVar.mo788a((Object) this.f1008v);
        eVar.mo788a((Object) this.f1009w);
        eVar.mo788a((Object) this.f1010x);
        eVar.mo788a((Object) this.f1011y);
        if (this.f966T > 0) {
            eVar.mo788a((Object) this.f1012z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo716a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f956J = r9
            r8.f957K = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f956J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0333e.mo716a(java.lang.String):void");
    }

    /* renamed from: c */
    public void mo721c(C0351e eVar) {
        int b = C0351e.m846b((Object) this.f1008v);
        int b2 = C0351e.m846b((Object) this.f1009w);
        int b3 = C0351e.m846b((Object) this.f1010x);
        int b4 = C0351e.m846b((Object) this.f1011y);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i2 = b3 - b;
        int i3 = b4 - b2;
        this.f958L = b;
        this.f959M = b2;
        if (this.f975ad == 8) {
            this.f954H = 0;
            this.f955I = 0;
            return;
        }
        if (this.f952F[0] == C0335a.FIXED && i2 < this.f954H) {
            i2 = this.f954H;
        }
        if (this.f952F[1] == C0335a.FIXED && i3 < this.f955I) {
            i3 = this.f955I;
        }
        this.f954H = i2;
        this.f955I = i3;
        if (this.f955I < this.f968V) {
            this.f955I = this.f968V;
        }
        if (this.f954H < this.f967U) {
            this.f954H = this.f967U;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x030b, code lost:
        if (r15.f1004r == -1) goto L_0x030f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0492  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo700a(android.support.constraint.p020a.C0351e r41) {
        /*
            r40 = this;
            r15 = r40
            r14 = r41
            android.support.constraint.a.a.d r0 = r15.f1008v
            android.support.constraint.a.h r21 = r14.mo788a(r0)
            android.support.constraint.a.a.d r0 = r15.f1010x
            android.support.constraint.a.h r10 = r14.mo788a(r0)
            android.support.constraint.a.a.d r0 = r15.f1009w
            android.support.constraint.a.h r6 = r14.mo788a(r0)
            android.support.constraint.a.a.d r0 = r15.f1011y
            android.support.constraint.a.h r4 = r14.mo788a(r0)
            android.support.constraint.a.a.d r0 = r15.f1012z
            android.support.constraint.a.h r3 = r14.mo788a(r0)
            android.support.constraint.a.a.e r0 = r15.f953G
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0127
            android.support.constraint.a.a.e r0 = r15.f953G
            if (r0 == 0) goto L_0x003a
            android.support.constraint.a.a.e r0 = r15.f953G
            android.support.constraint.a.a.e$a[] r0 = r0.f952F
            r0 = r0[r13]
            android.support.constraint.a.a.e$a r5 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r0 != r5) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            android.support.constraint.a.a.e r5 = r15.f953G
            if (r5 == 0) goto L_0x004b
            android.support.constraint.a.a.e r5 = r15.f953G
            android.support.constraint.a.a.e$a[] r5 = r5.f952F
            r5 = r5[r2]
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r5 != r7) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            android.support.constraint.a.a.d r7 = r15.f1008v
            android.support.constraint.a.a.d r7 = r7.f935d
            if (r7 == 0) goto L_0x0073
            android.support.constraint.a.a.d r7 = r15.f1008v
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r8 = r15.f1008v
            if (r7 == r8) goto L_0x0073
            android.support.constraint.a.a.d r7 = r15.f1010x
            android.support.constraint.a.a.d r7 = r7.f935d
            if (r7 == 0) goto L_0x0073
            android.support.constraint.a.a.d r7 = r15.f1010x
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r8 = r15.f1010x
            if (r7 != r8) goto L_0x0073
            android.support.constraint.a.a.e r7 = r15.f953G
            android.support.constraint.a.a.f r7 = (android.support.constraint.p020a.p021a.C0336f) r7
            r7.mo745a(r15, r13)
        L_0x0073:
            android.support.constraint.a.a.d r7 = r15.f1008v
            android.support.constraint.a.a.d r7 = r7.f935d
            if (r7 == 0) goto L_0x0083
            android.support.constraint.a.a.d r7 = r15.f1008v
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r8 = r15.f1008v
            if (r7 == r8) goto L_0x0093
        L_0x0083:
            android.support.constraint.a.a.d r7 = r15.f1010x
            android.support.constraint.a.a.d r7 = r7.f935d
            if (r7 == 0) goto L_0x0095
            android.support.constraint.a.a.d r7 = r15.f1010x
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r7 = r7.f935d
            android.support.constraint.a.a.d r8 = r15.f1010x
            if (r7 != r8) goto L_0x0095
        L_0x0093:
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            android.support.constraint.a.a.d r8 = r15.f1009w
            android.support.constraint.a.a.d r8 = r8.f935d
            if (r8 == 0) goto L_0x00bd
            android.support.constraint.a.a.d r8 = r15.f1009w
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r9 = r15.f1009w
            if (r8 == r9) goto L_0x00bd
            android.support.constraint.a.a.d r8 = r15.f1011y
            android.support.constraint.a.a.d r8 = r8.f935d
            if (r8 == 0) goto L_0x00bd
            android.support.constraint.a.a.d r8 = r15.f1011y
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r9 = r15.f1011y
            if (r8 != r9) goto L_0x00bd
            android.support.constraint.a.a.e r8 = r15.f953G
            android.support.constraint.a.a.f r8 = (android.support.constraint.p020a.p021a.C0336f) r8
            r8.mo745a(r15, r2)
        L_0x00bd:
            android.support.constraint.a.a.d r8 = r15.f1009w
            android.support.constraint.a.a.d r8 = r8.f935d
            if (r8 == 0) goto L_0x00cd
            android.support.constraint.a.a.d r8 = r15.f1009w
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r9 = r15.f1009w
            if (r8 == r9) goto L_0x00dd
        L_0x00cd:
            android.support.constraint.a.a.d r8 = r15.f1011y
            android.support.constraint.a.a.d r8 = r8.f935d
            if (r8 == 0) goto L_0x00df
            android.support.constraint.a.a.d r8 = r15.f1011y
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r8 = r8.f935d
            android.support.constraint.a.a.d r9 = r15.f1011y
            if (r8 != r9) goto L_0x00df
        L_0x00dd:
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r0 == 0) goto L_0x00fd
            int r9 = r15.f975ad
            if (r9 == r1) goto L_0x00fd
            android.support.constraint.a.a.d r9 = r15.f1008v
            android.support.constraint.a.a.d r9 = r9.f935d
            if (r9 != 0) goto L_0x00fd
            android.support.constraint.a.a.d r9 = r15.f1010x
            android.support.constraint.a.a.d r9 = r9.f935d
            if (r9 != 0) goto L_0x00fd
            android.support.constraint.a.a.e r9 = r15.f953G
            android.support.constraint.a.a.d r9 = r9.f1010x
            android.support.constraint.a.h r9 = r14.mo788a(r9)
            r14.mo794a(r9, r10, r13, r2)
        L_0x00fd:
            if (r5 == 0) goto L_0x011e
            int r9 = r15.f975ad
            if (r9 == r1) goto L_0x011e
            android.support.constraint.a.a.d r9 = r15.f1009w
            android.support.constraint.a.a.d r9 = r9.f935d
            if (r9 != 0) goto L_0x011e
            android.support.constraint.a.a.d r9 = r15.f1011y
            android.support.constraint.a.a.d r9 = r9.f935d
            if (r9 != 0) goto L_0x011e
            android.support.constraint.a.a.d r9 = r15.f1012z
            if (r9 != 0) goto L_0x011e
            android.support.constraint.a.a.e r9 = r15.f953G
            android.support.constraint.a.a.d r9 = r9.f1011y
            android.support.constraint.a.h r9 = r14.mo788a(r9)
            r14.mo794a(r9, r4, r13, r2)
        L_0x011e:
            r16 = r0
            r22 = r5
            r20 = r7
            r23 = r8
            goto L_0x012f
        L_0x0127:
            r16 = 0
            r20 = 0
            r22 = 0
            r23 = 0
        L_0x012f:
            int r0 = r15.f954H
            int r5 = r15.f967U
            if (r0 >= r5) goto L_0x0137
            int r0 = r15.f967U
        L_0x0137:
            int r5 = r15.f955I
            int r7 = r15.f968V
            if (r5 >= r7) goto L_0x013f
            int r5 = r15.f968V
        L_0x013f:
            android.support.constraint.a.a.e$a[] r7 = r15.f952F
            r7 = r7[r13]
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r7 == r8) goto L_0x0149
            r7 = 1
            goto L_0x014a
        L_0x0149:
            r7 = 0
        L_0x014a:
            android.support.constraint.a.a.e$a[] r8 = r15.f952F
            r8 = r8[r2]
            android.support.constraint.a.a.e$a r9 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x0154
            r8 = 1
            goto L_0x0155
        L_0x0154:
            r8 = 0
        L_0x0155:
            int r9 = r15.f957K
            r15.f1004r = r9
            float r9 = r15.f956J
            r15.f1005s = r9
            int r9 = r15.f993g
            int r11 = r15.f994h
            float r12 = r15.f956J
            r17 = 0
            r18 = 4
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 <= 0) goto L_0x02ef
            int r12 = r15.f975ad
            if (r12 == r1) goto L_0x02ef
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r1 = r1[r13]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            r2 = 3
            if (r1 != r12) goto L_0x017b
            if (r9 != 0) goto L_0x017b
            r9 = 3
        L_0x017b:
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r12 = 1
            r1 = r1[r12]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r1 != r12) goto L_0x0187
            if (r11 != 0) goto L_0x0187
            r11 = 3
        L_0x0187:
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r1 = r1[r13]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r12) goto L_0x0288
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r12 = 1
            r1 = r1[r12]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r1 != r12) goto L_0x0288
            if (r9 != r2) goto L_0x0288
            if (r11 != r2) goto L_0x0288
            int r1 = r15.f1004r
            r2 = -1
            if (r1 != r2) goto L_0x01bb
            if (r7 == 0) goto L_0x01aa
            if (r8 != 0) goto L_0x01aa
            r15.f1004r = r13
            goto L_0x01bb
        L_0x01aa:
            if (r7 != 0) goto L_0x01bb
            if (r8 == 0) goto L_0x01bb
            r1 = 1
            r15.f1004r = r1
            int r1 = r15.f957K
            if (r1 != r2) goto L_0x01bb
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
        L_0x01bb:
            int r1 = r15.f1004r
            if (r1 != 0) goto L_0x01d3
            android.support.constraint.a.a.d r1 = r15.f1009w
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x01cf
            android.support.constraint.a.a.d r1 = r15.f1011y
            boolean r1 = r1.mo709c()
            if (r1 != 0) goto L_0x01d3
        L_0x01cf:
            r1 = 1
            r15.f1004r = r1
            goto L_0x01ea
        L_0x01d3:
            r1 = 1
            int r2 = r15.f1004r
            if (r2 != r1) goto L_0x01ea
            android.support.constraint.a.a.d r1 = r15.f1008v
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x01e8
            android.support.constraint.a.a.d r1 = r15.f1010x
            boolean r1 = r1.mo709c()
            if (r1 != 0) goto L_0x01ea
        L_0x01e8:
            r15.f1004r = r13
        L_0x01ea:
            int r1 = r15.f1004r
            r2 = -1
            if (r1 != r2) goto L_0x023b
            android.support.constraint.a.a.d r1 = r15.f1009w
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x020f
            android.support.constraint.a.a.d r1 = r15.f1011y
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x020f
            android.support.constraint.a.a.d r1 = r15.f1008v
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x020f
            android.support.constraint.a.a.d r1 = r15.f1010x
            boolean r1 = r1.mo709c()
            if (r1 != 0) goto L_0x023b
        L_0x020f:
            android.support.constraint.a.a.d r1 = r15.f1009w
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x0222
            android.support.constraint.a.a.d r1 = r15.f1011y
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x0222
            r15.f1004r = r13
            goto L_0x023b
        L_0x0222:
            android.support.constraint.a.a.d r1 = r15.f1008v
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x023b
            android.support.constraint.a.a.d r1 = r15.f1010x
            boolean r1 = r1.mo709c()
            if (r1 == 0) goto L_0x023b
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
            r1 = 1
            r15.f1004r = r1
        L_0x023b:
            int r1 = r15.f1004r
            r2 = -1
            if (r1 != r2) goto L_0x0254
            if (r16 == 0) goto L_0x0247
            if (r22 != 0) goto L_0x0247
            r15.f1004r = r13
            goto L_0x0254
        L_0x0247:
            if (r16 != 0) goto L_0x0254
            if (r22 == 0) goto L_0x0254
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
            r1 = 1
            r15.f1004r = r1
        L_0x0254:
            int r1 = r15.f1004r
            r2 = -1
            if (r1 != r2) goto L_0x0275
            int r1 = r15.f996j
            if (r1 <= 0) goto L_0x0264
            int r1 = r15.f999m
            if (r1 != 0) goto L_0x0264
            r15.f1004r = r13
            goto L_0x0275
        L_0x0264:
            int r1 = r15.f996j
            if (r1 != 0) goto L_0x0275
            int r1 = r15.f999m
            if (r1 <= 0) goto L_0x0275
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
            r1 = 1
            r15.f1004r = r1
        L_0x0275:
            int r1 = r15.f1004r
            r2 = -1
            if (r1 != r2) goto L_0x02e4
            if (r16 == 0) goto L_0x02e4
            if (r22 == 0) goto L_0x02e4
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
            r1 = 1
            r15.f1004r = r1
            goto L_0x02e4
        L_0x0288:
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r1 = r1[r13]
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x02ae
            if (r9 != r2) goto L_0x02ae
            r15.f1004r = r13
            float r0 = r15.f1005s
            int r1 = r15.f955I
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r7 = 1
            r1 = r1[r7]
            android.support.constraint.a.a.e$a r2 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r1 == r2) goto L_0x02e4
            r29 = r0
            r30 = r5
            r27 = r11
            r26 = 4
            goto L_0x02f7
        L_0x02ae:
            r7 = 1
            android.support.constraint.a.a.e$a[] r1 = r15.f952F
            r1 = r1[r7]
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r1 != r8) goto L_0x02e4
            if (r11 != r2) goto L_0x02e4
            r15.f1004r = r7
            int r1 = r15.f957K
            r2 = -1
            if (r1 != r2) goto L_0x02c6
            float r1 = r15.f1005s
            float r1 = r17 / r1
            r15.f1005s = r1
        L_0x02c6:
            float r1 = r15.f1005s
            int r2 = r15.f954H
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            android.support.constraint.a.a.e$a[] r2 = r15.f952F
            r2 = r2[r13]
            android.support.constraint.a.a.e$a r5 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r2 == r5) goto L_0x02df
            r29 = r0
            r30 = r1
            r26 = r9
            r27 = 4
            goto L_0x02f7
        L_0x02df:
            r29 = r0
            r30 = r1
            goto L_0x02e8
        L_0x02e4:
            r29 = r0
            r30 = r5
        L_0x02e8:
            r26 = r9
            r27 = r11
            r28 = 1
            goto L_0x02f9
        L_0x02ef:
            r29 = r0
            r30 = r5
            r26 = r9
            r27 = r11
        L_0x02f7:
            r28 = 0
        L_0x02f9:
            int[] r0 = r15.f995i
            r0[r13] = r26
            int[] r0 = r15.f995i
            r1 = 1
            r0[r1] = r27
            if (r28 == 0) goto L_0x0312
            int r0 = r15.f1004r
            if (r0 == 0) goto L_0x030e
            int r0 = r15.f1004r
            r2 = -1
            if (r0 != r2) goto L_0x0313
            goto L_0x030f
        L_0x030e:
            r2 = -1
        L_0x030f:
            r25 = 1
            goto L_0x0315
        L_0x0312:
            r2 = -1
        L_0x0313:
            r25 = 0
        L_0x0315:
            android.support.constraint.a.a.e$a[] r0 = r15.f952F
            r0 = r0[r13]
            android.support.constraint.a.a.e$a r1 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r0 != r1) goto L_0x0324
            boolean r0 = r15 instanceof android.support.constraint.p020a.p021a.C0336f
            if (r0 == 0) goto L_0x0324
            r31 = 1
            goto L_0x0326
        L_0x0324:
            r31 = 0
        L_0x0326:
            android.support.constraint.a.a.d r0 = r15.f949C
            boolean r0 = r0.mo709c()
            r24 = 1
            r32 = r0 ^ 1
            int r0 = r15.f989c
            r1 = 2
            r33 = 0
            if (r0 == r1) goto L_0x039a
            android.support.constraint.a.a.e r0 = r15.f953G
            if (r0 == 0) goto L_0x0346
            android.support.constraint.a.a.e r0 = r15.f953G
            android.support.constraint.a.a.d r0 = r0.f1010x
            android.support.constraint.a.h r0 = r14.mo788a(r0)
            r34 = r0
            goto L_0x0348
        L_0x0346:
            r34 = r33
        L_0x0348:
            android.support.constraint.a.a.e r0 = r15.f953G
            if (r0 == 0) goto L_0x0357
            android.support.constraint.a.a.e r0 = r15.f953G
            android.support.constraint.a.a.d r0 = r0.f1008v
            android.support.constraint.a.h r0 = r14.mo788a(r0)
            r35 = r0
            goto L_0x0359
        L_0x0357:
            r35 = r33
        L_0x0359:
            android.support.constraint.a.a.e$a[] r0 = r15.f952F
            r5 = r0[r13]
            android.support.constraint.a.a.d r7 = r15.f1008v
            android.support.constraint.a.a.d r8 = r15.f1010x
            int r9 = r15.f958L
            int r11 = r15.f967U
            int[] r0 = r15.f1006t
            r12 = r0[r13]
            float r0 = r15.f971Z
            r13 = r0
            int r0 = r15.f996j
            r17 = r0
            int r0 = r15.f997k
            r18 = r0
            float r0 = r15.f998l
            r19 = r0
            r0 = r40
            r1 = r41
            r2 = r16
            r36 = r3
            r3 = r35
            r24 = r4
            r4 = r34
            r37 = r6
            r6 = r31
            r31 = r10
            r10 = r29
            r14 = r25
            r15 = r20
            r16 = r26
            r20 = r32
            r0.m738a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x03a2
        L_0x039a:
            r36 = r3
            r24 = r4
            r37 = r6
            r31 = r10
        L_0x03a2:
            r15 = r40
            int r0 = r15.f990d
            r1 = 2
            if (r0 != r1) goto L_0x03aa
            return
        L_0x03aa:
            android.support.constraint.a.a.e$a[] r0 = r15.f952F
            r14 = 1
            r0 = r0[r14]
            android.support.constraint.a.a.e$a r1 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r0 != r1) goto L_0x03b9
            boolean r0 = r15 instanceof android.support.constraint.p020a.p021a.C0336f
            if (r0 == 0) goto L_0x03b9
            r6 = 1
            goto L_0x03ba
        L_0x03b9:
            r6 = 0
        L_0x03ba:
            if (r28 == 0) goto L_0x03c8
            int r0 = r15.f1004r
            if (r0 == r14) goto L_0x03c5
            int r0 = r15.f1004r
            r1 = -1
            if (r0 != r1) goto L_0x03c8
        L_0x03c5:
            r16 = 1
            goto L_0x03ca
        L_0x03c8:
            r16 = 0
        L_0x03ca:
            int r0 = r15.f966T
            if (r0 <= 0) goto L_0x0403
            android.support.constraint.a.a.d r0 = r15.f1012z
            android.support.constraint.a.a.k r0 = r0.f932a
            int r0 = r0.f1058i
            if (r0 != r14) goto L_0x03e2
            android.support.constraint.a.a.d r0 = r15.f1012z
            android.support.constraint.a.a.k r0 = r0.f932a
            r10 = r41
            r0.mo759a(r10)
            r4 = r37
            goto L_0x0407
        L_0x03e2:
            r10 = r41
            int r0 = r15.f966T
            r1 = 6
            r2 = r36
            r4 = r37
            r10.mo799c(r2, r4, r0, r1)
            android.support.constraint.a.a.d r0 = r15.f1012z
            android.support.constraint.a.a.d r0 = r0.f935d
            if (r0 == 0) goto L_0x0407
            android.support.constraint.a.a.d r0 = r15.f1012z
            android.support.constraint.a.a.d r0 = r0.f935d
            android.support.constraint.a.h r0 = r10.mo788a(r0)
            r3 = 0
            r10.mo799c(r2, r0, r3, r1)
            r20 = 0
            goto L_0x0409
        L_0x0403:
            r4 = r37
            r10 = r41
        L_0x0407:
            r20 = r32
        L_0x0409:
            android.support.constraint.a.a.e r0 = r15.f953G
            if (r0 == 0) goto L_0x0418
            android.support.constraint.a.a.e r0 = r15.f953G
            android.support.constraint.a.a.d r0 = r0.f1011y
            android.support.constraint.a.h r0 = r10.mo788a(r0)
            r25 = r0
            goto L_0x041a
        L_0x0418:
            r25 = r33
        L_0x041a:
            android.support.constraint.a.a.e r0 = r15.f953G
            if (r0 == 0) goto L_0x0428
            android.support.constraint.a.a.e r0 = r15.f953G
            android.support.constraint.a.a.d r0 = r0.f1009w
            android.support.constraint.a.h r0 = r10.mo788a(r0)
            r3 = r0
            goto L_0x042a
        L_0x0428:
            r3 = r33
        L_0x042a:
            android.support.constraint.a.a.e$a[] r0 = r15.f952F
            r5 = r0[r14]
            android.support.constraint.a.a.d r7 = r15.f1009w
            android.support.constraint.a.a.d r8 = r15.f1011y
            int r9 = r15.f959M
            int r11 = r15.f968V
            int[] r0 = r15.f1006t
            r12 = r0[r14]
            float r13 = r15.f972aa
            int r0 = r15.f999m
            r17 = r0
            int r0 = r15.f1000n
            r18 = r0
            float r0 = r15.f1001o
            r19 = r0
            r0 = r40
            r1 = r41
            r2 = r22
            r22 = r4
            r4 = r25
            r10 = r30
            r14 = r16
            r15 = r23
            r16 = r27
            r0.m738a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r28 == 0) goto L_0x0488
            r7 = r40
            int r0 = r7.f1004r
            r1 = 1
            if (r0 != r1) goto L_0x0477
            float r5 = r7.f1005s
            r6 = 6
            r0 = r41
            r1 = r24
            r2 = r22
            r3 = r31
            r4 = r21
            r0.mo795a(r1, r2, r3, r4, r5, r6)
            goto L_0x048a
        L_0x0477:
            float r5 = r7.f1005s
            r6 = 6
            r0 = r41
            r1 = r31
            r2 = r21
            r3 = r24
            r4 = r22
            r0.mo795a(r1, r2, r3, r4, r5, r6)
            goto L_0x048a
        L_0x0488:
            r7 = r40
        L_0x048a:
            android.support.constraint.a.a.d r0 = r7.f949C
            boolean r0 = r0.mo709c()
            if (r0 == 0) goto L_0x0530
            android.support.constraint.a.a.d r0 = r7.f949C
            android.support.constraint.a.a.d r0 = r0.f935d
            android.support.constraint.a.a.e r0 = r0.f933b
            float r1 = r7.f1007u
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            android.support.constraint.a.a.d r2 = r7.f949C
            int r2 = r2.mo705a()
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r3 = r7.mo711a(r3)
            r4 = r41
            android.support.constraint.a.h r9 = r4.mo788a(r3)
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r3 = r7.mo711a(r3)
            android.support.constraint.a.h r11 = r4.mo788a(r3)
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r3 = r7.mo711a(r3)
            android.support.constraint.a.h r3 = r4.mo788a(r3)
            android.support.constraint.a.a.d$c r5 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r5 = r7.mo711a(r5)
            android.support.constraint.a.h r12 = r4.mo788a(r5)
            android.support.constraint.a.a.d$c r5 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r5 = r0.mo711a(r5)
            android.support.constraint.a.h r5 = r4.mo788a(r5)
            android.support.constraint.a.a.d$c r6 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r6 = r0.mo711a(r6)
            android.support.constraint.a.h r13 = r4.mo788a(r6)
            android.support.constraint.a.a.d$c r6 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r6 = r0.mo711a(r6)
            android.support.constraint.a.h r6 = r4.mo788a(r6)
            android.support.constraint.a.a.d$c r8 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r0 = r0.mo711a(r8)
            android.support.constraint.a.h r14 = r4.mo788a(r0)
            android.support.constraint.a.b r0 = r41.mo798c()
            double r7 = (double) r1
            double r15 = java.lang.Math.sin(r7)
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            r38 = r5
            r39 = r6
            double r5 = r15 * r1
            float r15 = (float) r5
            r10 = r0
            r10.mo782b(r11, r12, r13, r14, r15)
            r4.mo789a(r0)
            android.support.constraint.a.b r0 = r41.mo798c()
            double r5 = java.lang.Math.cos(r7)
            java.lang.Double.isNaN(r1)
            double r5 = r5 * r1
            float r13 = (float) r5
            r8 = r0
            r10 = r3
            r11 = r38
            r12 = r39
            r8.mo782b(r9, r10, r11, r12, r13)
            r4.mo789a(r0)
        L_0x0530:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0333e.mo700a(android.support.constraint.a.e):void");
    }

    /* renamed from: a */
    public void mo712a(int i, int i2) {
        this.f964R = i;
        this.f965S = i2;
    }

    /* renamed from: a */
    public final void mo713a(C0332c cVar, C0333e eVar, C0332c cVar2, int i, int i2) {
        mo711a(cVar).mo707a(eVar.mo711a(cVar2), i, i2, C0331b.STRONG, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m738a(android.support.constraint.p020a.C0351e r33, boolean r34, android.support.constraint.p020a.C0357h r35, android.support.constraint.p020a.C0357h r36, android.support.constraint.p020a.p021a.C0333e.C0335a r37, boolean r38, android.support.constraint.p020a.p021a.C0328d r39, android.support.constraint.p020a.p021a.C0328d r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
            r32 = this;
            r0 = r32
            r10 = r33
            r11 = r35
            r12 = r36
            r13 = r39
            r14 = r40
            r1 = r43
            r2 = r44
            android.support.constraint.a.h r9 = r10.mo788a(r13)
            android.support.constraint.a.h r8 = r10.mo788a(r14)
            android.support.constraint.a.a.d r6 = r13.f935d
            android.support.constraint.a.h r7 = r10.mo788a(r6)
            android.support.constraint.a.a.d r6 = r14.f935d
            android.support.constraint.a.h r6 = r10.mo788a(r6)
            boolean r11 = r10.f1083d
            r15 = 1
            r21 = r6
            if (r11 == 0) goto L_0x005c
            android.support.constraint.a.a.k r11 = r13.f932a
            int r11 = r11.f1058i
            r6 = 1
            if (r11 != r6) goto L_0x005c
            android.support.constraint.a.a.k r11 = r14.f932a
            int r11 = r11.f1058i
            if (r11 != r6) goto L_0x005c
            android.support.constraint.a.f r1 = android.support.constraint.p020a.C0351e.m843a()
            if (r1 == 0) goto L_0x0048
            android.support.constraint.a.f r1 = android.support.constraint.p020a.C0351e.m843a()
            long r2 = r1.f1118s
            long r2 = r2 + r15
            r1.f1118s = r2
        L_0x0048:
            android.support.constraint.a.a.k r1 = r13.f932a
            r1.mo759a(r10)
            android.support.constraint.a.a.k r1 = r14.f932a
            r1.mo759a(r10)
            if (r47 != 0) goto L_0x005b
            if (r34 == 0) goto L_0x005b
            r1 = 0
            r2 = 6
            r10.mo794a(r12, r8, r1, r2)
        L_0x005b:
            return
        L_0x005c:
            android.support.constraint.a.f r6 = android.support.constraint.p020a.C0351e.m843a()
            if (r6 == 0) goto L_0x006b
            android.support.constraint.a.f r6 = android.support.constraint.p020a.C0351e.m843a()
            long r11 = r6.f1097B
            long r11 = r11 + r15
            r6.f1097B = r11
        L_0x006b:
            boolean r6 = r39.mo709c()
            boolean r11 = r40.mo709c()
            android.support.constraint.a.a.d r12 = r0.f949C
            boolean r12 = r12.mo709c()
            if (r6 == 0) goto L_0x007d
            r15 = 1
            goto L_0x007e
        L_0x007d:
            r15 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x0082
            int r15 = r15 + 1
        L_0x0082:
            if (r12 == 0) goto L_0x0086
            int r15 = r15 + 1
        L_0x0086:
            r23 = r15
            if (r46 == 0) goto L_0x008c
            r14 = 3
            goto L_0x008e
        L_0x008c:
            r14 = r48
        L_0x008e:
            int[] r15 = android.support.constraint.p020a.p021a.C0333e.C03341.f1014b
            int r16 = r37.ordinal()
            r15 = r15[r16]
            r3 = 4
            switch(r15) {
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            r15 = 0
            goto L_0x00a0
        L_0x009c:
            if (r14 != r3) goto L_0x009f
            goto L_0x009a
        L_0x009f:
            r15 = 1
        L_0x00a0:
            int r3 = r0.f975ad
            r0 = 8
            if (r3 != r0) goto L_0x00a9
            r0 = 0
            r15 = 0
            goto L_0x00ab
        L_0x00a9:
            r0 = r42
        L_0x00ab:
            if (r52 == 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00b9
            if (r11 != 0) goto L_0x00b9
            if (r12 != 0) goto L_0x00b9
            r3 = r41
            r10.mo792a(r9, r3)
            goto L_0x00c8
        L_0x00b9:
            if (r6 == 0) goto L_0x00c8
            if (r11 != 0) goto L_0x00c8
            int r3 = r39.mo705a()
            r24 = r12
            r12 = 6
            r10.mo799c(r9, r7, r3, r12)
            goto L_0x00cb
        L_0x00c8:
            r24 = r12
            r12 = 6
        L_0x00cb:
            if (r15 != 0) goto L_0x00f7
            if (r38 == 0) goto L_0x00e5
            r3 = 0
            r12 = 3
            r10.mo799c(r8, r9, r3, r12)
            if (r1 <= 0) goto L_0x00db
            r3 = 6
            r10.mo794a(r8, r9, r1, r3)
            goto L_0x00dc
        L_0x00db:
            r3 = 6
        L_0x00dc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x00e9
            r10.mo797b(r8, r9, r2, r3)
            goto L_0x00e9
        L_0x00e5:
            r3 = 6
            r10.mo799c(r8, r9, r0, r3)
        L_0x00e9:
            r28 = r49
            r12 = r50
            r25 = r7
            r2 = r23
            r7 = r32
        L_0x00f3:
            r16 = 4
            goto L_0x01d0
        L_0x00f7:
            r3 = 6
            r2 = -2
            r12 = r49
            if (r12 != r2) goto L_0x0101
            r12 = r50
            r3 = r0
            goto L_0x0104
        L_0x0101:
            r3 = r12
            r12 = r50
        L_0x0104:
            if (r12 != r2) goto L_0x0107
            r12 = r0
        L_0x0107:
            if (r3 <= 0) goto L_0x0112
            r2 = 6
            r10.mo794a(r8, r9, r3, r2)
            int r0 = java.lang.Math.max(r0, r3)
            goto L_0x0113
        L_0x0112:
            r2 = 6
        L_0x0113:
            if (r12 <= 0) goto L_0x0124
            if (r34 == 0) goto L_0x011d
            r2 = 1
            r10.mo797b(r8, r9, r12, r2)
            r2 = 6
            goto L_0x0120
        L_0x011d:
            r10.mo797b(r8, r9, r12, r2)
        L_0x0120:
            int r0 = java.lang.Math.min(r0, r12)
        L_0x0124:
            r2 = 1
            if (r14 != r2) goto L_0x013c
            if (r34 == 0) goto L_0x012f
            r2 = 6
            r10.mo799c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x012f:
            if (r47 == 0) goto L_0x0137
            r2 = 4
            r10.mo799c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x0137:
            r2 = 1
            r10.mo799c(r8, r9, r0, r2)
            goto L_0x01a2
        L_0x013c:
            r2 = 2
            if (r14 != r2) goto L_0x01a2
            android.support.constraint.a.a.d$c r2 = r13.f934c
            r25 = r7
            android.support.constraint.a.a.d$c r7 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            if (r2 == r7) goto L_0x016f
            android.support.constraint.a.a.d$c r2 = r13.f934c
            android.support.constraint.a.a.d$c r7 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            if (r2 != r7) goto L_0x014e
            goto L_0x016f
        L_0x014e:
            r7 = r32
            android.support.constraint.a.a.e r2 = r7.f953G
            android.support.constraint.a.a.d$c r13 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r2 = r2.mo711a(r13)
            android.support.constraint.a.h r2 = r10.mo788a(r2)
            android.support.constraint.a.a.e r13 = r7.f953G
            r26 = r2
            android.support.constraint.a.a.d$c r2 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r2 = r13.mo711a(r2)
            android.support.constraint.a.h r2 = r10.mo788a(r2)
            r18 = r2
            r19 = r26
            goto L_0x018f
        L_0x016f:
            r7 = r32
            android.support.constraint.a.a.e r2 = r7.f953G
            android.support.constraint.a.a.d$c r13 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r2 = r2.mo711a(r13)
            android.support.constraint.a.h r2 = r10.mo788a(r2)
            android.support.constraint.a.a.e r13 = r7.f953G
            r27 = r2
            android.support.constraint.a.a.d$c r2 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r2 = r13.mo711a(r2)
            android.support.constraint.a.h r2 = r10.mo788a(r2)
            r18 = r2
            r19 = r27
        L_0x018f:
            android.support.constraint.a.b r15 = r33.mo798c()
            r16 = r8
            r17 = r9
            r20 = r51
            android.support.constraint.a.b r2 = r15.mo776a(r16, r17, r18, r19, r20)
            r10.mo789a(r2)
            r15 = 0
            goto L_0x01a6
        L_0x01a2:
            r25 = r7
            r7 = r32
        L_0x01a6:
            if (r15 == 0) goto L_0x01ca
            r2 = r23
            r13 = 2
            if (r2 == r13) goto L_0x01c6
            r16 = 4
            if (r46 != 0) goto L_0x01c3
            int r0 = java.lang.Math.max(r3, r0)
            if (r12 <= 0) goto L_0x01bb
            int r0 = java.lang.Math.min(r12, r0)
        L_0x01bb:
            r28 = r3
            r3 = 6
            r10.mo799c(r8, r9, r0, r3)
            r15 = 0
            goto L_0x01d0
        L_0x01c3:
            r28 = r3
            goto L_0x01d0
        L_0x01c6:
            r28 = r3
            goto L_0x00f3
        L_0x01ca:
            r28 = r3
            r2 = r23
            goto L_0x00f3
        L_0x01d0:
            if (r52 == 0) goto L_0x02e5
            if (r47 == 0) goto L_0x01d6
            goto L_0x02e5
        L_0x01d6:
            r0 = 5
            if (r6 != 0) goto L_0x01ed
            if (r11 != 0) goto L_0x01ed
            if (r24 != 0) goto L_0x01ed
            if (r34 == 0) goto L_0x01e6
            r4 = 0
            r5 = r36
            r10.mo794a(r5, r8, r4, r0)
            goto L_0x01e8
        L_0x01e6:
            r5 = r36
        L_0x01e8:
            r13 = r8
            r1 = 6
        L_0x01ea:
            r3 = 0
            goto L_0x02dc
        L_0x01ed:
            r4 = 0
            r5 = r36
            if (r6 == 0) goto L_0x01fa
            if (r11 != 0) goto L_0x01fa
            if (r34 == 0) goto L_0x01e8
            r10.mo794a(r5, r8, r4, r0)
            goto L_0x01e8
        L_0x01fa:
            if (r6 != 0) goto L_0x0211
            if (r11 == 0) goto L_0x0211
            int r1 = r40.mo705a()
            int r1 = -r1
            r3 = r21
            r2 = 6
            r10.mo799c(r8, r3, r1, r2)
            if (r34 == 0) goto L_0x01e8
            r2 = r35
            r10.mo794a(r9, r2, r4, r0)
            goto L_0x01e8
        L_0x0211:
            r3 = r21
            r2 = r35
            if (r6 == 0) goto L_0x01e8
            if (r11 == 0) goto L_0x01e8
            if (r15 == 0) goto L_0x027c
            if (r34 == 0) goto L_0x0224
            if (r1 != 0) goto L_0x0224
            r6 = 6
            r10.mo794a(r8, r9, r4, r6)
            goto L_0x0225
        L_0x0224:
            r6 = 6
        L_0x0225:
            if (r14 != 0) goto L_0x0251
            if (r12 > 0) goto L_0x022f
            if (r28 <= 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            r1 = 6
            r11 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 4
            r11 = 1
        L_0x0231:
            int r13 = r39.mo705a()
            r14 = r25
            r10.mo799c(r9, r14, r13, r1)
            int r13 = r40.mo705a()
            int r13 = -r13
            r10.mo799c(r8, r3, r13, r1)
            if (r12 > 0) goto L_0x024a
            if (r28 <= 0) goto L_0x0247
            goto L_0x024a
        L_0x0247:
            r22 = 0
            goto L_0x024c
        L_0x024a:
            r22 = 1
        L_0x024c:
            r12 = r11
            r11 = r14
            r29 = r22
            goto L_0x0293
        L_0x0251:
            r11 = r25
            r1 = 1
            if (r14 != r1) goto L_0x0259
            r0 = 6
        L_0x0257:
            r12 = 1
            goto L_0x0291
        L_0x0259:
            r1 = 3
            if (r14 != r1) goto L_0x0278
            if (r46 != 0) goto L_0x0267
            int r1 = r7.f1004r
            r13 = -1
            if (r1 == r13) goto L_0x0267
            if (r12 > 0) goto L_0x0267
            r1 = 6
            goto L_0x0268
        L_0x0267:
            r1 = 4
        L_0x0268:
            int r12 = r39.mo705a()
            r10.mo799c(r9, r11, r12, r1)
            int r12 = r40.mo705a()
            int r12 = -r12
            r10.mo799c(r8, r3, r12, r1)
            goto L_0x0257
        L_0x0278:
            r12 = 0
            r29 = 0
            goto L_0x0293
        L_0x027c:
            r11 = r25
            r6 = 6
            if (r34 == 0) goto L_0x0290
            int r1 = r39.mo705a()
            r10.mo794a(r9, r11, r1, r0)
            int r1 = r40.mo705a()
            int r1 = -r1
            r10.mo797b(r8, r3, r1, r0)
        L_0x0290:
            r12 = 0
        L_0x0291:
            r29 = 1
        L_0x0293:
            if (r29 == 0) goto L_0x02ba
            int r13 = r39.mo705a()
            int r14 = r40.mo705a()
            r1 = r33
            r2 = r9
            r15 = r3
            r3 = r11
            r16 = 0
            r4 = r13
            r13 = r5
            r5 = r45
            r31 = r11
            r30 = r15
            r11 = 6
            r6 = r30
            r11 = r31
            r7 = r8
            r13 = r8
            r8 = r14
            r14 = r9
            r9 = r0
            r1.mo793a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02be
        L_0x02ba:
            r30 = r3
            r13 = r8
            r14 = r9
        L_0x02be:
            if (r12 == 0) goto L_0x02d3
            int r0 = r39.mo705a()
            r1 = 6
            r10.mo794a(r14, r11, r0, r1)
            int r0 = r40.mo705a()
            int r0 = -r0
            r2 = r30
            r10.mo797b(r13, r2, r0, r1)
            goto L_0x02d4
        L_0x02d3:
            r1 = 6
        L_0x02d4:
            if (r34 == 0) goto L_0x01ea
            r0 = r35
            r3 = 0
            r10.mo794a(r14, r0, r3, r1)
        L_0x02dc:
            if (r34 == 0) goto L_0x02e4
            r5 = r13
            r4 = r36
            r10.mo794a(r4, r5, r3, r1)
        L_0x02e4:
            return
        L_0x02e5:
            r5 = r8
            r14 = r9
            r0 = r35
            r1 = 6
            r3 = 0
            r4 = r36
            r6 = 2
            if (r2 >= r6) goto L_0x02f8
            if (r34 == 0) goto L_0x02f8
            r10.mo794a(r14, r0, r3, r1)
            r10.mo794a(r4, r5, r3, r1)
        L_0x02f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0333e.m738a(android.support.constraint.a.e, boolean, android.support.constraint.a.h, android.support.constraint.a.h, android.support.constraint.a.a.e$a, boolean, android.support.constraint.a.a.d, android.support.constraint.a.a.d, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
