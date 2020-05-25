package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import java.lang.reflect.Method;

/* renamed from: android.support.design.widget.h */
public final class C0546h {

    /* renamed from: a */
    private static Method f1951a;

    /* renamed from: b */
    private static boolean f1952b;

    /* renamed from: a */
    public static boolean m1487a(DrawableContainer drawableContainer, ConstantState constantState) {
        return m1488b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m1488b(DrawableContainer drawableContainer, ConstantState constantState) {
        if (!f1952b) {
            try {
                Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f1951a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1952b = true;
        }
        if (f1951a != null) {
            try {
                f1951a.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }
}
