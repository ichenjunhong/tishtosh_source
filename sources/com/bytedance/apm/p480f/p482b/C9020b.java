package com.bytedance.apm.p480f.p482b;

import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.b */
public final class C9020b implements C9028d {

    /* renamed from: a */
    public String f24601a;

    /* renamed from: b */
    public JSONObject f24602b;

    /* renamed from: c */
    public boolean f24603c;

    /* renamed from: b */
    public final String mo16349b() {
        return "common_log";
    }

    /* renamed from: c */
    public final String mo16350c() {
        return "common_log";
    }

    /* renamed from: d */
    public final boolean mo16351d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo16352e() {
        return this.f24603c;
    }

    /* renamed from: f */
    public final boolean mo16353f() {
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo16347a() {
        if (this.f24602b == null) {
            return null;
        }
        try {
            this.f24602b.put("log_type", this.f24601a);
        } catch (JSONException unused) {
        }
        return this.f24602b;
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return cVar.mo16339a(this.f24601a);
    }

    public C9020b(String str, JSONObject jSONObject, boolean z) {
        this.f24601a = str;
        this.f24602b = jSONObject;
        this.f24603c = z;
    }
}
