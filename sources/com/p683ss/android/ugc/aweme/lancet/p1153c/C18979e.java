package com.p683ss.android.ugc.aweme.lancet.p1153c;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.frameworks.baselib.network.http.p569b.C9857h;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.ttnet.p883a.C13258a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.e */
public final class C18979e {

    /* renamed from: a */
    private static List<String> f52286a;

    /* renamed from: b */
    private static Map<URI, Set<C9857h>> f52287b = new ConcurrentHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        f52286a = arrayList;
        arrayList.add("sessionid");
        f52286a.add("sid_tt");
        f52286a.add("sid_guard");
        f52286a.add("uid_tt");
    }

    /* renamed from: a */
    public static void m46155a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    if (str.startsWith("http://") || str.startsWith("https://")) {
                        C18979e.m46156a(URI.create(str));
                    }
                    return null;
                }
            }, (Executor) C24076h.m58904e());
        }
    }

    /* renamed from: b */
    private static String m46158b(String str) {
        int length = str.length() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (length < 0) {
                length = 0;
                break;
            }
            if (str.charAt(length) == '.') {
                if (i2 == 1) {
                    break;
                }
                i2++;
            }
            length--;
        }
        if (length > 0) {
            i = length + 1;
        }
        return str.substring(i);
    }

    /* renamed from: a */
    public static void m46156a(URI uri) {
        String str;
        String str2;
        try {
            if (C20854a.m53167g().isLogin()) {
                String b = m46158b(uri.getHost());
                C13258a a = C13258a.m26660a(C11010c.m22280a());
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(b);
                List<String> d = a.mo17830d(sb.toString());
                if (d != null) {
                    if (!d.isEmpty()) {
                        String str3 = null;
                        if (CookieManager.getInstance() != null) {
                            str3 = CookieManager.getInstance().getCookie(uri.toString());
                        }
                        if (str3 != null) {
                            int i = 0;
                            StringBuilder sb2 = new StringBuilder();
                            for (String str4 : f52286a) {
                                if (str3.contains(str4)) {
                                    i++;
                                    sb2.append(str4);
                                    sb2.append(';');
                                }
                            }
                            if (i < f52286a.size()) {
                                str = sb2.toString();
                            } else {
                                return;
                            }
                        } else {
                            str = "";
                        }
                        StringBuilder sb3 = new StringBuilder();
                        for (String append : d) {
                            sb3.append(append);
                            sb3.append(";");
                        }
                        String sb4 = sb3.toString();
                        if (f52287b == null) {
                            StringBuilder sb5 = new StringBuilder("empty local cookie list ");
                            sb5.append(uri.getHost());
                            sb5.append(uri.getPath());
                            C32458a.m75146a("cookie_m", sb5.toString());
                            str2 = "";
                        } else {
                            Map<URI, Set<C9857h>> map = f52287b;
                            StringBuilder sb6 = new StringBuilder("http://");
                            sb6.append(b);
                            sb6.append("/");
                            Set<C9857h> set = (Set) map.get(URI.create(sb6.toString()));
                            if (set != null) {
                                if (!set.isEmpty()) {
                                    StringBuilder sb7 = new StringBuilder();
                                    for (C9857h hVar : set) {
                                        if (!(hVar == null || hVar.getHttpCookie() == null)) {
                                            sb7.append(hVar.getHttpCookie().f26806f);
                                            sb7.append(";");
                                        }
                                    }
                                    str2 = sb7.toString();
                                }
                            }
                            StringBuilder sb8 = new StringBuilder("no local cookie ");
                            sb8.append(uri.getHost());
                            sb8.append(uri.getPath());
                            C32458a.m75146a("cookie_m", sb8.toString());
                            str2 = "";
                        }
                        StringBuilder sb9 = new StringBuilder("domain = ");
                        sb9.append(sb4);
                        sb9.append(" cookieKey = ");
                        sb9.append(str2);
                        sb9.append(" ");
                        sb9.append(uri.getHost());
                        sb9.append(uri.getPath());
                        C32458a.m75146a("cookie_m", sb9.toString());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("host", sb4);
                            jSONObject.put("error_desc", str2);
                            jSONObject.put("uri", uri.toString());
                            jSONObject.put(C22858c.f61208d, str);
                        } catch (JSONException unused) {
                        }
                        C9951d.m19997a("cookie_error", jSONObject);
                        return;
                    }
                }
                StringBuilder sb10 = new StringBuilder("empty host list ");
                sb10.append(uri.toString());
                C32458a.m75146a("cookie_m", sb10.toString());
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static void m46157a(Map<URI, Set<C9857h>> map, URI uri) {
        if (uri != null) {
            try {
                String b = m46158b(uri.getHost());
                C13258a a = C13258a.m26660a(C11010c.m22280a());
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(b);
                List d = a.mo17830d(sb.toString());
                if (d != null) {
                    if (d.size() > 0) {
                        f52287b.clear();
                        StringBuilder sb2 = new StringBuilder();
                        for (Entry entry : map.entrySet()) {
                            if (!(entry.getKey() == null || entry.getValue() == null || ((Set) entry.getValue()).size() <= 0)) {
                                HashSet hashSet = new HashSet();
                                for (C9857h hVar : (Set) entry.getValue()) {
                                    sb2.append(hVar.getHttpCookie().f26806f);
                                    sb2.append(";");
                                    hashSet.add(hVar);
                                }
                                sb2.append("\n");
                                f52287b.put(entry.getKey(), hashSet);
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("put ");
                        sb3.append(sb2.toString());
                        sb3.append(" ");
                        sb3.append(uri.getHost());
                        sb3.append(uri.getPath());
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getName());
                        C32458a.m75146a("cookie_m", sb3.toString());
                        return;
                    }
                }
                StringBuilder sb4 = new StringBuilder("updateCookieMap empty host ");
                sb4.append(uri.toString());
                C32458a.m75146a("cookie_m", sb4.toString());
            } catch (Exception unused) {
            }
        }
    }
}
