package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.io.Serializable;
import java.util.Collection;

/* renamed from: com.google.b.c.ax */
public final class C17626ax {

    /* renamed from: com.google.b.c.ax$a */
    static abstract class C17627a<E> implements C17625a<E> {
        C17627a() {
        }

        public int hashCode() {
            int i;
            Object a = mo34201a();
            if (a == null) {
                i = 0;
            } else {
                i = a.hashCode();
            }
            return i ^ mo34202b();
        }

        public String toString() {
            String valueOf = String.valueOf(mo34201a());
            int b = mo34202b();
            if (b == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(b);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C17625a)) {
                return false;
            }
            C17625a aVar = (C17625a) obj;
            if (mo34202b() != aVar.mo34202b() || !C17417i.m42646a(mo34201a(), aVar.mo34201a())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.b.c.ax$b */
    static abstract class C17628b<E> extends C17659a<E> {
        C17628b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17624aw<E> mo34207a();

        public void clear() {
            mo34207a().clear();
        }

        public boolean isEmpty() {
            return mo34207a().isEmpty();
        }

        public int size() {
            return mo34207a().entrySet().size();
        }

        public boolean contains(Object obj) {
            return mo34207a().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo34207a().containsAll(collection);
        }

        public boolean remove(Object obj) {
            if (mo34207a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.b.c.ax$c */
    static abstract class C17629c<E> extends C17659a<C17625a<E>> {
        C17629c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17624aw<E> mo34214a();

        public void clear() {
            mo34214a().clear();
        }

        public boolean remove(Object obj) {
            if (obj instanceof C17625a) {
                C17625a aVar = (C17625a) obj;
                Object a = aVar.mo34201a();
                int b = aVar.mo34202b();
                if (b != 0) {
                    return mo34214a().setCount(a, b, 0);
                }
            }
            return false;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C17625a)) {
                return false;
            }
            C17625a aVar = (C17625a) obj;
            if (aVar.mo34202b() > 0 && mo34214a().mo34074a(aVar.mo34201a()) == aVar.mo34202b()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.b.c.ax$d */
    static class C17630d<E> extends C17627a<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final E f49300a;

        /* renamed from: b */
        private final int f49301b;

        /* renamed from: a */
        public final E mo34201a() {
            return this.f49300a;
        }

        /* renamed from: b */
        public final int mo34202b() {
            return this.f49301b;
        }

        C17630d(E e, int i) {
            this.f49300a = e;
            this.f49301b = i;
            C17698k.m43477a(i, "count");
        }
    }

    /* renamed from: a */
    static <T> C17624aw<T> m43324a(Iterable<T> iterable) {
        return (C17624aw) iterable;
    }

    /* renamed from: a */
    static boolean m43325a(C17624aw<?> awVar, Object obj) {
        if (obj == awVar) {
            return true;
        }
        if (!(obj instanceof C17624aw)) {
            return false;
        }
        C17624aw awVar2 = (C17624aw) obj;
        if (awVar.size() != awVar2.size() || awVar.entrySet().size() != awVar2.entrySet().size()) {
            return false;
        }
        for (C17625a aVar : awVar2.entrySet()) {
            if (awVar.mo34074a(aVar.mo34201a()) != aVar.mo34202b()) {
                return false;
            }
        }
        return true;
    }
}
