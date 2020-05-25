package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10564a;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10611a;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.DownloadBusiness;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView */
public final class CommonBizWebView extends BulletContainerView {

    /* renamed from: g */
    public static final C24312a f64519g = new C24312a(null);

    /* renamed from: f */
    public SSWebView f64520f;

    /* renamed from: h */
    private C24326a f64521h;

    /* renamed from: i */
    private C24313b f64522i;

    /* renamed from: j */
    private C24331b f64523j;

    /* renamed from: k */
    private Activity f64524k;

    /* renamed from: l */
    private C10246b f64525l;

    /* renamed from: m */
    private C0184k f64526m;

    /* renamed from: n */
    private Map<String, String> f64527n;

    /* renamed from: o */
    private View f64528o;

    /* renamed from: p */
    private String f64529p;

    /* renamed from: q */
    private HashMap f64530q;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$a */
    public static final class C24312a {
        private C24312a() {
        }

        public /* synthetic */ C24312a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$b */
    public interface C24313b {
        /* renamed from: a */
        void mo50097a(int i, int i2, int i3, int i4);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$c */
    public static final class C24314c implements C10276j {

        /* renamed from: a */
        final /* synthetic */ JSONObject f64531a;

        /* renamed from: b */
        private final String f64532b = "notification";

        /* renamed from: c */
        private final Object f64533c;

        /* renamed from: a */
        public final String mo18285a() {
            return this.f64532b;
        }

        /* renamed from: b */
        public final Object mo18286b() {
            return this.f64533c;
        }

        C24314c(JSONObject jSONObject) {
            this.f64531a = jSONObject;
            this.f64533c = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView$d */
    public static final class C24315d implements C10611a {

        /* renamed from: a */
        final /* synthetic */ CommonBizWebView f64534a;

        C24315d(CommonBizWebView commonBizWebView) {
            this.f64534a = commonBizWebView;
        }

        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            C24313b scrollListener = this.f64534a.getScrollListener();
            if (scrollListener != null) {
                scrollListener.mo50097a(i, i2, i3, i4);
            }
        }
    }

    public CommonBizWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommonBizWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo18729a(int i) {
        if (this.f64530q == null) {
            this.f64530q = new HashMap();
        }
        View view = (View) this.f64530q.get(Integer.valueOf(R.id.e10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.e10);
        this.f64530q.put(Integer.valueOf(R.id.e10), findViewById);
        return findViewById;
    }

    public final Activity getActivity() {
        return this.f64524k;
    }

    public final C24331b getRootContainer() {
        return this.f64523j;
    }

    public final C24313b getScrollListener() {
        return this.f64522i;
    }

    public final SSWebView getWebView() {
        return this.f64520f;
    }

    /* renamed from: a */
    public final void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "param");
        super.mo18698a(iVar, uri, rVar);
        C24331b bVar = this.f64523j;
        if (bVar != null) {
            bVar.mo18698a(iVar, uri, rVar);
        }
    }

    /* renamed from: a */
    public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        super.mo18699a(list, uri, iVar, z);
        if (iVar instanceof C10524g) {
            C10524g gVar = (C10524g) iVar;
            gVar.mo18663a(this.f64527n);
            WebView m_ = gVar.mo18665m_();
            if (!(m_ instanceof SSWebView)) {
                m_ = null;
            }
            SSWebView sSWebView = (SSWebView) m_;
            if (sSWebView != null) {
                sSWebView.setWebScrollListener(new C24315d(this));
                C24326a aVar = new C24326a(sSWebView, false, false, null, 14, null);
                this.f64521h = aVar;
                C24326a aVar2 = this.f64521h;
                if (aVar2 != null) {
                    sSWebView.setWebViewEventDelegate(aVar2);
                }
                C24331b bVar = this.f64523j;
                if (bVar != null) {
                    C24254b bVar2 = bVar.f64561y;
                    if (bVar2 != null) {
                        DownloadBusiness downloadBusiness = (DownloadBusiness) bVar2.mo50011a(DownloadBusiness.class);
                        if (downloadBusiness != null) {
                            downloadBusiness.mo49982a(sSWebView);
                        }
                    }
                }
            } else {
                sSWebView = null;
            }
            this.f64520f = sSWebView;
        }
    }

    /* renamed from: a */
    public final void mo50080a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (getReactId().length() > 0) {
            jSONObject2.put("reactId", getReactId());
        }
        jSONObject2.put("data", jSONObject);
        onEvent(new C24314c(jSONObject2));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
    }

