package com.bytedance.opensdk.p800b;

import android.os.Build.VERSION;
import android.webkit.WebView;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.opensdk.b.c */
public final class C12461c {

    /* renamed from: a */
    public static final C12462a f32770a;

    /* renamed from: b */
    public static final C12461c f32771b = new C12461c();

    /* renamed from: com.bytedance.opensdk.b.c$a */
    public static class C12462a {
        /* renamed from: a */
        public void mo23505a(WebView webView, String str) {
            C52711k.m112240b(str, "url");
            if (webView != null) {
                try {
                    C12464d.m25060a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.opensdk.b.c$b */
    static final class C12463b extends C12462a {
        /* renamed from: a */
        public final void mo23505a(WebView webView, String str) {
            C52711k.m112240b(str, "url");
            if (webView != null) {
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
                        C12465e.m25061a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private C12461c() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32770a = new C12463b();
        } else {
            f32770a = new C12462a();
        }
    }
}
