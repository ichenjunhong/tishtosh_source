package com.google.p1057b.p1058a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.a.b */
abstract class C17402b<T> implements Iterator<T> {

    /* renamed from: a */
    C17404a f48938a = C17404a.NOT_READY;

    /* renamed from: b */
    private T f48939b;

    /* renamed from: com.google.b.a.b$a */
    enum C17404a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo33726a();

    protected C17402b() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final T next() {
        if (hasNext()) {
            this.f48938a = C17404a.NOT_READY;
            T t = this.f48939b;
            this.f48939b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f48938a != C17404a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42667b(z);
        switch (this.f48938a) {
            case READY:
                return true;
            case DONE:
                return false;
            default:
                this.f48938a = C17404a.FAILED;
                this.f48939b = mo33726a();
                if (this.f48938a == C17404a.DONE) {
                    return false;
                }
                this.f48938a = C17404a.READY;
                return true;
        }
    }
}
