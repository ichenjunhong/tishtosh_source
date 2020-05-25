package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.x */
public final class C14365x {

    /* renamed from: a */
    static final ConcurrentHashMap<String, JSONObject> f37364a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m29467a(String str) {
        return (JSONObject) f37364a.get(str);
    }
}
