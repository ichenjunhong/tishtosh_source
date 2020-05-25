package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: dmt.av.video.aa */
public final class C52904aa {

    /* renamed from: l */
    public static final C52905a f131229l = new C52905a(null);

    /* renamed from: a */
    public int f131230a;

    /* renamed from: b */
    public int f131231b;

    /* renamed from: c */
    public int f131232c;

    /* renamed from: d */
    public int f131233d;

    /* renamed from: e */
    public int f131234e;

    /* renamed from: f */
    public boolean f131235f;

    /* renamed from: g */
    public boolean f131236g;

    /* renamed from: h */
    public int f131237h;

    /* renamed from: i */
    public int f131238i;

    /* renamed from: j */
    public final boolean f131239j;

    /* renamed from: k */
    public final boolean f131240k;

    /* renamed from: dmt.av.video.aa$a */
    public static final class C52905a {
        private C52905a() {
        }

        public /* synthetic */ C52905a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C52904aa m112586a(int i, int i2, int i3, int i4, int i5, int i6) {
            C52904aa aaVar = new C52904aa(0, i, false, false, 12, null);
            return aaVar.mo110507a(i5).mo110511c(i6).mo110512d(i2).mo110513e(i3).mo110509b(i4);
        }

        /* renamed from: a */
        public static C52904aa m112587a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
            C52904aa aaVar = new C52904aa(0, i, false, false, 12, null);
            return aaVar.mo110507a(i5).mo110511c(i6).mo110512d(i2).mo110513e(i3).mo110509b(i4).mo110508a(z).mo110510b(z2);
        }

        /* renamed from: a */
        private static C52904aa m112588a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
            return new C52904aa(1, i, z, z2).mo110507a(i5).mo110511c(i6).mo110512d(i2).mo110513e(i3).mo110509b(i4).mo110508a(z3).mo110510b(z4);
        }

        /* renamed from: a */
        public static /* synthetic */ C52904aa m112589a(C52905a aVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, int i7, Object obj) {
            boolean z5;
            boolean z6;
            boolean z7;
            int i8 = i7;
            if ((i8 & 64) != 0) {
                z5 = true;
            } else {
                z5 = z;
            }
            if ((i8 & 128) != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if ((i8 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            return m112588a(i, i2, i3, i4, i5, i6, z5, z6, z7, false);
        }
    }

    /* renamed from: a */
    public static final C52904aa m112575a(int i, int i2, int i3, int i4, int i5, int i6) {
        return C52905a.m112589a(f131229l, i, i2, i3, i4, i5, 0, false, false, false, false, 960, null);
    }

    /* renamed from: a */
    public static final C52904aa m112576a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        return C52905a.m112587a(i, i2, i3, i4, i5, 0, z, true);
    }

    /* renamed from: a */
    public static final C52904aa m112577a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        return C52905a.m112589a(f131229l, i, 0, i3, i4, i5, 0, true, false, z3, false, UnReadVideoExperiment.LIKE_USER_LIST, null);
    }

    /* renamed from: b */
    public static final C52904aa m112578b(int i, int i2, int i3, int i4, int i5, int i6) {
        return C52905a.m112586a(i, i2, i3, i4, i5, 0);
    }

    /* renamed from: a */
    public final C52904aa mo110507a(int i) {
        this.f131230a = i;
        return this;
    }

    /* renamed from: b */
    public final C52904aa mo110509b(int i) {
        this.f131234e = i;
        return this;
    }

    /* renamed from: c */
    public final C52904aa mo110511c(int i) {
        this.f131231b = i;
        return this;
    }

    /* renamed from: d */
    public final C52904aa mo110512d(int i) {
        this.f131232c = i;
        return this;
    }

    /* renamed from: e */
    public final C52904aa mo110513e(int i) {
        this.f131233d = i;
        return this;
    }

    /* renamed from: a */
    public final C52904aa mo110508a(boolean z) {
        this.f131235f = z;
        return this;
    }

    /* renamed from: b */
    public final C52904aa mo110510b(boolean z) {
        this.f131236g = z;
        return this;
    }

    public C52904aa(int i, int i2, boolean z, boolean z2) {
        this.f131237h = i;
        this.f131238i = i2;
        this.f131239j = z;
        this.f131240k = z2;
    }

    public /* synthetic */ C52904aa(int i, int i2, boolean z, boolean z2, int i3, C52707g gVar) {
        this(0, i2, true, false);
    }
}
