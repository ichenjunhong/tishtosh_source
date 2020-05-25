package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.p683ss.android.newmedia.p1195a.C19541d;
import com.p683ss.android.sdk.p1207a.C19717a;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1 */
public final class BaseCommonBizRootContainer$provideActivityDelegate$1 extends CommonBizActivityDelegate {

    /* renamed from: a */
    final /* synthetic */ C24316a f64516a;

    BaseCommonBizRootContainer$provideActivityDelegate$1(C24316a aVar) {
        this.f64516a = aVar;
    }

    /* renamed from: d */
    public final void mo18720d(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f64516a.mo50100b("onStart");
    }

    /* renamed from: e */
    public final void mo18721e(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f64516a.mo50100b("onResume");
    }

    /* renamed from: f */
    public final void mo18722f(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C47718bf.m103291d(this.f64516a);
        C19541d.m47826a(this.f64516a.f64544h);
        this.f64516a.mo50036a(activity);
        this.f64516a.mo50100b("onDestroy");
    }

    /* renamed from: a */
    public final void mo18671a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f64516a.mo50100b("onResume");
        SSWebView sSWebView = this.f64516a.f64544h;
        if (sSWebView != null) {
            sSWebView.onResume();
            sSWebView.resumeTimers();
        }
        WalletBusiness walletBusiness = (WalletBusiness) this.f64516a.f64561y.mo50011a(WalletBusiness.class);
        if (walletBusiness != null) {
            walletBusiness.mo50008a();
        }
        this.f64516a.f64556t = System.currentTimeMillis();
        this.f64516a.mo50039c(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18672b(android.app.Activity r10) {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.ss.android.ugc.aweme.bullet.module.base.a r0 = r9.f64516a
            java.lang.String r1 = "onPause"
            r0.mo50100b(r1)
            com.ss.android.ugc.aweme.bullet.module.base.a r0 = r9.f64516a
            com.bytedance.ies.bullet.ui.common.view.SSWebView r0 = r0.f64544h
            if (r0 == 0) goto L_0x005e
            r0.onPause()
            com.ss.android.ugc.aweme.bullet.module.base.a r1 = r9.f64516a
            java.util.List<java.lang.String> r2 = r1.f64555s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0051
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            d.l.g r2 = p2628d.p2629a.C52575l.m112148k(r2)
            d.l.g r2 = p2628d.p2649l.C52786h.m112350e(r2)
            if (r2 == 0) goto L_0x0051
            java.util.Iterator r2 = r2.mo110157a()
        L_0x002d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            com.bytedance.ies.bullet.ui.common.view.SSWebView r6 = r1.f64544h
            if (r6 == 0) goto L_0x004d
            java.lang.String r6 = r6.getUrl()
            if (r6 == 0) goto L_0x004d
            r7 = 2
            r8 = 0
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r6, r5, r4, r7, r8)
            if (r5 != r3) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 == 0) goto L_0x002d
            r4 = 1
        L_0x0051:
            if (r4 != 0) goto L_0x005b
            com.ss.android.ugc.aweme.bullet.module.base.a r1 = r9.f64516a
            boolean r1 = r1.mo50043h()
            if (r1 == 0) goto L_0x005e
        L_0x005b:
            r0.pauseTimers()
        L_0x005e:
            com.ss.android.ugc.aweme.bullet.module.base.a r0 = r9.f64516a
            android.app.Activity r0 = r0.f64553q
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.aweme.bullet.module.base.a r1 = r9.f64516a
            com.bytedance.ies.bullet.ui.common.view.SSWebView r1 = r1.f64544h
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            com.p683ss.android.newmedia.p1195a.C19541d.m47825a(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.bullet.module.base.a r2 = r9.f64516a
            long r2 = r2.f64556t
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.bullet.module.base.a r2 = r9.f64516a
            r3 = 0
            r2.f64556t = r3
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "duration"
            r2.mo47827a(r3, r0)
            java.lang.String r0 = "h5_stay_time"
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.bullet.module.base.a r0 = r9.f64516a
            r0.mo50038b(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1.mo18672b(android.app.Activity):void");
    }

    /* renamed from: a */
    public final void mo18712a(Activity activity, Configuration configuration) {
        C52711k.m112240b(activity, "activity");
        if (configuration != null) {
            OpenURLHintLayout openURLHintLayout = this.f64516a.f64543g;
            if (openURLHintLayout != null) {
                Context context = activity;
                openURLHintLayout.setLayoutParams(new LayoutParams((int) C20141b.m49696a(context, (float) configuration.screenWidthDp), (int) C20141b.m49696a(context, (float) configuration.screenHeightDp)));
            }
        }
    }

    /* renamed from: a */
    public final void mo18713a(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        this.f64516a.f64561y.mo50012a(activity);
        C47718bf.m103290c(this.f64516a);
        this.f64516a.mo50037a(activity, bundle);
        this.f64516a.mo50100b("onCreate");
    }

    /* renamed from: a */
    public final void mo18711a(Activity activity, int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        C47937a.m103720a(activity, i, strArr, iArr);
    }

    /* renamed from: a */
    public final void mo18710a(Activity activity, int i, int i2, Intent intent) {
        C52711k.m112240b(activity, "activity");
        if (((WalletBusiness) this.f64516a.f64561y.mo50011a(WalletBusiness.class)) != null) {
            String str = this.f64516a.f64549m;
            if (str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "wallet/home", false, 2, (Object) null)) {
                C47718bf.m103288a(new C19717a().mo41119a(i).mo41121b(i2).mo41120a(intent));
            }
        }
    }
}
