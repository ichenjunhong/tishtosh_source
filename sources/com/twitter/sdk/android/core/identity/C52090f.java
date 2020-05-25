package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p906a.C13482c;
import com.twitter.sdk.android.core.internal.p2617a.C52103f;
import java.net.URI;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.twitter.sdk.android.core.identity.f */
final class C52090f extends WebViewClient {

    /* renamed from: a */
    private final String f129695a;

    /* renamed from: b */
    private final C52091a f129696b;

    /* renamed from: com.twitter.sdk.android.core.identity.f$a */
    interface C52091a {
        /* renamed from: a */
        void mo108789a(Bundle bundle);

        /* renamed from: a */
        void mo108790a(WebView webView, String str);

        /* renamed from: a */
        void mo108791a(C52093h hVar);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    C52090f(String str, C52091a aVar) {
        this.f129695a = str;
        this.f129696b = aVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f129696b.mo108790a(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.f129695a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap a = C52103f.m111439a(URI.create(str), false);
        Bundle bundle = new Bundle(a.size());
        for (Entry entry : a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        this.f129696b.mo108789a(bundle);
        return true;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.f129696b.mo108791a(new C52093h(sslError.getPrimaryError(), null, null));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f129696b.mo108791a(new C52093h(i, str, str2));
    }
}
