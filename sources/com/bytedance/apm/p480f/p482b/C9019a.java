package com.bytedance.apm.p480f.p482b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.p480f.C9026c;
import com.bytedance.apm.p480f.C9028d;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b.a */
public final class C9019a implements C9028d {

    /* renamed from: a */
    public String f24593a;

    /* renamed from: b */
    public long f24594b;

    /* renamed from: c */
    public long f24595c;

    /* renamed from: d */
    public String f24596d;

    /* renamed from: e */
    public String f24597e;

    /* renamed from: f */
    public String f24598f;

    /* renamed from: g */
    public int f24599g;

    /* renamed from: h */
    public JSONObject f24600h;

    /* renamed from: a */
    public final boolean mo16348a(C9026c cVar) {
        return false;
    }

    /* renamed from: b */
    public final String mo16349b() {
        return null;
    }

    /* renamed from: c */
    public final String mo16350c() {
        return null;
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
        if (TextUtils.isEmpty(this.f24593a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f24593a);
            jSONObject.put("duration", this.f24594b);
            jSONObject.put("uri", Uri.parse(this.f24596d));
            if (this.f24595c > 0) {
                jSONObject.put("timestamp", this.f24595c);
            }
            jSONObject.put("status", this.f24599g);
            if (!TextUtils.isEmpty(this.f24597e)) {
                jSONObject.put("ip", this.f24597e);
            }
            if (!TextUtils.isEmpty(this.f24598f)) {
                jSONObject.put("trace_code", this.f24598f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public C9019a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.f24593a = str;
        this.f24594b = j;
        this.f24595c = j2;
        this.f24596d = str2;
        this.f24597e = str3;
        this.f24598f = str4;
        this.f24599g = i;
        if (jSONObject == null) {
            this.f24600h = new JSONObject();
        } else {
            this.f24600h = jSONObject;
        }
    }
}
