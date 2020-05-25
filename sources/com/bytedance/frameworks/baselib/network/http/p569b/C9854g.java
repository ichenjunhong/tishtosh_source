package com.bytedance.frameworks.baselib.network.http.p569b;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9389c;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9898d;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9902h;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18979e;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.g */
public final class C9854g extends CookieManager {

    /* renamed from: a */
    public static boolean f26825a;

    /* renamed from: g */
    private static boolean f26826g;

    /* renamed from: b */
    public volatile C9842a f26827b;

    /* renamed from: c */
    private final android.webkit.CookieManager f26828c;

    /* renamed from: d */
    private Pattern f26829d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e */
    private final C9856a f26830e;

    /* renamed from: f */
    private ArrayList<String> f26831f;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.b.g$a */
    public interface C9856a {
        /* renamed from: a */
        void mo17701a(String str, String str2, JSONObject jSONObject);
    }

    /* renamed from: a */
    private void m19716a(String str) {
        if (this.f26831f != null && !this.f26831f.isEmpty() && VERSION.SDK_INT >= 21) {
            Iterator it = this.f26831f.iterator();
            while (it.hasNext()) {
                if (str.equals((String) it.next())) {
                    android.webkit.CookieManager.getInstance().flush();
                    return;
                }
            }
        }
    }

    public final Map get(URI uri, Map map) throws IOException {
        Map a = mo17697a(uri, map);
        C18979e.m46156a(uri);
        return a;
    }

