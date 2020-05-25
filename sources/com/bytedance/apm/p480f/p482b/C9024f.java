package com.bytedance.apm.p480f.p482b;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p489l.C9111g;
import com.bytedance.apm.p501q.C9185g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.f */
public final class C9024f implements C9028d {

    /* renamed from: a */
    public String f24616a;

    /* renamed from: b */
    public String f24617b;

    /* renamed from: c */
    public boolean f24618c;

    /* renamed from: d */
    public JSONObject f24619d;

    /* renamed from: e */
    public JSONObject f24620e;

    /* renamed from: f */
    public JSONObject f24621f;

    public C9024f() {
    }

    /* renamed from: b */
    public final String mo16349b() {
        return "performance_monitor";
    }

    /* renamed from: c */
    public final String mo16350c() {
        return this.f24616a;
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
            if (this.f24621f == null) {
                this.f24621f = new JSONObject();
            }
            this.f24621f.put("log_type", "performance_monitor");
            this.f24621f.put("service", this.f24616a);
            if (!C9185g.m18238c(this.f24619d)) {
                this.f24621f.put("extra_values", this.f24619d);
            }
            if (TextUtils.equals("start", this.f24616a) && TextUtils.equals("from", this.f24621f.optString("monitor-plugin"))) {
                if (this.f24620e == null) {
                    this.f24620e = new JSONObject();
                }
                this.f24620e.put("start_mode", C8976c.m17750f());
            }
            if (!C9185g.m18238c(this.f24619d)) {
                this.f24621f.put("extra_status", this.f24620e);
            }
            return this.f24621f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C9024f mo16354a(String str) {
        this.f24616a = str;
        return this;
    }

    /* renamed from: b */
    public final C9024f mo16356b(String str) {
        this.f24617b = str;
        return this;
    }

    /* renamed from: a */
    public final C9024f mo16355a(JSONObject jSONObject) {
        this.f24619d = jSONObject;
        return this;
    }

    /* renamed from: b */
    public final C9024f mo16357b(JSONObject jSONObject) {
        this.f24620e = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        boolean z;
        if ("fps".equals(this.f24616a) || "fps_drop".equals(this.f24616a)) {
            z = C9111g.m18066a().mo16478a(this.f24616a, this.f24617b);
        } else if ("temperature".equals(this.f24616a)) {
            z = C9111g.m18066a().mo16479b(this.f24616a);
        } else if ("battery".equals(this.f24616a)) {
            z = true;
        } else {
            z = C9111g.m18066a().mo16477a(this.f24616a);
        }
        if (this.f24618c || z) {
            return true;
        }
        return false;
    }

    public C9024f(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, "", false, null, null, jSONObject3);
    }

    public C9024f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, false, jSONObject, jSONObject2, jSONObject3);
    }

    public C9024f(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f24616a = str;
        this.f24617b = str2;
        this.f24618c = false;
        this.f24619d = jSONObject;
        this.f24620e = jSONObject2;
        this.f24621f = jSONObject3;
    }
}
