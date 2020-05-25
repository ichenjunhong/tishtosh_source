package com.bytedance.android.livesdk.p399o;

import com.bytedance.android.live.core.p225d.C3837e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.o.h */
public final class C8069h {

    /* renamed from: a */
    private JSONObject f22047a = new JSONObject();

    /* renamed from: b */
    private JSONObject f22048b = new JSONObject();

    /* renamed from: a */
    public final C8069h mo14226a(JSONObject jSONObject) {
        this.f22048b = jSONObject;
        return this;
    }

    /* renamed from: b */
    public final C8069h mo14229b(JSONObject jSONObject) {
        this.f22047a = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final void mo14227a(String str) {
        mo14228a(str, 0);
    }

    /* renamed from: a */
    public final C8069h mo14224a(String str, float f) {
        try {
            this.f22047a.put(str, (double) f);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C8069h mo14225a(String str, Object obj) {
        try {
            this.f22048b.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final void mo14228a(String str, int i) {
        C3837e.m9745a(str, i, this.f22047a, this.f22048b);
    }
}
