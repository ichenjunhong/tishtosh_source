package android.support.p030v4.p037e;

import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.e.b */
public final class C0764b {

    /* renamed from: a */
    private static Method f2636a;

    /* renamed from: b */
    private static Method f2637b;

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f2637b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2636a = cls.getMethod("getScript", new Class[]{String.class});
                    f2637b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception unused) {
                f2636a = null;
                f2637b = null;
            }
        }
    }

    /* renamed from: a */
    private static String m2178a(String str) {
        try {
            if (f2636a != null) {
                return (String) f2636a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static String m2180b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f2637b != null) {
                return (String) f2637b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    /* renamed from: a */
    public static String m2179a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f2637b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String b = m2180b(locale);
            if (b != null) {
                return m2178a(b);
            }
            return null;
        }
    }
}
