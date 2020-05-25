package p2666g;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import okhttp3.C53506ae;
import okio.Buffer;

/* renamed from: g.p */
final class C53139p {

    /* renamed from: a */
    static final Type[] f131692a = new Type[0];

    /* renamed from: g.p$a */
    static final class C53140a implements GenericArrayType {

        /* renamed from: a */
        private final Type f131693a;

        public final Type getGenericComponentType() {
            return this.f131693a;
        }

        public final int hashCode() {
            return this.f131693a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C53139p.m112964b(this.f131693a));
            sb.append("[]");
            return sb.toString();
        }

        C53140a(Type type) {
            this.f131693a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C53139p.m112963a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: g.p$b */
    static final class C53141b implements ParameterizedType {

        /* renamed from: a */
        private final Type f131694a;

        /* renamed from: b */
        private final Type f131695b;

        /* renamed from: c */
        private final Type[] f131696c;

        public final Type getOwnerType() {
            return this.f131694a;
        }

        public final Type getRawType() {
            return this.f131695b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f131696c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f131696c) ^ this.f131695b.hashCode();
            Type type = this.f131694a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            if (this.f131696c.length == 0) {
                return C53139p.m112964b(this.f131695b);
            }
            StringBuilder sb = new StringBuilder((this.f131696c.length + 1) * 30);
            sb.append(C53139p.m112964b(this.f131695b));
            sb.append("<");
            sb.append(C53139p.m112964b(this.f131696c[0]));
            for (int i = 1; i < this.f131696c.length; i++) {
                sb.append(", ");
                sb.append(C53139p.m112964b(this.f131696c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C53139p.m112963a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        C53141b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Class) type2).getEnclosingClass() != null) {
                    z2 = false;
                }
                if (z != z2) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                C53139p.m112957a(type3, "typeArgument == null");
                C53139p.m112966c(type3);
            }
            this.f131694a = type;
            this.f131695b = type2;
            this.f131696c = (Type[]) typeArr.clone();
        }
    }

    /* renamed from: g.p$c */
    static final class C53142c implements WildcardType {

        /* renamed from: a */
        private final Type f131697a;

        /* renamed from: b */
        private final Type f131698b;

        public final Type[] getLowerBounds() {
            if (this.f131698b == null) {
                return C53139p.f131692a;
            }
            return new Type[]{this.f131698b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f131697a};
        }

        public final int hashCode() {
            int i;
            if (this.f131698b != null) {
                i = this.f131698b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f131697a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f131698b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C53139p.m112964b(this.f131698b));
                return sb.toString();
            } else if (this.f131697a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C53139p.m112964b(this.f131697a));
                return sb2.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C53139p.m112963a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        C53142c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C53139p.m112966c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f131698b = typeArr2[0];
                        this.f131697a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C53139p.m112966c(typeArr[0]);
                this.f131698b = null;
                this.f131697a = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }
    }

    /* renamed from: b */
    static String m112964b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m112966c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    static Type m112968e(Type type) {
        if (type instanceof ParameterizedType) {
            return m112958a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    static Class<?> m112956a(Type type) {
        while (true) {
            m112957a((T) type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m112956a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(type.getClass().getName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    /* renamed from: d */
    static boolean m112967d(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m112967d(d)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                if (type == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                } else {
                    str = type.getClass().getName();
                }
                StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }

    /* renamed from: a */
    static C53506ae m112961a(C53506ae aeVar) throws IOException {
        Buffer buffer = new Buffer();
        aeVar.source().readAll(buffer);
        return C53506ae.create(aeVar.contentType(), aeVar.contentLength(), buffer);
    }

    /* renamed from: a */
    static <T> void m112962a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static <T> T m112957a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static Type m112958a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    /* renamed from: a */
    static boolean m112963a(Type type, Type type2) {
        boolean z;
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) type2;
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = genericArrayType.getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    static Type m112959a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m112960a(type, cls, m112965b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private static Type m112965b(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i = 0;
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i])) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[LOOP:0: B:0:0x0000->B:21:0x0042, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0041 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m112960a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x003e
            java.lang.reflect.Type r2 = m112965b(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003e
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0021:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0038
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x003f
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0038:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003e:
            r0 = r10
        L_0x003f:
            if (r0 != r10) goto L_0x0042
            return r0
        L_0x0042:
            r10 = r0
            goto L_0x0000
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0062
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m112960a(r8, r9, r10)
            if (r10 != r8) goto L_0x005c
            return r0
        L_0x005c:
            g.p$a r9 = new g.p$a
            r9.<init>(r8)
            return r9
        L_0x0062:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0079
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m112960a(r8, r9, r0)
            if (r0 != r8) goto L_0x0073
            return r10
        L_0x0073:
            g.p$a r9 = new g.p$a
            r9.<init>(r8)
            return r9
        L_0x0079:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m112960a(r8, r9, r0)
            if (r3 == r0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0092:
            if (r1 >= r5) goto L_0x00ad
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m112960a(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00aa
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a8:
            r4[r1] = r6
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0092
        L_0x00ad:
            if (r0 == 0) goto L_0x00b9
            g.p$b r8 = new g.p$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            return r8
        L_0x00b9:
            return r10
        L_0x00ba:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ff
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e5
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m112960a(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00fe
            g.p$c r9 = new g.p$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e5:
            int r0 = r3.length
            if (r0 != r2) goto L_0x00fe
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m112960a(r8, r9, r0)     // Catch:{ Throwable -> 0x0100 }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00fe
            g.p$c r9 = new g.p$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f131692a
            r9.<init>(r10, r8)
            return r9
        L_0x00fe:
            return r10
        L_0x00ff:
            return r10
        L_0x0100:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p2666g.C53139p.m112960a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
