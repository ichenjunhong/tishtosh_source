package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17411g;
import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17538ad;
import com.google.p1057b.p1060c.C17538ad.C17540a;
import com.google.p1057b.p1060c.C17598as;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.b.g.f */
public final class C17752f {

    /* renamed from: a */
    private final C17755b f49484a;

    /* renamed from: com.google.b.g.f$a */
    static final class C17754a extends C17779h {

        /* renamed from: a */
        static final C17758d f49487a = new C17758d();

        /* renamed from: b */
        final Map<C17757c, Type> f49488b = C17598as.m43289c();

        C17754a() {
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

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34540a(Class<?> cls) {
            mo34590a(cls.getGenericSuperclass());
            mo34590a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34542a(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            C17421k.m42667b(z);
            for (int i = 0; i < typeParameters.length; i++) {
                C17757c cVar = new C17757c(typeParameters[i]);
                Type type = actualTypeArguments[i];
                if (!this.f49488b.containsKey(cVar)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            this.f49488b.put(cVar, type);
                            break;
                        } else if (cVar.mo34547b(type2)) {
                            while (type != null) {
                                type = (Type) this.f49488b.remove(C17757c.m43586a(type));
                            }
                        } else {
                            type2 = (Type) this.f49488b.get(C17757c.m43586a(type2));
                        }
                    }
                }
            }
            mo34590a(cls);
            mo34590a(parameterizedType.getOwnerType());
        }
    }

    /* renamed from: com.google.b.g.f$b */
    static class C17755b {

        /* renamed from: a */
        private final C17538ad<C17757c, Type> f49489a;

        C17755b() {
            this.f49489a = C17538ad.m43097of();
        }

