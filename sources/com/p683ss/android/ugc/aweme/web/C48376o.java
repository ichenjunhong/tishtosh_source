package com.p683ss.android.ugc.aweme.web;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.example.p906a.C13482c;

/* renamed from: com.ss.android.ugc.aweme.web.o */
public class C48376o extends WebViewClient {
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        new C10643a(webView.getContext()).mo18902b("notification error ssl cert invalid").mo18893a("continue", (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.proceed();
            }
        }).mo18903b("cancel", (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.cancel();
            }
        }).mo18897a().mo18882b();
    }
}
