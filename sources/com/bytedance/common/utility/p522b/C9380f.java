package com.bytedance.common.utility.p522b;

import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.common.utility.b.f */
public final class C9380f<T> extends WeakReference<T> {

    /* renamed from: a */
    int f25611a;

    public final int hashCode() {
        return this.f25611a;
    }

    public C9380f(T t) {
        int i;
        super(t);
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        this.f25611a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9380f)) {
            return false;
        }
        C9380f fVar = (C9380f) obj;
        Object obj2 = super.get();
        Object obj3 = fVar.get();
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj2 == obj3) {
            return true;
        }
        return false;
    }
}
