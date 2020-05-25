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
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.b */
public final class C29650b implements IFamiliarService {

    /* renamed from: a */
    public static final C29650b f77509a = new C29650b();

    /* renamed from: b */
    private final /* synthetic */ IFamiliarService f77510b;

    public final boolean browseRecordNeedAwemeStatsUpload() {
        return this.f77510b.browseRecordNeedAwemeStatsUpload();
    }

    public final boolean browseRecordNeedFamiliarUpload() {
        return this.f77510b.browseRecordNeedFamiliarUpload();
    }

    public final boolean checkShowPushNotificationGuide(Context context) {
        C52711k.m112240b(context, "context");
        return this.f77510b.checkShowPushNotificationGuide(context);
    }

    public final HashMap<String, Integer> getAwemeImprIdMap() {
        return this.f77510b.getAwemeImprIdMap();
    }

    public final C29652d getFamiliarExperimentService() {
        return this.f77510b.getFamiliarExperimentService();
    }

    public final Map<String, Integer> getFeedOrderMap() {
        return this.f77510b.getFeedOrderMap();
    }

    public final C29635b getPushNotificationGuide(Context context) {
        C52711k.m112240b(context, "context");
        return this.f77510b.getPushNotificationGuide(context);
    }

    public final String getRecUserType(User user) {
        return this.f77510b.getRecUserType(user);
    }

    public final HashMap<String, String> getRecommendReasonMap() {
        return this.f77510b.getRecommendReasonMap();
    }

    public final C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str) {
        return this.f77510b.getUnReadVideoAvatarFeedController(unReadCircleView, str);
    }

    public final C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str, boolean z) {
        return this.f77510b.getUnReadVideoAvatarFeedController(unReadCircleView, str, z);
    }

    public final C36678a getUnReadVideoAvatarListController(UnReadCircleView unReadCircleView, String str) {
        return this.f77510b.getUnReadVideoAvatarListController(unReadCircleView, str);
    }

    public final Widget getVideoBottomInputWidget() {
        return this.f77510b.getVideoBottomInputWidget();
    }

    public final Widget getVideoFamiliarBarrageWidget() {
        return this.f77510b.getVideoFamiliarBarrageWidget();
    }

    public final Widget getVideoFamiliarFollowWidget() {
        return this.f77510b.getVideoFamiliarFollowWidget();
    }

    public final Widget getVideoFamiliarLastReadWidget() {
        return this.f77510b.getVideoFamiliarLastReadWidget();
    }

    public final Widget getVideoUserInfoWidget() {
        return this.f77510b.getVideoUserInfoWidget();
    }

    public final boolean isBarrageNone() {
        return this.f77510b.isBarrageNone();
    }

    public final boolean isEnableNewFamiliarLastReadStyle() {
        return this.f77510b.isEnableNewFamiliarLastReadStyle();
    }

    public final boolean isFamiliarFeedFullScreen() {
        return this.f77510b.isFamiliarFeedFullScreen();
    }

    public final boolean isFamiliarFullScreen() {
        return this.f77510b.isFamiliarFullScreen();
    }

    public final boolean isFamiliarTab2Main() {
        return this.f77510b.isFamiliarTab2Main();
    }

    public final boolean isFamiliarTab2MainLeft() {
        return this.f77510b.isFamiliarTab2MainLeft();
    }

    public final boolean isFamiliarTab2MainMiddle() {
        return this.f77510b.isFamiliarTab2MainMiddle();
    }

    public final boolean isShowPushNotificationInComment() {
        return this.f77510b.isShowPushNotificationInComment();
    }

    public final boolean isShowPushNotificationInNotice() {
        return this.f77510b.isShowPushNotificationInNotice();
    }

    public final boolean isTextBarrage() {
        return this.f77510b.isTextBarrage();
    }

    public final boolean isV3Barrage() {
        return this.f77510b.isV3Barrage();
    }

    public final void mobFollowCardBind(Aweme aweme, String str, String str2, String str3, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(str3, "cardType");
        this.f77510b.mobFollowCardBind(aweme, str, str2, str3, i);
    }

    public final void mobFollowFromCard(Aweme aweme, String str, String str2) {
        this.f77510b.mobFollowFromCard(aweme, str, str2);
    }

    public final void mobRecommendFamiliarVideoAction(Aweme aweme, String str, String str2, String str3, int i) {
        this.f77510b.mobRecommendFamiliarVideoAction(aweme, str, str2, str3, i);
    }

    public final boolean showRightView() {
        return this.f77510b.showRightView();
    }

    public final boolean useBarragePlayer() {
        return this.f77510b.useBarragePlayer();
    }

    public final boolean useRecommendReason() {
        return this.f77510b.useRecommendReason();
    }

    private C29650b() {
        IFamiliarService a = C29651c.m69698a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…iliarService::class.java)");
        this.f77510b = a;
    }
}
