package com.bytedance.ies.p675g.p676a;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.bytedance.ies.g.a.i */
public final class C10767i {

    /* renamed from: a */
    static final C10769a f28952a;

    /* renamed from: com.bytedance.ies.g.a.i$a */
    static class C10769a {
        private C10769a() {
        }

        /* renamed from: a */
        public void mo19499a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.g.a.i$b */
    static class C10770b extends C10769a {
        private C10770b() {
            super();
        }

        /* renamed from: a */
        public final void mo19499a(WebView webView, String str) {
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
            f28952a = new C10770b();
        } else {
            f28952a = new C10769a();
        }
    }

    /* renamed from: a */
    public static void m21829a(WebView webView, String str) {
        f28952a.mo19499a(webView, str);
    }
}
