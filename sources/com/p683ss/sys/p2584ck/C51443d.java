package com.p683ss.sys.p2584ck;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.sys.ck.d */
public class C51443d {

    /* renamed from: a */
    private static Handler f128631a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private String f128632b;

    /* renamed from: c */
    private WeakReference<WebView> f128633c;

    public C51443d(WebView webView, String str) {
        this.f128633c = new WeakReference<>(webView);
        this.f128632b = str;
    }
}
