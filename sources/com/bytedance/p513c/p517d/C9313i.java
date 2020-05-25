package com.bytedance.p513c.p517d;

import com.bytedance.p513c.C9302d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d.i */
public final class C9313i {

    /* renamed from: a */
    String f25492a;

    /* renamed from: b */
    String f25493b;

    /* renamed from: c */
    String f25494c;

    /* renamed from: d */
    String f25495d;

    /* renamed from: e */
    String f25496e;

    /* renamed from: a */
    public static JSONArray m18465a(String str) {
        try {
            return new JSONObject(str).getJSONObject("__params").getJSONObject("data").getJSONArray("data");
        } catch (JSONException unused) {
            return null;
        }
    }

    C9313i(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f25492a = jSONObject.getString("JSSDK");
            this.f25493b = jSONObject.getString("func");
            this.f25494c = jSONObject.getString("params");
            this.f25495d = jSONObject.getString("__msg_type");
            this.f25496e = jSONObject.getString("__callback_id");
            C9302d.m18450a(true, this.f25493b);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static JSONObject m18466a(int i, String str, JSONObject jSONObject, C9313i iVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("func", iVar.f25493b);
        jSONObject2.put("__msg_type", str);
        jSONObject2.put("data", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__params", jSONObject2);
        jSONObject3.put("__callback_id", iVar.f25496e);
        return jSONObject3;
    }

    /* renamed from: a */
    public static String m18464a(int i, String str, String str2, JSONObject jSONObject, String str3) {
        String str4;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", str2);
            jSONObject2.put("data", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str3);
            str4 = jSONObject3.toString();
        } catch (JSONException unused) {
            str4 = null;
        }
        C9302d.m18450a(false, str);
        return str4;
    }
}
