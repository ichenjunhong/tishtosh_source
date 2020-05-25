package com.bytedance.jedi.arch;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.o */
public final class C11928o implements C11927n {

    /* renamed from: a */
    private boolean f31612a = true;

    /* renamed from: a */
    public final <S extends C11932s, VM extends JediViewModel<S>, T extends C11926m<S, VM>> T mo22643a(Class<VM> cls) {
        C52711k.m112240b(cls, "clazz");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("_MiddlewareBinding");
        String sb2 = sb.toString();
        T t = null;
        try {
            if (this.f31612a) {
                Object obj = C11929p.f31613a.get(sb2);
                if (((Class) obj) != null || !C11929p.f31613a.containsKey(sb2)) {
                    Class cls2 = (Class) obj;
                    if (cls2 == null) {
                        cls2 = Class.forName(sb2);
                        C11929p.f31613a.put(sb2, cls2);
                    }
                    T newInstance = cls2.newInstance();
                    if (!(newInstance instanceof C11926m)) {
                        newInstance = null;
                    }
                    T t2 = (C11926m) newInstance;
                    if (t2 != null) {
                        this.f31612a = false;
                        t = t2;
                    }
                } else {
                    this.f31612a = false;
                    return null;
                }
            }
        } catch (Exception unused) {
            C11929p.f31613a.put(sb2, null);
            this.f31612a = false;
        }
        return t;
    }
}
