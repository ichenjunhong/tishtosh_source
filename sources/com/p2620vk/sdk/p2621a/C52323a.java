package com.p2620vk.sdk.p2621a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.a.a */
public final class C52323a {
    /* renamed from: a */
    private static Object m111786a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return m111788a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m111787a((JSONArray) obj);
        }
        return obj;
    }

    /* renamed from: a */
    public static List m111787a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m111786a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, Object> m111788a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, m111786a(jSONObject.get(str)));
        }
        return hashMap;
    }
}
