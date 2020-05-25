package com.google.android.gms.internal.ads;

import android.webkit.WebView;

@C16299uq
final class aof {

    /* renamed from: a */
    private static Boolean f41163a;

    private aof() {
    }

    /* renamed from: a */
    static boolean m33811a(WebView webView) {
        boolean booleanValue;
        synchronized (aof.class) {
            if (f41163a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f41163a = Boolean.valueOf(true);
                } catch (IllegalStateException unused) {
                    f41163a = Boolean.valueOf(false);
                }
            }
            booleanValue = f41163a.booleanValue();
        }
        return booleanValue;
    }
}
