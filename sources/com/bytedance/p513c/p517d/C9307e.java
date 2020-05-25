package com.bytedance.p513c.p517d;

import com.bytedance.p513c.C9314e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d.e */
public final class C9307e implements C9312h {

    /* renamed from: a */
    private String f25483a = "bytedcert.verifyResult";

    /* renamed from: a */
    public final String mo16912a(C9314e eVar, C9313i iVar) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(iVar.f25494c);
            i2 = jSONObject.optInt("result");
            try {
                str4 = jSONObject.optString("mode");
                try {
                    str3 = jSONObject.optString("type");
                } catch (JSONException unused) {
                    str3 = null;
                    str2 = str3;
                    i = i2;
                    str = null;
                    eVar.mo16921a(i, str4, str3, str2, str);
                    return null;
                }
                try {
                    str2 = jSONObject.optString("token");
                } catch (JSONException unused2) {
                    str2 = null;
                    i = i2;
                    str = null;
                    eVar.mo16921a(i, str4, str3, str2, str);
                    return null;
                }
                try {
                    i = i2;
                    str = jSONObject.optString("mobile");
                } catch (JSONException unused3) {
                    i = i2;
                    str = null;
                    eVar.mo16921a(i, str4, str3, str2, str);
                    return null;
                }
            } catch (JSONException unused4) {
                str4 = null;
                str3 = null;
                str2 = str3;
                i = i2;
                str = null;
                eVar.mo16921a(i, str4, str3, str2, str);
                return null;
            }
        } catch (JSONException unused5) {
            i2 = 0;
            str4 = null;
            str3 = null;
            str2 = str3;
            i = i2;
            str = null;
            eVar.mo16921a(i, str4, str3, str2, str);
            return null;
        }
        eVar.mo16921a(i, str4, str3, str2, str);
        return null;
    }
}
