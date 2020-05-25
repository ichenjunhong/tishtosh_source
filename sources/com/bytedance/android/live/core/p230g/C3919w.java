package com.bytedance.android.live.core.p230g;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.live.core.g.w */
public final class C3919w<T> extends CopyOnWriteArrayList<T> {
    public final boolean add(T t) {
        if (t != null && !contains(t)) {
            return super.add(t);
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.remove(obj);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        for (Object add : collection) {
            add(add);
        }
        return true;
    }
}
