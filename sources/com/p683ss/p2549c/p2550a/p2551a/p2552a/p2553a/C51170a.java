package com.p683ss.p2549c.p2550a.p2551a.p2552a.p2553a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.c.a.a.a.a.a */
public final class C51170a {

    /* renamed from: a */
    public String f127805a;

    /* renamed from: b */
    public int f127806b = 300;

    /* renamed from: c */
    public boolean f127807c;

    /* renamed from: d */
    public boolean f127808d;

    /* renamed from: e */
    private int f127809e;

    /* renamed from: f */
    private String f127810f;

    /* renamed from: g */
    private JSONObject f127811g;

    /* renamed from: a */
    public final Set<String> mo101705a() {
        HashSet hashSet = new HashSet();
        if (this.f127809e == 0 && this.f127811g != null && this.f127811g.length() > 0) {
            Iterator keys = this.f127811g.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str != null && !str.equals("")) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final List<String> mo101704a(String str) {
        if (this.f127809e == 0 && this.f127811g != null && this.f127811g.length() > 0) {
            try {
                ArrayList arrayList = new ArrayList();
                if (this.f127811g.has(str)) {
                    JSONArray jSONArray = this.f127811g.getJSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public C51170a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f127809e = jSONObject.getInt("StatusCode");
                this.f127810f = jSONObject.getString("StatusMessage");
                if (this.f127809e == 0) {
                    this.f127811g = jSONObject.getJSONObject("IpMap");
                    this.f127805a = jSONObject.getString("Symbol");
                }
                this.f127806b = jSONObject.getInt("DnsTTL");
                this.f127807c = jSONObject.getBoolean("EnableIpSettings");
                this.f127808d = jSONObject.getBoolean("EnablePing");
            } catch (JSONException unused) {
            }
        }
    }
}
