package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ci */
public final class C47768ci {

    /* renamed from: a */
    public static final C47768ci f120289a = new C47768ci();

    private C47768ci() {
    }

    /* renamed from: a */
    public static final String m103397a(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Object> m103398a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                Map map = concurrentHashMap;
                C52711k.m112236a((Object) str2, "key");
                Object obj = jSONObject.get(str2);
                C52711k.m112236a(obj, "jsonObject.get(key)");
                map.put(str2, obj);
            }
            return concurrentHashMap;
        } catch (JSONException unused) {
            return null;
        }
    }
}
