package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17421k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: com.google.b.g.c */
public final class C17749c {
    /* renamed from: a */
    public static <T> T m43567a(Class<T> cls, InvocationHandler invocationHandler) {
        C17421k.m42653a(invocationHandler);
        C17421k.m42664a(cls.isInterface(), "%s is not an interface", (Object) cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
