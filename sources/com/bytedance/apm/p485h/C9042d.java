package com.bytedance.apm.p485h;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.d */
public class C9042d {

    /* renamed from: f */
    public long f24681f;

    /* renamed from: g */
    public String f24682g;

    /* renamed from: h */
    public String f24683h;

    /* renamed from: i */
    public JSONObject f24684i;

    /* renamed from: j */
    public long f24685j;

    /* renamed from: k */
    public long f24686k;

    /* renamed from: l */
    public boolean f24687l;

    public C9042d() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalLog{id=");
        sb.append(this.f24681f);
        sb.append(", type='");
        sb.append(this.f24682g);
        sb.append('\'');
        sb.append(", type2='");
        sb.append(this.f24683h);
        sb.append('\'');
        sb.append(", data='");
        sb.append(this.f24684i);
        sb.append('\'');
        sb.append(", versionId=");
        sb.append(this.f24685j);
        sb.append(", createTime=");
        sb.append(this.f24686k);
        sb.append(", isSampled=");
        sb.append(this.f24687l);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C9042d mo16373a(String str) {
        this.f24682g = str;
        return this;
    }

    /* renamed from: a */
    public C9042d mo16370a(JSONObject jSONObject) {
        this.f24684i = jSONObject;
        return this;
    }

    public C9042d(long j, String str, long j2, JSONObject jSONObject) {
        this.f24681f = j;
        this.f24682g = str;
        this.f24684i = jSONObject;
        this.f24685j = j2;
    }

    public C9042d(long j, String str, long j2, String str2) {
        this.f24681f = j;
        this.f24682g = str;
        try {
            this.f24684i = new JSONObject(str2);
        } catch (Exception unused) {
        }
        this.f24685j = j2;
    }
}
