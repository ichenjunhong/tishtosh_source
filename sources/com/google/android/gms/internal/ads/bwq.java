package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class bwq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bwi f44165a;

    /* renamed from: b */
    final /* synthetic */ WebView f44166b;

    /* renamed from: c */
    final /* synthetic */ boolean f44167c;

    /* renamed from: d */
    final /* synthetic */ bwo f44168d;

    /* renamed from: e */
    private ValueCallback<String> f44169e = new bwr(this);

    bwq(bwo bwo, bwi bwi, WebView webView, boolean z) {
        this.f44168d = bwo;
        this.f44165a = bwi;
        this.f44166b = webView;
        this.f44167c = z;
    }

    public final void run() {
        if (this.f44166b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f44166b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f44169e);
            } catch (Throwable unused) {
                this.f44169e.onReceiveValue("");
            }
        }
    }
}
