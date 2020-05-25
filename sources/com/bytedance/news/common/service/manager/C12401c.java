package com.bytedance.news.common.service.manager;

import com.C2240a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.news.common.service.manager.c */
public class C12401c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f32644a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, C12399a<?>> f32645b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, C12400b> f32646c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T> T m24975a(Class<T> cls) {
        T t = f32644a.get(cls);
        if (t == null) {
            synchronized (C12401c.class) {
                C12399a aVar = (C12399a) f32645b.get(cls);
                if (aVar != null) {
                    T a = aVar.mo16439a();
                    f32645b.remove(cls);
                    if (a != null) {
                        m24979b(cls, a);
                        return a;
                    }
                }
                t = m24978b(cls);
                if (t != null) {
                    m24979b(cls, t);
                    return t;
                }
            }
        }
        return t;
    }

    /* renamed from: b */
    private static <T> T m24978b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(C2240a.m6772a("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return ((IServiceProxy) newInstance).newInstance();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static <T> void m24976a(Class<T> cls, C12399a<T> aVar) {
        f32645b.put(cls, aVar);
    }

    /* renamed from: a */
    public static <T> void m24977a(Class<T> cls, T t) {
        f32644a.put(cls, t);
    }

    /* renamed from: b */
    private static <T> void m24979b(Class<T> cls, T t) {
        f32644a.put(cls, t);
        if (((C12400b) f32646c.get(cls)) != null) {
            f32646c.remove(cls);
        }
    }
}