    /* renamed from: c */
    public final boolean mo50082c() {
        SSWebView sSWebView = this.f64520f;
        if (sSWebView != null) {
            return sSWebView.mo18793b();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo50081b() {
        SSWebView sSWebView = this.f64520f;
        if (sSWebView != null) {
            if (!sSWebView.mo18793b()) {
                sSWebView = null;
            }
            if (sSWebView != null) {
                sSWebView.goBack();
            }
        }
    }

    /* renamed from: a */
    public final void mo18295a() {
        C10564a aVar;
        super.mo18295a();
        C0184k kVar = this.f64526m;
        if (kVar != null) {
            C24331b bVar = this.f64523j;
            if (bVar != null) {
                aVar = bVar.mo18750b();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof CommonBizActivityDelegate)) {
                aVar = null;
            }
            CommonBizActivityDelegate commonBizActivityDelegate = (CommonBizActivityDelegate) aVar;
            if (commonBizActivityDelegate != null) {
                kVar.getLifecycle().mo325b(commonBizActivityDelegate);
                commonBizActivityDelegate.f64517b = null;
            }
        }
    }

    public final void setActivity(Activity activity) {
        this.f64524k = activity;
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
        setAutoReleasableWhenDetached(z);
    }

    public final void setRootContainer(C24331b bVar) {
        this.f64523j = bVar;
    }

    public final void setScrollListener(C24313b bVar) {
        this.f64522i = bVar;
    }

    public final void setWebView(SSWebView sSWebView) {
        this.f64520f = sSWebView;
    }

    public final void setCanScrollVertically$main_tiktokI18nRelease(boolean z) {
        C24326a aVar = this.f64521h;
        if (aVar != null) {
            aVar.f64574c = z;
        }
    }

    public final void setEnableScrollControl$main_tiktokI18nRelease(boolean z) {
        C24326a aVar = this.f64521h;
        if (aVar != null) {
            aVar.f64575d = z;
        }
    }

    public final void setOutTouchDelegate$main_tiktokI18nRelease(OnTouchListener onTouchListener) {
        C24326a aVar = this.f64521h;
        if (aVar != null) {
            aVar.f64576e = onTouchListener;
        }
    }

    @C53771m
    public final void onJsBroadcast(C29906l lVar) {
        C52711k.m112240b(lVar, "event");
        C24326a aVar = this.f64521h;
        if (aVar != null) {
            aVar.mo50117a(lVar);
        }
    }

    /* renamed from: a */
    public final void mo18274a(C10246b bVar) {
        C52711k.m112240b(bVar, "coreProvider");
        super.mo18274a(bVar);
        this.f64525l = bVar;
    }

    public CommonBizWebView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setAutoReleasableWhenDetached(true);
    }

    /* renamed from: a */
    public final void mo18730a(Uri uri, Bundle bundle, C10606b bVar) {
        C52711k.m112240b(uri, "uri");
        if (this.f64528o == null) {
            IBulletService provideBulletService_Monster = BulletService.provideBulletService_Monster();
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            View bulletLoadingView = provideBulletService_Monster.getBulletLoadingView(context);
            mo18731a(bulletLoadingView, 17, 0, 0, 0, 0);
            this.f64528o = bulletLoadingView;
        }
        super.mo18730a(uri, bundle, bVar);
    }

