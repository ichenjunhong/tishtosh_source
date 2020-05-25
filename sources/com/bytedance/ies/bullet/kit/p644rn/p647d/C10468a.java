package com.bytedance.ies.bullet.kit.p644rn.p647d;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.rn.d.a */
public final class C10468a {

    /* renamed from: a */
    public static final C10468a f27870a = new C10468a();

    private C10468a() {
    }

    /* renamed from: a */
    private static JSONArray m21017a(List<? extends Object> list) {
        C52711k.m112240b(list, "list");
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next != null) {
                if (next instanceof List) {
                    jSONArray.put(m21017a((List) next));
                } else if (next instanceof Map) {
                    jSONArray.put(m21018a((Map) next));
                } else if (next instanceof Double) {
                    Number number = (Number) next;
                    long doubleValue = (long) number.doubleValue();
                    if (Double.compare(number.doubleValue(), (double) doubleValue) == 0) {
                        jSONArray.put(doubleValue);
                    } else {
                        jSONArray.put(number.doubleValue());
                    }
                } else {
                    jSONArray.put(next);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m21018a(Map<String, ? extends Object> map) {
        C52711k.m112240b(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                if (value instanceof List) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        jSONObject.put(str, m21017a((List) value2));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                    }
                } else if (value instanceof Map) {
                    String str2 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    if (value3 != null) {
                        jSONObject.put(str2, m21018a((Map) value3));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    }
                } else if (value instanceof Double) {
                    Object value4 = entry.getValue();
                    if (value4 != null) {
                        double doubleValue = ((Double) value4).doubleValue();
                        long j = (long) doubleValue;
                        if (Double.compare(doubleValue, (double) j) == 0) {
                            jSONObject.put((String) entry.getKey(), j);
                        } else {
                            jSONObject.put((String) entry.getKey(), doubleValue);
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Double");
                    }
                } else {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final String mo18536a(Object obj) {
        C52711k.m112240b(obj, "any");
        if (obj instanceof List) {
            String jSONArray = m21017a((List) obj).toString();
            C52711k.m112236a((Object) jSONArray, "convertListToJson(any as List<Any?>).toString()");
            return jSONArray;
        } else if (obj instanceof Map) {
            String jSONObject = m21018a((Map) obj).toString();
            C52711k.m112236a((Object) jSONObject, "convertMapToJson(any as …String, Any?>).toString()");
            return jSONObject;
        } else if (!(obj instanceof Double)) {
            return obj.toString();
        } else {
            Number number = (Number) obj;
            long doubleValue = (long) number.doubleValue();
            if (Double.compare(number.doubleValue(), (double) doubleValue) == 0) {
                return String.valueOf(doubleValue);
            }
            return obj.toString();
        }
    }
}
