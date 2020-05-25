package com.bytedance.sysoptimizer.safereg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

class ReflectUtils {
    static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    ReflectUtils() {
    }

    public static void print(Throwable th) {
    }

    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    static Class<?>[] nullToEmpty(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return EMPTY_CLASS_ARRAY;
        }
        return clsArr;
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getAllInterfaces(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    static Object[] nullToEmpty(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return EMPTY_OBJECT_ARRAY;
        }
        return objArr;
    }

    static Class<?>[] toClass(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return EMPTY_CLASS_ARRAY;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                cls = null;
            } else {
                cls = objArr[i].getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    static boolean isSameLength(Object[] objArr, Object[] objArr2) {
        if ((objArr != null || objArr2 == null || objArr2.length <= 0) && ((objArr2 != null || objArr == null || objArr.length <= 0) && (objArr == null || objArr2 == null || objArr.length == objArr2.length))) {
            return true;
        }
        return false;
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class[] interfaces;
        while (cls != null) {
            for (Class cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    getAllInterfaces(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
