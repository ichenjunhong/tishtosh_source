package kotlinx.coroutines.android;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

public final class AndroidExceptionPreHandler extends C52599a implements CoroutineExceptionHandler {
    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f131765b);
    }

    public final void handleException(C52628e eVar, Throwable th) {
        Object obj;
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(th, "exception");
        Method method = C53210a.f131787a;
        if (method != null) {
            obj = method.invoke(null, new Object[0]);
        } else {
            obj = null;
        }
        if (!(obj instanceof UncaughtExceptionHandler)) {
            obj = null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
