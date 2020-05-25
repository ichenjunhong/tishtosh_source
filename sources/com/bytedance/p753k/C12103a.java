package com.bytedance.p753k;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.common.utility.p526f.C9407a;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.common.utility.p526f.C9411c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.k.a */
public class C12103a extends C4116c {

    /* renamed from: a */
    private static volatile C8862e f32037a;

    /* renamed from: com.bytedance.k.a$a */
    static class C12104a implements InvocationHandler {

        /* renamed from: a */
        private Object f32038a;

        C12104a(Object obj) {
            this.f32038a = obj;
        }

        /* renamed from: a */
        private static Object m24531a(Class cls) {
            if (cls == Boolean.class) {
                return Boolean.valueOf(false);
            }
            if (cls == Integer.class || cls == Short.class || cls == Byte.class) {
                return Integer.valueOf(0);
            }
            if (cls == Double.class) {
                return Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            }
            if (cls == Character.class) {
                return "";
            }
            if (cls == Long.class) {
                return Long.valueOf(0);
            }
            if (cls == Float.class) {
                return Float.valueOf(0.0f);
            }
            return null;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.f32038a == null) {
                return m24531a(C9409b.m18617b(method.getReturnType()));
            }
            try {
                return C9409b.m18609a(this.f32038a).mo17052a(method.getName(), (Class<?>[]) method.getParameterTypes(), objArr).f25654a;
            } catch (C9411c unused) {
                return m24531a(C9409b.m18617b(method.getReturnType()));
            }
        }
    }

    /* renamed from: a */
    public static C8862e m24529a() {
        if (f32037a == null) {
            synchronized (C12103a.class) {
                if (f32037a == null) {
                    f32037a = (C8862e) C9407a.m18600a("com.ss.android.ugc.aweme.live.Live", "getService", new Object[0]);
                }
            }
        }
        return f32037a;
    }

    /* renamed from: b */
    public static <T extends C2952b> T m24530b(Class<T> cls) {
        T a = m10249a(cls);
        if (a != null) {
            return a;
        }
        T t = (C2952b) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C12104a(null));
        m10251a(cls, t);
        return t;
    }
}
