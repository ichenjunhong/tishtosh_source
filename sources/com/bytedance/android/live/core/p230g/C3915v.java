package com.bytedance.android.live.core.p230g;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.bytedance.android.live.core.g.v */
public final class C3915v {

    /* renamed from: a */
    static final C3917a f10930a;

    /* renamed from: com.bytedance.android.live.core.g.v$a */
    static class C3917a {
        private C3917a() {
        }

        /* renamed from: a */
        public void mo9274a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.g.v$b */
    static class C3918b extends C3917a {
        private C3918b() {
            super();
        }

        /* renamed from: a */
        public final void mo9274a(WebView webView, String str) {
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
            f10930a = new C3918b();
        } else {
            f10930a = new C3917a();
        }
    }

    /* renamed from: a */
    public static void m9893a(WebView webView, String str) {
        f10930a.mo9274a(webView, str);
    }
}
