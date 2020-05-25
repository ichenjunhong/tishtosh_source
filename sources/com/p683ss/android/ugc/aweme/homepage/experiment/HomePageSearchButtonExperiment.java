package com.p683ss.android.ugc.aweme.homepage.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "home_page_search_button")
/* renamed from: com.ss.android.ugc.aweme.homepage.experiment.HomePageSearchButtonExperiment */
public final class HomePageSearchButtonExperiment {
    @C10179b(mo18165a = true)
    public static final int CONTROL_GROUP = 0;
    public static final HomePageSearchButtonExperiment INSTANCE = new HomePageSearchButtonExperiment();
    @C10179b
    public static final int TREATMENT_GROUP1 = 1;
    @C10179b
    public static final int TREATMENT_GROUP2 = 2;

    private HomePageSearchButtonExperiment() {
    }

    /* renamed from: a */
    public static final boolean m75921a() {
        if (C10181b.m20511a().mo18168a(HomePageSearchButtonExperiment.class, true, "home_page_search_button", 31744, 0) != 0) {
            return true;
        }
        return false;
    }
}
