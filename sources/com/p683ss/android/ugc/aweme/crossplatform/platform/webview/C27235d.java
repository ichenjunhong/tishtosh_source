package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.d */
public interface C27235d {
    /* renamed from: a */
    void mo52678a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo49880a(WebView webView, String str);

    /* renamed from: a */
    void mo52682a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    boolean mo52683b(WebView webView, String str);
}
