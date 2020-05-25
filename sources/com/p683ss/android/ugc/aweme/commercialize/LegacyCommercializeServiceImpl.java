package com.p683ss.android.ugc.aweme.commercialize;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C22953al;
import com.p683ss.android.ugc.aweme.app.C23080e;
import com.p683ss.android.ugc.aweme.commerce.C25512d;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a;
import com.p683ss.android.ugc.aweme.commercialize.api.C25643b;
import com.p683ss.android.ugc.aweme.commercialize.api.C25645d;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25770d;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25824k;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25828l;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25752a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25862a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25869ac;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25875ag;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25876ah;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25877ai;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25878aj;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25879ak;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25882an;
import com.p683ss.android.ugc.aweme.commercialize.feed.FeedTypeServiceImpl;
import com.p683ss.android.ugc.aweme.commercialize.feed.IFeedTypeService;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25898a;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b;
import com.p683ss.android.ugc.aweme.commercialize.link.C25952c;
import com.p683ss.android.ugc.aweme.commercialize.link.C25974i;
import com.p683ss.android.ugc.aweme.commercialize.log.C26049ap;
import com.p683ss.android.ugc.aweme.commercialize.log.C26062az;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26084i;
import com.p683ss.android.ugc.aweme.commercialize.search.C26206c;
import com.p683ss.android.ugc.aweme.commercialize.search.C26211g;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26226i;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26228k;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26229l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26246n;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26252s;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26230a;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26306a;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26368ab;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26370ad;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26390ao;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26419bd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26420be;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26421bf;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26422bg;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26424bi;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26501ce;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26513g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26541x;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26457c;
import com.p683ss.android.ugc.aweme.services.CommerceDataServiceImpl;
import com.p683ss.android.ugc.aweme.splash.C45689b;
import com.p683ss.android.ugc.aweme.splash.C45695h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl */
public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {
    private C26422bg GPPageService;
    private C26419bd adDataUtilsService;
    private C25876ah adOpenUtilsService;
    private C25877ai adRouterTaskFactoryService;
    private C26420be adShowUtilsService;
    private C22953al adsUriJumperService;
    private C26229l awesomeSplashShowUtilsService;
    private C25879ak commerceDataService;
    private C25882an feedRawAdLogService;
    private IFeedTypeService feedTypeService;
    private C25643b linkDataApiService;
    private C25952c linkTypeTagsPriorityManager;
    private C26206c searchCommercializeService;
    private C26049ap sendTrackService;
    private C45689b splashAdActivityService;
    private C26424bi vastUtilsService;

    public C25875ag getAdComponentMonitorLog() {
        return C26072c.f68845b;
    }

    public C26421bf getAwemeAdRankService() {
        return C26390ao.f69621b;
    }

    public C25828l getEggMonitorLog() {
        return C26084i.f68884a;
    }

    public C25898a getPreloadAdWebHelper() {
        return C25899b.f68430b;
    }

    public C26246n getSplashOptimizeLogHelper() {
        return C26252s.f69309d;
    }

    public Boolean enableCommentEggRefactor() {
        return Boolean.valueOf(C25770d.f68146e);
    }

    public Boolean enableEggPendantRefactor() {
        return Boolean.valueOf(C25823j.f68267a);
    }

    public C25512d getAdOmSdkManagerService() {
        return C25493a.m62004a();
    }

    public C25878aj getAdShowFilterManager() {
        return C25862a.m62591a();
    }

    public C26228k getAwesomeSplashPreloadManager() {
        return C26217c.m63502a();
    }

    public C26230a getLiveAwesomeSplashManager() {
        return C26237e.m63579b();
    }

    public C26306a getSymphonyAdManager() {
        return SymphonyAdManager.m63648a();
    }

    public C26419bd getAdDataUtilsService() {
        if (this.adDataUtilsService == null) {
            this.adDataUtilsService = new C26513g();
        }
        return this.adDataUtilsService;
    }

    public C25876ah getAdOpenUtilsService() {
        if (this.adOpenUtilsService == null) {
            this.adOpenUtilsService = new C26541x();
        }
        return this.adOpenUtilsService;
    }

    public C25877ai getAdRouterTaskFactoryService() {
        if (this.adRouterTaskFactoryService == null) {
            this.adRouterTaskFactoryService = new C26368ab();
        }
        return this.adRouterTaskFactoryService;
    }

    public C26420be getAdShowUtilsService() {
        if (this.adShowUtilsService == null) {
            this.adShowUtilsService = new C26370ad();
        }
        return this.adShowUtilsService;
    }

    public C22953al getAdsUriJumperService() {
        if (this.adsUriJumperService == null) {
            this.adsUriJumperService = new C23080e();
        }
        return this.adsUriJumperService;
    }

    public C26229l getAwesomeSplashShowUtilsService() {
        if (this.awesomeSplashShowUtilsService == null) {
            this.awesomeSplashShowUtilsService = new C26226i();
        }
        return this.awesomeSplashShowUtilsService;
    }

    public C25879ak getCommerceDataService() {
        if (this.commerceDataService == null) {
            this.commerceDataService = new CommerceDataServiceImpl();
        }
        return this.commerceDataService;
    }

    public C25882an getFeedRawAdLogService() {
        if (this.feedRawAdLogService == null) {
            this.feedRawAdLogService = new C25869ac();
        }
        return this.feedRawAdLogService;
    }

    public IFeedTypeService getFeedTypeService() {
        if (this.feedTypeService == null) {
            this.feedTypeService = new FeedTypeServiceImpl();
        }
        return this.feedTypeService;
    }

    public C26422bg getGPPageService() {
        if (this.GPPageService == null) {
            this.GPPageService = new C26457c();
        }
        return this.GPPageService;
    }

    public C25643b getLinkDataApiService() {
        if (this.linkDataApiService == null) {
            this.linkDataApiService = new C25645d();
        }
        return this.linkDataApiService;
    }

    public C25952c getLinkTypeTagsPriorityManager() {
        if (this.linkTypeTagsPriorityManager == null) {
            this.linkTypeTagsPriorityManager = new C25974i();
        }
        return this.linkTypeTagsPriorityManager;
    }

    public C26206c getSearchCommercializeService() {
        if (this.searchCommercializeService == null) {
            this.searchCommercializeService = new C26211g();
        }
        return this.searchCommercializeService;
    }

    public C26049ap getSendTrackService() {
        if (this.sendTrackService == null) {
            this.sendTrackService = new C26062az();
        }
        return this.sendTrackService;
    }

    public C45689b getSplashAdActivityService() {
        if (this.splashAdActivityService == null) {
            this.splashAdActivityService = new C45695h();
        }
        return this.splashAdActivityService;
    }

    public C26424bi getVastUtilsService() {
        if (this.vastUtilsService == null) {
            this.vastUtilsService = new C26501ce();
        }
        return this.vastUtilsService;
    }

    public static ILegacyCommercializeService createILegacyCommercializeServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ILegacyCommercializeService.class);
        if (a != null) {
            return (ILegacyCommercializeService) a;
        }
        if (C27991b.f73477ah == null) {
            synchronized (ILegacyCommercializeService.class) {
                if (C27991b.f73477ah == null) {
                    C27991b.f73477ah = new LegacyCommercializeServiceImpl();
                }
            }
        }
        return (LegacyCommercializeServiceImpl) C27991b.f73477ah;
    }

    public C25752a getH5EggController(CommerceEggLayout commerceEggLayout) {
        return new C25824k(commerceEggLayout);
    }
}
