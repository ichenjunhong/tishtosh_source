package p2628d.p2629a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.a.i */
public class C52571i extends C52570h {
    /* renamed from: a */
    public static final <T> List<T> m112068a(T[] tArr) {
        C52711k.m112240b(tArr, "$this$asList");
        List<T> a = C52574k.m112091a(tArr);
        C52711k.m112236a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: a */
    public static final <T> void m112069a(T[] tArr, Comparator<? super T> comparator) {
        C52711k.m112240b(tArr, "$this$sortWith");
        C52711k.m112240b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static final <T> T[] m112070a(T[] tArr, T[] tArr2) {
        C52711k.m112240b(tArr, "$this$plus");
        C52711k.m112240b(tArr2, "elements");
        int length = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        System.arraycopy(tArr2, 0, copyOf, 1, length);
        C52711k.m112236a((Object) copyOf, "result");
        return copyOf;
    }
}
