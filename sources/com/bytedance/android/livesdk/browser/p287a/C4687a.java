package com.bytedance.android.livesdk.browser.p287a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.p675g.p676a.C10761c;

/* renamed from: com.bytedance.android.livesdk.browser.a.a */
public class C4687a extends C10761c {

    /* renamed from: a */
    private WebViewClient f12758a;

    public C4687a(WebViewClient webViewClient) {
        this.f12758a = webViewClient;
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f12758a != null) {
            this.f12758a.onPageFinished(webView, str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.f12758a != null) {
            this.f12758a.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f12758a != null) {
            this.f12758a.onReceivedError(webView, i, str, str2);
        }
    }
}
