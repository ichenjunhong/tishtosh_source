package com.p683ss.android.sdk.webview.p1209a;

import android.app.Activity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a.a */
public interface C19736a {
    String getJSSDKConfigUrl();

    String getPlayNameMobile();

    String getSSLocalScheme();

    boolean hasPlatformBinded();

    boolean isApiSuccess(JSONObject jSONObject) throws JSONException;

    boolean isPlatformBinded(String str);

    void startAdsAppActivity(Activity activity, String str);
}
