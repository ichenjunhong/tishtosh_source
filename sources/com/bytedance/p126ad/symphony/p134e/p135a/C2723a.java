package com.bytedance.p126ad.symphony.p134e.p135a;

import com.bytedance.p126ad.symphony.C2680b;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.a */
public class C2723a {

    /* renamed from: a */
    public int f8227a;

    /* renamed from: b */
    public long f8228b;

    /* renamed from: c */
    public long f8229c;

    /* renamed from: d */
    public String f8230d;

    /* renamed from: e */
    public String f8231e;

    /* renamed from: f */
    public HashMap<String, C2724b> f8232f = new HashMap<>();

    /* renamed from: g */
    public String f8233g;

    /* renamed from: h */
    private String f8234h;

    public String toString() {
        if (this.f8234h == null) {
            return "";
        }
        return this.f8234h;
    }

    /* renamed from: a */
    public final C2724b mo7275a(String str) {
        return (C2724b) this.f8232f.get(C2724b.m7786a(str));
    }

    /* renamed from: a */
    public static Map<String, List<String>> m7784a(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("config_type");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("contain_placement_types");
                if (!(optString == null || optJSONArray == null)) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (optString2 != null) {
                            arrayList.add(optString2);
                        }
                    }
                    if (!C2745d.m7836a((List<?>) arrayList)) {
                        hashMap.put(optString, arrayList);
                    }
                }
            }
        }
        new StringBuilder("config-->").append(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static List<C2723a> m7783a(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    C2723a a = m7782a(optJSONObject, i);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C2723a m7782a(JSONObject jSONObject, int i) {
        C2724b bVar;
        if (jSONObject != null) {
            try {
                C2723a aVar = new C2723a();
                aVar.f8227a = jSONObject.getInt("provider_id");
                aVar.f8228b = jSONObject.optLong("expire_time");
                aVar.f8229c = jSONObject.optLong("request_timeout");
                aVar.f8230d = jSONObject.optString("mid");
                aVar.f8231e = jSONObject.optString("app_id");
                aVar.f8234h = jSONObject.toString();
                if (C2680b.m7713b()) {
                    aVar.f8233g = jSONObject.optString("test_key");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("placements");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (i == 2) {
                            bVar = new C2725c(jSONObject2);
                        } else {
                            bVar = new C2724b(jSONObject2);
                        }
                        if (bVar.mo7277a()) {
                            aVar.f8232f.put(bVar.f8236b, bVar);
                        }
                    }
                }
                return aVar;
            } catch (JSONException unused) {
                new StringBuilder("adconfig json is not valid,json:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
