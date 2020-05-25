package p2666g;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: g.c */
public interface C53068c<R, T> {

    /* renamed from: g.c$a */
    public static abstract class C53069a {
        /* renamed from: a */
        public abstract C53068c<?, ?> mo110593a(Type type, Annotation[] annotationArr, C53134n nVar);

        /* renamed from: a */
        protected static Class<?> m112841a(Type type) {
            return C53139p.m112956a(type);
        }

        /* renamed from: a */
        protected static Type m112842a(int i, ParameterizedType parameterizedType) {
            return C53139p.m112958a(0, parameterizedType);
        }
    }

    /* renamed from: a */
    T mo110591a(C53061b<R> bVar);

    /* renamed from: a */
    Type mo110592a();
}
