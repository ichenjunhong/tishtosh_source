package com.google.p1057b.p1058a;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.b.a.m */
public final class C17423m {

    /* renamed from: com.google.b.a.m$a */
    public static class C17425a<T> implements C17422l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends C17422l<? super T>> f48960a;

        public final int hashCode() {
            return this.f48960a.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends C17422l<? super T>> list = this.f48960a;
            StringBuilder sb = new StringBuilder("Predicates.");
            sb.append("and");
            sb.append('(');
            boolean z = true;
            for (Object next : list) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(next);
                z = false;
            }
            sb.append(')');
            return sb.toString();
        }

        private C17425a(List<? extends C17422l<? super T>> list) {
            this.f48960a = list;
        }

        public final boolean apply(T t) {
            for (int i = 0; i < this.f48960a.size(); i++) {
                if (!((C17422l) this.f48960a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17425a)) {
                return false;
            }
            return this.f48960a.equals(((C17425a) obj).f48960a);
        }
    }

    /* renamed from: com.google.b.a.m$b */
    public static class C17426b<T> implements C17422l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final T f48961a;

        public final int hashCode() {
            return this.f48961a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Predicates.equalTo(");
            sb.append(this.f48961a);
            sb.append(")");
            return sb.toString();
        }

        private C17426b(T t) {
            this.f48961a = t;
        }

        public final boolean apply(T t) {
            return this.f48961a.equals(t);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17426b)) {
                return false;
            }
            return this.f48961a.equals(((C17426b) obj).f48961a);
        }
    }

    /* renamed from: com.google.b.a.m$c */
    public static class C17427c<T> implements C17422l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17422l<T> f48962a;

        public final int hashCode() {
            return this.f48962a.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Predicates.not(");
            sb.append(this.f48962a);
            sb.append(")");
            return sb.toString();
        }

        public C17427c(C17422l<T> lVar) {
            this.f48962a = (C17422l) C17421k.m42653a(lVar);
        }

        public final boolean apply(T t) {
            if (!this.f48962a.apply(t)) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17427c)) {
                return false;
            }
            return this.f48962a.equals(((C17427c) obj).f48962a);
        }
    }
}
