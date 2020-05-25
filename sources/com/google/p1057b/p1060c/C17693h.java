package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.b.c.h */
abstract class C17693h<E> extends AbstractCollection<E> implements C17624aw<E> {

    /* renamed from: a */
    private transient Set<E> f49404a;

    /* renamed from: b */
    private transient Set<C17625a<E>> f49405b;

    /* renamed from: com.google.b.c.h$a */
    class C17694a extends C17628b<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17624aw<E> mo34207a() {
            return C17693h.this;
        }

        public final Iterator<E> iterator() {
            return C17693h.this.mo34196a();
        }

        C17694a() {
        }
    }

    /* renamed from: com.google.b.c.h$b */
    class C17695b extends C17629c<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17624aw<E> mo34214a() {
            return C17693h.this;
        }

        public final Iterator<C17625a<E>> iterator() {
            return C17693h.this.mo34197b();
        }

        public final int size() {
            return C17693h.this.mo34198c();
        }

        C17695b() {
        }
    }

    C17693h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Iterator<E> mo34196a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Iterator<C17625a<E>> mo34197b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo34198c();

    public Set<E> elementSet() {
        Set<E> set = this.f49404a;
        if (set != null) {
            return set;
        }
        C17694a aVar = new C17694a();
        this.f49404a = aVar;
        return aVar;
    }

    public Set<C17625a<E>> entrySet() {
        Set<C17625a<E>> set = this.f49405b;
        if (set != null) {
            return set;
        }
        C17695b bVar = new C17695b();
        this.f49405b = bVar;
        return bVar;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final boolean equals(Object obj) {
        return C17626ax.m43325a(this, obj);
    }

    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public boolean contains(Object obj) {
        if (mo34074a(obj) > 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof C17624aw) {
            collection = ((C17624aw) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        C17421k.m42653a(collection);
        if (collection instanceof C17624aw) {
            collection = ((C17624aw) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C17421k.m42653a(this);
        C17421k.m42653a(collection);
        boolean z = true;
        if (collection instanceof C17624aw) {
            C17624aw a = C17626ax.m43324a(collection);
            if (a instanceof C17687e) {
                C17687e eVar = (C17687e) a;
                if (eVar.isEmpty()) {
                    z = false;
                } else {
                    C17421k.m42653a(this);
                    for (int a2 = eVar.f49395a.mo34223a(); a2 >= 0; a2 = eVar.f49395a.mo34224a(a2)) {
                        add(eVar.f49395a.mo34228b(a2), eVar.f49395a.mo34229c(a2));
                    }
                }
            } else if (a.isEmpty()) {
                z = false;
            } else {
                for (C17625a aVar : a.entrySet()) {
                    add(aVar.mo34201a(), aVar.mo34202b());
                }
            }
            return z;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            z = C17586ap.m43268a((Collection<T>) this, collection.iterator());
        }
        return z;
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        C17698k.m43477a(i, "count");
        int a = mo34074a(e);
        int i2 = i - a;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
        }
        return a;
    }

    public boolean setCount(E e, int i, int i2) {
        C17698k.m43477a(i, "oldCount");
        C17698k.m43477a(i2, "newCount");
        if (mo34074a(e) != i) {
            return false;
        }
        setCount(e, i2);
        return true;
    }
}
