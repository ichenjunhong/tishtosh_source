package com.bytedance.common.p520c;

import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.bytedance.common.c.e */
public final class C9363e {

    /* renamed from: a */
    static final C9365a f25598a;

    /* renamed from: com.bytedance.common.c.e$a */
    static class C9365a {
        private C9365a() {
        }

        /* renamed from: a */
        public void mo16983a(WebSettings webSettings, int i) {
        }

        /* renamed from: a */
        public void mo16984a(WebView webView, boolean z) {
        }
    }

    /* renamed from: com.bytedance.common.c.e$b */
    static class C9366b extends C9365a {
        private C9366b() {
            super();
        }

        /* renamed from: a */
        public final void mo16983a(WebSettings webSettings, int i) {
            if (webSettings != null) {
                try {
                    webSettings.setMixedContentMode(i);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo16984a(WebView webView, boolean z) {
            if (webView != null) {
                try {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f25598a = new C9366b();
        } else {
            f25598a = new C9365a();
        }
    }

    /* renamed from: a */
    public static void m18543a(WebSettings webSettings, int i) {
        f25598a.mo16983a(webSettings, i);
    }

    /* renamed from: a */
    public static void m18544a(WebView webView, boolean z) {
        f25598a.mo16984a(webView, true);
    }
}
