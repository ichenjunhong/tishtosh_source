package com.bytedance.sysoptimizer.safereg;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class FieldUtils {
    private static Map<String, Field> sFieldCache = new HashMap();

    public static Field getField(Class<?> cls, String str) {
        return getField(cls, str, true);
    }

    public static Object readField(Field field, Object obj) throws IllegalAccessException {
        return readField(field, obj, true);
    }

    public static Field getField(String str, String str2) {
        try {
            return getField(Class.forName(str), str2, true);
        } catch (Throwable th) {
            ReflectUtils.print(th);
            return null;
        }
    }

    public static Object readStaticField(String str, String str2) throws IllegalAccessException {
        try {
            return readStaticField(Class.forName(str), str2);
        } catch (Throwable th) {
            ReflectUtils.print(th);
            return null;
        }
    }

    private static String getKey(Class<?> cls, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        return sb.toString();
    }

    public static Object readStaticField(Class<?> cls, String str) throws IllegalAccessException {
        boolean z;
        Field field = getField(cls, str, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field '%s' on %s", str, cls);
        return readStaticField(field, true);
    }

    public static Object readField(Object obj, String str) throws IllegalAccessException {
        boolean z;
        boolean z2;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Class cls = obj.getClass();
        Field field = getField(cls, str, true);
        if (field != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "Cannot locate field %s on %s", str, cls);
        return readField(field, obj, false);
    }

    public static Object readStaticField(Field field, boolean z) throws IllegalAccessException {
        boolean z2;
        if (field != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The field must not be null", new Object[0]);
        Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return readField(field, (Object) null, z);
    }

    public static void writeField(Object obj, String str, Object obj2) throws IllegalAccessException {
        writeField(obj, str, obj2, true);
    }

    public static Field getDeclaredField(String str, String str2, boolean z) {
        try {
            return getDeclaredField(Class.forName(str), str2, z);
        } catch (Throwable th) {
            ReflectUtils.print(th);
            return null;
        }
    }

    public static void writeField(Field field, Object obj, Object obj2) throws IllegalAccessException {
        writeField(field, obj, obj2, true);
    }

    public static void writeStaticField(String str, String str2, Object obj) throws IllegalAccessException {
        try {
            writeStaticField(Class.forName(str), str2, obj);
        } catch (Throwable th) {
            ReflectUtils.print(th);
        }
    }

    public static void writeStaticField(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        boolean z;
        Field field = getField(cls, str, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field %s on %s", str, cls);
        writeStaticField(field, obj, true);
    }

    public static Field getDeclaredField(Class<?> cls, String str, boolean z) {
        boolean z2;
        if (cls != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The class must not be null", new Object[0]);
        Validate.isTrue(!ReflectUtils.isEmpty(str), "The field name must not be blank/empty", new Object[0]);
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!MemberUtils.isAccessible(declaredField)) {
                if (!z) {
                    return null;
                }
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static void writeDeclaredField(Object obj, String str, Object obj2) throws IllegalAccessException {
        boolean z;
        boolean z2;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Class cls = obj.getClass();
        Field declaredField = getDeclaredField(cls, str, true);
        if (declaredField != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "Cannot locate declared field %s.%s", cls.getName(), str);
        writeField(declaredField, obj, obj2, false);
    }

    public static void writeStaticField(Field field, Object obj, boolean z) throws IllegalAccessException {
        boolean z2;
        if (field != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The field must not be null", new Object[0]);
        Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        writeField(field, (Object) null, obj, z);
    }

    public static Object readField(Object obj, String str, boolean z) throws IllegalAccessException {
        boolean z2;
        boolean z3;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "target object must not be null", new Object[0]);
        Class cls = obj.getClass();
        Field field = getField(cls, str, z);
        if (field != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Validate.isTrue(z3, "Cannot locate field %s on %s", str, cls);
        return readField(field, obj, z);
    }

    private static Field getField(Class<?> cls, String str, boolean z) {
        boolean z2;
        Field field;
        boolean z3;
        if (cls != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The class must not be null", new Object[0]);
        Validate.isTrue(!ReflectUtils.isEmpty(str), "The field name must not be blank/empty", new Object[0]);
        String key = getKey(cls, str);
        synchronized (sFieldCache) {
            field = (Field) sFieldCache.get(key);
        }
        if (field != null) {
            if (z && !field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!Modifier.isPublic(declaredField.getModifiers())) {
                    if (z) {
                        declaredField.setAccessible(true);
                    } else {
                        continue;
                        cls2 = cls2.getSuperclass();
                    }
                }
                synchronized (sFieldCache) {
                    sFieldCache.put(key, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field2 = null;
        for (Class field3 : ReflectUtils.getAllInterfaces(cls)) {
            try {
                Field field4 = field3.getField(str);
                if (field2 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Validate.isTrue(z3, "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.", str, cls);
                field2 = field4;
            } catch (NoSuchFieldException unused2) {
            }
        }
        synchronized (sFieldCache) {
            sFieldCache.put(key, field2);
        }
        return field2;
    }

    public static Object readField(Field field, Object obj, boolean z) throws IllegalAccessException {
        boolean z2;
        if (field != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The field must not be null", new Object[0]);
        if (!z || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    public static void writeField(Object obj, String str, Object obj2, boolean z) throws IllegalAccessException {
        boolean z2;
        boolean z3;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "target object must not be null", new Object[0]);
        Class cls = obj.getClass();
        Field field = getField(cls, str, true);
        if (field != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Validate.isTrue(z3, "Cannot locate declared field %s.%s", cls.getName(), str);
        writeField(field, obj, obj2, z);
    }

    public static void writeField(Field field, Object obj, Object obj2, boolean z) throws IllegalAccessException {
        boolean z2;
        if (field != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Validate.isTrue(z2, "The field must not be null", new Object[0]);
        if (!z || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }
}
