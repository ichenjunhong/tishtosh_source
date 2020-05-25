package com.bytedance.opensdk.core.grant.web;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.opensdk.core.base.config.C12504a.C12505a;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.grant.web.b */
public final class C12526b {

    /* renamed from: a */
    public static final C12526b f32891a = new C12526b();

    private C12526b() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(C12505a.m25100a());
        }
    }

    /* renamed from: a */
    public static void m25137a(WebView webView) {
        C52711k.m112240b(webView, C23060d.f61427a);
        webView.setWebChromeClient(null);
        webView.setWebViewClient(C13482c.m27232a(null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
