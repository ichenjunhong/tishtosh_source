package com.google.gson.internal.p1079a;

import com.google.gson.C18083m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.a.c */
final class C17985c extends C17984b {

    /* renamed from: a */
    private static Class f49933a;

    /* renamed from: b */
    private final Object f49934b = m44138b();

    /* renamed from: c */
    private final Field f49935c = m44140c();

    C17985c() {
    }

    /* renamed from: c */
    private static Field m44140c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Object m44138b() {
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            f49933a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo34921a(AccessibleObject accessibleObject) {
        if (!m44139b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new C18083m(sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private boolean m44139b(AccessibleObject accessibleObject) {
        if (!(this.f49934b == null || this.f49935c == null)) {
            try {
                long longValue = ((Long) f49933a.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f49934b, new Object[]{this.f49935c})).longValue();
                f49933a.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f49934b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
