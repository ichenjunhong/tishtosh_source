package com.google.p1057b.p1060c;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.bk */
final class C17654bk {

    /* renamed from: com.google.b.c.bk$a */
    static final class C17656a<T> {

        /* renamed from: a */
        private final Field f49356a;

        private C17656a(Field field) {
            this.f49356a = field;
            field.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34255a(T t, Object obj) {
            try {
                this.f49356a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34254a(T t, int i) {
            try {
                this.f49356a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    static <T> C17656a<T> m43401a(Class<T> cls, String str) {
        try {
            return new C17656a<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static <K, V> void m43402a(C17608at<K, V> atVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(atVar.asMap().size());
        for (Entry entry : atVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
