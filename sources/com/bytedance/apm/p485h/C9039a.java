package com.bytedance.apm.p485h;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.a */
public class C9039a extends C9042d {

    /* renamed from: a */
    public int f24657a;

    /* renamed from: b */
    public int f24658b;

    /* renamed from: c */
    public long f24659c;

    /* renamed from: d */
    public int f24660d;

    /* renamed from: e */
    public long f24661e;

    public C9039a() {
    }

    /* renamed from: a */
    public final C9042d mo16370a(JSONObject jSONObject) {
        this.f24657a = jSONObject.optInt("front");
        this.f24659c = jSONObject.optLong("sid");
        this.f24658b = jSONObject.optInt("network_type");
        this.f24660d = jSONObject.optInt("hit_rules");
        this.f24661e = jSONObject.optLong("timing_totalSendBytes", 0) + jSONObject.optLong("timing_totalReceivedBytes", 0);
        return super.mo16370a(jSONObject);
    }

    public C9039a(long j, String str, long j2, String str2) {
        super(j, str, j2, str2);
    }

    public C9039a(long j, String str, long j2, JSONObject jSONObject) {
        super(j, str, j2, jSONObject);
    }
}
