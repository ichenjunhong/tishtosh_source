package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import com.benchmark.p124bl.C2644l;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22725j;
import com.p683ss.android.ugc.aweme.app.C22929ag;
import com.p683ss.android.ugc.aweme.app.C22954am;
import com.p683ss.android.ugc.aweme.app.C22955an;
import com.p683ss.android.ugc.aweme.app.C22956ao;
import com.p683ss.android.ugc.aweme.app.C22957ap;
import com.p683ss.android.ugc.aweme.app.C23130o;
import com.p683ss.android.ugc.aweme.app.download.C23075a;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24502c;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24503d;
import com.p683ss.android.ugc.aweme.challenge.C24558c;
import com.p683ss.android.ugc.aweme.comment.C25150d;
import com.p683ss.android.ugc.aweme.comment.C25279s;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25912i;
import com.p683ss.android.ugc.aweme.crossplatform.C27093a;
import com.p683ss.android.ugc.aweme.crossplatform.C27180c;
import com.p683ss.android.ugc.aweme.discover.C27711a;
import com.p683ss.android.ugc.aweme.discover.C27938d;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28215b;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28217d;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.experiment.C29508i;
import com.p683ss.android.ugc.aweme.favorites.C29657a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30781ay;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30797bi;
import com.p683ss.android.ugc.aweme.follow.p1764c.C31870a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32402b;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.freeflowcard.p1784a.C32471a;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32492a;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32494c;
import com.p683ss.android.ugc.aweme.livewallpaper.ILiveWallPaperService;
import com.p683ss.android.ugc.aweme.livewallpaper.LiveWallPaperServiceImpl;
import com.p683ss.android.ugc.aweme.login.C27959c;
import com.p683ss.android.ugc.aweme.login.C27974o;
import com.p683ss.android.ugc.aweme.main.C36554ce;
import com.p683ss.android.ugc.aweme.main.C36602du;
import com.p683ss.android.ugc.aweme.main.C36653g;
import com.p683ss.android.ugc.aweme.main.C36666k;
import com.p683ss.android.ugc.aweme.main.C36667l;
import com.p683ss.android.ugc.aweme.main.C36669m;
import com.p683ss.android.ugc.aweme.main.C36675q;
import com.p683ss.android.ugc.aweme.main.experiment.C36648d;
import com.p683ss.android.ugc.aweme.main.guide.C36655a;
import com.p683ss.android.ugc.aweme.main.guide.C36658c;
import com.p683ss.android.ugc.aweme.mix.C37023e;
import com.p683ss.android.ugc.aweme.mix.C37086q;
import com.p683ss.android.ugc.aweme.nearby.C37736a;
import com.p683ss.android.ugc.aweme.nearby.C37737b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37880c;
import com.p683ss.android.ugc.aweme.opensdk.C38498c;
import com.p683ss.android.ugc.aweme.opensdk.C38512f;
import com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20849a;
import com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20851c;
import com.p683ss.android.ugc.aweme.p1339al.C22568a;
import com.p683ss.android.ugc.aweme.p1339al.C22569b;
import com.p683ss.android.ugc.aweme.p1807im.C33180c;
import com.p683ss.android.ugc.aweme.p1807im.C33197h;
import com.p683ss.android.ugc.aweme.p1807im.INotificationManagerService;
import com.p683ss.android.ugc.aweme.p1807im.NotificationManagerServiceiImpl;
import com.p683ss.android.ugc.aweme.p1963ml.C37108f;
import com.p683ss.android.ugc.aweme.p1963ml.C37112i;
import com.p683ss.android.ugc.aweme.p2375u.C47407b;
import com.p683ss.android.ugc.aweme.p2403xs.C48419c;
import com.p683ss.android.ugc.aweme.p2403xs.IXsService;
import com.p683ss.android.ugc.aweme.p2404y.C48421a;
import com.p683ss.android.ugc.aweme.poi.C38955a;
import com.p683ss.android.ugc.aweme.poi.C39063e;
import com.p683ss.android.ugc.aweme.profile.C39869f;
import com.p683ss.android.ugc.aweme.profile.C39874g;
import com.p683ss.android.ugc.aweme.profile.MultiAccountServiceImpl;
import com.p683ss.android.ugc.aweme.protection.C40872d;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a;
import com.p683ss.android.ugc.aweme.requestcombine.C41232c;
import com.p683ss.android.ugc.aweme.search.C41416e;
import com.p683ss.android.ugc.aweme.setting.C41523ad;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.IInAppUpdatesService;
import com.p683ss.android.ugc.aweme.setting.ISettingManagerService;
import com.p683ss.android.ugc.aweme.setting.InAppUpdateServiceImpl;
import com.p683ss.android.ugc.aweme.setting.SettingManagerServiceImpl;
import com.p683ss.android.ugc.aweme.splash.C45691d;
import com.p683ss.android.ugc.aweme.splash.C45707o;
import com.p683ss.android.ugc.aweme.sticker.C46039j;
import com.p683ss.android.ugc.aweme.sticker.C46411s;
import com.p683ss.android.ugc.aweme.story.C46618a;
import com.p683ss.android.ugc.aweme.story.C46637c;
import com.p683ss.android.ugc.aweme.util.C47630m;

