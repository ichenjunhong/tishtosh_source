package com.bytedance.android.livesdk.feed.p342j;

import com.bytedance.android.live.core.p224c.C3832b;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.j.a */
public final class C7006a extends C3832b {

    /* renamed from: a */
    private static C7006a f19142a;

    private C7006a() {
    }

    /* renamed from: b */
    public static synchronized C7006a m14645b() {
        C7006a aVar;
        synchronized (C7006a.class) {
            if (f19142a == null) {
                f19142a = new C7006a();
            }
            aVar = f19142a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final JSONObject mo9196a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(C6856b.m14400c().mo13049k().getCurUserId()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
