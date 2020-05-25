package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.cw */
final class C47791cw {
    /* renamed from: a */
    static void m103421a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || (!str.contains("check/in") && !str.contains("story") && !str.contains("rec/new") && !str.contains("follow/feed"))) {
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            if (i == 8 && baseUserService_Monster.isLogin()) {
                try {
                    C20854a.m53162b().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorDesc", "api return errorcode==8");
                    jSONObject.put("errorUrl", str);
                    jSONObject.put("errorCookies", CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost()));
                    jSONObject.put("errorResponse", str2);
                    C23569o.m57783b("aweme_user_logout", "", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }
}