/* renamed from: com.ss.android.ugc.aweme.LegacyServiceImpl */
public class LegacyServiceImpl implements ILegacyService {
    private C22541ag activityRouterService;
    private C22954am awemeApplicationService;
    private C22547aj benchmarkService;
    private C22567al buildConfigAllService;
    private C24503d captchaHelperService;
    private C22570am challengeDetailLegacyService;
    private C25279s commentEggDataManager;
    private C22573an commerceService;
    private C22787ap crossPlatformLegacyService;
    private C27180c crossPlatformService;
    private C47407b debugService;
    private C27938d discoverAllService;
    private C48421a downloadService;
    private C22955an eventTypeHelper;
    private C31870a followStatisticsService;
    private C32403c forwardStatisticsService;
    private C23257ar freeFlowMemberService;
    private C33180c imAdapterService;
    private C22956ao initAllService;
    private C22568a localService;
    private C27959c loginUtilsService;
    private C36653g longVideoService;
    private C22783ao mComplianceService;
    private IInAppUpdatesService mInAppUpdatesService;
    private ILiveWallPaperService mLiveWallPaperService;
    private IMicroAppService mMicroAppService;
    private INotificationManagerService mNotificationManagerService;
    private ISettingManagerService mSettingManagerService;
    private C36666k mainPageExperimentService;
    private C36667l mainPageMobHelper;
    private C36669m mainPageService;
    private C37023e mixHelperService;
    private C37108f mlService;
    private C39874g multiAccountService;
    private C37736a nearbyAllService;
    private C38498c openSDKUtilsService;
    private C23326ax pluginUtilsAllService;
    private C38955a poiAllService;
    private C23328ay preloadApiService;
    private C28215b rankHelperService;
    private C45691d splashService;
    private C46039j stickerService;
    private C22711b timeLockRulerService;
    private C23769bd ugAllService;
    private C20849a xiGuaUtilsService;
    IXsService xsService;

    public C39869f getChangeUsernameService() {
        return C29508i.f77295b;
    }

    public C41232c getColdLaunchRequestCombiner() {
        return C41211a.f104656d;
    }

    public C36658c getFollowTabBubbleGuideHelper() {
        return C36655a.f93800a;
    }

    public C41416e getSearchMonitor() {
        return C28668d.f75246f;
    }

    public C28423z getSearchResultStatistics() {
        return C28390aj.f74551a;
    }

    public C41523ad getAbTestManager() {
        return C41589c.m91432a();
    }

    public C32494c getFreeFlowStrategy() {
        return C32492a.m75236a();
    }

    public C46618a getStoryManager() {
        return C46637c.m101192a();
    }

    public C22541ag getActivityRouterService() {
        if (this.activityRouterService == null) {
            this.activityRouterService = new C27950l();
        }
        return this.activityRouterService;
    }

    public C22954am getAwemeApplicationService() {
        if (this.awemeApplicationService == null) {
            this.awemeApplicationService = new C23130o();
        }
        return this.awemeApplicationService;
    }

    public C22547aj getBenchmarkService() {
        if (this.benchmarkService == null) {
            this.benchmarkService = new C2644l();
        }
        return this.benchmarkService;
    }

