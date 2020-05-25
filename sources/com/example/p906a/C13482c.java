package com.example.p906a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.example.a.c */
public final class C13482c {

    /* renamed from: a */
    public static C13480a f35160a;

    /* renamed from: a */
    public static C13480a m27233a() {
        return f35160a;
    }

    /* renamed from: a */
    public static WebViewClient m27232a(WebViewClient webViewClient) {
        if (webViewClient == null || !"android.webkit.WebViewClient".equals(webViewClient.getClass().getName())) {
            return webViewClient;
        }
        return new C13481b();
    }

    /* renamed from: a */
    public static boolean m27234a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (m27233a() != null) {
            return m27233a().mo25266a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
