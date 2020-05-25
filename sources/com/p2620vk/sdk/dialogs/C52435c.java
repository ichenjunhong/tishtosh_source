package com.p2620vk.sdk.dialogs;

import android.app.Dialog;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.vk.sdk.dialogs.c */
final class C52435c {
    /* renamed from: a */
    static void m111987a(Dialog dialog) {
        dialog.dismiss();
    }

    /* renamed from: a */
    static void m111988a(WebView webView, String str) {
        C18984e.m46161a(str);
        webView.loadUrl(str);
    }
}
