package com.bytedance.apm.p480f;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b */
public final class C9018b {
    /* renamed from: a */
    public static void m17833a(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C8976c.m17747c());
        jSONObject.put("process_name", C8976c.m17745b());
        jSONObject.put("event_type", str);
        jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
