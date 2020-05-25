package com.p683ss.android.ugc.aweme.login;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.bridgeservice.C23980e;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.freeflowcard.C32472b;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.smartisan.C36308a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notification.C38205g;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45455t;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.login.j */
public final /* synthetic */ class C27969j implements Callable {

    /* renamed from: a */
    private final Bundle f73401a;

    public C27969j(Bundle bundle) {
        this.f73401a = bundle;
    }

    public final Object call() {
        Bundle bundle = this.f73401a;
        C27967h.f73399a = true;
        bundle.putBoolean("is_start_by_switch_account", true);
        C22282t.m55152f(false);
        SharePrefCache.inst().clearCache();
        C38046d.m85105e();
        C38205g.m85374a();
        C38046d.m85101a(false, 5);
        C23980e.m58787a().afterSwitchAccount();
        C32474a.m75189a().mo65793d();
        C32472b.m75185a();
        C32472b.m75186b();
        C41549aq.m91378a().mo85331a(C27972m.f73404a);
        C41549aq.m91378a().mo85328a(3);
        SearchHistoryManager.inst().clearForAccountChange();
        C41589c.m91432a().mo85342b();
        C20854a.m53167g().checkIn();
        Context a = C11010c.m22280a();
        if (!C20854a.m53167g().isChildrenMode() || C20854a.m53167g().allUidList().size() <= 1) {
            bundle.putString("switch_account_success_toast_text", a.getString(R.string.hwx, new Object[]{C20854a.m53167g().getCurUser().getNickname()}));
        } else {
            C20854a.m53167g().logoutAllBackgroundUser().mo6158b();
            bundle.putString("switch_account_success_toast_text", a.getString(R.string.b22));
        }
        C33194e.m76279d().resetLoginState();
        C27967h.m66731b();
        TimeLockRuler.clearCache();
        C22714d.f60914a.mo47118a(null);
        C45455t.m99049a();
        bundle.putBoolean("need_restart", true);
        C36173w.m81665a().getLive().mo74831q();
        C27967h.m66728a();
        AnchorListManager.m62138a();
        C27967h.m66732c();
        C47915gg.m103644a();
        C20854a.m53163c().saveSharedAccount(null);
        C36308a.m81948a("switch_account");
        return bundle;
    }
}
