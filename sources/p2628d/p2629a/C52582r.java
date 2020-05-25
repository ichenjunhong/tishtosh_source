package p2628d.p2629a;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.a.r */
public class C52582r extends C52581q {
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> void m112106c(List<T> list) {
        C52711k.m112240b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: a */
    public static final <T> void m112105a(List<T> list, Comparator<? super T> comparator) {
        C52711k.m112240b(list, "$this$sortWith");
        C52711k.m112240b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
