package com.bytedance.ies.p675g.p676a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p906a.C13482c;

/* renamed from: com.bytedance.ies.g.a.c */
public class C10761c extends WebViewClient {

    /* renamed from: b */
    public C10757a f28943b;

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (this.f28943b != null) {
            this.f28943b.mo19461c(str);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f28943b == null || !this.f28943b.mo19459b(str)) {
            return false;
        }
        return true;
    }
}
