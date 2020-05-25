package com.p888c.p889a.p890a.p891a.p895c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p888c.p889a.p890a.p891a.p897e.C13424c;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.c.e */
public final class C13412e {

    /* renamed from: a */
    private static C13412e f34963a = new C13412e();

    private C13412e() {
    }

    /* renamed from: a */
    public static C13412e m27034a() {
        return f34963a;
    }

    /* renamed from: a */
    private void m27035a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            C13414f.m27044a(webView, sb2);
        } else {
            handler.post(new Runnable() {
                public final void run() {
                    WebView webView = webView;
                    String str = sb2;
                    C18984e.m46161a(str);
                    webView.loadUrl(str);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m27036a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public static boolean m27037a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("javascript: ");
        sb.append(str);
        C13414f.m27044a(webView, sb.toString());
        return true;
    }

    /* renamed from: a */
    public final void mo25113a(WebView webView, float f) {
        mo25116a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo25114a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo25116a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo25116a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public final void mo25115a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo25116a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo25116a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m27036a(sb, objArr);
            sb.append(")}");
            m27035a(webView, sb);
            return;
        }
        StringBuilder sb2 = new StringBuilder("The WebView is null for ");
        sb2.append(str);
        C13424c.m27067a(sb2.toString());
    }

    /* renamed from: b */
    public final void mo25117b(WebView webView, String str) {
        mo25116a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    public final void mo25118c(WebView webView, String str) {
        mo25116a(webView, "setState", str);
    }
}
