package com.p683ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.utils.C22294b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.bridgeservice.C23980e;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.freeflowcard.C32472b;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask;
import com.p683ss.android.ugc.aweme.live.C36095h;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.smartisan.C36308a;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.login.h */
public final class C27967h {

    /* renamed from: a */
    public static boolean f73399a;

    /* renamed from: a */
    static void m66728a() {
        new YoutubeRefreshTask().run(C11010c.m22280a());
    }

    /* renamed from: b */
    static void m66731b() {
        IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
        if (provideWalletService_Monster != null) {
            provideWalletService_Monster.clearWallet();
        }
    }

    /* renamed from: c */
    static void m66732c() {
        C36095h liveOuterSettingService = C36173w.m81665a().getLiveOuterSettingService();
        if (liveOuterSettingService != null && liveOuterSettingService.mo74816a() != null) {
            liveOuterSettingService.mo74816a().mo74849a(C11010c.m22280a());
        }
    }

    /* renamed from: a */
    public static void m66729a(Bundle bundle) {
        Intent mainActivityIntent = MainActivity.getMainActivityIntent(C11010c.m22280a());
        mainActivityIntent.putExtras(bundle);
        mainActivityIntent.setFlags(268468224);
        Activity g = C11016e.m22312g();
        if (g != null) {
            g.startActivity(mainActivityIntent);
            if (!g.isFinishing()) {
                if (VERSION.SDK_INT >= 21) {
                    g.finishAndRemoveTask();
                } else {
                    g.finish();
                }
            }
        } else if (AwemeApplication.m56199a() != null) {
            AwemeApplication.m56199a().startActivity(mainActivityIntent);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Bundle m66730b(Bundle bundle) throws Exception {
        AppLog.setUserId(Long.parseLong(C20854a.m53167g().getCurUserId()));
        AppLog.setSessionKey(C20854a.m53167g().getSessionKey());
        C22282t.m55152f(false);
        C32474a.m75189a().mo65793d();
        C32472b.m75185a();
        C32472b.m75186b();
        C41549aq.m91378a().mo85331a(C27973n.f73405a);
        C41549aq.m91378a().mo85328a(3);
        C41589c.m91432a().mo85342b();
        C20902b.m53242a().checkIn();
        C23980e.m58787a().afterLogIn();
        C33194e.m76279d().refreshLoginState();
        SharePrefCache.inst().getTodayVideoPlayTime().mo47776a(Long.valueOf(0));
        if (TimeLockRuler.isInTeenagerModeNewVersion() && bundle != null) {
            bundle.putBoolean("need_restart", true);
        }
        if (((Boolean) SharePrefCache.inst().getIsFirstLaunch().mo47782d()).booleanValue()) {
            SharePrefCache.inst().getIsFirstLaunch().mo47776a(Boolean.valueOf(false));
        }
        C38046d.m85101a(false, 5);
        C36173w.m81665a().getLive().mo74831q();
        AnchorListManager.m62138a();
        m66728a();
        m66732c();
        C47915gg.m103644a();
        C20854a.m53163c().saveSharedAccount(null);
        C36308a.m81948a("log_in");
        C30134ak.f78653b.storeBoolean("is_new_user", C20854a.m53167g().isNewUser());
        C32616c.f84865a.getContactService();
        C22294b.m55179a(2);
        return bundle;
    }
}
