package com.p683ss.android.ugc.aweme.shortvideo.publish;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a */
public final class C44364a {

    /* renamed from: a */
    public static final Map<String, String> f112275a = new LinkedHashMap();

    /* renamed from: b */
    public static final C44364a f112276b = new C44364a();

    private C44364a() {
    }

    /* renamed from: a */
    public static Map<String, String> m97156a() {
        return f112275a;
    }

    /* renamed from: a */
    public static String m97155a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "creation_id";
        if (str == null) {
            str = "";
        }
        jSONObject.put(str3, str);
        String str4 = "title";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str4, str2);
        String jSONObject2 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject2, "JSONObject().apply {\n   …e ?: \"\")\n    }.toString()");
        return jSONObject2;
    }
}
