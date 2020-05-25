package android.support.p019b;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.b.z */
final class C0320z {

    /* renamed from: a */
    private static LayoutTransition f787a;

    /* renamed from: b */
    private static Field f788b;

    /* renamed from: c */
    private static boolean f789c;

    /* renamed from: d */
    private static Method f790d;

    /* renamed from: e */
    private static boolean f791e;

    /* renamed from: a */
    private static void m694a(LayoutTransition layoutTransition) {
        if (!f791e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f790d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f791e = true;
        }
        if (f790d != null) {
            try {
                f790d.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException unused3) {
            }
        }
    }

    /* renamed from: a */
    static void m695a(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f787a == null) {
            C03211 r0 = new LayoutTransition() {
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            f787a = r0;
            r0.setAnimator(2, null);
            f787a.setAnimator(0, null);
            f787a.setAnimator(1, null);
            f787a.setAnimator(3, null);
            f787a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m694a(layoutTransition);
                }
                if (layoutTransition != f787a) {
                    viewGroup.setTag(R.id.d47, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f787a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f789c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f788b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f789c = true;
        }
        if (f788b != null) {
            try {
                boolean z3 = f788b.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f788b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(R.id.d47);
        if (layoutTransition2 != null) {
            viewGroup.setTag(R.id.d47, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
