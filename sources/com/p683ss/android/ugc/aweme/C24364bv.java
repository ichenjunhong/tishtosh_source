package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c.C47416a;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c.C47417b;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47485d;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bv */
public final class C24364bv implements C23769bd {
    /* renamed from: a */
    public final void mo49241a(boolean z) {
        I18nBridgeService.getBridgeService_Monster().increaseViewedCount(z);
    }

    /* renamed from: a */
    public final void mo49240a(String str, String str2) {
        I18nBridgeService.getBridgeService_Monster().trackAppsFlyerEvent(str, str2);
    }

    /* renamed from: a */
    public final void mo49232a() {
        I18nBridgeService.getBridgeService_Monster().checkOnLineTimer();
    }

    /* renamed from: c */
    public final void mo49246c() {
        I18nBridgeService.getBridgeService_Monster().onRecommendFeedStopForLanguage();
    }

    /* renamed from: d */
    public final void mo49248d() {
        I18nBridgeService.getBridgeService_Monster().onFeedStop();
    }

    /* renamed from: e */
    public final SQLiteDatabase mo49250e() {
        return I18nBridgeService.getBridgeService_Monster().getAppOpenReadDB();
    }

    /* renamed from: b */
    public final boolean mo49245b() {
        return I18nBridgeService.getBridgeService_Monster().isUploadContactsNoticeDialogShowing();
    }

    /* renamed from: e */
    public final void mo49251e(Context context) {
        C47818dm.m103459b(context);
    }

    /* renamed from: f */
    public final boolean mo49252f(Context context) {
        return C47819dn.m103457a(context);
    }

    /* renamed from: b */
    public final void mo49243b(Context context) {
        I18nBridgeService.getBridgeService_Monster().checkContentDialogNeedShow(context);
    }

    /* renamed from: b */
    public final void mo49244b(boolean z) {
        if (z) {
            C47415c.f119634a = true;
            C47411b.m102789a("进入点赞列表，条件满足");
            return;
        }
        C47411b.m102789a("进入点赞列表，但点赞条件不满足");
    }

    /* renamed from: c */
    public final void mo49247c(Context context) {
        I18nBridgeService.getBridgeService_Monster().onFeedStartForInitialChooseLanguage(context);
    }

    /* renamed from: a */
    public final void mo49233a(int i) {
        int i2;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            LikePraiseDialogInfo likePraiseDialogInfo = b.getLikePraiseDialogInfo();
            C52711k.m112236a((Object) likePraiseDialogInfo, "SettingsReader.get().likePraiseDialogInfo");
            Integer newLikeNum = likePraiseDialogInfo.getNewLikeNum();
            C52711k.m112236a((Object) newLikeNum, "SettingsReader.get().lik…aiseDialogInfo.newLikeNum");
            i2 = newLikeNum.intValue();
        } catch (C10174a unused) {
            i2 = 2;
        }
        if (i >= i2) {
            C47415c.f119634a = true;
            C47411b.m102789a("进入点赞列表，条件满足");
            return;
        }
        C47411b.m102789a("进入点赞列表，但点赞条件不满足");
    }

    /* renamed from: d */
    public final void mo49249d(Context context) {
        if (C47415c.f119634a) {
            C47415c.f119634a = false;
            C0013i.m12a(300).mo20a((C0011g<TResult, TContinuationResult>) new C47416a<TResult,TContinuationResult>(context), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C47417b<TResult,TContinuationResult>(context), C0013i.f25b);
            return;
        }
        C47411b.f119629b.mo94690b("点赞条件未满足或非从点赞列表返回");
        I18nBridgeService.getBridgeService_Monster().tryShowNotificationGuideDialog(context);
    }

    /* renamed from: a */
    public final void mo49236a(Context context) {
        I18nBridgeService.getBridgeService_Monster().tryShowMoneyGrowthDialog(context);
    }

    /* renamed from: a */
    public final void mo49239a(String str) {
        I18nBridgeService.getBridgeService_Monster().trySetJumpToFissionH5(str);
    }

    /* renamed from: a */
    public final void mo49234a(int i, boolean z) {
        I18nBridgeService.getBridgeService_Monster().readTaskPlayerCycle(i, false);
    }

    /* renamed from: a */
    public final void mo49235a(Activity activity, boolean z) {
        I18nBridgeService.getBridgeService_Monster().checkForUpdate(activity, false, "");
    }

    /* renamed from: a */
    public final void mo49237a(Context context, Aweme aweme) {
        I18nBridgeService.getBridgeService_Monster().onFeedStartForContentLanguageGuide(context, aweme);
    }

    /* renamed from: a */
    public final void mo49238a(Context context, String str) {
        I18nBridgeService.getBridgeService_Monster().onFissionPendantViewClicked(context, str);
    }

    /* renamed from: a */
    public final boolean mo49242a(Context context, String str, String str2) {
        return C47485d.m102882a(context, str, str2);
    }
}
