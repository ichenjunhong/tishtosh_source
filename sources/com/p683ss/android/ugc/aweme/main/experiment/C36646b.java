package com.p683ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C10181b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.b */
public final class C36646b {

    /* renamed from: a */
    public static C36647c f93779a;

    /* renamed from: b */
    public static final C36646b f93780b = new C36646b();

    private C36646b() {
    }

    /* renamed from: a */
    public static int m82554a() {
        C36647c cVar = f93779a;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.f93782b;
    }

    static {
        C36647c cVar;
        int a = C10181b.m20511a().mo18168a(FollowFeedLayoutStrategyExperiment.class, true, "follow_feed_layout_strategy", 31744, 1);
        int a2 = C10181b.m20511a().mo18168a(FollowFeedFilterStrategyExperiment.class, true, "follow_feed_filter_strategy", 31744, 2);
        int a3 = C10181b.m20511a().mo18168a(FeedSwipeLeftExperiment.class, true, "feed_swipe_left", 31744, 0);
        int a4 = C10181b.m20511a().mo18168a(FullScreenUnfollowExperiment.class, true, "full_screen_unfollow", 31744, 0);
        int a5 = C10181b.m20511a().mo18168a(FollowUnreadStyleExperiment.class, true, "follow_unread_style", 31744, 0);
        int a6 = C10181b.m20511a().mo18168a(FollowNoticeLiveIconTypeExperiment.class, true, "top_follow_notice_live_unread_style", 31744, 0);
        boolean a7 = C10181b.m20511a().mo18172a(OptimizeTopUiFullScreenFollowExperiment.class, true, "optimize_top_ui_full_screen_follow", 31744, false);
        int a8 = C10181b.m20511a().mo18168a(MainTabTopTextDistanceExperiment.class, true, "main_tab_top_text_distance", 31744, 0);
        if (a == FollowFeedLayoutStrategyExperiment.f93767A && a2 == FollowFeedFilterStrategyExperiment.FILTER_LIVE_FORWARD_RECOMMEND && a3 == FeedSwipeLeftExperiment.ENABLE && a4 == FullScreenUnfollowExperiment.DONT_SHOW && a5 == FollowUnreadStyleExperiment.OLD && a6 == FollowNoticeLiveIconTypeExperiment.EN_LIVE && !a7 && a8 == 0) {
            cVar = new C36647c(FollowFeedLayoutStrategyExperiment.f93767A, FollowFeedFilterStrategyExperiment.FILTER_LIVE_FORWARD_RECOMMEND, FeedSwipeLeftExperiment.ENABLE, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else if (a == FollowFeedLayoutStrategyExperiment.f93767A) {
            cVar = new C36647c(FollowFeedLayoutStrategyExperiment.f93767A, a2, a3, a4, a5, a6, a7, a8);
        } else if (a == FollowFeedLayoutStrategyExperiment.f93768B) {
            cVar = new C36647c(FollowFeedLayoutStrategyExperiment.f93768B, a2, a3, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else if (a == FollowFeedLayoutStrategyExperiment.f93769C) {
            cVar = new C36647c(FollowFeedLayoutStrategyExperiment.f93769C, a2, a3, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else {
            int i = FullScreenUnfollowExperiment.DONT_SHOW;
            cVar = new C36647c(a, a2, a3, i, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, a7, 0);
        }
        f93779a = cVar;
    }
}
