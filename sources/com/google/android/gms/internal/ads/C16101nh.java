package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nh */
final /* synthetic */ class C16101nh implements C16097nd {

    /* renamed from: a */
    static final C16097nd f45248a = new C16101nh();

    private C16101nh() {
    }

    /* renamed from: a */
    public final Object mo31191a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(C16100ng.f45245a));
    }
}
