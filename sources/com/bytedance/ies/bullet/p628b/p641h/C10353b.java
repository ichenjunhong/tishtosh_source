package com.bytedance.ies.bullet.p628b.p641h;

import android.view.View;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.b */
public abstract class C10353b {

    /* renamed from: j */
    public String f27790j;

    /* renamed from: k */
    public boolean f27791k;

    /* renamed from: a */
    public abstract void mo18417a(View view);

    /* renamed from: a */
    public abstract void mo18409a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: b */
    public abstract void mo18419b(View view);

    /* renamed from: g */
    public void mo18420g() {
        this.f27791k = false;
    }

    /* renamed from: a */
    public void mo18418a(String str) {
        C52711k.m112240b(str, "id");
        this.f27790j = str;
        this.f27791k = true;
    }
}
