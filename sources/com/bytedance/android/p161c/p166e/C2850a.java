package com.bytedance.android.p161c.p166e;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.c.e.a */
public final class C2850a {

    /* renamed from: a */
    private static Map<String, Method> f8482a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, Map<String, Method>> f8483b = new HashMap();

    /* renamed from: c */
    private static Map<Class<?>, Map<String, Field>> f8484c = new HashMap();

    /* renamed from: a */
    private static Method m8138a(String str) {
        Method method = (Method) f8482a.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = Class.class.getDeclaredMethod(str, new Class[0]);
            try {
                f8482a.put(str, declaredMethod);
            } catch (NoSuchMethodException unused) {
            }
            return declaredMethod;
        } catch (NoSuchMethodException unused2) {
            return method;
        }
    }

    /* renamed from: b */
    private static Field m8140b(Class<?> cls, String str) {
        Map map = (Map) f8484c.get(cls);
        if (map != null) {
            return (Field) map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static Field m8137a(Class<?> cls, String str) throws IllegalAccessException, InvocationTargetException {
        Field b = m8140b(cls, str);
        if (b == null) {
            Method a = m8138a("getDeclaredFields");
            if (a != null) {
                int i = 0;
                Field[] fieldArr = (Field[]) a.invoke(cls, new Object[0]);
                int length = fieldArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field = fieldArr[i];
                    if (field.getName().equals(str)) {
                        m8139a(cls, str, field);
                        b = field;
                        break;
                    }
                    i++;
                }
            } else {
                return null;
            }
        }
        return b;
    }

    /* renamed from: a */
    private static void m8139a(Class<?> cls, String str, Field field) {
        Map map = (Map) f8484c.get(cls);
        if (map == null) {
            map = new HashMap();
            f8484c.put(cls, map);
        }
        map.put(str, field);
    }
}
