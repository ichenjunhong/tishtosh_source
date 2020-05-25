package com.google.p1057b.p1064g;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.b.g.b */
public abstract class C17746b<T, R> extends C17745a implements GenericDeclaration {

    /* renamed from: com.google.b.g.b$a */
    static class C17747a<T> extends C17746b<T, T> {

        /* renamed from: a */
        final Constructor<?> f49481a;

        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable[] typeParameters2 = this.f49481a.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.reflect.Type[] mo34530b() {
            /*
                r6 = this;
                java.lang.reflect.Constructor<?> r0 = r6.f49481a
                java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
                int r1 = r0.length
                if (r1 <= 0) goto L_0x005d
                java.lang.reflect.Constructor<?> r1 = r6.f49481a
                java.lang.Class r1 = r1.getDeclaringClass()
                java.lang.reflect.Constructor r2 = r1.getEnclosingConstructor()
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0019
            L_0x0017:
                r1 = 1
                goto L_0x003d
            L_0x0019:
                java.lang.reflect.Method r2 = r1.getEnclosingMethod()
                if (r2 == 0) goto L_0x002c
                int r1 = r2.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x002a
                goto L_0x0017
            L_0x002a:
                r1 = 0
                goto L_0x003d
            L_0x002c:
                java.lang.Class r2 = r1.getEnclosingClass()
                if (r2 == 0) goto L_0x002a
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x002a
                goto L_0x0017
            L_0x003d:
                if (r1 == 0) goto L_0x005d
                java.lang.reflect.Constructor<?> r1 = r6.f49481a
                java.lang.Class[] r1 = r1.getParameterTypes()
                int r2 = r0.length
                int r5 = r1.length
                if (r2 != r5) goto L_0x005d
                r1 = r1[r3]
                java.lang.Class r2 = r6.getDeclaringClass()
                java.lang.Class r2 = r2.getEnclosingClass()
                if (r1 != r2) goto L_0x005d
                int r1 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r4, r1)
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
            L_0x005d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1064g.C17746b.C17747a.mo34530b():java.lang.reflect.Type[]");
        }

        C17747a(Constructor<?> constructor) {
            super(constructor);
            this.f49481a = constructor;
        }
    }

    /* renamed from: com.google.b.g.b$b */
    static class C17748b<T> extends C17746b<T, Object> {

        /* renamed from: a */
        final Method f49482a;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Type[] mo34530b() {
            return this.f49482a.getGenericParameterTypes();
        }

        public final TypeVariable<?>[] getTypeParameters() {
            return this.f49482a.getTypeParameters();
        }

        C17748b(Method method) {
            super(method);
            this.f49482a = method;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Type[] mo34530b();

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public C17760g<T> mo34516a() {
        return C17760g.m43603of(getDeclaringClass());
    }

    <M extends AccessibleObject & Member> C17746b(M m) {
        super(m);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
