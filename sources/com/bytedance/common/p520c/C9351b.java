package com.bytedance.common.p520c;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;

/* renamed from: com.bytedance.common.c.b */
public final class C9351b {

    /* renamed from: a */
    static final C9353a f25595a;

    /* renamed from: com.bytedance.common.c.b$a */
    static class C9353a {
        private C9353a() {
        }

        /* renamed from: a */
        public String mo16978a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo16979a(WebSettings webSettings, boolean z) {
        }
    }

    /* renamed from: com.bytedance.common.c.b$b */
    static class C9354b extends C9353a {
        private C9354b() {
            super();
        }

        /* renamed from: a */
        public final String mo16978a(Context context) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final void mo16979a(WebSettings webSettings, boolean z) {
            try {
                webSettings.setMediaPlaybackRequiresUserGesture(z);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f25595a = new C9354b();
        } else {
            f25595a = new C9353a();
        }
    }

    /* renamed from: a */
    public static String m18530a(Context context) {
        return f25595a.mo16978a(context);
    }

    /* renamed from: a */
    public static void m18531a(WebSettings webSettings, boolean z) {
        f25595a.mo16979a(webSettings, z);
    }
}
