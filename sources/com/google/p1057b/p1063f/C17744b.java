package com.google.p1057b.p1063f;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.b.f.b */
public final class C17744b {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f49477a;

    /* renamed from: b */
    public static final Map<Class<?>, Class<?>> f49478b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m43561a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m43561a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m43561a(hashMap, hashMap2, Character.TYPE, Character.class);
        m43561a(hashMap, hashMap2, Double.TYPE, Double.class);
        m43561a(hashMap, hashMap2, Float.TYPE, Float.class);
        m43561a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m43561a(hashMap, hashMap2, Long.TYPE, Long.class);
        m43561a(hashMap, hashMap2, Short.TYPE, Short.class);
        m43561a(hashMap, hashMap2, Void.TYPE, Void.class);
        f49477a = Collections.unmodifiableMap(hashMap);
        f49478b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m43561a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