        private C17755b(C17538ad<C17757c, Type> adVar) {
            this.f49489a = adVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17755b mo34545a(Map<C17757c, ? extends Type> map) {
            C17540a builder = C17538ad.builder();
            builder.mo34018a((Iterable<? extends Entry<? extends K, ? extends V>>) this.f49489a.entrySet());
            for (Entry entry : map.entrySet()) {
                C17757c cVar = (C17757c) entry.getKey();
                Type type = (Type) entry.getValue();
                C17421k.m42664a(!cVar.mo34547b(type), "Type variable %s bound to itself", (Object) cVar);
                builder.mo34019a(cVar, type);
            }
            return new C17755b(builder.mo34020a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Type mo34546a(TypeVariable<?> typeVariable, C17755b bVar) {
            Type type = (Type) this.f49489a.get(new C17757c(typeVariable));
            if (type != null) {
                return new C17752f(bVar).mo34538a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C17752f(bVar).mo34539a(bounds);
            if (!C17796d.f49536a || !Arrays.equals(bounds, a)) {
                return C17780i.m43646a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
            }
            return typeVariable;
        }
    }

    /* renamed from: com.google.b.g.f$c */
    static final class C17757c {

        /* renamed from: a */
        private final TypeVariable<?> f49493a;

        public final String toString() {
            return this.f49493a.toString();
        }

        public final int hashCode() {
            return C17417i.m42645a(this.f49493a.getGenericDeclaration(), this.f49493a.getName());
        }

        C17757c(TypeVariable<?> typeVariable) {
            this.f49493a = (TypeVariable) C17421k.m42653a(typeVariable);
        }

        /* renamed from: a */
        static C17757c m43586a(Type type) {
            if (type instanceof TypeVariable) {
                return new C17757c((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo34547b(Type type) {
            if (type instanceof TypeVariable) {
                return m43587a((TypeVariable) type);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C17757c) {
                return m43587a(((C17757c) obj).f49493a);
            }
            return false;
        }

        /* renamed from: a */
        private boolean m43587a(TypeVariable<?> typeVariable) {
            if (!this.f49493a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || !this.f49493a.getName().equals(typeVariable.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.b.g.f$d */
    static class C17758d {

        /* renamed from: a */
        private final AtomicInteger f49494a;

        /* renamed from: a */
        private C17758d m43589a() {
            return new C17758d(this.f49494a);
        }

        C17758d() {
            this(new AtomicInteger());
        }

        private C17758d(AtomicInteger atomicInteger) {
            this.f49494a = atomicInteger;
        }

        /* renamed from: a */
        private C17758d m43590a(final TypeVariable<?> typeVariable) {
            return new C17758d(this.f49494a) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final TypeVariable<?> mo34552a(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.mo34552a((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        /* renamed from: b */
        private Type m43591b(Type type) {
            if (type == null) {
                return null;
            }
            return mo34551a(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public TypeVariable<?> mo34552a(Type[] typeArr) {
            StringBuilder sb = new StringBuilder("capture#");
            sb.append(this.f49494a.incrementAndGet());
            sb.append("-of ? extends ");
            sb.append(new C17411g("&").mo33738a((Object[]) typeArr));
            return C17780i.m43646a(C17758d.class, sb.toString(), typeArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Type mo34551a(Type type) {
            C17421k.m42653a(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C17780i.m43644a(m43589a().mo34551a(((GenericArrayType) type).getGenericComponentType()));
            } else if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = m43590a(typeParameters[i]).mo34551a(actualTypeArguments[i]);
                }
                return C17780i.m43643a(m43589a().m43591b(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return mo34552a(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }
    }

    public C17752f() {
        this.f49484a = new C17755b();
    }

    private C17752f(C17755b bVar) {
        this.f49484a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17752f mo34537a(Map<C17757c, ? extends Type> map) {
        return new C17752f(this.f49484a.mo34545a(map));
    }

    /* renamed from: a */
    public final Type mo34538a(Type type) {
        Type type2;
        C17421k.m42653a(type);
        if (type instanceof TypeVariable) {
            C17755b bVar = this.f49484a;
            TypeVariable typeVariable = (TypeVariable) type;
            return bVar.mo34546a(typeVariable, new C17755b(typeVariable, bVar) {

                /* renamed from: a */
                final /* synthetic */ TypeVariable f49490a;

                /* renamed from: b */
                final /* synthetic */ C17755b f49491b;

                /* renamed from: a */
                public final Type mo34546a(TypeVariable<?> typeVariable, C17755b bVar) {
                    if (typeVariable.getGenericDeclaration().equals(this.f49490a.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.f49491b.mo34546a(typeVariable, bVar);
                }

                {
                    this.f49490a = r2;
                    this.f49491b = r3;
                }
            });
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                type2 = null;
            } else {
                type2 = mo34538a(ownerType);
            }
            return C17780i.m43643a(type2, (Class) mo34538a(parameterizedType.getRawType()), mo34539a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return C17780i.m43644a(mo34538a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C17800h(mo34539a(wildcardType.getLowerBounds()), mo34539a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: a */
    public final Type[] mo34539a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo34538a(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: a */
    public static <T> T m43569a(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" is not a ");
            sb.append(cls.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m43570a(final Map<C17757c, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new C17779h() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo34543a(TypeVariable<?> typeVariable) {
                    map.put(new C17757c(typeVariable), type2);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo34540a(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        StringBuilder sb = new StringBuilder("No type mapping from ");
                        sb.append(cls);
                        sb.append(" to ");
                        sb.append(type2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo34541a(GenericArrayType genericArrayType) {
                    boolean z;
                    if (!(type2 instanceof WildcardType)) {
                        Type c = C17780i.m43651c(type2);
                        if (c != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17421k.m42664a(z, "%s is not an array type.", (Object) type2);
                        C17752f.m43570a(map, genericArrayType.getGenericComponentType(), c);
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo34542a(ParameterizedType parameterizedType) {
                    boolean z;
                    if (!(type2 instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) C17752f.m43569a(ParameterizedType.class, type2);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            C17752f.m43570a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        C17421k.m42665a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", (Object) parameterizedType, (Object) type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        if (actualTypeArguments.length == actualTypeArguments2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17421k.m42665a(z, "%s not compatible with %s", (Object) parameterizedType, (Object) parameterizedType2);
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            C17752f.m43570a(map, actualTypeArguments[i], actualTypeArguments2[i]);
                        }
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final void mo34544a(WildcardType wildcardType) {
                    boolean z;
                    if (type2 instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17421k.m42665a(z, "Incompatible type: %s vs. %s", (Object) wildcardType, (Object) type2);
                        for (int i = 0; i < upperBounds.length; i++) {
                            C17752f.m43570a(map, upperBounds[i], upperBounds2[i]);
                        }
                        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                            C17752f.m43570a(map, lowerBounds[i2], lowerBounds2[i2]);
                        }
                    }
                }
            }.mo34590a(type);
        }
    }
}
