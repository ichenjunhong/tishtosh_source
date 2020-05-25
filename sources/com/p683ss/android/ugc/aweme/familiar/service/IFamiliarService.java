package com.p683ss.android.ugc.aweme.familiar.service;

import android.content.Context;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29635b;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29636c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.IFamiliarService */
public interface IFamiliarService {
    boolean browseRecordNeedAwemeStatsUpload();

    boolean browseRecordNeedFamiliarUpload();

    boolean checkShowPushNotificationGuide(Context context);

    HashMap<String, Integer> getAwemeImprIdMap();

    C29652d getFamiliarExperimentService();

    Map<String, Integer> getFeedOrderMap();

    C29635b getPushNotificationGuide(Context context);

    String getRecUserType(User user);

    HashMap<String, String> getRecommendReasonMap();

    C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str);

    C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str, boolean z);

    C36678a getUnReadVideoAvatarListController(UnReadCircleView unReadCircleView, String str);

    Widget getVideoBottomInputWidget();

    Widget getVideoFamiliarBarrageWidget();

    Widget getVideoFamiliarFollowWidget();

    Widget getVideoFamiliarLastReadWidget();

    Widget getVideoUserInfoWidget();

    boolean isBarrageNone();

    boolean isEnableNewFamiliarLastReadStyle();

    boolean isFamiliarFeedFullScreen();

    boolean isFamiliarFullScreen();

    boolean isFamiliarTab2Main();

    boolean isFamiliarTab2MainLeft();

    boolean isFamiliarTab2MainMiddle();

    boolean isShowPushNotificationInComment();

    boolean isShowPushNotificationInNotice();

    boolean isTextBarrage();

    boolean isV3Barrage();

    void mobFollowCardBind(Aweme aweme, String str, String str2, String str3, int i);

    void mobFollowFromCard(Aweme aweme, String str, String str2);

    void mobRecommendFamiliarVideoAction(Aweme aweme, String str, String str2, String str3, int i);

    boolean showRightView();

    boolean useBarragePlayer();

    boolean useRecommendReason();
}
