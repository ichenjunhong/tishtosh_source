package com.p683ss.android.p1103ad.splash.core.p1114c;

import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.f */
public final class C18608f {

    /* renamed from: a */
    public List<String> f51372a;

    /* renamed from: b */
    public int f51373b;

    /* renamed from: c */
    public int f51374c;

    /* renamed from: d */
    public String f51375d;

    /* renamed from: a */
    public final boolean mo38008a() {
        if (this.f51373b <= 0 || this.f51374c <= 0 || C18740f.m45691a(this.f51372a) || C18747l.m45742a(this.f51375d)) {
            return false;
        }
        String str = (String) this.f51372a.get(0);
        if (C18747l.m45742a(str) && this.f51372a.size() >= 2) {
            str = (String) this.f51372a.get(1);
            if (C18747l.m45742a(str) && this.f51372a.size() >= 3) {
                str = (String) this.f51372a.get(2);
            }
        }
        if (!C18747l.m45742a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C18608f m45082a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!C18747l.m45742a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        if (C18747l.m45742a(optString2)) {
            return null;
        }
        return new C18608f(arrayList, optInt, optInt2, optString2);
    }

    private C18608f(List<String> list, int i, int i2, String str) {
        this.f51372a = list;
        this.f51373b = i;
        this.f51374c = i2;
        this.f51375d = str;
    }
}
