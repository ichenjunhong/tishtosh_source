package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.android.d */
public final class C53216d {

    /* renamed from: a */
    public static final C53215c f131798a;

    static {
        Object obj;
        try {
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            obj = C52848o.m114620constructorimpl(new C53211b(m113052a(mainLooper, true), "Main"));
        } catch (Throwable th) {
            obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        if (C52848o.m114625isFailureimpl(obj)) {
            obj = null;
        }
        f131798a = (C53215c) obj;
    }

    /* renamed from: a */
    public static final C53215c m113053a(Handler handler, String str) {
        C52711k.m112240b(handler, "receiver$0");
        return new C53211b(handler, str);
    }

    /* renamed from: a */
    public static final Handler m113052a(Looper looper, boolean z) {
        C52711k.m112240b(looper, "receiver$0");
        if (VERSION.SDK_INT < 16) {
            return new Handler(looper);
        }
        if (VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new C52857u("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE});
            C52711k.m112236a((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Object newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            C52711k.m112236a(newInstance, "constructor.newInstance(this, null, true)");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
