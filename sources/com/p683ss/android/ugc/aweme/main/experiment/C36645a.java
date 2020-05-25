package com.p683ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C10181b;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.a */
public final class C36645a {

    /* renamed from: a */
    public static final C36645a f93778a = new C36645a();

    private C36645a() {
    }

    /* renamed from: a */
    public static int m82553a() {
        int a = C10181b.m20511a().mo18168a(FollowFeedStyleExperiment.class, true, "follow_feed_type", 31744, 0);
        if (a == 0) {
            return a;
        }
        if (a < 0 || a > 2) {
            return 0;
        }
        return a;
    }
}
