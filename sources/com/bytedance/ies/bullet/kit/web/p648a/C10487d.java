package com.bytedance.ies.bullet.kit.web.p648a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10491b;
import com.bytedance.ies.bullet.kit.web.C10527j;
import com.bytedance.ies.bullet.kit.web.p649b.C10493b;
import com.bytedance.ies.bullet.kit.web.p651d.C10515a;
import com.bytedance.ies.bullet.kit.web.p652e.C10522c;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.web.a.d */
public class C10487d implements C10527j {
    /* renamed from: b */
    public C10515a mo18600b() {
        return null;
    }

    /* renamed from: c */
    public C10493b mo18601c() {
        return null;
    }

    /* renamed from: a */
    public final C10491b mo18598a() {
        return new C10491b(Boolean.valueOf(true), null, 2, null);
    }

    /* renamed from: a */
    public C10423r mo18356a(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C10522c();
    }

    /* renamed from: a */
    public void mo18599a(WebSettings webSettings, WebView webView) {
        C52711k.m112240b(webSettings, "settings");
        C52711k.m112240b(webView, "webView");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
    }
}
