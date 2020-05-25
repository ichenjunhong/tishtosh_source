package p2628d.p2629a;

import java.util.Enumeration;
import java.util.Iterator;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.p */
public class C52579p extends C52578o {

    /* renamed from: d.a.p$a */
    public static final class C52580a implements C52695a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f130879a;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f130879a.hasMoreElements();
        }

        public final T next() {
            return this.f130879a.nextElement();
        }

        public C52580a(Enumeration<T> enumeration) {
            this.f130879a = enumeration;
        }
    }
}
