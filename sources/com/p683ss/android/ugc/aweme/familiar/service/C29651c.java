package com.p683ss.android.ugc.aweme.familiar.service;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.familiar.experiment.C29645b;
import com.p683ss.android.ugc.aweme.familiar.experiment.FamiliarLastReadExperiment;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29635b;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29636c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.C47494b;
import com.p683ss.android.ugc.aweme.unread.C47495c;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.c */
public final class C29651c implements IFamiliarService {
    public final boolean browseRecordNeedAwemeStatsUpload() {
        return false;
    }

    public final boolean browseRecordNeedFamiliarUpload() {
        return false;
    }

    public final boolean checkShowPushNotificationGuide(Context context) {
        C52711k.m112240b(context, "context");
        return false;
    }

    public final C29635b getPushNotificationGuide(Context context) {
        C52711k.m112240b(context, "context");
        return null;
    }

    public final String getRecUserType(User user) {
        return "";
    }

    public final Widget getVideoBottomInputWidget() {
        return null;
    }

    public final Widget getVideoFamiliarBarrageWidget() {
        return null;
    }

    public final Widget getVideoFamiliarFollowWidget() {
        return null;
    }

    public final Widget getVideoFamiliarLastReadWidget() {
        return null;
    }

    public final Widget getVideoUserInfoWidget() {
        return null;
    }

    public final boolean isBarrageNone() {
        return false;
    }

    public final boolean isFamiliarTab2Main() {
        return false;
    }

    public final boolean isFamiliarTab2MainLeft() {
        return false;
    }

    public final boolean isFamiliarTab2MainMiddle() {
        return false;
    }

    public final boolean isTextBarrage() {
        return false;
    }

    public final boolean isV3Barrage() {
        return false;
    }

    public final void mobFollowCardBind(Aweme aweme, String str, String str2, String str3, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(str3, "cardType");
    }

    public final void mobFollowFromCard(Aweme aweme, String str, String str2) {
    }

    public final void mobRecommendFamiliarVideoAction(Aweme aweme, String str, String str2, String str3, int i) {
    }

    public final boolean showRightView() {
        return false;
    }

    public final boolean useBarragePlayer() {
        return false;
    }

    public final boolean useRecommendReason() {
        return false;
    }

    public final HashMap<String, Integer> getAwemeImprIdMap() {
        return new HashMap<>();
    }

    public final C29652d getFamiliarExperimentService() {
        return new C29649a();
    }

    public final Map<String, Integer> getFeedOrderMap() {
        return new LinkedHashMap<>();
    }

    public final HashMap<String, String> getRecommendReasonMap() {
        return new HashMap<>();
    }

    public final boolean isFamiliarFeedFullScreen() {
        return C29645b.f77507a.mo59864b();
    }

    public final boolean isFamiliarFullScreen() {
        return C29645b.f77507a.mo59864b();
    }

    public final boolean isShowPushNotificationInComment() {
        C29645b bVar = C29645b.f77507a;
        if ((C29645b.m69693a() & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isShowPushNotificationInNotice() {
        C29645b bVar = C29645b.f77507a;
        if ((C29645b.m69693a() & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnableNewFamiliarLastReadStyle() {
        C29645b bVar = C29645b.f77507a;
        if (C10181b.m20511a().mo18168a(FamiliarLastReadExperiment.class, true, "familiar_feed_reach_end_guide", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static IFamiliarService m69698a() {
        Object a = C27991b.m66756a(IFamiliarService.class);
        if (a != null) {
            return (IFamiliarService) a;
        }
        if (C27991b.f73483an == null) {
            synchronized (IFamiliarService.class) {
                if (C27991b.f73483an == null) {
                    C27991b.f73483an = new C29651c();
                }
            }
        }
        return (C29651c) C27991b.f73483an;
    }

    public final C36678a getUnReadVideoAvatarListController(UnReadCircleView unReadCircleView, String str) {
        return new C47495c(unReadCircleView, str);
    }

    public final C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str) {
        C47494b bVar = new C47494b(unReadCircleView, str, false, 4, null);
        return bVar;
    }

    public final C29636c getUnReadVideoAvatarFeedController(UnReadCircleView unReadCircleView, String str, boolean z) {
        return new C47494b(unReadCircleView, str, true);
    }
}
