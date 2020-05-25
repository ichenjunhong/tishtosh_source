package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12725c;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12799u;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1687b;
import p064c.p065a.C2149h;
import p064c.p065a.C2193n;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.retrofit2.d.a.h */
public final class C12742h extends C12726a {

    /* renamed from: a */
    private final C1675ac f33382a = null;

    /* renamed from: b */
    private final boolean f33383b;

    public C12742h(C1675ac acVar, boolean z) {
        this.f33383b = z;
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<C2201v> a = m25559a(type);
        if (a == C1687b.class) {
            C12741g gVar = new C12741g(Void.class, this.f33382a, this.f33383b, false, true, false, false, false, true);
            return gVar;
        }
        if (a == C2149h.class) {
            z = true;
        } else {
            z = false;
        }
        if (a == C1680ad.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a == C2193n.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a != C2201v.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type a2 = m25560a(0, (ParameterizedType) type);
        Class<C12738e> a3 = m25559a(a2);
        if (a3 == C12799u.class) {
            if (a2 instanceof ParameterizedType) {
                type2 = m25560a(0, (ParameterizedType) a2);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a3 != C12738e.class) {
            type2 = a2;
            z5 = false;
            z4 = true;
            C12741g gVar2 = new C12741g(type2, this.f33382a, this.f33383b, z5, z4, z, z2, z3, false);
            return gVar2;
        } else if (a2 instanceof ParameterizedType) {
            type2 = m25560a(0, (ParameterizedType) a2);
            z5 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z4 = false;
        C12741g gVar22 = new C12741g(type2, this.f33382a, this.f33383b, z5, z4, z, z2, z3, false);
        return gVar22;
    }
}
