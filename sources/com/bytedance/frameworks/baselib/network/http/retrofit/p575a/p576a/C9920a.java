package com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a */
public final class C9920a extends C12745a {

    /* renamed from: a */
    private final C17971f f26989a;

    /* renamed from: a */
    public static C9920a m19890a() {
        return m19891a(new C17971f());
    }

    /* renamed from: a */
    public static C9920a m19891a(C17971f fVar) {
        return new C9920a(fVar);
    }

    private C9920a(C17971f fVar) {
        if (fVar != null) {
            this.f26989a = fVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
        return new C9922c(this.f26989a, this.f26989a.mo34877a(C17956a.m44007a(type)));
    }

    /* renamed from: a */
    public final C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
        return new C9921b(this.f26989a, this.f26989a.mo34877a(C17956a.m44007a(type)));
    }
}
