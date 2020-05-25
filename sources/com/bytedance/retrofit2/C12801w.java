package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import okhttp3.C53500ac;
import okio.BufferedSink;
import okio.Okio;

/* renamed from: com.bytedance.retrofit2.w */
public final class C12801w {

    /* renamed from: a */
    static final Type[] f33555a = new Type[0];

    /* renamed from: com.bytedance.retrofit2.w$a */
    static final class C12803a implements GenericArrayType {

        /* renamed from: a */
        private final Type f33557a;

        public final Type getGenericComponentType() {
            return this.f33557a;
        }

        public final int hashCode() {
            return this.f33557a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C12801w.m25703b(this.f33557a));
            sb.append("[]");
            return sb.toString();
        }

        public C12803a(Type type) {
            this.f33557a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C12801w.m25702a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.retrofit2.w$b */
    static final class C12804b implements ParameterizedType {

        /* renamed from: a */
        private final Type f33558a;

        /* renamed from: b */
        private final Type f33559b;

        /* renamed from: c */
        private final Type[] f33560c;

        public final Type getOwnerType() {
            return this.f33558a;
        }

        public final Type getRawType() {
            return this.f33559b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f33560c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f33560c) ^ this.f33559b.hashCode();
            Type type = this.f33558a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f33560c.length + 1) * 30);
            sb.append(C12801w.m25703b(this.f33559b));
            if (this.f33560c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C12801w.m25703b(this.f33560c[0]));
            for (int i = 1; i < this.f33560c.length; i++) {
                sb.append(", ");
                sb.append(C12801w.m25703b(this.f33560c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C12801w.m25702a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public C12804b(Type type, Type type2, Type... typeArr) {
            boolean z;
            int i = 0;
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
            this.f33558a = type;
            this.f33559b = type2;
            this.f33560c = (Type[]) typeArr.clone();
            Type[] typeArr2 = this.f33560c;
            int length = typeArr2.length;
            while (i < length) {
                Type type3 = typeArr2[i];
                if (type3 != null) {
                    C12801w.m25705c(type3);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.w$c */
    static final class C12805c implements WildcardType {

        /* renamed from: a */
        private final Type f33561a;

        /* renamed from: b */
        private final Type f33562b;

        public final Type[] getLowerBounds() {
            if (this.f33562b == null) {
                return C12801w.f33555a;
            }
            return new Type[]{this.f33562b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f33561a};
        }

        public final int hashCode() {
            int i;
            if (this.f33562b != null) {
                i = this.f33562b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f33561a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f33562b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C12801w.m25703b(this.f33562b));
                return sb.toString();
            } else if (this.f33561a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C12801w.m25703b(this.f33561a));
                return sb2.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C12801w.m25702a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public C12805c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C12801w.m25705c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f33562b = typeArr2[0];
                        this.f33561a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C12801w.m25705c(typeArr[0]);
                this.f33562b = null;
                this.f33561a = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }
    }

    /* renamed from: a */
    public static TypedOutput m25694a(final C53500ac acVar) {
        return new TypedOutput() {
            public final String fileName() {
                return null;
            }

            public final String md5Stub() {
                return null;
            }

            public final long length() {
                try {
                    return acVar.contentLength();
                } catch (Throwable unused) {
                    return -1;
                }
            }

            public final String mimeType() {
                if (acVar.contentType() != null) {
                    return acVar.contentType().toString();
                }
                return "";
            }

            public final void writeTo(OutputStream outputStream) throws IOException {
                BufferedSink buffer = Okio.buffer(Okio.sink(outputStream));
                acVar.writeTo(buffer);
                buffer.flush();
                buffer.close();
            }
        };
    }

    /* renamed from: b */
    static String m25703b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m25705c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    static Type m25707e(Type type) {
        if (type instanceof ParameterizedType) {
            return m25697a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    static Class<?> m25695a(Type type) {
        while (type != null) {
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
                return Array.newInstance(m25695a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
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
        throw new NullPointerException("type == null");
    }

    /* renamed from: d */
    static boolean m25706d(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m25706d(d)) {
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
    static <T> void m25700a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    public static boolean m25701a(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static <T> T m25696a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static Type m25697a(int i, ParameterizedType parameterizedType) {
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
    static boolean m25702a(Type type, Type type2) {
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
    static Type m25698a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m25699a(type, cls, m25704b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private static Type m25704b(Type type, Class<?> cls, Class<?> cls2) {
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
    private static java.lang.reflect.Type m25699a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
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
            java.lang.reflect.Type r2 = m25704b(r8, r9, r0)
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
            java.lang.reflect.Type r8 = m25699a(r8, r9, r10)
            if (r10 != r8) goto L_0x005c
            return r0
        L_0x005c:
            com.bytedance.retrofit2.w$a r9 = new com.bytedance.retrofit2.w$a
            r9.<init>(r8)
            return r9
        L_0x0062:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0079
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m25699a(r8, r9, r0)
            if (r0 != r8) goto L_0x0073
            return r10
        L_0x0073:
            com.bytedance.retrofit2.w$a r9 = new com.bytedance.retrofit2.w$a
            r9.<init>(r8)
            return r9
        L_0x0079:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m25699a(r8, r9, r0)
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
            java.lang.reflect.Type r6 = m25699a(r8, r9, r6)
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
            com.bytedance.retrofit2.w$b r8 = new com.bytedance.retrofit2.w$b
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
            java.lang.reflect.Type r8 = m25699a(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00fe
            com.bytedance.retrofit2.w$c r9 = new com.bytedance.retrofit2.w$c
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
            java.lang.reflect.Type r8 = m25699a(r8, r9, r0)     // Catch:{ Throwable -> 0x0100 }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00fe
            com.bytedance.retrofit2.w$c r9 = new com.bytedance.retrofit2.w$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f33555a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.C12801w.m25699a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
