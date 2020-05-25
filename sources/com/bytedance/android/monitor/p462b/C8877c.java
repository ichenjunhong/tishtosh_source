package com.bytedance.android.monitor.p462b;

import com.bytedance.android.monitor.p461a.C8874e;
import com.bytedance.android.monitor.p463c.C8880a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b.c */
public abstract class C8877c extends C8876b implements C8874e {

    /* renamed from: a */
    String f24184a;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo15875c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    /* renamed from: a */
    public final void mo15874a(String str) {
        this.f24184a = str;
    }

    /* renamed from: a */
    public final void mo15871a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            C8880a.m17464a(jSONObject2, "tag", "ttlive_sdk");
            C8880a.m17464a(jSONObject3, "aid", this.f24184a);
            C8880a.m17463a(jSONObject3, "extra", (Object) jSONObject2);
            mo15875c(str, i, jSONObject, jSONObject3);
        } catch (Exception unused) {
        }
    }
}
