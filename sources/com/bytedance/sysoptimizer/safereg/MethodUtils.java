package com.bytedance.sysoptimizer.safereg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MethodUtils {
    private static Map<String, Method> sMethodCache = new HashMap();

    private static <T> Constructor<T> getAccessibleConstructor(Constructor<T> constructor) {
        boolean z;
        if (constructor != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "constructor cannot be null", new Object[0]);
        if (!MemberUtils.isAccessible(constructor) || !isAccessible(constructor.getDeclaringClass())) {
            return null;
        }
        return constructor;
    }

    private static boolean isAccessible(Class<?> cls) {
        while (cls != null) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                return false;
            }
            cls = cls.getEnclosingClass();
        }
        return true;
    }

    private static Method getAccessibleMethod(Method method) {
        if (!MemberUtils.isAccessible(method)) {
            return null;
        }
        Class declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class[] parameterTypes = method.getParameterTypes();
        Method accessibleMethodFromInterfaceNest = getAccessibleMethodFromInterfaceNest(declaringClass, name, parameterTypes);
        if (accessibleMethodFromInterfaceNest == null) {
            accessibleMethodFromInterfaceNest = getAccessibleMethodFromSuperclass(declaringClass, name, parameterTypes);
        }
        return accessibleMethodFromInterfaceNest;
    }

    public static <T> T invokeConstructor(Class<T> cls, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] nullToEmpty = ReflectUtils.nullToEmpty(objArr);
        return invokeConstructor(cls, nullToEmpty, ReflectUtils.toClass(nullToEmpty));
    }

    public static <T> Constructor<T> getMatchingAccessibleConstructor(Class<T> cls, Class<?>... clsArr) {
        boolean z;
        Constructor[] constructors;
        if (cls != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "class cannot be null", new Object[0]);
        try {
            Constructor<T> constructor = cls.getConstructor(clsArr);
            MemberUtils.setAccessibleWorkaround(constructor);
            return constructor;
        } catch (NoSuchMethodException unused) {
            Constructor<T> constructor2 = null;
            for (Constructor constructor3 : cls.getConstructors()) {
                if (MemberUtils.isAssignable(clsArr, (Class<?>[]) constructor3.getParameterTypes(), true)) {
                    Constructor<T> accessibleConstructor = getAccessibleConstructor(constructor3);
                    if (accessibleConstructor != null) {
                        MemberUtils.setAccessibleWorkaround(accessibleConstructor);
                        if (constructor2 == null || MemberUtils.compareParameterTypes(accessibleConstructor.getParameterTypes(), constructor2.getParameterTypes(), clsArr) < 0) {
                            constructor2 = accessibleConstructor;
                        }
                    }
                }
            }
            return constructor2;
        }
    }

    public static Method getAccessibleMethod(String str, String str2, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return getAccessibleMethod(Class.forName(str), str2, clsArr);
        } catch (Throwable th) {
            ReflectUtils.print(th);
            return null;
        }
    }

    public static Object invokeMethod(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] nullToEmpty = ReflectUtils.nullToEmpty(objArr);
        return invokeMethod(obj, str, nullToEmpty, ReflectUtils.toClass(nullToEmpty));
    }

    public static Object invokeStaticMethod(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] nullToEmpty = ReflectUtils.nullToEmpty(objArr);
        return invokeStaticMethod(cls, str, nullToEmpty, (Class<?>[]) ReflectUtils.toClass(nullToEmpty));
    }

    private static Method getAccessibleMethodFromSuperclass(Class<?> cls, String str, Class<?>... clsArr) {
        Class superclass = cls.getSuperclass();
        while (superclass != null) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            } else {
                superclass = superclass.getSuperclass();
            }
        }
        return null;
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        try {
            return invokeStaticMethod(Class.forName(str), str2, objArr);
        } catch (Throwable th) {
            ReflectUtils.print(th);
            return null;
        }
    }

    public static Method getAccessibleMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        String key = getKey(cls, str, clsArr);
        synchronized (sMethodCache) {
            method = (Method) sMethodCache.get(key);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        Method accessibleMethod = getAccessibleMethod(cls.getMethod(str, clsArr));
        synchronized (sMethodCache) {
            sMethodCache.put(key, accessibleMethod);
        }
        return accessibleMethod;
    }

    private static Method getAccessibleMethodFromInterfaceNest(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class[] interfaces = cls.getInterfaces();
            int i = 0;
            while (i < interfaces.length) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method accessibleMethodFromInterfaceNest = getAccessibleMethodFromInterfaceNest(interfaces[i], str, clsArr);
                        if (accessibleMethodFromInterfaceNest != null) {
                            return accessibleMethodFromInterfaceNest;
                        }
                    }
                } else {
                    i++;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static String getKey(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    public static <T> T invokeConstructor(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] nullToEmpty = ReflectUtils.nullToEmpty(objArr);
        Constructor matchingAccessibleConstructor = getMatchingAccessibleConstructor(cls, ReflectUtils.nullToEmpty(clsArr));
        if (matchingAccessibleConstructor != null) {
            return matchingAccessibleConstructor.newInstance(nullToEmpty);
        }
        StringBuilder sb = new StringBuilder("No such accessible constructor on object: ");
        sb.append(cls.getName());
        throw new NoSuchMethodException(sb.toString());
    }

    private static Method getMatchingAccessibleMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method[] methods;
        String key = getKey(cls, str, clsArr);
        synchronized (sMethodCache) {
            method = (Method) sMethodCache.get(key);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method method2 = cls.getMethod(str, clsArr);
            MemberUtils.setAccessibleWorkaround(method2);
            synchronized (sMethodCache) {
                sMethodCache.put(key, method2);
            }
            return method2;
        } catch (NoSuchMethodException unused) {
            Method method3 = null;
            for (Method method4 : cls.getMethods()) {
                if (method4.getName().equals(str) && MemberUtils.isAssignable(clsArr, (Class<?>[]) method4.getParameterTypes(), true)) {
                    Method accessibleMethod = getAccessibleMethod(method4);
                    if (accessibleMethod != null && (method3 == null || MemberUtils.compareParameterTypes(accessibleMethod.getParameterTypes(), method3.getParameterTypes(), clsArr) < 0)) {
                        method3 = accessibleMethod;
                    }
                }
            }
            if (method3 != null) {
                MemberUtils.setAccessibleWorkaround(method3);
            }
            synchronized (sMethodCache) {
                sMethodCache.put(key, method3);
                return method3;
            }
        }
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class[] nullToEmpty = ReflectUtils.nullToEmpty(clsArr);
        Object[] nullToEmpty2 = ReflectUtils.nullToEmpty(objArr);
        Method matchingAccessibleMethod = getMatchingAccessibleMethod(obj.getClass(), str, nullToEmpty);
        if (matchingAccessibleMethod != null) {
            return matchingAccessibleMethod.invoke(obj, nullToEmpty2);
        }
        StringBuilder sb = new StringBuilder("No such accessible method: ");
        sb.append(str);
        sb.append("() on object: ");
        sb.append(obj.getClass().getName());
        throw new NoSuchMethodException(sb.toString());
    }

    public static Object invokeStaticMethod(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class[] nullToEmpty = ReflectUtils.nullToEmpty(clsArr);
        Object[] nullToEmpty2 = ReflectUtils.nullToEmpty(objArr);
        Method matchingAccessibleMethod = getMatchingAccessibleMethod(cls, str, nullToEmpty);
        if (matchingAccessibleMethod != null) {
            return matchingAccessibleMethod.invoke(null, nullToEmpty2);
        }
        StringBuilder sb = new StringBuilder("No such accessible method: ");
        sb.append(str);
        sb.append("() on object: ");
        sb.append(cls.getName());
        throw new NoSuchMethodException(sb.toString());
    }

    public static Object invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        try {
            return invokeStaticMethod(Class.forName(str), str2, objArr, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
