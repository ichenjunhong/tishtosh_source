package com.bytedance.apm.p480f.p482b;

import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.e */
public final class C9023e implements C9028d {

    /* renamed from: a */
    public String f24613a;

    /* renamed from: b */
    public String f24614b;

    /* renamed from: c */
    public float f24615c;

    /* renamed from: b */
    public final String mo16349b() {
        return "timer";
    }

    /* renamed from: c */
    public final String mo16350c() {
        return "timer";
    }

    /* renamed from: d */
    public final boolean mo16351d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo16352e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo16353f() {
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo16347a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f24613a);
            jSONObject.put("key", this.f24614b);
            jSONObject.put("value", (double) this.f24615c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return cVar.mo16344c(this.f24613a);
    }

    public C9023e(String str, String str2, float f) {
        this.f24613a = str;
        this.f24614b = str2;
        this.f24615c = f;
    }
}
