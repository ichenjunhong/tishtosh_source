package com.p683ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.c */
public final class C36946c {
    /* renamed from: a */
    private static List<Object> m83160a(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m83160a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m83161a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static HashMap<String, Object> m83159a(Uri uri) {
        Object obj;
        if (uri == null) {
            return null;
        }
        JSONParser jSONParser = new JSONParser();
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter(str);
                    try {
                        obj = jSONParser.parse(queryParameter);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    try {
                        if (obj instanceof JSONObject) {
                            hashMap.put(str, m83161a((JSONObject) obj));
                        } else if (obj instanceof JSONArray) {
                            hashMap.put(str, ((JSONArray) obj).toArray());
                        } else {
                            hashMap.put(str, queryParameter);
                        }
                    } catch (Exception unused2) {
                        return hashMap;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, Object> m83161a(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = m83160a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m83161a((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }
}
