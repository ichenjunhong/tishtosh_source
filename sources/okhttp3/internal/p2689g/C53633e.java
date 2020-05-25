package okhttp3.internal.p2689g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: okhttp3.internal.g.e */
final class C53633e<T> {

    /* renamed from: a */
    private final Class<?> f133001a;

    /* renamed from: b */
    private final String f133002b;

    /* renamed from: c */
    private final Class[] f133003c;

    /* renamed from: a */
    private Method m114039a(Class<?> cls) {
        if (this.f133002b == null) {
            return null;
        }
        Method a = m114040a(cls, this.f133002b, this.f133003c);
        if (a == null || this.f133001a == null || this.f133001a.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo111522a(T t) {
        if (m114039a(t.getClass()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Object m114041c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m114039a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo111521a(T t, Object... objArr) {
        try {
            return m114041c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: b */
    public final Object mo111523b(T t, Object... objArr) {
        try {
            return m114042d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: d */
    private Object m114042d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m114039a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Unexpectedly could not call: ");
                sb.append(a);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Method ");
            sb2.append(this.f133002b);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    C53633e(Class<?> cls, String str, Class... clsArr) {
        this.f133001a = cls;
        this.f133002b = str;
        this.f133003c = clsArr;
    }

    /* renamed from: a */
    private static Method m114040a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) != 0) {
                    return method;
                }
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
        }
        return null;
    }
}
