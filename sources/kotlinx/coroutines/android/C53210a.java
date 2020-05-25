package kotlinx.coroutines.android;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.android.a */
public final class C53210a {

    /* renamed from: a */
    public static final Method f131787a;

    static {
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C52711k.m112236a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        f131787a = method;
    }
}
