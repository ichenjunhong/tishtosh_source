package com.bytedance.apm.p493m;

import android.text.TextUtils;
import com.bytedance.apm.p485h.C9043e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.m.b */
public final class C9131b {
    /* renamed from: a */
    public static JSONObject m18119a(JSONObject jSONObject, C9043e eVar) throws JSONException {
        if (eVar == null) {
            return jSONObject;
        }
        if (!TextUtils.isEmpty(eVar.f24689b)) {
            jSONObject.put("version_code", eVar.f24689b);
        }
        if (!TextUtils.isEmpty(eVar.f24690c)) {
            jSONObject.put("version_name", eVar.f24690c);
        }
        if (!TextUtils.isEmpty(eVar.f24691d)) {
            jSONObject.put("manifest_version_code", eVar.f24691d);
        }
        if (!TextUtils.isEmpty(eVar.f24692e)) {
            jSONObject.put("update_version_code", eVar.f24692e);
        }
        if (!TextUtils.isEmpty(eVar.f24693f)) {
            jSONObject.put("app_version", eVar.f24693f);
        }
        return jSONObject;
    }
}
