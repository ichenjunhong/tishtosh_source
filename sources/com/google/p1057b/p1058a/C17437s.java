package com.google.p1057b.p1058a;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.b.a.s */
public final class C17437s {

    /* renamed from: a */
    public static final Object f48976a;

    /* renamed from: b */
    public static final Method f48977b;

    /* renamed from: c */
    public static final Method f48978c;

    /* renamed from: a */
    private static Object m42684a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Method method;
        Object a = m42684a();
        f48976a = a;
        Method method2 = null;
        if (a == null) {
            method = null;
        } else {
            method = m42685a("getStackTraceElement", (Class<?>[]) new Class[]{Throwable.class, Integer.TYPE});
        }
        f48977b = method;
        if (f48976a != null) {
            method2 = m42689b();
        }
        f48978c = method2;
    }

    /* renamed from: b */
    private static Method m42689b() {
        try {
            Method a = m42685a("getStackTraceDepth", (Class<?>[]) new Class[]{Throwable.class});
            if (a == null) {
                return null;
            }
            a.invoke(m42684a(), new Object[]{new Throwable()});
            return a;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m42688b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m42686a(Throwable th) {
        C17421k.m42653a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: a */
    private static Method m42685a(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <X extends Throwable> void m42687a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            C17421k.m42653a(th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            m42686a(th);
        }
    }
}
