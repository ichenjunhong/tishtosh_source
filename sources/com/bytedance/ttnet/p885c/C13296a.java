package com.bytedance.ttnet.p885c;

import com.bytedance.common.utility.C9431p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.c.a */
public final class C13296a {

    /* renamed from: a */
    public int f34680a;

    /* renamed from: b */
    public String f34681b;

    /* renamed from: c */
    public long f34682c;

    /* renamed from: d */
    public String f34683d = "";

    /* renamed from: e */
    public String f34684e;

    /* renamed from: f */
    public String f34685f;

    /* renamed from: g */
    public String f34686g;

    /* renamed from: h */
    public boolean f34687h;

    /* renamed from: a */
    public final JSONObject mo24909a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.f34680a);
        jSONObject.put("url", this.f34681b);
        jSONObject.put("query_time", this.f34682c);
        if (!this.f34687h) {
            jSONObject.put("raw_sign", this.f34684e);
            jSONObject.put("ss_sign", this.f34685f);
            jSONObject.put("local_sign", this.f34686g);
        }
        if (!C9431p.m18664a(this.f34683d)) {
            jSONObject.put("err_msg", this.f34683d);
        }
        return jSONObject;
    }
}
