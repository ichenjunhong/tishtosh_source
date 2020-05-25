package com.bytedance.android.livesdk.browser.p292f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.browser.f.e */
public final class C4753e implements C4748b {
    /* renamed from: a */
    public final WebResourceResponse mo10586a(Uri uri, WebView webView) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(webView, "webView");
        C4097p<Boolean> pVar = LiveConfigSettingKeys.WEB_OFFLINE_ENABLED;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.WEB_OFFLINE_ENABLED");
        if (!((Boolean) pVar.mo9431a()).booleanValue()) {
            return null;
        }
        return TTLiveSDKContext.getHostService().mo10316i().mo15573c(uri.toString());
    }
}
