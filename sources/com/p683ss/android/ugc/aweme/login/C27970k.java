package com.p683ss.android.ugc.aweme.login;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.p1411c.C23489h;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.bridgeservice.C23980e;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.freeflowcard.C32472b;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.smartisan.C36308a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notification.C38205g;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.qrcode.C41009f;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45455t;
import com.p683ss.android.ugc.aweme.story.api.C46628f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.login.k */
public final /* synthetic */ class C27970k implements Callable {

    /* renamed from: a */
    private final Bundle f73402a;

    public C27970k(Bundle bundle) {
        this.f73402a = bundle;
    }

    public final Object call() {
        Bundle bundle = this.f73402a;
        C20854a.m53161a().preLoadOrRequest();
        Boolean valueOf = Boolean.valueOf(false);
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "publish_sync_sp", 0);
        if (a != null) {
            Editor edit = a.edit();
            if (edit != null) {
                edit.putBoolean("is_setting_synced", valueOf.booleanValue());
                C9402b.m18594a(edit);
            }
        }
        C22282t.m55152f(true);
        SharePrefCache.inst().clearCache();
        C38046d.m85105e();
        C38205g.m85374a();
        C23980e.m58787a().afterLogOut();
        C37940g.m84832a().mo77417c();
        C32474a.m75189a().mo65793d();
        C32472b.m75185a();
        C32472b.m75186b();
        C41549aq.m91378a().mo85328a(4);
        SearchHistoryManager.inst().clearForAccountChange();
        C41589c.m91432a().mo85342b();
        C27967h.m66731b();
        TimeLockRuler.clearCache();
        C22721g gVar = C22721g.f60930d;
        TeenageModeSetting teenageModeSetting = C22721g.f60927a;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(false);
        }
        TeenageModeSetting teenageModeSetting2 = C22721g.f60927a;
        if (teenageModeSetting2 != null) {
            teenageModeSetting2.setTimeLockSelfInMin(0);
        }
        TeenageModeSetting teenageModeSetting3 = C22721g.f60927a;
        if (teenageModeSetting3 != null) {
            teenageModeSetting3.setMinorControlType(0);
        }
        C22721g.m55964a(C22721g.f60927a);
        TimeLockRuler.removeUserSetting();
        TimeLockRuler.removeUnLoginUserSetting();
        C22714d.f60914a.mo47118a(null);
        C41009f.m90639d(0);
        C41009f.m90639d(1);
        C45455t.m99049a();
        bundle.putBoolean("restart_from_logout", true);
        C40869c.f104035d.mo83204d();
        C27967h.m66732c();
        new Handler().postDelayed(new C27971l(bundle), 500);
        C33194e.m76279d().refreshLoginState();
        AVExternalServiceImpl.getAVServiceImpl_Monster().configService().userAction(2);
        C33194e.m76279d().onFlipChatMsgUnbind(false);
        C23542f.m57719d().mo48709b("last_share_type", (String) null);
        C36173w.m81665a().getLive().mo74831q();
        Object a2 = C27991b.m66756a(C46628f.class);
        if (a2 != null) {
            C46628f fVar = (C46628f) a2;
        } else {
            C46628f fVar2 = (C46628f) C20302a.m50070a(C46628f.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        C47718bf.m103288a(new C23489h());
        C47915gg.m103644a();
        C30134ak.m70713c();
        C20854a.m53163c().clearSharedAccount(null);
        if (C36308a.m81949a()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", "");
            contentValues.put("install_id", "");
            C36308a.m81947a(contentValues, "log_out");
        }
        AnchorListManager.m62138a();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("user_mode", 0);
        bundle2.putInt("user_period", 0);
        AppLog.setCustomerHeader(bundle2);
        return bundle;
    }
}
