package com.bytedance.polaris.p826d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.d.h */
public final class C12639h {
    /* renamed from: a */
    private static List<Object> m25397a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m25397a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m25398a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m25398a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONArray) {
                    obj = m25397a((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = m25398a((JSONObject) obj);
                }
                hashMap.put(str, obj.toString());
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }
}
