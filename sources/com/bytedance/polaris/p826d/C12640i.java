package com.bytedance.polaris.p826d;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.bytedance.polaris.d.i */
public final class C12640i {

    /* renamed from: a */
    static final C12642a f33223a;

    /* renamed from: com.bytedance.polaris.d.i$a */
    static class C12642a {
        private C12642a() {
        }

        /* renamed from: a */
        public void mo23739a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.polaris.d.i$b */
    static class C12643b extends C12642a {
        private C12643b() {
            super();
        }

        /* renamed from: a */
        public final void mo23739a(WebView webView, String str) {
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
            f33223a = new C12643b();
        } else {
            f33223a = new C12642a();
        }
    }

    /* renamed from: a */
    public static void m25399a(WebView webView, String str) {
        f33223a.mo23739a(webView, str);
    }
}
