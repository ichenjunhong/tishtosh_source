package com.p683ss.android.ugc.aweme.feed.api;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30782az;

/* renamed from: com.ss.android.ugc.aweme.feed.api.f */
public final class C30148f {

    /* renamed from: a */
    private static volatile IFeedModuleService f78688a;

    /* renamed from: a */
    public static IFeedModuleService m70756a() {
        if (f78688a == null) {
            f78688a = FeedModuleServiceImpl.createIFeedModuleServicebyMonsterPlugin();
        }
        return f78688a;
    }

    /* renamed from: b */
    public static boolean m70758b() {
        return m70756a().canResumePlay();
    }

    /* renamed from: a */
    public static C30782az m70757a(FragmentActivity fragmentActivity) {
        return m70756a().getUnReadFeedSunRoofViewModel(fragmentActivity);
    }
}
