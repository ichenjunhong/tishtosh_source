package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0184k;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24338f;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24304e;
import com.p683ss.android.ugc.aweme.bullet.p1471ab.FeedAdBulletExp;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25733a;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26718p.C26719a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o */
public final class C26709o extends C11079a implements C26718p {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70382a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26709o.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26709o.class), "mBulletWebView", "getMBulletWebView()Lcom/ss/android/ugc/aweme/bullet/module/base/CommonBizWebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26709o.class), "mWebViewCover", "getMWebViewCover()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26709o.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;"))};

    /* renamed from: d */
    public static final C26710a f70383d = new C26710a(null);

    /* renamed from: b */
    public int f70384b = R.drawable.ail;

    /* renamed from: c */
    public C26719a f70385c;

    /* renamed from: e */
    private boolean f70386e = FeedAdBulletExp.cardLandPageEnable();

    /* renamed from: j */
    private final C52668f f70387j = C52732g.m112285a(new C26715f(this));

    /* renamed from: k */
    private final C52668f f70388k = C52732g.m112285a(new C26713d(this));

    /* renamed from: l */
    private final C52668f f70389l = C52732g.m112285a(new C26716g(this));

    /* renamed from: m */
    private final C52668f f70390m = C52732g.m112285a(new C26714e(this));

    /* renamed from: n */
    private String f70391n = "";

    /* renamed from: o */
    private final C25733a f70392o = new C25733a(false);

    /* renamed from: p */
    private final C24304e f70393p = new C24304e(false);

    /* renamed from: q */
    private HashMap f70394q;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$a */
    public static final class C26710a {
        private C26710a() {
        }

        public /* synthetic */ C26710a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C26709o m64598a(Bundle bundle) {
            C52711k.m112240b(bundle, "args");
            C26709o oVar = new C26709o();
            oVar.setArguments(bundle);
            return oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$b */
    static final class C26711b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26709o f70395a;

        C26711b(C26709o oVar) {
            this.f70395a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26719a aVar = this.f70395a.f70385c;
            if (aVar != null) {
                aVar.mo54545a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$c */
    static final class C26712c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26709o f70396a;

        C26712c(C26709o oVar) {
            this.f70396a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26719a aVar = this.f70396a.f70385c;
            if (aVar != null) {
                aVar.mo54546b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$d */
    static final class C26713d extends C52712l implements C52670a<CommonBizWebView> {

        /* renamed from: a */
        final /* synthetic */ C26709o f70397a;

        C26713d(C26709o oVar) {
            this.f70397a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommonBizWebView) this.f70397a.mo54561b((int) R.id.e16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$e */
    static final class C26714e extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C26709o f70398a;

        C26714e(C26709o oVar) {
            this.f70398a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f70398a.mo54561b((int) R.id.ue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$f */
    static final class C26715f extends C52712l implements C52670a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ C26709o f70399a;

        C26715f(C26709o oVar) {
            this.f70399a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CrossPlatformWebView) this.f70399a.mo54561b((int) R.id.duj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$g */
    static final class C26716g extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C26709o f70400a;

        C26716g(C26709o oVar) {
            this.f70400a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f70400a.mo54561b((int) R.id.dum);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.o$h */
    public static final class C26717h implements C10606b {

        /* renamed from: a */
        final /* synthetic */ C26709o f70401a;

        /* renamed from: a */
        public final void mo18695a(Uri uri) {
            C52711k.m112240b(uri, "uri");
        }

        /* renamed from: a */
        public final void mo18696a(Uri uri, Throwable th) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(th, "e");
        }

        /* renamed from: a */
        public final void mo18697a(View view, Uri uri, C10290i iVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(iVar, "instance");
        }

        /* renamed from: a */
        public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
            C52711k.m112240b(iVar, "instance");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(rVar, "param");
        }

        C26717h(C26709o oVar) {
            this.f70401a = oVar;
        }

        /* renamed from: a */
        public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
            C52711k.m112240b(list, "viewComponents");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(iVar, "instance");
            SSWebView webView = this.f70401a.mo54555a().getWebView();
            if (webView != null) {
                WebSettings settings = webView.getSettings();
                if (settings != null) {
                    settings.setTextZoom(100);
                }
            }
        }
    }

    /* renamed from: a */
    public static final C26709o m64582a(Bundle bundle) {
        return C26710a.m64598a(bundle);
    }

    /* renamed from: h */
    private final CrossPlatformWebView m64584h() {
        return (CrossPlatformWebView) this.f70387j.getValue();
    }

    /* renamed from: i */
    private final View m64585i() {
        return (View) this.f70389l.getValue();
    }

    /* renamed from: j */
    private final ImageView m64586j() {
        return (ImageView) this.f70390m.getValue();
    }

    /* renamed from: a */
    public final CommonBizWebView mo54555a() {
        return (CommonBizWebView) this.f70388k.getValue();
    }

    /* renamed from: b */
    public final C0184k mo54560b() {
        return this;
    }

    /* renamed from: b */
    public final View mo54561b(int i) {
        if (this.f70394q == null) {
            this.f70394q = new HashMap();
        }
        View view = (View) this.f70394q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70394q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final Fragment mo54563e() {
        return this;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f70394q != null) {
            this.f70394q.clear();
        }
    }

    /* renamed from: f */
    public final View mo54564f() {
        if (this.f70386e) {
            return mo54555a().getWebView();
        }
        return m64583a(m64584h());
    }

    /* renamed from: g */
    public final boolean mo54565g() {
        boolean z = true;
        if (this.f70386e) {
            C24304e eVar = this.f70393p;
            if (!eVar.f64462a || eVar.f64463b) {
                return false;
            }
        } else {
            C25733a aVar = this.f70392o;
            if (aVar.f68055a && !aVar.f68056b) {
                return true;
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static SingleWebView m64583a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((C27309j) crossPlatformWebView.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        return a;
    }

    /* renamed from: b */
    public final void mo54562b(boolean z) {
        if (isViewValid()) {
            if (this.f70386e) {
                mo54555a().setCanScrollVertically$main_tiktokI18nRelease(z);
            } else {
                m64583a(m64584h()).setCanScrollVertically(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo54556a(int i) {
        if (i != 0) {
            this.f70384b = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r3 == null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x002a
            java.lang.String r0 = "url"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0022
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = p2628d.p2650m.C52830p.m112447b(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x002c
            goto L_0x002a
        L_0x0022:
            d.u r3 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r3.<init>(r0)
            throw r3
        L_0x002a:
            java.lang.String r3 = ""
        L_0x002c:
            r2.f70391n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.cards.C26709o.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo54557a(C26719a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f70385c = aVar;
    }

    /* renamed from: a */
    public final void mo54558a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f70386e) {
                SSWebView webView = mo54555a().getWebView();
                if (webView != null) {
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    webView.loadUrl(str);
                }
            } else {
                m64583a(m64584h()).loadUrl(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo54559a(boolean z) {
        if (isViewValid()) {
            if (z) {
                m64585i().setVisibility(8);
            } else {
                m64585i().setVisibility(0);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f70386e) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                CommonBizWebView a = mo54555a();
                C10246b bulletCoreProvider = C24098a.m58973a().getBulletCoreProvider();
                C10488e eVar = this.f70393p;
                C52711k.m112236a((Object) activity, "it");
                a.mo50079a(bulletCoreProvider, eVar, new BulletActivityWrapper(activity), this, "ad_commerce");
            }
            C24331b rootContainer = mo54555a().getRootContainer();
            if (rootContainer != null) {
                C24254b bVar = rootContainer.f64561y;
                if (bVar != null) {
                    bVar.mo50018a(false);
                }
            }
        } else {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                CommercializeWebViewHelper.m63705a(m64584h(), this.f70392o, this, activity2, getArguments());
            }
            m64583a(m64584h()).setEnableScrollControl(true);
            m64583a(m64584h()).setCanScrollVertically(false);
            WebSettings settings = m64583a(m64584h()).getSettings();
            C52711k.m112236a((Object) settings, "mWebView.getRawWebView().settings");
            settings.setTextZoom(100);
            SingleWebChromeClient singleWebChromeClient = m64583a(m64584h()).getSingleWebChromeClient();
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f71877b = false;
            }
        }
        m64585i().setOnClickListener(new C26711b(this));
        m64586j().setImageResource(this.f70384b);
        int i = this.f70384b;
        if (i == R.drawable.aio) {
            m64586j().setPadding(C23728o.m58241a(12.0d), C23728o.m58241a(4.0d), C23728o.m58241a(4.0d), C23728o.m58241a(7.0d));
        } else if (i == R.drawable.aim) {
            LayoutParams layoutParams = m64586j().getLayoutParams();
            layoutParams.width = C23728o.m58241a(28.0d);
            layoutParams.height = C23728o.m58241a(28.0d);
            m64586j().setLayoutParams(layoutParams);
            m64586j().setPadding(C23728o.m58241a(8.0d), C23728o.m58241a(10.0d), C23728o.m58241a(8.0d), C23728o.m58241a(6.0d));
        } else if (i == R.drawable.ain) {
            Drawable drawable = getResources().getDrawable(this.f70384b);
            if (VERSION.SDK_INT >= 19 && drawable != null) {
                drawable.setAutoMirrored(true);
            }
            C52711k.m112236a((Object) drawable, "image");
            if (drawable != null && C47918gj.m103682a(getContext())) {
                m64586j().setImageDrawable(drawable);
            }
            LayoutParams layoutParams2 = m64586j().getLayoutParams();
            int a2 = C23728o.m58241a(40.0d);
            layoutParams2.width = a2;
            layoutParams2.height = a2;
            m64586j().setPadding(0, 0, 0, 0);
        }
        m64586j().setOnClickListener(new C26712c(this));
        C47795d.m103429a(m64586j());
        if (this.f70386e) {
            mo54555a().setVisibility(0);
            m64584h().setVisibility(8);
            mo54555a().mo18730a(C24348b.m59713a(this.f70391n, C52575l.m112092a("ad_commerce"), getArguments(), new C24338f(C11010c.m22280a())), getArguments(), (C10606b) new C26717h(this));
            mo54555a().setEnableScrollControl$main_tiktokI18nRelease(true);
            mo54555a().setCanScrollVertically$main_tiktokI18nRelease(false);
            return;
        }
        CrossPlatformWebView.m65745a(m64584h(), this.f70391n, false, null, 6, null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mi, viewGroup, false);
    }
}
