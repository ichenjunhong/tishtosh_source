package com.p683ss.android.vesdk.p2534d;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.d.a */
public final class C50660a {

    /* renamed from: a */
    private Map<String, String> f127013a = new HashMap();

    /* renamed from: b */
    private StringBuilder f127014b = new StringBuilder();

    /* renamed from: c */
    private boolean f127015c = true;

    /* renamed from: a */
    public final JSONObject mo99063a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f127013a.keySet()) {
                jSONObject.put(str, (String) this.f127013a.get(str));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C50660a mo99062a(String str, String str2) {
        this.f127013a.put(str, str2);
        m109322b(str, str2);
        return this;
    }

    /* renamed from: b */
    private void m109322b(String str, String str2) {
        if (!this.f127015c) {
            this.f127014b.append(",");
        }
        this.f127014b.append("\"");
        this.f127014b.append(str);
        this.f127014b.append("\"");
        this.f127014b.append(":");
        this.f127014b.append("\"");
        this.f127014b.append(str2);
        this.f127014b.append("\"");
        if (this.f127015c) {
            this.f127015c = false;
        }
    }

    /* renamed from: a */
    public final C50660a mo99060a(String str, float f) {
        Map<String, String> map = this.f127013a;
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        map.put(str, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        m109322b(str, sb2.toString());
        return this;
    }

    /* renamed from: a */
    public final C50660a mo99061a(String str, int i) {
        Map<String, String> map = this.f127013a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        map.put(str, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        m109322b(str, sb2.toString());
        return this;
    }
}
