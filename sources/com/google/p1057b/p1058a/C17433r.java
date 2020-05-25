package com.google.p1057b.p1058a;

import java.io.Serializable;

/* renamed from: com.google.b.a.r */
public final class C17433r {

    /* renamed from: com.google.b.a.r$a */
    static class C17434a<T> implements C17432q<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17432q<T> f48969a;

        /* renamed from: b */
        volatile transient boolean f48970b;

        /* renamed from: c */
        transient T f48971c;

        public final T get() {
            if (!this.f48970b) {
                synchronized (this) {
                    if (!this.f48970b) {
                        T t = this.f48969a.get();
                        this.f48971c = t;
                        this.f48970b = true;
                        return t;
                    }
                }
            }
            return this.f48971c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            sb.append(this.f48969a);
            sb.append(")");
            return sb.toString();
        }

        C17434a(C17432q<T> qVar) {
            this.f48969a = (C17432q) C17421k.m42653a(qVar);
        }
    }

    /* renamed from: com.google.b.a.r$b */
    static class C17435b<T> implements C17432q<T> {

        /* renamed from: a */
        volatile C17432q<T> f48972a;

        /* renamed from: b */
        volatile boolean f48973b;

        /* renamed from: c */
        T f48974c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            sb.append(this.f48972a);
            sb.append(")");
            return sb.toString();
        }

        public final T get() {
            if (!this.f48973b) {
                synchronized (this) {
                    if (!this.f48973b) {
                        T t = this.f48972a.get();
                        this.f48974c = t;
                        this.f48973b = true;
                        this.f48972a = null;
                        return t;
                    }
                }
            }
            return this.f48974c;
        }

        C17435b(C17432q<T> qVar) {
            this.f48972a = (C17432q) C17421k.m42653a(qVar);
        }
    }

    /* renamed from: com.google.b.a.r$c */
    public static class C17436c<T> implements C17432q<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final T f48975a;

        public final T get() {
            return this.f48975a;
        }

        public final int hashCode() {
            return C17417i.m42645a(this.f48975a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
            sb.append(this.f48975a);
            sb.append(")");
            return sb.toString();
        }

        public C17436c(T t) {
            this.f48975a = t;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17436c)) {
                return false;
            }
            return C17417i.m42646a(this.f48975a, ((C17436c) obj).f48975a);
        }
    }

    /* renamed from: a */
    public static <T> C17432q<T> m42683a(C17432q<T> qVar) {
        if ((qVar instanceof C17435b) || (qVar instanceof C17434a)) {
            return qVar;
        }
        if (qVar instanceof Serializable) {
            return new C17434a(qVar);
        }
        return new C17435b(qVar);
    }
}
