package com.p683ss.android.ugc.aweme.utils;

import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.k */
public final class C47929k {

    /* renamed from: a */
    public static Map<String, String> f120523a;

    /* renamed from: b */
    public static final C47929k f120524b = new C47929k();

    /* renamed from: c */
    private static int f120525c;

    private C47929k() {
    }

    /* renamed from: a */
    public static String m103704a() {
        Map<String, String> map = f120523a;
        if (map != null) {
            map.isEmpty();
            try {
                int i = f120525c + 1;
                f120525c = i;
                if (i > 5) {
                    f120523a = null;
                    return "";
                }
                String jSONObject = new JSONObject(map).toString();
                C52711k.m112236a((Object) jSONObject, "JSONObject(map).toString()");
                return jSONObject;
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
