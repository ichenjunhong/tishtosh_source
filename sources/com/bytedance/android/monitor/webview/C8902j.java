package com.bytedance.android.monitor.webview;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C8892c.C8893a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.j */
public final class C8902j implements C8892c, C8895e {

    /* renamed from: a */
    private static C8892c f24257a = null;

    /* renamed from: b */
    private static C8895e f24258b = null;

    /* renamed from: c */
    private static String f24259c = "ttlive_web_view_tag";

    /* renamed from: d */
    private static String f24260d = "ttlive_web_view_last_url_tag";

    /* renamed from: e */
    private static String f24261e = "ttlive_web_view_auto_report_tag";

    /* renamed from: i */
    private static Map<String, String> f24262i = new HashMap();

    /* renamed from: k */
    private static C8893a f24263k;

    /* renamed from: f */
    private final String f24264f = "3.0";

    /* renamed from: g */
    private Map<String, C8893a> f24265g = new HashMap();

    /* renamed from: h */
    private Map<String, C8893a> f24266h = new HashMap();

    /* renamed from: j */
    private C8904a f24267j = new C8904a();

    /* renamed from: com.bytedance.android.monitor.webview.j$a */
    static class C8904a implements OnAttachStateChangeListener {
        private C8904a() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        public final void mo15948a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (C8902j.m17574c().mo15939f(webView)) {
                    C8902j.m17571b().mo15904b(webView);
                }
            }
        }
    }

    /* renamed from: b */
    public static C8892c m17571b() {
        return f24257a;
    }

    /* renamed from: c */
    static C8895e m17574c() {
        return f24258b;
    }

    /* renamed from: a */
    public final void mo15902a(C8893a aVar) {
        C8893a d = m17577d(aVar);
        String[] strArr = d.f24215d;
        if (!(strArr == null || strArr.length == 0)) {
            for (String put : strArr) {
                this.f24266h.put(put, d);
            }
        }
        String[] strArr2 = d.f24214c;
        if (strArr2 != null && strArr2.length != 0) {
            for (String put2 : strArr2) {
                this.f24265g.put(put2, d);
            }
        }
    }

    /* renamed from: a */
    public final void mo15901a(WebView webView, String str, boolean z) {
        String e = m17580e(str);
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15922a(webView, e, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo15903a(String str) {
        if (this.f24266h != null) {
            this.f24266h.remove(str);
        }
    }

    /* renamed from: a */
    public final C8893a mo15894a() {
        return new C8893a();
    }

    static {
        C8902j jVar = new C8902j();
        f24257a = jVar;
        f24258b = jVar;
    }

    private C8902j() {
    }

    /* renamed from: a */
    public final void mo15895a(WebView webView) {
        m17586l(webView);
    }

    /* renamed from: b */
    private static Class<?> m17572b(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m17587m(WebView webView) {
        m17569a(webView, false);
    }

    /* renamed from: c */
    public final void mo15908c(C8893a aVar) {
        f24263k = m17577d(aVar);
    }

    /* renamed from: c */
    private static boolean m17576c(String str) {
        return C8905k.m17624a(C8905k.m17626b(str), "webview_is_need_monitor");
    }

    /* renamed from: k */
    private void m17585k(WebView webView) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15918a(webView);
            }
        }
    }

    /* renamed from: n */
    private void m17588n(WebView webView) {
        if (this.f24267j != null && mo15939f(webView)) {
            this.f24267j.mo15948a(webView);
        }
    }

    /* renamed from: g */
    public final C8889a mo15940g(WebView webView) {
        C8893a j = m17584j(webView);
        if (j == null) {
            return null;
        }
        return j.f24217f;
    }

    /* renamed from: h */
    public final C8891b mo15941h(WebView webView) {
        C8893a j = m17584j(webView);
        if (j == null) {
            return null;
        }
        return j.f24213b;
    }

    /* renamed from: i */
    public final boolean mo15942i(WebView webView) {
        C8893a j = m17584j(webView);
        if (j == null || !j.f24222k) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m17580e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    /* renamed from: d */
    public final String mo15909d(WebView webView) {
        if (webView == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(webView.hashCode());
        return sb.toString();
    }

    /* renamed from: f */
    public final boolean mo15939f(WebView webView) {
        C8893a j = m17584j(webView);
        if (j == null || !j.f24221j) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m17586l(WebView webView) {
        if (mo15938e(webView) && mo15939f(webView) && !f24261e.equals(m17578d(webView, f24261e))) {
            m17588n(webView);
            String str = f24261e;
            m17583g(webView, str, str);
        }
    }

    /* renamed from: b */
    public final void mo15904b(WebView webView) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15923b(webView);
            }
        }
        m17581e(webView, f24260d);
        m17581e(webView, f24261e);
        m17581e(webView, f24259c);
        if (this.f24267j != null) {
            C8904a aVar = this.f24267j;
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(aVar);
            }
        }
    }

    /* renamed from: d */
    private static String[] m17579d(String str) {
        JSONArray jSONArray;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        JSONObject b = C8905k.m17626b(str);
        String str2 = "webview_classes";
        if (b == null) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = b.optJSONArray(str2);
        }
        if (jSONArray == null) {
            return strArr;
        }
        String[] strArr2 = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                strArr2[i] = jSONArray.getString(i);
            } catch (JSONException unused) {
            }
        }
        return strArr2;
    }

    /* renamed from: j */
    private C8893a m17584j(WebView webView) {
        if (webView == null) {
            return f24263k;
        }
        C8893a aVar = (C8893a) this.f24266h.get(mo15909d(webView));
        if (aVar != null) {
            return aVar;
        }
        C8893a aVar2 = (C8893a) this.f24265g.get(webView.getClass().getName());
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        for (String str : this.f24265g.keySet()) {
            if (m17570a(name, str)) {
                C8893a aVar3 = (C8893a) this.f24265g.get(str);
                if (aVar3 != null) {
                    return aVar3;
                }
            }
        }
        return f24263k;
    }

    /* renamed from: o */
    private void m17589o(WebView webView) {
        String str;
        String str2;
        boolean z;
        try {
            if (VERSION.SDK_INT >= 19) {
                String url = webView.getUrl();
                String d = m17578d(webView, f24260d);
                if (!TextUtils.isEmpty(url) && !url.equals(d)) {
                    C8893a j = m17584j(webView);
                    if (j == null) {
                        str = C8897g.m17532b();
                    } else {
                        str = j.f24224m;
                    }
                    if (j == null) {
                        str2 = "";
                    } else {
                        str2 = j.f24225n;
                    }
                    if (j != null) {
                        if (!j.f24223l) {
                            z = false;
                            webView.evaluateJavascript(C8906l.m17630a(webView.getContext(), str2, str, z), null);
                            m17583g(webView, f24260d, url);
                            m17582f(webView, url, "loadUrl");
                        }
                    }
                    z = true;
                    webView.evaluateJavascript(C8906l.m17630a(webView.getContext(), str2, str, z), null);
                    m17583g(webView, f24260d, url);
                    m17582f(webView, url, "loadUrl");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo15907c(WebView webView) {
        m17582f(webView, webView.getUrl(), "loadUrl");
        m17585k(webView);
        m17587m(webView);
    }

    /* renamed from: e */
    public final boolean mo15938e(WebView webView) {
        C8893a j = m17584j(webView);
        if (j == null) {
            return false;
        }
        return j.f24220i;
    }

    /* renamed from: d */
    private C8893a m17577d(C8893a aVar) {
        C8894d dVar;
        String str;
        String str2;
        String[] strArr;
        boolean z;
        String str3;
        C8893a aVar2 = new C8893a();
        aVar.mo15917d(aVar.f24226o);
        if (aVar.f24212a != null) {
            dVar = aVar.f24212a;
        } else {
            dVar = C8901i.m17555a();
        }
        aVar2.f24212a = dVar;
        if (aVar.f24216e != null) {
            str = aVar.f24216e;
        } else {
            str = "WebViewMonitor";
        }
        aVar2.f24216e = str;
        aVar2.f24217f = new C8907m(aVar.f24217f);
        aVar2.f24219h = aVar.f24219h;
        aVar2.f24227p.putAll(aVar.f24227p);
        aVar2.f24221j = aVar.f24221j;
        aVar2.f24222k = aVar.f24222k;
        aVar2.f24225n = aVar.f24225n;
        aVar2.f24220i = aVar.f24220i;
        aVar2.f24223l = aVar.f24223l;
        aVar2.f24215d = aVar.f24215d;
        aVar2.f24214c = aVar.f24214c;
        aVar2.f24213b = aVar.f24213b;
        aVar2.f24226o = aVar.f24226o;
        if (TextUtils.isEmpty(aVar.f24224m)) {
            str2 = C8897g.m17532b();
        } else {
            str2 = aVar.f24224m;
        }
        aVar2.f24224m = str2;
        if (C8905k.m17629e(C8905k.m17626b(aVar.f24218g), "webview_classes") == null) {
            strArr = aVar2.f24214c;
        } else {
            strArr = m17579d(aVar.f24218g);
        }
        aVar2.f24214c = strArr;
        if (C8905k.m17629e(C8905k.m17626b(aVar.f24218g), "webview_is_need_monitor") == null) {
            z = aVar2.f24220i;
        } else {
            z = m17576c(aVar.f24218g);
        }
        aVar2.f24220i = z;
        if (TextUtils.isEmpty(aVar.f24218g)) {
            str3 = aVar2.f24224m;
        } else {
            str3 = new C8897g(aVar.f24218g).mo15943a();
        }
        aVar2.f24224m = str3;
        return aVar2;
    }

    /* renamed from: b */
    public final void mo15906b(C8893a aVar) {
        mo15902a(aVar);
    }

    /* renamed from: a */
    public final void mo15897a(WebView webView, String str) {
        mo15907c(webView);
    }

    /* renamed from: b */
    public final void mo15932b(WebView webView, String str) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15919a(webView, str);
            }
        }
    }

    /* renamed from: a */
    private boolean m17570a(String str, String str2) {
        Class b = m17572b(str);
        Class b2 = m17572b(str2);
        if (b == null || b2 == null) {
            return false;
        }
        return b2.isAssignableFrom(b);
    }

    /* renamed from: a */
    private void m17569a(WebView webView, boolean z) {
        if (VERSION.SDK_INT >= 19 && mo15938e(webView) && !f24259c.equals(m17578d(webView, f24259c))) {
            TTLiveWebViewMonitorJsBridge tTLiveWebViewMonitorJsBridge = new TTLiveWebViewMonitorJsBridge(webView);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            webView.addJavascriptInterface(tTLiveWebViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
            String str = f24259c;
            m17583g(webView, str, str);
        }
    }

    /* renamed from: d */
    private String m17578d(WebView webView, String str) {
        String d = mo15909d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        String str2 = (String) f24262i.get(sb.toString());
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(d, "");
    }

    /* renamed from: e */
    private void m17581e(WebView webView, String str) {
        String d = mo15909d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        f24262i.remove(sb.toString());
    }

    /* renamed from: c */
    public final String mo15934c(WebView webView, String str) {
        C8893a j = m17584j(webView);
        if (j == null) {
            return str;
        }
        String str2 = (String) j.f24227p.get(str);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo15896a(WebView webView, int i) {
        if (mo15938e(webView) && i >= 15 && webView != null && VERSION.SDK_INT >= 19) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            m17589o(webView);
        }
    }

    /* renamed from: f */
    private void m17582f(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15920a(webView, str, str2);
            }
        }
    }

    /* renamed from: d */
    public final void mo15936d(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15929e(webView, str, str2);
            }
        }
    }

    /* renamed from: e */
    public final void mo15937e(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15930f(webView, str, str2);
            }
        }
    }

    /* renamed from: g */
    private void m17583g(WebView webView, String str, String str2) {
        String d = mo15909d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        f24262i.put(sb.toString(), str2);
    }

    /* renamed from: b */
    public final void mo15933b(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15927c(webView, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo15898a(WebView webView, String str, Bitmap bitmap) {
        mo15895a(webView);
    }

    /* renamed from: b */
    public final void mo15905b(WebView webView, String str, boolean z) {
        String e = m17580e(str);
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15926b(webView, e, z);
            }
        }
    }

    /* renamed from: c */
    public final void mo15935c(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15928d(webView, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo15931a(WebView webView, String str, String str2) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15924b(webView, str, str2);
            }
        }
    }

    /* renamed from: b */
    private void m17573b(WebView webView, String str, String str2, String str3, String str4) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15921a(webView, str, str2, str3, str4);
            }
        }
    }

    /* renamed from: c */
    private void m17575c(WebView webView, String str, String str2, String str3, String str4) {
        C8893a j = m17584j(webView);
        if (j != null) {
            C8894d dVar = j.f24212a;
            if (dVar != null) {
                dVar.mo15925b(webView, str, str2, str3, str4);
            }
        }
    }

    /* renamed from: a */
    public final void mo15899a(WebView webView, String str, String str2, String str3, String str4) {
        mo15900a(webView, null, null, str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo15900a(WebView webView, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2)) {
            JSONObject b = C8905k.m17626b(str5);
            C8905k.m17622a(b, "event_name", (Object) str2);
            str5 = b.toString();
        }
        String str7 = str5;
        if ("0".equals(str6)) {
            m17575c(webView, str, str3, str4, str7);
            return;
        }
        if ("1".equals(str6)) {
            m17573b(webView, str, str3, str4, str7);
        }
    }
}
