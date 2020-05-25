package com.google.android.gms.internal.ads;

import android.support.p030v4.p038f.C0800n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.tx */
public final class C16279tx implements C16265tj<C15832dj> {

    /* renamed from: a */
    private final boolean f45651a;

    public C16279tx(boolean z) {
        this.f45651a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C15843dt mo31391a(C16256ta taVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        C0800n nVar = new C0800n();
        C0800n nVar2 = new C0800n();
        aga a = taVar.mo31392a(jSONObject);
        aga a2 = taVar.mo31393a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                nVar2.put(jSONObject2.getString(LeakCanaryFileProvider.f132049i), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                String string2 = jSONObject2.getString(LeakCanaryFileProvider.f132049i);
                boolean z = this.f45651a;
                JSONObject jSONObject3 = jSONObject2.getJSONObject("image_value");
                boolean optBoolean = jSONObject3.optBoolean("require", true);
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                nVar.put(string2, taVar.mo31395a(jSONObject3, optBoolean, z));
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                abv.m32798e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        ama a3 = C16256ta.m38811a(a2);
        String string3 = jSONObject.getString("custom_template_id");
        C0800n nVar3 = new C0800n();
        for (int i2 = 0; i2 < nVar.size(); i2++) {
            nVar3.put(nVar.mo2576b(i2), ((Future) nVar.mo2577c(i2)).get());
        }
        C15832dj djVar = new C15832dj(string3, nVar3, nVar2, (C15819cx) a.get(), a3 != null ? a3.mo28936b() : null, a3 != null ? a3.getView() : null);
        return djVar;
    }
}
