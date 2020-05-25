package com.p683ss.android.ugc.aweme.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.webkit.CookieManager;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.account.login.loginlog.LoginLog;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;

/* renamed from: com.ss.android.ugc.aweme.login.SessionExpireReceiver */
public class SessionExpireReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C20854a.m53162b().logout("expired_logout", "sdk_expired_logout");
        C21378a a = C21378a.m53998a();
        String str = "";
        boolean isLogin = C20854a.m53167g().isLogin();
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = "session_expire";
        loginLog.errorUrl = str;
        loginLog.isSuccess = false;
        loginLog.isLogin = isLogin;
        loginLog.platform = "user_login_out";
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = C21378a.m53999a(System.currentTimeMillis());
        if (a.f58036a != null) {
            a.f58036a.add(loginLog);
        }
        C23131p.m56692a("aweme_user_logout", "", C23088c.m56631a().mo47824a("errorDesc", "session_expire").mo47825b());
    }
}
