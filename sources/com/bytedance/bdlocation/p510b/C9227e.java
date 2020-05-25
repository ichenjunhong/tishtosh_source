package com.bytedance.bdlocation.p510b;

import com.bytedance.bdlocation.client.BDLocationConfig;
import com.p683ss.p2544b.p2545a.C51151a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.b.e */
public final class C9227e {

    /* renamed from: a */
    private long f25214a = System.currentTimeMillis();

    /* renamed from: b */
    private long f25215b;

    /* renamed from: c */
    private JSONObject f25216c = new JSONObject();

    /* renamed from: d */
    private JSONObject f25217d = new JSONObject();

    /* renamed from: a */
    public final void mo16676a(boolean z) {
        this.f25215b = System.currentTimeMillis();
        mo16677b("status", Integer.valueOf(z ? 1 : 0));
        mo16677b("total_duration", Long.valueOf(this.f25215b - this.f25214a));
        BDLocationConfig.notifyTraceListener("bd_location_sdk_upload", null, this.f25217d, this.f25216c);
    }

    /* renamed from: a */
    public final void mo16675a(String str, Object obj) {
        try {
            this.f25216c.put(str, obj);
        } catch (JSONException e) {
            if (BDLocationConfig.isDebug()) {
                C51151a.m110020b("BDLocation", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final void mo16677b(String str, Object obj) {
        try {
            this.f25217d.put(str, obj);
        } catch (JSONException e) {
            if (BDLocationConfig.isDebug()) {
                C51151a.m110020b("BDLocation", (Throwable) e);
            }
        }
    }
}
