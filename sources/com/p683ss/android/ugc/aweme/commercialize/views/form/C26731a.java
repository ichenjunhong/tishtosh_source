package com.p683ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25715e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a */
public final class C26731a extends C11079a {

    /* renamed from: k */
    public static final C26732a f70428k = new C26732a(null);

    /* renamed from: a */
    public CrossPlatformWebView f70429a;

    /* renamed from: b */
    public Aweme f70430b;

    /* renamed from: c */
    public C25908e f70431c = new C25908e();

    /* renamed from: d */
    public C26737b f70432d;

    /* renamed from: e */
    public boolean f70433e;

    /* renamed from: j */
    public boolean f70434j;

    /* renamed from: l */
    private ViewGroup f70435l;

    /* renamed from: m */
    private DmtTextView f70436m;

    /* renamed from: n */
    private DmtTextView f70437n;

    /* renamed from: o */
    private String f70438o = "";

    /* renamed from: p */
    private boolean f70439p;

    /* renamed from: q */
    private boolean f70440q;

    /* renamed from: r */
    private HashMap f70441r;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$a */
    public static final class C26732a {
        private C26732a() {
        }

        public /* synthetic */ C26732a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C26731a m64638a(Bundle bundle) {
            C52711k.m112240b(bundle, "args");
            C26731a aVar = new C26731a();
            aVar.setArguments(bundle);
            return aVar;
        }

        /* renamed from: a */
        public static void m64640a(C0654k kVar, ViewGroup viewGroup, int i, boolean z) {
            C52711k.m112240b(kVar, "fragmentManager");
            C52711k.m112240b(viewGroup, "containerLayout");
            Fragment a = kVar.mo2222a(i);
            if (a != null) {
                C0679r a2 = kVar.mo2225a();
                C52711k.m112236a((Object) a2, "fragmentManager.beginTransaction()");
                a2.mo2177a(a);
                a2.mo2195c();
            }
            viewGroup.removeView((FrameLayout) viewGroup.findViewById(i));
            if (z && !C48121w.m104087I()) {
                C48121w.m104249M().mo95291x();
            }
        }

        /* renamed from: a */
        public static void m64639a(C0654k kVar, ViewGroup viewGroup, int i, C26731a aVar) {
            C52711k.m112240b(kVar, "fragmentManager");
            C52711k.m112240b(viewGroup, "containerLayout");
            C52711k.m112240b(aVar, "fragment");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(i);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            viewGroup.addView(frameLayout);
            C0679r a = kVar.mo2225a();
            C52711k.m112236a((Object) a, "fragmentManager.beginTransaction()");
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95293z();
            }
            a.mo2175a(i, (Fragment) aVar);
            a.mo2195c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$b */
    static final class C26733b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26731a f70442a;

        C26733b(C26731a aVar) {
            this.f70442a = aVar;
        }

        public final void run() {
            CrossPlatformWebView crossPlatformWebView = this.f70442a.f70429a;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("mWebView");
            }
            crossPlatformWebView.setVisibility(0);
            this.f70442a.mo54578a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$c */
    static final class C26734c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26731a f70443a;

