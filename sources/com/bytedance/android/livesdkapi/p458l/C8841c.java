package com.bytedance.android.livesdkapi.p458l;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.livesdkapi.l.c */
public final class C8841c {

    /* renamed from: com.bytedance.android.livesdkapi.l.c$a */
    static class C8842a<T> implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<T> f24126a;

        C8842a(T t) {
            this.f24126a = new WeakReference<>(t);
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.f24126a.get();
            if (obj2 == null) {
                return null;
            }
            return method.invoke(obj2, objArr);
        }
    }

    /* renamed from: a */
    public static <T> T m17358a(T t) {
        if (t == null) {
            return null;
        }
        try {
            Class cls = t.getClass();
            Class[] interfaces = cls.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                t = Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new C8842a(t));
            }
        } catch (Throwable unused) {
        }
        return t;
    }
}
