package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "im_friend_active_strategy")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.UserActiveStatusEnableLevelExperiment */
public final class UserActiveStatusEnableLevelExperiment {
    @C10179b
    public static final int DISABLED = 0;
    public static final UserActiveStatusEnableLevelExperiment INSTANCE = new UserActiveStatusEnableLevelExperiment();
    @C10179b(mo18165a = true)
    public static final int PUSH = 1;
    @C10179b
    public static final int PUSH_FETCH_STYLE_1 = 2;
    @C10179b
    public static final int PUSH_FETCH_STYLE_2 = 3;

    private UserActiveStatusEnableLevelExperiment() {
    }
}
