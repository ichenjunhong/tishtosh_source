package com.bytedance.apm.p488k;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.d */
public final class C9079d {

    /* renamed from: a */
    private static C9078c f24806a;

    /* renamed from: b */
    private static C9078c f24807b;

    static {
        C90801 r0 = new C9078c() {
        };
        f24806a = r0;
        f24807b = r0;
    }

    /* renamed from: a */
    public static void m17981a(String str, Object... objArr) {
        if (f24807b != null) {
            JSONObject jSONObject = new JSONObject();
            int length = objArr.length;
            if (length % 2 == 0) {
                int i = 0;
                while (i < length) {
                    try {
                        jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                        i += 2;
                    } catch (JSONException unused) {
                    }
                }
                new String[1][0] = jSONObject.toString();
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
