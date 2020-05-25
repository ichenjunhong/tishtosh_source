package com.google.gson.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.j */
public final class C18071j {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f50134a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f50135b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m44264a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m44264a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m44264a(hashMap, hashMap2, Character.TYPE, Character.class);
        m44264a(hashMap, hashMap2, Double.TYPE, Double.class);
        m44264a(hashMap, hashMap2, Float.TYPE, Float.class);
        m44264a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m44264a(hashMap, hashMap2, Long.TYPE, Long.class);
        m44264a(hashMap, hashMap2, Short.TYPE, Short.class);
        m44264a(hashMap, hashMap2, Void.TYPE, Void.class);
        f50134a = Collections.unmodifiableMap(hashMap);
        f50135b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m44263a(Class<T> cls) {
        Class<T> cls2 = (Class) f50134a.get(C17982a.m44133a(cls));
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    /* renamed from: a */
    private static void m44264a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
