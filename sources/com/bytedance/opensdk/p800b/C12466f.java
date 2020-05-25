package com.bytedance.opensdk.p800b;

import android.os.Build.VERSION;
import android.webkit.WebView;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.opensdk.b.f */
public final class C12466f {

    /* renamed from: a */
    public static final C12467a f32772a;

    /* renamed from: b */
    public static final C12466f f32773b = new C12466f();

    /* renamed from: com.bytedance.opensdk.b.f$a */
    public static class C12467a {
        /* renamed from: a */
        public void mo23506a(WebView webView, String str) {
            C52711k.m112240b(webView, "webView");
            C52711k.m112240b(str, "url");
            try {
                C12469g.m25064a(webView, str);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.opensdk.b.f$b */
    static final class C12468b extends C12467a {
        /* renamed from: a */
        public final void mo23506a(WebView webView, String str) {
            C52711k.m112240b(webView, "webView");
            C52711k.m112240b(str, "url");
            boolean z = false;
            if (C52830p.m112411b(str, "javascript:", false, 2, null)) {
                try {
                    webView.evaluateJavascript(str, null);
                    z = true;
                } catch (Throwable th) {
                    boolean z2 = th instanceof IllegalStateException;
                }
            }
            if (!z) {
                try {
                    C12470h.m25065a(webView, str);
                } catch (Exception unused) {
                }
            }
        }
    }

    private C12466f() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32772a = new C12468b();
        } else {
            f32772a = new C12467a();
        }
    }
}
