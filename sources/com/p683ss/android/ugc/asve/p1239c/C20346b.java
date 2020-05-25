package com.p683ss.android.ugc.asve.p1239c;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.android.C53215c;
import kotlinx.coroutines.android.C53216d;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.c.b */
public final class C20346b {

    /* renamed from: a */
    private static C53215c f55845a;

    /* renamed from: a */
    public static final C53215c m50242a() {
        return f55845a;
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
        f55845a = C53216d.m113053a(m50241a(mainLooper, true), "fast-main");
    }

    /* renamed from: a */
    private static Handler m50241a(Looper looper, boolean z) {
        C52711k.m112240b(looper, "$this$asHandler");
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
