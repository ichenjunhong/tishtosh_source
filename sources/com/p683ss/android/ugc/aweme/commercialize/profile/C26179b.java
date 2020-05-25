package com.p683ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.b */
public final class C26179b extends C1322a<C26180a> {

    /* renamed from: a */
    public CommonBizWebView f69136a;

    /* renamed from: b */
    public String f69137b = null;

    /* renamed from: c */
    private final Activity f69138c;

    /* renamed from: d */
    private C27235d f69139d;

    /* renamed from: e */
    private final Fragment f69140e;

    /* renamed from: f */
    private boolean f69141f = false;

    /* renamed from: g */
    private C10577d f69142g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.b$a */
    public static final class C26180a extends C1352v {
        public C26180a(CommonBizWebView commonBizWebView) {
            C52711k.m112240b(commonBizWebView, "itemView");
            super(commonBizWebView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.b$b */
    public static final class C26181b implements C27235d {
        C26181b() {
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        Bundle bundle;
        C52711k.m112240b(viewGroup, "parent");
        CommonBizWebView commonBizWebView = new CommonBizWebView(this.f69138c, null, 0, 6, null);
        commonBizWebView.mo18274a(C24098a.m58973a().getBulletCoreProvider());
        commonBizWebView.setActivityWrapper(this.f69142g);
        commonBizWebView.setIsAutoReleasableWhenDetached(false);
        this.f69136a = commonBizWebView;
        if (this.f69140e instanceof C26182c) {
            bundle = ((C26182c) this.f69140e).mo53811e();
        } else {
            bundle = new Bundle();
        }
        String str = "url";
        String str2 = this.f69137b;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(str, str2);
        CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f69138c, null, 0, 6, null);
        CommercializeWebViewHelper.m63705a(crossPlatformWebView, this.f69139d, this.f69140e, this.f69138c, bundle);
        CommonBizWebView commonBizWebView2 = this.f69136a;
        if (commonBizWebView2 == null) {
            C52711k.m112234a();
        }
        return new C26180a(commonBizWebView2);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C26180a aVar = (C26180a) vVar;
        C52711k.m112240b(aVar, "holder");
        if (aVar.itemView != null) {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            C52711k.m112236a((Object) bridgeService_Monster, "ServiceManager.get().get…ridgeService::class.java)");
            if (bridgeService_Monster.isHaveLatestTab()) {
                i2 = C23728o.m58241a(45.0d);
            } else {
                i2 = 0;
            }
            int e = (((C23724k.m58229e(this.f69138c) - C23724k.m58225c()) - ((int) this.f69138c.getResources().getDimension(R.dimen.vn))) - i2) - C23728o.m58241a(40.0d);
            if (this.f69141f) {
                e -= (int) this.f69138c.getResources().getDimension(R.dimen.a05);
            }
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            ((CommonBizWebView) view).setLayoutParams(new LayoutParams(C23724k.m58224b(this.f69138c), e));
            String str = this.f69137b;
            if (str != null) {
                ((CommonBizWebView) aVar.itemView).mo18731a(BulletService.provideBulletService_Monster().getBulletLoadingView(this.f69138c), 1, 0, C23728o.m58241a(80.0d), 0, 0);
                CommonBizWebView.m59589a((CommonBizWebView) aVar.itemView, C24348b.m59711a(str), false, (Bundle) null, (C10606b) null, 12, (Object) null);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView");
    }

    public C26179b(Fragment fragment, String str, boolean z, C10577d dVar) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(dVar, "bulletActivityWrapper");
        this.f69140e = fragment;
        this.f69142g = dVar;
        FragmentActivity activity = this.f69140e.getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f69138c = activity;
        this.f69139d = new C26181b();
    }
}
