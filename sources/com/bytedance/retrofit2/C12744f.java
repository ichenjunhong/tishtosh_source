package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.f */
public interface C12744f<F, T> {

    /* renamed from: com.bytedance.retrofit2.f$a */
    public static abstract class C12745a {
        /* renamed from: a */
        public C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
            return null;
        }

        /* renamed from: a */
        public C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
            return null;
        }

        /* renamed from: b */
        public C12744f<?, Object> mo23850b(Type type, Annotation[] annotationArr, C12792q qVar) {
            return null;
        }

        /* renamed from: c */
        public C12744f<?, String> mo23851c(Type type, Annotation[] annotationArr, C12792q qVar) {
            return null;
        }

        /* renamed from: d */
        public C12744f<?, C12685b> mo23852d(Type type, Annotation[] annotationArr, C12792q qVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo9557a(F f) throws IOException;
}
