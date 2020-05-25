package com.facebook.internal.p979a.p981b;

import com.facebook.internal.p979a.C14270b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.b.a */
public final class C14272a {

    /* renamed from: a */
    public String f37186a;

    /* renamed from: b */
    Long f37187b;

    /* renamed from: c */
    private String f37188c;

    /* renamed from: a */
    public final boolean mo26478a() {
        if (this.f37188c == null || this.f37187b == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSONObject b = m29241b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    /* renamed from: b */
    private JSONObject m29241b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f37187b != null) {
                jSONObject.put("timestamp", this.f37187b);
            }
            jSONObject.put("error_message", this.f37188c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C14272a(File file) {
        this.f37186a = file.getName();
        JSONObject a = C14270b.m29237a(this.f37186a, true);
        if (a != null) {
            this.f37187b = Long.valueOf(a.optLong("timestamp", 0));
            this.f37188c = a.optString("error_message", null);
        }
    }

    public C14272a(String str) {
        this.f37187b = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f37188c = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(this.f37187b);
        stringBuffer.append(".json");
        this.f37186a = stringBuffer.toString();
    }
}
