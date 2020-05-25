package android.support.p043v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bj */
public final class C1467bj {

    /* renamed from: a */
    private static Method f5291a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f5291a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f5291a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m5138a(View view) {
        if (C1056u.m3055f(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m5139b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException | InvocationTargetException unused) {
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m5137a(View view, Rect rect, Rect rect2) {
        if (f5291a != null) {
            try {
                f5291a.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }
}
