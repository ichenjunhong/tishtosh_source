package android.support.p030v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.graphics.drawable.a */
public final class C0809a {

    /* renamed from: a */
    private static Method f2747a;

    /* renamed from: b */
    private static boolean f2748b;

    /* renamed from: c */
    private static Method f2749c;

    /* renamed from: d */
    private static boolean f2750d;

    /* renamed from: a */
    public static void m2323a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static boolean m2332b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: c */
    public static int m2334c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m2335d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: f */
    public static Drawable m2337f(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof C0814e)) {
                return new C0819h(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof C0814e)) {
            return new C0816g(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: g */
    public static int m2338g(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f2750d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2749c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2750d = true;
        }
        if (f2749c != null) {
            try {
                return ((Integer) f2749c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f2749c = null;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static void m2336e(Drawable drawable) {
        if (VERSION.SDK_INT >= 23 || VERSION.SDK_INT < 21) {
            drawable.clearColorFilter();
        } else {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m2336e(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0815f) {
                m2336e(((C0815f) drawable).mo2623a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            m2336e(child);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2325a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
            return;
        }
        if (drawable instanceof C0814e) {
            ((C0814e) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m2327a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
            return;
        }
        if (drawable instanceof C0814e) {
            ((C0814e) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static boolean m2333b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f2748b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f2747a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2748b = true;
        }
        if (f2747a != null) {
            try {
                f2747a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception unused2) {
                f2747a = null;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m2328a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m2330a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
            return;
        }
        if (drawable instanceof C0814e) {
            ((C0814e) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m2331a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static void m2324a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m2326a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2329a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }
}
