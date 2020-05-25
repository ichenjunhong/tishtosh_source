package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.ies.ugc.aweme.network.b */
public final class C11026b extends C12745a {

    /* renamed from: a */
    private final C17971f f29625a;

    C11026b(C17971f fVar) {
        if (fVar != null) {
            this.f29625a = fVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
        return new C11028d(this.f29625a, this.f29625a.mo34877a(C17956a.m44007a(type)));
    }

    /* renamed from: a */
    public final C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
        return new C11027c(this.f29625a, this.f29625a.mo34877a(C17956a.m44007a(type)));
    }
}
