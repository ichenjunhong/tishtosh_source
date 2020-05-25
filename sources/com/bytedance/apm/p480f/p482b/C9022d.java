package com.bytedance.apm.p480f.p482b;

import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p489l.C9111g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.d */
public final class C9022d implements C9028d {

    /* renamed from: a */
    private String f24611a;

    /* renamed from: b */
    private JSONObject f24612b;

    /* renamed from: b */
    public final String mo16349b() {
        return this.f24611a;
    }

    /* renamed from: c */
    public final String mo16350c() {
        return this.f24611a;
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
        if (this.f24612b == null) {
            return null;
        }
        try {
            this.f24612b.put("log_type", this.f24611a);
        } catch (JSONException unused) {
        }
        return this.f24612b;
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return C9111g.m18066a().mo16479b(this.f24611a);
    }

    public C9022d(String str, JSONObject jSONObject) {
        this.f24611a = str;
        this.f24612b = jSONObject;
    }
}
