package com.bytedance.jedi.p725a.p734g.p735a;

import java.io.Serializable;

/* renamed from: com.bytedance.jedi.a.g.a.a */
public abstract class C11598a<T> {

    /* renamed from: com.bytedance.jedi.a.g.a.a$a */
    public static final class C11599a extends C11598a<Object> implements Serializable {
        public static final C11599a INSTANCE = new C11599a();
        private static final long serialVersionUID = 1;

        C11599a() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo22319a(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo22320a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.a.a$b */
    static final class C11600b extends C11598a<Object> implements Serializable {

        /* renamed from: a */
        static final C11600b f30981a = new C11600b();
        private static final long serialVersionUID = 1;

        C11600b() {
        }

        private Object readResolve() {
            return f30981a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo22320a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo22319a(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected C11598a() {
    }

    public static C11598a<Object> equals() {
        return C11599a.INSTANCE;
    }

    public static C11598a<Object> identity() {
        return C11600b.f30981a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo22319a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo22320a(T t, T t2);

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return mo22319a(t);
    }

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo22320a(t, t2);
    }
}
