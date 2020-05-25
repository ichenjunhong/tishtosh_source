package com.p683ss.android.ugc.aweme.bullet.p1471ab;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.bullet.p628b.C10228a;
import com.bytedance.ies.bullet.p628b.C10244c;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.C10253e;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p631c.C10248b;
import com.bytedance.ies.bullet.p628b.p633e.C10278b;
import com.bytedance.ies.bullet.p628b.p636f.C10316a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p653ui.common.C10562b;
import com.bytedance.ies.bullet.p653ui.common.C10562b.C10563a;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10566c;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.C24266e;
import com.p683ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness.C24249a;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24338f;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27110e;
import com.p683ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27230a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.experiment.C39867a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.ab.a */
public final class C24100a implements C39867a {

    /* renamed from: a */
    public static final C52668f f63973a = C52732g.m112285a(C24102b.f63976a);

    /* renamed from: b */
    public static final C24101a f63974b = new C24101a(null);

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$a */
    public static final class C24101a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f63975a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24101a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/bullet/ab/BulletFragmentABHelper;"))};

        private C24101a() {
        }

        public /* synthetic */ C24101a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$b */
    static final class C24102b extends C52712l implements C52670a<C24100a> {

        /* renamed from: a */
        public static final C24102b f63976a = new C24102b();

        C24102b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C24100a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$c */
    public static final class C24103c extends C27230a {

        /* renamed from: a */
        final /* synthetic */ String f63977a;

        /* renamed from: b */
        final /* synthetic */ C11079a f63978b;

        /* renamed from: c */
        final /* synthetic */ SingleWebView f63979c;

        /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$c$a */
        static final class C24104a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C24103c f63980a;

            C24104a(C24103c cVar) {
                this.f63980a = cVar;
            }

            public final void run() {
                this.f63980a.f63979c.removeOnSingleWebViewStatus(this.f63980a);
            }
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            super.mo49880a(webView, str);
            if (!(webView == null || str == null || !C52830p.m112456b((CharSequence) str, (CharSequence) this.f63977a, false, 2, (Object) null))) {
                webView.clearHistory();
                MixActivityContainer mixActivityContainer = ((C27110e) this.f63978b).f71520a;
                if (mixActivityContainer != null) {
                    mixActivityContainer.f71496j.mo55657c();
                }
            }
            this.f63979c.post(new C24104a(this));
        }

