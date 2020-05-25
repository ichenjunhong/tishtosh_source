package com.bytedance.frameworks.core.apm.p578a.p579a;

import android.content.ContentValues;
import com.bytedance.apm.p485h.C9039a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9931b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.b */
public final class C9933b extends C9932a<C9039a> {
    /* renamed from: d */
    public final String mo17884d() {
        return "t_apiall";
    }

    /* renamed from: e */
    public final String[] mo17885e() {
        return new String[]{"_id", "type", "version_id", "data", "hit_rules"};
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17886a(C9931b bVar) {
        return m19946b(bVar);
    }

    /* renamed from: b */
    private static C9039a m19946b(C9931b bVar) {
        long a = bVar.mo17887a("_id");
        String c = bVar.mo17889c("type");
        long a2 = bVar.mo17887a("version_id");
        String c2 = bVar.mo17889c("data");
        int b = bVar.mo17888b("hit_rules");
        try {
            JSONObject jSONObject = new JSONObject(c2);
            jSONObject.put("hit_rules", b);
            C9039a aVar = new C9039a(a, c, a2, jSONObject);
            return aVar;
        } catch (JSONException unused) {
            C9039a aVar2 = new C9039a(a, c, a2, c2);
            return aVar2;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ ContentValues mo17876a(Object obj) {
        String str;
        C9039a aVar = (C9039a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", aVar.f24682g);
        contentValues.put("type2", aVar.f24683h);
        contentValues.put("timestamp", Long.valueOf(aVar.f24686k));
        contentValues.put("version_id", Long.valueOf(aVar.f24685j));
        String str2 = "data";
        if (aVar.f24684i == null) {
            str = "";
        } else {
            str = aVar.f24684i.toString();
        }
        contentValues.put(str2, str);
        contentValues.put("is_sampled", Integer.valueOf(aVar.f24687l ? 1 : 0));
        contentValues.put("hit_rules", Integer.valueOf(aVar.f24660d));
        contentValues.put("front", Integer.valueOf(aVar.f24657a));
        contentValues.put("sid", Long.valueOf(aVar.f24659c));
        contentValues.put("network_type", Integer.valueOf(aVar.f24658b));
        contentValues.put("traffic_value", Long.valueOf(aVar.f24661e));
        return contentValues;
    }
}
