package com.example.p906a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.example.a.b */
public final class C13481b extends WebViewClient {
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (C13482c.m27233a() != null) {
            return C13482c.m27233a().mo25266a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
