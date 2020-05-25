package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.o */
public final class C53773o {

    /* renamed from: a */
    final Method f133368a;

    /* renamed from: b */
    final ThreadMode f133369b;

    /* renamed from: c */
    final Class<?> f133370c;

    /* renamed from: d */
    final int f133371d;

    /* renamed from: e */
    final boolean f133372e;

    /* renamed from: f */
    String f133373f;

    public final int hashCode() {
        return this.f133368a.hashCode();
    }

    /* renamed from: a */
    private synchronized void m114363a() {
        if (this.f133373f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f133368a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f133368a.getName());
            sb.append('(');
            sb.append(this.f133370c.getName());
            this.f133373f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C53773o)) {
            return false;
        }
        m114363a();
        C53773o oVar = (C53773o) obj;
        oVar.m114363a();
        return this.f133373f.equals(oVar.f133373f);
    }

    public C53773o(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f133368a = method;
        this.f133369b = threadMode;
        this.f133370c = cls;
        this.f133371d = i;
        this.f133372e = z;
    }
}
