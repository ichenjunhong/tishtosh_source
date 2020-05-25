package com.bytedance.sysoptimizer.safereg;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

class MemberUtils {
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap;
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap();

    MemberUtils() {
    }

    private static boolean isPackageAccess(int i) {
        return (i & 7) == 0;
    }

    static {
        HashMap hashMap = new HashMap();
        primitiveWrapperMap = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        primitiveWrapperMap.put(Byte.TYPE, Byte.class);
        primitiveWrapperMap.put(Character.TYPE, Character.class);
        primitiveWrapperMap.put(Short.TYPE, Short.class);
        primitiveWrapperMap.put(Integer.TYPE, Integer.class);
        primitiveWrapperMap.put(Long.TYPE, Long.class);
        primitiveWrapperMap.put(Double.TYPE, Double.class);
        primitiveWrapperMap.put(Float.TYPE, Float.class);
        Map<Class<?>, Class<?>> map = primitiveWrapperMap;
        Class cls = Void.TYPE;
        map.put(cls, cls);
        for (Class cls2 : primitiveWrapperMap.keySet()) {
            Class cls3 = (Class) primitiveWrapperMap.get(cls2);
            if (!cls2.equals(cls3)) {
                wrapperPrimitiveMap.put(cls3, cls2);
            }
        }
    }

    static Class<?> wrapperToPrimitive(Class<?> cls) {
        return (Class) wrapperPrimitiveMap.get(cls);
    }

    static boolean isAccessible(Member member) {
        if (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) {
            return false;
        }
        return true;
    }

    static Class<?> primitiveToWrapper(Class<?> cls) {
        if (cls == null || !cls.isPrimitive()) {
            return cls;
        }
        return (Class) primitiveWrapperMap.get(cls);
    }

    static boolean setAccessibleWorkaround(AccessibleObject accessibleObject) {
        if (accessibleObject == null || accessibleObject.isAccessible()) {
            return false;
        }
        Member member = (Member) accessibleObject;
        if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && isPackageAccess(member.getDeclaringClass().getModifiers())) {
            try {
                accessibleObject.setAccessible(true);
                return true;
            } catch (SecurityException unused) {
            }
        }
        return false;
    }

    static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        return isAssignable(cls, cls2, true);
    }

    private static float getTotalTransformationCost(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            f += getObjectTransformationCost(clsArr[i], clsArr2[i]);
        }
        return f;
    }

    private static float getObjectTransformationCost(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return getPrimitivePromotionCost(cls, cls2);
        }
        float f = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && isAssignable(cls, cls2)) {
                    f += 0.25f;
                    break;
                }
                f += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        if (cls == null) {
            f += 1.5f;
        }
        return f;
    }

    private static float getPrimitivePromotionCost(Class<?> cls, Class<?> cls2) {
        float f;
        if (!cls.isPrimitive()) {
            cls = wrapperToPrimitive(cls);
            f = 0.1f;
        } else {
            f = 0.0f;
        }
        int i = 0;
        while (cls != cls2 && i < ORDERED_PRIMITIVE_TYPES.length) {
            if (cls == ORDERED_PRIMITIVE_TYPES[i]) {
                f += 0.1f;
                if (i < ORDERED_PRIMITIVE_TYPES.length - 1) {
                    cls = ORDERED_PRIMITIVE_TYPES[i + 1];
                }
            }
            i++;
        }
        return f;
    }

    static int compareParameterTypes(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float totalTransformationCost = getTotalTransformationCost(clsArr3, clsArr);
        float totalTransformationCost2 = getTotalTransformationCost(clsArr3, clsArr2);
        if (totalTransformationCost < totalTransformationCost2) {
            return -1;
        }
        if (totalTransformationCost2 < totalTransformationCost) {
            return 1;
        }
        return 0;
    }

    static boolean isAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!ReflectUtils.isSameLength(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = ReflectUtils.EMPTY_CLASS_ARRAY;
        }
        if (clsArr2 == null) {
            clsArr2 = ReflectUtils.EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!isAssignable(clsArr[i], clsArr2[i], z)) {
                return false;
            }
        }
        return true;
    }

    static boolean isAssignable(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls != null) {
            if (z) {
                if (cls.isPrimitive() && !cls2.isPrimitive()) {
                    cls = primitiveToWrapper(cls);
                    if (cls == null) {
                        return false;
                    }
                }
                if (cls2.isPrimitive() && !cls.isPrimitive()) {
                    cls = wrapperToPrimitive(cls);
                    if (cls == null) {
                        return false;
                    }
                }
            }
            if (cls.equals(cls2)) {
                return true;
            }
            if (!cls.isPrimitive()) {
                return cls2.isAssignableFrom(cls);
            }
            if (!cls2.isPrimitive()) {
                return false;
            }
            if (Integer.TYPE.equals(cls)) {
                if (Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Long.TYPE.equals(cls)) {
                if (Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                return false;
            } else {
                if (Float.TYPE.equals(cls)) {
                    return Double.TYPE.equals(cls2);
                }
                if (Character.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (Short.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (!Byte.TYPE.equals(cls)) {
                    return false;
                } else {
                    if (Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (!cls2.isPrimitive()) {
            return true;
        } else {
            return false;
        }
    }
}
