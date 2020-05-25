package com.bytedance.jedi.p725a.p734g.p737c;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.bytedance.jedi.a.g.c.a */
public abstract class C11674a<T> implements Iterator<T> {

    /* renamed from: a */
    private T f31133a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22400a(T t);

    public final boolean hasNext() {
        if (this.f31133a != null) {
            return true;
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f31133a;
            } finally {
                this.f31133a = mo22400a(this.f31133a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    protected C11674a(T t) {
        this.f31133a = t;
    }
}
