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

/* renamed from: com.ss.android.ugc.aweme.services.IBusinessComponentService */
public interface IBusinessComponentService {
    C22690b getAppStateReporter();

    C23981f getBusinessBridgeService();

    C27423an getDetailPageOperatorProvider();

    C41109e getFeedRecommendUserManager();

    C33198i getIMBusinessService();

    C22565c getLabService();

    C46639b getLiveAllService();

    C36082a getLiveStateManager();

    C36696q getMainHelperService();

    C31039a getMaskLayerOptionsAdapter(Context context);

    C29766b getMediumWebViewRefHolder();

    IParentalPlatformService getParentalPlatformService();

    Class<? extends C23689d> getProfilePageClass();

    C22703a getTimeLockHelperService();

    Dialog newOptionsDialog(Context context, Aweme aweme, String str);

    C36670n newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C23699m mVar);
}
