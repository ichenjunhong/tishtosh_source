package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22975a;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.q */
public final class C23012q extends C12745a {

    /* renamed from: a */
    private final C17971f f61356a;

    public C23012q(C17971f fVar) {
        if (fVar != null) {
            this.f61356a = fVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == C22977c.class) {
                return new C22975a(parameterizedType, this.f61356a);
            }
            return null;
        } else if (!(type instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new C23011p(ProtoAdapter.get(cls));
        }
    }

    /* renamed from: a */
    public final C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C23010o(ProtoAdapter.get(cls));
    }
}
