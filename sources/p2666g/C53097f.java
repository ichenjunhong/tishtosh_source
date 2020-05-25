package p2666g;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p2666g.C53068c.C53069a;

/* renamed from: g.f */
final class C53097f extends C53069a {

    /* renamed from: a */
    static final C53069a f131564a = new C53097f();

    C53097f() {
    }

    /* renamed from: a */
    public final C53068c<?, ?> mo110593a(Type type, Annotation[] annotationArr, C53134n nVar) {
        if (m112841a(type) != C53061b.class) {
            return null;
        }
        final Type e = C53139p.m112968e(type);
        return new C53068c<Object, C53061b<?>>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo110591a(C53061b bVar) {
                return bVar;
            }

            /* renamed from: a */
            public final Type mo110592a() {
                return e;
            }
        };
    }
}
