package com.bytedance.apm.p480f.p482b;

import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.c */
public final class C9021c implements C9028d {

    /* renamed from: a */
    public String f24604a;

    /* renamed from: b */
    public int f24605b;

    /* renamed from: c */
    public JSONObject f24606c;

    /* renamed from: d */
    public JSONObject f24607d;

    /* renamed from: e */
    public JSONObject f24608e;

    /* renamed from: f */
    public JSONObject f24609f;

    /* renamed from: g */
    public boolean f24610g;

    /* renamed from: b */
    public final String mo16349b() {
        return "service_monitor";
    }

    /* renamed from: c */
    public final String mo16350c() {
        return "service_monitor";
    }

    /* renamed from: d */
    public final boolean mo16351d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo16352e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo16353f() {
        return this.f24610g;
    }

    /* renamed from: a */
    public final JSONObject mo16347a() {
        if (this.f24609f == null) {
            this.f24609f = new JSONObject();
        }
        try {
            this.f24609f.put("log_type", "service_monitor");
            this.f24609f.put("service", this.f24604a);
            this.f24609f.put("status", this.f24605b);
            if (this.f24606c != null) {
                this.f24609f.put("value", this.f24606c);
            }
            if (this.f24607d != null) {
                this.f24609f.put("category", this.f24607d);
            }
            if (this.f24608e != null) {
                this.f24609f.put("metric", this.f24608e);
            }
            return this.f24609f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return cVar.mo16342b(this.f24604a);
    }

    public C9021c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f24604a = str;
        this.f24605b = i;
        this.f24606c = jSONObject;
        this.f24607d = jSONObject2;
        this.f24608e = jSONObject3;
        this.f24609f = jSONObject4;
    }
}
