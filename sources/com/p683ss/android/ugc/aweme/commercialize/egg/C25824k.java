package com.p683ss.android.ugc.aweme.commercialize.egg;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25752a;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.k */
public final class C25824k extends C25752a {

    /* renamed from: a */
    public CrossPlatformWebView f68269a;

    /* renamed from: b */
    public long f68270b;

    /* renamed from: c */
    public boolean f68271c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.k$a */
    static final class C25825a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25824k f68272a;

        /* renamed from: b */
        final /* synthetic */ String f68273b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f68274c;

        C25825a(C25824k kVar, String str, FragmentActivity fragmentActivity) {
            this.f68272a = kVar;
            this.f68273b = str;
            this.f68274c = fragmentActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f68272a.f68270b);
            C25746b bVar = this.f68272a.f68103f;
            if (bVar != null) {
                C52711k.m112236a((Object) view, "v");
                bVar.mo52927a(view, currentTimeMillis);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.k$b */
    public static final class C25826b implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C25824k f68275a;

        /* renamed from: b */
        final /* synthetic */ String f68276b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f68277c;

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

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            C25746b bVar = this.f68275a.f68103f;
            if (bVar != null) {
                bVar.mo52926a();
            }
            if (!this.f68275a.f68271c) {
                this.f68275a.f68271c = true;
                this.f68275a.mo52954c();
            }
        }

        C25826b(C25824k kVar, String str, FragmentActivity fragmentActivity) {
            this.f68275a = kVar;
            this.f68276b = str;
            this.f68277c = fragmentActivity;
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence charSequence;
            C25746b bVar = this.f68275a.f68103f;
            if (bVar != null) {
                bVar.mo52930b();
            }
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
            this.f68275a.mo52952a(str);
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            C25746b bVar = this.f68275a.f68103f;
            if (bVar != null) {
                bVar.mo52930b();
            }
            this.f68275a.mo52952a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.k$c */
    static final class C25827c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25824k f68278a;

        C25827c(C25824k kVar) {
            this.f68278a = kVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25746b bVar = this.f68278a.f68103f;
            if (bVar != null) {
                View view2 = this.f68278a.f68269a;
                C52711k.m112236a((Object) view, "v");
                bVar.mo52928a(view2, view);
            }
        }
    }

    /* renamed from: b */
    public final void mo52953b() {
        if (this.f68269a != null) {
            this.f68106i.removeView(this.f68269a);
            this.f68106i.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView = this.f68269a;
            if (crossPlatformWebView != null) {
                crossPlatformWebView.setVisibility(8);
            }
            this.f68269a = null;
        }
    }

    /* renamed from: a */
    public final void mo52951a() {
        String str;
        boolean z;
        C25751b bVar = this.f68102e;
        if (bVar != null) {
            str = bVar.f68094a;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C25746b bVar2 = this.f68103f;
            if (bVar2 != null) {
                bVar2.mo52930b();
            }
            mo52952a("materialUrl为空");
            return;
        }
        Context context = this.f68101d;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            if (this.f68269a == null) {
                CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(fragmentActivity, null, 0, 6, null);
                this.f68269a = crossPlatformWebView;
                this.f68106i.addView(this.f68269a);
            }
            CrossPlatformWebView crossPlatformWebView2 = this.f68269a;
            if (crossPlatformWebView2 != null) {
                C25746b bVar3 = this.f68103f;
                if (bVar3 != null) {
                    bVar3.mo52931b(crossPlatformWebView2, this.f68106i);
                }
                if (VERSION.SDK_INT >= 17) {
                    WebSettings settings = m62466a(crossPlatformWebView2).getSettings();
                    C52711k.m112236a((Object) settings, "it.getRawWebView().settings");
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    m62466a(crossPlatformWebView2).setCanTouch(false);
                }
                crossPlatformWebView2.setOnClickListener(new C25825a(this, str, fragmentActivity));
                C25826b bVar4 = new C25826b(this, str, fragmentActivity);
                Bundle bundle = new Bundle();
                bundle.putString("url", str);
                CommercializeWebViewHelper.m63705a(crossPlatformWebView2, bVar4, fragmentActivity, fragmentActivity, bundle);
            }
            this.f68106i.setOnClickListener(new C25827c(this));
        }
        this.f68106i.setVisibility(0);
        CrossPlatformWebView crossPlatformWebView3 = this.f68269a;
        if (crossPlatformWebView3 != null) {
            crossPlatformWebView3.setVisibility(0);
        }
        this.f68270b = System.currentTimeMillis();
        CrossPlatformWebView crossPlatformWebView4 = this.f68269a;
        if (crossPlatformWebView4 != null) {
            this.f68271c = false;
            CrossPlatformWebView.m65745a(crossPlatformWebView4, str, false, null, 6, null);
        }
    }

    public C25824k(CommerceEggLayout commerceEggLayout) {
        C52711k.m112240b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: a */
    private static SingleWebView m62466a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((C27309j) crossPlatformWebView.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        return a;
    }
}
