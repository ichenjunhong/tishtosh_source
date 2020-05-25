package com.google.p1057b.p1060c;

import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.i */
public abstract class C17696i<T> extends C17666bt<T> {

    /* renamed from: a */
    private T f49408a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo33866a(T t);

    public final boolean hasNext() {
        if (this.f49408a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f49408a;
            } finally {
                this.f49408a = mo33866a(this.f49408a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected C17696i(T t) {
        this.f49408a = t;
    }
}
