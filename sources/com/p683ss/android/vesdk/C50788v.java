package com.p683ss.android.vesdk;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.v */
public final class C50788v {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f127600a;

    /* renamed from: com.ss.android.vesdk.v$a */
    public static class C50789a<T> {

        /* renamed from: a */
        public final Class<? extends T> f127601a;

        /* renamed from: b */
        public final T f127602b;
    }

    static {
        HashMap hashMap = new HashMap();
        f127600a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f127600a.put(Byte.class, Byte.TYPE);
        f127600a.put(Character.class, Character.TYPE);
        f127600a.put(Short.class, Short.TYPE);
        f127600a.put(Integer.class, Integer.TYPE);
        f127600a.put(Float.class, Float.TYPE);
        f127600a.put(Long.class, Long.TYPE);
        f127600a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f127600a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f127600a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f127600a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f127600a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f127600a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f127600a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f127600a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f127600a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: a */
    private static boolean m109905a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f127600a.containsKey(clsArr[i]) || !((Class) f127600a.get(clsArr[i])).equals(f127600a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static Method m109903a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m109904a(cls.getDeclaredMethods(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a;
            } else if (cls.getSuperclass() != null) {
                cls = cls.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    /* renamed from: a */
    private static Method m109904a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m109905a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    public static <T> T m109902a(String str, String str2, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2;
        Class cls;
        try {
            Class cls2 = Class.forName(str);
            if (objArr == null || objArr.length <= 0) {
                clsArr = null;
            } else {
                clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    C50789a aVar = objArr[i];
                    if (aVar != null && (aVar instanceof C50789a)) {
                        cls = aVar.f127601a;
                    } else if (aVar == null) {
                        cls = null;
                    } else {
                        cls = aVar.getClass();
                    }
                    clsArr[i] = cls;
                }
            }
            Method a = m109903a(cls2, str2, (Class<?>[]) clsArr);
            if (objArr == null || objArr.length <= 0) {
                objArr2 = null;
            } else {
                objArr2 = new Object[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    C50789a aVar2 = objArr[i2];
                    if (aVar2 == null || !(aVar2 instanceof C50789a)) {
                        objArr2[i2] = aVar2;
                    } else {
                        objArr2[i2] = aVar2.f127602b;
                    }
                }
            }
            return a.invoke(null, objArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
