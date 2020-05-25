package com.p683ss.android.ugc.aweme.services;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.experiment.C29503d;
import com.p683ss.android.ugc.aweme.experiment.EnableGroupChatExperiment;
import com.p683ss.android.ugc.aweme.experiment.EnablePushGuideExperiment;
import com.p683ss.android.ugc.aweme.experiment.FtcBindExperiment;
import com.p683ss.android.ugc.aweme.experiment.IMFansVsStyleExperiment;
import com.p683ss.android.ugc.aweme.experiment.IMNotificationTabSylteExperiment;
import com.p683ss.android.ugc.aweme.experiment.IsRecommendItemShowMoreInfoExperiment;
import com.p683ss.android.ugc.aweme.experiment.LikeListDetailExperiment;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeABService;
import com.p683ss.android.ugc.aweme.p1390av.C23298a;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.video.C48069o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.NoticeABServiceImpl */
public final class NoticeABServiceImpl implements NoticeABService {
    public static NoticeABService provideNoticeABService_Monster() {
        if (C27991b.f73426J == null) {
            synchronized (NoticeABService.class) {
                if (C27991b.f73426J == null) {
                    C27991b.f73426J = C27628bo.m66306a();
                }
            }
        }
        return (NoticeABService) C27991b.f73426J;
    }

    public final int getShowRedDotType() {
        return 0;
    }

    public final int getRecommendContactPosition() {
        return C29503d.m69640a();
    }

    public final boolean isEnableGroupChat() {
        return EnableGroupChatExperiment.m69587a();
    }

    public final boolean isEnableMultiAccountLogin() {
        return C20966a.m53329a();
    }

    public final boolean isNotificationTabNewStyle() {
        return IMNotificationTabSylteExperiment.m69598a();
    }

    public final boolean getEnableFriendRecommendEnhance() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91435g();
    }

    public final String getPlayerTypeName() {
        return C48069o.m104089K().name();
    }

    public final int getShowRemarkIconStyle() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91437i();
    }

    public final boolean isChallengeToHashTag() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return true;
    }

    public final boolean isDefaultFollowTab() {
        C23298a a = C23298a.m57308a();
        C52711k.m112236a((Object) a, "StoryAbManager.getInstance()");
        return a.mo48343b();
    }

    public final boolean isFanFollowingListRecommand() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91438j();
    }

    public final boolean isPrivacyReminder() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C41589c.m91439k();
    }

    public final int getEnablePushGuide() {
        return C10181b.m20511a().mo18168a(EnablePushGuideExperiment.class, true, "push_guide_type", 31744, 0);
    }

    public final Integer getOppoRedPointAppearAgainTimeInterval() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return Integer.valueOf(MigrateABTestModel.getInstance().getOppoRedPointAppearAgainTimeInterval());
    }

    public final Integer getOppoRedPointAppearMode() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return Integer.valueOf(MigrateABTestModel.getInstance().getOppoRedPointAppearModel());
    }

    public final boolean isFollowFeedEnterFullScreenDetail() {
        return C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false);
    }

    public final boolean isFtcBindEnable() {
        return C10181b.m20511a().mo18172a(FtcBindExperiment.class, true, "ftc_bind_enable", 31744, false);
    }

    public final boolean isLikeListDetailEnabled() {
        if (C10181b.m20511a().mo18172a(LikeListDetailExperiment.class, true, "musically_digg_detail_list", 31744, false)) {
            return true;
        }
        return false;
    }

    public final boolean isRecommendItemShowMoreInfo() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return C10181b.m20511a().mo18172a(IsRecommendItemShowMoreInfoExperiment.class, true, "recommend_item_show_more_info", 31744, false);
    }

    public final boolean shouldUseNewFansVsStyle() {
        if (C10181b.m20511a().mo18168a(IMFansVsStyleExperiment.class, true, "im_fans_vc_style", 31744, 0) == 1) {
            return true;
        }
        return false;
    }
}
