package com.bytedance.common.p520c;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.c.a */
public final class C9349a {

    /* renamed from: a */
    static Method f25592a;

    /* renamed from: b */
    static Method f25593b;

    /* renamed from: c */
    static boolean f25594c;

    /* renamed from: com.bytedance.common.c.a$a */
    static class C9350a {
        /* renamed from: b */
        public static void m18529b(WebView webView) {
            webView.onResume();
        }

        /* renamed from: a */
        public static void m18528a(WebView webView) {
            webView.onPause();
        }

        /* renamed from: a */
        public static void m18527a(WebSettings webSettings, boolean z) {
            webSettings.setDisplayZoomControls(z);
        }
    }

    /* renamed from: a */
    private static void m18523a() {
        if (!f25594c) {
            f25594c = true;
            try {
                f25592a = WebView.class.getMethod("onPause", null);
                f25593b = WebView.class.getMethod("onResume", null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m18522a(ActivityManager activityManager) {
        if (VERSION.SDK_INT < 11) {
            return -1;
        }
        try {
            return activityManager.getLargeMemoryClass();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m18526b(WebView webView) {
        if (webView != null) {
            if (VERSION.SDK_INT >= 11) {
                C9350a.m18529b(webView);
                return;
            }
            m18523a();
            if (f25593b != null) {
                try {
                    f25593b.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18525a(WebView webView) {
        if (webView != null) {
            if (VERSION.SDK_INT >= 11) {
                C9350a.m18528a(webView);
                return;
            }
            m18523a();
            if (f25592a != null) {
                try {
                    f25592a.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18524a(WebSettings webSettings, boolean z) {
        if (VERSION.SDK_INT >= 11) {
            C9350a.m18527a(webSettings, false);
        }
    }
}
