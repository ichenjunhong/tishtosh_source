package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.e */
public final class C30225e {

    /* renamed from: a */
    public static final C30225e f78952a = new C30225e();

    private C30225e() {
    }

    /* renamed from: c */
    public static int m70971c() {
        int a = C10181b.m20511a().mo18168a(FollowFeedSkyLightExperiment.class, true, "i18n_feed_following_notice_style", 31744, 0);
        if (a == 1 || a == 5 || a == 6) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public static boolean m70969a() {
        int a = C10181b.m20511a().mo18168a(FollowFeedSkyLightExperiment.class, true, "i18n_feed_following_notice_style", 31744, 0);
        if (a == 3 || a == 4 || a == 5 || a == 6 || a == 7 || a == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m70970b() {
        int a = C10181b.m20511a().mo18168a(FollowFeedSkyLightExperiment.class, true, "i18n_feed_following_notice_style", 31744, 0);
        if (a == 1 || a == 2 || a == 5 || a == 6 || a == 7 || a == 8) {
            return true;
        }
        return false;
    }
}
