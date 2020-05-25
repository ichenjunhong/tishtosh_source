package com.bytedance.android.live.core.p225d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.b */
public final class C3834b {

    /* renamed from: a */
    public static long f10809a;

    /* renamed from: a */
    public static void m9732a() {
        if (f10809a > 0) {
            long currentTimeMillis = System.currentTimeMillis() - f10809a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cold_start_cost_time", currentTimeMillis);
            } catch (JSONException unused) {
            }
            C3837e.m9749b("ttlive_cold_start_enter_room_all", 0, jSONObject);
            f10809a = 0;
        }
    }
}
