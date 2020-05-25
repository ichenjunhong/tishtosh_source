package com.facebook.p909a.p910a.p911a;

import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.a.a.b */
public final class C13519b {

    /* renamed from: a */
    public final String f35282a;

    /* renamed from: b */
    public final String f35283b;

    /* renamed from: c */
    public final List<C13520c> f35284c;

    /* renamed from: d */
    public final String f35285d;

    public C13519b(JSONObject jSONObject) throws JSONException {
        this.f35282a = jSONObject.getString(LeakCanaryFileProvider.f132049i);
        this.f35283b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(LeakCanaryFileProvider.f132050j);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C13520c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f35284c = arrayList;
        this.f35285d = jSONObject.optString("path_type", "absolute");
    }
}
