package com.bytedance.retrofit2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.retrofit2.s */
public class C12796s {

    /* renamed from: A */
    public long f33466A = -1;

    /* renamed from: B */
    public long f33467B = -1;

    /* renamed from: a */
    public int f33468a = -1;

    /* renamed from: b */
    public long f33469b;

    /* renamed from: c */
    public long f33470c;

    /* renamed from: d */
    public long f33471d;

    /* renamed from: e */
    public long f33472e;

    /* renamed from: f */
    public long f33473f;

    /* renamed from: g */
    public long f33474g;

    /* renamed from: h */
    public long f33475h;

    /* renamed from: i */
    public long f33476i;

    /* renamed from: j */
    public long f33477j;

    /* renamed from: k */
    public long f33478k;

    /* renamed from: l */
    public long f33479l;

    /* renamed from: m */
    public long f33480m;

    /* renamed from: n */
    public long f33481n;

    /* renamed from: o */
    public long f33482o;

    /* renamed from: p */
    public long f33483p;

    /* renamed from: q */
    public long f33484q;

    /* renamed from: r */
    public Map<String, Long> f33485r = new HashMap();

    /* renamed from: s */
    public Map<String, Long> f33486s = new HashMap();

    /* renamed from: t */
    public long f33487t = -1;

    /* renamed from: u */
    public long f33488u = -1;

    /* renamed from: v */
    public long f33489v = -1;

    /* renamed from: w */
    public long f33490w = -1;

    /* renamed from: x */
    public long f33491x = -1;

    /* renamed from: y */
    public long f33492y = -1;

    /* renamed from: z */
    public long f33493z = -1;

    public C12796s() {
    }

    /* renamed from: a */
    public final String mo23948a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("base", m25660b());
            jSONObject.put("callback", m25661c());
            jSONObject.put("interceptor", m25662d());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private JSONObject m25660b() {
        boolean a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.f33468a);
            jSONObject.put("createRetrofitTime", this.f33469b);
            jSONObject.put("appRequestStartTime", this.f33470c);
            jSONObject.put("beforeAllInterceptTime", this.f33471d);
            jSONObject.put("callServerInterceptTime", this.f33472e);
            jSONObject.put("reportTime", this.f33473f);
        } catch (JSONException unused) {
        }
        boolean a2 = m25659a(jSONObject, "loadServiceMethod", this.f33474g, this.f33475h, true);
        if (this.f33476i > 0) {
            a = m25659a(jSONObject, "enqueueWait", this.f33476i, this.f33478k, a2);
        } else {
            a = m25659a(jSONObject, "executeWait", this.f33477j, this.f33478k, a2);
        }
        boolean z = a;
        JSONObject jSONObject2 = jSONObject;
        m25659a(jSONObject2, "responseParse", this.f33483p, this.f33484q, m25659a(jSONObject2, "requestParse", this.f33479l, this.f33480m, m25659a(jSONObject2, "executeCall", this.f33481n, this.f33482o, z)));
        return jSONObject;
    }

    /* renamed from: c */
    private JSONObject m25661c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.f33487t);
            jSONObject.put("addCommonParam", this.f33488u);
            jSONObject.put("requestVerify", this.f33489v);
            jSONObject.put("encryptRequest", this.f33490w);
            jSONObject.put("genReqTicket", this.f33491x);
            jSONObject.put("checkReqTicket", this.f33492y);
            jSONObject.put("preCdnVerify", this.f33493z);
            jSONObject.put("postCdnVerify", this.f33466A);
            jSONObject.put("commandListener", this.f33467B);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m25662d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f33485r.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Entry entry : this.f33485r.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.f33486s.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Entry entry2 : this.f33486s.entrySet()) {
                    jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C12796s(long j, long j2) {
        this.f33470c = j;
        this.f33471d = j2;
    }

    /* renamed from: a */
    private static boolean m25659a(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        if (!z || j > j2) {
            jSONObject.put(str, -1);
            return false;
        }
        try {
            jSONObject.put(str, j2 - j);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
