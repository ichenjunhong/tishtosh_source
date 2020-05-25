package android.support.p019b;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.b.aa */
final class C0239aa {

    /* renamed from: a */
    private static Method f588a;

    /* renamed from: b */
    private static boolean f589b;

    /* renamed from: a */
    private static void m486a() {
        if (!f589b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f588a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f589b = true;
        }
    }

    /* renamed from: a */
    static void m487a(ViewGroup viewGroup, boolean z) {
        m486a();
        if (f588a != null) {
            try {
                f588a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }
}
