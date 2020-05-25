package com.bytedance.android.p140a.p141a.p148g;

import com.bytedance.android.p140a.p141a.p150i.C2799a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.g.b */
public class C2795b {

    /* renamed from: h */
    public boolean f8388h = true;

    /* renamed from: a */
    public void mo7397a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f8388h = jSONObject.optBoolean("is_enable", true);
            } catch (Throwable th) {
                C2799a.m7954a();
                th.getMessage();
            }
        }
    }
}
