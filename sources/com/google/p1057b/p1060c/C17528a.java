package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.a */
abstract class C17528a<E> extends C17667bu<E> {

    /* renamed from: a */
    private final int f49176a;

    /* renamed from: b */
    private int f49177b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo33942a(int i);

    public final int nextIndex() {
        return this.f49177b;
    }

    public final boolean hasPrevious() {
        if (this.f49177b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f49177b - 1;
    }

    public final boolean hasNext() {
        if (this.f49177b < this.f49176a) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f49177b;
            this.f49177b = i + 1;
            return mo33942a(i);
        }
        throw new NoSuchElementException();
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f49177b - 1;
            this.f49177b = i;
            return mo33942a(i);
        }
        throw new NoSuchElementException();
    }

    protected C17528a(int i, int i2) {
        C17421k.m42666b(i2, i);
        this.f49176a = i;
        this.f49177b = i2;
    }
}
