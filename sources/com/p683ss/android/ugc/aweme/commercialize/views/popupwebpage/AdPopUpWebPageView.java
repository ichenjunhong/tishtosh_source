package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.app.Activity;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.p653ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10605a;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.DownloadBusiness;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24338f;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView.C24313b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24308g;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24308g.C24309a;
import com.p683ss.android.ugc.aweme.bullet.p1471ab.FeedAdBulletExp;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26366aa;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26431bp;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26543z;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26543z.C26544a;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer.C26745b;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer.C26746c;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebNaviBar.C26751a;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar.C26772b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27299b;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView */
public final class AdPopUpWebPageView extends FrameLayout implements C0183j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70473a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdPopUpWebPageView.class), "loadListener", "getLoadListener()Lcom/ss/android/ugc/aweme/commercialize/utils/AdPopUpWebPageLoadListener;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdPopUpWebPageView.class), "bulletLoadListener", "getBulletLoadListener()Lcom/ss/android/ugc/aweme/bullet/module/ad/AdPopUpWebPageLoadListener;"))};

    /* renamed from: j */
    public static final C26754b f70474j = new C26754b(null);

    /* renamed from: b */
    public C26431bp f70475b;

    /* renamed from: c */
    public AdPopUpWebPageContainer f70476c;

    /* renamed from: d */
    public boolean f70477d;

    /* renamed from: e */
    public boolean f70478e;

    /* renamed from: f */
    public boolean f70479f;

    /* renamed from: g */
    public String f70480g;

    /* renamed from: h */
    public final C26767o f70481h;

    /* renamed from: i */
    public final C26766n f70482i;

    /* renamed from: k */
    private C26366aa f70483k;

    /* renamed from: l */
    private C26756d f70484l;

    /* renamed from: m */
    private C26753a f70485m;

    /* renamed from: n */
    private C26755c f70486n;

    /* renamed from: o */
    private final C52668f f70487o;

    /* renamed from: p */
    private final C52668f f70488p;

    /* renamed from: q */
    private final C26757e f70489q;

    /* renamed from: r */
    private final OnTouchListener f70490r;

    /* renamed from: s */
    private final C26769q f70491s;

    /* renamed from: t */
    private final C26765m f70492t;

    /* renamed from: u */
    private HashMap f70493u;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$a */
    public interface C26753a {
        /* renamed from: a */
        void mo54638a();

        /* renamed from: b */
        void mo54639b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$b */
    public static final class C26754b {
        private C26754b() {
        }

        public /* synthetic */ C26754b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$c */
    public interface C26755c {
        /* renamed from: a */
        void mo54640a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$d */
    public interface C26756d {
        /* renamed from: a */
        void mo54641a();

        /* renamed from: b */
        void mo54642b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$e */
    public static final class C26757e implements C26745b {

        /* renamed from: a */
        public int f70494a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f70495b;

        /* renamed from: c */
        final /* synthetic */ Context f70496c;

        /* renamed from: a */
        public final void mo54598a() {
            if (this.f70494a != 3) {
                this.f70494a = 3;
            }
        }

        /* renamed from: b */
        public final void mo54600b() {
            if (this.f70494a != 4) {
                this.f70494a = 4;
            }
        }

        /* renamed from: c */
        public final void mo54601c() {
            if (C26746c.m64664a()) {
                C26528m.m64182a(this.f70496c, null, 2, null);
            }
        }

        /* renamed from: d */
        public final void mo54602d() {
            if (this.f70494a != 5) {
                this.f70494a = 5;
                if (this.f70495b.f70477d) {
                    this.f70495b.getBulletLoadListener().mo50060a(true);
                } else {
                    this.f70495b.getLoadListener().mo54225a(true);
                }
                C26431bp bpVar = this.f70495b.f70475b;
                if (bpVar != null) {
                    bpVar.mo54157a(false);
                }
                FrameLayout frameLayout = (FrameLayout) this.f70495b.mo54618a((int) R.id.eq3);
                C52711k.m112236a((Object) frameLayout, "pop_up_web_mark");
                frameLayout.setVisibility(8);
                ((FrameLayout) this.f70495b.mo54618a((int) R.id.eq3)).setOnClickListener(null);
                FrameLayout frameLayout2 = (FrameLayout) this.f70495b.mo54618a((int) R.id.eq3);
                C52711k.m112236a((Object) frameLayout2, "pop_up_web_mark");
                frameLayout2.setClickable(false);
                AdPopUpWebPageContainer adPopUpWebPageContainer = this.f70495b.f70476c;
                if (adPopUpWebPageContainer != null) {
                    C27177g crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness();
                    if (crossPlatformBusiness != null) {
                        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo55523a(AdWebStatBusiness.class);
                        if (adWebStatBusiness != null) {
                            adWebStatBusiness.mo55480a(true);
                        }
                    }
                }
                C26753a mBehaviorCallback = this.f70495b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.mo54639b();
                }
                this.f70495b.f70478e = false;
                if (this.f70495b.f70477d) {
                    this.f70495b.getBulletLoadListener().f64475f = true;
                } else {
                    this.f70495b.getLoadListener().f69890f = true;
                }
            }
        }

        C26757e(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f70495b = adPopUpWebPageView;
            this.f70496c = context;
        }

        /* renamed from: a */
        public final void mo54599a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                FrameLayout frameLayout = (FrameLayout) this.f70495b.mo54618a((int) R.id.eq3);
                C52711k.m112236a((Object) frameLayout, "pop_up_web_mark");
                frameLayout.setAlpha(1.0f);
                return;
            }
            if (f < 0.0f) {
                float abs = Math.abs(f);
                FrameLayout frameLayout2 = (FrameLayout) this.f70495b.mo54618a((int) R.id.eq3);
                C52711k.m112236a((Object) frameLayout2, "pop_up_web_mark");
                frameLayout2.setAlpha(1.0f - abs);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$f */
    static final class C26758f extends C52712l implements C52670a<C24308g> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70497a;

        C26758f(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70497a = adPopUpWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C24308g gVar = new C24308g();
            gVar.f64474e = this.f70497a.f70482i;
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$g */
    public static final class C26759g extends C26431bp {

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f70498b;

        /* renamed from: c */
        final /* synthetic */ Activity f70499c;

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || (!this.f70498b.mo54621a() && !this.f70498b.f70478e)) {
                return false;
            }
            C26755c keyDownCallBack = this.f70498b.getKeyDownCallBack();
            if (keyDownCallBack != null) {
                keyDownCallBack.mo54640a();
            }
            this.f70498b.dismiss();
            return true;
        }

        C26759g(AdPopUpWebPageView adPopUpWebPageView, Activity activity, Activity activity2) {
            this.f70498b = adPopUpWebPageView;
            this.f70499c = activity;
            super(activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$h */
    static final class C26760h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70500a;

        C26760h(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70500a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70500a.mo54620a((String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$i */
    static final class C26761i implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70501a;

        C26761i(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70501a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C26777a actionMode = this.f70501a.getActionMode();
            C52711k.m112236a((Object) motionEvent, "event");
            actionMode.mo54664a(motionEvent);
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C26746c.m64663a(true);
                        break;
                    case 1:
                        break;
                }
            }
            WebView webView = this.f70501a.getWebView();
            if (webView != null && webView.getScrollY() > 0) {
                C26746c.m64663a(false);
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$j */
    public static final class C26762j implements C24313b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70502a;

        C26762j(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70502a = adPopUpWebPageView;
        }

        /* renamed from: a */
        public final void mo50097a(int i, int i2, int i3, int i4) {
            boolean z;
            SSWebView webView = ((CommonBizWebView) this.f70502a.mo54618a((int) R.id.eq9)).getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C26746c.m64663a(z);
                ((AdPopUpWebNaviBar) this.f70502a.mo54618a((int) R.id.eq4)).mo54605a(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$k */
    public static final class C26763k implements C27299b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70503a;

        C26763k(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70503a = adPopUpWebPageView;
        }

        /* renamed from: a */
        public final void mo54645a(int i, int i2, int i3, int i4) {
            boolean z;
            WebView webView = this.f70503a.getWebView();
            if (webView != null) {
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C26746c.m64663a(z);
                ((AdPopUpWebNaviBar) this.f70503a.mo54618a((int) R.id.eq4)).mo54605a(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$l */
    static final class C26764l extends C52712l implements C52670a<C26543z> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70504a;

        C26764l(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70504a = adPopUpWebPageView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26543z zVar = new C26543z();
            zVar.f69889e = this.f70504a.f70481h;
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$m */
    public static final class C26765m implements C26751a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70505a;

        /* renamed from: a */
        public final void mo54615a() {
            if (this.f70505a.f70477d) {
                ((CommonBizWebView) this.f70505a.mo54618a((int) R.id.eq9)).mo50081b();
            } else {
                ((CrossPlatformWebView) this.f70505a.mo54618a((int) R.id.eq8)).mo55681a();
            }
        }

        /* renamed from: b */
        public final void mo54616b() {
            if (this.f70505a.f70477d) {
                SSWebView sSWebView = ((CommonBizWebView) this.f70505a.mo54618a((int) R.id.eq9)).f64520f;
                if (sSWebView != null) {
                    if (!sSWebView.canGoForward()) {
                        sSWebView = null;
                    }
                    if (sSWebView != null) {
                        sSWebView.goForward();
                    }
                }
                return;
            }
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f70505a.mo54618a((int) R.id.eq8);
            if (crossPlatformWebView.f71977c != 2 && ((SingleWebView) crossPlatformWebView.mo55669a((int) R.id.eu)).canGoForward()) {
                ((SingleWebView) crossPlatformWebView.mo55669a((int) R.id.eu)).goForward();
            }
        }

        C26765m(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70505a = adPopUpWebPageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$n */
    public static final class C26766n implements C24309a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70506a;

        /* renamed from: b */
        final /* synthetic */ Context f70507b;

        /* renamed from: a */
        public final void mo50061a() {
            FrameLayout frameLayout = (FrameLayout) this.f70506a.mo54618a((int) R.id.eq7);
            C52711k.m112236a((Object) frameLayout, "pop_up_web_network_error_view");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f70506a.mo54618a((int) R.id.eq8)).findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo50062b() {
            FrameLayout frameLayout = (FrameLayout) this.f70506a.mo54618a((int) R.id.eq7);
            C52711k.m112236a((Object) frameLayout, "pop_up_web_network_error_view");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f70506a.mo54618a((int) R.id.eq8)).findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: c */
        public final void mo50063c() {
            Context context = this.f70507b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                this.f70506a.f70479f = true;
                if (this.f70506a.mo54622b()) {
                    ((AdPopUpWebTitleBar) this.f70506a.mo54618a((int) R.id.eqe)).mo54654b();
                    ((RoundedFrameLayout) this.f70506a.mo54618a((int) R.id.eqb)).setBackgroundResource(R.drawable.cm1);
                    boolean z = false;
                    if (((CommonBizWebView) this.f70506a.mo54618a((int) R.id.eq9)).mo50082c()) {
                        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f70506a.mo54618a((int) R.id.eq4);
                        C52711k.m112236a((Object) adPopUpWebNaviBar, "pop_up_web_navi_bar");
                        if (adPopUpWebNaviBar.getVisibility() == 8) {
                            AdPopUpWebNaviBar adPopUpWebNaviBar2 = (AdPopUpWebNaviBar) this.f70506a.mo54618a((int) R.id.eq4);
                            C52711k.m112236a((Object) adPopUpWebNaviBar2, "pop_up_web_navi_bar");
                            adPopUpWebNaviBar2.setVisibility(0);
                        }
                    }
                    ((AdPopUpWebNaviBar) this.f70506a.mo54618a((int) R.id.eq4)).setGoBackEnable(((CommonBizWebView) this.f70506a.mo54618a((int) R.id.eq9)).mo50082c());
                    AdPopUpWebNaviBar adPopUpWebNaviBar3 = (AdPopUpWebNaviBar) this.f70506a.mo54618a((int) R.id.eq4);
                    SSWebView sSWebView = ((CommonBizWebView) this.f70506a.mo54618a((int) R.id.eq9)).f64520f;
                    if (sSWebView != null) {
                        z = sSWebView.canGoForward();
                    }
                    adPopUpWebNaviBar3.setGoForwardEnable(z);
                    return;
                }
                WebView webView = this.f70506a.getWebView();
                if (webView != null) {
                    if (webView.canGoBack()) {
                        ((AdPopUpWebTitleBar) this.f70506a.mo54618a((int) R.id.eqe)).mo54653a();
                    } else {
                        ((AdPopUpWebTitleBar) this.f70506a.mo54618a((int) R.id.eqe)).mo54654b();
                    }
                }
            }
        }

        C26766n(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f70506a = adPopUpWebPageView;
            this.f70507b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$o */
    public static final class C26767o implements C26544a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70508a;

        /* renamed from: b */
        final /* synthetic */ Context f70509b;

        /* renamed from: a */
        public final void mo54226a() {
            FrameLayout frameLayout = (FrameLayout) this.f70508a.mo54618a((int) R.id.eq7);
            C52711k.m112236a((Object) frameLayout, "pop_up_web_network_error_view");
            frameLayout.setVisibility(8);
            View findViewById = ((CrossPlatformWebView) this.f70508a.mo54618a((int) R.id.eq8)).findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo54227b() {
            FrameLayout frameLayout = (FrameLayout) this.f70508a.mo54618a((int) R.id.eq7);
            C52711k.m112236a((Object) frameLayout, "pop_up_web_network_error_view");
            frameLayout.setVisibility(0);
            View findViewById = ((CrossPlatformWebView) this.f70508a.mo54618a((int) R.id.eq8)).findViewById(R.id.abc);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: c */
        public final void mo54228c() {
            Context context = this.f70509b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            boolean z = true;
            if (activity == null || !activity.isFinishing()) {
                this.f70508a.f70479f = true;
                if (this.f70508a.mo54622b()) {
                    ((AdPopUpWebTitleBar) this.f70508a.mo54618a((int) R.id.eqe)).mo54654b();
                    ((RoundedFrameLayout) this.f70508a.mo54618a((int) R.id.eqb)).setBackgroundResource(R.drawable.cm1);
                    if (((CrossPlatformWebView) this.f70508a.mo54618a((int) R.id.eq8)).mo55683b()) {
                        AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f70508a.mo54618a((int) R.id.eq4);
                        C52711k.m112236a((Object) adPopUpWebNaviBar, "pop_up_web_navi_bar");
                        if (adPopUpWebNaviBar.getVisibility() == 8) {
                            AdPopUpWebNaviBar adPopUpWebNaviBar2 = (AdPopUpWebNaviBar) this.f70508a.mo54618a((int) R.id.eq4);
                            C52711k.m112236a((Object) adPopUpWebNaviBar2, "pop_up_web_navi_bar");
                            adPopUpWebNaviBar2.setVisibility(0);
                            ((AdPopUpWebNaviBar) this.f70508a.mo54618a((int) R.id.eq4)).mo54604a();
                        }
                    }
                    ((AdPopUpWebNaviBar) this.f70508a.mo54618a((int) R.id.eq4)).setGoBackEnable(((CrossPlatformWebView) this.f70508a.mo54618a((int) R.id.eq8)).mo55683b());
                    AdPopUpWebNaviBar adPopUpWebNaviBar3 = (AdPopUpWebNaviBar) this.f70508a.mo54618a((int) R.id.eq4);
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f70508a.mo54618a((int) R.id.eq8);
                    if (crossPlatformWebView.f71977c != 1 || !((SingleWebView) crossPlatformWebView.mo55669a((int) R.id.eu)).canGoForward()) {
                        z = false;
                    }
                    adPopUpWebNaviBar3.setGoForwardEnable(z);
                    return;
                }
                WebView webView = this.f70508a.getWebView();
                if (webView != null) {
                    C26779b.f70532a = webView.canGoBack();
                    if (webView.canGoBack()) {
                        ((AdPopUpWebTitleBar) this.f70508a.mo54618a((int) R.id.eqe)).mo54653a();
                    } else {
                        ((AdPopUpWebTitleBar) this.f70508a.mo54618a((int) R.id.eqe)).mo54654b();
                    }
                }
            }
        }

        C26767o(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f70508a = adPopUpWebPageView;
            this.f70509b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$p */
    static final class C26768p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70510a;

        C26768p(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70510a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70510a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$q */
    public static final class C26769q implements C26772b {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70511a;

        /* renamed from: b */
        final /* synthetic */ Context f70512b;

        /* renamed from: a */
        public final void mo54647a() {
            this.f70511a.f70480g = "button";
            this.f70511a.dismiss();
            C26756d titleBarCallback = this.f70511a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.mo54641a();
            }
        }

        /* renamed from: b */
        public final void mo54648b() {
            if (this.f70511a.f70477d) {
                ((CommonBizWebView) this.f70511a.mo54618a((int) R.id.eq9)).mo50081b();
            } else {
                ((CrossPlatformWebView) this.f70511a.mo54618a((int) R.id.eq8)).mo55681a();
            }
            this.f70511a.getTitleBarCallback();
        }

        /* renamed from: d */
        public final void mo54650d() {
            if (this.f70511a.mo54622b()) {
                if (this.f70511a.f70479f) {
                    CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) this.f70511a.mo54618a((int) R.id.eq8);
                    C52711k.m112236a((Object) crossPlatformWebView, "pop_up_web_page_webview");
                    C27177g crossPlatformBusiness = crossPlatformWebView.getCrossPlatformBusiness();
                    if (crossPlatformBusiness != null) {
                        LandingShareBusiness landingShareBusiness = (LandingShareBusiness) crossPlatformBusiness.mo55523a(LandingShareBusiness.class);
                        if (landingShareBusiness != null) {
                            landingShareBusiness.mo55469b(((C27309j) ((CrossPlatformWebView) this.f70511a.mo54618a((int) R.id.eq8)).mo55670a(C27309j.class)).mo55729a());
                        }
                    }
                    return;
                }
                CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) this.f70511a.mo54618a((int) R.id.eq8);
                C52711k.m112236a((Object) crossPlatformWebView2, "pop_up_web_page_webview");
                C27177g crossPlatformBusiness2 = crossPlatformWebView2.getCrossPlatformBusiness();
                if (crossPlatformBusiness2 != null) {
                    LandingShareBusiness landingShareBusiness2 = (LandingShareBusiness) crossPlatformBusiness2.mo55523a(LandingShareBusiness.class);
                    if (landingShareBusiness2 != null) {
                        landingShareBusiness2.mo55471c();
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54649c() {
            /*
                r5 = this;
                android.content.Context r0 = r5.f70512b
                boolean r1 = r0 instanceof android.app.Activity
                r2 = 0
                if (r1 != 0) goto L_0x0008
                r0 = r2
            L_0x0008:
                android.app.Activity r0 = (android.app.Activity) r0
                if (r0 != 0) goto L_0x000d
                return
            L_0x000d:
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r5.f70511a
                boolean r1 = r1.f70477d
                if (r1 == 0) goto L_0x005d
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r5.f70511a
                r3 = 2132021845(0x7f141255, float:1.9682093E38)
                android.view.View r1 = r1.mo54618a(r3)
                com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView r1 = (com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView) r1
                com.ss.android.ugc.aweme.bullet.module.base.b r1 = r1.getRootContainer()
                if (r1 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.bullet.business.b r1 = r1.f64561y
                if (r1 == 0) goto L_0x002d
                com.bytedance.ies.bullet.ui.common.d.a r1 = r1.mo50019b()
                goto L_0x002e
            L_0x002d:
                r1 = r2
            L_0x002e:
                boolean r4 = r1 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h
                if (r4 != 0) goto L_0x0033
                r1 = r2
            L_0x0033:
                com.ss.android.ugc.aweme.bullet.module.ad.h r1 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r1
                if (r1 == 0) goto L_0x005c
                java.lang.String r1 = r1.mo50124e()
                if (r1 != 0) goto L_0x003e
                goto L_0x005c
            L_0x003e:
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r2 = r5.f70511a
                android.view.View r2 = r2.mo54618a(r3)
                com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView r2 = (com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView) r2
                com.ss.android.ugc.aweme.bullet.module.base.b r2 = r2.getRootContainer()
                if (r2 == 0) goto L_0x009c
                com.ss.android.ugc.aweme.bullet.business.b r2 = r2.f64561y
                java.lang.Class<com.ss.android.ugc.aweme.bullet.business.ReportBusiness> r3 = com.p683ss.android.ugc.aweme.bullet.business.ReportBusiness.class
                com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r2 = r2.mo50011a(r3)
                com.ss.android.ugc.aweme.bullet.business.ReportBusiness r2 = (com.p683ss.android.ugc.aweme.bullet.business.ReportBusiness) r2
                if (r2 == 0) goto L_0x009c
                com.p683ss.android.ugc.aweme.bullet.business.ReportBusiness.m59365a(r0, r1)
                goto L_0x009c
            L_0x005c:
                return
            L_0x005d:
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r5.f70511a
                r2 = 2132021844(0x7f141254, float:1.968209E38)
                android.view.View r1 = r1.mo54618a(r2)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r1
                java.lang.String r3 = "pop_up_web_page_webview"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()
                if (r1 == 0) goto L_0x00a9
                com.ss.android.ugc.aweme.crossplatform.c.a r1 = r1.f71718a
                if (r1 == 0) goto L_0x00a9
                java.lang.String r1 = r1.f71713j
                if (r1 != 0) goto L_0x007c
                goto L_0x00a9
            L_0x007c:
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r1 = r5.f70511a
                android.view.View r1 = r1.mo54618a(r2)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r1
                java.lang.String r2 = "pop_up_web_page_webview"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.crossplatform.business.g r1 = r1.getCrossPlatformBusiness()
                if (r1 == 0) goto L_0x009c
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.ReportBusiness> r2 = com.p683ss.android.ugc.aweme.crossplatform.business.ReportBusiness.class
                com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r1 = r1.mo55523a(r2)
                com.ss.android.ugc.aweme.crossplatform.business.ReportBusiness r1 = (com.p683ss.android.ugc.aweme.crossplatform.business.ReportBusiness) r1
                if (r1 == 0) goto L_0x009c
                r1.mo55514a(r0)
            L_0x009c:
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r0 = r5.f70511a
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$d r0 = r0.getTitleBarCallback()
                if (r0 == 0) goto L_0x00a8
                r0.mo54642b()
                return
            L_0x00a8:
                return
            L_0x00a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C26769q.mo54649c():void");
        }

        C26769q(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f70511a = adPopUpWebPageView;
            this.f70512b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$r */
    static final class C26770r implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f70513a;

        C26770r(AdPopUpWebPageView adPopUpWebPageView) {
            this.f70513a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f70513a.getActionMode().mo54664a(motionEvent);
            AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) this.f70513a.mo54618a((int) R.id.eq4);
            C52711k.m112240b(motionEvent, "event");
            if (adPopUpWebNaviBar.getVisibility() != 8 && motionEvent.getAction() == 0) {
                adPopUpWebNaviBar.f70465a = false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final View mo54618a(int i) {
        if (this.f70493u == null) {
            this.f70493u = new HashMap();
        }
        View view = (View) this.f70493u.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f70493u.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C24308g getBulletLoadListener() {
        return (C24308g) this.f70488p.getValue();
    }

    public final C26755c getKeyDownCallBack() {
        return this.f70486n;
    }

    public final C26543z getLoadListener() {
        return (C26543z) this.f70487o.getValue();
    }

    public final C26753a getMBehaviorCallback() {
        return this.f70485m;
    }

    public final C26366aa getParams() {
        return this.f70483k;
    }

    public final C26756d getTitleBarCallback() {
        return this.f70484l;
    }

    /* renamed from: a */
    public final boolean mo54621a() {
        return ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).mo54589b();
    }

    public final C26777a getActionMode() {
        return ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).getActionMode();
    }

    /* renamed from: b */
    public final boolean mo54622b() {
        C26366aa aaVar = this.f70483k;
        if (aaVar != null) {
            AwemeRawAd awemeRawAd = aaVar.f69570f;
            if (awemeRawAd != null && awemeRawAd.getWebviewPannelStyle() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void dismiss() {
        AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0);
        if (adPopUpWebBottomSheetContainer.mo54589b()) {
            adPopUpWebBottomSheetContainer.f70457i.mo54341b(5);
        }
        C26528m.m64182a(getContext(), null, 2, null);
    }

    public final WebView getWebView() {
        return ((C27309j) ((CrossPlatformWebView) mo54618a((int) R.id.eq8)).mo55670a(C27309j.class)).mo55729a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f70477d) {
            C24331b rootContainer = ((CommonBizWebView) mo54618a((int) R.id.eq9)).getRootContainer();
            if (rootContainer != null) {
                C24254b bVar = rootContainer.f64561y;
                if (bVar != null) {
                    DownloadBusiness downloadBusiness = (DownloadBusiness) bVar.mo50011a(DownloadBusiness.class);
                    if (downloadBusiness != null) {
                        downloadBusiness.mo49981a();
                    }
                }
            }
            ((CommonBizWebView) mo54618a((int) R.id.eq9)).mo18295a();
        } else {
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f70476c;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.f71471f.getLifecycle().mo325b(adPopUpWebPageContainer);
                adPopUpWebPageContainer.mo55378h();
                adPopUpWebPageContainer.mo55379i();
            }
        }
        super.onDetachedFromWindow();
        C26431bp bpVar = this.f70475b;
        if (bpVar != null) {
            bpVar.mo54157a(false);
        }
        this.f70475b = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        int i;
        String str;
        super.onAttachedToWindow();
        C26366aa aaVar = this.f70483k;
        if (aaVar != null) {
            Bundle bundle = aaVar.f69569e;
            if (bundle != null) {
                View.inflate(getContext(), R.layout.bhb, this);
                FrameLayout frameLayout = (FrameLayout) mo54618a((int) R.id.env);
                C52711k.m112236a((Object) frameLayout, "it");
                LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    C26366aa aaVar2 = this.f70483k;
                    if (aaVar2 != null) {
                        i = aaVar2.f69567c;
                    } else {
                        i = 0;
                    }
                    marginLayoutParams.topMargin = i;
                    frameLayout.requestLayout();
                    int b = C23724k.m58224b(getContext());
                    int a = C23724k.m58221a(getContext());
                    C26779b.f70539h = (a - C23724k.m58225c()) / b;
                    C26779b.f70537f = b;
                    C26779b.f70538g = a;
                    AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0);
                    RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) mo54618a((int) R.id.eqb);
                    C52711k.m112236a((Object) roundedFrameLayout, "pop_up_web_round_layout");
                    View view = roundedFrameLayout;
                    C52711k.m112240b(view, "view");
                    LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        ((C0505d) layoutParams2).mo1383a((Behavior) adPopUpWebBottomSheetContainer.f70457i);
                        String string = bundle.getString("title");
                        if (C13248c.m26638a(string)) {
                            string = bundle.getString("bundle_web_title");
                        }
                        Activity activity = null;
                        if (C13248c.m26638a(string)) {
                            C26366aa aaVar3 = this.f70483k;
                            if (aaVar3 != null) {
                                str = aaVar3.f69565a;
                            } else {
                                str = null;
                            }
                            string = Uri.parse(str).getQueryParameter("title");
                        }
                        AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) mo54618a((int) R.id.eqe);
                        if (TextUtils.isEmpty(string)) {
                            string = adPopUpWebTitleBar.getContext().getString(R.string.dow);
                        }
                        adPopUpWebTitleBar.f70515a = string;
                        DmtTextView dmtTextView = (DmtTextView) adPopUpWebTitleBar.mo54652a(R.id.eqd);
                        C52711k.m112236a((Object) dmtTextView, "pop_up_web_title");
                        dmtTextView.setText(adPopUpWebTitleBar.f70515a);
                        C10705c.m21579a((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq1));
                        C10705c.m21579a((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq2));
                        C10705c.m21579a((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq_));
                        C10705c.m21579a((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eqc));
                        ((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq2)).setOnClickListener(new C26773c(adPopUpWebTitleBar));
                        ((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq_)).setOnClickListener(new C26774d(adPopUpWebTitleBar));
                        ((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eq1)).setOnClickListener(new C26775e(adPopUpWebTitleBar));
                        ((AutoRTLImageView) adPopUpWebTitleBar.mo54652a(R.id.eqc)).setOnClickListener(new C26776f(adPopUpWebTitleBar));
                        if (this.f70477d) {
                            CommonBizWebView commonBizWebView = (CommonBizWebView) mo54618a((int) R.id.eq9);
                            C52711k.m112236a((Object) commonBizWebView, "pop_up_web_page_webview_bullet");
                            commonBizWebView.setVisibility(0);
                            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo54618a((int) R.id.eq8);
                            C52711k.m112236a((Object) crossPlatformWebView, "pop_up_web_page_webview");
                            crossPlatformWebView.setVisibility(8);
                            ((CommonBizWebView) mo54618a((int) R.id.eq9)).setScrollListener(new C26762j(this));
                        } else {
                            ((C27309j) ((CrossPlatformWebView) mo54618a((int) R.id.eq8)).mo55670a(C27309j.class)).mo55729a().setWebScrollListener(new C26763k(this));
                        }
                        if (mo54622b()) {
                            ((RoundedFrameLayout) mo54618a((int) R.id.eqb)).setBackgroundResource(R.drawable.cm2);
                            ((RoundedFrameLayout) mo54618a((int) R.id.eqb)).setRadius(0);
                            ((CrossPlatformWebView) mo54618a((int) R.id.eq8)).setShouldShowProgressBarBg(true);
                        }
                        C10705c.m21579a((DmtTextView) mo54618a((int) R.id.eqa));
                        DmtTextView dmtTextView2 = (DmtTextView) mo54618a((int) R.id.e4l);
                        if (dmtTextView2 != null) {
                            dmtTextView2.setVisibility(8);
                        }
                        Context context = getContext();
                        if (context instanceof Activity) {
                            activity = context;
                        }
                        Activity activity2 = activity;
                        if (activity2 != null) {
                            this.f70475b = new C26759g(this, activity2, activity2);
                            if (this.f70477d) {
                                C26366aa aaVar4 = this.f70483k;
                                if (aaVar4 != null) {
                                    C0184k kVar = aaVar4.f69566b;
                                    if (kVar != null) {
                                        ((CommonBizWebView) mo54618a((int) R.id.eq9)).mo50079a(C24098a.m58973a().getBulletCoreProvider(), getBulletLoadListener(), new BulletActivityWrapper(activity2), kVar, "ad_commerce");
                                        C24331b rootContainer = ((CommonBizWebView) mo54618a((int) R.id.eq9)).getRootContainer();
                                        if (rootContainer != null) {
                                            C24254b bVar = rootContainer.f64561y;
                                            if (bVar != null) {
                                                DownloadBusiness downloadBusiness = (DownloadBusiness) bVar.mo50011a(DownloadBusiness.class);
                                                if (downloadBusiness != null) {
                                                    downloadBusiness.f64318b = R.id.dxa;
                                                    downloadBusiness.f64319c = R.id.dx_;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C26366aa aaVar5 = this.f70483k;
                                if (aaVar5 != null) {
                                    C0184k kVar2 = aaVar5.f69566b;
                                    if (kVar2 != null) {
                                        CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) mo54618a((int) R.id.eq8);
                                        C52711k.m112236a((Object) crossPlatformWebView2, "pop_up_web_page_webview");
                                        C27298a aVar = crossPlatformWebView2;
                                        C27235d loadListener = getLoadListener();
                                        C52711k.m112240b(activity2, "activity");
                                        C52711k.m112240b(aVar, "crossPlatformWebView");
                                        C52711k.m112240b(loadListener, "iSingleWebViewStatus");
                                        C52711k.m112240b(bundle, "bundle");
                                        C52711k.m112240b(kVar2, "lifecycleOwner");
                                        C27182a a2 = C27183a.m65605a(bundle);
                                        C52711k.m112236a((Object) a2, "CrossPlatformParams.Fact…createForFragment(bundle)");
                                        AdPopUpWebPageContainer adPopUpWebPageContainer = new AdPopUpWebPageContainer(activity2, aVar, loadListener, a2, kVar2, R.id.dxa, R.id.dx_);
                                        this.f70476c = adPopUpWebPageContainer;
                                    }
                                }
                            }
                            ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).setCallback(this.f70489q);
                            ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).getBehavior().f70036n = true;
                            ((DmtTextView) mo54618a((int) R.id.eqa)).setOnClickListener(new C26760h(this));
                            ((AdPopUpWebTitleBar) mo54618a((int) R.id.eqe)).setTitleBarListener(this.f70491s);
                            ((AdPopUpWebNaviBar) mo54618a((int) R.id.eq4)).setNaviBarListener(this.f70492t);
                            ((AdPopUpWebTitleBar) mo54618a((int) R.id.eqe)).setOnTouchListener(new C26761i(this));
                            if (this.f70477d) {
                                ((CommonBizWebView) mo54618a((int) R.id.eq9)).setOutTouchDelegate$main_tiktokI18nRelease(this.f70490r);
                            } else {
                                ((CrossPlatformWebView) mo54618a((int) R.id.eq8)).setWebViewTouchListener(this.f70490r);
                                if (mo54622b()) {
                                    CrossPlatformWebView crossPlatformWebView3 = (CrossPlatformWebView) mo54618a((int) R.id.eq8);
                                    C52711k.m112236a((Object) crossPlatformWebView3, "pop_up_web_page_webview");
                                    C27177g crossPlatformBusiness = crossPlatformWebView3.getCrossPlatformBusiness();
                                    if (crossPlatformBusiness != null) {
                                        LandingShareBusiness landingShareBusiness = (LandingShareBusiness) crossPlatformBusiness.mo55523a(LandingShareBusiness.class);
                                        if (landingShareBusiness != null) {
                                            landingShareBusiness.mo55464a((WebView) ((C27309j) ((CrossPlatformWebView) mo54618a((int) R.id.eq8)).mo55670a(C27309j.class)).mo55729a());
                                        }
                                    }
                                }
                            }
                            if (mo54622b()) {
                                AdPopUpWebTitleBar adPopUpWebTitleBar2 = (AdPopUpWebTitleBar) mo54618a((int) R.id.eqe);
                                int a3 = C23728o.m58241a(12.0d);
                                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) adPopUpWebTitleBar2.mo54652a(R.id.eqc);
                                C52711k.m112236a((Object) autoRTLImageView, "pop_up_web_share");
                                autoRTLImageView.setVisibility(0);
                                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) adPopUpWebTitleBar2.mo54652a(R.id.eq_);
                                C52711k.m112236a((Object) autoRTLImageView2, "pop_up_web_report");
                                autoRTLImageView2.setVisibility(8);
                                ((AutoRTLImageView) adPopUpWebTitleBar2.mo54652a(R.id.eq1)).setPadding(a3, a3, a3, a3);
                                ConstraintLayout constraintLayout = (ConstraintLayout) adPopUpWebTitleBar2.mo54652a(R.id.eqf);
                                C52711k.m112236a((Object) constraintLayout, "pop_up_web_title_bar_in");
                                LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                                layoutParams3.height = C23728o.m58241a(52.5d);
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) adPopUpWebTitleBar2.mo54652a(R.id.eqf);
                                C52711k.m112236a((Object) constraintLayout2, "pop_up_web_title_bar_in");
                                constraintLayout2.setLayoutParams(layoutParams3);
                                ((ConstraintLayout) adPopUpWebTitleBar2.mo54652a(R.id.eqf)).setBackgroundResource(R.drawable.cm1);
                                int a4 = C23728o.m58241a(52.5d);
                                CrossPlatformWebView crossPlatformWebView4 = (CrossPlatformWebView) mo54618a((int) R.id.eq8);
                                C52711k.m112236a((Object) crossPlatformWebView4, "pop_up_web_page_webview");
                                m64672a(crossPlatformWebView4, a4);
                                CommonBizWebView commonBizWebView2 = (CommonBizWebView) mo54618a((int) R.id.eq9);
                                C52711k.m112236a((Object) commonBizWebView2, "pop_up_web_page_webview_bullet");
                                m64672a(commonBizWebView2, a4);
                                FrameLayout frameLayout2 = (FrameLayout) mo54618a((int) R.id.eq7);
                                C52711k.m112236a((Object) frameLayout2, "pop_up_web_network_error_view");
                                m64672a(frameLayout2, a4);
                            }
                            return;
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    public final void setKeyDownCallBack(C26755c cVar) {
        this.f70486n = cVar;
    }

    public final void setMBehaviorCallback(C26753a aVar) {
        this.f70485m = aVar;
    }

    public final void setParams(C26366aa aaVar) {
        this.f70483k = aaVar;
    }

    public final void setTitleBarCallback(C26756d dVar) {
        this.f70484l = dVar;
    }

    /* renamed from: a */
    public final void mo54619a(C26780c cVar) {
        boolean z;
        C52711k.m112240b(cVar, "openParams");
        String str = cVar.f70546e;
        if (str == null) {
            C26366aa aaVar = this.f70483k;
            if (aaVar != null) {
                str = aaVar.f69565a;
            } else {
                str = null;
            }
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer = (AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0);
            adPopUpWebBottomSheetContainer.getActionMode().mo54663a(cVar.f70544c);
            adPopUpWebBottomSheetContainer.f70457i.mo54338a(adPopUpWebBottomSheetContainer.getActionMode().f70523a);
            switch (cVar.f70544c) {
                case 1:
                    break;
                case 2:
                    ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).mo54229a();
                    break;
                case 3:
                    ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).f70457i.mo54341b(4);
                    break;
                default:
                    return;
            }
            FrameLayout frameLayout = (FrameLayout) mo54618a((int) R.id.eq3);
            C52711k.m112236a((Object) frameLayout, "pop_up_web_mark");
            frameLayout.setVisibility(0);
            C26431bp bpVar = this.f70475b;
            if (bpVar != null) {
                bpVar.mo54157a(true);
            }
            AdPopUpWebTitleBar adPopUpWebTitleBar = (AdPopUpWebTitleBar) mo54618a((int) R.id.eqe);
            String str2 = cVar.f70547f;
            DmtTextView dmtTextView = (DmtTextView) adPopUpWebTitleBar.mo54652a(R.id.eqd);
            C52711k.m112236a((Object) dmtTextView, "pop_up_web_title");
            if (str2 == null) {
                str2 = adPopUpWebTitleBar.f70515a;
            }
            CharSequence charSequence2 = str2;
            if (charSequence2 == null) {
                charSequence2 = adPopUpWebTitleBar.getContext().getString(R.string.dow);
            }
            dmtTextView.setText(charSequence2);
            ((FrameLayout) mo54618a((int) R.id.eq3)).setOnClickListener(new C26768p(this));
            C26779b.f70534c = cVar.f70548g;
            WebView webView = getWebView();
            if (webView != null) {
                ((AdPopUpWebBottomSheetContainer) mo54618a((int) R.id.eq0)).setWebViewForDragBehavior(webView);
            }
            this.f70478e = true;
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.f70476c;
            if (adPopUpWebPageContainer != null) {
                adPopUpWebPageContainer.mo55377a();
            }
            C26753a aVar = this.f70485m;
            if (aVar != null) {
                aVar.mo54638a();
            }
            mo54620a(cVar.f70546e);
        }
    }

    /* renamed from: a */
    public final void mo54620a(String str) {
        String str2;
        String str3;
        if (str == null) {
            C26366aa aaVar = this.f70483k;
            if (aaVar != null) {
                str3 = aaVar.f69565a;
            } else {
                str3 = null;
            }
            str2 = str3;
        } else {
            str2 = str;
        }
        if (str2 != null) {
            ((AdPopUpWebTitleBar) mo54618a((int) R.id.eqe)).mo54654b();
            AdPopUpWebNaviBar adPopUpWebNaviBar = (AdPopUpWebNaviBar) mo54618a((int) R.id.eq4);
            C52711k.m112236a((Object) adPopUpWebNaviBar, "pop_up_web_navi_bar");
            adPopUpWebNaviBar.setVisibility(8);
            if (this.f70477d) {
                C26366aa aaVar2 = this.f70483k;
                if (aaVar2 != null) {
                    Bundle bundle = aaVar2.f69569e;
                    if (bundle != null) {
                        CommonBizWebView commonBizWebView = (CommonBizWebView) mo54618a((int) R.id.eq9);
                        if (str == null) {
                            C26366aa aaVar3 = this.f70483k;
                            if (aaVar3 == null) {
                                C52711k.m112234a();
                            }
                            str = aaVar3.f69565a;
                        }
                        C10605a.m21368a(commonBizWebView, C24348b.m59713a(str, C52575l.m112092a("ad_commerce"), bundle, new C24338f(C11010c.m22280a())), bundle, null, 4, null);
                        C24331b rootContainer = ((CommonBizWebView) mo54618a((int) R.id.eq9)).getRootContainer();
                        if (rootContainer != null) {
                            C24254b bVar = rootContainer.f64561y;
                            if (bVar != null) {
                                DownloadBusiness downloadBusiness = (DownloadBusiness) bVar.mo50011a(DownloadBusiness.class);
                                if (downloadBusiness != null) {
                                    downloadBusiness.mo49982a(((CommonBizWebView) mo54618a((int) R.id.eq9)).getWebView());
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
            if (mo54622b()) {
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) mo54618a((int) R.id.eq8);
                C52711k.m112236a((Object) crossPlatformWebView, "pop_up_web_page_webview");
                C27177g crossPlatformBusiness = crossPlatformWebView.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    LandingShareBusiness landingShareBusiness = (LandingShareBusiness) crossPlatformBusiness.mo55523a(LandingShareBusiness.class);
                    if (landingShareBusiness != null) {
                        landingShareBusiness.mo55465a(str2);
                    }
                }
            }
            CrossPlatformWebView.m65745a((CrossPlatformWebView) mo54618a((int) R.id.eq8), str2, false, null, 6, null);
        }
    }

    /* renamed from: a */
    private static void m64672a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public AdPopUpWebPageView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f70477d = FeedAdBulletExp.nonFullScreenLandPageEnable();
        this.f70487o = C52732g.m112285a(new C26764l(this));
        this.f70488p = C52732g.m112285a(new C26758f(this));
        this.f70489q = new C26757e(this, context);
        this.f70481h = new C26767o(this, context);
        this.f70482i = new C26766n(this, context);
        this.f70490r = new C26770r(this);
        this.f70491s = new C26769q(this, context);
        this.f70492t = new C26765m(this);
    }

    public /* synthetic */ AdPopUpWebPageView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
