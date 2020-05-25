package com.p683ss.android.ugc.aweme.common.widget;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.aweme.common.widget.w */
public final class C27011w {

    /* renamed from: a */
    public static final C27011w f71321a = new C27011w();

    private C27011w() {
    }

    /* renamed from: a */
    public static final boolean m65223a() {
        if (m65224b() > ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static double m65224b() {
        C10193n.m20607a();
        Class<RecommendFixSplashBugSetting> cls = RecommendFixSplashBugSetting.class;
        String str = "recommend_fix_splash_bug";
        Double recommendFixSplashBug = C10181b.m20511a().mo18175c().getRecommendFixSplashBug();
        Double d = (Double) C10193n.m20608a(str);
        if (d != null) {
            recommendFixSplashBug = d;
        } else if (C10193n.m20609c().mo18216a()) {
            recommendFixSplashBug = Double.valueOf(C10193n.m20609c().mo18217b(str, 1.5d));
        }
        return recommendFixSplashBug.doubleValue();
    }
}
