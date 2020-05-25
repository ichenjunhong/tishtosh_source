package p2628d.p2629a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.w */
public final class C52589w implements C52695a, ListIterator {

    /* renamed from: a */
    public static final C52589w f130882a = new C52589w();

    private C52589w() {
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}
