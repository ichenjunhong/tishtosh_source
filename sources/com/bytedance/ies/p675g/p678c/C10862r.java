package com.bytedance.ies.p675g.p678c;

import android.net.Uri;
import android.net.Uri.Builder;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.g.c.r */
public final class C10862r {
    /* renamed from: a */
    public static final SortedMap<String, String> m22023a(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        if (jSONObject == null) {
            return treeMap;
        }
        Iterator keys = jSONObject.keys();
        C52711k.m112236a((Object) keys, "keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Map map = treeMap;
            C52711k.m112236a((Object) str, "key");
            String string = jSONObject.getString(str);
            C52711k.m112236a((Object) string, "getString(key)");
            map.put(str, string);
        }
        return treeMap;
    }

    /* renamed from: a */
    public static final SortedMap<String, String> m22022a(Uri uri) {
        boolean z;
        C52711k.m112240b(uri, "$this$getQueryMap");
        TreeMap treeMap = new TreeMap();
        CharSequence query = uri.getQuery();
        if (query == null || query.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return treeMap;
        }
        String query2 = uri.getQuery();
        if (query2 != null) {
            List<String> b = C52830p.m112452b((CharSequence) query2, new String[]{"&"}, false, 0, 6, (Object) null);
            if (b != null) {
                for (String str : b) {
                    int a = C52830p.m112419a((CharSequence) str, "=", 0, false, 6, (Object) null);
                    if (a >= 0) {
                        Map map = treeMap;
                        if (str != null) {
                            String substring = str.substring(0, a);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            C52711k.m112236a((Object) decode, "URLDecoder.decode(pair.s…tring(0, index), \"UTF-8\")");
                            int i = a + 1;
                            if (str != null) {
                                String substring2 = str.substring(i);
                                C52711k.m112236a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                                String decode2 = URLDecoder.decode(substring2, "UTF-8");
                                C52711k.m112236a((Object) decode2, "URLDecoder.decode(pair.s…ring(index + 1), \"UTF-8\")");
                                map.put(decode, decode2);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                return treeMap;
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    public static final JSONObject m22024a(Map<String, String> map) {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final String m22021a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "baseUrl");
        C52711k.m112240b(map, "params");
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String builder = buildUpon.toString();
        C52711k.m112236a((Object) builder, "builder.toString()");
        return builder;
    }
}
