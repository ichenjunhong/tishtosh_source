package com.bytedance.retrofit2;

import com.C2240a;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.n */
public final class C12760n {

    /* renamed from: a */
    public final Method f33400a;

    /* renamed from: b */
    public final List<?> f33401b;

    public final String toString() {
        return C2240a.m6772a("%s.%s() %s", new Object[]{this.f33400a.getDeclaringClass().getName(), this.f33400a.getName(), this.f33401b});
    }

    C12760n(Method method, List<?> list) {
        this.f33400a = method;
        this.f33401b = Collections.unmodifiableList(list);
    }
}
