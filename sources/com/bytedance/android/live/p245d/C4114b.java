package com.bytedance.android.live.p245d;

import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.common.utility.p526f.C9411c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.live.d.b */
public final class C4114b {

    /* renamed from: a */
    public static WeakHashMap<Object, Map<Class, Object>> f11310a;

    /* renamed from: com.bytedance.android.live.d.b$a */
    static class C4115a implements InvocationHandler {

        /* renamed from: a */
        private Object f11311a;

        public C4115a(Object obj) {
            this.f11311a = obj;
        }

        /* renamed from: a */
        private static Object m10248a(Class cls) {
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
            if (this.f11311a == null) {
                return m10248a(C9409b.m18617b(method.getReturnType()));
            }
            try {
                return C9409b.m18609a(this.f11311a).mo17052a(method.getName(), (Class<?>[]) method.getParameterTypes(), objArr).f25654a;
            } catch (C9411c unused) {
                return m10248a(C9409b.m18617b(method.getReturnType()));
            }
        }
    }

    /* renamed from: a */
    public static <T> T m10247a(Object obj, Class<T> cls) {
        if (f11310a == null) {
            f11310a = new WeakHashMap<>();
        }
        Map map = (Map) f11310a.get(obj);
        if (map == null) {
            map = new HashMap();
            f11310a.put(obj, map);
        }
        if (map.get(cls) == null) {
            map.put(cls, Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new C4115a(obj)));
        }
        return map.get(cls);
    }
}
