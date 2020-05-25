package com.bytedance.crash.p549i;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.i.a */
public final class C9607a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f26201a;

    /* renamed from: com.bytedance.crash.i.a$a */
    public static class C9608a<T> {

        /* renamed from: a */
        public final Class<? extends T> f26202a;

        /* renamed from: b */
        public final T f26203b;
    }

    static {
        HashMap hashMap = new HashMap();
        f26201a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f26201a.put(Byte.class, Byte.TYPE);
        f26201a.put(Character.class, Character.TYPE);
        f26201a.put(Short.class, Short.TYPE);
        f26201a.put(Integer.class, Integer.TYPE);
        f26201a.put(Float.class, Float.TYPE);
        f26201a.put(Long.class, Long.TYPE);
        f26201a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f26201a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f26201a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f26201a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f26201a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f26201a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f26201a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f26201a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f26201a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: a */
    private static boolean m19123a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f26201a.containsKey(clsArr[i]) || !((Class) f26201a.get(clsArr[i])).equals(f26201a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static Method m19121a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m19122a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m19122a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m19123a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    public static <T> T m19120a(String str, String str2, Object... objArr) {
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
                    C9608a aVar = objArr[i];
                    if (aVar != null && (aVar instanceof C9608a)) {
                        cls = aVar.f26202a;
                    } else if (aVar == null) {
                        cls = null;
                    } else {
                        cls = aVar.getClass();
                    }
                    clsArr[i] = cls;
                }
            }
            Method a = m19121a(cls2, str2, (Class<?>[]) clsArr);
            if (objArr == null || objArr.length <= 0) {
                objArr2 = null;
            } else {
                objArr2 = new Object[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    C9608a aVar2 = objArr[i2];
                    if (aVar2 == null || !(aVar2 instanceof C9608a)) {
                        objArr2[i2] = aVar2;
                    } else {
                        objArr2[i2] = aVar2.f26203b;
                    }
                }
            }
            return a.invoke(null, objArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
