package com.facebook.p909a.p912b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.g */
public final class C13563g {

    /* renamed from: a */
    public static boolean f35391a;

    /* renamed from: b */
    public static Set<String> f35392b = new HashSet();

    /* renamed from: c */
    private static final String f35393c = C13563g.class.getCanonicalName();

    /* renamed from: d */
    private static List<C13564a> f35394d = new ArrayList();

    /* renamed from: com.facebook.a.b.g$a */
    static class C13564a {

        /* renamed from: a */
        String f35395a;

        /* renamed from: b */
        Map<String, String> f35396b;

        C13564a(String str, Map<String, String> map) {
            this.f35395a = str;
            this.f35396b = map;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m27389a(java.lang.String r6) {
        /*
            java.lang.Class<com.facebook.a.b.g> r0 = com.facebook.p909a.p912b.C13563g.class
            monitor-enter(r0)
            boolean r1 = f35391a     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            boolean r1 = r6.isEmpty()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r1 != 0) goto L_0x005d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.List<com.facebook.a.b.g$a> r6 = f35394d     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r6.clear()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Set<java.lang.String> r6 = f35392b     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r6.clear()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Iterator r6 = r1.keys()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
        L_0x0022:
            boolean r2 = r6.hasNext()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = "is_deprecated_event"
            boolean r3 = r3.optBoolean(r4)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0042
            java.util.Set<java.lang.String> r3 = f35392b     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r3.add(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            goto L_0x0022
        L_0x0042:
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.lang.String r4 = "restrictive_param"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            if (r3 == 0) goto L_0x0022
            java.util.List<com.facebook.a.b.g$a> r4 = f35394d     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            com.facebook.a.b.g$a r5 = new com.facebook.a.b.g$a     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            java.util.Map r3 = com.facebook.internal.C14277aa.m29262a(r3)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r5.<init>(r2, r3)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            r4.add(r5)     // Catch:{ JSONException -> 0x0061, Exception -> 0x005f }
            goto L_0x0022
        L_0x005d:
            monitor-exit(r0)
            return
        L_0x005f:
            monitor-exit(r0)
            return
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.p912b.C13563g.m27389a(java.lang.String):void");
    }

    /* renamed from: a */
    private static String m27388a(String str, String str2) {
        try {
            Iterator it = new ArrayList(f35394d).iterator();
            while (it.hasNext()) {
                C13564a aVar = (C13564a) it.next();
                if (aVar != null && str.equals(aVar.f35395a)) {
                    for (String str3 : aVar.f35396b.keySet()) {
                        if (str2.equals(str3)) {
                            return (String) aVar.f35396b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m27390a(Map<String, String> map, String str) {
        if (f35391a) {
            HashMap hashMap = new HashMap();
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String a = m27388a(str, str2);
                if (a != null) {
                    hashMap.put(str2, a);
                    map.remove(str2);
                }
            }
            if (hashMap.size() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
