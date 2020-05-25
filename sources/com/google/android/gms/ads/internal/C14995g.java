package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.afk;
import com.google.android.gms.internal.ads.afp;
import com.google.android.gms.internal.ads.aga;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.g */
final /* synthetic */ class C14995g implements afk {

    /* renamed from: a */
    static final afk f38708a = new C14995g();

    private C14995g() {
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C14963ax.m30834d().mo28595f().mo28643f(jSONObject.getString("appSettingsJson"));
        }
        return afp.m32820a(null);
    }
}
