package com.p888c.p889a.p890a.p891a.p893b.p894a;

import com.p888c.p889a.p890a.p891a.p897e.C13424c;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.a.c */
public final class C13393c {

    /* renamed from: a */
    public final boolean f34904a = false;

    /* renamed from: b */
    public final Float f34905b = null;

    /* renamed from: c */
    public final boolean f34906c;

    /* renamed from: d */
    public final C13392b f34907d;

    private C13393c(boolean z, Float f, boolean z2, C13392b bVar) {
        this.f34906c = z2;
        this.f34907d = bVar;
    }

    /* renamed from: a */
    public static C13393c m26997a(boolean z, C13392b bVar) {
        C13426e.m27071a((Object) bVar, "Position is null");
        return new C13393c(false, null, true, bVar);
    }

    /* renamed from: a */
    public final JSONObject mo25088a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f34904a);
            if (this.f34904a) {
                jSONObject.put("skipOffset", this.f34905b);
            }
            jSONObject.put("autoPlay", this.f34906c);
            jSONObject.put("position", this.f34907d);
        } catch (JSONException e) {
            C13424c.m27068a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
