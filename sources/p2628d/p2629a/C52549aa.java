package p2628d.p2629a;

import java.util.Iterator;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.aa */
public abstract class C52549aa implements C52695a, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo110114a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo110114a());
    }
}
