package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.app.C22954am;
import com.p683ss.android.ugc.aweme.app.C22956ao;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24503d;
import com.p683ss.android.ugc.aweme.comment.C25279s;
import com.p683ss.android.ugc.aweme.discover.C27938d;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28215b;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30781ay;
import com.p683ss.android.ugc.aweme.follow.p1764c.C31870a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.login.C27959c;
import com.p683ss.android.ugc.aweme.main.C36653g;
import com.p683ss.android.ugc.aweme.main.C36666k;
import com.p683ss.android.ugc.aweme.main.guide.C36658c;
import com.p683ss.android.ugc.aweme.mix.C37023e;
import com.p683ss.android.ugc.aweme.nearby.C37736a;
import com.p683ss.android.ugc.aweme.p1339al.C22568a;
import com.p683ss.android.ugc.aweme.p1807im.C33180c;
import com.p683ss.android.ugc.aweme.p1807im.INotificationManagerService;
import com.p683ss.android.ugc.aweme.p1963ml.C37108f;
import com.p683ss.android.ugc.aweme.p2404y.C48421a;
import com.p683ss.android.ugc.aweme.profile.C39869f;
import com.p683ss.android.ugc.aweme.profile.C39874g;
import com.p683ss.android.ugc.aweme.requestcombine.C41232c;
import com.p683ss.android.ugc.aweme.search.C41416e;
import com.p683ss.android.ugc.aweme.setting.C41523ad;
import com.p683ss.android.ugc.aweme.setting.IInAppUpdatesService;
import com.p683ss.android.ugc.aweme.sticker.C46039j;

/* renamed from: com.ss.android.ugc.aweme.bh */
public final class C23794bh {

    /* renamed from: a */
    private static volatile ILegacyService f63404a;

    /* renamed from: A */
    public static C27938d m58375A() {
        return m58386a().getDiscoverAllService();
    }

    /* renamed from: B */
    public static C36658c m58376B() {
        return m58386a().getFollowTabBubbleGuideHelper();
    }

    /* renamed from: C */
    public static C39869f m58377C() {
        return m58386a().getChangeUsernameService();
    }

    /* renamed from: D */
    public static C22568a m58378D() {
        return m58386a().getLocalService();
    }

    /* renamed from: E */
    public static C41416e m58379E() {
        return m58386a().getSearchMonitor();
    }

    /* renamed from: F */
    public static C22547aj m58380F() {
        return m58386a().getBenchmarkService();
    }

    /* renamed from: G */
    public static C22783ao m58381G() {
        return m58386a().getComplianceService();
    }

    /* renamed from: H */
    public static C22570am m58382H() {
        return m58386a().getChallengeDetailLegacyService();
    }

    /* renamed from: I */
    public static C22787ap m58383I() {
        return m58386a().getCrossPlatformLegacyService();
    }

    /* renamed from: J */
    public static IInAppUpdatesService m58384J() {
        return m58386a().getInAppUpdatesService();
    }

    /* renamed from: K */
    public static INotificationManagerService m58385K() {
        return m58386a().getNotificationManagerService();
    }

    /* renamed from: a */
    public static ILegacyService m58386a() {
        if (f63404a == null) {
            f63404a = LegacyServiceImpl.createILegacyServicebyMonsterPlugin();
        }
        return f63404a;
    }

    /* renamed from: b */
    public static C36666k m58388b() {
        return m58386a().getMainPageExperimentService();
    }

    /* renamed from: c */
    public static C24503d m58389c() {
        return m58386a().getCaptchaHelperService();
    }

    /* renamed from: d */
    public static C22711b m58390d() {
        return m58386a().getTimeLockRulerService();
    }

    /* renamed from: e */
    public static C32403c m58391e() {
        return m58386a().getForwardStatisticsService();
    }

    /* renamed from: f */
    public static C31870a m58392f() {
        return m58386a().getFollowStatisticsService();
    }

    /* renamed from: g */
    public static C36653g m58393g() {
        return m58386a().getLongVideoService();
    }

    /* renamed from: h */
    public static C33180c m58394h() {
        return m58386a().getIMAdapterService();
    }

    /* renamed from: i */
    public static C37023e m58395i() {
        return m58386a().getMixHelperService();
    }

    /* renamed from: j */
    public static C37108f m58396j() {
        return m58386a().getMLService();
    }

    /* renamed from: k */
    public static C48421a m58397k() {
        return m58386a().getDownloaderService();
    }

    /* renamed from: l */
    public static C22954am m58398l() {
        return m58386a().getAwemeApplicationService();
    }

    /* renamed from: m */
    public static C27959c m58399m() {
        return m58386a().getLoginUtilsService();
    }

    /* renamed from: n */
    public static C23328ay m58400n() {
        return m58386a().getPreloadApiService();
    }

    /* renamed from: o */
    public static C41523ad m58401o() {
        return m58386a().getAbTestManager();
    }

    /* renamed from: p */
    public static C25279s m58402p() {
        return m58386a().getCommentEggDataManager();
    }

    /* renamed from: q */
    public static C37736a m58403q() {
        return m58386a().getNearbyAllService();
    }

    /* renamed from: r */
    public static C46039j m58404r() {
        return m58386a().getStickerService();
    }

    /* renamed from: s */
    public static C28215b m58405s() {
        return m58386a().getRankHelperService();
    }

    /* renamed from: t */
    public static C41232c m58406t() {
        return m58386a().getColdLaunchRequestCombiner();
    }

    /* renamed from: u */
    public static C22541ag m58407u() {
        return m58386a().getActivityRouterService();
    }

    /* renamed from: v */
    public static C23769bd m58408v() {
        return m58386a().getUgAllService();
    }

    /* renamed from: w */
    public static C22567al m58409w() {
        return m58386a().getBuildConfigAllService();
    }

    /* renamed from: x */
    public static C39874g m58410x() {
        return m58386a().getMultiAccountService();
    }

    /* renamed from: y */
    public static C28423z m58411y() {
        return m58386a().getSearchResultStatistics();
    }

    /* renamed from: z */
    public static C22956ao m58412z() {
        return m58386a().getInitService();
    }

    /* renamed from: a */
    public static C30781ay m58387a(Activity activity) {
        return m58386a().getLocationPopupManager(activity);
    }
}
