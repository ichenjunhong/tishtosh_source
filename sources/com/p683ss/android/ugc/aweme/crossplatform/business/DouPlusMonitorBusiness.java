package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27144g;
import com.p683ss.android.ugc.aweme.crossplatform.p1617d.C27200b;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness */
public class DouPlusMonitorBusiness extends Business {

    /* renamed from: a */
    public boolean f71635a;

    /* renamed from: b */
    private long f71636b;

    /* renamed from: a */
    private String m65532a() {
        return this.f71633j.f71719b.f71763r;
    }

    /* renamed from: b */
    private boolean m65533b() {
        return this.f71633j.f71719b.f71764s;
    }

    DouPlusMonitorBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public final void mo55487b(String str) {
        if (C27200b.m65621a(m65532a(), str)) {
            this.f71635a = false;
        }
    }

    /* renamed from: a */
    public final void mo55486a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C27200b.m65621a(m65532a(), str)) {
                this.f71635a = true;
                this.f71636b = System.currentTimeMillis();
                return;
            }
            this.f71635a = false;
        }
    }

    /* renamed from: a */
    public final void mo55484a(int i, String str, WebView webView) {
        if (this.f71635a) {
            this.f71635a = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f71636b;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                jSONObject2.put("error_status", i);
                jSONObject2.put("error_message", str);
            } catch (JSONException unused) {
            }
            C23131p.m57777a("douplus_delivery_show", 0, jSONObject, jSONObject2);
            if (VERSION.SDK_INT >= 19 && m65533b() && webView != null) {
                webView.evaluateJavascript("ttwebview:/*getTTLogEventResult*/;", new C27174d(this, i, str, webView));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55485a(int i, String str, WebView webView, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                C52711k.m112240b(jSONObject, "fullJson");
                C52711k.m112240b(webView, C23060d.f61427a);
                if (!(webView instanceof SingleWebView)) {
                    webView = null;
                }
                if (webView != null) {
                    if (webView != null) {
                        SingleWebView singleWebView = (SingleWebView) webView;
                        if (singleWebView != null) {
                            C22521l monitorSession = singleWebView.getMonitorSession();
                            if (monitorSession != null) {
                                C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                                if (nVar != null) {
                                    C27144g.f71608a.mo55461a(jSONObject, nVar);
                                }
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                    }
                }
                String str3 = "douplus_full_process_log";
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("error_status", i);
                    jSONObject2.put("error_message", str);
                    jSONObject2.put("full_process_event", str2);
                } catch (JSONException unused2) {
                }
                C23131p.m57776a(str3, 0, jSONObject2);
            }
        }
    }
}
