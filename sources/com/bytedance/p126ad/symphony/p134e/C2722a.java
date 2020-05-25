package com.bytedance.p126ad.symphony.p134e;

import com.bytedance.p126ad.symphony.p138h.C2739a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a */
public class C2722a {

    /* renamed from: e */
    private static final String f8222e = "a";

    /* renamed from: a */
    public C2739a f8223a;

    /* renamed from: b */
    public List<String> f8224b;

    /* renamed from: c */
    public JSONObject f8225c;

    /* renamed from: d */
    public long f8226d;

    private C2722a() {
    }

    /* renamed from: a */
    public static C2722a m7781a(JSONObject jSONObject) {
        C2722a aVar = new C2722a();
        try {
            aVar.f8226d = jSONObject.optLong("ad_id");
            aVar.f8224b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("placement_type");
            for (int i = 0; i < jSONArray.length(); i++) {
                aVar.f8224b.add(jSONArray.getString(i));
            }
            aVar.f8225c = jSONObject.optJSONObject("log_extra");
            aVar.f8223a = C2739a.m7816a(jSONObject.optJSONObject("fill_strategy"));
        } catch (Exception e) {
            e.getMessage();
        }
        return aVar;
    }
}