        C24103c(String str, C11079a aVar, SingleWebView singleWebView) {
            this.f63977a = str;
            this.f63978b = aVar;
            this.f63979c = singleWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$d */
    public static final class C24105d implements C10248b {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f63981a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24105d.class), "resourceLoader", "getResourceLoader()Lcom/ss/android/ugc/aweme/bullet/DefaultResourceLoader;"))};

        /* renamed from: b */
        private final C52668f f63982b = C52732g.m112286a(C52757k.NONE, C24106a.f63983a);

        /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$d$a */
        static final class C24106a extends C52712l implements C52670a<C24266e> {

            /* renamed from: a */
            public static final C24106a f63983a = new C24106a();

            C24106a() {
                super(0);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
                if (r0 == null) goto L_0x0016;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke() {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.ad.services.IAdService r0 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                    com.ss.android.ugc.aweme.ad.services.IAdService r0 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r0
                    if (r0 == 0) goto L_0x0016
                    com.ss.android.ugc.aweme.ad.f.b r0 = r0.getAdLandPagePreloadService()
                    if (r0 == 0) goto L_0x0016
                    java.lang.String r1 = "lynx_feed"
                    java.lang.String r0 = r0.mo46659e(r1)
                    if (r0 != 0) goto L_0x0018
                L_0x0016:
                    java.lang.String r0 = ""
                L_0x0018:
                    com.ss.android.ugc.aweme.bullet.e r1 = new com.ss.android.ugc.aweme.bullet.e
                    android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                    if (r2 == 0) goto L_0x002d
                    android.app.Application r2 = (android.app.Application) r2
                    com.ss.android.ugc.aweme.web.b r3 = new com.ss.android.ugc.aweme.web.b
                    r3.<init>(r0)
                    com.ss.android.sdk.webview.n r3 = (com.p683ss.android.sdk.webview.C19767n) r3
                    r1.<init>(r2, r3)
                    return r1
                L_0x002d:
                    d.u r0 = new d.u
                    java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.p1471ab.C24100a.C24105d.C24106a.invoke():java.lang.Object");
            }
        }

        C24105d() {
        }

        /* renamed from: a */
        public final C10247a mo18279a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return (C24266e) this.f63982b.getValue();
        }
    }

    private C24100a() {
    }

    public /* synthetic */ C24100a(C52707g gVar) {
        this();
    }

    /* renamed from: d */
    public final boolean mo49879d(C11079a aVar) {
        C52711k.m112240b(aVar, "adBrowserContainerFragment");
        if (aVar instanceof C10562b) {
            return ((C10562b) aVar).isViewValid();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49874a(C11079a aVar) {
        C52711k.m112240b(aVar, "fragment");
        if (aVar instanceof C27110e) {
            MixActivityContainer mixActivityContainer = ((C27110e) aVar).f71520a;
            if (mixActivityContainer != null) {
                mixActivityContainer.mo55406r();
            }
        } else if (aVar instanceof C10562b) {
            C10562b bVar = (C10562b) aVar;
            C10565b b = bVar.mo18745b();
            if (!(b instanceof C24296b)) {
                b = null;
            }
            if (((C24296b) b) == null) {
                bVar.getContext();
            }
            C10565b b2 = bVar.mo18745b();
            if (!(b2 instanceof C24296b)) {
                b2 = null;
            }
            C24296b bVar2 = (C24296b) b2;
            if (bVar2 != null) {
                PlayableBusiness playableBusiness = (PlayableBusiness) bVar2.f64561y.mo50011a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f64347a = false;
                    playableBusiness.mo50000a(false, true);
                }
                PreRenderWebViewBusiness a = C24249a.m59360a(bVar2.f64561y);
                if (a != null) {
                    a.mo50004a((String) null);
                }
            }
        } else {
            C32458a.m75144a("fragment onShow failed");
        }
    }

    /* renamed from: b */
    public final void mo49877b(C11079a aVar) {
        C52711k.m112240b(aVar, "adBrowserContainerFragment");
        if (aVar instanceof C27110e) {
            MixActivityContainer mixActivityContainer = ((C27110e) aVar).f71520a;
            if (mixActivityContainer != null) {
                mixActivityContainer.mo55407s();
            }
        } else if (aVar instanceof C10562b) {
            C10562b bVar = (C10562b) aVar;
            C10565b b = bVar.mo18745b();
            if (!(b instanceof C24296b)) {
                b = null;
            }
            if (((C24296b) b) == null) {
                bVar.getContext();
            }
            C10565b b2 = bVar.mo18745b();
            if (!(b2 instanceof C24296b)) {
                b2 = null;
            }
            C24296b bVar2 = (C24296b) b2;
            if (bVar2 != null) {
                AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) bVar2.f64561y.mo50011a(AdWebStatBusiness.class);
                if (adWebStatBusiness != null) {
                    adWebStatBusiness.mo49976a(true);
                }
                bVar2.f64561y.mo50011a(AdLynxStatBusiness.class);
                PlayableBusiness playableBusiness = (PlayableBusiness) bVar2.f64561y.mo50011a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f64347a = true;
                    playableBusiness.mo50000a(true, false);
                }
                PreRenderWebViewBusiness a = C24249a.m59360a(bVar2.f64561y);
                if (a != null) {
                    a.mo50002a();
                }
            }
        } else {
            C32458a.m75144a("fragment onHide failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49878c(com.bytedance.ies.uikit.base.C11079a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "adBrowserContainerFragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            boolean r0 = r5 instanceof com.bytedance.ies.bullet.p653ui.common.C10562b
            r1 = 0
            if (r0 == 0) goto L_0x0044
            com.bytedance.ies.bullet.ui.common.b r5 = (com.bytedance.ies.bullet.p653ui.common.C10562b) r5
            com.bytedance.ies.bullet.ui.common.b.b r0 = r5.mo18745b()
            boolean r2 = r0 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b
            r3 = 0
            if (r2 != 0) goto L_0x0016
            r0 = r3
        L_0x0016:
            com.ss.android.ugc.aweme.bullet.module.ad.b r0 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b) r0
            if (r0 != 0) goto L_0x001d
            r5.getContext()
        L_0x001d:
            com.bytedance.ies.bullet.ui.common.b.b r5 = r5.mo18745b()
            boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b
            if (r0 != 0) goto L_0x0026
            r5 = r3
        L_0x0026:
            com.ss.android.ugc.aweme.bullet.module.ad.b r5 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b) r5
            if (r5 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.bullet.business.b r5 = r5.f64561y
            if (r5 == 0) goto L_0x0033
            com.bytedance.ies.bullet.ui.common.d.a r5 = r5.mo50019b()
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h
            if (r0 != 0) goto L_0x0039
            r5 = r3
        L_0x0039:
            com.ss.android.ugc.aweme.bullet.module.ad.h r5 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r5
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.f64498ai
            r0 = 1
            if (r5 != r0) goto L_0x0043
            return r0
        L_0x0043:
            return r1
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.p1471ab.C24100a.mo49878c(com.bytedance.ies.uikit.base.a):boolean");
    }

    /* renamed from: a */
    public final void mo49875a(C11079a aVar, Runnable runnable) {
        C52711k.m112240b(aVar, "fragment");
        C52711k.m112240b(runnable, "iBack");
        if (aVar instanceof C27110e) {
            C27110e eVar = (C27110e) aVar;
            eVar.f71521b = runnable;
            if (eVar.f71520a != null) {
                eVar.f71520a.mo55368a(runnable);
            }
            return;
        }
        if (aVar instanceof C10562b) {
            C10562b bVar = (C10562b) aVar;
            C10565b b = bVar.mo18745b();
            if (!(b instanceof C24296b)) {
                b = null;
            }
            if (((C24296b) b) == null) {
                bVar.getContext();
            }
            C10565b b2 = bVar.mo18745b();
            if (!(b2 instanceof C24296b)) {
                b2 = null;
            }
            C24296b bVar2 = (C24296b) b2;
            if (bVar2 != null) {
                C52711k.m112240b(runnable, "backListener");
                bVar2.f64552p = runnable;
            }
        } else {
            C32458a.m75144a("fragment setBackListener failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49876a(com.bytedance.ies.uikit.base.C11079a r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "adBrowserContainerFragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            if (r7 != 0) goto L_0x0008
            return
        L_0x0008:
            boolean r0 = r6 instanceof com.p683ss.android.ugc.aweme.crossplatform.activity.C27110e
            if (r0 == 0) goto L_0x0038
            r0 = r6
            com.ss.android.ugc.aweme.crossplatform.activity.e r0 = (com.p683ss.android.ugc.aweme.crossplatform.activity.C27110e) r0
            com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer r1 = r0.f71520a
            if (r1 == 0) goto L_0x0022
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.view.j> r2 = com.p683ss.android.ugc.aweme.crossplatform.view.C27309j.class
            com.ss.android.ugc.aweme.crossplatform.view.i r1 = r1.mo55364a(r2)
            com.ss.android.ugc.aweme.crossplatform.view.j r1 = (com.p683ss.android.ugc.aweme.crossplatform.view.C27309j) r1
            if (r1 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = r1.mo55729a()
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.bullet.ab.a$c r2 = new com.ss.android.ugc.aweme.bullet.ab.a$c
            r2.<init>(r7, r6, r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r2 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d) r2
            r1.addOnSingleWebViewStatus(r2)
        L_0x002f:
            com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer r6 = r0.f71520a
            if (r6 == 0) goto L_0x0037
            r6.mo54146b(r7)
            goto L_0x0097
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = r6 instanceof com.bytedance.ies.bullet.p653ui.common.C10562b
            if (r0 == 0) goto L_0x0092
            r0 = r6
            com.bytedance.ies.bullet.ui.common.b r0 = (com.bytedance.ies.bullet.p653ui.common.C10562b) r0
            android.os.Bundle r1 = r0.getArguments()
            android.support.v4.app.FragmentActivity r2 = r0.getActivity()
            if (r2 != 0) goto L_0x004c
            com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x004c:
            r2 = 0
            if (r1 == 0) goto L_0x0055
            java.lang.String r3 = "is_lynx_landing_page"
            boolean r2 = r1.getBoolean(r3, r2)
        L_0x0055:
            if (r2 == 0) goto L_0x006e
            com.bytedance.ies.bullet.ui.common.BulletContainerView r2 = r0.f28065e
            if (r2 != 0) goto L_0x0060
            java.lang.String r3 = "bulletContainerView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0060:
            com.bytedance.ies.bullet.b.g.a.b r2 = r2.getProviderFactory()
            java.lang.Class<com.bytedance.ies.bullet.b.c.b> r3 = com.bytedance.ies.bullet.p628b.p631c.C10248b.class
            com.ss.android.ugc.aweme.bullet.ab.a$d r4 = new com.ss.android.ugc.aweme.bullet.ab.a$d
            r4.<init>()
            r2.mo18400b(r3, r4)
        L_0x006e:
            java.lang.String r2 = "ad_commerce"
            java.util.List r2 = p2628d.p2629a.C52575l.m112092a(r2)
            com.ss.android.ugc.aweme.bullet.module.base.f r3 = new com.ss.android.ugc.aweme.bullet.module.base.f
            android.support.v4.app.FragmentActivity r4 = r0.getActivity()
            if (r4 == 0) goto L_0x007f
            android.content.Context r4 = (android.content.Context) r4
            goto L_0x0083
        L_0x007f:
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x0083:
            r3.<init>(r4)
            com.ss.android.ugc.aweme.bullet.api.a r3 = (com.p683ss.android.ugc.aweme.bullet.api.C24107a) r3
            android.net.Uri r7 = com.p683ss.android.ugc.aweme.bullet.utils.C24348b.m59713a(r7, r2, r1, r3)
            com.bytedance.ies.bullet.ui.common.e$b r6 = (com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b) r6
            r0.mo18730a(r7, r1, r6)
            return
        L_0x0092:
            java.lang.String r6 = "fragment loadUrl failed"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.p1471ab.C24100a.mo49876a(com.bytedance.ies.uikit.base.a, java.lang.String):void");
    }

    /* renamed from: a */
    public final C11079a mo49873a(Activity activity, Bundle bundle, String str) {
        Object obj;
        C10244c cVar;
        C10565b bVar;
        boolean z = bundle.getBoolean("is_lynx_landing_page", false);
        if (!FeedAdBulletExp.fakeLandPageEnable() && !z) {
            return new C27110e();
        }
        if (activity == null) {
            C32458a.m75144a("createBulletAdFragment failed caz activity is null");
            return new C27110e();
        }
        C10562b bVar2 = new C10562b();
        C10563a aVar = new C10563a(bVar2);
        C10246b bulletCoreProvider = C24098a.m58973a().getBulletCoreProvider();
        C52711k.m112240b(bulletCoreProvider, "coreProvider");
        aVar.f28070a = bulletCoreProvider;
        aVar.f28073d.mo18274a(bulletCoreProvider);
        C10577d bulletActivityWrapper = new BulletActivityWrapper(activity);
        C52711k.m112240b(bulletActivityWrapper, "activityWrapper");
        aVar.f28071b = bulletActivityWrapper;
        C10562b bVar3 = aVar.f28073d;
        C52711k.m112240b(bulletActivityWrapper, "activityWrapper");
        bVar3.f28061a = bulletActivityWrapper;
        String str2 = "ad_commerce";
        C52711k.m112240b(str2, "packageName");
        aVar.f28072c = str2;
        C10562b bVar4 = aVar.f28073d;
        C52711k.m112240b(str2, "containerPackageName");
        bVar4.f28064d = str2;
        Uri uri = null;
        if (!(aVar.f28070a == null || aVar.f28071b == null || TextUtils.isEmpty(aVar.f28072c))) {
            C10562b bVar5 = aVar.f28073d;
            String str3 = aVar.f28072c;
            if (str3 == null) {
                C52711k.m112234a();
            }
            C10246b bVar6 = bVar5.f28063c;
            if (bVar6 != null) {
                cVar = bVar6.mo18244a();
            } else {
                cVar = null;
            }
            if (!(cVar instanceof C10228a)) {
                cVar = null;
            }
            C10228a aVar2 = (C10228a) cVar;
            if (aVar2 != null) {
                C10253e eVar = (C10253e) aVar2.f27572m.get(str3);
                if (eVar != null) {
                    C10326b c = eVar.mo18291c();
                    if (c != null) {
                        C10566c cVar2 = (C10566c) c.mo18401c(C10566c.class);
                        if (cVar2 != null) {
                            bVar = (C10565b) cVar2.mo18247a().invoke(aVar2.mo18262a());
                            bVar5.f28062b = bVar;
                        }
                    }
                }
                bVar = null;
                bVar5.f28062b = bVar;
            }
        }
        Context context = activity;
        bVar2.mo18731a(BulletService.provideBulletService_Monster().getBulletLoadingView(context), 17, 0, 0, 0, 0);
        bVar2.setArguments(bundle);
        if (str != null) {
            Uri a = C24348b.m59713a(str, C52575l.m112092a("ad_commerce"), bundle, new C24338f(context));
            C10423r hVar = new C24310h();
            C52711k.m112240b(hVar, "params");
            C52711k.m112240b(hVar, "params");
            if (a != null) {
                C10316a aVar3 = new C10316a();
                aVar3.mo18493a(Uri.class, a);
                obj = (Uri) aVar3.f27725b.mo18457b();
                if (obj != null) {
                    C10278b bVar7 = new C10278b();
                    bVar7.mo18493a(Uri.class, obj);
                    uri = (Uri) bVar7.f27675a.mo18457b();
                }
            } else {
                obj = null;
            }
            if (bundle != null) {
                hVar.mo18493a(Bundle.class, bundle);
            }
            if (obj != null) {
                hVar.mo18493a(Uri.class, obj);
            }
            if (uri != null) {
                hVar.mo18493a(Uri.class, uri);
            }
            C10565b bVar8 = bVar2.f28062b;
            if (bVar8 != null) {
                bVar8.mo18748a(a, bundle, hVar);
            }
        }
        return bVar2;
    }
}
