package com.bytedance.als;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class ApiCenter {

    /* renamed from: a */
    public static final C2755a f8315a = new C2755a(null);

    /* renamed from: b */
    private final Map<Class<?>, Object> f8316b;

    /* renamed from: c */
    private ApiCenter f8317c;

    public static final class ApiCenterCompatViewModel extends C0209x {

        /* renamed from: a */
        public final ApiCenter f8318a = new ApiCenter(null, 1, null);
    }

    /* renamed from: com.bytedance.als.ApiCenter$a */
    public static final class C2755a {
        private C2755a() {
        }

        public /* synthetic */ C2755a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ApiCenter m7851a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "host");
            return ((ApiCenterCompatViewModel) C0214z.m440a(fragmentActivity).mo359a(ApiCenterCompatViewModel.class)).f8318a;
        }
    }

    public ApiCenter() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static final ApiCenter m7844a(FragmentActivity fragmentActivity) {
        return C2755a.m7851a(fragmentActivity);
    }

    private ApiCenter(ApiCenter apiCenter) {
        this.f8317c = apiCenter;
        this.f8316b = new HashMap();
    }

    /* renamed from: b */
    public final <T extends C2759d> void mo7342b(T t) {
        C52711k.m112240b(t, "instance");
        this.f8316b.remove(t.getClass());
    }

    /* renamed from: b */
    public final synchronized <T extends C2759d> T mo7341b(Class<T> cls) {
        Object obj;
        C52711k.m112240b(cls, "clazz");
        T t = this.f8316b.get(cls);
        if (t != null) {
            return (C2759d) t;
        }
        Iterator it = this.f8316b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m7846b((Class) obj, cls)) {
                break;
            }
        }
        Class cls2 = (Class) obj;
        ApiCenter apiCenter = this.f8317c;
        if (cls2 != null) {
            T t2 = this.f8316b.get(cls2);
            if (t2 != null) {
                return (C2759d) t2;
            }
            throw new C52857u("null cannot be cast to non-null type T");
        } else if (apiCenter == null) {
            return null;
        } else {
            return apiCenter.mo7341b(cls);
        }
    }

    /* renamed from: a */
    public final synchronized <T extends C2759d> T mo7339a(Class<T> cls) {
        Object obj;
        C52711k.m112240b(cls, "clazz");
        T t = this.f8316b.get(cls);
        if (t != null) {
            return (C2759d) t;
        }
        Iterator it = this.f8316b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m7846b((Class) obj, cls)) {
                break;
            }
        }
        Class cls2 = (Class) obj;
        ApiCenter apiCenter = this.f8317c;
        if (cls2 != null) {
            T t2 = this.f8316b.get(cls2);
            if (t2 != null) {
                return (C2759d) t2;
            }
            throw new C52857u("null cannot be cast to non-null type T");
        } else if (apiCenter != null) {
            return apiCenter.mo7339a(cls);
        } else {
            StringBuilder sb = new StringBuilder("not found ");
            sb.append(cls);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final <T extends C2759d> void mo7340a(T t) {
        C52711k.m112240b(t, "instance");
        Class cls = t.getClass();
        if (!C52711k.m112239a((Object) cls, (Object) C2759d.class)) {
            for (Class cls2 : this.f8316b.keySet()) {
                if (C52711k.m112239a((Object) cls, (Object) cls2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cls);
                    sb.append(" already register");
                    throw new IllegalStateException(sb.toString());
                } else if (m7845a(cls, cls2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cls);
                    sb2.append(" child found ");
                    sb2.append(cls2);
                    throw new IllegalStateException(sb2.toString());
                } else if (m7846b(cls, cls2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cls);
                    sb3.append(" parent found ");
                    sb3.append(cls2);
                    throw new IllegalStateException(sb3.toString());
                }
            }
            this.f8316b.put(cls, t);
            return;
        }
        throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
    }

    /* renamed from: b */
    private final boolean m7846b(Class<?> cls, Class<?> cls2) {
        return m7845a(cls2, cls);
    }

    /* renamed from: a */
    private final boolean m7845a(Class<?> cls, Class<?> cls2) {
        Class[] interfaces;
        if (cls.isInterface()) {
            for (Class cls3 : cls2.getInterfaces()) {
                if (C52711k.m112239a((Object) cls3, (Object) cls)) {
                    return true;
                }
                C52711k.m112236a((Object) cls3, "i");
                if (m7845a(cls, cls3)) {
                    return true;
                }
            }
            return false;
        }
        while (!C52711k.m112239a((Object) cls2, (Object) Object.class)) {
            if (C52711k.m112239a((Object) cls2, (Object) cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new C52857u("null cannot be cast to non-null type java.lang.Class<*>");
            }
        }
        return false;
    }

    public /* synthetic */ ApiCenter(ApiCenter apiCenter, int i, C52707g gVar) {
        this(null);
    }
}
