package com.bytedance.apm.p471b.p472a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.apm.b.a.c */
public final class C8954c implements InvocationHandler {

    /* renamed from: a */
    IBinder f24346a;

    /* renamed from: b */
    public IBinder f24347b;

    /* renamed from: c */
    C8955d f24348c;

    /* renamed from: d */
    Class<?> f24349d;

    /* renamed from: e */
    Class<?> f24350e;

    public C8954c(IBinder iBinder, C8955d dVar) {
        this.f24346a = iBinder;
        this.f24348c = dVar;
        try {
            String a = dVar.mo16229a();
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("$Stub");
            this.f24349d = Class.forName(sb.toString());
            this.f24350e = Class.forName(a);
        } catch (ClassNotFoundException unused) {
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"queryLocalInterface".equals(method.getName())) {
            return method.invoke(this.f24346a, objArr);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f24350e}, new C8952a(this.f24346a, this.f24349d, this.f24348c, this.f24347b));
    }
}
