package okhttp3.internal.p2684b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: okhttp3.internal.b.e */
public final class C53554e extends RuntimeException {

    /* renamed from: a */
    private static final Method f132704a;

    /* renamed from: b */
    private IOException f132705b;

    public final IOException getLastConnectException() {
        return this.f132705b;
    }

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f132704a = method;
    }

    public C53554e(IOException iOException) {
        super(iOException);
        this.f132705b = iOException;
    }

    public final void addConnectException(IOException iOException) {
        IOException iOException2 = this.f132705b;
        if (f132704a != null) {
            try {
                f132704a.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.f132705b = iOException;
    }
}
