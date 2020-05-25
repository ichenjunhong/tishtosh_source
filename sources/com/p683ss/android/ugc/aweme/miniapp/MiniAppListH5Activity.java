package com.p683ss.android.ugc.aweme.miniapp;

import android.content.Context;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity */
public class MiniAppListH5Activity extends AmeSSActivity {

    /* renamed from: a */
    private WebView f94039a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.axc);
        this.f94039a = (WebView) findViewById(R.id.duj);
        this.f94039a.setWebViewClient(C13482c.m27232a(new WebViewClient() {
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C13482c.m27234a(webView, renderProcessGoneDetail);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (C36983a.m83185b().mo76294a().openMiniApp((Context) MiniAppListH5Activity.this, str, new C36961a().mo76222b("local_test_list").mo76221a()) || super.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                return false;
            }
        }));
        WebView webView = this.f94039a;
        String str = "http://developer.toutiao.com/allapplist?channel=local_test&device_id=40413922381";
        C18984e.m46161a(str);
        webView.loadUrl(str);
        this.f94039a.getSettings().setJavaScriptEnabled(true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.MiniAppListH5Activity", "onCreate", false);
    }
}
