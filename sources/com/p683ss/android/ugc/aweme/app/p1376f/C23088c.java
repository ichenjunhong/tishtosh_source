package com.p683ss.android.ugc.aweme.app.p1376f;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f.c */
public final class C23088c {

    /* renamed from: a */
    public HashMap<String, Object> f61490a = new HashMap<>();

    /* renamed from: a */
    public static C23088c m56631a() {
        return new C23088c();
    }

    /* renamed from: b */
    public final JSONObject mo47825b() {
        try {
            return new JSONObject(this.f61490a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C23088c m56632a(JSONObject jSONObject) {
        C23088c a = m56631a();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    a.mo47824a(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C23088c mo47819a(String str, Boolean bool) {
        this.f61490a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C23088c mo47820a(String str, Double d) {
        this.f61490a.put(str, d);
        return this;
    }

    /* renamed from: a */
    public final C23088c mo47821a(String str, Float f) {
        this.f61490a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C23088c mo47822a(String str, Integer num) {
        this.f61490a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C23088c mo47823a(String str, Long l) {
        this.f61490a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C23088c mo47824a(String str, String str2) {
        this.f61490a.put(str, str2);
        return this;
    }
}