        C26734c(C26731a aVar) {
            this.f70443a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26088l.m63375n(this.f70443a.getContext(), this.f70443a.f70430b);
            C25493a.m62004a();
            C25493a.m62005a(this.f70443a.getContext(), this.f70443a.f70430b);
            C26737b bVar = this.f70443a.f70432d;
            if (bVar != null) {
                bVar.mo53098c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$d */
    static final class C26735d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26731a f70444a;

        C26735d(C26731a aVar) {
            this.f70444a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70444a.f70431c.mo53245a(3);
            if (this.f70444a.f70431c.mo53247c() && C26540w.m64211a(this.f70444a.getContext(), this.f70444a.f70430b)) {
                return;
            }
            if (C26540w.m64233b(this.f70444a.getContext(), this.f70444a.f70430b, 3) || C26540w.m64212a(this.f70444a.getContext(), this.f70444a.f70430b, 3)) {
                C26737b bVar = this.f70444a.f70432d;
                if (bVar != null) {
                    bVar.mo53098c();
                    return;
                }
                return;
            }
            C26540w.m64232b(this.f70444a.getContext(), this.f70444a.f70430b);
            C26737b bVar2 = this.f70444a.f70432d;
            if (bVar2 != null) {
                bVar2.mo53098c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.a$e */
    public static final class C26736e implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C26731a f70445a;

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

        C26736e(C26731a aVar) {
            this.f70445a = aVar;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            C26737b bVar = this.f70445a.f70432d;
            if (bVar != null && this.f70445a.f70433e) {
                C26731a aVar = this.f70445a;
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:(function extra(){");
                sb.append("var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='https://s3b.bytecdn.cn/ies/static/style/douyin/form.css?=12344567771';document.getElementsByTagName(\"head\")[0].appendChild(aa);");
                sb.append("})();");
                CrossPlatformWebView crossPlatformWebView = aVar.f70429a;
                if (crossPlatformWebView == null) {
                    C52711k.m112237a("mWebView");
                }
                C26731a.m64636a(crossPlatformWebView).loadUrl(sb.toString());
                CrossPlatformWebView crossPlatformWebView2 = aVar.f70429a;
                if (crossPlatformWebView2 == null) {
                    C52711k.m112237a("mWebView");
                }
                crossPlatformWebView2.postDelayed(new C26733b(aVar), 3000);
                bVar.mo53095a();
            }
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f70445a.f70434j = true;
            C26737b bVar = this.f70445a.f70432d;
            if (bVar != null) {
                bVar.mo53097b();
            }
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            this.f70445a.f70434j = true;
            C26737b bVar = this.f70445a.f70432d;
            if (bVar != null) {
                bVar.mo53097b();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(18);
            }
        }
    }

    /* renamed from: a */
    public final void mo54578a() {
        if (!this.f70434j && !this.f70439p) {
            C26088l.m63318b(getContext(), this.f70430b, C52550ab.m112045a());
            Context context = getContext();
            Aweme aweme = this.f70430b;
            C26088l.m63336c(context, "form_show", aweme, C26088l.m63373m(context, aweme, "raw ad background form show"));
            this.f70439p = true;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C26737b bVar = this.f70432d;
        if (bVar != null && !this.f70434j) {
            bVar.mo53096a(this.f70440q);
        }
        C26528m.m64183a(getContext(), false);
        if (this.f70441r != null) {
            this.f70441r.clear();
        }
    }

    @C53771m
    public final void onEvent(C26685a aVar) {
        C52711k.m112240b(aVar, "adCardClose");
        C26737b bVar = this.f70432d;
        if (bVar != null) {
            bVar.mo53098c();
        }
    }

    /* renamed from: a */
    static SingleWebView m64636a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((C27309j) crossPlatformWebView.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        return a;
    }

    @C53771m
    public final void onEvent(C25715e eVar) {
        C52711k.m112240b(eVar, "event");
        if (getActivity() != null) {
            C10691a.m21537a((Context) getActivity(), getString(R.string.du8)).mo19066a();
        }
        this.f70440q = true;
        C26737b bVar = this.f70432d;
        if (bVar != null) {
            bVar.mo53098c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.p683ss.android.ugc.aweme.commercialize.views.cards.C26690d r2) {
        /*
            r1 = this;
            java.lang.String r0 = "adCardStatus"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            com.ss.android.ugc.aweme.commercialize.views.form.b r0 = r1.f70432d
            if (r0 == 0) goto L_0x0027
            int r2 = r2.f70334a
            switch(r2) {
                case 0: goto L_0x0023;
                case 1: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            r0.mo53095a()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r1.f70429a
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x001b:
            r0 = 0
            r2.setVisibility(r0)
            r1.mo54578a()
            goto L_0x0027
        L_0x0023:
            r0.mo53097b()
        L_0x0026:
            return
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a.onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.d):void");
    }

    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(32);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            C52711k.m112236a((Object) string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
            if (string != null) {
                this.f70438o = C52830p.m112447b(string).toString();
                this.f70433e = arguments.getBoolean("use_css_injection", false);
                String string2 = arguments.getString("aweme_id", "");
                if (C23324d.m57378a().getRawAdAwemeById(string2) != null) {
                    aweme = C23324d.m57378a().getRawAdAwemeById(string2);
                } else {
                    aweme = C23324d.m57378a().getAwemeById(string2);
                }
                this.f70430b = aweme;
                this.f70431c = new C25908e();
                this.f70431c.mo53240a(getContext(), this.f70430b);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        C47718bf.m103290c(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f70435l = (ViewGroup) view;
            ViewGroup viewGroup = this.f70435l;
            if (viewGroup == null) {
                C52711k.m112237a("mRootView");
            }
            viewGroup.setOnClickListener(new C26734c(this));
            View findViewById = view.findViewById(R.id.duj);
            C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.webview)");
            this.f70429a = (CrossPlatformWebView) findViewById;
            C26736e eVar = new C26736e(this);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                CrossPlatformWebView crossPlatformWebView = this.f70429a;
                if (crossPlatformWebView == null) {
                    C52711k.m112237a("mWebView");
                }
                CommercializeWebViewHelper.m63705a(crossPlatformWebView, eVar, this, activity, getArguments());
            }
            CrossPlatformWebView crossPlatformWebView2 = this.f70429a;
            if (crossPlatformWebView2 == null) {
                C52711k.m112237a("mWebView");
            }
            m64636a(crossPlatformWebView2).setEnableScrollControl(true);
            CrossPlatformWebView crossPlatformWebView3 = this.f70429a;
            if (crossPlatformWebView3 == null) {
                C52711k.m112237a("mWebView");
            }
            m64636a(crossPlatformWebView3).setCanScrollVertically(false);
            CrossPlatformWebView crossPlatformWebView4 = this.f70429a;
            if (crossPlatformWebView4 == null) {
                C52711k.m112237a("mWebView");
            }
            SingleWebChromeClient singleWebChromeClient = m64636a(crossPlatformWebView4).getSingleWebChromeClient();
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f71877b = false;
            }
            if (this.f70433e) {
                CrossPlatformWebView crossPlatformWebView5 = this.f70429a;
                if (crossPlatformWebView5 == null) {
                    C52711k.m112237a("mWebView");
                }
                WebSettings settings = m64636a(crossPlatformWebView5).getSettings();
                String userAgentString = settings.getUserAgentString();
                StringBuilder sb = new StringBuilder();
                sb.append(userAgentString);
                sb.append("/RevealType/Dialog");
                settings.setUserAgentString(sb.toString());
            }
            View findViewById2 = view.findViewById(R.id.bd);
            C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.ad_button)");
            this.f70436m = (DmtTextView) findViewById2;
            DmtTextView dmtTextView = this.f70436m;
            if (dmtTextView == null) {
                C52711k.m112237a("mAdBtn");
            }
            dmtTextView.setOnClickListener(new C26735d(this));
            DmtTextView dmtTextView2 = this.f70436m;
            if (dmtTextView2 == null) {
                C52711k.m112237a("mAdBtn");
            }
            C47795d.m103429a(dmtTextView2);
            View findViewById3 = view.findViewById(R.id.cbd);
            C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.replay_button)");
            this.f70437n = (DmtTextView) findViewById3;
            DmtTextView dmtTextView3 = this.f70437n;
            if (dmtTextView3 == null) {
                C52711k.m112237a("mReplayBtn");
            }
            C47795d.m103429a(dmtTextView3);
            CrossPlatformWebView crossPlatformWebView6 = this.f70429a;
            if (crossPlatformWebView6 == null) {
                C52711k.m112237a("mWebView");
            }
            CrossPlatformWebView.m65745a(crossPlatformWebView6, this.f70438o, false, null, 6, null);
            C26528m.m64183a(getContext(), true);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mg, viewGroup, false);
    }
}
