package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17421k;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* renamed from: com.google.b.g.a */
class C17745a extends AccessibleObject implements Member {

    /* renamed from: a */
    private final AccessibleObject f49479a;

    /* renamed from: b */
    private final Member f49480b;

    public final Annotation[] getAnnotations() {
        return this.f49479a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f49479a.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f49480b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f49480b.getModifiers();
    }

    public final String getName() {
        return this.f49480b.getName();
    }

    public int hashCode() {
        return this.f49480b.hashCode();
    }

    public final boolean isAccessible() {
        return this.f49479a.isAccessible();
    }

    public final boolean isSynthetic() {
        return this.f49480b.isSynthetic();
    }

    public String toString() {
        return this.f49480b.toString();
    }

    /* renamed from: a */
    public C17760g<?> mo34516a() {
        return C17760g.m43603of(getDeclaringClass());
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f49479a.getAnnotation(cls);
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f49479a.isAnnotationPresent(cls);
    }

    public final void setAccessible(boolean z) throws SecurityException {
        this.f49479a.setAccessible(z);
    }

    <M extends AccessibleObject & Member> C17745a(M m) {
        C17421k.m42653a(m);
        this.f49479a = m;
        this.f49480b = (Member) m;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17745a)) {
            return false;
        }
        C17745a aVar = (C17745a) obj;
        if (!mo34516a().equals(aVar.mo34516a()) || !this.f49480b.equals(aVar.f49480b)) {
            return false;
        }
        return true;
    }
}
