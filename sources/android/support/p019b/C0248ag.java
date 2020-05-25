package android.support.p019b;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.b.ag */
class C0248ag extends C0247af {

    /* renamed from: a */
    private static Method f606a;

    /* renamed from: b */
    private static boolean f607b;

    /* renamed from: c */
    private static Method f608c;

    /* renamed from: d */
    private static boolean f609d;

    C0248ag() {
    }

    /* renamed from: a */
    public final void mo519a(View view, Matrix matrix) {
        if (!f607b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f606a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f607b = true;
        }
        if (f606a != null) {
            try {
                f606a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public final void mo520b(View view, Matrix matrix) {
        if (!f609d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f608c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f609d = true;
        }
        if (f608c != null) {
            try {
                f608c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
