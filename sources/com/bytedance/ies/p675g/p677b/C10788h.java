package com.bytedance.ies.p675g.p677b;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.h */
final class C10788h {

    /* renamed from: a */
    private C10797l f28992a;

    private C10788h(C10797l lVar) {
        this.f28992a = lVar;
    }

    /* renamed from: a */
    static C10788h m21872a(C10797l lVar) {
        return new C10788h(lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> String mo19538a(T t) {
        String str;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f28992a.mo10596a(t);
        }
        m21873a(str);
        return str;
    }

    /* renamed from: a */
    private static void m21873a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            StringBuilder sb = new StringBuilder("Param is not allowed to be List or JSONArray, rawString:\n ");
            sb.append(str);
            C10789i.m21876a(new IllegalArgumentException(sb.toString()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo19537a(String str, Type type) throws JSONException {
        m21873a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f28992a.mo10595a(str, type);
    }
}
