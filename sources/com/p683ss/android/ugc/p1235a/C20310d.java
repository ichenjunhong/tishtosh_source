package com.p683ss.android.ugc.p1235a;

import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.a.d */
public class C20310d<T> {
    public T get(Class cls, Class cls2) {
        if (cls2 != null) {
            try {
                return cls2.newInstance();
            } catch (Exception unused) {
            }
        }
        if (cls == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("method ");
                sb.append(method.getName());
                sb.append(" is called");
                printStream.println(sb.toString());
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                Class returnType = method.getReturnType();
                if (!returnType.isPrimitive()) {
                    return method.getDefaultValue();
                }
                returnType.getClass();
                if (returnType == Boolean.TYPE) {
                    return Boolean.FALSE;
                }
                if (returnType == Character.TYPE) {
                    return Character.valueOf(0);
                }
                if (returnType == Byte.TYPE) {
                    return Byte.valueOf(0);
                }
                if (returnType == Short.TYPE) {
                    return Short.valueOf(0);
                }
                if (returnType == Integer.TYPE) {
                    return Integer.valueOf(0);
                }
                if (returnType == Long.TYPE) {
                    return Long.valueOf(0);
                }
                if (returnType == Float.TYPE) {
                    return C20308b.f55806b;
                }
                if (returnType == Double.TYPE) {
                    return C20308b.f55805a;
                }
                return null;
            }
        });
    }
}
