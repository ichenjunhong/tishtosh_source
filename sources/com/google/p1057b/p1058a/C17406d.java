package com.google.p1057b.p1058a;

import java.io.Serializable;

/* renamed from: com.google.b.a.d */
public abstract class C17406d<T> {

    /* renamed from: com.google.b.a.d$a */
    public static final class C17407a extends C17406d<Object> implements Serializable {
        public static final C17407a INSTANCE = new C17407a();
        private static final long serialVersionUID = 1;

        C17407a() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo33730a(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo33731a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.google.b.a.d$b */
    static final class C17408b extends C17406d<Object> implements Serializable {

        /* renamed from: a */
        static final C17408b f48946a = new C17408b();
        private static final long serialVersionUID = 1;

        C17408b() {
        }

        private Object readResolve() {
            return f48946a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo33731a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo33730a(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected C17406d() {
    }

    public static C17406d<Object> equals() {
        return C17407a.INSTANCE;
    }

    public static C17406d<Object> identity() {
        return C17408b.f48946a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo33730a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo33731a(T t, T t2);

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return mo33730a(t);
    }

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo33731a(t, t2);
    }
}
