package com.p683ss.android.ugc.aweme.p685s;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.C53360z;
import kotlinx.coroutines.android.C53215c;
import kotlinx.coroutines.android.C53216d;
import p2628d.C52857u;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.s.a */
public final class C10917a {

    /* renamed from: a */
    private static C53215c f29328a;

    /* renamed from: b */
    private static C53360z f29329b = new C10918a();

    /* renamed from: com.ss.android.ugc.aweme.s.a$a */
    public static final class C10918a extends C53360z {
        C10918a() {
        }

        /* renamed from: a */
        public final boolean mo19709a(C52628e eVar) {
            C52711k.m112240b(eVar, "context");
            return false;
        }

        /* renamed from: a */
        public final void mo19708a(C52628e eVar, Runnable runnable) {
            C52711k.m112240b(eVar, "context");
            C52711k.m112240b(runnable, "block");
            runnable.run();
        }
    }

    /* renamed from: a */
    public static final C53215c m22170a() {
        return f29328a;
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
        f29328a = C53216d.m113053a(m22169a(mainLooper, true), "fast-main");
    }

    /* renamed from: a */
    private static Handler m22169a(Looper looper, boolean z) {
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