    public C22567al getBuildConfigAllService() {
        if (this.buildConfigAllService == null) {
            this.buildConfigAllService = new C27986w();
        }
        return this.buildConfigAllService;
    }

    public C24503d getCaptchaHelperService() {
        if (this.captchaHelperService == null) {
            this.captchaHelperService = new C24502c();
        }
        return this.captchaHelperService;
    }

    public C22570am getChallengeDetailLegacyService() {
        if (this.challengeDetailLegacyService == null) {
            this.challengeDetailLegacyService = new C24558c();
        }
        return this.challengeDetailLegacyService;
    }

    public C25279s getCommentEggDataManager() {
        if (this.commentEggDataManager == null) {
            this.commentEggDataManager = new C25150d();
        }
        return this.commentEggDataManager;
    }

    public C22573an getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new C25912i();
        }
        return this.commerceService;
    }

    public C22783ao getComplianceService() {
        if (this.mComplianceService == null) {
            this.mComplianceService = new C40872d();
        }
        return this.mComplianceService;
    }

    public C22787ap getCrossPlatformLegacyService() {
        if (this.crossPlatformLegacyService == null) {
            this.crossPlatformLegacyService = new CrossPlatformLegacyServiceImpl();
        }
        return this.crossPlatformLegacyService;
    }

    public C27180c getCrossPlatformService() {
        if (this.crossPlatformService == null) {
            this.crossPlatformService = new C27093a();
        }
        return this.crossPlatformService;
    }

    public C47407b getDebugService() {
        if (this.debugService == null) {
            this.debugService = new C47630m();
        }
        return this.debugService;
    }

    public C27938d getDiscoverAllService() {
        if (this.discoverAllService == null) {
            this.discoverAllService = new C27711a();
        }
        return this.discoverAllService;
    }

    public C48421a getDownloaderService() {
        if (this.downloadService == null) {
            this.downloadService = new C23075a();
        }
        return this.downloadService;
    }

    public C22955an getEventTypeHelper() {
        if (this.eventTypeHelper == null) {
            this.eventTypeHelper = new C22929ag();
        }
        return this.eventTypeHelper;
    }

    public C31870a getFollowStatisticsService() {
        if (this.followStatisticsService == null) {
            this.followStatisticsService = new C37880c();
        }
        return this.followStatisticsService;
    }

    public C32403c getForwardStatisticsService() {
        if (this.forwardStatisticsService == null) {
            this.forwardStatisticsService = new C32402b();
        }
        return this.forwardStatisticsService;
    }

    public C23257ar getFreeFlowMemberService() {
        if (this.freeFlowMemberService == null) {
            this.freeFlowMemberService = new C32471a();
        }
        return this.freeFlowMemberService;
    }

    public C33180c getIMAdapterService() {
        if (this.imAdapterService == null) {
            this.imAdapterService = new C33197h();
        }
        return this.imAdapterService;
    }

    public IInAppUpdatesService getInAppUpdatesService() {
        if (this.mInAppUpdatesService == null) {
            this.mInAppUpdatesService = new InAppUpdateServiceImpl();
        }
        return this.mInAppUpdatesService;
    }

    public C22956ao getInitService() {
        if (this.initAllService == null) {
            this.initAllService = new C22957ap();
        }
        return this.initAllService;
    }

    public ILiveWallPaperService getLiveWallPaperService() {
        if (this.mLiveWallPaperService == null) {
            this.mLiveWallPaperService = new LiveWallPaperServiceImpl();
        }
        return this.mLiveWallPaperService;
    }

    public C22568a getLocalService() {
        if (this.localService == null) {
            this.localService = new C22569b();
        }
        return this.localService;
    }

    public C27959c getLoginUtilsService() {
        if (this.loginUtilsService == null) {
            this.loginUtilsService = new C27974o();
        }
        return this.loginUtilsService;
    }

    public C36653g getLongVideoService() {
        if (this.longVideoService == null) {
            this.longVideoService = new C36675q();
        }
        return this.longVideoService;
    }

    public C37108f getMLService() {
        if (this.mlService == null) {
            this.mlService = new C37112i();
        }
        return this.mlService;
    }

    public C36666k getMainPageExperimentService() {
        if (this.mainPageExperimentService == null) {
            this.mainPageExperimentService = new C36554ce();
        }
        return this.mainPageExperimentService;
    }

    public C36667l getMainPageMobHelper() {
        if (this.mainPageMobHelper == null) {
            this.mainPageMobHelper = new C36648d();
        }
        return this.mainPageMobHelper;
    }

    public C36669m getMainPageService() {
        if (this.mainPageService == null) {
            this.mainPageService = new C36602du();
        }
        return this.mainPageService;
    }

    public IMicroAppService getMicroAppService() {
        if (this.mMicroAppService == null) {
            this.mMicroAppService = new C29657a();
        }
        return this.mMicroAppService;
    }

    public C37023e getMixHelperService() {
        if (this.mixHelperService == null) {
            this.mixHelperService = new C37086q();
        }
        return this.mixHelperService;
    }

    public C39874g getMultiAccountService() {
        if (this.multiAccountService == null) {
            this.multiAccountService = new MultiAccountServiceImpl();
        }
        return this.multiAccountService;
    }

    public C37736a getNearbyAllService() {
        if (this.nearbyAllService == null) {
            this.nearbyAllService = new C37737b();
        }
        return this.nearbyAllService;
    }

    public INotificationManagerService getNotificationManagerService() {
        if (this.mNotificationManagerService == null) {
            this.mNotificationManagerService = new NotificationManagerServiceiImpl();
        }
        return this.mNotificationManagerService;
    }

    public C38498c getOpenSDKUtilsService() {
        if (this.openSDKUtilsService == null) {
            this.openSDKUtilsService = new C38512f();
        }
        return this.openSDKUtilsService;
    }

    public C23326ax getPluginUtilsAllService() {
        if (this.pluginUtilsAllService == null) {
            this.pluginUtilsAllService = new C23866bo();
        }
        return this.pluginUtilsAllService;
    }

    public C38955a getPoiAllService() {
        if (this.poiAllService == null) {
            this.poiAllService = new C39063e();
        }
        return this.poiAllService;
    }

    public C23328ay getPreloadApiService() {
        if (this.preloadApiService == null) {
            this.preloadApiService = new C23871bp();
        }
        return this.preloadApiService;
    }

    public C28215b getRankHelperService() {
        if (this.rankHelperService == null) {
            this.rankHelperService = new C28217d();
        }
        return this.rankHelperService;
    }

    public ISettingManagerService getSettingManagerService() {
        if (this.mSettingManagerService == null) {
            this.mSettingManagerService = new SettingManagerServiceImpl();
        }
        return this.mSettingManagerService;
    }

    public C45691d getSplashService() {
        if (this.splashService == null) {
            this.splashService = new C45707o();
        }
        return this.splashService;
    }

    public C46039j getStickerService() {
        if (this.stickerService == null) {
            this.stickerService = new C46411s();
        }
        return this.stickerService;
    }

    public C22711b getTimeLockRulerService() {
        if (this.timeLockRulerService == null) {
            this.timeLockRulerService = new C22725j();
        }
        return this.timeLockRulerService;
    }

    public C23769bd getUgAllService() {
        if (this.ugAllService == null) {
            this.ugAllService = new C24364bv();
        }
        return this.ugAllService;
    }

    public C20849a getXiGuaUtilsService() {
        if (this.xiGuaUtilsService == null) {
            this.xiGuaUtilsService = new C20851c();
        }
        return this.xiGuaUtilsService;
    }

    public IXsService getXsService() {
        if (this.xsService == null) {
            this.xsService = new C48419c();
        }
        return this.xsService;
    }

    public static ILegacyService createILegacyServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ILegacyService.class);
        if (a != null) {
            return (ILegacyService) a;
        }
        if (C27991b.f73462aS == null) {
            synchronized (ILegacyService.class) {
                if (C27991b.f73462aS == null) {
                    C27991b.f73462aS = new LegacyServiceImpl();
                }
            }
        }
        return (LegacyServiceImpl) C27991b.f73462aS;
    }

    public C30781ay getLocationPopupManager(Activity activity) {
        return new C30797bi(activity);
    }
}
