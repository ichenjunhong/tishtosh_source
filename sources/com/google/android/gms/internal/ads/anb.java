package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@C16299uq
public class anb extends amb {
    public anb(ama ama, byc byc, boolean z) {
        super(ama, byc, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo29359a(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof ama)) {
            abv.m32798e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        ama ama = (ama) webView;
        if (this.f40899g != null) {
            this.f40899g.mo31547a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo29201a(str, map);
        }
        if (ama.mo29197w() != null) {
            ama.mo29197w().mo29227m();
        }
        if (ama.mo29195u().mo29366e()) {
            str2 = (String) caf.m37099d().mo30717a(C15740bx.f44197K);
        } else if (ama.mo29138B()) {
            str2 = (String) caf.m37099d().mo30717a(C15740bx.f44196J);
        } else {
            str2 = (String) caf.m37099d().mo30717a(C15740bx.f44195I);
        }
        return acd.m32596b(ama.getContext(), ama.mo28944k().f46237a, str2);
    }
}
