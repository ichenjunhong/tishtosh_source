package com.bytedance.polaris.browser.p823a;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.bytedance.polaris.browser.a.f */
public final class C12613f {

    /* renamed from: a */
    static final C12615a f33114a;

    /* renamed from: com.bytedance.polaris.browser.a.f$a */
    static class C12615a {
        private C12615a() {
        }

        /* renamed from: a */
        public void mo23714a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.polaris.browser.a.f$b */
    static class C12616b extends C12615a {
        private C12616b() {
            super();
        }

        /* renamed from: a */
        public final void mo23714a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        C18984e.m46161a(str);
                        webView.loadUrl(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f33114a = new C12616b();
        } else {
            f33114a = new C12615a();
        }
    }

    /* renamed from: a */
    public static void m25344a(WebView webView, String str) {
        f33114a.mo23714a(webView, str);
    }
}
