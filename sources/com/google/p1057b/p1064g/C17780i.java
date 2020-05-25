package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17411g;
import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import com.google.p1057b.p1058a.C17423m.C17426b;
import com.google.p1057b.p1058a.C17423m.C17427c;
import com.google.p1057b.p1060c.C17530ab;
import com.google.p1057b.p1060c.C17530ab.C17531a;
import com.google.p1057b.p1060c.C17538ad;
import com.google.p1057b.p1060c.C17538ad.C17540a;
import com.google.p1057b.p1060c.C17583ao;
import com.google.p1057b.p1060c.C17666bt;
import com.google.p1057b.p1060c.C17717s;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.b.g.i */
final class C17780i {

    /* renamed from: a */
    public static final C17410f<Type, String> f49522a = new C17410f<Type, String>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo33734a(Object obj) {
            return C17789c.f49534e.mo34600c((Type) obj);
        }
    };

    /* renamed from: b */
    public static final C17411g f49523b = C17411g.m42629a(", ").mo33739b(TEVideoRecorder.FACE_BEAUTY_NULL);

    /* renamed from: com.google.b.g.i$a */
    enum C17783a {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Class<?> mo34591a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Class<?> mo34591a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: c */
        static final C17783a f49527c = null;

        /* renamed from: com.google.b.g.i$a$a */
        class C17787a<T> {
            C17787a() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Class<?> mo34591a(Class<?> cls);

        static {
            int i;
            C17783a[] values;
            ParameterizedType parameterizedType = (ParameterizedType) new C17787a<String>() {
            }.getClass().getGenericSuperclass();
            for (C17783a aVar : values()) {
                if (aVar.mo34591a(C17787a.class) == parameterizedType.getOwnerType()) {
                    f49527c = aVar;
                    return;
                }
            }
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.b.g.i$b */
    static final class C17788b implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49529a;

        public final Type getGenericComponentType() {
            return this.f49529a;
        }

        public final int hashCode() {
            return this.f49529a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C17780i.m43649b(this.f49529a));
            sb.append("[]");
            return sb.toString();
        }

        C17788b(Type type) {
            this.f49529a = C17789c.f49534e.mo34599b(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return C17417i.m42646a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
    }

    /* renamed from: com.google.b.g.i$c */
    enum C17789c {
        JAVA6 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Type mo34597a(Type type) {
                return new C17788b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo34599b(Type type) {
                C17421k.m42653a(type);
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new C17788b(cls.getComponentType());
                    }
                }
                return type;
            }
        },
        JAVA7 {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo34599b(Type type) {
                return (Type) C17421k.m42653a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo34597a(Type type) {
                if (type instanceof Class) {
                    return C17780i.m43641a((Class) type);
                }
                return new C17788b(type);
            }
        },
        JAVA8 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo34597a(Type type) {
                return JAVA7.mo34597a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo34599b(Type type) {
                return JAVA7.mo34599b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final String mo34600c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        },
        JAVA9 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo34598a() {
                return false;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Type mo34597a(Type type) {
                return JAVA8.mo34597a(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type mo34599b(Type type) {
                return JAVA8.mo34599b(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final String mo34600c(Type type) {
                return JAVA8.mo34600c(type);
            }
        };
        

        /* renamed from: e */
        static final C17789c f49534e = null;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Type mo34597a(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo34598a() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Type mo34599b(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo34600c(Type type) {
            return C17780i.m43649b(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17530ab<Type> mo34596a(Type[] typeArr) {
            C17531a builder = C17530ab.builder();
            for (Type b : typeArr) {
                builder.mo33975b(mo34599b(b));
            }
            return builder.mo33969a();
        }
    }

    /* renamed from: com.google.b.g.i$d */
    static final class C17796d<X> {

        /* renamed from: a */
        static final boolean f49536a = (!C17796d.class.getTypeParameters()[0].equals(C17780i.m43646a(C17796d.class, "X", new Type[0])));

        C17796d() {
        }
    }

    /* renamed from: com.google.b.g.i$e */
    static final class C17797e implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49537a;

        /* renamed from: b */
        private final C17530ab<Type> f49538b;

        /* renamed from: c */
        private final Class<?> f49539c;

        public final Type getOwnerType() {
            return this.f49537a;
        }

        public final Type getRawType() {
            return this.f49539c;
        }

        public final Type[] getActualTypeArguments() {
            return C17780i.m43648a((Collection<Type>) this.f49538b);
        }

        public final int hashCode() {
            int i;
            if (this.f49537a == null) {
                i = 0;
            } else {
                i = this.f49537a.hashCode();
            }
            return (i ^ this.f49538b.hashCode()) ^ this.f49539c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f49537a != null && C17789c.f49534e.mo34598a()) {
                sb.append(C17789c.f49534e.mo34600c(this.f49537a));
                sb.append('.');
            }
            sb.append(this.f49539c.getName());
            sb.append('<');
            C17411g gVar = C17780i.f49523b;
            C17530ab<Type> abVar = this.f49538b;
            C17410f<Type, String> fVar = C17780i.f49522a;
            C17421k.m42653a(abVar);
            C17421k.m42653a(fVar);
            sb.append(gVar.mo33737a((Iterable<?>) new C17717s<T>(abVar, fVar) {

                /* renamed from: a */
                final /* synthetic */ Iterable f49261a;

                /* renamed from: b */
                final /* synthetic */ C17410f f49262b;

                public final Iterator<T> iterator() {
                    return C17586ap.m43267a(this.f49261a.iterator(), this.f49262b);
                }

                {
                    this.f49261a = r1;
                    this.f49262b = r2;
                }
            }));
            sb.append('>');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !C17417i.m42646a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        C17797e(Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            C17421k.m42653a(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            C17421k.m42659a(z);
            C17780i.m43647a(typeArr, "type parameter");
            this.f49537a = type;
            this.f49539c = cls;
            this.f49538b = C17789c.f49534e.mo34596a(typeArr);
        }
    }

    /* renamed from: com.google.b.g.i$f */
    static final class C17798f<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f49540a;

        /* renamed from: b */
        public final String f49541b;

        /* renamed from: c */
        private final C17530ab<Type> f49542c;

        public final String toString() {
            return this.f49541b;
        }

        public final int hashCode() {
            return this.f49540a.hashCode() ^ this.f49541b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (C17796d.f49536a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C17799g)) {
                    return false;
                }
                C17798f<?> fVar = ((C17799g) Proxy.getInvocationHandler(obj)).f49544a;
                if (!this.f49541b.equals(fVar.f49541b) || !this.f49540a.equals(fVar.f49540a) || !this.f49542c.equals(fVar.f49542c)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f49541b.equals(typeVariable.getName()) || !this.f49540a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
        }

        C17798f(D d, String str, Type[] typeArr) {
            C17780i.m43647a(typeArr, "bound for type variable");
            this.f49540a = (GenericDeclaration) C17421k.m42653a(d);
            this.f49541b = (String) C17421k.m42653a(str);
            this.f49542c = C17530ab.copyOf((E[]) typeArr);
        }
    }

    /* renamed from: com.google.b.g.i$g */
    static final class C17799g implements InvocationHandler {

        /* renamed from: b */
        private static final C17538ad<String, Method> f49543b;

        /* renamed from: a */
        public final C17798f<?> f49544a;

        static {
            Method[] methods;
            C17540a builder = C17538ad.builder();
            for (Method method : C17798f.class.getMethods()) {
                if (method.getDeclaringClass().equals(C17798f.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.mo34019a(method.getName(), method);
                }
            }
            f49543b = builder.mo34020a();
        }

        C17799g(C17798f<?> fVar) {
            this.f49544a = fVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f49543b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f49544a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* renamed from: com.google.b.g.i$h */
    static final class C17800h implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C17530ab<Type> f49545a;

        /* renamed from: b */
        private final C17530ab<Type> f49546b;

        public final Type[] getLowerBounds() {
            return C17780i.m43648a((Collection<Type>) this.f49545a);
        }

        public final Type[] getUpperBounds() {
            return C17780i.m43648a((Collection<Type>) this.f49546b);
        }

        public final int hashCode() {
            return this.f49545a.hashCode() ^ this.f49546b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            C17666bt it = this.f49545a.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb.append(" super ");
                sb.append(C17789c.f49534e.mo34600c(type));
            }
            for (Type type2 : C17583ao.m43256a((Iterable<T>) this.f49546b, (C17422l<? super T>) new C17427c<Object>(new C17426b(Object.class)))) {
                sb.append(" extends ");
                sb.append(C17789c.f49534e.mo34600c(type2));
            }
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f49545a.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f49546b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        C17800h(Type[] typeArr, Type[] typeArr2) {
            C17780i.m43647a(typeArr, "lower bound for wildcard");
            C17780i.m43647a(typeArr2, "upper bound for wildcard");
            this.f49545a = C17789c.f49534e.mo34596a(typeArr);
            this.f49546b = C17789c.f49534e.mo34596a(typeArr2);
        }
    }

    /* renamed from: a */
    static Class<?> m43641a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    static String m43649b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: d */
    private static WildcardType m43652d(Type type) {
        return new C17800h(new Type[0], new Type[]{type});
    }

    /* renamed from: c */
    static Type m43651c(Type type) {
        C17421k.m42653a(type);
        final AtomicReference atomicReference = new AtomicReference();
        new C17779h() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34540a(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34541a(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34543a(TypeVariable<?> typeVariable) {
                atomicReference.set(C17780i.m43645a(typeVariable.getBounds()));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34544a(WildcardType wildcardType) {
                atomicReference.set(C17780i.m43645a(wildcardType.getUpperBounds()));
            }
        }.mo34590a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: e */
    private static WildcardType m43653e(Type type) {
        return new C17800h(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: a */
    static Type m43644a(Type type) {
        boolean z;
        if (!(type instanceof WildcardType)) {
            return C17789c.f49534e.mo34597a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z2 = true;
        if (lowerBounds.length <= 1) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42660a(z, (Object) "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m43653e(m43644a(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z2 = false;
        }
        C17421k.m42660a(z2, (Object) "Wildcard should have only one upper bound.");
        return m43652d(m43644a(upperBounds[0]));
    }

    /* renamed from: a */
    public static Type m43645a(Type[] typeArr) {
        for (Type c : typeArr) {
            Type c2 = m43651c(c);
            if (c2 != null) {
                if (c2 instanceof Class) {
                    Class cls = (Class) c2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m43652d(c2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Type[] m43648a(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* renamed from: a */
    private static ParameterizedType m43642a(Class<?> cls, Type... typeArr) {
        return new C17797e(C17783a.f49527c.mo34591a(cls), cls, typeArr);
    }

    /* renamed from: a */
    public static void m43647a(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C17421k.m42665a(!cls2.isPrimitive(), "Primitive type '%s' used as %s", (Object) cls2, (Object) str);
            }
        }
    }

    /* renamed from: b */
    private static <D extends GenericDeclaration> TypeVariable<D> m43650b(D d, String str, Type[] typeArr) {
        return (TypeVariable) C17749c.m43567a(TypeVariable.class, new C17799g(new C17798f(d, str, typeArr)));
    }

    /* renamed from: a */
    static ParameterizedType m43643a(Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return m43642a(cls, typeArr);
        }
        C17421k.m42653a(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42664a(z, "Owner type for unenclosed %s", (Object) cls);
        return new C17797e(type, cls, typeArr);
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m43646a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m43650b(d, str, typeArr);
    }
}
