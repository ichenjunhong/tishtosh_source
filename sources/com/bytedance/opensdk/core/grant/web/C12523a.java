package com.bytedance.opensdk.core.grant.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.bytedance.opensdk.core.grant.web.a */
public interface C12523a {
    /* renamed from: a */
    void mo23535a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo23536a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo23537a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo23538a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: a */
    boolean mo23541a(WebView webView, WebResourceRequest webResourceRequest);

    /* renamed from: a */
    boolean mo23542a(WebView webView, String str);

    /* renamed from: b */
    void mo23544b(WebView webView, String str);
}
