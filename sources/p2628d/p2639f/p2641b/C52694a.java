package p2628d.p2639f.p2641b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.f.b.a */
final class C52694a<T> implements C52695a, Iterator<T> {

    /* renamed from: a */
    public final T[] f130962a;

    /* renamed from: b */
    private int f130963b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.f130963b < this.f130962a.length) {
            return true;
        }
        return false;
    }

    public final T next() {
        try {
            T[] tArr = this.f130962a;
            int i = this.f130963b;
            this.f130963b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f130963b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C52694a(T[] tArr) {
        C52711k.m112240b(tArr, "array");
        this.f130962a = tArr;
    }
}
