package com.p683ss.android.ugc.aweme.compliance.termspp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.router.SmartRouter;
import com.example.p906a.C13482c;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.compliance.termspp.c */
public final class C27087c extends WebViewClient {

    /* renamed from: a */
    public final Activity f71454a;

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    public C27087c(Activity activity) {
        this.f71454a = activity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        if (C52830p.m112411b(str, "http://", false, 2, null) || C52830p.m112411b(str, "https://", false, 2, null)) {
            SmartRouter.buildRoute((Context) this.f71454a, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
            return true;
        } else if (!C52830p.m112411b(str, "mailto:", false, 2, null)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            try {
                Activity activity = this.f71454a;
                if (activity != null) {
                    activity.startActivity(intent);
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }
}
