package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.example.p906a.C13482c;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity */
public class WapAuthActivity extends BaseThirdPartyWapAuthActivity {

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity$a */
    public class C21070a extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public C21070a() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return WapAuthActivity.this.mo45124a(str);
        }

        public final void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            C10643a aVar = new C10643a(webView.getContext());
            aVar.mo18902b("notification error ssl cert invalid").mo18893a("continue", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.proceed();
                }
            }).mo18903b("cancel", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.cancel();
                }
            });
            aVar.mo18897a().mo18882b();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WapAuthActivity.this.mo45125c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45123a(WebView webView) {
        webView.setWebViewClient(C13482c.m27232a(new C21070a()));
    }
}
