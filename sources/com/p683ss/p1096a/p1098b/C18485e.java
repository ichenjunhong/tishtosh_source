package com.p683ss.p1096a.p1098b;

import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.a.b.e */
public final class C18485e<T> extends AbstractCollection<T> {

    /* renamed from: a */
    private final List<WeakReference<T>> f50911a = new ArrayList();

    /* renamed from: com.ss.a.b.e$a */
    static class C18487a<T> implements Iterator<T> {

        /* renamed from: a */
        private final Iterator<WeakReference<T>> f50912a;

        /* renamed from: b */
        private T f50913b;

        private C18487a(Iterator<WeakReference<T>> it) {
            this.f50912a = it;
        }

        public final boolean hasNext() {
            if (this.f50913b != null) {
                return true;
            }
            while (this.f50912a.hasNext()) {
                T t = ((WeakReference) this.f50912a.next()).get();
                if (t != null) {
                    this.f50913b = t;
                    return true;
                }
            }
            return false;
        }

        public final T next() {
            T t = this.f50913b;
            this.f50913b = null;
            while (t == null) {
                t = ((WeakReference) this.f50912a.next()).get();
            }
            return t;
        }

        public final void remove() {
            this.f50912a.remove();
        }
    }

    public final boolean add(T t) {
        return this.f50911a.add(new WeakReference(t));
    }

    public final void clear() {
        this.f50911a.clear();
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            for (WeakReference weakReference : this.f50911a) {
                if (obj.equals(weakReference.get())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator<T> iterator() {
        return new C18487a(this.f50911a.iterator());
    }

    public final boolean remove(Object obj) {
        if (obj != null) {
            for (int i = 0; i < this.f50911a.size(); i++) {
                if (obj.equals(((WeakReference) this.f50911a.get(i)).get())) {
                    this.f50911a.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public final int size() {
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : this.f50911a) {
            if (weakReference.get() != null) {
                arrayList.add(weakReference);
            }
        }
        this.f50911a.clear();
        this.f50911a.addAll(arrayList);
        return this.f50911a.size();
    }
}
