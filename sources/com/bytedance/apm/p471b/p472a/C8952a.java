package com.bytedance.apm.p471b.p472a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.apm.b.a.a */
public final class C8952a implements InvocationHandler {

    /* renamed from: a */
    public IBinder f24342a;

    /* renamed from: b */
    private Object f24343b;

    /* renamed from: c */
    private C8955d f24344c;

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.f24342a != null && method.getName().equals("asBinder")) {
            return this.f24342a;
        }
        this.f24344c.mo16230a(obj, method, objArr);
        return method.invoke(this.f24343b, objArr);
    }

    C8952a(IBinder iBinder, Class<?> cls, C8955d dVar, IBinder iBinder2) {
        try {
            this.f24343b = cls.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder});
            this.f24344c = dVar;
            this.f24342a = iBinder2;
        } catch (Exception unused) {
        }
    }
}
