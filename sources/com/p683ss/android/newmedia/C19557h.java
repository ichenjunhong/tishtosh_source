package com.p683ss.android.newmedia;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.ss.android.newmedia.h */
public final class C19557h {

    /* renamed from: a */
    static final C19559a f53943a;

    /* renamed from: com.ss.android.newmedia.h$a */
    static class C19559a {
        private C19559a() {
        }

        /* renamed from: a */
        public void mo40810a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.newmedia.h$b */
    static class C19560b extends C19559a {
        private C19560b() {
            super();
        }

        /* renamed from: a */
        public final void mo40810a(WebView webView, String str) {
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
            f53943a = new C19560b();
        } else {
            f53943a = new C19559a();
        }
    }

    /* renamed from: a */
    public static void m47858a(WebView webView, String str) {
        f53943a.mo40810a(webView, str);
    }
}
