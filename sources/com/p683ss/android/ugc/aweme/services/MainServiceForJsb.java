package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.newmedia.C19530a;
import com.p683ss.android.newmedia.p1198d.C19548a;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.sdk.webview.p1209a.C19736a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForJsb */
public class MainServiceForJsb implements C19736a {
    public static final String JS_SDK_CONFIG_URL = C19530a.m45940a("/client_auth/js_sdk/config/v1/");

    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    public String getPlayNameMobile() {
        return "mobile";
    }

    public String getSSLocalScheme() {
        return C23057c.f61423a;
    }

    public long getUserId() {
        return Long.parseLong(C20854a.m53167g().getCurUserId());
    }

    public boolean hasPlatformBinded() {
        return C19718b.m48210a().mo41124b();
    }

    public boolean isLogin() {
        return C20854a.m53167g().isLogin();
    }

    public boolean isApiSuccess(JSONObject jSONObject) throws JSONException {
        return C19548a.isApiSuccess(jSONObject);
    }

    public boolean isPlatformBinded(String str) {
        return C19718b.m48210a().mo41123a(str);
    }

    public boolean isBrowserActivity(Context context) {
        return C23794bh.m58386a().getCrossPlatformService().mo55359a().isInstance(context);
    }

    public void startAdsAppActivity(Activity activity, String str) {
        C25945k.m62926q().mo47707a(activity, str, "");
    }
}
