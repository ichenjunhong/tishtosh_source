package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;

@C16299uq
public final class anw {
    /* renamed from: a */
    public static ama m33718a(Context context, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar, byc byc) throws amk {
        try {
            anx anx = new anx(context, anp, str, z, z2, beh, zzbgz, ckVar, aqVar, btVar);
            return (ama) aek.m32732a(anx);
        } catch (Throwable th) {
            C14963ax.m30834d().mo28588a(th, "AdWebViewFactory.newAdWebView2");
            throw new amk("Webview initialization failed.", th);
        }
    }
}
