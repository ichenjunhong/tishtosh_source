package com.bytedance.apm.p480f.p482b;

import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p489l.C9111g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.g */
public final class C9025g implements C9028d {

    /* renamed from: a */
    public String f24622a;

    /* renamed from: b */
    public String f24623b;

    /* renamed from: c */
    public JSONObject f24624c;

    /* renamed from: d */
    public JSONObject f24625d;

    /* renamed from: b */
    public final String mo16349b() {
        return "ui_action";
    }

    /* renamed from: c */
    public final String mo16350c() {
        return "ui_action";
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
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo16347a() {
        try {
            if (this.f24625d == null) {
                this.f24625d = new JSONObject();
            }
            this.f24625d.put("log_type", "ui_action");
            this.f24625d.put("action", this.f24622a);
            this.f24625d.put("page", this.f24623b);
            this.f24625d.put("context", this.f24624c);
            return this.f24625d;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return C9111g.m18066a().mo16477a("ui");
    }

    public C9025g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f24622a = str;
        this.f24623b = str2;
        this.f24624c = jSONObject;
        this.f24625d = jSONObject2;
    }
}
