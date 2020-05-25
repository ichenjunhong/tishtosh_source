package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebSettings;

public class acr extends acm {
    public acr() {
        super();
    }

    /* renamed from: a */
    public final void mo28689a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public final void mo28690a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo28692a(Context context, WebSettings webSettings) {
        super.mo28692a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
