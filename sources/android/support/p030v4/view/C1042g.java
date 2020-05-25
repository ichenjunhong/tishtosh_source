package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.g */
public final class C1042g {

    /* renamed from: a */
    private static Field f3327a;

    /* renamed from: b */
    private static boolean f3328b;

    /* renamed from: a */
    public static void m2976a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m2977b(layoutInflater, (Factory2) factory);
                return;
            }
            m2977b(layoutInflater, factory2);
        }
    }

    /* renamed from: b */
    private static void m2977b(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f3328b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3327a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3328b = true;
        }
        if (f3327a != null) {
            try {
                f3327a.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
