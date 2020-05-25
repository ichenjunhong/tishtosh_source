package com.p683ss.android.ugc.aweme.commercialize;

import com.p683ss.android.ugc.aweme.app.C22953al;
import com.p683ss.android.ugc.aweme.commerce.C25512d;
import com.p683ss.android.ugc.aweme.commercialize.api.C25643b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25828l;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25752a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25875ag;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25876ah;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25877ai;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25878aj;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25879ak;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25882an;
import com.p683ss.android.ugc.aweme.commercialize.feed.IFeedTypeService;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25898a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25952c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26049ap;
import com.p683ss.android.ugc.aweme.commercialize.search.C26206c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26228k;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26229l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26246n;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26230a;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26306a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26419bd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26420be;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26421bf;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26422bg;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26424bi;
import com.p683ss.android.ugc.aweme.splash.C45689b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService */
public interface ILegacyCommercializeService {
    Boolean enableCommentEggRefactor();

    Boolean enableEggPendantRefactor();

    C25875ag getAdComponentMonitorLog();

    C26419bd getAdDataUtilsService();

    C25512d getAdOmSdkManagerService();

    C25876ah getAdOpenUtilsService();

    C25877ai getAdRouterTaskFactoryService();

    C25878aj getAdShowFilterManager();

    C26420be getAdShowUtilsService();

    C22953al getAdsUriJumperService();

    C26421bf getAwemeAdRankService();

    C26228k getAwesomeSplashPreloadManager();

    C26229l getAwesomeSplashShowUtilsService();

    C25879ak getCommerceDataService();

    C25828l getEggMonitorLog();

    C25882an getFeedRawAdLogService();

    IFeedTypeService getFeedTypeService();

    C26422bg getGPPageService();

    C25752a getH5EggController(CommerceEggLayout commerceEggLayout);

    C25643b getLinkDataApiService();

    C25952c getLinkTypeTagsPriorityManager();

    C26230a getLiveAwesomeSplashManager();

    C25898a getPreloadAdWebHelper();

    C26206c getSearchCommercializeService();

    C26049ap getSendTrackService();

    C45689b getSplashAdActivityService();

    C26246n getSplashOptimizeLogHelper();

    C26306a getSymphonyAdManager();

    C26424bi getVastUtilsService();
}
