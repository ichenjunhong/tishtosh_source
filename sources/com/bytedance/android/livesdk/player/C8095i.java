package com.bytedance.android.livesdk.player;

import com.bytedance.android.livesdk.player.p405b.C8078a;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.i */
final /* synthetic */ class C8095i implements C8078a {

    /* renamed from: a */
    private final C8091h f22110a;

    C8095i(C8091h hVar) {
        this.f22110a = hVar;
    }

    /* renamed from: a */
    public final void mo14236a(JSONObject jSONObject) {
        C8091h hVar = this.f22110a;
        if (!(hVar.f22087f == null || jSONObject == null)) {
            try {
                for (Entry entry : hVar.f22087f.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        hVar.mo14271b(jSONObject);
        C8097k kVar = hVar.f22086e;
        C8626b a = C8626b.m17014a();
        C8101c cVar = new C8101c(kVar.f22113c, kVar.f22114d, kVar.f22112b, kVar.f22115e, kVar.f22116f, jSONObject);
        a.mo15106a((Callable) cVar);
    }
}
