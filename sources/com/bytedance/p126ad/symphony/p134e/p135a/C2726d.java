package com.bytedance.p126ad.symphony.p134e.p135a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.d */
public final class C2726d {

    /* renamed from: a */
    private Map<String, String> f8243a = new HashMap();

    /* renamed from: a */
    public final String mo7279a(String str) {
        return (String) this.f8243a.get(str);
    }

    /* renamed from: a */
    public static C2726d m7788a(JSONArray jSONArray) {
        C2726d dVar = new C2726d();
        if (jSONArray == null) {
            return dVar;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    dVar.f8243a.put(optJSONObject.optString("placement_type"), optJSONObject.optString("fill_strategy"));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return dVar;
    }
}
