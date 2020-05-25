package com.p683ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p653ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10605a;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.GetWebViewInfo.C24121a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness.C24249a;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24338f;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24306f;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24306f.C24307a;
import com.p683ss.android.ugc.aweme.bullet.p1471ab.FeedAdBulletExp;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c.C26117a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26379aj;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26379aj.C26380a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26427bl;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26431bp;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26530o;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26530o.C26531a;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.C26546b;
import com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26653b.C26654a;
import com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog.C26666d.C26667a;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness.C27167a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetWebViewInfo.C29803b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView */
public final class AdLightWebPageView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69962a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mBottomSheet", "getMBottomSheet()Lcom/ss/android/ugc/aweme/commercialize/views/AdBottomSheetContainer;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mLightWebPage", "getMLightWebPage()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mBulletWebView", "getMBulletWebView()Lcom/ss/android/ugc/aweme/bullet/module/base/CommonBizWebView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mCloseView", "getMCloseView()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mErrorView", "getMErrorView()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mRetryView", "getMRetryView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mFlTitleBar", "getMFlTitleBar()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mIvDownArrow", "getMIvDownArrow()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdLightWebPageView.class), "mIvHorizontalBar", "getMIvHorizontalBar()Landroid/widget/ImageView;"))};

    /* renamed from: l */
    public static final C26578d f69963l = new C26578d(null);

    /* renamed from: A */
    private final C24306f f69964A;

    /* renamed from: B */
    private boolean f69965B;

    /* renamed from: C */
    private C26581f f69966C;

    /* renamed from: b */
    public View f69967b;

    /* renamed from: c */
    public boolean f69968c;

    /* renamed from: d */
    public Bundle f69969d;

    /* renamed from: e */
    public C26379aj f69970e;

    /* renamed from: f */
    public C26431bp f69971f;

    /* renamed from: g */
    public CommercializeWebViewHelper f69972g;

    /* renamed from: h */
    public String f69973h;

    /* renamed from: i */
    public long f69974i;

    /* renamed from: j */
    public boolean f69975j;

    /* renamed from: k */
    public String f69976k;

    /* renamed from: m */
    private final C52668f f69977m;

    /* renamed from: n */
    private final C52668f f69978n;

    /* renamed from: o */
    private final C52668f f69979o;

    /* renamed from: p */
    private final C52668f f69980p;

    /* renamed from: q */
    private final C52668f f69981q;

    /* renamed from: r */
    private final C52668f f69982r;

    /* renamed from: s */
    private final C52668f f69983s;

    /* renamed from: t */
    private final C52668f f69984t;

    /* renamed from: u */
    private final C52668f f69985u;

    /* renamed from: v */
    private final C52668f f69986v;

    /* renamed from: w */
    private C26579e f69987w;

    /* renamed from: x */
    private C26577c f69988x;

    /* renamed from: y */
    private int f69989y;

    /* renamed from: z */
    private final C26530o f69990z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$a */
    public static final class C26575a implements C26531a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f69991a;

        /* renamed from: c */
        public final void mo54216c() {
            m64334a("preload_break", null);
        }

        /* renamed from: a */
        public final void mo54213a() {
            this.f69991a.getMErrorView().setVisibility(8);
            View findViewById = this.f69991a.getMWebView().findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m64334a("preload_start", null);
        }

        /* renamed from: b */
        public final void mo54215b() {
            this.f69991a.getMErrorView().setVisibility(0);
            View findViewById = this.f69991a.getMWebView().findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m64334a("preload_fail", null);
        }

        C26575a(AdLightWebPageView adLightWebPageView) {
            this.f69991a = adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo54214a(long j) {
            m64334a("preload_success", Long.valueOf(j));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m64334a(String str, Long l) {
            Aweme aweme;
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("light_page", Integer.valueOf(1));
            if (l != null) {
                linkedHashMap.put("duration", l);
            }
            C26080b a = C26077e.m63190a().mo53582a("ad_wap_stat").mo53593b(str).mo53583a(new JSONObject(linkedHashMap));
            C26579e params = this.f69991a.getParams();
            if (params != null) {
                aweme = params.f69995c;
            } else {
                aweme = null;
            }
            a.mo53590b(aweme).mo53597c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$b */
    public static final class C26576b implements C24307a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f69992a;

        /* renamed from: c */
        public final void mo50059c() {
            m64340a("preload_break", null);
        }

        /* renamed from: a */
        public final void mo50056a() {
            this.f69992a.getMErrorView().setVisibility(8);
            m64340a("preload_start", null);
        }

        /* renamed from: b */
        public final void mo50058b() {
            this.f69992a.getMErrorView().setVisibility(0);
            m64340a("preload_fail", null);
        }

        C26576b(AdLightWebPageView adLightWebPageView) {
            this.f69992a = adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo50057a(long j) {
            m64340a("preload_success", Long.valueOf(j));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m64340a(String str, Long l) {
            Aweme aweme;
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("light_page", Integer.valueOf(1));
            if (l != null) {
                linkedHashMap.put("duration", l);
            }
            C26080b a = C26077e.m63190a().mo53582a("ad_wap_stat").mo53593b(str).mo53583a(new JSONObject(linkedHashMap));
            C26579e params = this.f69992a.getParams();
            if (params != null) {
                aweme = params.f69995c;
            } else {
                aweme = null;
            }
            a.mo53590b(aweme).mo53597c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$c */
    public interface C26577c {
        /* renamed from: a */
        void mo54321a();

        /* renamed from: b */
        void mo54322b();

        /* renamed from: c */
        void mo54323c();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d */
    public static final class C26578d {
        private C26578d() {
        }

        public /* synthetic */ C26578d(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final AdLightWebPageView mo54324a(Activity activity) {
            AdLightWebPageView adLightWebPageView;
            FrameLayout b = m64348b(activity);
            if (b != null) {
                adLightWebPageView = (AdLightWebPageView) b.findViewById(R.id.dww);
            } else {
                adLightWebPageView = null;
            }
            if (!(adLightWebPageView instanceof AdLightWebPageView)) {
                return null;
            }
            return adLightWebPageView;
        }

        public final boolean dismiss(Activity activity) {
            C52711k.m112240b(activity, "activity");
            AdLightWebPageView a = mo54324a(activity);
            if (a == null || !a.mo54307a()) {
                return false;
            }
            a.dismiss();
            return true;
        }

        /* renamed from: b */
        public static FrameLayout m64348b(Activity activity) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.dwq);
            if (viewStub == null) {
                return (FrameLayout) activity.findViewById(R.id.dwp);
            }
            View inflate = viewStub.inflate();
            if (inflate != null) {
                return (FrameLayout) inflate;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
        }

        /* renamed from: a */
        public final boolean mo54325a(Activity activity, String str) {
            C52711k.m112240b(activity, "activity");
            AdLightWebPageView a = mo54324a(activity);
            if (a == null || a.mo54307a()) {
                return false;
            }
            a.mo54306a(str);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e */
    public static final class C26579e {

        /* renamed from: a */
        public String f69993a;

        /* renamed from: b */
        public C0184k f69994b;

        /* renamed from: c */
        public Aweme f69995c;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e$a */
        public static final class C26580a extends C26427bl<C26579e> {
            public C26580a() {
                C26579e eVar = new C26579e(null, null, null, 7, null);
                super(eVar);
            }
        }

        public C26579e() {
            this(null, null, null, 7, null);
        }

        private C26579e(String str, C0184k kVar, Aweme aweme) {
            C52711k.m112240b(str, "url");
            this.f69993a = str;
            this.f69994b = kVar;
            this.f69995c = aweme;
        }

        public /* synthetic */ C26579e(String str, C0184k kVar, Aweme aweme, int i, C52707g gVar) {
            this("", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$f */
    public static final class C26581f {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f69996a;

        C26581f(AdLightWebPageView adLightWebPageView) {
            this.f69996a = adLightWebPageView;
        }

        @C53771m
        public final void onEvent(C29803b bVar) {
            if (bVar != null) {
                CommercializeWebViewHelper commercializeWebViewHelper = this.f69996a.f69972g;
                if (commercializeWebViewHelper != null) {
                    PreRenderWebViewBusiness a = commercializeWebViewHelper.mo54005a();
                    if (a != null) {
                        a.mo55510a(this.f69996a.getMWebView(), bVar);
                    }
                }
            }
        }

        @C53771m
        public final void onEvent(C24121a aVar) {
            if (aVar != null && this.f69996a.f69968c) {
                C24331b rootContainer = this.f69996a.getMBulletWebView().getRootContainer();
                if (rootContainer != null) {
                    C24254b bVar = rootContainer.f64561y;
                    if (bVar != null) {
                        com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a = C24249a.m59360a(bVar);
                        if (a != null) {
                            a.mo50003a(aVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$g */
    public static final class C26582g implements C26380a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f69997a;

        C26582g(AdLightWebPageView adLightWebPageView) {
            this.f69997a = adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo54103a(int i, int i2, int i3) {
            boolean z;
            String str;
            AdLightWebPageView adLightWebPageView = this.f69997a;
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            adLightWebPageView.f69975j = z;
            if (this.f69997a.f69975j) {
                str = "keyboardDidShow";
            } else {
                str = "keyboardDidHide";
            }
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("height", Integer.valueOf(C23728o.m58244b((double) (i3 - i2))));
            if (this.f69997a.f69968c) {
                this.f69997a.getMBulletWebView().mo50080a(str, new JSONObject(linkedHashMap));
            } else {
                this.f69997a.getMWebView().mo55677a(str, new JSONObject(linkedHashMap));
            }
            StringBuilder sb = new StringBuilder("send event ");
            sb.append(str);
            sb.append(' ');
            sb.append(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$h */
    public static final class C26583h extends C26431bp {

        /* renamed from: b */
        final /* synthetic */ AdLightWebPageView f69998b;

        /* renamed from: c */
        final /* synthetic */ Activity f69999c;

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f69998b.mo54307a()) {
                return false;
            }
            this.f69998b.f69973h = "back";
            this.f69998b.dismiss();
            return true;
        }

        C26583h(AdLightWebPageView adLightWebPageView, Activity activity, Activity activity2) {
            this.f69998b = adLightWebPageView;
            this.f69999c = activity;
            super(activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$i */
    public static final class C26584i implements C26546b {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70000a;

        /* renamed from: b */
        private boolean f70001b;

        /* renamed from: d */
        public final void mo54239d() {
            this.f70000a.mo54305a(7);
        }

        /* renamed from: c */
        public final void mo54238c() {
            if (this.f70000a.getMBottomSheet().getHideable() && this.f70000a.f69975j) {
                this.f70000a.f69975j = false;
                C26528m.m64182a(this.f70000a.getContext(), null, 2, null);
            }
            this.f70000a.mo54305a(1);
        }

        /* renamed from: a */
        public final void mo54236a() {
            Aweme aweme;
            this.f70000a.mo54305a(3);
            if (!this.f70001b) {
                this.f70001b = true;
                this.f70000a.f69974i = System.currentTimeMillis();
                C26379aj ajVar = this.f70000a.f69970e;
                if (ajVar != null) {
                    ajVar.f69597c = ajVar.mo54102c();
                    ajVar.f69596b = ajVar.f69597c;
                    ajVar.mo54100a().getViewTreeObserver().addOnGlobalLayoutListener(ajVar.f69598d);
                }
                if (this.f70000a.f69968c) {
                    this.f70000a.getMBulletWebView().setVisibility(0);
                    this.f70000a.getMWebView().setVisibility(8);
                    SSWebView webView = this.f70000a.getMBulletWebView().getWebView();
                    if (webView != null) {
                        webView.loadUrl("javascript:window.dialogPopUp()");
                    }
                    C24331b rootContainer = this.f70000a.getMBulletWebView().getRootContainer();
                    if (rootContainer != null) {
                        C24254b bVar = rootContainer.f64561y;
                        if (bVar != null) {
                            com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a = C24249a.m59360a(bVar);
                            if (a != null) {
                                a.mo50004a(this.f70000a.f69976k);
                            }
                        }
                    }
                } else {
                    ((C27309j) this.f70000a.getMWebView().mo55670a(C27309j.class)).mo55729a().loadUrl("javascript:window.dialogPopUp()");
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f70000a.f69972g;
                    if (commercializeWebViewHelper != null) {
                        PreRenderWebViewBusiness a2 = commercializeWebViewHelper.mo54005a();
                        if (a2 != null) {
                            a2.mo55511a(this.f70000a.f69976k);
                        }
                    }
                }
                C26080b b = C26077e.m63190a().mo53582a("light_ad").mo53593b("detail_show");
                C26579e params = this.f70000a.getParams();
                if (params != null) {
                    aweme = params.f69995c;
                } else {
                    aweme = null;
                }
                b.mo53590b(aweme).mo53597c();
                C26577c callback = this.f70000a.getCallback();
                if (callback != null) {
                    callback.mo54321a();
                }
                C26431bp bpVar = this.f70000a.f69971f;
                if (bpVar != null) {
                    bpVar.mo54157a(true);
                }
            }
        }

        /* renamed from: b */
        public final void mo54237b() {
            Aweme aweme;
            if (this.f70001b) {
                this.f70001b = false;
                C26379aj ajVar = this.f70000a.f69970e;
                if (ajVar != null) {
                    ajVar.mo54101b();
                }
                if (this.f70000a.f69968c) {
                    C24331b rootContainer = this.f70000a.getMBulletWebView().getRootContainer();
                    if (rootContainer != null) {
                        C24254b bVar = rootContainer.f64561y;
                        if (bVar != null) {
                            com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness a = C24249a.m59360a(bVar);
                            if (a != null) {
                                a.mo50002a();
                            }
                        }
                    }
                } else {
                    CommercializeWebViewHelper commercializeWebViewHelper = this.f70000a.f69972g;
                    if (commercializeWebViewHelper != null) {
                        PreRenderWebViewBusiness a2 = commercializeWebViewHelper.mo54005a();
                        if (a2 != null) {
                            a2.mo55509a();
                        }
                    }
                }
                C26080b b = C26077e.m63190a().mo53582a("light_ad").mo53593b("landing_page");
                String str = this.f70000a.f69973h;
                if (str == null) {
                    str = "slide";
                }
                C26080b g = b.mo53602g(str);
                C26579e params = this.f70000a.getParams();
                Aweme aweme2 = null;
                if (params != null) {
                    aweme = params.f69995c;
                } else {
                    aweme = null;
                }
                g.mo53590b(aweme).mo53597c();
                this.f70000a.f69973h = null;
                C26080b b2 = C26077e.m63190a().mo53582a("ad_wap_stat").mo53593b("stay_page");
                C26579e params2 = this.f70000a.getParams();
                if (params2 != null) {
                    aweme2 = params2.f69995c;
                }
                b2.mo53590b(aweme2).mo53592b(Long.valueOf(System.currentTimeMillis() - this.f70000a.f69974i)).mo53581a((Object) C52550ab.m112056b(new C52847n("light_page", Integer.valueOf(1)))).mo53597c();
                C26577c callback = this.f70000a.getCallback();
                if (callback != null) {
                    callback.mo54322b();
                }
                C26431bp bpVar = this.f70000a.f69971f;
                if (bpVar != null) {
                    bpVar.mo54157a(false);
                }
                this.f70000a.mo54305a(4);
            }
        }

        C26584i(AdLightWebPageView adLightWebPageView) {
            this.f70000a = adLightWebPageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$j */
    static final class C26585j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70002a;

        C26585j(AdLightWebPageView adLightWebPageView) {
            this.f70002a = adLightWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70002a.f69973h = "blank";
            this.f70002a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$k */
    static final class C26586k implements OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70003a;

        C26586k(AdLightWebPageView adLightWebPageView) {
            this.f70003a = adLightWebPageView;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f70003a.getMBottomSheet();
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$l */
    static final class C26587l implements OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70004a;

        C26587l(AdLightWebPageView adLightWebPageView) {
            this.f70004a = adLightWebPageView;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f70004a.getMBottomSheet();
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$m */
    static final class C26588m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70005a;

        C26588m(AdLightWebPageView adLightWebPageView) {
            this.f70005a = adLightWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70005a.f69973h = "button";
            this.f70005a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$n */
    static final class C26589n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70006a;

        C26589n(AdLightWebPageView adLightWebPageView) {
            this.f70006a = adLightWebPageView;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C26579e params = this.f70006a.getParams();
            if (params != null) {
                String str = params.f69993a;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str = null;
                    }
                    String str2 = str;
                    if (str2 != null) {
                        if (this.f70006a.f69968c) {
                            C10605a.m21368a(this.f70006a.getMBulletWebView(), C24348b.m59713a(str2, C52575l.m112092a("ad_commerce"), this.f70006a.f69969d, new C24338f(C11010c.m22280a())), this.f70006a.f69969d, null, 4, null);
                        } else {
                            CrossPlatformWebView.m65745a(this.f70006a.getMWebView(), str2, false, null, 6, null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$o */
    static final class C26590o extends C52712l implements C52670a<AdBottomSheetContainer> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70007a;

        C26590o(AdLightWebPageView adLightWebPageView) {
            this.f70007a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AdBottomSheetContainer) this.f70007a.f69967b.findViewById(R.id.dzz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$p */
    static final class C26591p extends C52712l implements C52670a<CommonBizWebView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70008a;

        C26591p(AdLightWebPageView adLightWebPageView) {
            this.f70008a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CommonBizWebView) this.f70008a.f69967b.findViewById(R.id.e16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$q */
    static final class C26592q extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70009a;

        C26592q(AdLightWebPageView adLightWebPageView) {
            this.f70009a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f70009a.f69967b.findViewById(R.id.ue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$r */
    static final class C26593r extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70010a;

        C26593r(AdLightWebPageView adLightWebPageView) {
            this.f70010a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f70010a.f69967b.findViewById(R.id.emu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$s */
    static final class C26594s extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70011a;

        C26594s(AdLightWebPageView adLightWebPageView) {
            this.f70011a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f70011a.f69967b.findViewById(R.id.e9h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$t */
    static final class C26595t extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70012a;

        C26595t(AdLightWebPageView adLightWebPageView) {
            this.f70012a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f70012a.f69967b.findViewById(R.id.eeb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$u */
    static final class C26596u extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70013a;

        C26596u(AdLightWebPageView adLightWebPageView) {
            this.f70013a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f70013a.f69967b.findViewById(R.id.efo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$v */
    static final class C26597v extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70014a;

        C26597v(AdLightWebPageView adLightWebPageView) {
            this.f70014a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f70014a.f69967b.findViewById(R.id.eiy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$w */
    static final class C26598w extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70015a;

        C26598w(AdLightWebPageView adLightWebPageView) {
            this.f70015a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f70015a.f69967b.findViewById(R.id.cbv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$x */
    static final class C26599x extends C52712l implements C52670a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70016a;

        C26599x(AdLightWebPageView adLightWebPageView) {
            this.f70016a = adLightWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CrossPlatformWebView) this.f70016a.f69967b.findViewById(R.id.duj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$y */
    public static final class C26600y implements C26654a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70017a;

        /* renamed from: b */
        final /* synthetic */ C10757a f70018b;

        /* renamed from: c */
        final /* synthetic */ String f70019c;

        /* renamed from: a */
        public final void mo54334a() {
            AdLightWebPageView.m64325a(this.f70018b, this.f70019c, false, new LinkedHashMap());
        }

        /* renamed from: a */
        public final void mo54335a(String str) {
            C52711k.m112240b(str, "pickedDate");
            AdLightWebPageView.m64325a(this.f70018b, this.f70019c, true, C52550ab.m112056b(new C52847n("selected", str)));
        }

        public C26600y(AdLightWebPageView adLightWebPageView, C10757a aVar, String str) {
            this.f70017a = adLightWebPageView;
            this.f70018b = aVar;
            this.f70019c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$z */
    public static final class C26601z implements C26667a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f70020a;

        /* renamed from: b */
        final /* synthetic */ C10757a f70021b;

        /* renamed from: c */
        final /* synthetic */ String f70022c;

        /* renamed from: a */
        public final void mo54336a() {
            AdLightWebPageView.m64325a(this.f70021b, this.f70022c, false, new LinkedHashMap());
        }

        /* renamed from: a */
        public final void mo54337a(List<Integer> list) {
            C52711k.m112240b(list, "selected");
            new StringBuilder("selected ").append(list);
            AdLightWebPageView.m64325a(this.f70021b, this.f70022c, true, C52550ab.m112056b(new C52847n("selected", list)));
        }

        public C26601z(AdLightWebPageView adLightWebPageView, C10757a aVar, String str) {
            this.f70020a = adLightWebPageView;
            this.f70021b = aVar;
            this.f70022c = str;
        }
    }

    /* renamed from: a */
    public static final boolean m64327a(Activity activity, String str) {
        return f69963l.mo54325a(activity, str);
    }

    public static final boolean dismiss(Activity activity) {
        return f69963l.dismiss(activity);
    }

    private final ImageView getMCloseView() {
        return (ImageView) this.f69981q.getValue();
    }

    private final FrameLayout getMFlTitleBar() {
        return (FrameLayout) this.f69984t.getValue();
    }

    private final ImageView getMIvDownArrow() {
        return (ImageView) this.f69985u.getValue();
    }

    private final ImageView getMIvHorizontalBar() {
        return (ImageView) this.f69986v.getValue();
    }

    private final FrameLayout getMLightWebPage() {
        return (FrameLayout) this.f69978n.getValue();
    }

    private final DmtTextView getMRetryView() {
        return (DmtTextView) this.f69983s.getValue();
    }

    public final C26577c getCallback() {
        return this.f69988x;
    }

    public final AdBottomSheetContainer getMBottomSheet() {
        return (AdBottomSheetContainer) this.f69977m.getValue();
    }

    public final CommonBizWebView getMBulletWebView() {
        return (CommonBizWebView) this.f69980p.getValue();
    }

    public final FrameLayout getMErrorView() {
        return (FrameLayout) this.f69982r.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.f69979o.getValue();
    }

    public final C26579e getParams() {
        return this.f69987w;
    }

    public final int getTitleBarState() {
        return this.f69989y;
    }

    /* renamed from: b */
    private final void m64328b() {
        if (!this.f69965B) {
            m64329c();
            this.f69965B = true;
        }
    }

    private final boolean getNeedPreload() {
        C26579e eVar = this.f69987w;
        if (eVar != null) {
            Aweme aweme = eVar.f69995c;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isPreloadExtraWeb()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void dismiss() {
        if (this.f69975j) {
            this.f69975j = false;
            C26528m.m64182a(getContext(), null, 2, null);
            return;
        }
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        if (mBottomSheet.mo54229a()) {
            mBottomSheet.f69891h.mo1301b(4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this.f69966C);
        C26379aj ajVar = this.f69970e;
        if (ajVar != null) {
            ajVar.mo54101b();
        }
        this.f69970e = null;
        C26431bp bpVar = this.f69971f;
        if (bpVar != null) {
            bpVar.mo54157a(false);
        }
        this.f69971f = null;
        if (this.f69968c) {
            this.f69964A.mo50055a(true);
            getMBulletWebView().mo18295a();
            return;
        }
        this.f69990z.mo54212a(true);
        CommercializeWebViewHelper commercializeWebViewHelper = this.f69972g;
        if (commercializeWebViewHelper != null) {
            commercializeWebViewHelper.onPause();
            commercializeWebViewHelper.onDestroy();
        }
        this.f69972g = null;
    }

    /* renamed from: a */
    public final boolean mo54307a() {
        return getMBottomSheet().mo54229a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this.f69966C);
        AdBottomSheetContainer mBottomSheet = getMBottomSheet();
        View mLightWebPage = getMLightWebPage();
        C52711k.m112240b(mLightWebPage, "view");
        LayoutParams layoutParams = mLightWebPage.getLayoutParams();
        if (layoutParams != null) {
            ((C0505d) layoutParams).mo1383a((Behavior) mBottomSheet.f69891h);
            getMIvHorizontalBar().setVisibility(8);
            getMBottomSheet().setCallback(new C26584i(this));
            getMLightWebPage().setOnClickListener(new C26585j(this));
            FrameLayout mLightWebPage2 = getMLightWebPage();
            int paddingLeft = getPaddingLeft();
            double a = (double) C23724k.m58221a(getContext());
            Double.isNaN(a);
            mLightWebPage2.setPadding(paddingLeft, (int) (a * 0.26836581709145424d), getPaddingRight(), getPaddingBottom());
            if (VERSION.SDK_INT >= 23) {
                if (this.f69968c) {
                    SSWebView webView = getMBulletWebView().getWebView();
                    if (webView != null) {
                        webView.setOnScrollChangeListener(new C26586k(this));
                    }
                } else {
                    ((C27309j) getMWebView().mo55670a(C27309j.class)).mo55729a().setOnScrollChangeListener(new C26587l(this));
                }
            }
            getMFlTitleBar().setOnClickListener(new C26588m(this));
            getMRetryView().setOnClickListener(new C26589n(this));
            Context context = getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                C26379aj ajVar = new C26379aj(activity);
                ajVar.f69599e = new C26582g(this);
                this.f69970e = ajVar;
                this.f69971f = new C26583h(this, activity, activity);
            }
            if (getNeedPreload()) {
                m64328b();
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
    }

    /* renamed from: c */
    private final void m64329c() {
        String str;
        boolean z;
        C0184k kVar;
        Aweme aweme;
        StringBuilder sb = new StringBuilder("load url=");
        C26579e eVar = this.f69987w;
        String str2 = null;
        if (eVar != null) {
            str = eVar.f69993a;
        } else {
            str = null;
        }
        sb.append(str);
        C26579e eVar2 = this.f69987w;
        if (eVar2 != null) {
            String str3 = eVar2.f69993a;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (getContext() instanceof Activity) {
                        C26579e eVar3 = this.f69987w;
                        if (eVar3 != null) {
                            kVar = eVar3.f69994b;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            C26117a aVar = new C26117a();
                            C26579e eVar4 = this.f69987w;
                            if (eVar4 != null) {
                                aweme = eVar4.f69995c;
                            } else {
                                aweme = null;
                            }
                            Bundle a = C26512f.m64125a((C26116c) aVar.mo53633a(aweme).f69675a);
                            String str4 = "url";
                            C26579e eVar5 = this.f69987w;
                            if (eVar5 != null) {
                                str2 = eVar5.f69993a;
                            }
                            a.putString(str4, str2);
                            a.putInt("preload_web_status", 7);
                            if (this.f69968c) {
                                this.f69969d = a;
                                CommonBizWebView mBulletWebView = getMBulletWebView();
                                C10246b bulletCoreProvider = C24098a.m58973a().getBulletCoreProvider();
                                C10488e eVar6 = this.f69964A;
                                Context context = getContext();
                                if (context != null) {
                                    C10577d bulletActivityWrapper = new BulletActivityWrapper((Activity) context);
                                    C26579e eVar7 = this.f69987w;
                                    if (eVar7 == null) {
                                        C52711k.m112234a();
                                    }
                                    C0184k kVar2 = eVar7.f69994b;
                                    if (kVar2 == null) {
                                        C52711k.m112234a();
                                    }
                                    mBulletWebView.mo50079a(bulletCoreProvider, eVar6, bulletActivityWrapper, kVar2, "ad_commerce");
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                                }
                            } else {
                                C27298a mWebView = getMWebView();
                                C27235d dVar = this.f69990z;
                                C26579e eVar8 = this.f69987w;
                                if (eVar8 == null) {
                                    C52711k.m112234a();
                                }
                                C0184k kVar3 = eVar8.f69994b;
                                if (kVar3 == null) {
                                    C52711k.m112234a();
                                }
                                Context context2 = getContext();
                                if (context2 != null) {
                                    this.f69972g = CommercializeWebViewHelper.m63705a(mWebView, dVar, kVar3, (Activity) context2, a);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                                }
                            }
                        }
                    }
                    Map linkedHashMap = new LinkedHashMap();
                    Map linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("source", "light_landing_page");
                    linkedHashMap2.put("preload", Integer.valueOf(getNeedPreload() ? 1 : 0));
                    String jSONObject = new JSONObject(linkedHashMap2).toString();
                    C52711k.m112236a((Object) jSONObject, "JSONObject(mutableMapOf<…            }).toString()");
                    linkedHashMap.put("X-Extra-Data", jSONObject);
                    if (this.f69968c) {
                        CommonBizWebView mBulletWebView2 = getMBulletWebView();
                        C26579e eVar9 = this.f69987w;
                        if (eVar9 == null) {
                            C52711k.m112234a();
                        }
                        CommonBizWebView.m59588a(mBulletWebView2, C24348b.m59713a(eVar9.f69993a, C52575l.m112092a("ad_commerce"), this.f69969d, new C24338f(C11010c.m22280a())), linkedHashMap, this.f69969d, (C10606b) null, 8, (Object) null);
                        return;
                    }
                    CrossPlatformWebView mWebView2 = getMWebView();
                    C26579e eVar10 = this.f69987w;
                    if (eVar10 == null) {
                        C52711k.m112234a();
                    }
                    CrossPlatformWebView.m65745a(mWebView2, eVar10.f69993a, false, linkedHashMap, 2, null);
                }
            }
        }
    }

    public final void setCallback(C26577c cVar) {
        this.f69988x = cVar;
    }

    public final void setParams(C26579e eVar) {
        this.f69987w = eVar;
    }

    public final void setTitleBarState(int i) {
        this.f69989y = i;
    }

    /* renamed from: a */
    public final void mo54306a(String str) {
        getMIvDownArrow().setAlpha(1.0f);
        getMBottomSheet().f69891h.mo1301b(3);
        if (!getNeedPreload()) {
            m64328b();
        }
        this.f69976k = str;
        if (C52711k.m112239a((Object) C27167a.m65569a(3), (Object) str)) {
            C26577c cVar = this.f69988x;
            if (cVar != null) {
                cVar.mo54323c();
            }
        }
    }

    /* renamed from: a */
    public final void mo54305a(int i) {
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 3:
                        this.f69989y = 3;
                        getMIvHorizontalBar().animate().setDuration(300).alpha(0.0f).start();
                        getMIvDownArrow().animate().setDuration(300).alpha(1.0f).start();
                        return;
                    case 4:
                        this.f69989y = 4;
                        getMIvHorizontalBar().setVisibility(8);
                        return;
                }
            } else if (this.f69989y != 7 && this.f69989y != 4) {
                this.f69989y = 7;
                getMIvHorizontalBar().setVisibility(0);
                getMIvHorizontalBar().animate().setDuration(300).alpha(1.0f).start();
                getMIvDownArrow().animate().setDuration(300).alpha(0.0f).start();
            } else {
                return;
            }
            return;
        }
        this.f69989y = 1;
    }

    public AdLightWebPageView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.bha, this);
        C52711k.m112236a((Object) inflate, "View.inflate(context, R.…_ad_light_web_page, this)");
        this.f69967b = inflate;
        this.f69977m = C52732g.m112285a(new C26590o(this));
        this.f69978n = C52732g.m112285a(new C26597v(this));
        this.f69979o = C52732g.m112285a(new C26599x(this));
        this.f69980p = C52732g.m112285a(new C26591p(this));
        this.f69981q = C52732g.m112285a(new C26592q(this));
        this.f69982r = C52732g.m112285a(new C26593r(this));
        this.f69983s = C52732g.m112285a(new C26598w(this));
        this.f69968c = FeedAdBulletExp.nonFullScreenLandPageEnable();
        this.f69984t = C52732g.m112285a(new C26594s(this));
        this.f69985u = C52732g.m112285a(new C26595t(this));
        this.f69986v = C52732g.m112285a(new C26596u(this));
        this.f69989y = 4;
        C26530o oVar = new C26530o();
        oVar.f69866e = new C26575a(this);
        this.f69990z = oVar;
        C24306f fVar = new C24306f();
        fVar.f64469e = new C26576b(this);
        this.f69964A = fVar;
        this.f69966C = new C26581f(this);
    }

    /* renamed from: a */
    public static void m64325a(C10757a aVar, String str, boolean z, Map<String, Object> map) {
        map.put("code", Integer.valueOf(z ? 1 : 0));
        if (aVar != null) {
            aVar.mo19455a(str, new JSONObject(map));
        }
    }

    public /* synthetic */ AdLightWebPageView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
