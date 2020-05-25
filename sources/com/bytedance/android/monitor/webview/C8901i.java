package com.bytedance.android.monitor.webview;

import android.webkit.WebView;

/* renamed from: com.bytedance.android.monitor.webview.i */
public class C8901i implements C8894d {

    /* renamed from: a */
    private static volatile C8901i f24256a;

    private C8901i() {
    }

    /* renamed from: a */
    public final void mo15918a(WebView webView) {
    }

    /* renamed from: a */
    public final void mo15919a(WebView webView, String str) {
    }

    /* renamed from: a */
    public final void mo15920a(WebView webView, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo15921a(WebView webView, String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public final void mo15922a(WebView webView, String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo15923b(WebView webView) {
    }

    /* renamed from: b */
    public final void mo15924b(WebView webView, String str, String str2) {
    }

    /* renamed from: b */
    public final void mo15925b(WebView webView, String str, String str2, String str3, String str4) {
    }

    /* renamed from: b */
    public final void mo15926b(WebView webView, String str, boolean z) {
    }

    /* renamed from: c */
    public final void mo15927c(WebView webView, String str, String str2) {
    }

    /* renamed from: d */
    public final void mo15928d(WebView webView, String str, String str2) {
    }

    /* renamed from: e */
    public final void mo15929e(WebView webView, String str, String str2) {
    }

    /* renamed from: f */
    public final void mo15930f(WebView webView, String str, String str2) {
    }

    /* renamed from: a */
    public static C8901i m17555a() {
        if (f24256a == null) {
            synchronized (C8901i.class) {
                if (f24256a == null) {
                    f24256a = new C8901i();
                }
            }
        }
        return f24256a;
    }
}
