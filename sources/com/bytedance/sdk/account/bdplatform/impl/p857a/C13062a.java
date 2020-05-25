package com.bytedance.sdk.account.bdplatform.impl.p857a;

import com.bytedance.sdk.account.bdplatform.p855b.C13042a;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13047d;
import com.bytedance.sdk.account.bdplatform.p855b.C13048e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a.a */
public final class C13062a {
    /* renamed from: a */
    public static C13042a m26235a(String str) {
        if (str == null) {
            return null;
        }
        C13042a aVar = new C13042a();
        try {
            m26236a(aVar, str);
            if (aVar.f34091e) {
                if (aVar.f34094h != null) {
                    aVar.f34056a = aVar.f34094h.optString("code");
                    return aVar;
                }
                aVar.f34092f = -1;
                return aVar;
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    /* renamed from: b */
    public static C13048e m26237b(String str) {
        if (str == null) {
            return null;
        }
        C13048e eVar = new C13048e();
        try {
            m26236a(eVar, str);
            if (eVar.f34091e) {
                if (eVar.f34094h != null) {
                    eVar.f34095a = eVar.f34094h.optString("ticket");
                    eVar.f34096b = eVar.f34094h.optBoolean("authorized");
                    return eVar;
                }
                eVar.f34092f = -1;
                return eVar;
            }
        } catch (Exception unused) {
        }
        return eVar;
    }

    /* renamed from: c */
    public static C13043b m26238c(String str) {
        if (str == null) {
            return null;
        }
        C13043b bVar = new C13043b();
        try {
            m26236a(bVar, str);
            if (bVar.f34091e) {
                if (bVar.f34094h != null) {
                    bVar.f34057a = bVar.f34094h.optString("client_name");
                    bVar.f34058b = bVar.f34094h.optString("client_icon");
                    JSONArray optJSONArray = bVar.f34094h.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            bVar.f34059c.add(optJSONArray.optString(i));
                        }
                    }
                    JSONObject optJSONObject = bVar.f34094h.optJSONObject("scope_dict");
                    if (optJSONObject != null) {
                        bVar.f34060d = optJSONObject;
                    }
                    return bVar;
                }
                bVar.f34092f = -1;
                return bVar;
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m26236a(C13047d dVar, String str) throws Exception {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                dVar.f34091e = true;
                dVar.f34094h = jSONObject.optJSONObject("data");
                return;
            }
            dVar.f34091e = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                dVar.f34092f = optJSONObject.optInt("error_code");
                dVar.f34093g = optJSONObject.optString("description");
            }
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
