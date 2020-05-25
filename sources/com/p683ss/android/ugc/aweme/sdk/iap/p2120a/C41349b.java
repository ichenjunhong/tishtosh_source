package com.p683ss.android.ugc.aweme.sdk.iap.p2120a;

import com.google.gson.p1076a.C17952c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.a.b */
public final class C41349b {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public int f104845a;
    @C17952c(mo34828a = "iapId")

    /* renamed from: b */
    public String f104846b;
    @C17952c(mo34828a = "price")

    /* renamed from: c */
    public String f104847c;
    @C17952c(mo34828a = "count")

    /* renamed from: d */
    public int f104848d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Diamond{id=");
        sb.append(this.f104845a);
        sb.append(", iapId='");
        sb.append(this.f104846b);
        sb.append('\'');
        sb.append(", price='");
        sb.append(this.f104847c);
        sb.append('\'');
        sb.append(", count='");
        sb.append(this.f104848d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m91123a(C41349b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", bVar.f104845a);
            jSONObject.put("iapId", bVar.f104846b);
            jSONObject.put("price", bVar.f104847c);
            jSONObject.put("count", bVar.f104848d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
