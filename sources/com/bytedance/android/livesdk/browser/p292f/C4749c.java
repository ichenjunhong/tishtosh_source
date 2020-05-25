package com.bytedance.android.livesdk.browser.p292f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.livesdk.browser.f.c */
public final class C4749c implements C4748b {
    /* renamed from: a */
    public final WebResourceResponse mo10586a(Uri uri, WebView webView) {
        String str;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(webView, "webView");
        C4097p<Boolean> pVar = LiveConfigSettingKeys.WEBVIEW_NATIVE_IMAGE_LOADING;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.WEBVIEW_NATIVE_IMAGE_LOADING");
        WebResourceResponse webResourceResponse = null;
        if (!((Boolean) pVar.mo9431a()).booleanValue()) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        if (C52830p.m112413c(path, "jpg", false, 2, null) || C52830p.m112413c(path, "jpeg", false, 2, null)) {
            str = "image/jpeg";
        } else if (C52830p.m112413c(path, "png", false, 2, null)) {
            str = "image/png";
        } else if (C52830p.m112413c(path, "gif", false, 2, null)) {
            str = "image/gif";
        } else if (!C52830p.m112413c(path, "ico", false, 2, null)) {
            return null;
        } else {
            str = "image/x-icon";
        }
        InputStream a = C3899m.m9856a(uri);
        if (a != null) {
            webResourceResponse = new WebResourceResponse(str, "", a);
        }
        return webResourceResponse;
    }
}
