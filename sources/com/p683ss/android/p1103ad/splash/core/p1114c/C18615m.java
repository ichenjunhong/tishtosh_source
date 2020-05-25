package com.p683ss.android.p1103ad.splash.core.p1114c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.m */
public final class C18615m {

    /* renamed from: a */
    public List<C18616a> f51398a;

    /* renamed from: com.ss.android.ad.splash.core.c.m$a */
    public static class C18616a {

        /* renamed from: a */
        public String f51399a;

        /* renamed from: b */
        public String f51400b;

        /* renamed from: c */
        public String f51401c;

        /* renamed from: a */
        public static C18616a m45100a(JSONObject jSONObject) {
            String optString = jSONObject.optString("vendorKey");
            String optString2 = jSONObject.optString("javaScriptResourceUrl");
            String optString3 = jSONObject.optString("verificationParameters");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                return null;
            }
            return new C18616a(optString, optString2, optString3);
        }

        private C18616a(String str, String str2, String str3) {
            this.f51399a = str;
            this.f51400b = str2;
            this.f51401c = str3;
        }
    }

    private C18615m(List<C18616a> list) {
        this.f51398a = list;
    }

    /* renamed from: a */
    public static C18615m m45099a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("vast");
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("adVerifications");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                C18616a a = C18616a.m45100a(optJSONObject2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return new C18615m(arrayList);
    }
}
