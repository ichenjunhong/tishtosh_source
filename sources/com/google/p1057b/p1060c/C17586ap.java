package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.ap */
public final class C17586ap {

    /* renamed from: com.google.b.c.ap$a */
    static final class C17590a<T> extends C17528a<T> {

        /* renamed from: a */
        static final C17667bu<Object> f49268a = new C17590a(new Object[0], 0, 0, 0);

        /* renamed from: b */
        private final T[] f49269b;

        /* renamed from: c */
        private final int f49270c = 0;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final T mo33942a(int i) {
            return this.f49269b[this.f49270c + i];
        }

        private C17590a(T[] tArr, int i, int i2, int i3) {
            super(0, 0);
            this.f49269b = tArr;
        }
    }

    /* renamed from: com.google.b.c.ap$b */
    enum C17591b implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            C17698k.m43479a(false);
        }
    }

    /* renamed from: b */
    private static <T> C17667bu<T> m43269b() {
        return C17590a.f49268a;
    }

    /* renamed from: a */
    static <T> C17666bt<T> m43263a() {
        return m43269b();
    }

    /* renamed from: a */
    static <T> T m43265a(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: b */
    static void m43270b(Iterator<?> it) {
        C17421k.m42653a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    public static <T> C17666bt<T> m43264a(final Iterator<T> it, final C17422l<? super T> lVar) {
        C17421k.m42653a(it);
        C17421k.m42653a(lVar);
        return new C17633b<T>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final T mo34140a() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (lVar.apply(next)) {
                        return next;
                    }
                }
                this.f49303a = C17635a.DONE;
                return null;
            }
        };
    }

    /* renamed from: a */
    public static <T> T m43266a(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m43267a(Iterator<F> it, final C17410f<? super F, ? extends T> fVar) {
        C17421k.m42653a(fVar);
        return new C17663bq<F, T>(it) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final T mo34141a(F f) {
                return fVar.mo33734a(f);
            }
        };
    }

    /* renamed from: a */
    public static <T> boolean m43268a(Collection<T> collection, Iterator<? extends T> it) {
        C17421k.m42653a(collection);
        C17421k.m42653a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
