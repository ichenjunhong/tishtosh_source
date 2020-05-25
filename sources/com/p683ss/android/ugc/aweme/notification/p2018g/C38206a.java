package com.p683ss.android.ugc.aweme.notification.p2018g;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeABService;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.g.a */
public final class C38206a implements NoticeABService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f97272a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38206a.class), "noticeAbService", "getNoticeAbService()Lcom/ss/android/ugc/aweme/notice/api/ab/NoticeABService;"))};

    /* renamed from: b */
    public static final C38206a f97273b = new C38206a();

    /* renamed from: c */
    private static final C52668f f97274c = C52732g.m112285a(C38207a.f97275a);

    /* renamed from: com.ss.android.ugc.aweme.notification.g.a$a */
    static final class C38207a extends C52712l implements C52670a<NoticeABService> {

        /* renamed from: a */
        public static final C38207a f97275a = new C38207a();

        C38207a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C38206a.m85375a();
        }
    }

    private C38206a() {
    }

    /* renamed from: a */
    public static NoticeABService m85375a() {
        if (C27991b.f73426J == null) {
            synchronized (NoticeABService.class) {
                if (C27991b.f73426J == null) {
                    C27991b.f73426J = C27628bo.m66306a();
                }
            }
        }
        return (NoticeABService) C27991b.f73426J;
    }

    /* renamed from: b */
    private final NoticeABService m85376b() {
        return (NoticeABService) f97274c.getValue();
    }

    public final boolean getEnableFriendRecommendEnhance() {
        return m85376b().getEnableFriendRecommendEnhance();
    }

    public final int getEnablePushGuide() {
        return m85376b().getEnablePushGuide();
    }

    public final int getOppoRedPointAppearAgainTimeInterval() {
        return m85376b().getOppoRedPointAppearAgainTimeInterval();
    }

    public final int getOppoRedPointAppearMode() {
        return m85376b().getOppoRedPointAppearMode();
    }

    public final String getPlayerTypeName() {
        return m85376b().getPlayerTypeName();
    }

    public final int getRecommendContactPosition() {
        return m85376b().getRecommendContactPosition();
    }

    public final int getShowRedDotType() {
        return m85376b().getShowRedDotType();
    }

    public final int getShowRemarkIconStyle() {
        return m85376b().getShowRemarkIconStyle();
    }

    public final boolean isChallengeToHashTag() {
        return m85376b().isChallengeToHashTag();
    }

    public final boolean isDefaultFollowTab() {
        return m85376b().isDefaultFollowTab();
    }

    public final boolean isEnableGroupChat() {
        return m85376b().isEnableGroupChat();
    }

    public final boolean isEnableMultiAccountLogin() {
        return m85376b().isEnableMultiAccountLogin();
    }

    public final boolean isFanFollowingListRecommand() {
        return m85376b().isFanFollowingListRecommand();
    }

    public final boolean isFollowFeedEnterFullScreenDetail() {
        return m85376b().isFollowFeedEnterFullScreenDetail();
    }

    public final boolean isFtcBindEnable() {
        return m85376b().isFtcBindEnable();
    }

    public final boolean isLikeListDetailEnabled() {
        return m85376b().isLikeListDetailEnabled();
    }

    public final boolean isNotificationTabNewStyle() {
        return m85376b().isNotificationTabNewStyle();
    }

    public final boolean isPrivacyReminder() {
        return m85376b().isPrivacyReminder();
    }

    public final boolean isRecommendItemShowMoreInfo() {
        return m85376b().isRecommendItemShowMoreInfo();
    }

    public final boolean shouldUseNewFansVsStyle() {
        return m85376b().shouldUseNewFansVsStyle();
    }
}
