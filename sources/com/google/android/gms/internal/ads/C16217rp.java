package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rp */
public class C16217rp {

    /* renamed from: a */
    private final String f45516a;

    /* renamed from: q */
    final ama f45517q;

    public C16217rp(ama ama) {
        this(ama, "");
    }

    public C16217rp(ama ama, String str) {
        this.f45517q = ama;
        this.f45516a = str;
    }

    /* renamed from: a */
    public final void mo31366a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f45516a);
            if (this.f45517q != null) {
                this.f45517q.mo29243a("onError", put);
            }
        } catch (JSONException e) {
            abv.m32793b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: a */
    public final void mo31364a(int i, int i2, int i3, int i4) {
        try {
            this.f45517q.mo29243a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            abv.m32793b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: b */
    public final void mo31367b(String str) {
        try {
            this.f45517q.mo29243a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            abv.m32793b("Error occured while dispatching state change.", e);
        }
    }

    /* renamed from: a */
    public final void mo31365a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f45517q.mo29243a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            abv.m32793b("Error occured while obtaining screen information.", e);
        }
    }
}
