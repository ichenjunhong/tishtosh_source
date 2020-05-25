package com.bytedance.android.livesdk.browser.p293g;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.C4472a;
import com.bytedance.android.livesdk.commerce.C6713f;

/* renamed from: com.bytedance.android.livesdk.browser.g.b */
public final class C4755b implements C4754a {
    /* renamed from: a */
    public final boolean mo10588a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && C4472a.f12233a.booleanValue() && (str.startsWith("market://details?id=") || str.startsWith("https://play.google.com"))) {
            return C6713f.m14094a(str);
        }
        return false;
    }
}
