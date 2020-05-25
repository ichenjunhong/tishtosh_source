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
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.a */
public final class C26176a extends C1322a<C26177a> {

    /* renamed from: a */
    public CrossPlatformWebView f69129a;

    /* renamed from: b */
    private final Activity f69130b;

    /* renamed from: c */
    private C27235d f69131c;

    /* renamed from: d */
    private final Fragment f69132d;

    /* renamed from: e */
    private String f69133e = null;

    /* renamed from: f */
    private boolean f69134f;

    /* renamed from: g */
    private final boolean f69135g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.a$a */
    public static final class C26177a extends C1352v {
        public C26177a(CrossPlatformWebView crossPlatformWebView) {
            C52711k.m112240b(crossPlatformWebView, "itemView");
            super(crossPlatformWebView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.a$b */
    public static final class C26178b implements C27235d {
        C26178b() {
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

    /* renamed from: a */
    public final void mo53806a(String str) {
        C52711k.m112240b(str, "url");
        this.f69133e = str;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        Bundle bundle;
        C52711k.m112240b(viewGroup, "parent");
        CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f69130b, null, 0, 6, null);
        this.f69129a = crossPlatformWebView;
        if (this.f69132d instanceof C26182c) {
            bundle = ((C26182c) this.f69132d).mo53811e();
        } else {
            bundle = new Bundle();
        }
        String str = "url";
        String str2 = this.f69133e;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(str, str2);
        CrossPlatformWebView crossPlatformWebView2 = this.f69129a;
        if (crossPlatformWebView2 == null) {
            C52711k.m112234a();
        }
        CommercializeWebViewHelper.m63705a(crossPlatformWebView2, this.f69131c, this.f69132d, this.f69130b, bundle);
        CrossPlatformWebView crossPlatformWebView3 = this.f69129a;
        if (crossPlatformWebView3 == null) {
            C52711k.m112234a();
        }
        return new C26177a(crossPlatformWebView3);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C26177a aVar = (C26177a) vVar;
        C52711k.m112240b(aVar, "holder");
        if (aVar.itemView != null) {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            C52711k.m112236a((Object) bridgeService_Monster, "ServiceManager.get().get…ridgeService::class.java)");
            if (bridgeService_Monster.isHaveLatestTab()) {
                i2 = C23728o.m58241a(45.0d);
            } else {
                i2 = 0;
            }
            int e = (((C23724k.m58229e(this.f69130b) - C23724k.m58225c()) - ((int) this.f69130b.getResources().getDimension(R.dimen.vn))) - i2) - C23728o.m58241a(40.0d);
            if (this.f69134f) {
                e -= (int) this.f69130b.getResources().getDimension(R.dimen.a05);
            }
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            ((CrossPlatformWebView) view).setLayoutParams(new LayoutParams(C23724k.m58224b(this.f69130b), e));
            String str = this.f69133e;
            if (str != null) {
                ((CrossPlatformWebView) aVar.itemView).mo55671a(1, 0, C23728o.m58241a(80.0d), 0, 0);
                ((CrossPlatformWebView) aVar.itemView).mo55679a(str, this.f69135g, true);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
    }

    public C26176a(Fragment fragment, String str, boolean z, boolean z2) {
        C52711k.m112240b(fragment, "fragment");
        this.f69132d = fragment;
        this.f69134f = z;
        this.f69135g = z2;
        FragmentActivity activity = this.f69132d.getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f69130b = activity;
        this.f69131c = new C26178b();
    }
}
