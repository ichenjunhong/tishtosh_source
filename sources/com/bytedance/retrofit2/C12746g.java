package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12725c.C12726a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.g */
final class C12746g extends C12726a {

    /* renamed from: a */
    static final C12726a f33384a = new C12746g();

    C12746g() {
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C12690b.class) {
            return null;
        }
        final Type e = C12801w.m25707e(type);
        return new C12725c<C12690b<?>>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo23896a(C12690b bVar) {
                return bVar;
            }

            /* renamed from: a */
            public final Type mo23897a() {
                return e;
            }
        };
    }
}
