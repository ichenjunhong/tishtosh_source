package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p017a.p018a.C0227i;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p631c.C10248b;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10584e;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10611a;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.bullet.C24266e;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.GetWebViewInfo.C24121a;
import com.p683ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness.C24249a;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.p1478ui.GradualChangeLinearLayout;
import com.p683ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.commercialize.ILegacyCommercializeService;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27094a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52719s;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b */
public final class C24296b extends C24331b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64430a = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112245a(C24296b.class), "intercept", "<v#0>"))};

    /* renamed from: c */
    public static final C24297a f64431c = new C24297a(null);

    /* renamed from: b */
    public GradualChangeLinearLayout f64432b;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$a */
    public static final class C24297a {
        private C24297a() {
        }

        public /* synthetic */ C24297a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$b */
    static final class C24298b extends C52712l implements C52670a<C19763j> {

        /* renamed from: a */
        public static final C24298b f64433a = new C24298b();

        C24298b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C19763j.m48282a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$c */
    public static final class C24299c implements C10611a {

        /* renamed from: a */
        final /* synthetic */ C24296b f64434a;

        C24299c(C24296b bVar) {
            this.f64434a = bVar;
        }

        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f64434a.f64432b;
            if (gradualChangeLinearLayout != null) {
                gradualChangeLinearLayout.onScrollChanged(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$d */
    public static final class C24300d implements C10248b {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f64435a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24300d.class), "resourceLoader", "getResourceLoader()Lcom/ss/android/ugc/aweme/bullet/DefaultResourceLoader;"))};

        /* renamed from: b */
        private final C52668f f64436b = C52732g.m112286a(C52757k.NONE, C24301a.f64437a);

        /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$d$a */
        static final class C24301a extends C52712l implements C52670a<C24266e> {

            /* renamed from: a */
            public static final C24301a f64437a = new C24301a();

            C24301a() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b.C24300d.C24301a.invoke():java.lang.Object");
            }
        }

        C24300d() {
        }

        /* renamed from: a */
        public final C10247a mo18279a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return (C24266e) this.f64436b.getValue();
        }
    }

    /* renamed from: e */
    public final int mo50040e() {
        return R.layout.axm;
    }

    /* renamed from: i */
    public final void mo50044i() {
        super.mo50044i();
        GradualChangeLinearLayout gradualChangeLinearLayout = this.f64432b;
        if (gradualChangeLinearLayout != null) {
            gradualChangeLinearLayout.setGradualChangeMode(false);
        }
    }

    /* renamed from: f */
    public final boolean mo50041f() {
        String str;
        boolean f = super.mo50041f();
        if (!(this.f64546j instanceof C24310h)) {
            f = false;
        }
        C24336d dVar = this.f64546j;
        if (dVar != null) {
            str = dVar.mo50130k();
        } else {
            str = null;
        }
        if (!C19547d.m47842a(str)) {
            return false;
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50042g() {
        /*
            r13 = this;
            super.mo50042g()
            com.ss.android.ugc.aweme.bullet.module.base.d r0 = r13.f64546j
            com.ss.android.ugc.aweme.bullet.module.ad.h r0 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r0
            if (r0 == 0) goto L_0x003e
            r1 = 0
            java.lang.String r2 = r0.mo50064b()
            boolean r2 = com.bytedance.p879t.p882c.C13248c.m26638a(r2)
            if (r2 != 0) goto L_0x001f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x001f }
            java.lang.String r3 = r0.mo50064b()     // Catch:{ Exception -> 0x001f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001f }
            r12 = r2
            goto L_0x0020
        L_0x001f:
            r12 = r1
        L_0x0020:
            android.app.Activity r1 = r13.f64553q
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = "wap_stat"
            java.lang.String r6 = "wap_enter"
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r0 = r0.f64483T
            java.lang.Object r0 = r0.mo18457b()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = ""
        L_0x0035:
            r7 = r0
            r8 = 0
            r10 = 0
            com.p683ss.android.common.p1146d.C18898c.m46012a(r4, r5, r6, r7, r8, r10, r12)
            return
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b.mo50042g():void");
    }

    /* renamed from: h */
    public final boolean mo50043h() {
        C24336d dVar = this.f64546j;
        if (!(dVar instanceof C24310h)) {
            dVar = null;
        }
        C24310h hVar = (C24310h) dVar;
        if (hVar == null) {
            return false;
        }
        ILegacyCommercializeService a = C25944j.m62908a();
        C52711k.m112236a((Object) a, "ILegacyCommercializeService.impl()");
        return a.getVastUtilsService().mo54138a(C23324d.m57378a().getRawAdAwemeByAdId(String.valueOf(hVar.f64502e.mo18457b())));
    }

    /* renamed from: a */
    public final ViewGroup mo18747a(Context context) {
        C52711k.m112240b(context, "context");
        ViewGroup a = super.mo18747a(context);
        this.f64432b = (GradualChangeLinearLayout) mo50101j().findViewById(R.id.bfi);
        return a;
    }

    /* renamed from: a */
    public final void mo50036a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super.mo50036a(activity);
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f64561y.mo50011a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo49993d();
        }
    }

    /* renamed from: b */
    public final C10326b mo18749b(Context context) {
        C52711k.m112240b(context, "context");
        Intent intent = ((Activity) context).getIntent();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("is_lynx_landing_page", false);
        }
        if (!z) {
            return null;
        }
        C10326b bVar = new C10326b();
        bVar.mo18400b(C10248b.class, new C24300d());
        return bVar;
    }

    /* renamed from: c */
    public final void mo50039c(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super.mo50039c(activity);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64561y.mo50011a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo49970a();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f64561y.mo50011a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo49998a();
        }
    }

    @C53771m
    public final void onEvent(C24121a aVar) {
        C24112a aVar2;
        PreRenderWebViewBusiness a = C24249a.m59360a(this.f64561y);
        if (a != null) {
            a.mo50003a(aVar);
            return;
        }
        if (aVar != null) {
            aVar2 = aVar.f64004b;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null && aVar.f64003a != 0) {
            SSWebView sSWebView = this.f64544h;
            if (sSWebView != null && sSWebView.hashCode() == aVar.f64003a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("preloadType", 0);
                } catch (JSONException unused) {
                }
                aVar.f64004b.mo49913a(jSONObject);
            }
        }
    }

    /* renamed from: b */
    public final void mo50038b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super.mo50038b(activity);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64561y.mo50011a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo49976a(false);
        }
        this.f64561y.mo50011a(AdLynxStatBusiness.class);
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f64561y.mo50011a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo50001b();
        }
    }

    @C53771m
    public final void onEvent(C27094a aVar) {
        String str;
        Boolean bool = null;
        if (aVar != null) {
            str = aVar.f71463a;
        } else {
            str = null;
        }
        if (str != null && m59605k()) {
            String str2 = aVar.f71463a;
            if (str2 != null && str2.hashCode() == 51 && str2.equals("3") && C52711k.m112239a((Object) "1", (Object) this.f64558v)) {
                mo50099a("3");
                C24336d dVar = this.f64546j;
                if (dVar != null) {
                    C10385f<Boolean> fVar = dVar.f28114s;
                    if (fVar != null) {
                        bool = (Boolean) fVar.mo18457b();
                    }
                }
                if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                    mo50102l();
                    return;
                }
                GradualChangeLinearLayout gradualChangeLinearLayout = this.f64432b;
                if (gradualChangeLinearLayout != null) {
                    gradualChangeLinearLayout.setGradualChangeMode(false);
                }
                C20141b.m49698a((View) this.f64542f, 0);
                C24336d dVar2 = this.f64546j;
                if (dVar2 != null) {
                    BulletCommonTitleBar bulletCommonTitleBar = this.f64541e;
                    if (bulletCommonTitleBar != null) {
                        C10578a aVar2 = dVar2;
                        C52711k.m112240b(aVar2, "params");
                        C10584e eVar = (C10584e) aVar2.f28120y.mo18457b();
                        if (eVar == null || eVar.f28126a != -2) {
                            C10584e eVar2 = (C10584e) aVar2.f28120y.mo18457b();
                            if (eVar2 != null) {
                                bulletCommonTitleBar.setBackgroundColor(eVar2.f28126a);
                            }
                        } else {
                            bulletCommonTitleBar.setBackgroundResource(R.drawable.ro);
                        }
                        C10584e eVar3 = (C10584e) aVar2.f28121z.mo18457b();
                        if (eVar3 == null || eVar3.f28126a != -2) {
                            C10584e eVar4 = (C10584e) aVar2.f28121z.mo18457b();
                            if (eVar4 != null) {
                                ((DmtTextView) bulletCommonTitleBar.mo50149a((int) R.id.title)).setTextColor(eVar4.f28126a);
                            }
                            Context context = bulletCommonTitleBar.getContext();
                            if (context != null) {
                                C0227i a = C0227i.m462a(context.getResources(), (int) R.drawable.ctk, context.getTheme());
                                C10584e eVar5 = (C10584e) aVar2.f28121z.mo18457b();
                                if (!(eVar5 == null || a == null)) {
                                    a.setTint(eVar5.f28126a);
                                }
                                ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.uj)).setImageDrawable(a);
                            }
                        } else {
                            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.uj)).setImageResource(R.drawable.ctj);
                        }
                        View a2 = bulletCommonTitleBar.mo50149a((int) R.id.jz);
                        C52711k.m112236a((Object) a2, "bg_browser_title");
                        a2.setVisibility(8);
                        DmtTextView dmtTextView = (DmtTextView) bulletCommonTitleBar.mo50149a((int) R.id.title);
                        C52711k.m112236a((Object) dmtTextView, "title");
                        dmtTextView.setVisibility(0);
                        ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.uj)).setImageResource(R.drawable.ctj);
                        ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.ug)).setImageResource(R.drawable.ctm);
                        ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.p5)).setImageResource(R.drawable.cts);
                        ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.cbl)).setImageResource(R.drawable.ctq);
                        ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.ccm)).setImageResource(R.drawable.cto);
                    }
                }
            }
        }
    }

    public C24296b(C10326b bVar, C24254b bVar2) {
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(bVar2, "bulletBusiness");
        super(bVar, bVar2);
    }

    /* renamed from: a */
    public final void mo50037a(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        super.mo50037a(activity, bundle);
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) this.f64561y.mo50011a(QuickShopBusiness.class);
        if (quickShopBusiness != null) {
            quickShopBusiness.mo50007b();
        }
    }

    /* renamed from: a */
    public final void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        super.mo18697a(view, uri, iVar);
        SSWebView sSWebView = this.f64544h;
        if (sSWebView != null) {
            sSWebView.setWebScrollListener(new C24299c(this));
        }
        C24336d dVar = this.f64546j;
        if (dVar != null) {
            C10385f<C10584e> fVar = dVar.f28117v;
            if (fVar != null) {
                C10584e eVar = (C10584e) fVar.mo18457b();
                if (eVar != null) {
                    int i = eVar.f28126a;
                    GradualChangeLinearLayout gradualChangeLinearLayout = this.f64432b;
                    if (gradualChangeLinearLayout != null) {
                        gradualChangeLinearLayout.setBackgroundColor(i);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0338 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18698a(com.bytedance.ies.bullet.p628b.p633e.C10290i r7, android.net.Uri r8, com.bytedance.ies.bullet.p628b.p643i.C10423r r9) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "paramsBundle"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            super.mo18698a(r7, r8, r9)
            com.ss.android.ugc.aweme.bullet.module.base.d r7 = r6.f64546j
            boolean r7 = r7 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h
            if (r7 != 0) goto L_0x0019
            return
        L_0x0019:
            com.ss.android.ugc.aweme.bullet.module.base.d r7 = r6.f64546j
            if (r7 == 0) goto L_0x0339
            com.ss.android.ugc.aweme.bullet.module.ad.h r7 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r7
            com.bytedance.ies.bullet.b.i.l r9 = r7.f64502e
            java.lang.Object r9 = r9.mo18457b()
            java.lang.Long r9 = (java.lang.Long) r9
            r0 = 0
            if (r9 == 0) goto L_0x0030
            long r2 = r9.longValue()
            goto L_0x0031
        L_0x0030:
            r2 = r0
        L_0x0031:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0078
            java.lang.String r9 = "cid"
            java.lang.String r9 = r8.getQueryParameter(r9)
            if (r9 == 0) goto L_0x0048
            java.lang.Long r9 = p2628d.p2650m.C52830p.m112396d(r9)
            if (r9 == 0) goto L_0x0048
            long r2 = r9.longValue()
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            java.lang.String r9 = "ad_id"
            java.lang.String r9 = r8.getQueryParameter(r9)
            if (r9 == 0) goto L_0x005c
            java.lang.Long r9 = p2628d.p2650m.C52830p.m112396d(r9)
            if (r9 == 0) goto L_0x005c
            long r4 = r9.longValue()
            goto L_0x005d
        L_0x005c:
            r4 = r0
        L_0x005d:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x006b
            com.bytedance.ies.bullet.b.i.l r9 = r7.f64502e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.mo18456a(r2)
            goto L_0x0078
        L_0x006b:
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0078
            com.bytedance.ies.bullet.b.i.l r9 = r7.f64502e
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r9.mo18456a(r2)
        L_0x0078:
            java.lang.String r9 = "log_extra"
            java.lang.String r8 = r8.getQueryParameter(r9)
            boolean r9 = com.bytedance.p879t.p882c.C13248c.m26638a(r8)
            if (r9 != 0) goto L_0x0089
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r9 = r7.f64482S
            r9.mo18456a(r8)
        L_0x0089:
            com.bytedance.ies.bullet.b.i.l r8 = r7.f64502e
            java.lang.Object r8 = r8.mo18457b()
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x0098
            long r8 = r8.longValue()
            goto L_0x0099
        L_0x0098:
            r8 = r0
        L_0x0099:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c6
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r8 = r7.f64486W
            java.lang.Object r8 = r8.mo18457b()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = com.bytedance.p879t.p882c.C13248c.m26638a(r8)
            if (r8 == 0) goto L_0x00c6
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r8 = r7.f64486W
            com.ss.android.ugc.aweme.app.SharePrefCache r9 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r0 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            com.ss.android.ugc.aweme.app.bf r9 = r9.getJsActlogUrl()
            java.lang.String r0 = "SharePrefCache.inst().jsActlogUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            java.lang.Object r9 = r9.mo47782d()
            r8.mo18456a(r9)
        L_0x00c6:
            com.bytedance.ies.bullet.b.i.j r8 = r7.f64504g
            java.lang.Object r8 = r8.mo18457b()
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = 0
            r0 = 1
            if (r8 != 0) goto L_0x00d3
            goto L_0x00dc
        L_0x00d3:
            int r8 = r8.intValue()
            if (r8 != r0) goto L_0x00dc
            r7.f64498ai = r0
            goto L_0x00fd
        L_0x00dc:
            java.lang.String r8 = "0"
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r1 = r7.f28096C
            java.lang.Object r1 = r1.mo18457b()
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x00ed
            r7.f64498ai = r0
            goto L_0x00fd
        L_0x00ed:
            java.lang.String r8 = "1"
            com.bytedance.ies.bullet.b.i.f<java.lang.String> r1 = r7.f28096C
            java.lang.Object r1 = r1.mo18457b()
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x00fd
            r7.f64498ai = r9
        L_0x00fd:
            com.bytedance.ies.bullet.b.i.f<com.bytedance.ies.bullet.ui.common.d.e> r8 = r7.f28108m
            java.lang.Object r8 = r8.mo18457b()
            com.bytedance.ies.bullet.ui.common.d.e r8 = (com.bytedance.ies.bullet.p653ui.common.p657d.C10584e) r8
            r1 = 0
            if (r8 == 0) goto L_0x0162
            int r8 = r8.f28126a
            r2 = -2
            if (r8 != r2) goto L_0x0162
            com.bytedance.ies.bullet.b.i.f<com.bytedance.ies.bullet.ui.common.d.e> r8 = r7.f28117v
            com.bytedance.ies.bullet.ui.common.d.e r3 = new com.bytedance.ies.bullet.ui.common.d.e
            android.app.Activity r4 = r6.f64553q
            if (r4 == 0) goto L_0x0127
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L_0x0127
            r5 = 2131821851(0x7f11051b, float:1.9276457E38)
            int r4 = r4.getColor(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0128
        L_0x0127:
            r4 = r1
        L_0x0128:
            if (r4 != 0) goto L_0x012d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x012d:
            int r4 = r4.intValue()
            com.bytedance.ies.bullet.b.i.j r5 = r7.f64497ah
            java.lang.Object r5 = r5.mo18457b()
            if (r5 == 0) goto L_0x015c
            com.bytedance.ies.bullet.b.i.j r5 = r7.f64497ah
            java.lang.Object r5 = r5.mo18457b()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x0144
            goto L_0x014b
        L_0x0144:
            int r5 = r5.intValue()
            if (r5 != r2) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            com.bytedance.ies.bullet.b.i.j r7 = r7.f64497ah
            java.lang.Object r7 = r7.mo18457b()
            if (r7 != 0) goto L_0x0156
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0156:
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r7.intValue()
        L_0x015c:
            r3.<init>(r4)
            r8.mo18456a(r3)
        L_0x0162:
            com.ss.android.ugc.aweme.bullet.business.b r7 = r6.f64561y
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness> r8 = com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r7 = r7.mo50011a(r8)
            com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness r7 = (com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness) r7
            if (r7 == 0) goto L_0x01b8
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r8 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r2)     // Catch:{ Exception -> 0x01b7 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r8 = r8.getAdLandingPageConfig()     // Catch:{ Exception -> 0x01b7 }
            r7.f64327b = r8     // Catch:{ Exception -> 0x01b7 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r8 = r7.f64327b     // Catch:{ Exception -> 0x01b7 }
            if (r8 == 0) goto L_0x01b8
            java.lang.Boolean r2 = r8.getAdLandingPageReportWifiOnlyEnable()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r3 = "it.adLandingPageReportWifiOnlyEnable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x01b7 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x01b7 }
            r7.f64328c = r2     // Catch:{ Exception -> 0x01b7 }
            java.lang.Integer r2 = r8.getAdLandingPageReportPageCount()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r3 = "it.adLandingPageReportPageCount"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x01b7 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01b7 }
            r7.f64329d = r2     // Catch:{ Exception -> 0x01b7 }
            java.lang.Integer r2 = r8.getAdLandingPageReportLimitTimes()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r3 = "it.adLandingPageReportLimitTimes"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x01b7 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01b7 }
            r7.f64330e = r2     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r8 = r8.getAdLandingPageReportUrl()     // Catch:{ Exception -> 0x01b7 }
            if (r8 == 0) goto L_0x01b8
            r7.f64331f = r8     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01b8
        L_0x01b7:
        L_0x01b8:
            com.ss.android.ugc.aweme.web.q r7 = com.p683ss.android.ugc.aweme.web.C48380q.m104672e()
            java.lang.String r8 = "offlineBundleConfig"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            boolean r8 = r7.mo41207a()
            if (r8 == 0) goto L_0x0208
            com.ss.android.ugc.aweme.bullet.business.b r8 = r6.f64561y
            com.ss.android.ugc.aweme.bullet.module.ad.b$b r2 = com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b.C24298b.f64433a
            d.f.a.a r2 = (p2628d.p2639f.p2640a.C52670a) r2
            d.f r2 = p2628d.C52732g.m112285a(r2)
            java.lang.Object r3 = r2.getValue()
            com.ss.android.sdk.webview.j r3 = (com.p683ss.android.sdk.webview.C19763j) r3
            if (r3 == 0) goto L_0x01dc
            r3.mo41196b()
        L_0x01dc:
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r3 = com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r3 = r8.mo50011a(r3)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r3 = (com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r3
            if (r3 == 0) goto L_0x01f7
            java.lang.Object r2 = r2.getValue()
            com.ss.android.sdk.webview.j r2 = (com.p683ss.android.sdk.webview.C19763j) r2
            java.lang.String r4 = "intercept"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r4 = r7
            com.ss.android.sdk.webview.n r4 = (com.p683ss.android.sdk.webview.C19767n) r4
            r3.mo49973a(r2, r4)
        L_0x01f7:
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r2 = com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r8 = r8.mo50011a(r2)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r8 = (com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r8
            if (r8 == 0) goto L_0x0208
            java.util.List r7 = r7.mo41209c()
            r8.mo49975a(r7)
        L_0x0208:
            com.ss.android.ugc.aweme.bullet.module.base.d r7 = r6.f64546j
            m59605k()
            if (r7 == 0) goto L_0x021a
            com.bytedance.ies.bullet.b.i.b r7 = r7.f28100G
            if (r7 == 0) goto L_0x021a
            java.lang.Object r7 = r7.mo18457b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L_0x021b
        L_0x021a:
            r7 = r1
        L_0x021b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
            r7 = r7 ^ r0
            if (r7 == 0) goto L_0x0228
            r7 = 1
            goto L_0x0229
        L_0x0228:
            r7 = 0
        L_0x0229:
            switch(r7) {
                case 1: goto L_0x02d6;
                case 2: goto L_0x022e;
                default: goto L_0x022c;
            }
        L_0x022c:
            goto L_0x02d9
        L_0x022e:
            java.lang.String r7 = "2"
            r6.mo50099a(r7)
            android.widget.Space r7 = r6.f64542f
            android.view.View r7 = (android.view.View) r7
            com.p683ss.android.ttve.utils.C20141b.m49698a(r7, r9)
            com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout r7 = r6.f64432b
            if (r7 == 0) goto L_0x0243
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r8 = r6.f64541e
            r7.setTitleBar(r8)
        L_0x0243:
            com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout r7 = r6.f64432b
            if (r7 == 0) goto L_0x024a
            r7.setGradualChangeMode(r0)
        L_0x024a:
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r7 = r6.f64541e
            if (r7 == 0) goto L_0x02d9
            r7.setBackgroundColor(r9)
            r8 = 2132017628(0x7f1401dc, float:1.967354E38)
            android.view.View r2 = r7.mo50149a(r8)
            java.lang.String r3 = "bg_browser_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r9)
            android.view.View r8 = r7.mo50149a(r8)
            java.lang.String r9 = "bg_browser_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.content.Context r9 = r7.getContext()
            r2 = 2131952496(0x7f130370, float:1.9541436E38)
            android.graphics.drawable.Drawable r9 = android.support.p030v4.content.C0726c.m2091a(r9, r2)
            r8.setBackground(r9)
            r8 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r8 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            java.lang.String r9 = "title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r9 = 8
            r8.setVisibility(r9)
            r8 = 2132018103(0x7f1403b7, float:1.9674503E38)
            android.view.View r8 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.AutoRTLImageView r8 = (com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView) r8
            r9 = 2131952788(0x7f130494, float:1.9542029E38)
            r8.setImageResource(r9)
            r8 = 2132018097(0x7f1403b1, float:1.9674491E38)
            android.view.View r8 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.AutoRTLImageView r8 = (com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView) r8
            r9 = 2131952791(0x7f130497, float:1.9542035E38)
            r8.setImageResource(r9)
            r8 = 2132017862(0x7f1402c6, float:1.9674014E38)
            android.view.View r8 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.AutoRTLImageView r8 = (com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView) r8
            r9 = 2131952797(0x7f13049d, float:1.9542047E38)
            r8.setImageResource(r9)
            r8 = 2132022225(0x7f1413d1, float:1.9682864E38)
            android.view.View r8 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.AutoRTLImageView r8 = (com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView) r8
            r9 = 2131952795(0x7f13049b, float:1.9542043E38)
            r8.setImageResource(r9)
            r8 = 2132022277(0x7f141405, float:1.968297E38)
            android.view.View r7 = r7.mo50149a(r8)
            com.bytedance.ies.dmt.ui.widget.AutoRTLImageView r7 = (com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView) r7
            r8 = 2131952793(0x7f130499, float:1.9542039E38)
            r7.setImageResource(r8)
            goto L_0x02d9
        L_0x02d6:
            r6.mo50044i()
        L_0x02d9:
            com.ss.android.ugc.aweme.bullet.module.base.d r7 = r6.f64546j
            boolean r8 = r7 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h
            if (r8 != 0) goto L_0x02e0
            r7 = r1
        L_0x02e0:
            com.ss.android.ugc.aweme.bullet.module.ad.h r7 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r7
            if (r7 == 0) goto L_0x0338
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.List r9 = r7.mo18322a()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x0337
            java.util.List r7 = r7.mo18322a()
            java.util.Iterator r7 = r7.iterator()
        L_0x02fe:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0337
            java.lang.Object r9 = r7.next()
            com.bytedance.ies.bullet.b.i.f r9 = (com.bytedance.ies.bullet.p628b.p643i.C10385f) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.mo18454a()
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.lang.Object r9 = r9.mo18457b()
            if (r9 == 0) goto L_0x0326
            java.lang.String r9 = r9.toString()
            goto L_0x0327
        L_0x0326:
            r9 = r1
        L_0x0327:
            r0.append(r9)
            java.lang.String r9 = "\n"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.append(r9)
            goto L_0x02fe
        L_0x0337:
            return
        L_0x0338:
            return
        L_0x0339:
            d.u r7 = new d.u
            java.lang.String r8 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.module.ad.AdWebKitParamsBundle"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b.mo18698a(com.bytedance.ies.bullet.b.e.i, android.net.Uri, com.bytedance.ies.bullet.b.i.r):void");
    }
}
