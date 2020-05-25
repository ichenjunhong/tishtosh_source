package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.socialbase.downloader.impls.l */
public class C19971l {

    /* renamed from: a */
    private static volatile C19904n f54899a;

    /* renamed from: b */
    private static volatile C19904n f54900b;

    /* renamed from: com.ss.android.socialbase.downloader.impls.l$a */
    static class C19972a implements InvocationHandler {

        /* renamed from: a */
        private volatile C19904n f54901a;

        public C19972a(boolean z) {
            if (!z) {
                this.f54901a = new C19981p();
            } else {
                this.f54901a = new C19979o();
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (this.f54901a != null) {
                    return method.invoke(this.f54901a, objArr);
                }
                return null;
            } catch (InvocationTargetException e) {
                e.getCause();
                throw e.getCause();
            }
        }
    }

    /* renamed from: a */
    public static C19904n m49132a(boolean z) {
        if (z) {
            if (f54900b == null) {
                synchronized (C19971l.class) {
                    if (f54900b == null) {
                        f54900b = (C19904n) Proxy.newProxyInstance(C19971l.class.getClassLoader(), new Class[]{C19904n.class}, new C19972a(true));
                    }
                }
            }
            return f54900b;
        }
        if (f54899a == null) {
            synchronized (C19971l.class) {
                if (f54899a == null) {
                    f54899a = (C19904n) Proxy.newProxyInstance(C19971l.class.getClassLoader(), new Class[]{C19904n.class}, new C19972a(false));
                }
            }
        }
        return f54899a;
    }
}
