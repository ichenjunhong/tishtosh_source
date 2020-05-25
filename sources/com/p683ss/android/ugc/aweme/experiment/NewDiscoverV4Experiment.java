package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "new_discover_v4_type")
/* renamed from: com.ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment */
public final class NewDiscoverV4Experiment {
    private static final int API_OPTION_VALUE = (m69623g() - 1);
    @C10179b(mo18165a = true)
    public static final int GROUP_NORMAL = 0;
    @C10179b
    public static final int GROUP_OLD_OPTION_ONE = 1;
    @C10179b
    public static final int GROUP_OPTION_ONE = 2;
    @C10179b
    public static final int GROUP_OPTION_THREE = 4;
    @C10179b
    public static final int GROUP_OPTION_TWO = 3;
    public static final NewDiscoverV4Experiment INSTANCE = new NewDiscoverV4Experiment();
    private static final boolean IS_NAVIGATION;
    private static final boolean IS_NEW_STYLE;
    private static final boolean IS_OPTION_ONE;
    private static final boolean IS_OPTION_THREE;
    private static final boolean IS_OPTION_TWO;

    private NewDiscoverV4Experiment() {
    }

    /* renamed from: a */
    public static boolean m69617a() {
        return IS_NEW_STYLE;
    }

    /* renamed from: b */
    public static boolean m69618b() {
        return IS_OPTION_THREE;
    }

    /* renamed from: c */
    public static boolean m69619c() {
        return IS_OPTION_TWO;
    }

    /* renamed from: d */
    public static boolean m69620d() {
        return IS_NAVIGATION;
    }

    /* renamed from: e */
    public static boolean m69621e() {
        return IS_OPTION_ONE;
    }

    /* renamed from: f */
    public static int m69622f() {
        return API_OPTION_VALUE;
    }

    /* renamed from: g */
    public static int m69623g() {
        return C10181b.m20511a().mo18168a(NewDiscoverV4Experiment.class, true, "new_discover_v4_type", 31744, 0);
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (m69623g() > 1) {
            z = true;
        } else {
            z = false;
        }
        IS_NEW_STYLE = z;
        if (m69623g() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        IS_OPTION_THREE = z2;
        if (m69623g() == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        IS_OPTION_TWO = z3;
        if (m69623g() > 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        IS_NAVIGATION = z4;
        if (m69623g() == 1 || m69623g() == 2) {
            z5 = true;
        }
        IS_OPTION_ONE = z5;
    }
}
