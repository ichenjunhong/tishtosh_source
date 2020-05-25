package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.util.C15524o;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

@C16299uq
class aoa extends WebView {
    public aoa(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C14963ax.m30832b().mo28692a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            abv.m32793b("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            abv.m32494a("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    /* renamed from: d */
    public void mo29248d(String str) {
        if (!C15524o.m32297e() || !aof.m33811a(this)) {
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            C18984e.m46161a(concat);
            loadUrl(concat);
            return;
        }
        evaluateJavascript(str, null);
    }

    public void loadUrl(String str) {
        try {
            C18984e.m46161a(str);
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C14963ax.m30834d().mo28588a(e, "CoreWebView.loadUrl");
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
