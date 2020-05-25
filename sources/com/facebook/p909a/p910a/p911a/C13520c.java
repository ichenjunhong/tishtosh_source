package com.facebook.p909a.p910a.p911a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.a.a.c */
public final class C13520c {

    /* renamed from: a */
    public final String f35286a;

    /* renamed from: b */
    public final int f35287b;

    /* renamed from: c */
    public final int f35288c;

    /* renamed from: d */
    public final String f35289d;

    /* renamed from: e */
    public final String f35290e;

    /* renamed from: f */
    public final String f35291f;

    /* renamed from: g */
    public final String f35292g;

    /* renamed from: h */
    public final int f35293h;

    /* renamed from: com.facebook.a.a.a.c$a */
    public enum C13521a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: a */
        private final int f35296a;

        public final int getValue() {
            return this.f35296a;
        }

        private C13521a(int i) {
            this.f35296a = i;
        }
    }

    C13520c(JSONObject jSONObject) throws JSONException {
        this.f35286a = jSONObject.getString("class_name");
        this.f35287b = jSONObject.optInt("index", -1);
        this.f35288c = jSONObject.optInt("id");
        this.f35289d = jSONObject.optString("text");
        this.f35290e = jSONObject.optString("tag");
        this.f35291f = jSONObject.optString("description");
        this.f35292g = jSONObject.optString("hint");
        this.f35293h = jSONObject.optInt("match_bitmask");
    }
}
