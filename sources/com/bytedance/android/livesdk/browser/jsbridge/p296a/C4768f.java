package com.bytedance.android.livesdk.browser.jsbridge.p296a;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.a.f */
public class C4768f {

    /* renamed from: a */
    private JSONObject f12976a;

    /* renamed from: a */
    public final Set<C8629a> mo10591a() {
        HashSet hashSet = new HashSet();
        if (this.f12976a == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = this.f12976a.getJSONArray("type_list");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                C8629a[] values = C8629a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C8629a aVar = values[i2];
                    if (aVar.getWsMethod().equals(string)) {
                        hashSet.add(aVar);
                        break;
                    }
                    i2++;
                }
            }
        } catch (JSONException unused) {
        }
        return hashSet;
    }

    public C4768f(JSONObject jSONObject) {
        this.f12976a = jSONObject;
    }
}
