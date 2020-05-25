package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g.C27178a;
import com.p683ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27303e;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.C27281a;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d */
public final class C44654d implements C27114h {

    /* renamed from: h */
    public static final C44655a f112960h = new C44655a(null);

    /* renamed from: a */
    C27298a f112961a;

    /* renamed from: b */
    public boolean f112962b;

    /* renamed from: c */
    public DmtTextView f112963c;

    /* renamed from: d */
    public C52670a<C52860x> f112964d;

    /* renamed from: e */
    public C52670a<C52860x> f112965e;

    /* renamed from: f */
    public Activity f112966f;

    /* renamed from: g */
    public C27182a f112967g;

    /* renamed from: i */
    private C27235d f112968i;

    /* renamed from: j */
    private CrossPlatformTitleBar f112969j;

    /* renamed from: k */
    private ConstraintLayout f112970k;

    /* renamed from: l */
    private final C27177g f112971l;

    /* renamed from: m */
    private View f112972m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d$a */
    public static final class C44655a {
        private C44655a() {
        }

        public /* synthetic */ C44655a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d$b */
    public static final class C44656b implements C27281a {

        /* renamed from: a */
        final /* synthetic */ C44654d f112973a;

        /* renamed from: a */
        public final void mo55413a(View view) {
            C52711k.m112240b(view, "view");
        }

