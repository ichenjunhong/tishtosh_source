package android.support.p030v4.widget;

import android.os.Build.VERSION;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.l */
public final class C1112l {

    /* renamed from: a */
    private static Method f3543a;

    /* renamed from: b */
    private static boolean f3544b;

    /* renamed from: c */
    private static Field f3545c;

    /* renamed from: d */
    private static boolean f3546d;

    /* renamed from: a */
    public static void m3246a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f3544b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f3543a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3544b = true;
        }
        if (f3543a != null) {
            try {
                f3543a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m3248a(PopupWindow popupWindow, boolean z) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            if (!f3546d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3545c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f3546d = true;
            }
            if (f3545c != null) {
                try {
                    f3545c.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3247a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C1039e.m2968a(i3, C1056u.m3055f(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
