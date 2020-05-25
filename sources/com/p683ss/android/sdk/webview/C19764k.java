package com.p683ss.android.sdk.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.p675g.p676a.C10761c;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18979e;
import com.p683ss.android.ugc.aweme.util.C47625i;

/* renamed from: com.ss.android.sdk.webview.k */
public class C19764k extends C10761c {

    /* renamed from: a */
    private WebViewClient f54447a;

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C18979e.m46155a(str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C18979e.m46155a(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f54447a != null) {
            this.f54447a.onPageFinished(webView, str);
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C47625i.m103103a("onRenderProcessGone");
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f54447a != null) {
            this.f54447a.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f54447a != null) {
            this.f54447a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f54447a != null) {
            this.f54447a.onReceivedError(webView, i, str, str2);
        }
    }
}
