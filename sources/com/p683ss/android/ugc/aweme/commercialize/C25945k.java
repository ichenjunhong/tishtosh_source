package com.p683ss.android.ugc.aweme.commercialize;

import com.p683ss.android.ugc.aweme.app.C22953al;
import com.p683ss.android.ugc.aweme.commerce.C25512d;
import com.p683ss.android.ugc.aweme.commercialize.api.C25643b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25828l;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25752a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25876ah;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25879ak;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25882an;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25898a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25952c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26049ap;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.k */
public final class C25945k {
    /* renamed from: a */
    public static ILegacyCommercializeService m62909a() {
        return LegacyCommercializeServiceImpl.createILegacyCommercializeServicebyMonsterPlugin();
    }

    /* renamed from: b */
    public static C25882an m62911b() {
        return m62909a().getFeedRawAdLogService();
    }

    /* renamed from: c */
    public static C26049ap m62912c() {
        return m62909a().getSendTrackService();
    }

    /* renamed from: d */
    public static C25879ak m62913d() {
        return m62909a().getCommerceDataService();
    }

    /* renamed from: e */
    public static C25876ah m62914e() {
        return m62909a().getAdOpenUtilsService();
    }

    /* renamed from: f */
    public static C26229l m62915f() {
        return m62909a().getAwesomeSplashShowUtilsService();
    }

    /* renamed from: g */
    public static C26420be m62916g() {
        return m62909a().getAdShowUtilsService();
    }

    /* renamed from: h */
    public static C25512d m62917h() {
        return m62909a().getAdOmSdkManagerService();
    }

    /* renamed from: i */
    public static C26228k m62918i() {
        return m62909a().getAwesomeSplashPreloadManager();
    }

    /* renamed from: j */
    public static C26230a m62919j() {
        return m62909a().getLiveAwesomeSplashManager();
    }

    /* renamed from: k */
    public static C26306a m62920k() {
        return m62909a().getSymphonyAdManager();
    }

    /* renamed from: l */
    public static C25952c m62921l() {
        return m62909a().getLinkTypeTagsPriorityManager();
    }

    /* renamed from: m */
    public static C26246n m62922m() {
        return m62909a().getSplashOptimizeLogHelper();
    }

    /* renamed from: n */
    public static C26424bi m62923n() {
        return m62909a().getVastUtilsService();
    }

    /* renamed from: o */
    public static C25643b m62924o() {
        return m62909a().getLinkDataApiService();
    }

    /* renamed from: p */
    public static C25898a m62925p() {
        return m62909a().getPreloadAdWebHelper();
    }

    /* renamed from: q */
    public static C22953al m62926q() {
        return m62909a().getAdsUriJumperService();
    }

    /* renamed from: r */
    public static C45689b m62927r() {
        return m62909a().getSplashAdActivityService();
    }

    /* renamed from: s */
    public static C26419bd m62928s() {
        return m62909a().getAdDataUtilsService();
    }

    /* renamed from: t */
    public static Boolean m62929t() {
        return m62909a().enableCommentEggRefactor();
    }

    /* renamed from: u */
    public static Boolean m62930u() {
        return m62909a().enableEggPendantRefactor();
    }

    /* renamed from: v */
    public static C26421bf m62931v() {
        return m62909a().getAwemeAdRankService();
    }

    /* renamed from: w */
    public static C25828l m62932w() {
        return m62909a().getEggMonitorLog();
    }

    /* renamed from: x */
    public static C26422bg m62933x() {
        return m62909a().getGPPageService();
    }

    /* renamed from: a */
    public static C25752a m62910a(CommerceEggLayout commerceEggLayout) {
        return m62909a().getH5EggController(commerceEggLayout);
    }
}
