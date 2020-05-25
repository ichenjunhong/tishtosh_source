package com.bytedance.p513c.p517d;

import com.bytedance.p513c.C9314e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d.a */
public final class C9303a implements C9312h {

    /* renamed from: a */
    private String f25479a = "bytedcert.dialogSize";

    /* renamed from: a */
    public final String mo16912a(C9314e eVar, C9313i iVar) {
        try {
            JSONObject jSONObject = new JSONObject(iVar.f25494c);
            eVar.mo16919a(jSONObject.getInt("w"), jSONObject.getInt("h"));
        } catch (JSONException unused) {
        }
        return null;
    }
}
