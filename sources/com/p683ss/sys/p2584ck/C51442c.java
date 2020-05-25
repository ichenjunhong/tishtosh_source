package com.p683ss.sys.p2584ck;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.c */
public final class C51442c {

    /* renamed from: a */
    static Map<String, HashMap<String, Method>> f128630a = new HashMap();

    /* renamed from: a */
    public static boolean m110622a(WebView webView, String str) {
        String str2 = "";
        String str3 = "";
        String str4 = "{}";
        String str5 = "";
        if (!TextUtils.isEmpty(str) && str.startsWith("jsbridge")) {
            try {
                Uri parse = Uri.parse(str);
                str3 = parse.getHost();
                str4 = parse.getQuery();
                StringBuilder sb = new StringBuilder();
                sb.append(parse.getPort());
                str5 = sb.toString();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    str2 = path.replace("/", "");
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        if (f128630a.containsKey(str3)) {
            HashMap hashMap = (HashMap) f128630a.get(str3);
            if (!(hashMap == null || hashMap.size() == 0 || !hashMap.containsKey(str2))) {
                Method method = (Method) hashMap.get(str2);
                if (!(method == null || webView == null)) {
                    try {
                        method.invoke(null, new Object[]{webView, new JSONObject(str4), new C51443d(webView, str5)});
                        return true;
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return false;
    }
}
