package com.bytedance.android.livesdkapi.p458l;

import com.bytedance.android.live.base.p185b.C2953a;
import com.bytedance.android.live.p245d.C4116c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.l.a */
public final class C8833a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f24116a;

    /* renamed from: com.bytedance.android.livesdkapi.l.a$a */
    public static class C8834a<T> {

        /* renamed from: a */
        public final Class<? extends T> f24117a;

        /* renamed from: b */
        public final T f24118b;

        public C8834a(Class<? extends T> cls, T t) {
            this.f24117a = cls;
            this.f24118b = t;
        }
    }

    /* renamed from: a */
    private static Class<?>[] m17342a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C8834a aVar = objArr[i];
            Class cls = (aVar == null || !(aVar instanceof C8834a)) ? aVar == null ? null : aVar.getClass() : aVar.f24117a;
            clsArr[i] = cls;
        }
        return clsArr;
    }

    static {
        HashMap hashMap = new HashMap();
        f24116a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f24116a.put(Byte.class, Byte.TYPE);
        f24116a.put(Character.class, Character.TYPE);
        f24116a.put(Short.class, Short.TYPE);
        f24116a.put(Integer.class, Integer.TYPE);
        f24116a.put(Float.class, Float.TYPE);
        f24116a.put(Long.class, Long.TYPE);
        f24116a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f24116a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f24116a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f24116a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f24116a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f24116a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f24116a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f24116a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f24116a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: b */
    private static Object[] m17344b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C8834a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C8834a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f24118b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    public static <T> T m17334a(Class<?> cls) {
        Object obj;
        try {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            if (declaredConstructors == null || declaredConstructors.length == 0) {
                StringBuilder sb = new StringBuilder("Can't get even one available constructor for ");
                sb.append(cls);
                throw new IllegalArgumentException(sb.toString());
            }
            Constructor constructor = declaredConstructors[0];
            constructor.setAccessible(true);
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes != null) {
                if (parameterTypes.length != 0) {
                    Object[] objArr = new Object[parameterTypes.length];
                    for (int i = 0; i < parameterTypes.length; i++) {
                        Class cls2 = parameterTypes[i];
                        if (!Integer.TYPE.equals(cls2) && !Integer.class.equals(cls2) && !Byte.TYPE.equals(cls2) && !Byte.class.equals(cls2) && !Short.TYPE.equals(cls2) && !Short.class.equals(cls2) && !Long.TYPE.equals(cls2) && !Long.class.equals(cls2) && !Double.TYPE.equals(cls2) && !Double.class.equals(cls2) && !Float.TYPE.equals(cls2)) {
                            if (!Float.class.equals(cls2)) {
                                if (!Boolean.TYPE.equals(cls2)) {
                                    if (!Boolean.class.equals(cls2)) {
                                        if (!Character.TYPE.equals(cls2)) {
                                            if (!Character.class.equals(cls2)) {
                                                obj = null;
                                                objArr[i] = obj;
                                            }
                                        }
                                        obj = Character.valueOf(0);
                                        objArr[i] = obj;
                                    }
                                }
                                obj = Boolean.valueOf(false);
                                objArr[i] = obj;
                            }
                        }
                        obj = Integer.valueOf(0);
                        objArr[i] = obj;
                    }
                    return constructor.newInstance(objArr);
                }
            }
            return constructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m17335a(Class<?> cls, Object... objArr) {
        try {
            Constructor constructor = cls.getConstructor(m17342a(objArr));
            constructor.setAccessible(true);
            return constructor.newInstance(m17344b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m17341a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f24116a.containsKey(clsArr[i]) || !((Class) f24116a.get(clsArr[i])).equals(f24116a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m17340a(Object obj, String str, Object obj2) {
        try {
            m17343b(obj, str, obj2);
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    public static <T> T m17336a(Object obj, String str, Object... objArr) {
        try {
            return m17338a(obj.getClass(), str, (Class<?>[]) m17342a(objArr)).invoke(obj, m17344b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m17343b(Object obj, String str, Object obj2) throws NoSuchFieldException, IllegalAccessException {
        Class cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }

    /* renamed from: a */
    public static <T> T m17337a(String str, String str2, Object... objArr) {
        try {
            return m17338a(Class.forName(str), str2, (Class<?>[]) m17342a(objArr)).invoke(null, m17344b(objArr));
        } catch (Exception e) {
            ((C2953a) C4116c.m10249a(C2953a.class)).mo7595a((Throwable) e, e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static Method m17338a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m17339a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m17339a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m17341a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }
}
