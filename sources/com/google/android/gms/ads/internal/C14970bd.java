package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.bd */
final class C14970bd implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C14967ba f38662a;

    C14970bd(C14967ba baVar) {
        this.f38662a = baVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str = "";
        CookieManager c = C14963ax.m30832b().mo28696c(this.f38662a.f38501e.f38629c);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : str;
    }
}
