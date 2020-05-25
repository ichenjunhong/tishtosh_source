package com.bytedance.retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.c */
public interface C12725c<T> {

    /* renamed from: com.bytedance.retrofit2.c$a */
    public static abstract class C12726a {
        /* renamed from: a */
        public abstract C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar);

        /* renamed from: a */
        protected static Class<?> m25559a(Type type) {
            return C12801w.m25695a(type);
        }

        /* renamed from: a */
        protected static Type m25560a(int i, ParameterizedType parameterizedType) {
            return C12801w.m25697a(0, parameterizedType);
        }
    }

    /* renamed from: a */
    <R> T mo23896a(C12690b<R> bVar);

    /* renamed from: a */
    Type mo23897a();
}
