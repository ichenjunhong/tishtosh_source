package com.bytedance.polaris.p826d;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p825c.C12624b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.d.p */
public final class C12650p {
    /* renamed from: a */
    public static boolean m25423a(String str) {
        return !C9431p.m18664a(str) && "1".equals(str);
    }

    /* renamed from: a */
    public static void m25422a(Map<String, String> map, boolean z) {
        C12563i.m25225g().mo23614a(map, z);
        map.put("polaris_version", "tt_2.0.0.62.alpha6");
        map.put("polaris_version_code", "203");
    }

    /* renamed from: e */
    public static boolean m25427e(String str) {
        return m25429g(str);
    }

    /* renamed from: b */
    public static String m25424b(String str) {
        try {
            Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("polaris_version", "tt_2.0.0.62.alpha6");
            buildUpon.appendQueryParameter("polaris_version_code", "203");
            return buildUpon.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static boolean m25425c(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m25416a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            if (m25426d(uri.toString())) {
                return new C12624b(uri).mo23597a();
            }
            return URLDecoder.decode(uri.getQueryParameter("url"));
        } catch (Exception unused) {
            return uri.toString();
        }
    }

    /* renamed from: d */
    public static boolean m25426d(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        boolean f = m25428f(parse.getScheme());
        String host = parse.getHost();
        if (!f || !C12632d.f33196i.equals(host)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m25428f(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        if (C23057c.f61423a.equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("polaris");
        sb.append(C12563i.m25225g().mo23606a());
        String sb2 = sb.toString();
        if (C9431p.m18664a(sb2) || !sb2.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m25429g(String str) {
        try {
            if (C9431p.m18664a(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            boolean f = m25428f(parse.getScheme());
            String host = parse.getHost();
            if (!f || !"polaris".equals(host)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static int m25414a(Uri uri, String str) {
        try {
            return Integer.valueOf(uri.getQueryParameter(str)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m25417a(String str, String str2) {
        if (C9431p.m18664a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str3 : queryParameterNames) {
            if (!str3.equals("url") && !str3.equals("fallback")) {
                clearQuery.appendQueryParameter(str3, parse.getQueryParameter(str3));
            } else if (!C9431p.m18664a(str2)) {
                clearQuery.appendQueryParameter(str3, URLEncoder.encode(str2));
            }
        }
        return clearQuery.build().toString();
    }

    /* renamed from: a */
    public static void m25420a(StringBuilder sb, boolean z) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C12563i.m25225g().mo23614a((Map<String, String>) linkedHashMap, z);
        linkedHashMap.put("polaris_version", "tt_2.0.0.62.alpha6");
        linkedHashMap.put("polaris_version_code", "203");
        ArrayList arrayList = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(C9425l.m18648a((List<Pair<String, String>>) arrayList, "UTF-8"));
    }

    /* renamed from: a */
    public static int m25415a(Uri uri, String str, int i) {
        int a = m25414a(uri, str);
        if (a == -1) {
            return 2;
        }
        return a;
    }

    /* renamed from: a */
    public static void m25419a(String str, WebView webView, HashMap<String, String> hashMap) {
        if (webView != null && !C9431p.m18664a(str)) {
            if (!hashMap.isEmpty()) {
                C12651q.m25430a(webView, str, hashMap);
            } else {
                C12640i.m25399a(webView, str);
            }
        }
    }

    /* renamed from: a */
    public static void m25421a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    String optString = jSONObject.optString(str2);
                    if (!C9431p.m18664a(str2)) {
                        if (!C9431p.m18664a(optString)) {
                            hashMap.put(str2, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!C9431p.m18664a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    /* renamed from: a */
    public static void m25418a(String str, WebView webView, String str2, boolean z) {
        if (webView != null && !C9431p.m18664a(str)) {
            boolean c = m25425c(str);
            if (c && C9431p.m18664a(str2)) {
                str2 = C12632d.f33195h;
            }
            if (!c) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!C9431p.m18664a(str2)) {
                hashMap.put("Referer", str2);
            }
            m25419a(str, webView, hashMap);
        }
    }
}
