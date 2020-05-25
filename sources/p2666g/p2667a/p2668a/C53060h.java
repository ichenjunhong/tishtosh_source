package p2666g.p2667a.p2668a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1687b;
import p064c.p065a.C2149h;
import p064c.p065a.C2193n;
import p064c.p065a.C2201v;
import p2666g.C53068c;
import p2666g.C53068c.C53069a;
import p2666g.C53133m;
import p2666g.C53134n;

/* renamed from: g.a.a.h */
public final class C53060h extends C53069a {

    /* renamed from: a */
    private final C1675ac f131552a = null;

    /* renamed from: b */
    private final boolean f131553b = false;

    /* renamed from: a */
    public static C53060h m112820a() {
        return new C53060h(null, false);
    }

    private C53060h(C1675ac acVar, boolean z) {
    }

    /* renamed from: a */
    public final C53068c<?, ?> mo110593a(Type type, Annotation[] annotationArr, C53134n nVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<C2201v> a = m112841a(type);
        if (a == C1687b.class) {
            C53059g gVar = new C53059g(Void.class, this.f131552a, this.f131553b, false, true, false, false, false, true);
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
        Type a2 = m112842a(0, (ParameterizedType) type);
        Class<C53056e> a3 = m112841a(a2);
        if (a3 == C53133m.class) {
            if (a2 instanceof ParameterizedType) {
                type2 = m112842a(0, (ParameterizedType) a2);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a3 != C53056e.class) {
            type2 = a2;
            z5 = false;
            z4 = true;
            C53059g gVar2 = new C53059g(type2, this.f131552a, this.f131553b, z5, z4, z, z2, z3, false);
            return gVar2;
        } else if (a2 instanceof ParameterizedType) {
            type2 = m112842a(0, (ParameterizedType) a2);
            z5 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z4 = false;
        C53059g gVar22 = new C53059g(type2, this.f131552a, this.f131553b, z5, z4, z, z2, z3, false);
        return gVar22;
    }
}
