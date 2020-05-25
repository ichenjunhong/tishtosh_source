package com.p888c.p889a.p890a.p891a.p899g;

import android.webkit.WebView;

/* renamed from: com.c.a.a.a.g.b */
public final class C13432b extends C13430a {
    public C13432b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo25126a(webView);
    }
}
