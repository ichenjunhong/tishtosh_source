package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.p464a.C8890a;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.h */
class C8898h {

    /* renamed from: r */
    private static volatile C8898h f24234r;

    /* renamed from: a */
    Map<String, C8900a> f24235a = new C8890a();

    /* renamed from: b */
    Map<String, C8900a> f24236b = new C8890a();

    /* renamed from: c */
    Map<String, Map<String, JSONObject>> f24237c = new C8890a();

    /* renamed from: d */
    Map<String, Map<String, Map<String, JSONArray>>> f24238d = new C8890a();

    /* renamed from: e */
    Map<String, Map<String, JSONObject>> f24239e = new C8890a();

    /* renamed from: f */
    Map<String, Map<String, JSONArray>> f24240f = new C8890a();

    /* renamed from: g */
    Map<String, JSONObject> f24241g = new C8890a();

    /* renamed from: h */
    Map<String, JSONArray> f24242h = new C8890a();

    /* renamed from: i */
    Map<String, String> f24243i = new C8890a();

    /* renamed from: j */
    Map<String, String> f24244j = new C8890a();

    /* renamed from: k */
    Map<String, String> f24245k = new C8890a();

    /* renamed from: l */
    Map<String, String> f24246l = new C8890a();

    /* renamed from: m */
    Map<String, Map<String, Boolean>> f24247m = new C8890a();

    /* renamed from: n */
    Map<String, Map<String, Boolean>> f24248n = new C8890a();

    /* renamed from: o */
    Map<String, Set<String>> f24249o = new C8890a();

    /* renamed from: p */
    Map<String, String> f24250p = new C8890a();

    /* renamed from: q */
    private Map<String, JSONObject> f24251q = new C8890a();

    /* renamed from: com.bytedance.android.monitor.webview.h$a */
    class C8900a {

        /* renamed from: a */
        public long f24252a;

        /* renamed from: b */
        public long f24253b;

        /* renamed from: c */
        public boolean f24254c;

        private C8900a() {
            this.f24252a = -1;
            this.f24253b = -1;
        }
    }

