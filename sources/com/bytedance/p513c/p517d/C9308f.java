package com.bytedance.p513c.p517d;

import android.os.Build.VERSION;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.p513c.C9314e;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d.f */
public final class C9308f {

    /* renamed from: a */
    public WebView f25484a;

    /* renamed from: b */
    public C9311g f25485b = new C9311g();

    /* renamed from: com.bytedance.c.d.f$a */
    class C9310a {

        /* renamed from: b */
        private C9314e f25490b;

        @JavascriptInterface
        public final void offMethodParams(String str) {
            StringBuilder sb = new StringBuilder("JS called method ======= offMethodParams(");
            sb.append(str);
            sb.append(")");
            C9308f.this.f25485b.f25491a.remove(str);
        }

        @JavascriptInterface
        public final void onMethodParams(String str) {
            StringBuilder sb = new StringBuilder("JS called method ======= onMethodParams(");
            sb.append(str);
            sb.append(")");
            try {
                new JSONObject(str).getString("__callback_id");
            } catch (JSONException unused) {
            }
        }

        @JavascriptInterface
        public final void callMethodParams(String str) {
            StringBuilder sb = new StringBuilder("JS called method ======= callMethodParams(");
            sb.append(str);
            sb.append(")");
            C9311g gVar = C9308f.this.f25485b;
            C9314e eVar = this.f25490b;
            C9313i iVar = new C9313i(str);
            if (iVar.f25493b != null) {
                C9312h hVar = (C9312h) gVar.f25491a.get(iVar.f25493b);
                if (hVar != null) {
                    hVar.mo16912a(eVar, iVar);
                }
            }
        }

        public C9310a(C9314e eVar) {
            this.f25490b = eVar;
        }
    }

    /* renamed from: a */
    public final void mo16913a(final String str) {
        if (str != null && this.f25484a != null) {
            this.f25484a.post(new Runnable() {

                /* renamed from: a */
                WebView f25486a = C9308f.this.f25484a;

                public final void run() {
                    if (VERSION.SDK_INT >= 19) {
                        WebView webView = this.f25486a;
                        StringBuilder sb = new StringBuilder("javascript:window.Native2JSBridge._handleMessageFromApp(");
                        sb.append(str);
                        sb.append(")");
                        webView.evaluateJavascript(sb.toString(), null);
                        return;
                    }
                    WebView webView2 = this.f25486a;
                    StringBuilder sb2 = new StringBuilder("javascript:window.Native2JSBridge._handleMessageFromApp('");
                    sb2.append(str);
                    sb2.append("')");
                    String sb3 = sb2.toString();
                    C18984e.m46161a(sb3);
                    webView2.loadUrl(sb3);
                }
            });
            new StringBuilder("callJsCode ====== ").append(str);
        }
    }

    public C9308f(C9314e eVar, WebView webView) {
        this.f25484a = webView;
        if (this.f25484a != null) {
            this.f25484a.getSettings().setJavaScriptEnabled(true);
            this.f25484a.addJavascriptInterface(new C9310a(eVar), "androidJsBridge");
        }
    }
}
