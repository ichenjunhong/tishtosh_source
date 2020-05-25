package com.google.android.play.core.p1051c;

import com.C2240a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.play.core.c.y */
public final class C17312y<T> {

    /* renamed from: a */
    private final Object f48776a;

    /* renamed from: b */
    private final Field f48777b;

    /* renamed from: c */
    private final Class<T> f48778c;

    C17312y(Object obj, Field field, Class<T> cls) {
        this.f48776a = obj;
        this.f48777b = field;
        this.f48778c = cls;
    }

    /* renamed from: a */
    private void m42387a(T t) {
        try {
            this.f48777b.set(this.f48776a, t);
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f48777b.getName(), this.f48776a.getClass().getName(), this.f48778c.getName()}), e);
        }
    }

    /* renamed from: b */
    private Class<T> m42388b() {
        return this.f48777b.getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo33600a() {
        try {
            return this.f48778c.cast(this.f48777b.get(this.f48776a));
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f48777b.getName(), this.f48776a.getClass().getName(), this.f48778c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo33601a(Collection<T> collection) {
        Object[] objArr = (Object[]) mo33600a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m42388b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (T t : collection) {
            objArr2[length] = t;
            length++;
        }
        m42387a((T) objArr2);
    }

    /* renamed from: a */
    public final void mo33602a(T[] tArr) {
        mo33601a((Collection<T>) Arrays.asList(tArr));
    }

    /* renamed from: b */
    public final void mo33603b(Collection<T> collection) {
        Object[] objArr = (Object[]) mo33600a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m42388b(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (T t : collection) {
            objArr2[i] = t;
            i++;
        }
        m42387a((T) objArr2);
    }

    /* renamed from: b */
    public final void mo33604b(T[] tArr) {
        mo33603b((Collection<T>) Arrays.asList(tArr));
    }

    C17312y(Object obj, Field field, Class<T> cls, byte b) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }
}