    /* renamed from: a */
    public final void mo15944a(WebView webView, String str, String str2) {
        if (!TextUtils.equals(str2, "loadUrl") || !m17550d(m17535a(webView), m17542b(str))) {
            mo15945a(webView, "pv", m17543b(m17542b(str), str2));
            m17537a(webView, m17542b(str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15947a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject != null && jSONObject2 != null) {
            JSONObject d = C8905k.m17628d(jSONObject, str);
            JSONObject d2 = C8905k.m17628d(jSONObject2, str);
            if (d == null) {
                d = new JSONObject();
            }
            m17540a(d, d2);
            C8905k.m17622a(jSONObject, str, (Object) d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15945a(WebView webView, String str, JSONObject jSONObject) {
        String c = C8905k.m17627c(jSONObject, "url");
        if (!TextUtils.isEmpty(c) && !c.contains(QuickShopBusiness.f64351b)) {
            String b = m17541b(webView, str, jSONObject);
            m17545b(webView, jSONObject);
            m17539a(jSONObject);
            m17538a(webView, jSONObject);
            C8889a g = C8902j.m17574c().mo15940g(webView);
            if (g != null) {
                g.mo10526a(b, 0, null, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static C8898h m17534a() {
        if (f24234r == null) {
            synchronized (C8898h.class) {
                if (f24234r == null) {
                    f24234r = new C8898h();
                }
            }
        }
        return f24234r;
    }

    private C8898h() {
    }

    /* renamed from: c */
    private static String m17546c(String str) {
        try {
            return new URL(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    private static String m17549d(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m17535a(WebView webView) {
        if (webView == null) {
            return "1234";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(webView.hashCode());
        return sb.toString();
    }

    /* renamed from: b */
    static String m17542b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int indexOf = str.indexOf("?");
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: a */
    static String m17536a(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("PointCount");
        return sb.toString();
    }

    /* renamed from: a */
    private void m17539a(JSONObject jSONObject) {
        String c = C8905k.m17627c(jSONObject, "url");
        C8905k.m17623a(jSONObject, "host", m17549d(c));
        C8905k.m17623a(jSONObject, LeakCanaryFileProvider.f132050j, m17546c(c));
    }

    /* renamed from: b */
    private void m17545b(WebView webView, JSONObject jSONObject) {
        C8905k.m17623a(jSONObject, "web_view_key", m17535a(webView));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15946a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f24243i.put(str, str2);
        }
    }

    /* renamed from: c */
    private void m17548c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f24246l.put(str, m17542b(str2));
        }
    }

    /* renamed from: d */
    private boolean m17550d(String str, String str2) {
        String str3 = (String) this.f24246l.get(str);
        String b = m17542b(str3);
        String b2 = m17542b(str2);
        if (TextUtils.equals(str3, str2) || TextUtils.equals(b, b2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private JSONObject m17543b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C8905k.m17623a(jSONObject, "service", "pv");
        C8905k.m17623a(jSONObject, "stage", str2);
        C8905k.m17623a(jSONObject, "url", m17542b(str));
        C8905k.m17623a(jSONObject, "host", m17549d(str));
        C8905k.m17623a(jSONObject, LeakCanaryFileProvider.f132050j, m17546c(str));
        C8905k.m17623a(jSONObject, "ev_type", "pv");
        return jSONObject;
    }

    /* renamed from: c */
    private void m17547c(WebView webView, String str) {
        String a = m17535a(webView);
        JSONArray jSONArray = (JSONArray) this.f24242h.get(a);
        if (jSONArray != null) {
            this.f24242h.remove(a);
            Map map = (Map) this.f24240f.get(a);
            if (map == null) {
                map = new C8890a();
            }
            JSONArray jSONArray2 = (JSONArray) map.get(m17542b(str));
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object a2 = C8905k.m17620a(jSONArray, i);
                if (a2 instanceof JSONObject) {
                    C8905k.m17623a((JSONObject) a2, "url", str);
                    jSONArray2.put(a2);
                }
            }
            map.put(m17542b(str), jSONArray2);
            this.f24240f.put(a, map);
        }
    }

    /* renamed from: a */
    private void m17537a(WebView webView, String str) {
        m17548c(m17535a(webView), m17542b(str));
        m17547c(webView, m17542b(str));
        m17544b(webView, m17542b(str));
    }

    /* renamed from: b */
    private void m17544b(WebView webView, String str) {
        String a = m17535a(webView);
        JSONObject jSONObject = (JSONObject) this.f24241g.get(a);
        this.f24241g.remove(a);
        if (jSONObject != null) {
            Map map = (Map) this.f24239e.get(a);
            if (map == null) {
                map = new C8890a();
            }
            JSONObject jSONObject2 = (JSONObject) map.get(m17542b(str));
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            mo15947a(jSONObject2, jSONObject, "client_category");
            mo15947a(jSONObject2, jSONObject, "client_metric");
            mo15947a(jSONObject2, jSONObject, "client_extra");
            C8905k.m17623a(jSONObject2, "url", str);
            map.put(m17542b(str), jSONObject2);
            this.f24239e.put(a, map);
        }
    }

    /* renamed from: a */
    private void m17538a(WebView webView, JSONObject jSONObject) {
        String c = C8905k.m17627c(jSONObject, "ev_type");
        String a = m17535a(webView);
        Map map = (Map) this.f24247m.get(a);
        if (map == null) {
            map = new C8890a();
        }
        Map map2 = (Map) this.f24248n.get(a);
        if (map2 == null) {
            map2 = new C8890a();
        }
        if ("performance".equals(c)) {
            JSONObject d = C8905k.m17628d(jSONObject, "client_params");
            if (d == null) {
                d = new JSONObject();
            }
            String c2 = C8905k.m17627c(jSONObject, "url");
            boolean containsKey = map.containsKey(m17542b(c2));
            boolean containsKey2 = map2.containsKey(m17542b(c2));
            C8905k.m17621a(d, "offline", containsKey ? 1 : 0);
            C8905k.m17621a(d, "clientOffline", containsKey2 ? 1 : 0);
            return;
        }
        if ("static_performance".equals(c)) {
            JSONObject d2 = C8905k.m17628d(jSONObject, "event");
            if (d2 != null) {
                Object e = C8905k.m17629e(d2, "resources");
                if (e instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) e;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        Object a2 = C8905k.m17620a(jSONArray, i);
                        if (a2 instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) a2;
                            String c3 = C8905k.m17627c(jSONObject2, LeakCanaryFileProvider.f132049i);
                            boolean containsKey3 = map.containsKey(m17542b(c3));
                            boolean containsKey4 = map2.containsKey(m17542b(c3));
                            C8905k.m17621a(jSONObject2, "offline", containsKey3 ? 1 : 0);
                            C8905k.m17621a(jSONObject2, "clientOffline", containsKey4 ? 1 : 0);
                        }
                    }
                    C8905k.m17622a(d2, "resources", (Object) jSONArray);
                    C8905k.m17622a(jSONObject, "event", (Object) d2);
                }
            }
        }
    }

    /* renamed from: a */
    static void m17540a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                C8905k.m17622a(jSONObject, str, C8905k.m17629e(jSONObject2, str));
            }
        }
    }

    /* renamed from: b */
    private static String m17541b(WebView webView, String str, JSONObject jSONObject) {
        String c = C8902j.m17574c().mo15934c(webView, str);
        if (TextUtils.equals(str, c) || TextUtils.isEmpty(c)) {
            return str;
        }
        C8905k.m17623a(jSONObject, "service", c);
        return c;
    }
}
