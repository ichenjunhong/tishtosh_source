package android.support.p019b;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.b.af */
class C0247af extends C0250ai {

    /* renamed from: a */
    private static Method f602a;

    /* renamed from: b */
    private static boolean f603b;

    /* renamed from: c */
    private static Method f604c;

    /* renamed from: d */
    private static boolean f605d;

    C0247af() {
    }

    /* renamed from: b */
    public final void mo517b(View view) {
    }

    /* renamed from: c */
    public final void mo518c(View view) {
    }

    /* renamed from: a */
    public final float mo515a(View view) {
        if (!f605d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f604c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f605d = true;
        }
        if (f604c != null) {
            try {
                return ((Float) f604c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo515a(view);
    }

    /* renamed from: a */
    public final void mo516a(View view, float f) {
        if (!f603b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f602a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f603b = true;
        }
        if (f602a != null) {
            try {
                f602a.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }
}
