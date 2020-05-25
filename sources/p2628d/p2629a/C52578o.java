package p2628d.p2629a;

import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.a.o */
public class C52578o extends C52577n {
    /* renamed from: a */
    public static final <T> int m112104a(Iterable<? extends T> iterable, int i) {
        C52711k.m112240b(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
