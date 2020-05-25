package com.p683ss.android.deviceregister;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.k */
public final class C19048k {

    /* renamed from: a */
    final String f52482a;

    /* renamed from: b */
    final Integer f52483b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JSONObject mo38932a() {
        try {
            return new JSONObject(this.f52482a);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp{timestampPrimaryId=");
        sb.append(this.f52483b);
        sb.append('}');
        return sb.toString();
    }

    C19048k(String str, Integer num) {
        this.f52482a = str;
        this.f52483b = num;
    }

    public C19048k(Map<String, Long> map, Integer num) {
        this.f52482a = new JSONObject(map).toString();
        this.f52483b = num;
    }
}
