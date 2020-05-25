package android.support.p030v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.v */
public final class C1060v {

    /* renamed from: a */
    private static Method f3353a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f3353a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m3090a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public static float m3089a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25 && f3353a != null) {
            try {
                return (float) ((Integer) f3353a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
