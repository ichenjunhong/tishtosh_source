package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xi */
public final class C16372xi extends C16374xk {

    /* renamed from: a */
    final Context f45959a;

    /* renamed from: b */
    SharedPreferences f45960b;

    /* renamed from: c */
    private final Object f45961c = new Object();

    /* renamed from: d */
    private final C16095nb<JSONObject, JSONObject> f45962d;

    public C16372xi(Context context, C16095nb<JSONObject, JSONObject> nbVar) {
        this.f45959a = context.getApplicationContext();
        this.f45962d = nbVar;
    }

    /* renamed from: a */
    public final aga<Void> mo31467a() {
        synchronized (this.f45961c) {
            if (this.f45960b == null) {
                this.f45960b = C35807d.m80935a(this.f45959a, "google_ads_flags_meta", 0);
            }
        }
        if (C14963ax.m30837g().mo28523a() - this.f45960b.getLong("js_last_update", 0) < ((Long) caf.m37099d().mo30717a(C15740bx.f44275bI)).longValue()) {
            return afp.m32820a(null);
        }
        return afp.m32823a(this.f45962d.mo31188b(m39000a(this.f45959a)), (afl<A, B>) new C16373xj<A,B>(this), agf.f40431b);
    }

    /* renamed from: a */
    private static JSONObject m39000a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbgz.m39278a().f46237a);
            jSONObject.put("mf", caf.m37099d().mo30717a(C15740bx.f44276bJ));
            jSONObject.put("cl", "235029740");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 11140);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m32339b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
