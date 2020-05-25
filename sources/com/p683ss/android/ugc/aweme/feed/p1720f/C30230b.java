package com.p683ss.android.ugc.aweme.feed.p1720f;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.experiment.PreloadGatherModeExperiment;
import com.p683ss.android.ugc.aweme.p1963ml.C37105d;
import com.p683ss.android.ugc.aweme.p1963ml.C37115l;

/* renamed from: com.ss.android.ugc.aweme.feed.f.b */
public class C30230b {

    /* renamed from: h */
    public static final String f78961h = "b";

    /* renamed from: a */
    public int f78962a;

    /* renamed from: b */
    public int f78963b;

    /* renamed from: c */
    public int f78964c;

    /* renamed from: d */
    public int f78965d;

    /* renamed from: e */
    public int f78966e;

    /* renamed from: f */
    public int f78967f;

    /* renamed from: g */
    public C30229a<String, C30234c> f78968g;

    /* renamed from: i */
    private long f78969i;

    /* renamed from: com.ss.android.ugc.aweme.feed.f.b$a */
    public static final class C30232a {

        /* renamed from: a */
        public long f78970a;

        /* renamed from: b */
        public long f78971b;

        /* renamed from: c */
        public long f78972c;

        /* renamed from: d */
        public long f78973d;

        /* renamed from: e */
        public int f78974e;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f.b$b */
    static final class C30233b {

        /* renamed from: a */
        public static final C30230b f78975a = new C30230b();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f.b$c */
    public static final class C30234c {

        /* renamed from: a */
        public int f78976a;

        /* renamed from: b */
        public int f78977b;

        /* renamed from: c */
        public int f78978c;

        /* renamed from: d */
        public int f78979d;

        /* renamed from: e */
        public int f78980e;

        /* renamed from: f */
        public int f78981f;

        private C30234c() {
        }
    }

    /* renamed from: a */
    public static int m70992a(int i, int i2) {
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += i3 & 1;
            i3 >>= 1;
        }
        return i4;
    }

    /* renamed from: a */
    public static C30230b m70993a() {
        return C30233b.f78975a;
    }

    private C30230b() {
        this.f78968g = new C30229a<>(31);
        this.f78969i = -1;
    }

    /* renamed from: c */
    public static boolean m70994c() {
        if (m70995d() || C37105d.m83336a().mo76385b() || C37115l.m83346a().mo76390b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m70995d() {
        if (C10181b.m20511a().mo18168a(PreloadGatherModeExperiment.class, true, "preload_gather_mode", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int[] mo60574b() {
        int[] iArr = new int[6];
        C30234c[] cVarArr = (C30234c[]) this.f78968g.f78954a.values().toArray(new C30234c[0]);
        for (int i = 0; i < cVarArr.length; i++) {
            C30234c cVar = cVarArr[(cVarArr.length - i) - 1];
            iArr[0] = iArr[0] ^ (cVar.f78977b << i);
            iArr[1] = iArr[1] ^ (cVar.f78978c << i);
            iArr[2] = iArr[2] ^ (cVar.f78979d << i);
            iArr[3] = iArr[3] ^ (cVar.f78980e << i);
            iArr[4] = iArr[4] ^ (cVar.f78981f << i);
            iArr[5] = (cVar.f78976a << i) ^ iArr[5];
        }
        return iArr;
    }
}
