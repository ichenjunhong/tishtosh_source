package android.support.p030v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.e */
public final class C0647e {

    /* renamed from: android.support.v4.app.e$a */
    static class C0648a {

        /* renamed from: a */
        private static Method f2337a;

        /* renamed from: b */
        private static boolean f2338b;

        /* renamed from: c */
        private static Method f2339c;

        /* renamed from: d */
        private static boolean f2340d;

        /* renamed from: a */
        public static IBinder m1769a(Bundle bundle, String str) {
            if (!f2338b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2337a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2338b = true;
            }
            if (f2337a != null) {
                try {
                    return (IBinder) f2337a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2337a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1770a(Bundle bundle, String str, IBinder iBinder) {
            if (!f2340d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2339c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2340d = true;
            }
            if (f2339c != null) {
                try {
                    f2339c.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2339c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1767a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0648a.m1769a(bundle, str);
    }

    /* renamed from: a */
    public static void m1768a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0648a.m1770a(bundle, str, iBinder);
        }
    }
}
