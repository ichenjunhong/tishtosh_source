package com.p683ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.p683ss.android.ugc.aweme.antiaddic.C22690b;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22703a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.bridgeservice.C23981f;
import com.p683ss.android.ugc.aweme.detail.operators.C27423an;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29766b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31039a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.service.C36696q;
import com.p683ss.android.ugc.aweme.p1336ak.C22565c;
import com.p683ss.android.ugc.aweme.p1807im.C33198i;
import com.p683ss.android.ugc.aweme.recommend.C41109e;
import com.p683ss.android.ugc.aweme.story.live.C46639b;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils */
public class BusinessComponentServiceUtils {
    private static volatile IBusinessComponentService sBusinessComponentService;

    public static C22690b getAppStateReporter() {
        return getBusinessComponentService().getAppStateReporter();
    }

    public static C23981f getBusinessBridgeService() {
        return getBusinessComponentService().getBusinessBridgeService();
    }

    private static IBusinessComponentService getBusinessComponentService() {
        if (sBusinessComponentService == null) {
            sBusinessComponentService = BusinessComponentServiceImpl.createIBusinessComponentServicebyMonsterPlugin();
        }
        return sBusinessComponentService;
    }

    public static C27423an getDetailPageOperatorProvider() {
        return getBusinessComponentService().getDetailPageOperatorProvider();
    }

    public static C41109e getFeedRecommendUserManager() {
        return getBusinessComponentService().getFeedRecommendUserManager();
    }

    public static C33198i getIMBusinessService() {
        return getBusinessComponentService().getIMBusinessService();
    }

    public static C22565c getLabService() {
        return getBusinessComponentService().getLabService();
    }

    public static C46639b getLiveAllService() {
        return getBusinessComponentService().getLiveAllService();
    }

    public static C36082a getLiveStateManager() {
        return getBusinessComponentService().getLiveStateManager();
    }

    public static C36696q getMainHelperService() {
        return getBusinessComponentService().getMainHelperService();
    }

    public static C29766b getMediumWebViewRefHolder() {
        return getBusinessComponentService().getMediumWebViewRefHolder();
    }

    public static IParentalPlatformService getParentalPlatformService() {
        return getBusinessComponentService().getParentalPlatformService();
    }

    public static Class<? extends C23689d> getProfilePageClass() {
        return getBusinessComponentService().getProfilePageClass();
    }

    public static C22703a getTimeLockHelperService() {
        return getBusinessComponentService().getTimeLockHelperService();
    }

    public static C31039a getMaskLayerOptionsAdapter(Context context) {
        return getBusinessComponentService().getMaskLayerOptionsAdapter(context);
    }

    public static Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return getBusinessComponentService().newOptionsDialog(context, aweme, str);
    }

    public static C36670n newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C23699m mVar) {
        return getBusinessComponentService().newScrollSwitchHelper(context, scrollableViewPager, mVar);
    }
}
