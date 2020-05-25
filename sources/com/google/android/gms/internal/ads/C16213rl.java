package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rl */
public final class C16213rl {

    /* renamed from: a */
    private final boolean f45493a;

    /* renamed from: b */
    private final boolean f45494b;

    /* renamed from: c */
    private final boolean f45495c;

    /* renamed from: d */
    private final boolean f45496d;

    /* renamed from: e */
    private final boolean f45497e;

    private C16213rl(C16215rn rnVar) {
        this.f45493a = rnVar.f45498a;
        this.f45494b = rnVar.f45499b;
        this.f45495c = rnVar.f45500c;
        this.f45496d = rnVar.f45501d;
        this.f45497e = rnVar.f45502e;
    }

    /* renamed from: a */
    public final JSONObject mo31362a() {
        try {
            return new JSONObject().put("sms", this.f45493a).put("tel", this.f45494b).put("calendar", this.f45495c).put("storePicture", this.f45496d).put("inlineVideo", this.f45497e);
        } catch (JSONException e) {
            abv.m32793b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
