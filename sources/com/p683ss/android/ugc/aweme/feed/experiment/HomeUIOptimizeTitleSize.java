package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "home_ui_optimize_title_size")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.HomeUIOptimizeTitleSize */
public final class HomeUIOptimizeTitleSize {
    @C10179b(mo18165a = true)
    public static final int DEFAULT_GROUP = 0;
    @C10179b
    public static final int GROUP1 = 1;
    @C10179b
    public static final int GROUP2 = 2;
    @C10179b
    public static final int GROUP3 = 3;
    public static final HomeUIOptimizeTitleSize INSTANCE = new HomeUIOptimizeTitleSize();

    private HomeUIOptimizeTitleSize() {
    }

    /* renamed from: a */
    public static final boolean m70949a() {
        if (m70951c() == 1 || m70951c() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m70950b() {
        if (m70951c() == 2 || m70951c() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m70951c() {
        return C10181b.m20511a().mo18168a(HomeUIOptimizeTitleSize.class, true, "home_ui_optimize_title_size", 31744, 0);
    }
}