    /* renamed from: a */
    private static List<String> m19714a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            list = (List) map.get(str.toLowerCase());
        }
        return list;
    }

    /* renamed from: a */
    private Map<String, List<String>> m19715a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f26825a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List a = m19714a(map, "Cookie");
                if (a == null || a.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List a2 = m19714a(map, "X-SS-Cookie");
                if (a2 != null && !a2.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List a3 = m19714a(map, "Cookie");
            if (a3 == null || a3.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    /* renamed from: a */
    private boolean m19717a(URI uri, String str) {
        if (uri == null || C9431p.m18664a(str)) {
            return false;
        }
        try {
            String lowerCase = uri.getHost().toLowerCase();
            String str2 = "";
            Matcher matcher = this.f26829d.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group().toLowerCase();
            }
            if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final Map<String, List<String>> mo17697a(URI uri, Map<String, List<String>> map) throws IOException {
        String str;
        Map<String, List<String>> map2;
        android.webkit.CookieManager cookieManager = null;
        try {
            str = uri.toString();
            if (map != null) {
                try {
                    List<String> a = m19714a(map, "X-SS-No-Cookie");
                    if (a != null) {
                        for (String str2 : a) {
                            if (str2 != null && Boolean.parseBoolean(str2)) {
                                return Collections.emptyMap();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            C9898d dVar = C9894e.f26964i;
            if (dVar != null) {
                Map<String, List<String>> a2 = dVar.mo17825a(uri, map);
                if (a2 != null && !a2.isEmpty() && (a2.containsKey("Cookie") || a2.containsKey("X-SS-Cookie"))) {
                    return a2;
                }
            }
        } catch (Throwable unused2) {
            str = null;
        }
        if (uri == null || this.f26828c == null) {
            return Collections.emptyMap();
        }
        try {
            C9902h i = C9894e.m19835i();
            if (i != null) {
                if (!f26826g) {
                    cookieManager = this.f26828c;
                }
                List a3 = i.mo17829a(cookieManager, this.f26827b, uri);
                if (!C9414h.m18630a(a3)) {
                    return m19715a(a3, map);
                }
            }
        } catch (Throwable unused3) {
        }
        if (!f26826g) {
            try {
                String cookie = this.f26828c.getCookie(str);
                if (cookie != null && cookie.length() > 0) {
                    return m19715a(Collections.singletonList(cookie), map);
                }
            } catch (Exception unused4) {
            }
        }
        if (this.f26827b == null) {
            return Collections.emptyMap();
        }
        try {
            C9842a aVar = this.f26827b;
            if (map == null) {
                map2 = new LinkedHashMap<>();
            } else {
                map2 = map;
            }
            Map map3 = aVar.get(uri, map2);
            if (map3 != null && !map3.isEmpty()) {
                return m19715a((List) map3.get("Cookie"), map);
            }
        } catch (Throwable unused5) {
        }
        return Collections.emptyMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:112|113|114|115|116|(1:119)|120) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0183 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void put(java.net.URI r18, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.bytedance.frameworks.baselib.network.http.e$h r3 = com.bytedance.frameworks.baselib.network.http.C9894e.m19835i()
            if (r3 == 0) goto L_0x0015
            java.lang.String r4 = r18.getHost()
            java.util.List r3 = r3.mo17830d(r4)
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0029
            java.lang.String r7 = "Set-Cookie"
            boolean r7 = r2.containsKey(r7)
            if (r7 == 0) goto L_0x0029
            r7 = 1
            goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            java.lang.String r8 = "shareHostList"
            if (r3 != 0) goto L_0x0031
            java.lang.String r9 = ""
            goto L_0x0035
        L_0x0031:
            java.lang.String r9 = r3.toString()     // Catch:{ JSONException -> 0x0051 }
        L_0x0035:
            r4.put(r8, r9)     // Catch:{ JSONException -> 0x0051 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r8 = "responseHeaders"
            java.lang.String r9 = r19.toString()     // Catch:{ JSONException -> 0x0051 }
            r4.put(r8, r9)     // Catch:{ JSONException -> 0x0051 }
        L_0x0043:
            java.lang.String r8 = "url"
            if (r1 != 0) goto L_0x004a
            java.lang.String r9 = ""
            goto L_0x004e
        L_0x004a:
            java.lang.String r9 = r18.toString()     // Catch:{ JSONException -> 0x0051 }
        L_0x004e:
            r4.put(r8, r9)     // Catch:{ JSONException -> 0x0051 }
        L_0x0051:
            boolean r8 = f26826g
            if (r8 != 0) goto L_0x012d
            if (r1 == 0) goto L_0x0116
            if (r2 == 0) goto L_0x0116
            android.webkit.CookieManager r8 = r0.f26828c
            if (r8 != 0) goto L_0x005f
            goto L_0x0116
        L_0x005f:
            java.lang.String r8 = r18.toString()
            boolean r9 = f26825a
            if (r9 == 0) goto L_0x0073
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.String r10 = "X-SS-Set-Cookie"
            r9[r5] = r10
            java.lang.String r10 = "Set-Cookie"
            r9[r6] = r10
            goto L_0x0079
        L_0x0073:
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.String r10 = "Set-Cookie"
            r9[r5] = r10
        L_0x0079:
            int r10 = r9.length
        L_0x007a:
            if (r5 >= r10) goto L_0x010c
            r11 = r9[r5]
            java.lang.Object r12 = r2.get(r11)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x008c
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x009f
        L_0x008c:
            java.lang.String r11 = r11.toLowerCase()
            java.lang.Object r11 = r2.get(r11)
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x0107
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x0107
        L_0x009f:
            java.lang.String r11 = "cookieMgrList"
            java.lang.String r13 = r12.toString()     // Catch:{ JSONException -> 0x00a8 }
            r4.put(r11, r13)     // Catch:{ JSONException -> 0x00a8 }
        L_0x00a8:
            java.util.Iterator r11 = r12.iterator()
        L_0x00ac:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0107
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            android.webkit.CookieManager r13 = r0.f26828c
            r13.setCookie(r8, r12)
            boolean r13 = com.bytedance.common.utility.C9414h.m18630a(r3)     // Catch:{ Throwable -> 0x0105 }
            r13 = r13 ^ r6
            if (r13 != 0) goto L_0x00c5
            goto L_0x00ac
        L_0x00c5:
            java.util.Iterator r13 = r3.iterator()     // Catch:{ Throwable -> 0x0105 }
        L_0x00c9:
            boolean r14 = r13.hasNext()     // Catch:{ Throwable -> 0x0105 }
            if (r14 == 0) goto L_0x00ac
            java.lang.Object r14 = r13.next()     // Catch:{ Throwable -> 0x0105 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x0105 }
            boolean r15 = com.bytedance.common.utility.C9431p.m18664a(r14)     // Catch:{ Throwable -> 0x0103 }
            if (r15 == 0) goto L_0x00dc
            goto L_0x00c9
        L_0x00dc:
            java.lang.String r15 = r18.getHost()     // Catch:{ Throwable -> 0x0103 }
            boolean r15 = r15.endsWith(r14)     // Catch:{ Throwable -> 0x0103 }
            if (r15 == 0) goto L_0x00e7
            goto L_0x00c9
        L_0x00e7:
            boolean r15 = r0.m19717a(r1, r12)     // Catch:{ Throwable -> 0x0103 }
            if (r15 != 0) goto L_0x00ee
            goto L_0x00c9
        L_0x00ee:
            java.util.regex.Pattern r15 = r0.f26829d     // Catch:{ Throwable -> 0x0103 }
            java.util.regex.Matcher r15 = r15.matcher(r12)     // Catch:{ Throwable -> 0x0103 }
            java.lang.String r15 = r15.replaceFirst(r14)     // Catch:{ Throwable -> 0x0103 }
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r15)     // Catch:{ Throwable -> 0x0103 }
            if (r16 != 0) goto L_0x0103
            android.webkit.CookieManager r6 = r0.f26828c     // Catch:{ Throwable -> 0x0103 }
            r6.setCookie(r14, r15)     // Catch:{ Throwable -> 0x0103 }
        L_0x0103:
            r6 = 1
            goto L_0x00c9
        L_0x0105:
            r6 = 1
            goto L_0x00ac
        L_0x0107:
            int r5 = r5 + 1
            r6 = 1
            goto L_0x007a
        L_0x010c:
            java.lang.String r5 = r18.getPath()     // Catch:{ Throwable -> 0x0114 }
            r0.m19716a(r5)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x012d
        L_0x0114:
            goto L_0x012d
        L_0x0116:
            java.lang.String r1 = "return"
            java.lang.String r2 = "uri responseHeaders or mCookieMgr is null"
            r4.put(r1, r2)     // Catch:{ JSONException -> 0x011d }
        L_0x011d:
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            if (r1 == 0) goto L_0x012c
            if (r7 == 0) goto L_0x012c
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            java.lang.String r2 = "TTNET-COOKIE"
            java.lang.String r3 = "put"
            r1.mo17701a(r2, r3, r4)
        L_0x012c:
            return
        L_0x012d:
            com.bytedance.frameworks.baselib.network.http.b.a r5 = r0.f26827b
            if (r5 != 0) goto L_0x0148
            java.lang.String r1 = "return"
            java.lang.String r2 = "mAppCookieMgr is null"
            r4.put(r1, r2)     // Catch:{ JSONException -> 0x0138 }
        L_0x0138:
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            if (r1 == 0) goto L_0x0147
            if (r7 == 0) goto L_0x0147
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            java.lang.String r2 = "TTNET-COOKIE"
            java.lang.String r3 = "put"
            r1.mo17701a(r2, r3, r4)
        L_0x0147:
            return
        L_0x0148:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0213 }
            r5.<init>()     // Catch:{ Throwable -> 0x0213 }
            boolean r6 = f26825a     // Catch:{ Throwable -> 0x0213 }
            if (r6 == 0) goto L_0x016c
            java.lang.String r6 = "X-SS-Set-Cookie"
            boolean r6 = r2.containsKey(r6)     // Catch:{ Throwable -> 0x0213 }
            if (r6 == 0) goto L_0x016c
            java.lang.String r6 = "Set-Cookie"
            boolean r6 = r2.containsKey(r6)     // Catch:{ Throwable -> 0x0213 }
            if (r6 != 0) goto L_0x016c
            java.lang.String r6 = "Set-Cookie"
            java.lang.String r8 = "X-SS-Set-Cookie"
            java.lang.Object r8 = r2.get(r8)     // Catch:{ Throwable -> 0x0213 }
            r5.put(r6, r8)     // Catch:{ Throwable -> 0x0213 }
        L_0x016c:
            r5.putAll(r2)     // Catch:{ Throwable -> 0x0213 }
            com.bytedance.frameworks.baselib.network.http.b.a r6 = r0.f26827b     // Catch:{ Throwable -> 0x0213 }
            r6.put(r1, r5)     // Catch:{ Throwable -> 0x0213 }
            boolean r6 = com.bytedance.common.utility.C9414h.m18630a(r3)     // Catch:{ Throwable -> 0x0213 }
            r8 = 1
            r6 = r6 ^ r8
            if (r6 != 0) goto L_0x0193
            java.lang.String r1 = "return"
            java.lang.String r2 = "isInShareCookieList is false"
            r4.put(r1, r2)     // Catch:{ JSONException -> 0x0183 }
        L_0x0183:
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e     // Catch:{ Throwable -> 0x0213 }
            if (r1 == 0) goto L_0x0192
            if (r7 == 0) goto L_0x0192
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e     // Catch:{ Throwable -> 0x0213 }
            java.lang.String r2 = "TTNET-COOKIE"
            java.lang.String r3 = "put"
            r1.mo17701a(r2, r3, r4)     // Catch:{ Throwable -> 0x0213 }
        L_0x0192:
            return
        L_0x0193:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0213 }
        L_0x0197:
            boolean r6 = r3.hasNext()     // Catch:{ Throwable -> 0x0213 }
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r3.next()     // Catch:{ Throwable -> 0x0213 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x0213 }
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x0197 }
            if (r8 == 0) goto L_0x01aa
            goto L_0x0197
        L_0x01aa:
            java.lang.String r8 = r18.getHost()     // Catch:{ Throwable -> 0x0197 }
            boolean r8 = r8.endsWith(r6)     // Catch:{ Throwable -> 0x0197 }
            if (r8 == 0) goto L_0x01b5
            goto L_0x0197
        L_0x01b5:
            java.lang.String r8 = "Set-Cookie"
            java.lang.Object r8 = r2.get(r8)     // Catch:{ Throwable -> 0x0197 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Throwable -> 0x0197 }
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ Throwable -> 0x0197 }
            r9.<init>()     // Catch:{ Throwable -> 0x0197 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Throwable -> 0x0197 }
        L_0x01c6:
            boolean r10 = r8.hasNext()     // Catch:{ Throwable -> 0x0197 }
            if (r10 == 0) goto L_0x01ec
            java.lang.Object r10 = r8.next()     // Catch:{ Throwable -> 0x0197 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x0197 }
            boolean r11 = r0.m19717a(r1, r10)     // Catch:{ Throwable -> 0x0197 }
            if (r11 == 0) goto L_0x01c6
            java.util.regex.Pattern r11 = r0.f26829d     // Catch:{ Throwable -> 0x0197 }
            java.util.regex.Matcher r10 = r11.matcher(r10)     // Catch:{ Throwable -> 0x0197 }
            java.lang.String r10 = r10.replaceFirst(r6)     // Catch:{ Throwable -> 0x0197 }
            boolean r11 = com.bytedance.common.utility.C9431p.m18664a(r10)     // Catch:{ Throwable -> 0x0197 }
            if (r11 != 0) goto L_0x01c6
            r9.add(r10)     // Catch:{ Throwable -> 0x0197 }
            goto L_0x01c6
        L_0x01ec:
            java.lang.String r8 = "Set-Cookie"
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0197 }
            com.bytedance.frameworks.baselib.network.http.b.a r8 = r0.f26827b     // Catch:{ Throwable -> 0x0197 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0197 }
            r9.<init>()     // Catch:{ Throwable -> 0x0197 }
            java.lang.String r10 = r18.getScheme()     // Catch:{ Throwable -> 0x0197 }
            r9.append(r10)     // Catch:{ Throwable -> 0x0197 }
            java.lang.String r10 = "://"
            r9.append(r10)     // Catch:{ Throwable -> 0x0197 }
            r9.append(r6)     // Catch:{ Throwable -> 0x0197 }
            java.lang.String r6 = r9.toString()     // Catch:{ Throwable -> 0x0197 }
            java.net.URI r6 = java.net.URI.create(r6)     // Catch:{ Throwable -> 0x0197 }
            r8.put(r6, r5)     // Catch:{ Throwable -> 0x0197 }
            goto L_0x0197
        L_0x0213:
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            if (r1 == 0) goto L_0x0222
            if (r7 == 0) goto L_0x0222
            com.bytedance.frameworks.baselib.network.http.b.g$a r1 = r0.f26830e
            java.lang.String r2 = "TTNET-COOKIE"
            java.lang.String r3 = "put"
            r1.mo17701a(r2, r3, r4)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p569b.C9854g.put(java.net.URI, java.util.Map):void");
    }

    public C9854g(final Context context, int i, android.webkit.CookieManager cookieManager, ArrayList<String> arrayList, C9856a aVar) {
        if (i > 0) {
            C9389c.m18569b().schedule(new Runnable() {
                public final void run() {
                    C9854g.this.f26827b = new C9842a(new C9852f(context), C9843b.f26792a);
                }
            }, (long) i, TimeUnit.SECONDS);
        } else {
            this.f26827b = new C9842a(new C9852f(context), C9843b.f26792a);
        }
        this.f26828c = cookieManager;
        this.f26831f = arrayList;
        this.f26830e = aVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "success");
        } catch (JSONException unused) {
        }
        if (this.f26830e != null) {
            this.f26830e.mo17701a("TTNET-COOKIE", "init", jSONObject);
        }
    }
}
