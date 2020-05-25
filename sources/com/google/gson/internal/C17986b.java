package com.google.gson.internal;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.gson.internal.b */
public final class C17986b {

    /* renamed from: a */
    static final Type[] f49936a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    static final class C17987a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49937a;

        public final Type getGenericComponentType() {
            return this.f49937a;
        }

        public final int hashCode() {
            return this.f49937a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C17986b.m44151c(this.f49937a));
            sb.append("[]");
            return sb.toString();
        }

        public C17987a(Type type) {
            this.f49937a = C17986b.m44143a(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C17986b.m44148a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    static final class C17988b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49938a;

        /* renamed from: b */
        private final Type f49939b;

        /* renamed from: c */
        private final Type[] f49940c;

        public final Type getOwnerType() {
            return this.f49938a;
        }

        public final Type getRawType() {
            return this.f49939b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f49940c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f49940c) ^ this.f49939b.hashCode();
            Type type = this.f49938a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            int length = this.f49940c.length;
            if (length == 0) {
                return C17986b.m44151c(this.f49939b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C17986b.m44151c(this.f49939b));
            sb.append("<");
            sb.append(C17986b.m44151c(this.f49940c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C17986b.m44151c(this.f49940c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C17986b.m44148a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public C17988b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C17982a.m44134a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C17986b.m44143a(type);
            }
            this.f49938a = type3;
            this.f49939b = C17986b.m44143a(type2);
            this.f49940c = (Type[]) typeArr.clone();
            int length = this.f49940c.length;
            for (int i = 0; i < length; i++) {
                C17982a.m44133a(this.f49940c[i]);
                C17986b.m44152d(this.f49940c[i]);
                Type[] typeArr2 = this.f49940c;
                typeArr2[i] = C17986b.m44143a(typeArr2[i]);
            }
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    static final class C17989c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f49941a;

        /* renamed from: b */
        private final Type f49942b;

        public final Type[] getLowerBounds() {
            if (this.f49942b == null) {
                return C17986b.f49936a;
            }
            return new Type[]{this.f49942b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f49941a};
        }

        public final int hashCode() {
            int i;
            if (this.f49942b != null) {
                i = this.f49942b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f49941a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f49942b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C17986b.m44151c(this.f49942b));
                return sb.toString();
            } else if (this.f49941a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C17986b.m44151c(this.f49941a));
                return sb2.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C17986b.m44148a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public C17989c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C17982a.m44134a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17982a.m44134a(z2);
            if (typeArr2.length == 1) {
                C17982a.m44133a(typeArr2[0]);
                C17986b.m44152d(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z3 = false;
                }
                C17982a.m44134a(z3);
                this.f49942b = C17986b.m44143a(typeArr2[0]);
                this.f49941a = Object.class;
                return;
            }
            C17982a.m44133a(typeArr[0]);
            C17986b.m44152d(typeArr[0]);
            this.f49942b = null;
            this.f49941a = C17986b.m44143a(typeArr[0]);
        }
    }

    /* renamed from: e */
    private static GenericArrayType m44153e(Type type) {
        return new C17987a(type);
    }

    /* renamed from: c */
    public static String m44151c(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: d */
    static void m44152d(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        C17982a.m44134a(z);
    }

    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m44143a(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m44143a(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.b$b r0 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.b$c r0 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C17986b.m44143a(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: b */
    public static Class<?> m44149b(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                C17982a.m44134a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m44149b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
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
        }
        return (Class) type;
    }

    /* renamed from: a */
    public static Type m44144a(Type type, Class<?> cls) {
        Type a = m44145a(type, cls, Collection.class);
        if (a instanceof WildcardType) {
            a = ((WildcardType) a).getUpperBounds()[0];
        }
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static boolean m44148a(Type type, Type type2) {
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
    public static ParameterizedType m44142a(Type type, Type type2, Type... typeArr) {
        return new C17988b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static Type m44146a(Type type, Class<?> cls, Type type2) {
        return m44147a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    public static Type m44145a(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C17982a.m44134a(cls2.isAssignableFrom(cls));
        return m44146a(type, cls, m44150b(type, cls, cls2));
    }

    /* renamed from: b */
    private static Type m44150b(Type type, Class<?> cls, Class<?> cls2) {
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
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r10v10, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m44147a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 == 0) goto L_0x0049
            java.lang.reflect.Type r2 = m44150b(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0049
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002d:
            if (r1 >= r3) goto L_0x0043
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0040
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004a
        L_0x0040:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0043:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x0049:
            r10 = r0
        L_0x004a:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004d:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006a
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006a
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m44147a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0065
            return r0
        L_0x0065:
            java.lang.reflect.GenericArrayType r8 = m44153e(r8)
            return r8
        L_0x006a:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0080
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m44147a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007b
            return r10
        L_0x007b:
            java.lang.reflect.GenericArrayType r8 = m44153e(r8)
            return r8
        L_0x0080:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c0
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m44147a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0099:
            if (r1 >= r5) goto L_0x00b4
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m44147a(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b1
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00af:
            r4[r1] = r6
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00b4:
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r8 = m44142a(r3, r8, r4)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011d
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00f7
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m44147a(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011c
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e6
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00eb
        L_0x00e6:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00eb:
            com.google.gson.internal.b$c r9 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00f7:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011c
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m44147a(r8, r9, r0, r11)     // Catch:{ Throwable -> 0x011e }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011c
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x010f
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0114
        L_0x010f:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0114:
            com.google.gson.internal.b$c r9 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r10 = f49936a
            r9.<init>(r8, r10)
            return r9
        L_0x011c:
            return r10
        L_0x011d:
            return r10
        L_0x011e:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C17986b.m44147a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
