package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final /* synthetic */ class acn implements Callable {

    /* renamed from: a */
    private final Context f40264a;

    /* renamed from: b */
    private final WebSettings f40265b;

    acn(Context context, WebSettings webSettings) {
        this.f40264a = context;
        this.f40265b = webSettings;
    }

    public final Object call() {
        Context context = this.f40264a;
        WebSettings webSettings = this.f40265b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
