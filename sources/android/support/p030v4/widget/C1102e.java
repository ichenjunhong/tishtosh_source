package android.support.p030v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.e */
public final class C1102e {

    /* renamed from: a */
    private static Field f3523a;

    /* renamed from: b */
    private static boolean f3524b;

    /* renamed from: a */
    public static Drawable m3213a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f3524b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3523a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3524b = true;
        }
        if (f3523a != null) {
            try {
                return (Drawable) f3523a.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f3523a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m3214a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
            return;
        }
        if (compoundButton instanceof C1117p) {
            ((C1117p) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3215a(CompoundButton compoundButton, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
            return;
        }
        if (compoundButton instanceof C1117p) {
            ((C1117p) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
