package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C14963ax;
import java.io.InputStream;
import java.util.Map;

public class act extends acs {
    /* renamed from: d */
    public final int mo28697d() {
        return 16974374;
    }

    /* renamed from: c */
    public final CookieManager mo28696c(Context context) {
        if (m32637c()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            abv.m32793b("Failed to obtain CookieManager.", th);
            C14963ax.m30834d().mo28588a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public final amb mo28686a(ama ama, byc byc, boolean z) {
        return new anc(ama, byc, z);
    }

    /* renamed from: a */
    public final WebResourceResponse mo28685a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }
}
