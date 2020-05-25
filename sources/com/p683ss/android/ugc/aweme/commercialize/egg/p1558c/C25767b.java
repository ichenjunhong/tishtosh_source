package com.p683ss.android.ugc.aweme.commercialize.egg.p1558c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25750e;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25781b;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c.b */
public final class C25767b implements C25781b {

    /* renamed from: a */
    private CrossPlatformWebView f68137a;

    /* renamed from: b */
    private final FragmentActivity f68138b;

    /* renamed from: c */
    private final String f68139c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c.b$a */
    public static final class C25768a implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C25767b f68140a;

        /* renamed from: b */
        final /* synthetic */ C25750e f68141b;

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }

        C25768a(C25767b bVar, C25750e eVar) {
            this.f68140a = bVar;
            this.f68141b = eVar;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            this.f68141b.mo52949a();
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence charSequence;
            String str = null;
            if (VERSION.SDK_INT >= 23) {
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (!(charSequence instanceof String)) {
                    charSequence = null;
                }
                str = (String) charSequence;
            }
            this.f68141b.mo52950a(str);
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            this.f68141b.mo52950a(str);
        }
    }

    /* renamed from: a */
    public final View mo52968a() {
        CrossPlatformWebView crossPlatformWebView = this.f68137a;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("mWebView");
        }
        return crossPlatformWebView;
    }

    /* renamed from: b */
    public final void mo52970b() {
        CrossPlatformWebView crossPlatformWebView = this.f68137a;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("mWebView");
        }
        CrossPlatformWebView.m65745a(crossPlatformWebView, this.f68139c, false, null, 6, null);
    }

    /* renamed from: a */
    private static SingleWebView m62371a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((C27309j) crossPlatformWebView.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        return a;
    }

    /* renamed from: a */
    public final void mo52969a(C25750e eVar) {
        C52711k.m112240b(eVar, "callback");
        CrossPlatformWebView crossPlatformWebView = this.f68137a;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("mWebView");
        }
        if (VERSION.SDK_INT >= 17) {
            WebSettings settings = m62371a(crossPlatformWebView).getSettings();
            C52711k.m112236a((Object) settings, "it.getRawWebView().settings");
            settings.setMediaPlaybackRequiresUserGesture(false);
            m62371a(crossPlatformWebView).setCanTouch(false);
        }
        C25768a aVar = new C25768a(this, eVar);
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f68139c);
        FragmentActivity fragmentActivity = this.f68138b;
        if (fragmentActivity != null) {
            CommercializeWebViewHelper.m63705a(crossPlatformWebView, aVar, fragmentActivity, fragmentActivity, bundle);
        }
    }

    public C25767b(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "materialUrl");
        this.f68139c = str;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        this.f68138b = (FragmentActivity) context;
        FragmentActivity fragmentActivity = this.f68138b;
        if (fragmentActivity != null) {
            CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(fragmentActivity, null, 0, 6, null);
            this.f68137a = crossPlatformWebView;
        }
    }
}
