package com.bytedance.p513c.p517d;

import com.bytedance.p513c.C9314e;
import com.bytedance.p513c.C9328j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d.d */
public final class C9306d implements C9312h {

    /* renamed from: a */
    private String f25482a = "bytedcert.pageEnd";

    /* renamed from: a */
    public final String mo16912a(C9314e eVar, C9313i iVar) {
        Object obj;
        eVar.mo16922b();
        try {
            obj = new JSONObject(iVar.f25494c).optJSONObject("log").optJSONArray("data");
        } catch (NullPointerException | JSONException unused) {
            obj = null;
        }
        C9328j.m18487a().mo16941a(6, obj);
        return null;
    }
}
