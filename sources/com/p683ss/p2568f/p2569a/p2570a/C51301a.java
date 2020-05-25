package com.p683ss.p2568f.p2569a.p2570a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.a.a */
public final class C51301a extends Error {
    public int code;
    public Map info;
    public long timeStamp = System.currentTimeMillis();

    public final String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public C51301a(int i, String str, Map<String, String> map) {
        super(str);
        this.code = i;
        this.info = map;
    }
}
