package android.support.p019b;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.b.ah */
final class C0249ah extends C0248ag {

    /* renamed from: a */
    private static Method f610a;

    /* renamed from: b */
    private static boolean f611b;

    C0249ah() {
    }

    /* renamed from: a */
    public final void mo521a(View view, int i, int i2, int i3, int i4) {
        if (!f611b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f610a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f611b = true;
        }
        if (f610a != null) {
            try {
                f610a.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
