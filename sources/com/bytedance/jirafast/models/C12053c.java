package com.bytedance.jirafast.models;

import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.jirafast.models.c */
public final class C12053c {

    /* renamed from: a */
    public static String f31858a = "AME";

    /* renamed from: b */
    public String f31859b;

    /* renamed from: c */
    public String f31860c;

    /* renamed from: d */
    public String f31861d;

    /* renamed from: e */
    public String f31862e;

    /* renamed from: f */
    public String f31863f;

    /* renamed from: g */
    public String f31864g;

    /* renamed from: h */
    public String f31865h;

    /* renamed from: i */
    public String f31866i;

    /* renamed from: j */
    public List<String> f31867j;

    /* renamed from: k */
    public String f31868k;

    /* renamed from: l */
    public String f31869l;

    /* renamed from: m */
    public List<String> f31870m;

    /* renamed from: b */
    private static String m24510b() {
        return f31858a;
    }

    /* renamed from: a */
    public final JSONObject mo22805a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("key", m24510b());
            jSONObject2.put("project", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            if ("AME".equals(m24510b())) {
                jSONObject4.put(LeakCanaryFileProvider.f132049i, "Bug");
            } else {
                jSONObject4.put(LeakCanaryFileProvider.f132049i, "缺陷");
            }
            jSONObject2.put("issuetype", jSONObject4);
            jSONObject2.put("summary", this.f31859b);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("id", this.f31862e);
            jSONObject2.put("priority", jSONObject5);
            if (this.f31867j != null && !this.f31867j.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f31867j) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(LeakCanaryFileProvider.f132049i, str);
                    jSONArray.put(jSONObject6);
                }
                jSONObject2.put("components", jSONArray);
            }
            if (!this.f31864g.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(LeakCanaryFileProvider.f132049i, this.f31864g);
                jSONArray2.put(jSONObject7);
                jSONObject2.put("versions", jSONArray2);
            }
            if (!this.f31865h.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put(LeakCanaryFileProvider.f132049i, this.f31865h);
                jSONArray3.put(jSONObject8);
                jSONObject2.put("fixVersions", jSONArray3);
            }
            if (this.f31868k != null && !this.f31868k.isEmpty()) {
                jSONObject2.put("customfield_10100", this.f31868k);
            }
            if (this.f31860c != null && !this.f31860c.isEmpty()) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(LeakCanaryFileProvider.f132049i, this.f31860c);
                jSONObject2.put("assignee", jSONObject9);
            }
            if (this.f31861d != null && !this.f31861d.isEmpty()) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(LeakCanaryFileProvider.f132049i, this.f31861d);
                jSONObject2.put("reporter", jSONObject10);
            }
            jSONObject2.put("description", this.f31866i);
            jSONObject.put("fields", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C12053c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list) {
        this.f31859b = str;
        this.f31860c = str2;
        this.f31861d = str3;
        this.f31862e = str4;
        this.f31863f = str5;
        this.f31864g = str6;
        this.f31865h = str7;
        this.f31866i = str9;
        this.f31867j = list;
        this.f31868k = str8;
    }
}
