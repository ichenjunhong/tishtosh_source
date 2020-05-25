package com.bytedance.opensdk.core.base.p809ui;

import android.webkit.WebView;
import com.bytedance.opensdk.core.grant.web.WebPageStatusView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.base.ui.a */
public final class C12509a {

    /* renamed from: b */
    public static final C12510a f32850b = new C12510a(null);

    /* renamed from: a */
    public final WebView f32851a;

    /* renamed from: c */
    private final WebPageStatusView f32852c;

    /* renamed from: com.bytedance.opensdk.core.base.ui.a$a */
    public static final class C12510a {
        private C12510a() {
        }

        public /* synthetic */ C12510a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo23559a(int i) {
        if (i != 1000) {
            switch (i) {
                case 0:
                    this.f32851a.setVisibility(8);
                    this.f32852c.mo23573a(0);
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
            }
        }
        this.f32851a.setVisibility(0);
        this.f32852c.mo23573a(1);
    }

    public C12509a(WebView webView, WebPageStatusView webPageStatusView) {
        C52711k.m112240b(webView, "webView");
        C52711k.m112240b(webPageStatusView, "webPageStatusView");
        this.f32851a = webView;
        this.f32852c = webPageStatusView;
        mo23559a(0);
    }
}
