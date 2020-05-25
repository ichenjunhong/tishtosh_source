package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.app.C22954am;
import com.p683ss.android.ugc.aweme.app.C22955an;
import com.p683ss.android.ugc.aweme.app.C22956ao;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24503d;
import com.p683ss.android.ugc.aweme.comment.C25279s;
import com.p683ss.android.ugc.aweme.crossplatform.C27180c;
import com.p683ss.android.ugc.aweme.discover.C27938d;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28215b;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30781ay;
import com.p683ss.android.ugc.aweme.follow.p1764c.C31870a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32494c;
import com.p683ss.android.ugc.aweme.livewallpaper.ILiveWallPaperService;
import com.p683ss.android.ugc.aweme.login.C27959c;
import com.p683ss.android.ugc.aweme.main.C36653g;
import com.p683ss.android.ugc.aweme.main.C36666k;
import com.p683ss.android.ugc.aweme.main.C36667l;
import com.p683ss.android.ugc.aweme.main.C36669m;
import com.p683ss.android.ugc.aweme.main.guide.C36658c;
import com.p683ss.android.ugc.aweme.mix.C37023e;
import com.p683ss.android.ugc.aweme.nearby.C37736a;
import com.p683ss.android.ugc.aweme.opensdk.C38498c;
import com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20849a;
import com.p683ss.android.ugc.aweme.p1339al.C22568a;
import com.p683ss.android.ugc.aweme.p1807im.C33180c;
import com.p683ss.android.ugc.aweme.p1807im.INotificationManagerService;
import com.p683ss.android.ugc.aweme.p1963ml.C37108f;
import com.p683ss.android.ugc.aweme.p2375u.C47407b;
import com.p683ss.android.ugc.aweme.p2403xs.IXsService;
import com.p683ss.android.ugc.aweme.p2404y.C48421a;
import com.p683ss.android.ugc.aweme.poi.C38955a;
import com.p683ss.android.ugc.aweme.profile.C39869f;
import com.p683ss.android.ugc.aweme.profile.C39874g;
import com.p683ss.android.ugc.aweme.requestcombine.C41232c;
import com.p683ss.android.ugc.aweme.search.C41416e;
import com.p683ss.android.ugc.aweme.setting.C41523ad;
import com.p683ss.android.ugc.aweme.setting.IInAppUpdatesService;
import com.p683ss.android.ugc.aweme.setting.ISettingManagerService;
import com.p683ss.android.ugc.aweme.splash.C45691d;
import com.p683ss.android.ugc.aweme.sticker.C46039j;
import com.p683ss.android.ugc.aweme.story.C46618a;

/* renamed from: com.ss.android.ugc.aweme.ILegacyService */
public interface ILegacyService {
    C41523ad getAbTestManager();

    C22541ag getActivityRouterService();

    C22954am getAwemeApplicationService();

    C22547aj getBenchmarkService();

    C22567al getBuildConfigAllService();

    C24503d getCaptchaHelperService();

    C22570am getChallengeDetailLegacyService();

    C39869f getChangeUsernameService();

    C41232c getColdLaunchRequestCombiner();

    C25279s getCommentEggDataManager();

    C22573an getCommerceService();

    C22783ao getComplianceService();

    C22787ap getCrossPlatformLegacyService();

    C27180c getCrossPlatformService();

    C47407b getDebugService();

    C27938d getDiscoverAllService();

    C48421a getDownloaderService();

    C22955an getEventTypeHelper();

    C31870a getFollowStatisticsService();

    C36658c getFollowTabBubbleGuideHelper();

    C32403c getForwardStatisticsService();

    C23257ar getFreeFlowMemberService();

    C32494c getFreeFlowStrategy();

    C33180c getIMAdapterService();

    IInAppUpdatesService getInAppUpdatesService();

    C22956ao getInitService();

    ILiveWallPaperService getLiveWallPaperService();

    C22568a getLocalService();

    C30781ay getLocationPopupManager(Activity activity);

    C27959c getLoginUtilsService();

    C36653g getLongVideoService();

    C37108f getMLService();

    C36666k getMainPageExperimentService();

    C36667l getMainPageMobHelper();

    C36669m getMainPageService();

    IMicroAppService getMicroAppService();

    C37023e getMixHelperService();

    C39874g getMultiAccountService();

    C37736a getNearbyAllService();

    INotificationManagerService getNotificationManagerService();

    C38498c getOpenSDKUtilsService();

    C23326ax getPluginUtilsAllService();

    C38955a getPoiAllService();

    C23328ay getPreloadApiService();

    C28215b getRankHelperService();

    C41416e getSearchMonitor();

    C28423z getSearchResultStatistics();

    ISettingManagerService getSettingManagerService();

    C45691d getSplashService();

    C46039j getStickerService();

    C46618a getStoryManager();

    C22711b getTimeLockRulerService();

    C23769bd getUgAllService();

    C20849a getXiGuaUtilsService();

    IXsService getXsService();
}