    public /* synthetic */ CommonBizWebView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50079a(com.bytedance.ies.bullet.p628b.C10244c.C10246b r3, com.bytedance.ies.bullet.kit.web.p648a.C10488e r4, com.bytedance.ies.bullet.p653ui.common.C10577d r5, android.arch.lifecycle.C0184k r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = "coreProvider"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r2.mo18274a(r3)
            com.bytedance.ies.bullet.b.c r3 = r3.mo18244a()
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.p628b.C10228a
            r1 = 0
            if (r0 != 0) goto L_0x0012
            r3 = r1
        L_0x0012:
            com.bytedance.ies.bullet.b.a r3 = (com.bytedance.ies.bullet.p628b.C10228a) r3
            if (r3 == 0) goto L_0x004f
            java.util.Map<java.lang.String, com.bytedance.ies.bullet.b.e> r0 = r3.f27572m
            java.lang.Object r7 = r0.get(r7)
            com.bytedance.ies.bullet.b.e r7 = (com.bytedance.ies.bullet.p628b.C10253e) r7
            if (r7 == 0) goto L_0x003f
            com.bytedance.ies.bullet.b.g.a.b r7 = r7.mo18291c()
            if (r7 == 0) goto L_0x003f
            java.lang.Class<com.bytedance.ies.bullet.ui.common.b.c> r0 = com.bytedance.ies.bullet.p653ui.common.p655b.C10566c.class
            java.lang.Object r7 = r7.mo18401c(r0)
            com.bytedance.ies.bullet.ui.common.b.c r7 = (com.bytedance.ies.bullet.p653ui.common.p655b.C10566c) r7
            if (r7 == 0) goto L_0x003f
            d.f.a.b r7 = r7.mo18247a()
            com.bytedance.ies.bullet.b.g.a.b r3 = r3.mo18262a()
            java.lang.Object r3 = r7.invoke(r3)
            com.bytedance.ies.bullet.ui.common.b.b r3 = (com.bytedance.ies.bullet.p653ui.common.p655b.C10565b) r3
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            boolean r7 = r3 instanceof com.p683ss.android.ugc.aweme.bullet.module.base.C24331b
            if (r7 != 0) goto L_0x0045
            r3 = r1
        L_0x0045:
            com.ss.android.ugc.aweme.bullet.module.base.b r3 = (com.p683ss.android.ugc.aweme.bullet.module.base.C24331b) r3
            r2.f64523j = r3
            com.ss.android.ugc.aweme.bullet.module.base.b r3 = r2.f64523j
            if (r3 == 0) goto L_0x004f
            r3.f64559w = r4
        L_0x004f:
            r2.f64526m = r6
            r2.setActivityWrapper(r5)
            android.app.Activity r3 = r5.mo18708a()
            if (r3 == 0) goto L_0x0078
            boolean r4 = r3 instanceof android.arch.lifecycle.C0184k
            if (r4 == 0) goto L_0x0067
            android.arch.lifecycle.k r4 = r2.f64526m
            if (r4 != 0) goto L_0x0067
            r4 = r3
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            r2.f64526m = r4
        L_0x0067:
            com.ss.android.ugc.aweme.bullet.module.base.b r4 = r2.f64523j
            if (r4 == 0) goto L_0x0079
            java.lang.String r6 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)
            r4.f64553q = r3
            com.ss.android.ugc.aweme.bullet.business.b r4 = r4.f64561y
            r4.mo50012a(r3)
            goto L_0x0079
        L_0x0078:
            r3 = r1
        L_0x0079:
            r2.f64524k = r3
            com.ss.android.ugc.aweme.bullet.module.base.b r3 = r2.f64523j
            if (r3 == 0) goto L_0x0088
            com.bytedance.ies.bullet.b.g.a.b r4 = r2.getProviderFactory()
            java.lang.Class<com.bytedance.ies.bullet.ui.common.b.b> r6 = com.bytedance.ies.bullet.p653ui.common.p655b.C10565b.class
            r4.mo18397a(r6, r3)
        L_0x0088:
            com.ss.android.ugc.aweme.bullet.module.base.b r3 = r2.f64523j
            if (r3 == 0) goto L_0x00b0
            com.bytedance.ies.bullet.ui.common.b.a r3 = r3.mo18750b()
            android.arch.lifecycle.k r4 = r2.f64526m
            if (r4 == 0) goto L_0x00ac
            boolean r6 = r3 instanceof com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate
            if (r6 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r1 = r3
        L_0x009a:
            com.ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate r1 = (com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate) r1
            if (r1 == 0) goto L_0x00ac
            android.app.Activity r6 = r2.f64524k
            r1.f64517b = r6
            android.arch.lifecycle.h r4 = r4.getLifecycle()
            r6 = r3
            android.arch.lifecycle.j r6 = (android.arch.lifecycle.C0183j) r6
            r4.mo324a(r6)
        L_0x00ac:
            r5.mo18715a(r3)
            return
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView.mo50079a(com.bytedance.ies.bullet.b.c$b, com.bytedance.ies.bullet.kit.web.a.e, com.bytedance.ies.bullet.ui.common.d, android.arch.lifecycle.k, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo18731a(View view, int i, int i2, int i3, int i4, int i5) {
        C52711k.m112240b(view, "loadingView");
        this.f64528o = view;
        super.mo18731a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public static /* synthetic */ void m59588a(CommonBizWebView commonBizWebView, Uri uri, Map map, Bundle bundle, C10606b bVar, int i, Object obj) {
        C52711k.m112240b(uri, "uri");
        commonBizWebView.f64527n = map;
        commonBizWebView.mo18730a(uri, bundle, (C10606b) null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m59589a(CommonBizWebView commonBizWebView, Uri uri, boolean z, Bundle bundle, C10606b bVar, int i, Object obj) {
        C52711k.m112240b(uri, "uri");
        if (!C52711k.m112239a((Object) commonBizWebView.f64529p, (Object) uri.toString())) {
            commonBizWebView.f64529p = uri.toString();
            commonBizWebView.mo18730a(uri, (Bundle) null, (C10606b) null);
        }
    }
}
