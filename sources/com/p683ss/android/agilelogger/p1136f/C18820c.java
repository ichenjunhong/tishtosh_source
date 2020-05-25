package com.p683ss.android.agilelogger.p1136f;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.agilelogger.f.c */
public final class C18820c {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f52001a;

    /* renamed from: com.ss.android.agilelogger.f.c$a */
    public static class C18821a<T> {

        /* renamed from: a */
        public final Class<? extends T> f52002a;

        /* renamed from: b */
        public final T f52003b;
    }

    static {
        HashMap hashMap = new HashMap();
        f52001a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f52001a.put(Byte.class, Byte.TYPE);
        f52001a.put(Character.class, Character.TYPE);
        f52001a.put(Short.class, Short.TYPE);
        f52001a.put(Integer.class, Integer.TYPE);
        f52001a.put(Float.class, Float.TYPE);
        f52001a.put(Long.class, Long.TYPE);
        f52001a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f52001a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f52001a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f52001a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f52001a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f52001a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f52001a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f52001a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f52001a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: a */
    private static boolean m45909a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f52001a.containsKey(clsArr[i]) || !((Class) f52001a.get(clsArr[i])).equals(f52001a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static Method m45907a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m45908a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m45908a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m45909a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    public static <T> T m45906a(String str, String str2, Object... objArr) {
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
                    C18821a aVar = objArr[i];
                    if (aVar != null && (aVar instanceof C18821a)) {
                        cls = aVar.f52002a;
                    } else if (aVar == null) {
                        cls = null;
                    } else {
                        cls = aVar.getClass();
                    }
                    clsArr[i] = cls;
                }
            }
            Method a = m45907a(cls2, str2, (Class<?>[]) clsArr);
            if (objArr == null || objArr.length <= 0) {
                objArr2 = null;
            } else {
                objArr2 = new Object[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    C18821a aVar2 = objArr[i2];
                    if (aVar2 == null || !(aVar2 instanceof C18821a)) {
                        objArr2[i2] = aVar2;
                    } else {
                        objArr2[i2] = aVar2.f52003b;
                    }
                }
            }
            return a.invoke(null, objArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
