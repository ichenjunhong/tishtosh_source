package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17411g;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import com.google.p1057b.p1060c.C17530ab;
import com.google.p1057b.p1060c.C17530ab.C17531a;
import com.google.p1057b.p1060c.C17538ad;
import com.google.p1057b.p1060c.C17570ak;
import com.google.p1057b.p1060c.C17570ak.C17571a;
import com.google.p1057b.p1060c.C17598as;
import com.google.p1057b.p1060c.C17638bb;
import com.google.p1057b.p1060c.C17666bt;
import com.google.p1057b.p1060c.C17717s;
import com.google.p1057b.p1060c.C17723x;
import com.google.p1057b.p1063f.C17744b;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.b.g.g */
public abstract class C17760g<T> extends C17750d<T> implements Serializable {

    /* renamed from: a */
    private transient C17752f f49497a;
    public final Type runtimeType;

    /* renamed from: com.google.b.g.g$a */
    static class C17764a {

        /* renamed from: a */
        private final Type[] f49502a;

        /* renamed from: b */
        private final boolean f49503b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo34579a(Type type) {
            for (Type of : this.f49502a) {
                if (C17760g.m43604of(of).isSubtypeOf(type) == this.f49503b) {
                    return this.f49503b;
                }
            }
            if (!this.f49503b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo34580b(Type type) {
            C17760g of = C17760g.m43604of(type);
            for (Type isSubtypeOf : this.f49502a) {
                if (of.isSubtypeOf(isSubtypeOf) == this.f49503b) {
                    return this.f49503b;
                }
            }
            if (!this.f49503b) {
                return true;
            }
            return false;
        }

        C17764a(Type[] typeArr, boolean z) {
            this.f49502a = typeArr;
            this.f49503b = z;
        }
    }

    /* renamed from: com.google.b.g.g$b */
    final class C17765b extends C17778g {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private transient C17570ak<C17760g<? super T>> f49505c;

        public final C17778g classes() {
            return this;
        }

        public final C17778g interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private Object readResolve() {
            return C17760g.this.getTypes().classes();
        }

        public final Set<Class<? super T>> rawTypes() {
            return C17570ak.copyOf((Collection<? extends E>) C17769e.f49511b.mo34586a().mo34584a((Iterable<? extends K>) C17760g.this.getRawTypes()));
        }

        public final Set<C17760g<? super T>> delegate() {
            C17570ak<C17760g<? super T>> akVar = this.f49505c;
            if (akVar != null) {
                return akVar;
            }
            C17570ak<C17760g<? super T>> a = C17717s.m43528a((Iterable<E>) C17769e.f49510a.mo34586a().mo34585a(C17760g.this)).mo34478a((C17422l<? super E>) C17775f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo34477a();
            this.f49505c = a;
            return a;
        }

        private C17765b() {
            super();
        }
    }

    /* renamed from: com.google.b.g.g$c */
    final class C17766c extends C17778g {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private final transient C17778g f49507c;

        /* renamed from: d */
        private transient C17570ak<C17760g<? super T>> f49508d;

        public final C17778g interfaces() {
            return this;
        }

        public final C17778g classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private Object readResolve() {
            return C17760g.this.getTypes().interfaces();
        }

        public final Set<C17760g<? super T>> delegate() {
            C17570ak<C17760g<? super T>> akVar = this.f49508d;
            if (akVar != null) {
                return akVar;
            }
            C17570ak<C17760g<? super T>> a = C17717s.m43528a((Iterable<E>) this.f49507c).mo34478a((C17422l<? super E>) C17775f.INTERFACE_ONLY).mo34477a();
            this.f49508d = a;
            return a;
        }

        public final Set<Class<? super T>> rawTypes() {
            return C17717s.m43528a((Iterable<E>) C17769e.f49511b.mo34584a((Iterable<? extends K>) C17760g.this.getRawTypes())).mo34478a((C17422l<? super E>) new C17422l<Class<?>>() {
                public final /* synthetic */ boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).mo34477a();
        }

        C17766c(C17778g gVar) {
            super();
            this.f49507c = gVar;
        }
    }

    /* renamed from: com.google.b.g.g$d */
    static final class C17768d<T> extends C17760g<T> {
        private static final long serialVersionUID = 0;

        C17768d(Type type) {
            super(type);
        }
    }

    /* renamed from: com.google.b.g.g$e */
    static abstract class C17769e<K> {

        /* renamed from: a */
        static final C17769e<C17760g<?>> f49510a = new C17769e<C17760g<?>>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ Class mo34587b(Object obj) {
                return ((C17760g) obj).getRawType();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ Object mo34589d(Object obj) {
                C17760g gVar = (C17760g) obj;
                if (gVar.runtimeType instanceof TypeVariable) {
                    return C17760g.m43600b(((TypeVariable) gVar.runtimeType).getBounds()[0]);
                }
                if (gVar.runtimeType instanceof WildcardType) {
                    return C17760g.m43600b(((WildcardType) gVar.runtimeType).getUpperBounds()[0]);
                }
                Type genericSuperclass = gVar.getRawType().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return gVar.mo34553a(genericSuperclass);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ Iterable mo34588c(Object obj) {
                C17760g gVar = (C17760g) obj;
                if (gVar.runtimeType instanceof TypeVariable) {
                    return C17760g.m43595a(((TypeVariable) gVar.runtimeType).getBounds());
                }
                if (gVar.runtimeType instanceof WildcardType) {
                    return C17760g.m43595a(((WildcardType) gVar.runtimeType).getUpperBounds());
                }
                C17531a builder = C17530ab.builder();
                for (Type a : gVar.getRawType().getGenericInterfaces()) {
                    builder.mo33975b(gVar.mo34553a(a));
                }
                return builder.mo33969a();
            }
        };

        /* renamed from: b */
        static final C17769e<Class<?>> f49511b = new C17769e<Class<?>>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Class mo34587b(Object obj) {
                return (Class) obj;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ Object mo34589d(Object obj) {
                return ((Class) obj).getSuperclass();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ Iterable mo34588c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }
        };

        /* renamed from: com.google.b.g.g$e$a */
        static class C17774a<K> extends C17769e<K> {

            /* renamed from: c */
            private final C17769e<K> f49515c;

            C17774a(C17769e<K> eVar) {
                super();
                this.f49515c = eVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Class<?> mo34587b(K k) {
                return this.f49515c.mo34587b(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Iterable<? extends K> mo34588c(K k) {
                return this.f49515c.mo34588c(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final K mo34589d(K k) {
                return this.f49515c.mo34589d(k);
            }
        }

        private C17769e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Class<?> mo34587b(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract Iterable<? extends K> mo34588c(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract K mo34589d(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17769e<K> mo34586a() {
            return new C17774a<K>(this) {
                /* access modifiers changed from: 0000 */
                /* renamed from: c */
                public final Iterable<? extends K> mo34588c(K k) {
                    return C17570ak.m43180of();
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final C17530ab<K> mo34584a(Iterable<? extends K> iterable) {
                    C17531a builder = C17530ab.builder();
                    for (Object next : iterable) {
                        if (!mo34587b(next).isInterface()) {
                            builder.mo33975b(next);
                        }
                    }
                    return super.mo34584a((Iterable<? extends K>) builder.mo33969a());
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17530ab<K> mo34585a(K k) {
            return mo34584a((Iterable<? extends K>) C17530ab.m43057of(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C17530ab<K> mo34584a(Iterable<? extends K> iterable) {
            final HashMap c = C17598as.m43289c();
            for (Object a : iterable) {
                m43617a(a, c);
            }
            final C17638bb a2 = C17638bb.m43359b().mo34218a();
            return new C17638bb<K>() {
                public final int compare(K k, K k2) {
                    return a2.compare(c.get(k), c.get(k2));
                }
            }.mo34234b(c.keySet());
        }

        /* renamed from: a */
        private int m43617a(K k, Map<? super K, Integer> map) {
            Integer num = (Integer) map.get(k);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo34587b(k).isInterface();
            for (Object a : mo34588c(k)) {
                isInterface = Math.max(isInterface, m43617a(a, map));
            }
            Object d = mo34589d(k);
            if (d != null) {
                isInterface = Math.max(isInterface, m43617a(d, map));
            }
            int i = isInterface + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }
    }

    /* renamed from: com.google.b.g.g$f */
    enum C17775f implements C17422l<C17760g<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C17760g gVar = (C17760g) obj;
                if ((gVar.runtimeType instanceof TypeVariable) || (gVar.runtimeType instanceof WildcardType)) {
                    return false;
                }
                return true;
            }
        },
        INTERFACE_ONLY {
            public final /* synthetic */ boolean apply(Object obj) {
                return ((C17760g) obj).getRawType().isInterface();
            }
        }
    }

    /* renamed from: com.google.b.g.g$g */
    public class C17778g extends C17723x<C17760g<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private transient C17570ak<C17760g<? super T>> f49519a;

        public C17778g interfaces() {
            return new C17766c(this);
        }

        public C17778g classes() {
            return new C17765b();
        }

        public Set<C17760g<? super T>> delegate() {
            C17570ak<C17760g<? super T>> akVar = this.f49519a;
            if (akVar != null) {
                return akVar;
            }
            C17570ak<C17760g<? super T>> a = C17717s.m43528a((Iterable<E>) C17769e.f49510a.mo34585a(C17760g.this)).mo34478a((C17422l<? super E>) C17775f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo34477a();
            this.f49519a = a;
            return a;
        }

        public Set<Class<? super T>> rawTypes() {
            return C17570ak.copyOf((Collection<? extends E>) C17769e.f49511b.mo34584a((Iterable<? extends K>) C17760g.this.getRawTypes()));
        }

        C17778g() {
        }
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final C17778g getTypes() {
        return new C17778g<>();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return C17780i.m43649b(this.runtimeType);
    }

    public final C17760g<?> getComponentType() {
        Type c = C17780i.m43651c(this.runtimeType);
        if (c == null) {
            return null;
        }
        return m43604of(c);
    }

    public final Class<? super T> getRawType() {
        return (Class) getRawTypes().iterator().next();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m43604of(new C17752f().mo34538a(this.runtimeType));
    }

    protected C17760g() {
        boolean z;
        this.runtimeType = mo34533a();
        if (!(this.runtimeType instanceof TypeVariable)) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42669b(z, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", this.runtimeType);
    }

    public C17570ak<Class<? super T>> getRawTypes() {
        final C17571a builder = C17570ak.builder();
        new C17779h() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34540a(Class<?> cls) {
                builder.mo33975b(cls);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34542a(ParameterizedType parameterizedType) {
                builder.mo33975b((Class) parameterizedType.getRawType());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34541a(GenericArrayType genericArrayType) {
                builder.mo33975b(C17780i.m43641a(C17760g.m43604of(genericArrayType.getGenericComponentType()).getRawType()));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34543a(TypeVariable<?> typeVariable) {
                mo34590a(typeVariable.getBounds());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo34544a(WildcardType wildcardType) {
                mo34590a(wildcardType.getUpperBounds());
            }
        }.mo34590a(this.runtimeType);
        return builder.mo34100a();
    }

    public final boolean isPrimitive() {
        if (!(this.runtimeType instanceof Class) || !((Class) this.runtimeType).isPrimitive()) {
            return false;
        }
        return true;
    }

    public final C17760g<T> wrap() {
        if (!isPrimitive()) {
            return this;
        }
        Class cls = (Class) this.runtimeType;
        C17421k.m42653a(cls);
        Class cls2 = (Class) C17744b.f49477a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return m43603of(cls);
    }

    public final C17760g<T> unwrap() {
        if (!C17744b.f49478b.keySet().contains(this.runtimeType)) {
            return this;
        }
        Class cls = (Class) this.runtimeType;
        C17421k.m42653a(cls);
        Class cls2 = (Class) C17744b.f49478b.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return m43603of(cls);
    }

    /* renamed from: b */
    private static C17764a m43598b(Type[] typeArr) {
        return new C17764a(typeArr, false);
    }

    /* renamed from: c */
    private static C17764a m43601c(Type[] typeArr) {
        return new C17764a(typeArr, true);
    }

    /* renamed from: of */
    public static <T> C17760g<T> m43603of(Class<T> cls) {
        return new C17768d(cls);
    }

    private C17760g(Type type) {
        this.runtimeType = (Type) C17421k.m42653a(type);
    }

    /* renamed from: c */
    private static Type m43602c(Type type) {
        return C17789c.JAVA7.mo34597a(type);
    }

    /* renamed from: of */
    public static C17760g<?> m43604of(Type type) {
        return new C17768d(type);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C17760g<?> mo34553a(Type type) {
        C17760g<?> resolveType = resolveType(type);
        resolveType.f49497a = this.f49497a;
        return resolveType;
    }

    public final boolean isSubtypeOf(C17760g<?> gVar) {
        return isSubtypeOf(gVar.getType());
    }

    public final boolean isSupertypeOf(C17760g<?> gVar) {
        return gVar.isSubtypeOf(getType());
    }

    /* renamed from: a */
    private boolean m43597a(Class<?> cls) {
        C17666bt it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static C17760g<? super T> m43600b(Type type) {
        C17760g<? super T> of = m43604of(type);
        if (of.getRawType().isInterface()) {
            return null;
        }
        return of;
    }

    public final C17746b<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42665a(z, "%s not declared by %s", (Object) constructor, (Object) getRawType());
        return new C17747a<T>(constructor) {
            /* renamed from: a */
            public final C17760g<T> mo34516a() {
                return C17760g.this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type[] mo34530b() {
                return C17760g.this.resolveInPlace(super.mo34530b());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(mo34516a());
                sb.append("(");
                sb.append(C17411g.m42629a(", ").mo33738a((Object[]) mo34530b()));
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17760g)) {
            return false;
        }
        return this.runtimeType.equals(((C17760g) obj).runtimeType);
    }

    public final boolean isSupertypeOf(Type type) {
        return m43604of(type).isSubtypeOf(getType());
    }

    public final C17746b<T, Object> method(Method method) {
        C17421k.m42665a(m43597a(method.getDeclaringClass()), "%s not declared by %s", (Object) method, (Object) this);
        return new C17748b<T>(method) {
            /* renamed from: a */
            public final C17760g<T> mo34516a() {
                return C17760g.this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final Type[] mo34530b() {
                return C17760g.this.resolveInPlace(super.mo34530b());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(mo34516a());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(super.toString());
                return sb.toString();
            }
        };
    }

    public Type[] resolveInPlace(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]).getType();
        }
        return typeArr;
    }

    /* renamed from: a */
    static C17530ab<C17760g<? super T>> m43595a(Type[] typeArr) {
        C17531a builder = C17530ab.builder();
        for (Type of : typeArr) {
            C17760g of2 = m43604of(of);
            if (of2.getRawType().isInterface()) {
                builder.mo33975b(of2);
            }
        }
        return builder.mo33969a();
    }

    public final C17760g<?> resolveType(Type type) {
        C17421k.m42653a(type);
        C17752f fVar = this.f49497a;
        if (fVar == null) {
            Type type2 = this.runtimeType;
            C17752f fVar2 = new C17752f();
            C17754a aVar = new C17754a();
            aVar.mo34590a(C17754a.f49487a.mo34551a(type2));
            fVar = fVar2.mo34537a((Map<C17757c, ? extends Type>) C17538ad.copyOf(aVar.f49488b));
            this.f49497a = fVar;
        }
        return m43604of(fVar.mo34538a(type));
    }

    /* renamed from: b */
    private static <T> C17760g<? extends T> m43599b(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return m43604of(C17780i.m43644a(m43599b(cls.getComponentType()).runtimeType));
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            type = null;
        } else {
            type = m43599b(cls.getEnclosingClass()).runtimeType;
        }
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return m43604of((Type) C17780i.m43643a(type, cls, (Type[]) typeParameters));
        }
        return m43603of(cls);
    }

    public final C17760g<? super T> getSupertype(Class<? super T> cls) {
        C17421k.m42665a(m43597a(cls), "%s is not a super class of %s", (Object) cls, (Object) this);
        if (this.runtimeType instanceof TypeVariable) {
            return m43596a(cls, ((TypeVariable) this.runtimeType).getBounds());
        }
        if (this.runtimeType instanceof WildcardType) {
            return m43596a(cls, ((WildcardType) this.runtimeType).getUpperBounds());
        }
        if (!cls.isArray()) {
            return mo34553a(m43599b(cls).runtimeType);
        }
        C17760g componentType = getComponentType();
        if (componentType != null) {
            return m43604of(m43602c(componentType.getSupertype(cls.getComponentType()).runtimeType));
        }
        throw new NullPointerException(C17421k.m42657a("%s isn't a super type of %s", cls, this));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p1057b.p1064g.C17760g<? extends T> getSubtype(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 != 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.String r2 = "Cannot get subtype of type variable <%s>"
            com.google.p1057b.p1058a.C17421k.m42664a(r0, r2, r4)
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.Type r0 = r4.runtimeType
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x002b
            r0 = r0[r1]
            com.google.b.g.g r0 = m43604of(r0)
            com.google.b.g.g r5 = r0.getSubtype(r5)
            return r5
        L_0x002b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " isn't a subclass of "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0045:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x0062
            com.google.b.g.g r0 = r4.getComponentType()
            java.lang.Class r5 = r5.getComponentType()
            com.google.b.g.g r5 = r0.getSubtype(r5)
            java.lang.reflect.Type r5 = r5.runtimeType
            java.lang.reflect.Type r5 = m43602c(r5)
            com.google.b.g.g r5 = m43604of(r5)
            return r5
        L_0x0062:
            java.lang.Class r0 = r4.getRawType()
            boolean r0 = r0.isAssignableFrom(r5)
            java.lang.String r1 = "%s isn't a subclass of %s"
            com.google.p1057b.p1058a.C17421k.m42665a(r0, r1, r5, r4)
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0088
            java.lang.reflect.TypeVariable[] r0 = r5.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L_0x00ba
            java.lang.Class r0 = r4.getRawType()
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L_0x0088
            goto L_0x00ba
        L_0x0088:
            com.google.b.g.g r5 = m43599b(r5)
            java.lang.Class r0 = r4.getRawType()
            com.google.b.g.g r0 = r5.getSupertype(r0)
            java.lang.reflect.Type r0 = r0.runtimeType
            com.google.b.g.f r1 = new com.google.b.g.f
            r1.<init>()
            java.lang.reflect.Type r2 = r4.runtimeType
            java.util.HashMap r3 = com.google.p1057b.p1060c.C17598as.m43289c()
            java.lang.Object r0 = com.google.p1057b.p1058a.C17421k.m42653a(r0)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            java.lang.Object r2 = com.google.p1057b.p1058a.C17421k.m42653a(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            com.google.p1057b.p1064g.C17752f.m43570a(r3, r0, r2)
            com.google.b.g.f r0 = r1.mo34537a(r3)
            java.lang.reflect.Type r5 = r5.runtimeType
            java.lang.reflect.Type r5 = r0.mo34538a(r5)
        L_0x00ba:
            com.google.b.g.g r5 = m43604of(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1064g.C17760g.getSubtype(java.lang.Class):com.google.b.g.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        if (m43598b(r6.getLowerBounds()).mo34579a(r5.runtimeType) != false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d A[LOOP:0: B:40:0x00ce->B:53:0x010d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016f A[EDGE_INSN: B:94:0x016f->B:75:0x016f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSubtypeOf(java.lang.reflect.Type r10) {
        /*
            r9 = this;
            com.google.p1057b.p1058a.C17421k.m42653a(r10)
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0018
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r10 = r10.getLowerBounds()
            com.google.b.g.g$a r10 = m43601c(r10)
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r10 = r10.mo34580b(r0)
            return r10
        L_0x0018:
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x002f
            java.lang.reflect.Type r0 = r9.runtimeType
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            com.google.b.g.g$a r0 = m43601c(r0)
            boolean r10 = r0.mo34579a(r10)
            return r10
        L_0x002f:
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0054
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0053
            java.lang.reflect.Type r0 = r9.runtimeType
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            com.google.b.g.g$a r0 = m43601c(r0)
            boolean r10 = r0.mo34579a(r10)
            if (r10 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            return r2
        L_0x0053:
            return r1
        L_0x0054:
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x00a6
            com.google.b.g.g r10 = m43604of(r10)
            java.lang.reflect.Type r0 = r9.runtimeType
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r1 = r10.runtimeType
            boolean r1 = r1 instanceof java.lang.Class
            if (r1 == 0) goto L_0x008a
            java.lang.reflect.Type r10 = r10.runtimeType
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r1 = r10.isArray()
            if (r1 != 0) goto L_0x0079
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            boolean r10 = r10.isAssignableFrom(r0)
            return r10
        L_0x0079:
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.b.g.g r0 = m43604of(r0)
            java.lang.Class r10 = r10.getComponentType()
            boolean r10 = r0.isSubtypeOf(r10)
            return r10
        L_0x008a:
            java.lang.reflect.Type r1 = r10.runtimeType
            boolean r1 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x00a5
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.b.g.g r0 = m43604of(r0)
            java.lang.reflect.Type r10 = r10.runtimeType
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r10 = r10.getGenericComponentType()
            boolean r10 = r0.isSubtypeOf(r10)
            return r10
        L_0x00a5:
            return r2
        L_0x00a6:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x00b1
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r10 = r9.m43597a(r10)
            return r10
        L_0x00b1:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0170
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            com.google.b.g.g r0 = m43604of(r10)
            java.lang.Class r0 = r0.getRawType()
            boolean r3 = r9.m43597a(r0)
            if (r3 == 0) goto L_0x016f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.reflect.Type[] r3 = r10.getActualTypeArguments()
            r4 = 0
        L_0x00ce:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x0110
            r5 = r0[r4]
            com.google.b.g.g r5 = r9.resolveType(r5)
            r6 = r3[r4]
            java.lang.reflect.Type r7 = r5.runtimeType
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00e3
        L_0x00e1:
            r5 = 1
            goto L_0x010b
        L_0x00e3:
            boolean r7 = r6 instanceof java.lang.reflect.WildcardType
            if (r7 == 0) goto L_0x010a
            java.lang.reflect.WildcardType r6 = (java.lang.reflect.WildcardType) r6
            java.lang.reflect.Type[] r7 = r6.getUpperBounds()
            com.google.b.g.g$a r7 = m43598b(r7)
            java.lang.reflect.Type r8 = r5.runtimeType
            boolean r7 = r7.mo34580b(r8)
            if (r7 == 0) goto L_0x010a
            java.lang.reflect.Type[] r6 = r6.getLowerBounds()
            com.google.b.g.g$a r6 = m43598b(r6)
            java.lang.reflect.Type r5 = r5.runtimeType
            boolean r5 = r6.mo34579a(r5)
            if (r5 == 0) goto L_0x010a
            goto L_0x00e1
        L_0x010a:
            r5 = 0
        L_0x010b:
            if (r5 == 0) goto L_0x016f
            int r4 = r4 + 1
            goto L_0x00ce
        L_0x0110:
            java.lang.reflect.Type r0 = r10.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x016e
            java.lang.reflect.Type r0 = r10.getOwnerType()
            if (r0 == 0) goto L_0x016e
            java.lang.reflect.Type r10 = r10.getOwnerType()
            com.google.b.g.g$g r0 = r9.getTypes()
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x016b
            java.lang.Object r3 = r0.next()
            com.google.b.g.g r3 = (com.google.p1057b.p1064g.C17760g) r3
            java.lang.reflect.Type r4 = r3.runtimeType
            boolean r4 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x014d
            java.lang.reflect.Type r3 = r3.runtimeType
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getOwnerType()
            goto L_0x015d
        L_0x014d:
            java.lang.reflect.Type r4 = r3.runtimeType
            boolean r4 = r4 instanceof java.lang.Class
            if (r4 == 0) goto L_0x015c
            java.lang.reflect.Type r3 = r3.runtimeType
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class r3 = r3.getEnclosingClass()
            goto L_0x015d
        L_0x015c:
            r3 = 0
        L_0x015d:
            if (r3 == 0) goto L_0x0132
            com.google.b.g.g r3 = m43604of(r3)
            boolean r3 = r3.isSubtypeOf(r10)
            if (r3 == 0) goto L_0x0132
            r10 = 1
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 == 0) goto L_0x016f
        L_0x016e:
            return r1
        L_0x016f:
            return r2
        L_0x0170:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x01b3
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0197
            java.lang.reflect.Type r0 = r9.runtimeType
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x01b2
            java.lang.Class r0 = r0.getComponentType()
            com.google.b.g.g r0 = m43603of(r0)
            java.lang.reflect.Type r10 = r10.getGenericComponentType()
            boolean r10 = r0.isSubtypeOf(r10)
            return r10
        L_0x0197:
            java.lang.reflect.Type r0 = r9.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x01b2
            java.lang.reflect.Type r0 = r9.runtimeType
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.b.g.g r0 = m43604of(r0)
            java.lang.reflect.Type r10 = r10.getGenericComponentType()
            boolean r10 = r0.isSubtypeOf(r10)     // Catch:{ Throwable -> 0x01b4 }
            return r10
        L_0x01b2:
            return r2
        L_0x01b3:
            return r2
        L_0x01b4:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1064g.C17760g.isSubtypeOf(java.lang.reflect.Type):boolean");
    }

    public final <X> C17760g<T> where(C17751e<X> eVar, Class<X> cls) {
        return where(eVar, m43603of(cls));
    }

    public final <X> C17760g<T> where(C17751e<X> eVar, C17760g<X> gVar) {
        return new C17768d(new C17752f().mo34537a((Map<C17757c, ? extends Type>) C17538ad.m43098of(new C17757c(eVar.f49483a), gVar.runtimeType)).mo34538a(this.runtimeType));
    }

    /* renamed from: a */
    private C17760g<? super T> m43596a(Class<? super T> cls, Type[] typeArr) {
        for (Type of : typeArr) {
            C17760g of2 = m43604of(of);
            if (of2.isSubtypeOf((Type) cls)) {
                return of2.getSupertype(cls);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" isn't a super type of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
}
