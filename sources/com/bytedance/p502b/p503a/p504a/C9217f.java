package com.bytedance.p502b.p503a.p504a;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.b.a.a.f */
public final class C9217f {

    /* renamed from: a */
    public Method f25195a;

    /* renamed from: b */
    public Class<?> f25196b;

    /* renamed from: c */
    private WeakReference<Object> f25197c;

    /* renamed from: a */
    public final Object mo16582a() {
        return this.f25197c.get();
    }

    public C9217f(Object obj, Method method) {
        this.f25197c = new WeakReference<>(obj);
        this.f25195a = method;
        this.f25196b = obj.getClass();
    }
}
