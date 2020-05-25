package com.google.p1057b.p1060c;

import java.util.Set;

/* renamed from: com.google.b.c.x */
public abstract class C17723x<E> extends C17719t<E> implements Set<E> {
    protected C17723x() {
    }

    /* access modifiers changed from: protected */
    public abstract Set<E> delegate();

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }
}