        /* renamed from: c */
        public final void mo55415c() {
            C52670a<C52860x> aVar = this.f112973a.f112965e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: d */
        public final void mo55416d() {
            C52670a<C52860x> aVar = this.f112973a.f112965e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: a */
        public final void mo55412a() {
            C44654d dVar = this.f112973a;
            C27298a aVar = dVar.f112961a;
            if (aVar == null) {
                C52711k.m112237a("mCrossPlatformWebView");
            }
            if (!aVar.mo55681a()) {
                C52670a<C52860x> aVar2 = dVar.f112965e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        }

        /* renamed from: b */
        public final void mo55414b() {
            ((ReportBusinessProxy) this.f112973a.getCrossPlatformBusiness().mo55523a(ReportBusinessProxy.class)).mo55530a(this.f112973a.f112966f);
        }

        C44656b(C44654d dVar) {
            this.f112973a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d$c */
    public static final class C44657c implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C44654d f112974a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d$c$a */
        static final class C44658a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44657c f112975a;

            C44658a(C44657c cVar) {
                this.f112975a = cVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52670a<C52860x> aVar = this.f112975a.f112974a.f112964d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

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

        C44657c(C44654d dVar) {
            this.f112974a = dVar;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            if (TextUtils.equals(this.f112974a.f112967g.f71718a.f71709f, "org_detail_page")) {
                C44654d dVar = this.f112974a;
                Uri parse = Uri.parse(dVar.f112967g.f71718a.f71706c);
                C52711k.m112236a((Object) parse, "Uri.parse(mCrossPlatformParams.baseInfo.url)");
                String path = parse.getPath();
                C27298a aVar = dVar.f112961a;
                if (aVar == null) {
                    C52711k.m112237a("mCrossPlatformWebView");
                }
                Uri parse2 = Uri.parse(aVar.getCurrentUrl());
                C52711k.m112236a((Object) parse2, "Uri.parse(mCrossPlatformWebView.currentUrl)");
                if (TextUtils.equals(path, parse2.getPath()) && !this.f112974a.f112962b) {
                    DmtTextView dmtTextView = this.f112974a.f112963c;
                    if (dmtTextView != null) {
                        dmtTextView.setVisibility(0);
                    }
                    DmtTextView dmtTextView2 = this.f112974a.f112963c;
                    if (dmtTextView2 != null) {
                        dmtTextView2.setFontType(C10751d.f28903b);
                    }
                    DmtTextView dmtTextView3 = this.f112974a.f112963c;
                    if (dmtTextView3 != null) {
                        dmtTextView3.setOnClickListener(new C44658a(this));
                    }
                    this.f112974a.f112962b = false;
                }
            }
            DmtTextView dmtTextView4 = this.f112974a.f112963c;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(8);
            }
            this.f112974a.f112962b = false;
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f112974a.f112962b = true;
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            this.f112974a.f112962b = true;
        }
    }

    /* renamed from: b */
    public final void mo54145b() {
    }

    public final C27177g getCrossPlatformBusiness() {
        return this.f112971l;
    }

    public final C27182a getCrossPlatformParams() {
        return this.f112967g;
    }

    /* renamed from: l */
    private int m97668l() {
        return C27148b.m65498b(this.f112966f);
    }

    public final Context getContext() {
        return this.f112966f;
    }

    /* renamed from: i */
    private final void m97665i() {
        this.f112968i = new C44657c(this);
    }

    /* renamed from: c */
    public final void mo54147c() {
        CrossPlatformTitleBar crossPlatformTitleBar = this.f112969j;
        if (crossPlatformTitleBar == null) {
            C52711k.m112237a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setVisibility(8);
    }

    /* renamed from: d */
    public final C27235d mo54148d() {
        C27235d dVar = this.f112968i;
        if (dVar == null) {
            C52711k.m112237a("mISingleWebViewStatus");
        }
        return dVar;
    }

    /* renamed from: e */
    public final C27298a mo54149e() {
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        return aVar;
    }

    /* renamed from: f */
    public final void mo54150f() {
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        aVar.mo54150f();
    }

    /* renamed from: g */
    public final boolean mo54151g() {
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        return aVar.mo54151g();
    }

    /* renamed from: h */
    private final void m97664h() {
        m97665i();
        this.f112961a = (C27298a) m97663a((int) R.id.a2j);
        this.f112970k = (ConstraintLayout) m97663a((int) R.id.tl);
        this.f112963c = (DmtTextView) m97663a((int) R.id.f3r);
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        aVar.setCrossPlatformActivityContainer(this);
        m97666j();
    }

    /* renamed from: a */
    public final void mo90616a() {
        m97664h();
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        aVar.mo55672a(this.f112966f);
        m97667k();
    }

    /* renamed from: j */
    private final void m97666j() {
        this.f112969j = (CrossPlatformTitleBar) m97663a((int) R.id.a2l);
        CrossPlatformTitleBar crossPlatformTitleBar = this.f112969j;
        if (crossPlatformTitleBar == null) {
            C52711k.m112237a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setCrossPlatformParams(getCrossPlatformParams());
        CrossPlatformTitleBar crossPlatformTitleBar2 = this.f112969j;
        if (crossPlatformTitleBar2 == null) {
            C52711k.m112237a("mCrossPlatformTitleBar");
        }
        ((AutoRTLImageView) crossPlatformTitleBar2.findViewById(R.id.p5)).setImageResource(R.drawable.d19);
        CrossPlatformTitleBar crossPlatformTitleBar3 = this.f112969j;
        if (crossPlatformTitleBar3 == null) {
            C52711k.m112237a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar3.setTitleWrap(new C44656b(this));
        if (TextUtils.equals(this.f112967g.f71718a.f71709f, "donation_sticker_consume")) {
            ConstraintLayout constraintLayout = this.f112970k;
            if (constraintLayout == null) {
                C52711k.m112237a("mClRoot");
            }
            constraintLayout.setBackgroundResource(R.drawable.cmx);
            CrossPlatformTitleBar crossPlatformTitleBar4 = this.f112969j;
            if (crossPlatformTitleBar4 == null) {
                C52711k.m112237a("mCrossPlatformTitleBar");
            }
            crossPlatformTitleBar4.setBackgroundResource(R.drawable.cmx);
        }
    }

    /* renamed from: k */
    private final void m97667k() {
        if (!this.f112967g.f71718a.f71714k) {
            Integer num = this.f112967g.f71718a.f71704a;
            if (num != null && num.intValue() == 2) {
                C27298a aVar = this.f112961a;
                if (aVar == null) {
                    C52711k.m112237a("mCrossPlatformWebView");
                }
                ((C27303e) aVar.mo55670a(C27303e.class)).mo55728a(getCrossPlatformParams());
                return;
            }
            String a = C27148b.m65490a(this.f112967g.f71718a.f71706c, m97668l());
            C27298a aVar2 = this.f112961a;
            if (aVar2 == null) {
                C52711k.m112237a("mCrossPlatformWebView");
            }
            ((C27309j) aVar2.mo55670a(C27309j.class)).mo55730a(a);
        }
    }

    /* renamed from: a */
    public final void mo54144a(String str) {
        mo54143a(str, true);
    }

    /* renamed from: a */
    private final <T extends View> T m97663a(int i) {
        T t;
        T findViewById = this.f112966f.findViewById(i);
        if (findViewById == null) {
            View view = this.f112972m;
            if (view != null) {
                t = view.findViewById(i);
            } else {
                t = null;
            }
            findViewById = t;
        }
        C52711k.m112236a((Object) findViewById, "view");
        return findViewById;
    }

    /* renamed from: b */
    public final void mo54146b(String str) {
        C27298a aVar = this.f112961a;
        if (aVar == null) {
            C52711k.m112237a("mCrossPlatformWebView");
        }
        ((C27309j) aVar.mo55670a(C27309j.class)).mo55730a(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f112971l.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
    }

    /* renamed from: a */
    public final void mo54143a(CharSequence charSequence, boolean z) {
        if (charSequence != null && ((TextUtils.isEmpty(charSequence) || !C27148b.m65496a(charSequence)) && getCrossPlatformParams().f71718a.f71704a != null)) {
            Integer num = getCrossPlatformParams().f71718a.f71704a;
            if (num != null && num.intValue() == 1 && (getCrossPlatformParams().f71721d.f71817w || z)) {
                CrossPlatformTitleBar crossPlatformTitleBar = this.f112969j;
                if (crossPlatformTitleBar == null) {
                    C52711k.m112237a("mCrossPlatformTitleBar");
                }
                crossPlatformTitleBar.setTitle(charSequence);
            }
        }
    }

    private C44654d(Activity activity, C27182a aVar, View view) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "mCrossPlatformParams");
        this.f112966f = activity;
        this.f112967g = aVar;
        this.f112972m = view;
        C27177g a = C27178a.m65596a(this);
        C52711k.m112236a((Object) a, "ICrossPlatformBusiness.Factory.createDefault(this)");
        this.f112971l = a;
    }

    public /* synthetic */ C44654d(Activity activity, C27182a aVar, View view, int i, C52707g gVar) {
        this(activity, aVar, null);
    }
}
